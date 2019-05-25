package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentscheduledetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentscheduledetailExample() {
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

        public Criteria andBidamountIsNull() {
            addCriterion("bidamount is null");
            return (Criteria) this;
        }

        public Criteria andBidamountIsNotNull() {
            addCriterion("bidamount is not null");
            return (Criteria) this;
        }

        public Criteria andBidamountEqualTo(BigDecimal value) {
            addCriterion("bidamount =", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountNotEqualTo(BigDecimal value) {
            addCriterion("bidamount <>", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountGreaterThan(BigDecimal value) {
            addCriterion("bidamount >", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bidamount >=", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountLessThan(BigDecimal value) {
            addCriterion("bidamount <", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bidamount <=", value, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountIn(List<BigDecimal> values) {
            addCriterion("bidamount in", values, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountNotIn(List<BigDecimal> values) {
            addCriterion("bidamount not in", values, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidamount between", value1, value2, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidamount not between", value1, value2, "bidamount");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(Long value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(Long value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(Long value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(Long value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(Long value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<Long> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<Long> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(Long value1, Long value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(Long value1, Long value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("totalamount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("totalamount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("totalamount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("totalamount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("totalamount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalamount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("totalamount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalamount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("totalamount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("totalamount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalamount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalamount not between", value1, value2, "totalamount");
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
            addCriterion("monthindex is null");
            return (Criteria) this;
        }

        public Criteria andMonthindexIsNotNull() {
            addCriterion("monthindex is not null");
            return (Criteria) this;
        }

        public Criteria andMonthindexEqualTo(Byte value) {
            addCriterion("monthindex =", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotEqualTo(Byte value) {
            addCriterion("monthindex <>", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThan(Byte value) {
            addCriterion("monthindex >", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThanOrEqualTo(Byte value) {
            addCriterion("monthindex >=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThan(Byte value) {
            addCriterion("monthindex <", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThanOrEqualTo(Byte value) {
            addCriterion("monthindex <=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexIn(List<Byte> values) {
            addCriterion("monthindex in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotIn(List<Byte> values) {
            addCriterion("monthindex not in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexBetween(Byte value1, Byte value2) {
            addCriterion("monthindex between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotBetween(Byte value1, Byte value2) {
            addCriterion("monthindex not between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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

        public Criteria andPaydateIsNull() {
            addCriterion("paydate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("paydate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("paydate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("paydate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("paydate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("paydate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("paydate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("paydate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("paydate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("paydate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("paydate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("paydate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNull() {
            addCriterion("returntype is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("returntype is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(Byte value) {
            addCriterion("returntype =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(Byte value) {
            addCriterion("returntype <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(Byte value) {
            addCriterion("returntype >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("returntype >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(Byte value) {
            addCriterion("returntype <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(Byte value) {
            addCriterion("returntype <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<Byte> values) {
            addCriterion("returntype in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<Byte> values) {
            addCriterion("returntype not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(Byte value1, Byte value2) {
            addCriterion("returntype between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(Byte value1, Byte value2) {
            addCriterion("returntype not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdIsNull() {
            addCriterion("paymentschedule_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdIsNotNull() {
            addCriterion("paymentschedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdEqualTo(Long value) {
            addCriterion("paymentschedule_id =", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdNotEqualTo(Long value) {
            addCriterion("paymentschedule_id <>", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdGreaterThan(Long value) {
            addCriterion("paymentschedule_id >", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("paymentschedule_id >=", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdLessThan(Long value) {
            addCriterion("paymentschedule_id <", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdLessThanOrEqualTo(Long value) {
            addCriterion("paymentschedule_id <=", value, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdIn(List<Long> values) {
            addCriterion("paymentschedule_id in", values, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdNotIn(List<Long> values) {
            addCriterion("paymentschedule_id not in", values, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdBetween(Long value1, Long value2) {
            addCriterion("paymentschedule_id between", value1, value2, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andPaymentscheduleIdNotBetween(Long value1, Long value2) {
            addCriterion("paymentschedule_id not between", value1, value2, "paymentscheduleId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdIsNull() {
            addCriterion("fromlogininfo_id is null");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdIsNotNull() {
            addCriterion("fromlogininfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdEqualTo(Long value) {
            addCriterion("fromlogininfo_id =", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdNotEqualTo(Long value) {
            addCriterion("fromlogininfo_id <>", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdGreaterThan(Long value) {
            addCriterion("fromlogininfo_id >", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fromlogininfo_id >=", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdLessThan(Long value) {
            addCriterion("fromlogininfo_id <", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdLessThanOrEqualTo(Long value) {
            addCriterion("fromlogininfo_id <=", value, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdIn(List<Long> values) {
            addCriterion("fromlogininfo_id in", values, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdNotIn(List<Long> values) {
            addCriterion("fromlogininfo_id not in", values, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdBetween(Long value1, Long value2) {
            addCriterion("fromlogininfo_id between", value1, value2, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andFromlogininfoIdNotBetween(Long value1, Long value2) {
            addCriterion("fromlogininfo_id not between", value1, value2, "fromlogininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdIsNull() {
            addCriterion("tologininfo_id is null");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdIsNotNull() {
            addCriterion("tologininfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdEqualTo(Long value) {
            addCriterion("tologininfo_id =", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdNotEqualTo(Long value) {
            addCriterion("tologininfo_id <>", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdGreaterThan(Long value) {
            addCriterion("tologininfo_id >", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tologininfo_id >=", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdLessThan(Long value) {
            addCriterion("tologininfo_id <", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdLessThanOrEqualTo(Long value) {
            addCriterion("tologininfo_id <=", value, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdIn(List<Long> values) {
            addCriterion("tologininfo_id in", values, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdNotIn(List<Long> values) {
            addCriterion("tologininfo_id not in", values, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdBetween(Long value1, Long value2) {
            addCriterion("tologininfo_id between", value1, value2, "tologininfoId");
            return (Criteria) this;
        }

        public Criteria andTologininfoIdNotBetween(Long value1, Long value2) {
            addCriterion("tologininfo_id not between", value1, value2, "tologininfoId");
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