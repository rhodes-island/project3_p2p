package com.demo.p2p.base.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.p2p.base.mapper.LogininfoMapper;
import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.LogininfoService;
import com.demo.p2p.base.util.MD5;

@Service
public class LogininfoServiceImpl implements LogininfoService {
	@Autowired
	private LogininfoMapper logininfoMapper;
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
			this.logininfoMapper.insert(li);
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
	public void login(String username, String password) {
		// 首先判断用户名或密码是否为空
		try {
			if (username.trim().equals("") || password.trim().equals("")) {
				throw new RuntimeException("用户或密码错误");
			}
		} catch (Exception e) {
			throw new RuntimeException("用户或密码错误");
		}
		//数据库进行对比
		Logininfo logininfo = this.logininfoMapper.login(username, password, 1);
		
		System.out.println(logininfo);
		// 如果不等于空，将用户的信息存储到session里面
		// 否则，抛出异常
		if (logininfo.getId() != null) {
			// 将用户的信息存储到session里面
			session.setAttribute("user", logininfo);
		} else {
			// 抛出异常如果用户不存在
			throw new RuntimeException("用户或密码错误！");
		}
	}

}