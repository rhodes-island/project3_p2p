package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//还款详表
public class Paymentscheduledetail {
    private Long id;//还款详表id

    private BigDecimal bidamount;//标总额

    private Long bidId;//标id

    private BigDecimal totalamount;//总额

    private BigDecimal principal;//本金

    private BigDecimal interest;//利息

    private Byte monthindex;//几个月

    private Date deadline;//最后期限

    private Long bidrequestId;//标者id

    private Date paydate;//还款时间

    private Byte returntype;//还款类型

    private Long paymentscheduleId;//还款标id

    private Long fromlogininfoId;//从哪个登陆表id

    private Long tologininfoId;//到那个登陆表id

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Paymentscheduledetail(Long id, BigDecimal bidamount, Long bidId, BigDecimal totalamount, BigDecimal principal, BigDecimal interest, Byte monthindex, Date deadline, Long bidrequestId, Date paydate, Byte returntype, Long paymentscheduleId, Long fromlogininfoId, Long tologininfoId, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.bidamount = bidamount;
        this.bidId = bidId;
        this.totalamount = totalamount;
        this.principal = principal;
        this.interest = interest;
        this.monthindex = monthindex;
        this.deadline = deadline;
        this.bidrequestId = bidrequestId;
        this.paydate = paydate;
        this.returntype = returntype;
        this.paymentscheduleId = paymentscheduleId;
        this.fromlogininfoId = fromlogininfoId;
        this.tologininfoId = tologininfoId;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Paymentscheduledetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBidamount() {
        return bidamount;
    }

    public void setBidamount(BigDecimal bidamount) {
        this.bidamount = bidamount;
    }

    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Byte getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(Byte monthindex) {
        this.monthindex = monthindex;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Byte getReturntype() {
        return returntype;
    }

    public void setReturntype(Byte returntype) {
        this.returntype = returntype;
    }

    public Long getPaymentscheduleId() {
        return paymentscheduleId;
    }

    public void setPaymentscheduleId(Long paymentscheduleId) {
        this.paymentscheduleId = paymentscheduleId;
    }

    public Long getFromlogininfoId() {
        return fromlogininfoId;
    }

    public void setFromlogininfoId(Long fromlogininfoId) {
        this.fromlogininfoId = fromlogininfoId;
    }

    public Long getTologininfoId() {
        return tologininfoId;
    }

    public void setTologininfoId(Long tologininfoId) {
        this.tologininfoId = tologininfoId;
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