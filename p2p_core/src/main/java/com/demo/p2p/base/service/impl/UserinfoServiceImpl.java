package com.demo.p2p.base.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.MailVerifyMapper;
import com.demo.p2p.base.mapper.UserinfoMapper;
import com.demo.p2p.base.pojo.MailVerify;
import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.IVerifyCodeService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.BidConst;
import com.demo.p2p.base.util.BitStatesUtils;
import com.demo.p2p.base.util.DateUtil;
import com.demo.p2p.base.util.SendmailUtil;
import com.demo.p2p.base.util.UserContext;

@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Value("${sms.url}")
	String hostUrl;
	@Autowired
	private UserinfoMapper userinfoMapper;
	@Autowired
	private IVerifyCodeService iVerifyCodeService;
	
	@Autowired
	private MailVerifyMapper mailVerifyMapper;

	@Override
	public void update(Userinfo userinfo) {
		int ret = this.userinfoMapper.updateByPrimaryKey(userinfo);
		if (ret == 0) {
			throw new RuntimeException("乐观锁失败，userinfo:" + userinfo.getId());
		}

	}

	@Override
	public void add(Userinfo userinfo) {
		this.userinfoMapper.insert(userinfo);

	}

	@Override
	public Userinfo get(Long id) {
		return this.userinfoMapper.selectByPrimaryKey(id);
	}

	// 绑定手机
	@Override
	public void bindPhone(String phoneNumber, String verifyCode) {
		System.out.println("调用service层");
		//如果用户没用绑定验证码才
		Userinfo current = this.get(UserContext.getCurrent().getId());
		if(!current.getIsBindPhone()) {
			// 验证验证码合法
			boolean ret =  this.iVerifyCodeService.verify(phoneNumber,verifyCode);
			System.out.println("验证验证码合法"+ret);
			//如果合法，给用户绑定手机
			if(ret) {
				current.addState(BitStatesUtils.OP_BIND_PHONE);
				current.setPhonenumber(phoneNumber);
				System.out.println("绑定用户的手机号，数据库update"+current.toString());
				this.update(current);
			}else {
				//抛出异常
				throw new RuntimeException("绑定手机异常!");
			}
		}

	}
	
	//发送绑定邮箱邮件
	@Override
	public Userinfo getCurrent() {
		return this.get(UserContext.getCurrent().getId());
	}

	@Override
	public void sendVerifyEmail(String email) {
		//1.当前用户是否绑定邮箱
		Userinfo current = this.getCurrent();
		if(!current.getIsBindEmail() ) {
			String uuid = UUID.randomUUID().toString();
			//3.构造一份要发送的邮件
			StringBuilder content = new StringBuilder(100)
					.append("<a href='")
					.append(hostUrl)
					.append("bindEmail.do?uuid=")
					.append(uuid)
					.append("'>这里</a>完成邮箱绑定，有效期")
					.append(BidConst.VERIFYEMAIL_VAILDATE_DAY+"天");
			
			//发送邮件
			String c = String.valueOf(content);
			String username = String.valueOf(UserContext.getCurrent().getId());
			try {
				SendmailUtil.sendMail(email, c,username);
			} catch (Exception e1) {
				e1.printStackTrace();
				throw new RuntimeException("发送邮件失败");
			}
			try {
				System.out.println("发送邮件"+email+"邮件内容"+content);
				//2.构造一个MailVerify对象
				MailVerify mv = new MailVerify();
				mv.setEmail(email);
				mv.setSendDate(new Date());
				mv.setUserinfoId(current.getId());
				mv.setUuid(uuid);
				this.mailVerifyMapper.insert(mv);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("发送邮件失败");
			}
			
		}
		
		//4.执行发送
	}

	@Override
	public void bindEmail(String uuid) {
		Userinfo userinfo = this.getCurrent();
		System.out.println(userinfo.toString());
		//判断用户有没有绑定邮箱
		if(!userinfo.getIsBindEmail()) {
			//没有 给用户绑定
			MailVerify mv = this.mailVerifyMapper.selectByUUID(uuid);
			//绑定要需要注意 首先是邮件是不是在有效期
			if(mv!=null && DateUtil.daysBetweent(mv.getSendDate(), new Date())<=BidConst.VERIFYEMAIL_VAILDATE_DAY) {
				//修改用户状态码和用户的邮箱
				userinfo.addState(BitStatesUtils.OP_BIND_EMAIL);
				userinfo.setEmail(mv.getEmail());
				System.out.println(userinfo.toString());
				this.update(userinfo);
			}else {
				throw new RuntimeException("绑定邮箱失败");
			}
		}
		//有 不给绑定
	}
	
	//跟新用户信息的专用方法
	@Override
	public void updateBasicInfo(Userinfo userinfo) {
		//拿到当前用户的信息
		Userinfo old = this.getCurrent();
		//将传进来的值赋给old(需要修改的信息)
		old.setEducationbackground(userinfo.getEducationbackground());
		old.setHousecondition(userinfo.getHousecondition());
		old.setIncomegrade(userinfo.getIncomegrade());
		old.setMarriage(userinfo.getMarriage());
		//如果第一保存这些信息 需要将状态码修改
		//判断用户的状态码
		System.out.println(!old.getIsBasicInfo());
		if(!old.getIsBasicInfo()) {
			old.addState(BitStatesUtils.OP_BASIC_INFO);
		}
		//调用update
		this.update(old);
	}

}
