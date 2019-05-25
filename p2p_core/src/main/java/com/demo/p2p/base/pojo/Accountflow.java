package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//账单流水表
public class Accountflow {
    private Long id;//账单流水id

    private Byte accountactiontype;//账户交易类型

    private BigDecimal amount;//流水金额

    private String note;//备注

    private BigDecimal balance;//结余

    private BigDecimal freezed;//冻结金额

    private Date actiontime;//交易时间

    private Long accountId;//账户id

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Accountflow(Long id, Byte accountactiontype, BigDecimal amount, String note, BigDecimal balance, BigDecimal freezed, Date actiontime, Long accountId, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.accountactiontype = accountactiontype;
        this.amount = amount;
        this.note = note;
        this.balance = balance;
        this.freezed = freezed;
        this.actiontime = actiontime;
        this.accountId = accountId;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Accountflow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getFreezed() {
        return freezed;
    }

    public void setFreezed(BigDecimal freezed) {
        this.freezed = freezed;
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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