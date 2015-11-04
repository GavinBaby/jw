package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_V_Sys_ManagementleaderGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Sys_ManagementleaderGroupExample() {
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

        public Criteria andSystemUserIdIsNull() {
            addCriterion("SYSTEM_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdIsNotNull() {
            addCriterion("SYSTEM_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdEqualTo(String value) {
            addCriterion("SYSTEM_USER_ID =", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdNotEqualTo(String value) {
            addCriterion("SYSTEM_USER_ID <>", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdGreaterThan(String value) {
            addCriterion("SYSTEM_USER_ID >", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_USER_ID >=", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdLessThan(String value) {
            addCriterion("SYSTEM_USER_ID <", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_USER_ID <=", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdLike(String value) {
            addCriterion("SYSTEM_USER_ID like", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdNotLike(String value) {
            addCriterion("SYSTEM_USER_ID not like", value, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdIn(List<String> values) {
            addCriterion("SYSTEM_USER_ID in", values, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdNotIn(List<String> values) {
            addCriterion("SYSTEM_USER_ID not in", values, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_USER_ID between", value1, value2, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andSystemUserIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_USER_ID not between", value1, value2, "systemUserId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDepidsIsNull() {
            addCriterion("DEPIDS is null");
            return (Criteria) this;
        }

        public Criteria andDepidsIsNotNull() {
            addCriterion("DEPIDS is not null");
            return (Criteria) this;
        }

        public Criteria andDepidsEqualTo(String value) {
            addCriterion("DEPIDS =", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsNotEqualTo(String value) {
            addCriterion("DEPIDS <>", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsGreaterThan(String value) {
            addCriterion("DEPIDS >", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsGreaterThanOrEqualTo(String value) {
            addCriterion("DEPIDS >=", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsLessThan(String value) {
            addCriterion("DEPIDS <", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsLessThanOrEqualTo(String value) {
            addCriterion("DEPIDS <=", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsLike(String value) {
            addCriterion("DEPIDS like", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsNotLike(String value) {
            addCriterion("DEPIDS not like", value, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsIn(List<String> values) {
            addCriterion("DEPIDS in", values, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsNotIn(List<String> values) {
            addCriterion("DEPIDS not in", values, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsBetween(String value1, String value2) {
            addCriterion("DEPIDS between", value1, value2, "depids");
            return (Criteria) this;
        }

        public Criteria andDepidsNotBetween(String value1, String value2) {
            addCriterion("DEPIDS not between", value1, value2, "depids");
            return (Criteria) this;
        }

        public Criteria andDepnamesIsNull() {
            addCriterion("DEPNAMES is null");
            return (Criteria) this;
        }

        public Criteria andDepnamesIsNotNull() {
            addCriterion("DEPNAMES is not null");
            return (Criteria) this;
        }

        public Criteria andDepnamesEqualTo(String value) {
            addCriterion("DEPNAMES =", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesNotEqualTo(String value) {
            addCriterion("DEPNAMES <>", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesGreaterThan(String value) {
            addCriterion("DEPNAMES >", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesGreaterThanOrEqualTo(String value) {
            addCriterion("DEPNAMES >=", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesLessThan(String value) {
            addCriterion("DEPNAMES <", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesLessThanOrEqualTo(String value) {
            addCriterion("DEPNAMES <=", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesLike(String value) {
            addCriterion("DEPNAMES like", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesNotLike(String value) {
            addCriterion("DEPNAMES not like", value, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesIn(List<String> values) {
            addCriterion("DEPNAMES in", values, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesNotIn(List<String> values) {
            addCriterion("DEPNAMES not in", values, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesBetween(String value1, String value2) {
            addCriterion("DEPNAMES between", value1, value2, "depnames");
            return (Criteria) this;
        }

        public Criteria andDepnamesNotBetween(String value1, String value2) {
            addCriterion("DEPNAMES not between", value1, value2, "depnames");
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