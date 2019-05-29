package com.demo.p2p.mgrsite.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.p2p.base.query.IplogQueryObject;
import com.demo.p2p.base.query.PageResult;
import com.demo.p2p.base.service.IplogService;


/**
 * 
 * @ClassName: IplogController
 * @Description:TODO(后台登陆)
 * @author: 583165647@qq.com
 * @date: 2019年5月28日 下午6:51:14
 *
 */
@Controller
public class IplogController {
	@Autowired
	private IplogService iplogService;
	
	@RequestMapping("ipLog.do")
	public String ipLog(@ModelAttribute("qo")IplogQueryObject qo,Model model) {
		PageResult query = iplogService.query(qo);
		System.out.println(qo.getUserType());
		model.addAttribute("pageResult", iplogService.query(qo));
		return "ipLog/list";
	}
}
