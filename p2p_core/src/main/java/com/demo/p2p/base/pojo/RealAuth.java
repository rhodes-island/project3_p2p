package com.demo.p2p.base.pojo;

import java.util.Date;

//用户真实信息表
public class RealAuth extends BasePojo{
	
	public static final int SEX_MALE = 0;
	public static final int SEX_FEMALE = 1;
	
	public static final int STATE_NORMAL = 0;//正常
	public static final int STATE_AUDIT = 1;//审核通过
	public static final int STATE_REJECT = 2;//审核拒绝
	
    private String realName;//真名
    private Byte sex;//性别
    private String birthDate;//出生日期
    private String idNumber;//证件号号码
    private String address;// 证件地址
	private String image1;// 身份证正面图片地址
	private String image2;// 身份证反面图片地址

    private Byte state;//状态
    private Logininfo applier;//申请人
    private Logininfo auditor;//审核人
    private String remark;//审核备注
    private Date applyTime;//申请时间
    private Date auditTime;//审核时间
    
    private Long auditorId;

    private Long applierId;
   
	
	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public Byte getSex() {
		return sex;
	}


	public void setSex(Byte sex) {
		this.sex = sex;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getImage1() {
		return image1;
	}


	public void setImage1(String image1) {
		this.image1 = image1;
	}


	public String getImage2() {
		return image2;
	}


	public void setImage2(String image2) {
		this.image2 = image2;
	}


	public Byte getState() {
		return state;
	}


	public void setState(Byte state) {
		this.state = state;
	}


	public Logininfo getApplier() {
		return applier;
	}


	public void setApplier(Logininfo applier) {
		this.applier = applier;
	}


	public Logininfo getAuditor() {
		return auditor;
	}


	public void setAuditor(Logininfo auditor) {
		this.auditor = auditor;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Date getApplyTime() {
		return applyTime;
	}


	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}


	public Date getAuditTime() {
		return auditTime;
	}


	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}


	public Long getAuditorId() {
		return auditorId;
	}


	public void setAuditorId(Long auditorId) {
		this.auditorId = auditorId;
	}


	public Long getApplierId() {
		return applierId;
	}


	public void setApplierId(Long applierId) {
		this.applierId = applierId;
	}


	@Override
	public String toString() {
		return "RealAuth [realName=" + realName + ", sex=" + sex + ", birthDate=" + birthDate + ", idNumber=" + idNumber
				+ ", address=" + address + ", image1=" + image1 + ", image2=" + image2 + ", state=" + state
				+ ", applier=" + applier + ", auditor=" + auditor + ", remark=" + remark + ", applyTime=" + applyTime
				+ ", auditTime=" + auditTime + ", auditorId=" + auditorId + ", applierId=" + applierId + "]";
	}


}