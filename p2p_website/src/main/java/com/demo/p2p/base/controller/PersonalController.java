package com.demo.p2p.base.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.JSONResult;
import com.demo.p2p.base.util.RequireLogin;
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
	@RequireLogin
	public String personalCenter(Model model) {
		//model里面放前台所需要的信息
		Logininfo current = UserContext.getCurrent();
		model.addAttribute("userinfo", userinfoService.get(current.getId()));
		model.addAttribute("account", accountService.get(current.getId()));
		return "personal";
	}
	
	/**
	 * 
	 * @Title: bindPhone   
	 * @Description: TODO(绑定手机)   
	 * @throws:
	 */
	@RequireLogin
	@RequestMapping("bindPhone.do")
	@ResponseBody
	public JSONResult bindPhone(String phoneNumber,String verifyCode) {
		JSONResult json = new JSONResult();
		try {
			this.userinfoService.bindPhone(phoneNumber,verifyCode);
		} catch (RuntimeException re) {
			json.setSuccess(false);
			json.setMsg(re.getMessage());
		}
		System.out.println(json);
		return json;
	} 
	
	/**
	 * 
	 * @Title: bindPhone   
	 * @Description: TODO(发送绑定邮箱邮件)   
	 * @throws:
	 */
	@RequireLogin
	@RequestMapping("sendEmail.do")
	@ResponseBody
	public JSONResult sendEmail(String email) {
		JSONResult json = new JSONResult();
		try {
			this.userinfoService.sendVerifyEmail(email);
		} catch (RuntimeException re) {
			json.setSuccess(false);
			json.setMsg(re.getMessage());
		}
		System.out.println(json);
		return json;
	}
	
	
	//执行邮箱的绑定
	@RequestMapping("bindEmail.do")
	public String bindEmail(String uuid,Model model) {
		try {
			this.userinfoService.bindEmail(uuid);
			model.addAttribute("success", true);
		} catch (RuntimeException re) {
			model.addAttribute("success", true);
			model.addAttribute("msg", re.getMessage());
		}
		return "checkmail_result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
