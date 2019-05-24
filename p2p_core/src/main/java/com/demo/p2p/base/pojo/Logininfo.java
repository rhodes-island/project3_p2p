package com.demo.p2p.base.pojo;

import java.math.BigDecimal;

public class Logininfo {
	public static final int STATE_NORMAL = 0;// 正常
	public static final int STATE_LOCK = 1;// 锁定

	public static final int USER_MANAGER = 0;// 后台用户
	public static final int USER_CLIENT = 1;// 前台用户
	
    private Long id;

    private String username;

    private String password;

    private int state;

    private int usertype;

    private Boolean admin;

    private String standbyone;

    private String standbytwo;

    private Long standbythree;

    private BigDecimal standbyfour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public int getState() {
        return state;
    }

    public void setState(int stateNormal) {
        this.state = stateNormal;
    }

    public  int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getStandbyone() {
        return standbyone;
    }

    public void setStandbyone(String standbyone) {
        this.standbyone = standbyone == null ? null : standbyone.trim();
    }

    public String getStandbytwo() {
        return standbytwo;
    }

    public void setStandbytwo(String standbytwo) {
        this.standbytwo = standbytwo == null ? null : standbytwo.trim();
    }

    public Long getStandbythree() {
        return standbythree;
    }

    public void setStandbythree(Long standbythree) {
        this.standbythree = standbythree;
    }

    public BigDecimal getStandbyfour() {
        return standbyfour;
    }

    public void setStandbyfour(BigDecimal standbyfour) {
        this.standbyfour = standbyfour;
    }

	@Override
	public String toString() {
		return "Logininfo [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", usertype=" + usertype + ", admin=" + admin + ", standbyone=" + standbyone + ", standbytwo="
				+ standbytwo + ", standbythree=" + standbythree + ", standbyfour=" + standbyfour + "]";
	}
    
}