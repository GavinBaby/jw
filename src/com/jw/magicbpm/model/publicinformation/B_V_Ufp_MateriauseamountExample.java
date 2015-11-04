package com.jw.magicbpm.model.publicinformation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_MateriauseamountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_MateriauseamountExample() {
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

        public Criteria setLimitValue(int value1, int value2) {
            if (value2==0 )
              throw new RuntimeException("value2 is 0");
            addCriterion("limit",value1,value2,"null");
            return (Criteria) this;
        }

        public Criteria getLimitValue() {
            return (Criteria)criteria;
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyIsNull() {
            addCriterion("UPFREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyIsNotNull() {
            addCriterion("UPFREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyEqualTo(BigDecimal value) {
            addCriterion("UPFREQUENCY =", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyNotEqualTo(BigDecimal value) {
            addCriterion("UPFREQUENCY <>", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyGreaterThan(BigDecimal value) {
            addCriterion("UPFREQUENCY >", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPFREQUENCY >=", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyLessThan(BigDecimal value) {
            addCriterion("UPFREQUENCY <", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPFREQUENCY <=", value, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyIn(List<BigDecimal> values) {
            addCriterion("UPFREQUENCY in", values, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyNotIn(List<BigDecimal> values) {
            addCriterion("UPFREQUENCY not in", values, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPFREQUENCY between", value1, value2, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andUpfrequencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPFREQUENCY not between", value1, value2, "upfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyIsNull() {
            addCriterion("DOWNFREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyIsNotNull() {
            addCriterion("DOWNFREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyEqualTo(BigDecimal value) {
            addCriterion("DOWNFREQUENCY =", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyNotEqualTo(BigDecimal value) {
            addCriterion("DOWNFREQUENCY <>", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyGreaterThan(BigDecimal value) {
            addCriterion("DOWNFREQUENCY >", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNFREQUENCY >=", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyLessThan(BigDecimal value) {
            addCriterion("DOWNFREQUENCY <", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOWNFREQUENCY <=", value, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyIn(List<BigDecimal> values) {
            addCriterion("DOWNFREQUENCY in", values, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyNotIn(List<BigDecimal> values) {
            addCriterion("DOWNFREQUENCY not in", values, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNFREQUENCY between", value1, value2, "downfrequency");
            return (Criteria) this;
        }

        public Criteria andDownfrequencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOWNFREQUENCY not between", value1, value2, "downfrequency");
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

        private boolean limitValue;

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

        public boolean isLimitValue() {
            return limitValue;
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
            if("limit".equals(condition))
              this.limitValue = true;
            else
              this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}