package com.demo.p2p.base.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.UserinfoService;

/**
 * 
 * @ClassName:  PersonalController   
 * @Description:TODO(个人中心的跳转)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月26日 下午8:13:52   
 *
 */
@Controller
public class PersonalController {
	
	@Autowired
	private UserinfoService userinfoService;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("personal")
	public String personalCenter(Model model,HttpSession session) {
		//需要往model里面放前台所需要的信息
		Logininfo logininfo = (Logininfo)session.getAttribute("user");
		//model.addAttribute("userinfo", userinfoService.get(logininfo.getId()));
		//model.addAttribute("account", accountService.get(logininfo.getId()));
		return "personal";
	}
}
