package com.demo.p2p.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SystemdictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemdictionaryExample() {
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

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
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