package com.demo.p2p.mgrsite.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.LogininfoService;
import com.demo.p2p.base.util.JSONResult;

/**
 * 
 * @ClassName: LoginController
 * @Description:TODO(后台登陆)
 * @author: 583165647@qq.com
 * @date: 2019年5月28日 下午6:51:14
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LogininfoService logininfoService;
	/**
	 * 
	 * @Title: login   
	 * @Description: TODO(后台登陆)   
	 * @param: @param username
	 * @param: @param password
	 * @param: @param request
	 * @param: @return      
	 * @return: JSONResult      
	 * @throws:
	 */
	@RequestMapping("login.do")
	@ResponseBody
	public JSONResult login(String username,String password,HttpServletRequest request) {
		JSONResult json = new JSONResult();
		Logininfo current = this.logininfoService.login(username, password,Logininfo.USER_MANAGER,request.getRemoteAddr());
		if(current ==null) {
			json.setSuccess(false);
			json.setMsg("用户名或密码错误！");
		}
		return json;
	}
	
	//后台首页
	@RequestMapping("index.do")
	public String index() {
		return "main";
	}
}
