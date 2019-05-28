package com.demo.p2p.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.LogininfoService;
import com.demo.p2p.base.util.JSONResult;

@Controller
public class LoginifoController {

	@Autowired
	private LogininfoService logininfoService;

	//testDemo
	@RequestMapping("showLogininfo")
	public String selectByPrimaryKey(Model model) {
		Logininfo selectByPrimaryKey = logininfoService.selectByPrimaryKey(10L);
		System.out.println(selectByPrimaryKey.toString());
		model.addAttribute("showLogininfo", logininfoService.selectByPrimaryKey(10L));
		return "/WEB-INF/jsp/showLogininfo.jsp";
	}

	// 用于检查username的ajax
	@RequestMapping("checkUserName.do")
	@ResponseBody
	public Boolean checkUserName(String username) {

		return !this.logininfoService.checkUserName(username);
	}
	
	//用户名的检查和注册
	@RequestMapping("register.do")
	@ResponseBody
	public JSONResult register(String username, String password) {
		JSONResult json = new JSONResult();
		// 有可能service抛出已经有这个用户的异常
		try {
			logininfoService.insert(username, password);
		} catch (RuntimeException re) {

			json.setSuccess(false);
			json.setMsg(re.getMessage());
		}
		return json;
	}
	
	//用户登录验证
	//如果是Json格式返回一定要加注解否则404
	@RequestMapping("/login.do")
	@ResponseBody
	public JSONResult login(String username,String password,String usertype,HttpServletRequest request) {
		JSONResult json = new JSONResult();
		// 有可能service抛出已经有这个用户的异常
		try {
			logininfoService.login(username,password,usertype,request);
		} catch (RuntimeException re) {
			json.setSuccess(false);
			json.setMsg(re.getMessage());
		}
		return json;
	}
	
	
}
