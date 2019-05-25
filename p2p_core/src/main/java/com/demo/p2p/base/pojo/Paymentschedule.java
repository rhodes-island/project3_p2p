package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//还款表
public class Paymentschedule {
    private Long id;//还款表id

    private Date deadline;//最后期限

    private Date paydate;//还款日期

    private BigDecimal totalamount;//总额

    private BigDecimal principal;//本金

    private BigDecimal interest;//利息

    private Byte monthindex;//分期期数

    private Byte state;//状态

    private Byte bidrequesttype;//标类

    private Byte returntype;//还款类型

    private Long bidrequestId;//标id

    private Long biduserId;//发标人id

    private String bidrequesttitle;//标题

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Paymentschedule(Long id, Date deadline, Date paydate, BigDecimal totalamount, BigDecimal principal, BigDecimal interest, Byte monthindex, Byte state, Byte bidrequesttype, Byte returntype, Long bidrequestId, Long biduserId, String bidrequesttitle, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.deadline = deadline;
        this.paydate = paydate;
        this.totalamount = totalamount;
        this.principal = principal;
        this.interest = interest;
        this.monthindex = monthindex;
        this.state = state;
        this.bidrequesttype = bidrequesttype;
        this.returntype = returntype;
        this.bidrequestId = bidrequestId;
        this.biduserId = biduserId;
        this.bidrequesttitle = bidrequesttitle;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Paymentschedule() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Byte bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Byte getReturntype() {
        return returntype;
    }

    public void setReturntype(Byte returntype) {
        this.returntype = returntype;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Long getBiduserId() {
        return biduserId;
    }

    public void setBiduserId(Long biduserId) {
        this.biduserId = biduserId;
    }

    public String getBidrequesttitle() {
        return bidrequesttitle;
    }

    public void setBidrequesttitle(String bidrequesttitle) {
        this.bidrequesttitle = bidrequesttitle == null ? null : bidrequesttitle.trim();
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