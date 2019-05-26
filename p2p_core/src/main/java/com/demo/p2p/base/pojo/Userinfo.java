package com.demo.p2p.base.pojo;

import java.math.BigDecimal;

//用户信息表
public class Userinfo {
    private Long id;//用户信息表id

    private Integer version;//版本号

    private Long bitstate  ;//用户状态码

    private String realname;//真名

    private String idnumber;//身份证号码

    private String phonenumber;//电话号码

    private Long incomegradeId;//月收入

    private Long marriageId;//婚否

    private Long kidcountId;//子女情况id

    private Long educationbackgroundId;//学历情况id

    private Integer authscore;//风控累计分数;

    private Long houseconditionId;//住房条件id

    private Long realauthid;// 该用户对应的实名认证对象id

    private String email;//邮箱

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Userinfo(Long id, Integer version, Long bitstate, String realname, String idnumber, String phonenumber, Long incomegradeId, Long marriageId, Long kidcountId, Long educationbackgroundId, Integer authscore, Long houseconditionId, Long realauthid, String email, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.version = version;
        this.bitstate = bitstate;
        this.realname = realname;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
        this.incomegradeId = incomegradeId;
        this.marriageId = marriageId;
        this.kidcountId = kidcountId;
        this.educationbackgroundId = educationbackgroundId;
        this.authscore = authscore;
        this.houseconditionId = houseconditionId;
        this.realauthid = realauthid;
        this.email = email;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Userinfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getBitstate() {
        return bitstate;
    }

    public void setBitstate(Long bitstate) {
        this.bitstate = bitstate;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Long getIncomegradeId() {
        return incomegradeId;
    }

    public void setIncomegradeId(Long incomegradeId) {
        this.incomegradeId = incomegradeId;
    }

    public Long getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Long marriageId) {
        this.marriageId = marriageId;
    }

    public Long getKidcountId() {
        return kidcountId;
    }

    public void setKidcountId(Long kidcountId) {
        this.kidcountId = kidcountId;
    }

    public Long getEducationbackgroundId() {
        return educationbackgroundId;
    }

    public void setEducationbackgroundId(Long educationbackgroundId) {
        this.educationbackgroundId = educationbackgroundId;
    }

    public Integer getAuthscore() {
        return authscore;
    }

    public void setAuthscore(Integer authscore) {
        this.authscore = authscore;
    }

    public Long getHouseconditionId() {
        return houseconditionId;
    }

    public void setHouseconditionId(Long houseconditionId) {
        this.houseconditionId = houseconditionId;
    }

    public Long getRealauthid() {
        return realauthid;
    }

    public void setRealauthid(Long realauthid) {
        this.realauthid = realauthid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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