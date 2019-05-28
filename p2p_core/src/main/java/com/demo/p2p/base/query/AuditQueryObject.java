package com.demo.p2p.base.query;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import com.demo.p2p.base.util.DateUtil;

public class AuditQueryObject extends QueryObject {

	private int state  ;
	private Date beginDate ;
	private Date endDate ;
 	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getBeginDate() {
		return beginDate;
	}
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
	
	
}
