package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//投标表
public class Bid {
    private Long id;//投标id

    private BigDecimal actualrate;//年利率

    private BigDecimal availableamount;//投标有效金额(就是投标金额)

    private Long bidrequestId;//来自于哪个借款标

    private Long biduserId;//发标者id

    private Date bidtime;//投标时间

    private String bidrequesttitle;//投标主题

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Bid(Long id, BigDecimal actualrate, BigDecimal availableamount, Long bidrequestId, Long biduserId, Date bidtime, String bidrequesttitle, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.actualrate = actualrate;
        this.availableamount = availableamount;
        this.bidrequestId = bidrequestId;
        this.biduserId = biduserId;
        this.bidtime = bidtime;
        this.bidrequesttitle = bidrequesttitle;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Bid() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getActualrate() {
        return actualrate;
    }

    public void setActualrate(BigDecimal actualrate) {
        this.actualrate = actualrate;
    }

    public BigDecimal getAvailableamount() {
        return availableamount;
    }

    public void setAvailableamount(BigDecimal availableamount) {
        this.availableamount = availableamount;
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

    public Date getBidtime() {
        return bidtime;
    }

    public void setBidtime(Date bidtime) {
        this.bidtime = bidtime;
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