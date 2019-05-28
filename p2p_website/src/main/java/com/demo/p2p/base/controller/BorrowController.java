package com.demo.p2p.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.p2p.base.pojo.Logininfo;
import com.demo.p2p.base.service.AccountService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.BidConst;
import com.demo.p2p.base.util.UserContext;

@Controller
public class BorrowController {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private UserinfoService userinfoServce; 

	// 从别的地方跳转过来的请求
	@RequestMapping("borrow.do")
	public String borrow(Model model) {
		// 获取当前对象传的值
		Logininfo current = UserContext.getCurrent();
		// 如果没用登录，直接返回borrw.html
		if (current == null) {
			return "redirect:borrow.html";
		} else {
			//得到这个用户的Account信息
			model.addAttribute("account", this.accountService.getCurrent());
			//得到这个用户的Userinfo信息
			model.addAttribute("userinfo", this.userinfoServce.get(current.getId()));
			//UserInfo信息
			model.addAttribute("creditBorrowScore", BidConst.BASE_BORROW_SCORE);
			return "borrow";
		}
	}
}
