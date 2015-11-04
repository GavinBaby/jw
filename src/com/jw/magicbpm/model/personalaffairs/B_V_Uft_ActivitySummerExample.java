package com.jw.magicbpm.model.personalaffairs;

import java.util.ArrayList;
import java.util.List;

public class B_V_Uft_ActivitySummerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Uft_ActivitySummerExample() {
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

        public Criteria andStartofweekIsNull() {
            addCriterion("STARTOFWEEK is null");
            return (Criteria) this;
        }

        public Criteria andStartofweekIsNotNull() {
            addCriterion("STARTOFWEEK is not null");
            return (Criteria) this;
        }

        public Criteria andStartofweekEqualTo(String value) {
            addCriterion("STARTOFWEEK =", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekNotEqualTo(String value) {
            addCriterion("STARTOFWEEK <>", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekGreaterThan(String value) {
            addCriterion("STARTOFWEEK >", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekGreaterThanOrEqualTo(String value) {
            addCriterion("STARTOFWEEK >=", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekLessThan(String value) {
            addCriterion("STARTOFWEEK <", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekLessThanOrEqualTo(String value) {
            addCriterion("STARTOFWEEK <=", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekLike(String value) {
            addCriterion("STARTOFWEEK like", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekNotLike(String value) {
            addCriterion("STARTOFWEEK not like", value, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekIn(List<String> values) {
            addCriterion("STARTOFWEEK in", values, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekNotIn(List<String> values) {
            addCriterion("STARTOFWEEK not in", values, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekBetween(String value1, String value2) {
            addCriterion("STARTOFWEEK between", value1, value2, "startofweek");
            return (Criteria) this;
        }

        public Criteria andStartofweekNotBetween(String value1, String value2) {
            addCriterion("STARTOFWEEK not between", value1, value2, "startofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekIsNull() {
            addCriterion("ENDOFWEEK is null");
            return (Criteria) this;
        }

        public Criteria andEndofweekIsNotNull() {
            addCriterion("ENDOFWEEK is not null");
            return (Criteria) this;
        }

        public Criteria andEndofweekEqualTo(String value) {
            addCriterion("ENDOFWEEK =", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekNotEqualTo(String value) {
            addCriterion("ENDOFWEEK <>", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekGreaterThan(String value) {
            addCriterion("ENDOFWEEK >", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekGreaterThanOrEqualTo(String value) {
            addCriterion("ENDOFWEEK >=", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekLessThan(String value) {
            addCriterion("ENDOFWEEK <", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekLessThanOrEqualTo(String value) {
            addCriterion("ENDOFWEEK <=", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekLike(String value) {
            addCriterion("ENDOFWEEK like", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekNotLike(String value) {
            addCriterion("ENDOFWEEK not like", value, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekIn(List<String> values) {
            addCriterion("ENDOFWEEK in", values, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekNotIn(List<String> values) {
            addCriterion("ENDOFWEEK not in", values, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekBetween(String value1, String value2) {
            addCriterion("ENDOFWEEK between", value1, value2, "endofweek");
            return (Criteria) this;
        }

        public Criteria andEndofweekNotBetween(String value1, String value2) {
            addCriterion("ENDOFWEEK not between", value1, value2, "endofweek");
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