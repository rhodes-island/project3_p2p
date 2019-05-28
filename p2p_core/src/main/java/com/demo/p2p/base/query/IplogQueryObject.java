package com.demo.p2p.base.query;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import com.demo.p2p.base.util.DateUtil;


//分页查询的条件
public class IplogQueryObject extends QueryObject {

	private Date beginDate;
	private Date endDate;

	private int state = -1;
	private int userType = -1 ;
	
	private String username;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//spring日期的注入必须要给格式
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setBeginDate(Date beginDate){
		this.beginDate = beginDate ;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setEndDate(Date endDate){
		this.endDate = endDate ;
	}
	
	//获取到endDate时间的最后一秒
	public Date getEndDate(){
		return endDate == null ? null : DateUtil.endOfDay(endDate);
	}	
	
	//只要字符串相关 都需要判断不等于null
	public String getUsername(){
		return StringUtils.hasLength(username) ? username : null ;
	}
	
	
}
