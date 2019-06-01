package com.demo.p2p.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.p2p.base.pojo.Userinfo;
import com.demo.p2p.base.service.SystemdictionaryService;
import com.demo.p2p.base.service.UserinfoService;
import com.demo.p2p.base.util.JSONResult;
import com.demo.p2p.base.util.RequireLogin;

/**
 * 
 * @ClassName:  BasicInfoController   
 * @Description:TODO(用户个人资料填写)   
 * @author: 583165647@qq.com 
 * @date:   2019年5月31日 下午2:38:23   
 *
 */
@Controller
public class BasicInfoController {
	
	@Autowired
	private UserinfoService userinfoService;
	
	@Autowired
	private SystemdictionaryService systemDictoryItem;
	
	@RequireLogin
	@RequestMapping("basicInfo.do")
	public String basicInfo(Model model) {
		//当前用户相关信息
		model.addAttribute("userinfo", this.userinfoService.getCurrent());
		System.out.println(this.userinfoService.getCurrent().toString());
		//添加下拉列表相关内容
		model.addAttribute("educationBackgrounds", this.systemDictoryItem.listByParentSn("educationBackground"));
		model.addAttribute("incomeGrades", this.systemDictoryItem.listByParentSn("incomeGrade"));
		model.addAttribute("marriages", this.systemDictoryItem.listByParentSn("marriage"));
		model.addAttribute("kidCounts", this.systemDictoryItem.listByParentSn("kidCount"));
		model.addAttribute("houseConditions", this.systemDictoryItem.listByParentSn("houseCondition"));
		return "userinfo";
	}
	
	@RequestMapping("/basicInfo_save.do")
	@RequireLogin
	@ResponseBody
	public JSONResult basicInfoSave(Userinfo userinfo) {
		JSONResult json = new JSONResult();
		//这里直接update可能会数据丢失
		//如果查出来再update不安全
		//lcoalhost:8888/basicInfo_save.do?id=libohan&socre=100
		//所以关于重要信息的保存必须专门写一个方法来确保数据的安全性
		this.userinfoService.updateBasicInfo(userinfo);
		return json;
	}
}
