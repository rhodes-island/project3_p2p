package com.demo.p2p.base.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.p2p.base.service.IVerifyCodeService;
import com.demo.p2p.base.util.JSONResult;

/**
 * 
 * @ClassName:  VerifyCodeController   
 * @Description:TODO(验证码相关的controller)   
 * @author: 583165647@qq.com 
 *
 */
@Controller
public class VerifyCodeController {
	@Autowired
	private IVerifyCodeService iVerifyCodeService;
	
	@RequestMapping("sendVerifyCode.do")
	@ResponseBody
	public JSONResult sendVerifyCode(String phoneNumber) {
		JSONResult json = new JSONResult();
		try {
			iVerifyCodeService.sendVerifyCode(phoneNumber);
		} catch (RuntimeException re) {
			json.setMsg(re.getMessage());
			json.setSuccess(false);
		}
		return json;
	}
	
}
