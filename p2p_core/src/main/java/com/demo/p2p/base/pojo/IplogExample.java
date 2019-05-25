package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IplogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IplogExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andLoginstateIsNull() {
            addCriterion("loginState is null");
            return (Criteria) this;
        }

        public Criteria andLoginstateIsNotNull() {
            addCriterion("loginState is not null");
            return (Criteria) this;
        }

        public Criteria andLoginstateEqualTo(Byte value) {
            addCriterion("loginState =", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateNotEqualTo(Byte value) {
            addCriterion("loginState <>", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateGreaterThan(Byte value) {
            addCriterion("loginState >", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("loginState >=", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateLessThan(Byte value) {
            addCriterion("loginState <", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateLessThanOrEqualTo(Byte value) {
            addCriterion("loginState <=", value, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateIn(List<Byte> values) {
            addCriterion("loginState in", values, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateNotIn(List<Byte> values) {
            addCriterion("loginState not in", values, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateBetween(Byte value1, Byte value2) {
            addCriterion("loginState between", value1, value2, "loginstate");
            return (Criteria) this;
        }

        public Criteria andLoginstateNotBetween(Byte value1, Byte value2) {
            addCriterion("loginState not between", value1, value2, "loginstate");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andLogininfoidIsNull() {
            addCriterion("loginInfoId is null");
            return (Criteria) this;
        }

        public Criteria andLogininfoidIsNotNull() {
            addCriterion("loginInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andLogininfoidEqualTo(Long value) {
            addCriterion("loginInfoId =", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidNotEqualTo(Long value) {
            addCriterion("loginInfoId <>", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidGreaterThan(Long value) {
            addCriterion("loginInfoId >", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("loginInfoId >=", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidLessThan(Long value) {
            addCriterion("loginInfoId <", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidLessThanOrEqualTo(Long value) {
            addCriterion("loginInfoId <=", value, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidIn(List<Long> values) {
            addCriterion("loginInfoId in", values, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidNotIn(List<Long> values) {
            addCriterion("loginInfoId not in", values, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidBetween(Long value1, Long value2) {
            addCriterion("loginInfoId between", value1, value2, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogininfoidNotBetween(Long value1, Long value2) {
            addCriterion("loginInfoId not between", value1, value2, "logininfoid");
            return (Criteria) this;
        }

        public Criteria andLogintypeIsNull() {
            addCriterion("loginType is null");
            return (Criteria) this;
        }

        public Criteria andLogintypeIsNotNull() {
            addCriterion("loginType is not null");
            return (Criteria) this;
        }

        public Criteria andLogintypeEqualTo(Byte value) {
            addCriterion("loginType =", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotEqualTo(Byte value) {
            addCriterion("loginType <>", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeGreaterThan(Byte value) {
            addCriterion("loginType >", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("loginType >=", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeLessThan(Byte value) {
            addCriterion("loginType <", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeLessThanOrEqualTo(Byte value) {
            addCriterion("loginType <=", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeIn(List<Byte> values) {
            addCriterion("loginType in", values, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotIn(List<Byte> values) {
            addCriterion("loginType not in", values, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeBetween(Byte value1, Byte value2) {
            addCriterion("loginType between", value1, value2, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotBetween(Byte value1, Byte value2) {
            addCriterion("loginType not between", value1, value2, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
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