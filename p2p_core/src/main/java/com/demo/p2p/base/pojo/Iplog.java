package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//ip日志表
public class Iplog {
	public static final byte STATE_SUCCESS = 1;
	public static final byte STATE_FAIL = 0;
	
    private Long id;//ip日志表id

    private String ip;//ip地址
    
    private Date logintime;//登陆时间

	private String username;// 用户名
	
    private Byte loginstate;//登录状态

    private Long logininfoid;//登录信息id

    private Byte logintype;//登陆类型

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Iplog(Long id, String ip, Byte loginstate, String username, Long logininfoid, Byte logintype, Date logintime, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.ip = ip;
        this.loginstate = loginstate;
        this.username = username;
        this.logininfoid = logininfoid;
        this.logintype = logintype;
        this.logintime = logintime;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Iplog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Byte getLoginstate() {
        return loginstate;
    }

    public void setLoginstate(Byte loginstate) {
        this.loginstate = loginstate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Long logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Byte getLogintype() {
        return logintype;
    }

    public void setLogintype(Byte logintype) {
        this.logintype = logintype;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
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
}