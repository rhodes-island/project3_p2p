package com.demo.p2p.base.pojo;

import java.math.BigDecimal;

//用户信息表
public class Userinfo {
	private Long id;// 用户信息表id

	private Integer version;// 版本号

	private Long bitstate;// 用户状态码

	private String realname;// 真名

	private String idnumber;// 身份证号码

	private String phonenumber;// 电话号码

	private Integer authscore;// 风控累计分数;
	private String email;// 邮箱
	private Long incomegradeId;// 月收入

	private Long marriageId;// 婚否

	private Long kidcountId;// 子女情况id

	private Long educationbackgroundId;// 学历情况id

	private Long houseconditionId;// 住房条件id

	private Long realauthid;// 该用户对应的实名认证对象id

	private String standbyone;// 备用字段1

	private String standbytwo;// 备用字段2

	private Long standbythree;// 备用字段3

	private BigDecimal standbyfour;// 备用字段4

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
		this.realname = realname;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getAuthscore() {
		return authscore;
	}

	public void setAuthscore(Integer authscore) {
		this.authscore = authscore;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getStandbyone() {
		return standbyone;
	}

	public void setStandbyone(String standbyone) {
		this.standbyone = standbyone;
	}

	public String getStandbytwo() {
		return standbytwo;
	}

	public void setStandbytwo(String standbytwo) {
		this.standbytwo = standbytwo;
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
		return "Userinfo [id=" + id + ", version=" + version + ", bitstate=" + bitstate + ", realname=" + realname
				+ ", idnumber=" + idnumber + ", phonenumber=" + phonenumber + ", authscore=" + authscore + ", email="
				+ email + ", incomegradeId=" + incomegradeId + ", marriageId=" + marriageId + ", kidcountId="
				+ kidcountId + ", educationbackgroundId=" + educationbackgroundId + ", houseconditionId="
				+ houseconditionId + ", realauthid=" + realauthid + ", standbyone=" + standbyone + ", standbytwo="
				+ standbytwo + ", standbythree=" + standbythree + ", standbyfour=" + standbyfour + "]";
	}


}