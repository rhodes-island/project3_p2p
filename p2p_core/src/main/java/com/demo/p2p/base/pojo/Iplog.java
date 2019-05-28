package com.demo.p2p.base.pojo;

import java.util.Date;

//ip日志表
public class Iplog extends BasePojo {
	public static final byte STATE_SUCCESS = 1;//登录成功
	public static final byte STATE_FAIL = 0;//登录失败

    private String ip;//ip地址
    
    private Date logintime;//登陆时间

	private String username;// 用户名
	
    private Byte loginstate;//登录状态

    private Long logininfoid;//登录信息id
    
    private int usertype;//用户类型

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Byte getLoginstate() {
		return loginstate;
	}

	public void setLoginstate(Byte loginstate) {
		this.loginstate = loginstate;
	}

	public Long getLogininfoid() {
		return logininfoid;
	}

	public void setLogininfoid(Long logininfoid) {
		this.logininfoid = logininfoid;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

    
	
	@Override
	public String toString() {
		return "Iplog [ip=" + ip + ", logintime=" + logintime + ", username=" + username + ", loginstate=" + loginstate
				+ ", logininfoid=" + logininfoid + ", usertype=" + usertype + "]";
	}

	//返回状态的用户名
	public String getLoginStateDisplay() {
		return loginstate==STATE_SUCCESS?"登陆成功":"登陆失败";
	}
	
	public String getUserTypeDisplay() {
		return usertype==Logininfo.USER_CLIENT?"前端用户":"后台用户";
	}
}