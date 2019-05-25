package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentscheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentscheduleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadLine is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadLine is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadLine =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadLine <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadLine >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadLine >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadLine <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadLine <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadLine in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadLine not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadLine between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadLine not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("payDate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("payDate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("payDate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("payDate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("payDate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("payDate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("payDate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("payDate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("payDate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("payDate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("totalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("totalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("totalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("totalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("totalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("totalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(BigDecimal value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(BigDecimal value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(BigDecimal value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<BigDecimal> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andMonthindexIsNull() {
            addCriterion("monthIndex is null");
            return (Criteria) this;
        }

        public Criteria andMonthindexIsNotNull() {
            addCriterion("monthIndex is not null");
            return (Criteria) this;
        }

        public Criteria andMonthindexEqualTo(Byte value) {
            addCriterion("monthIndex =", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotEqualTo(Byte value) {
            addCriterion("monthIndex <>", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThan(Byte value) {
            addCriterion("monthIndex >", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThanOrEqualTo(Byte value) {
            addCriterion("monthIndex >=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThan(Byte value) {
            addCriterion("monthIndex <", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThanOrEqualTo(Byte value) {
            addCriterion("monthIndex <=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexIn(List<Byte> values) {
            addCriterion("monthIndex in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotIn(List<Byte> values) {
            addCriterion("monthIndex not in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexBetween(Byte value1, Byte value2) {
            addCriterion("monthIndex between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotBetween(Byte value1, Byte value2) {
            addCriterion("monthIndex not between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIsNull() {
            addCriterion("bidRequestType is null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIsNotNull() {
            addCriterion("bidRequestType is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeEqualTo(Byte value) {
            addCriterion("bidRequestType =", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotEqualTo(Byte value) {
            addCriterion("bidRequestType <>", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeGreaterThan(Byte value) {
            addCriterion("bidRequestType >", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bidRequestType >=", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeLessThan(Byte value) {
            addCriterion("bidRequestType <", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeLessThanOrEqualTo(Byte value) {
            addCriterion("bidRequestType <=", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIn(List<Byte> values) {
            addCriterion("bidRequestType in", values, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotIn(List<Byte> values) {
            addCriterion("bidRequestType not in", values, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestType between", value1, value2, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestType not between", value1, value2, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNull() {
            addCriterion("returnType is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("returnType is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(Byte value) {
            addCriterion("returnType =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(Byte value) {
            addCriterion("returnType <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(Byte value) {
            addCriterion("returnType >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("returnType >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(Byte value) {
            addCriterion("returnType <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(Byte value) {
            addCriterion("returnType <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<Byte> values) {
            addCriterion("returnType in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<Byte> values) {
            addCriterion("returnType not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(Byte value1, Byte value2) {
            addCriterion("returnType between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(Byte value1, Byte value2) {
            addCriterion("returnType not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIsNull() {
            addCriterion("bidrequest_id is null");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIsNotNull() {
            addCriterion("bidrequest_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdEqualTo(Long value) {
            addCriterion("bidrequest_id =", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotEqualTo(Long value) {
            addCriterion("bidrequest_id <>", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdGreaterThan(Long value) {
            addCriterion("bidrequest_id >", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bidrequest_id >=", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdLessThan(Long value) {
            addCriterion("bidrequest_id <", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdLessThanOrEqualTo(Long value) {
            addCriterion("bidrequest_id <=", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIn(List<Long> values) {
            addCriterion("bidrequest_id in", values, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotIn(List<Long> values) {
            addCriterion("bidrequest_id not in", values, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdBetween(Long value1, Long value2) {
            addCriterion("bidrequest_id between", value1, value2, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotBetween(Long value1, Long value2) {
            addCriterion("bidrequest_id not between", value1, value2, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIsNull() {
            addCriterion("biduser_id is null");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIsNotNull() {
            addCriterion("biduser_id is not null");
            return (Criteria) this;
        }

        public Criteria andBiduserIdEqualTo(Long value) {
            addCriterion("biduser_id =", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotEqualTo(Long value) {
            addCriterion("biduser_id <>", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdGreaterThan(Long value) {
            addCriterion("biduser_id >", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("biduser_id >=", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdLessThan(Long value) {
            addCriterion("biduser_id <", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdLessThanOrEqualTo(Long value) {
            addCriterion("biduser_id <=", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIn(List<Long> values) {
            addCriterion("biduser_id in", values, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotIn(List<Long> values) {
            addCriterion("biduser_id not in", values, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdBetween(Long value1, Long value2) {
            addCriterion("biduser_id between", value1, value2, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotBetween(Long value1, Long value2) {
            addCriterion("biduser_id not between", value1, value2, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIsNull() {
            addCriterion("bidRequestTitle is null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIsNotNull() {
            addCriterion("bidRequestTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleEqualTo(String value) {
            addCriterion("bidRequestTitle =", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotEqualTo(String value) {
            addCriterion("bidRequestTitle <>", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleGreaterThan(String value) {
            addCriterion("bidRequestTitle >", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleGreaterThanOrEqualTo(String value) {
            addCriterion("bidRequestTitle >=", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLessThan(String value) {
            addCriterion("bidRequestTitle <", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLessThanOrEqualTo(String value) {
            addCriterion("bidRequestTitle <=", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLike(String value) {
            addCriterion("bidRequestTitle like", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotLike(String value) {
            addCriterion("bidRequestTitle not like", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIn(List<String> values) {
            addCriterion("bidRequestTitle in", values, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotIn(List<String> values) {
            addCriterion("bidRequestTitle not in", values, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleBetween(String value1, String value2) {
            addCriterion("bidRequestTitle between", value1, value2, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotBetween(String value1, String value2) {
            addCriterion("bidRequestTitle not between", value1, value2, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andStandbyoneIsNull() {
            addCriterion("standbyone is null");
            return (Criteria) this;
        }

        public Criteria andStandbyoneIsNotNull() {
            addCriterion("standbyone is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyoneEqualTo(String value) {
            addCriterion("standbyone =", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneNotEqualTo(String value) {
            addCriterion("standbyone <>", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneGreaterThan(String value) {
            addCriterion("standbyone >", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneGreaterThanOrEqualTo(String value) {
            addCriterion("standbyone >=", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneLessThan(String value) {
            addCriterion("standbyone <", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneLessThanOrEqualTo(String value) {
            addCriterion("standbyone <=", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneLike(String value) {
            addCriterion("standbyone like", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneNotLike(String value) {
            addCriterion("standbyone not like", value, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneIn(List<String> values) {
            addCriterion("standbyone in", values, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneNotIn(List<String> values) {
            addCriterion("standbyone not in", values, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneBetween(String value1, String value2) {
            addCriterion("standbyone between", value1, value2, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbyoneNotBetween(String value1, String value2) {
            addCriterion("standbyone not between", value1, value2, "standbyone");
            return (Criteria) this;
        }

        public Criteria andStandbytwoIsNull() {
            addCriterion("standbytwo is null");
            return (Criteria) this;
        }

        public Criteria andStandbytwoIsNotNull() {
            addCriterion("standbytwo is not null");
            return (Criteria) this;
        }

        public Criteria andStandbytwoEqualTo(String value) {
            addCriterion("standbytwo =", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoNotEqualTo(String value) {
            addCriterion("standbytwo <>", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoGreaterThan(String value) {
            addCriterion("standbytwo >", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoGreaterThanOrEqualTo(String value) {
            addCriterion("standbytwo >=", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoLessThan(String value) {
            addCriterion("standbytwo <", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoLessThanOrEqualTo(String value) {
            addCriterion("standbytwo <=", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoLike(String value) {
            addCriterion("standbytwo like", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoNotLike(String value) {
            addCriterion("standbytwo not like", value, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoIn(List<String> values) {
            addCriterion("standbytwo in", values, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoNotIn(List<String> values) {
            addCriterion("standbytwo not in", values, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoBetween(String value1, String value2) {
            addCriterion("standbytwo between", value1, value2, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbytwoNotBetween(String value1, String value2) {
            addCriterion("standbytwo not between", value1, value2, "standbytwo");
            return (Criteria) this;
        }

        public Criteria andStandbythreeIsNull() {
            addCriterion("standbythree is null");
            return (Criteria) this;
        }

        public Criteria andStandbythreeIsNotNull() {
            addCriterion("standbythree is not null");
            return (Criteria) this;
        }

        public Criteria andStandbythreeEqualTo(Long value) {
            addCriterion("standbythree =", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeNotEqualTo(Long value) {
            addCriterion("standbythree <>", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeGreaterThan(Long value) {
            addCriterion("standbythree >", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeGreaterThanOrEqualTo(Long value) {
            addCriterion("standbythree >=", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeLessThan(Long value) {
            addCriterion("standbythree <", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeLessThanOrEqualTo(Long value) {
            addCriterion("standbythree <=", value, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeIn(List<Long> values) {
            addCriterion("standbythree in", values, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeNotIn(List<Long> values) {
            addCriterion("standbythree not in", values, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeBetween(Long value1, Long value2) {
            addCriterion("standbythree between", value1, value2, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbythreeNotBetween(Long value1, Long value2) {
            addCriterion("standbythree not between", value1, value2, "standbythree");
            return (Criteria) this;
        }

        public Criteria andStandbyfourIsNull() {
            addCriterion("standbyfour is null");
            return (Criteria) this;
        }

        public Criteria andStandbyfourIsNotNull() {
            addCriterion("standbyfour is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyfourEqualTo(BigDecimal value) {
            addCriterion("standbyfour =", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourNotEqualTo(BigDecimal value) {
            addCriterion("standbyfour <>", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourGreaterThan(BigDecimal value) {
            addCriterion("standbyfour >", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standbyfour >=", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourLessThan(BigDecimal value) {
            addCriterion("standbyfour <", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standbyfour <=", value, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourIn(List<BigDecimal> values) {
            addCriterion("standbyfour in", values, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourNotIn(List<BigDecimal> values) {
            addCriterion("standbyfour not in", values, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standbyfour between", value1, value2, "standbyfour");
            return (Criteria) this;
        }

        public Criteria andStandbyfourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standbyfour not between", value1, value2, "standbyfour");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}