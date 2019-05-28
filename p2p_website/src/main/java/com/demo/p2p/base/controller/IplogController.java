package com.demo.p2p.base.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.p2p.base.query.IplogQueryObject;
import com.demo.p2p.base.service.IplogService;

/**
 * 
 * @ClassName:  PersonalController   
 * @Description:TODO(个人用户登录日志)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月26日 下午8:13:52   
 *
 */
@Controller
public class IplogController {
	
	@Autowired
	private IplogService iplogService;
	
	/*@RequestMapping("ipLog.do")
	public String iplog() {
		return "iplog_list";
	}*/
	
	//个人用户登录列表
	@RequestMapping("ipLog.do")
	//@ModelAttribute模型自动加入到model里面不需要手动添加
	public String iplogList(@ModelAttribute("qo")IplogQueryObject qo,Model model) {
		model.addAttribute("pageResult", this.iplogService.query(qo));
		return "iplog_list";
	}
}
