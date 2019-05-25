package com.demo.p2p.base.pojo;

import java.math.BigDecimal;

//账户表
public class Account {
    private Long id;//账户id

    private String tradepassword;//交易密码

    private BigDecimal usableamount;//账户可用余额

    private BigDecimal freezedamount;//账户冻结金额

    private BigDecimal borrowlimitamount;//最大借款数

    private Integer version;//对象版本信息（用作乐观锁）

    private BigDecimal unreceiveinterest;//账户待收利息

    private BigDecimal unreceiveprincipal;//账户待收本金

    private BigDecimal unreturnamount;//账户待还金额

    private BigDecimal remainborrowlimit;//账户剩余授信额度

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Account(Long id, String tradepassword, BigDecimal usableamount, BigDecimal freezedamount, BigDecimal borrowlimitamount, Integer version, BigDecimal unreceiveinterest, BigDecimal unreceiveprincipal, BigDecimal unreturnamount, BigDecimal remainborrowlimit, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.tradepassword = tradepassword;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.borrowlimitamount = borrowlimitamount;
        this.version = version;
        this.unreceiveinterest = unreceiveinterest;
        this.unreceiveprincipal = unreceiveprincipal;
        this.unreturnamount = unreturnamount;
        this.remainborrowlimit = remainborrowlimit;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Account() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword == null ? null : tradepassword.trim();
    }

    public BigDecimal getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public BigDecimal getBorrowlimitamount() {
        return borrowlimitamount;
    }

    public void setBorrowlimitamount(BigDecimal borrowlimitamount) {
        this.borrowlimitamount = borrowlimitamount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getUnreceiveinterest() {
        return unreceiveinterest;
    }

    public void setUnreceiveinterest(BigDecimal unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    public BigDecimal getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    public void setUnreceiveprincipal(BigDecimal unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    public BigDecimal getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(BigDecimal unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public BigDecimal getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(BigDecimal remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
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