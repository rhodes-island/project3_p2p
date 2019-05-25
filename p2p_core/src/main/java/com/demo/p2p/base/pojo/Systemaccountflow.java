package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//系统账户流水表
public class Systemaccountflow {
    private Long id;//系统账户流水id

    private Date createddate;//创建时间

    private Byte accountactiontype;//交易类型

    private BigDecimal amount;//总额

    private String note;//备注

    private BigDecimal balance;//余额

    private BigDecimal freezedamount;//冻结金额

    private Long systemaccountId;//系统账户id

    private Long targetuserId;//对应的用户id

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Systemaccountflow(Long id, Date createddate, Byte accountactiontype, BigDecimal amount, String note, BigDecimal balance, BigDecimal freezedamount, Long systemaccountId, Long targetuserId, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.createddate = createddate;
        this.accountactiontype = accountactiontype;
        this.amount = amount;
        this.note = note;
        this.balance = balance;
        this.freezedamount = freezedamount;
        this.systemaccountId = systemaccountId;
        this.targetuserId = targetuserId;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Systemaccountflow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Byte getAccountactiontype() {
        return accountactiontype;
    }

    public void setAccountactiontype(Byte accountactiontype) {
        this.accountactiontype = accountactiontype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Long getSystemaccountId() {
        return systemaccountId;
    }

    public void setSystemaccountId(Long systemaccountId) {
        this.systemaccountId = systemaccountId;
    }

    public Long getTargetuserId() {
        return targetuserId;
    }

    public void setTargetuserId(Long targetuserId) {
        this.targetuserId = targetuserId;
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