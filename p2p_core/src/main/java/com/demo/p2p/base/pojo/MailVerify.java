package com.demo.p2p.base.pojo;

import java.util.Date;

public class MailVerify extends BasePojo {
	
	private Long userinfoId;// 谁在发送绑定邮件
	private String email;
	private String uuid;
	private Date sendDate;//发送邮件
	public Long getUserinfoId() {
		return userinfoId;
	}
	public void setUserinfoId(Long userinfoId) {
		this.userinfoId = userinfoId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
}
