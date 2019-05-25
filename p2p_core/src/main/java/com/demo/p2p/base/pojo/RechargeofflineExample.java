package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeofflineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeofflineExample() {
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("auditTime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(Long value) {
            addCriterion("auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(Long value) {
            addCriterion("auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(Long value) {
            addCriterion("auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(Long value) {
            addCriterion("auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(Long value) {
            addCriterion("auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<Long> values) {
            addCriterion("auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<Long> values) {
            addCriterion("auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(Long value1, Long value2) {
            addCriterion("auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(Long value1, Long value2) {
            addCriterion("auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andApplierIdIsNull() {
            addCriterion("applier_id is null");
            return (Criteria) this;
        }

        public Criteria andApplierIdIsNotNull() {
            addCriterion("applier_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplierIdEqualTo(Long value) {
            addCriterion("applier_id =", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotEqualTo(Long value) {
            addCriterion("applier_id <>", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdGreaterThan(Long value) {
            addCriterion("applier_id >", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("applier_id >=", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdLessThan(Long value) {
            addCriterion("applier_id <", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdLessThanOrEqualTo(Long value) {
            addCriterion("applier_id <=", value, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdIn(List<Long> values) {
            addCriterion("applier_id in", values, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotIn(List<Long> values) {
            addCriterion("applier_id not in", values, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdBetween(Long value1, Long value2) {
            addCriterion("applier_id between", value1, value2, "applierId");
            return (Criteria) this;
        }

        public Criteria andApplierIdNotBetween(Long value1, Long value2) {
            addCriterion("applier_id not between", value1, value2, "applierId");
            return (Criteria) this;
        }

        public Criteria andTradecodeIsNull() {
            addCriterion("tradeCode is null");
            return (Criteria) this;
        }

        public Criteria andTradecodeIsNotNull() {
            addCriterion("tradeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTradecodeEqualTo(String value) {
            addCriterion("tradeCode =", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeNotEqualTo(String value) {
            addCriterion("tradeCode <>", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeGreaterThan(String value) {
            addCriterion("tradeCode >", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeGreaterThanOrEqualTo(String value) {
            addCriterion("tradeCode >=", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeLessThan(String value) {
            addCriterion("tradeCode <", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeLessThanOrEqualTo(String value) {
            addCriterion("tradeCode <=", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeLike(String value) {
            addCriterion("tradeCode like", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeNotLike(String value) {
            addCriterion("tradeCode not like", value, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeIn(List<String> values) {
            addCriterion("tradeCode in", values, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeNotIn(List<String> values) {
            addCriterion("tradeCode not in", values, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeBetween(String value1, String value2) {
            addCriterion("tradeCode between", value1, value2, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradecodeNotBetween(String value1, String value2) {
            addCriterion("tradeCode not between", value1, value2, "tradecode");
            return (Criteria) this;
        }

        public Criteria andTradetimeIsNull() {
            addCriterion("tradeTime is null");
            return (Criteria) this;
        }

        public Criteria andTradetimeIsNotNull() {
            addCriterion("tradeTime is not null");
            return (Criteria) this;
        }

        public Criteria andTradetimeEqualTo(Date value) {
            addCriterion("tradeTime =", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotEqualTo(Date value) {
            addCriterion("tradeTime <>", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThan(Date value) {
            addCriterion("tradeTime >", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tradeTime >=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThan(Date value) {
            addCriterion("tradeTime <", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThanOrEqualTo(Date value) {
            addCriterion("tradeTime <=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeIn(List<Date> values) {
            addCriterion("tradeTime in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotIn(List<Date> values) {
            addCriterion("tradeTime not in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeBetween(Date value1, Date value2) {
            addCriterion("tradeTime between", value1, value2, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotBetween(Date value1, Date value2) {
            addCriterion("tradeTime not between", value1, value2, "tradetime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdIsNull() {
            addCriterion("bankinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdIsNotNull() {
            addCriterion("bankinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdEqualTo(Long value) {
            addCriterion("bankinfo_id =", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdNotEqualTo(Long value) {
            addCriterion("bankinfo_id <>", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdGreaterThan(Long value) {
            addCriterion("bankinfo_id >", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bankinfo_id >=", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdLessThan(Long value) {
            addCriterion("bankinfo_id <", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdLessThanOrEqualTo(Long value) {
            addCriterion("bankinfo_id <=", value, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdIn(List<Long> values) {
            addCriterion("bankinfo_id in", values, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdNotIn(List<Long> values) {
            addCriterion("bankinfo_id not in", values, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdBetween(Long value1, Long value2) {
            addCriterion("bankinfo_id between", value1, value2, "bankinfoId");
            return (Criteria) this;
        }

        public Criteria andBankinfoIdNotBetween(Long value1, Long value2) {
            addCriterion("bankinfo_id not between", value1, value2, "bankinfoId");
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