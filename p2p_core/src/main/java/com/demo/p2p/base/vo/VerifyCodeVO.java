package com.demo.p2p.base.vo;

import java.util.Date;

/**
 * 存放验证码相关内容,这个对象是放在session中的
 * 
 * @author Administrator
 * 
 */
public class VerifyCodeVO {
	
	private String verifyCode;//验证码
	private String phoneNumber;//发送验证码的手机号
	private Date lastSendTime;//最近成功发送时间
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getLastSendTime() {
		return lastSendTime;
	}
	public void setLastSendTime(Date lastSendTime) {
		this.lastSendTime = lastSendTime;
	}
	@Override
	public String toString() {
		return "VerifyCodeVO [verifyCode=" + verifyCode + ", phoneNumber=" + phoneNumber + ", lastSendTime="
				+ lastSendTime + "]";
	}
	
}
