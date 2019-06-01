package com.demo.p2p.base.pojo;


import com.demo.p2p.base.util.BitStatesUtils;

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
	private Long realAuthId;// 该用户对应的实名认证对象Id

	private Systemdictionaryitem incomegrade; // 收入
	private Systemdictionaryitem marriage; // 婚姻情况
	private Systemdictionaryitem kidcount; // 子女情况
	private Systemdictionaryitem educationbackground; // 学历
	private Systemdictionaryitem housecondition; // 住房条件

	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", version=" + version + ", bitstate=" + bitstate + ", realname=" + realname
				+ ", idnumber=" + idnumber + ", phonenumber=" + phonenumber + ", authscore=" + authscore + ", email="
				+ email + ", realAuthId=" + realAuthId + ", incomegrade=" + incomegrade + ", marriage=" + marriage
				+ ", kidcount=" + kidcount + ", educationbackground=" + educationbackground + ", housecondition="
				+ housecondition + "]";
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

	public Systemdictionaryitem getIncomegrade() {
		return incomegrade;
	}

	public void setIncomegrade(Systemdictionaryitem incomegrade) {
		this.incomegrade = incomegrade;
	}

	public Systemdictionaryitem getMarriage() {
		return marriage;
	}

	public void setMarriage(Systemdictionaryitem marriage) {
		this.marriage = marriage;
	}

	public Systemdictionaryitem getKidcount() {
		return kidcount;
	}

	public void setKidcount(Systemdictionaryitem kidcount) {
		this.kidcount = kidcount;
	}

	public Systemdictionaryitem getEducationbackground() {
		return educationbackground;
	}

	public void setEducationbackground(Systemdictionaryitem educationbackground) {
		this.educationbackground = educationbackground;
	}

	public Systemdictionaryitem getHousecondition() {
		return housecondition;
	}

	public void setHousecondition(Systemdictionaryitem housecondition) {
		this.housecondition = housecondition;
	}

	public Long getrealAuthId() {
		return realAuthId;
	}

	public void setrealAuthId(Long realAuthId) {
		this.realAuthId = realAuthId;
	}

	/**
	 * 添加状态码
	 * 
	 * @param state
	 */
	public void addState(long state) {
		this.setBitstate(BitStatesUtils.addState(this.bitstate, state));
	}

	public void removeState(long state) {
		this.setBitstate(BitStatesUtils.removeState(this.bitstate, state));
	}

	/**
	 * 返回用户是否已经绑定手机
	 * 
	 * @return
	 */
	public boolean getIsBindPhone() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_BIND_PHONE);
	}

	/**
	 * 返回用户是否已经绑定邮箱
	 * 
	 * @return
	 */
	public boolean getIsBindEmail() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_BIND_EMAIL);
	}

	/**
	 * 返回用户是否已经填写了基本资料
	 * 
	 * @return
	 */
	public boolean getIsBasicInfo() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_BASIC_INFO);
	}

	/**
	 * 返回用户是否已经实名认证
	 * 
	 * @return
	 */
	public boolean getIsRealAuth() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_REAL_AUTH);
	}

	/**
	 * 返回用户是否视频认证
	 * 
	 * @return
	 */
	public boolean getIsVedioAuth() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_VEDIO_AUTH);
	}

	/**
	 * 返回用户是否绑定银行卡
	 * 
	 * @return
	 */
	public boolean getIsBindBank() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_BIND_BANKINFO);
	}

	/**
	 * 返回用户是否有一个借款在处理流程当中
	 * 
	 * @return
	 */
	public boolean getHasBidRequestProcess() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_HAS_BIDREQUEST_PROCESS);
	}

	/**
	 * 返回用户是否有一个提现申请在处理流程当中
	 * 
	 * @return
	 */
	public boolean getHasWithdrawProcess() {
		return BitStatesUtils.hasState(this.bitstate, BitStatesUtils.OP_HAS_MONEYWITHDRAW_PROCESS);
	}

}