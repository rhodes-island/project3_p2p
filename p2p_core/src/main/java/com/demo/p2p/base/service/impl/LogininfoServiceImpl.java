package com.demo.p2p.base.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.LogininfoMapper;
import com.demo.p2p.base.pojo.Account;
import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.LogininfoService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.MD5;

@Service
public class LogininfoServiceImpl implements LogininfoService {

	@Autowired
	private LogininfoMapper logininfoMapper;

	@Autowired
	private AccountService accountService;

	@Autowired
	private UserinfoService userinfoService;

	@Autowired
	private HttpSession session;

	@Override
	public Logininfo selectByPrimaryKey(Long id) {

		return logininfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public Logininfo selectByUnamePwd(String username, String password) {
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
			
			Account account = new Account();
			account.setId(li.getId());
			this.accountService.add(account);
			
			Userinfo userinfo = new Userinfo();
			userinfo.setId(li.getId());
			this.userinfoService.add(userinfo);
		} else {
			// 如果存在，抛出错误
			throw new RuntimeException("用户名已经存在！");
		}
		return null;
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
	public void login(String username, String password, String usertype) {
		// 首先判断用户名或密码是否为空
		try {
			if (username.trim().equals("") || password.trim().equals("")) {
				throw new RuntimeException("用户或密码错误");
			}

			// 数据库进行对比
			Logininfo logininfo = this.logininfoMapper.login(username, MD5.encode(password), usertype);
			//System.out.println(logininfo);
			// 如果不等于空，将用户的信息存储到session里面
			// 否则，抛出异常
			if (logininfo != null) {
				// 将用户的信息存储到session里面
				session.setAttribute("user", logininfo);
			} else {
				// 抛出异常如果用户不存在
				throw new RuntimeException("用户或密码错误！");
			}
		} catch (Exception e) {
			
			throw new RuntimeException("用户或密码错误");
		}
	}

}