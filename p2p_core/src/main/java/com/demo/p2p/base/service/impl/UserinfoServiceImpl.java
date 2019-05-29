package com.demo.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.UserinfoMapper;
import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.IVerifyCodeService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.BitStatesUtils;
import com.demo.p2p.base.util.UserContext;

@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoMapper userinfoMapper;
	@Autowired
	private IVerifyCodeService iVerifyCodeService;

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

}
