package com.demo.p2p.base.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.UserContext;

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
	
	@RequestMapping("personal.do")
	public String personalCenter(Model model) {
		//model里面放前台所需要的信息
		Logininfo current = UserContext.getCurrent();
		model.addAttribute("userinfo", userinfoService.get(current.getId()));
		model.addAttribute("account", accountService.get(current.getId()));
		return "personal";
	}
	
}
