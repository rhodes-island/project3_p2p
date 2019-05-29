package com.demo.p2p.base.service.impl;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.IplogMapper;
import com.demo.p2p.base.mapper.LogininfoMapper;
import com.demo.p2p.base.pojo.Account;
import com.demo.p2p.base.pojo.Iplog;
import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.IplogService;
import com.demo.p2p.base.service.LogininfoService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.BidConst;
import com.demo.p2p.base.util.MD5;
import com.demo.p2p.base.util.UserContext;

@Service
public class LogininfoServiceImpl implements LogininfoService {

	@Autowired
	private LogininfoMapper logininfoMapper;

	@Autowired
	private AccountService accountService;

	@Autowired
	private UserinfoService userinfoService;

	@Autowired
	private IplogMapper iplogMapper;

	@Autowired
	private HttpSession session;

	@Override
	public Logininfo selectByPrimaryKey(Long id) {

		return logininfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(String username, String password) {
		// 判断用户名是否存在
		int count = this.logininfoMapper.getCountByUsername(username);
		// 如果不存在，设置并保存这个对象
		if (count <= 0) {
			Logininfo li = new Logininfo();
			li.setUsername(username);
			li.setPassword(MD5.encode(password));
			li.setState(Logininfo.STATE_NORMAL);
			li.setUsertype(Logininfo.USER_CLIENT);
			this.logininfoMapper.insert(li);
			// 初始化账户信息和userinfo
			// System.out.println(li.getId());
			try {
				Account account = new Account();
				account.setId(li.getId());
				this.accountService.add(account);
			} catch (RuntimeException e) {
				e.printStackTrace();
				throw e;
			}
			try {
				Userinfo userinfo = new Userinfo();
				userinfo.setId(li.getId());
				this.userinfoService.add(userinfo);
			} catch (RuntimeException e) {
				e.printStackTrace();
				throw e;
			}
		} else {
			// 如果存在，抛出错误
			throw new RuntimeException("用户名已经存在！");
		}
		return 0;
	}

	// 判断用户名是否存在
	// 如果存在返回true
	// 如果不存在返回false
	@Override
	public boolean checkUserName(String username) {
		int count = this.logininfoMapper.getCountByUsername(username);

		return count > 0;
	}

	@Override
	public Logininfo login(String username, String password, int usertype, String ip) {
		/*// 首先判断用户名或密码是否为空
		if (username.trim().equals("") || password.trim().equals("")) {
			throw new RuntimeException("用户或密码错误");
		}*/
		// 进行日志的记录
		Iplog iplog = new Iplog();
		iplog.setIp(ip);
		iplog.setLogintime(new Date());
		iplog.setUsername(username);
		iplog.setUsertype(usertype);
		
		// 数据库进行对比
		Logininfo logininfo = this.logininfoMapper.login(username, MD5.encode(password),usertype);
		// 如果不等于空:登陆成功，将用户的信息存储到session里面
		// 否则，抛出异常
		if (logininfo != null) {
			// 把用户的信息放到UserContext里面管理
			UserContext.putCurrent(logininfo);
			// 将用户的信息存储到session里面
			iplog.setState(Iplog.STATE_SUCCESS);
			session.setAttribute(UserContext.USER_IN_SESSION, logininfo);
			// iplog.setLoginstate(Iplog.STATE_SUCCESS);
		} else {
			iplog.setState(Iplog.STATE_FAIL);
		}
		iplogMapper.insert(iplog);
		return logininfo;
	}
	
	/**
	 * <p>Title: initAdmin</p>   
	 * <p>Description:初始化第一个超级管理员 </p>      
	 * @see com.demo.p2p.base.service.LogininfoService#initAdmin()
	 */
	@Override
	public void initAdmin() {
		//查询是否有管理员
		int count = logininfoMapper.countByUserType(Logininfo.USER_MANAGER);
		//如果没有就创建一个管理员
		if(count == 0) {
			Logininfo logininfo = new Logininfo();
			logininfo.setUsername(BidConst.DEFAULT_ADMIN_NAME);
			logininfo.setPassword(MD5.encode(BidConst.DEFAULT_ADMIN_PASSWORD));
			logininfo.setState(Logininfo.STATE_NORMAL);
			logininfo.setUsertype(Logininfo.USER_MANAGER);
			this.logininfoMapper.insert(logininfo);
		}
		//有就不管
	}

}