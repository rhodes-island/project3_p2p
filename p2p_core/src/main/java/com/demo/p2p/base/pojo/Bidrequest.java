package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

//标表
public class Bidrequest {
    private Long id;//标表id

    private Integer version;//对象版本信息（用作乐观锁）

    private Byte bidrequesttype;//借款类型，在我们项目中，就是信用借款

    private Byte bidrequeststate;//标的的状态，因为标的在一个时间只可能处于一

    private BigDecimal bidrequestamount;//这个借款的金额

    private BigDecimal currentrate;//这个借款的利率

    private Byte monthes2return;//借款期限，就是这个借款的还款时间，单位是月，一般可供1~18选择

    private Integer bidcount;//这个借款现在已经有多少次投标（这个数据是用于标的监控看的）

    private BigDecimal totalrewardamount;//总回报金额（在我们的项目中，总回报金额就是这个标总利息的金额，其实在实际的项目中，标的可能还有额外的投标奖金）

    private BigDecimal currentsum;//当前已经投了多少钱了

    private String title;//借款标题

    private String description;//借款描述

    private String note;//风控评审意见，这个意见是需要在标的里面展示给用户看的，这个意见也是发标前审核的审核意见

    private Date disabledate;//招标到期时间，这个是根据前台选择的招标时间和发标前审核的时间来决定的，超过这个时间，如果标的还没有投满，就需要进行流标操作

    private Long createuserId;//创标人id

    private Byte disabledays;//招标天数，这个就是前台填写的招标天数

    private BigDecimal minbidamount;//最小投标数

    private Date applytime;//申请时间

    private Date publishtime;//发布时间，这个时间在我们项目中就是发标前审核的时间，在实际项目中，可能有些标是可以设定一个时间，定时发标的

    private String standbyone;//备用字段1

    private String standbytwo;//备用字段2

    private Long standbythree;//备用字段3

    private BigDecimal standbyfour;//备用字段4

    public Bidrequest(Long id, Integer version, Byte bidrequesttype, Byte bidrequeststate, BigDecimal bidrequestamount, BigDecimal currentrate, Byte monthes2return, Integer bidcount, BigDecimal totalrewardamount, BigDecimal currentsum, String title, String description, String note, Date disabledate, Long createuserId, Byte disabledays, BigDecimal minbidamount, Date applytime, Date publishtime, String standbyone, String standbytwo, Long standbythree, BigDecimal standbyfour) {
        this.id = id;
        this.version = version;
        this.bidrequesttype = bidrequesttype;
        this.bidrequeststate = bidrequeststate;
        this.bidrequestamount = bidrequestamount;
        this.currentrate = currentrate;
        this.monthes2return = monthes2return;
        this.bidcount = bidcount;
        this.totalrewardamount = totalrewardamount;
        this.currentsum = currentsum;
        this.title = title;
        this.description = description;
        this.note = note;
        this.disabledate = disabledate;
        this.createuserId = createuserId;
        this.disabledays = disabledays;
        this.minbidamount = minbidamount;
        this.applytime = applytime;
        this.publishtime = publishtime;
        this.standbyone = standbyone;
        this.standbytwo = standbytwo;
        this.standbythree = standbythree;
        this.standbyfour = standbyfour;
    }

    public Bidrequest() {
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

    public Byte getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Byte bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Byte getBidrequeststate() {
        return bidrequeststate;
    }

    public void setBidrequeststate(Byte bidrequeststate) {
        this.bidrequeststate = bidrequeststate;
    }

    public BigDecimal getBidrequestamount() {
        return bidrequestamount;
    }

    public void setBidrequestamount(BigDecimal bidrequestamount) {
        this.bidrequestamount = bidrequestamount;
    }

    public BigDecimal getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(BigDecimal currentrate) {
        this.currentrate = currentrate;
    }

    public Byte getMonthes2return() {
        return monthes2return;
    }

    public void setMonthes2return(Byte monthes2return) {
        this.monthes2return = monthes2return;
    }

    public Integer getBidcount() {
        return bidcount;
    }

    public void setBidcount(Integer bidcount) {
        this.bidcount = bidcount;
    }

    public BigDecimal getTotalrewardamount() {
        return totalrewardamount;
    }

    public void setTotalrewardamount(BigDecimal totalrewardamount) {
        this.totalrewardamount = totalrewardamount;
    }

    public BigDecimal getCurrentsum() {
        return currentsum;
    }

    public void setCurrentsum(BigDecimal currentsum) {
        this.currentsum = currentsum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDisabledate() {
        return disabledate;
    }

    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    public Long getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Long createuserId) {
        this.createuserId = createuserId;
    }

    public Byte getDisabledays() {
        return disabledays;
    }

    public void setDisabledays(Byte disabledays) {
        this.disabledays = disabledays;
    }

    public BigDecimal getMinbidamount() {
        return minbidamount;
    }

    public void setMinbidamount(BigDecimal minbidamount) {
        this.minbidamount = minbidamount;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
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