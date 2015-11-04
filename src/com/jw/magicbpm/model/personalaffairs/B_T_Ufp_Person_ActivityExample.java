package com.jw.magicbpm.model.personalaffairs;

import java.util.ArrayList;
import java.util.List;

public class B_T_Ufp_Person_ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Ufp_Person_ActivityExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPlannigIsNull() {
            addCriterion("PLANNIG is null");
            return (Criteria) this;
        }

        public Criteria andPlannigIsNotNull() {
            addCriterion("PLANNIG is not null");
            return (Criteria) this;
        }

        public Criteria andPlannigEqualTo(String value) {
            addCriterion("PLANNIG =", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigNotEqualTo(String value) {
            addCriterion("PLANNIG <>", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigGreaterThan(String value) {
            addCriterion("PLANNIG >", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigGreaterThanOrEqualTo(String value) {
            addCriterion("PLANNIG >=", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigLessThan(String value) {
            addCriterion("PLANNIG <", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigLessThanOrEqualTo(String value) {
            addCriterion("PLANNIG <=", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigLike(String value) {
            addCriterion("PLANNIG like", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigNotLike(String value) {
            addCriterion("PLANNIG not like", value, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigIn(List<String> values) {
            addCriterion("PLANNIG in", values, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigNotIn(List<String> values) {
            addCriterion("PLANNIG not in", values, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigBetween(String value1, String value2) {
            addCriterion("PLANNIG between", value1, value2, "plannig");
            return (Criteria) this;
        }

        public Criteria andPlannigNotBetween(String value1, String value2) {
            addCriterion("PLANNIG not between", value1, value2, "plannig");
            return (Criteria) this;
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

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andAlldayIsNull() {
            addCriterion("ALLDAY is null");
            return (Criteria) this;
        }

        public Criteria andAlldayIsNotNull() {
            addCriterion("ALLDAY is not null");
            return (Criteria) this;
        }

        public Criteria andAlldayEqualTo(String value) {
            addCriterion("ALLDAY =", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotEqualTo(String value) {
            addCriterion("ALLDAY <>", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayGreaterThan(String value) {
            addCriterion("ALLDAY >", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayGreaterThanOrEqualTo(String value) {
            addCriterion("ALLDAY >=", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLessThan(String value) {
            addCriterion("ALLDAY <", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLessThanOrEqualTo(String value) {
            addCriterion("ALLDAY <=", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLike(String value) {
            addCriterion("ALLDAY like", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotLike(String value) {
            addCriterion("ALLDAY not like", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayIn(List<String> values) {
            addCriterion("ALLDAY in", values, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotIn(List<String> values) {
            addCriterion("ALLDAY not in", values, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayBetween(String value1, String value2) {
            addCriterion("ALLDAY between", value1, value2, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotBetween(String value1, String value2) {
            addCriterion("ALLDAY not between", value1, value2, "allday");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("YEARS is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("YEARS =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("YEARS <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("YEARS >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("YEARS >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("YEARS <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("YEARS <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("YEARS like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("YEARS not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("YEARS in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("YEARS not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("YEARS between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("YEARS not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNull() {
            addCriterion("WEEKOFYEAR is null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIsNotNull() {
            addCriterion("WEEKOFYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andWeekofyearEqualTo(String value) {
            addCriterion("WEEKOFYEAR =", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotEqualTo(String value) {
            addCriterion("WEEKOFYEAR <>", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThan(String value) {
            addCriterion("WEEKOFYEAR >", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearGreaterThanOrEqualTo(String value) {
            addCriterion("WEEKOFYEAR >=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThan(String value) {
            addCriterion("WEEKOFYEAR <", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLessThanOrEqualTo(String value) {
            addCriterion("WEEKOFYEAR <=", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearLike(String value) {
            addCriterion("WEEKOFYEAR like", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotLike(String value) {
            addCriterion("WEEKOFYEAR not like", value, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearIn(List<String> values) {
            addCriterion("WEEKOFYEAR in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotIn(List<String> values) {
            addCriterion("WEEKOFYEAR not in", values, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearBetween(String value1, String value2) {
            addCriterion("WEEKOFYEAR between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andWeekofyearNotBetween(String value1, String value2) {
            addCriterion("WEEKOFYEAR not between", value1, value2, "weekofyear");
            return (Criteria) this;
        }

        public Criteria andDayofweekIsNull() {
            addCriterion("DAYOFWEEK is null");
            return (Criteria) this;
        }

        public Criteria andDayofweekIsNotNull() {
            addCriterion("DAYOFWEEK is not null");
            return (Criteria) this;
        }

        public Criteria andDayofweekEqualTo(String value) {
            addCriterion("DAYOFWEEK =", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotEqualTo(String value) {
            addCriterion("DAYOFWEEK <>", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekGreaterThan(String value) {
            addCriterion("DAYOFWEEK >", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekGreaterThanOrEqualTo(String value) {
            addCriterion("DAYOFWEEK >=", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekLessThan(String value) {
            addCriterion("DAYOFWEEK <", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekLessThanOrEqualTo(String value) {
            addCriterion("DAYOFWEEK <=", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekLike(String value) {
            addCriterion("DAYOFWEEK like", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotLike(String value) {
            addCriterion("DAYOFWEEK not like", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekIn(List<String> values) {
            addCriterion("DAYOFWEEK in", values, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotIn(List<String> values) {
            addCriterion("DAYOFWEEK not in", values, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekBetween(String value1, String value2) {
            addCriterion("DAYOFWEEK between", value1, value2, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotBetween(String value1, String value2) {
            addCriterion("DAYOFWEEK not between", value1, value2, "dayofweek");
            return (Criteria) this;
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andClassname1IsNull() {
            addCriterion("CLASSNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andClassname1IsNotNull() {
            addCriterion("CLASSNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andClassname1EqualTo(String value) {
            addCriterion("CLASSNAME1 =", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1NotEqualTo(String value) {
            addCriterion("CLASSNAME1 <>", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1GreaterThan(String value) {
            addCriterion("CLASSNAME1 >", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1GreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAME1 >=", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1LessThan(String value) {
            addCriterion("CLASSNAME1 <", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1LessThanOrEqualTo(String value) {
            addCriterion("CLASSNAME1 <=", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1Like(String value) {
            addCriterion("CLASSNAME1 like", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1NotLike(String value) {
            addCriterion("CLASSNAME1 not like", value, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1In(List<String> values) {
            addCriterion("CLASSNAME1 in", values, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1NotIn(List<String> values) {
            addCriterion("CLASSNAME1 not in", values, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1Between(String value1, String value2) {
            addCriterion("CLASSNAME1 between", value1, value2, "classname1");
            return (Criteria) this;
        }

        public Criteria andClassname1NotBetween(String value1, String value2) {
            addCriterion("CLASSNAME1 not between", value1, value2, "classname1");
            return (Criteria) this;
        }

        public Criteria andEditableIsNull() {
            addCriterion("EDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andEditableIsNotNull() {
            addCriterion("EDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEditableEqualTo(String value) {
            addCriterion("EDITABLE =", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotEqualTo(String value) {
            addCriterion("EDITABLE <>", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThan(String value) {
            addCriterion("EDITABLE >", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThanOrEqualTo(String value) {
            addCriterion("EDITABLE >=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThan(String value) {
            addCriterion("EDITABLE <", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThanOrEqualTo(String value) {
            addCriterion("EDITABLE <=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLike(String value) {
            addCriterion("EDITABLE like", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotLike(String value) {
            addCriterion("EDITABLE not like", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableIn(List<String> values) {
            addCriterion("EDITABLE in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotIn(List<String> values) {
            addCriterion("EDITABLE not in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableBetween(String value1, String value2) {
            addCriterion("EDITABLE between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotBetween(String value1, String value2) {
            addCriterion("EDITABLE not between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNull() {
            addCriterion("BACKGROUNDCOLOR is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNotNull() {
            addCriterion("BACKGROUNDCOLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorEqualTo(String value) {
            addCriterion("BACKGROUNDCOLOR =", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotEqualTo(String value) {
            addCriterion("BACKGROUNDCOLOR <>", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThan(String value) {
            addCriterion("BACKGROUNDCOLOR >", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThanOrEqualTo(String value) {
            addCriterion("BACKGROUNDCOLOR >=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThan(String value) {
            addCriterion("BACKGROUNDCOLOR <", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThanOrEqualTo(String value) {
            addCriterion("BACKGROUNDCOLOR <=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLike(String value) {
            addCriterion("BACKGROUNDCOLOR like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotLike(String value) {
            addCriterion("BACKGROUNDCOLOR not like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIn(List<String> values) {
            addCriterion("BACKGROUNDCOLOR in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotIn(List<String> values) {
            addCriterion("BACKGROUNDCOLOR not in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorBetween(String value1, String value2) {
            addCriterion("BACKGROUNDCOLOR between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotBetween(String value1, String value2) {
            addCriterion("BACKGROUNDCOLOR not between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorIsNull() {
            addCriterion("BORDERCOLOR is null");
            return (Criteria) this;
        }

        public Criteria andBordercolorIsNotNull() {
            addCriterion("BORDERCOLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBordercolorEqualTo(String value) {
            addCriterion("BORDERCOLOR =", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotEqualTo(String value) {
            addCriterion("BORDERCOLOR <>", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorGreaterThan(String value) {
            addCriterion("BORDERCOLOR >", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorGreaterThanOrEqualTo(String value) {
            addCriterion("BORDERCOLOR >=", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLessThan(String value) {
            addCriterion("BORDERCOLOR <", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLessThanOrEqualTo(String value) {
            addCriterion("BORDERCOLOR <=", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLike(String value) {
            addCriterion("BORDERCOLOR like", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotLike(String value) {
            addCriterion("BORDERCOLOR not like", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorIn(List<String> values) {
            addCriterion("BORDERCOLOR in", values, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotIn(List<String> values) {
            addCriterion("BORDERCOLOR not in", values, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorBetween(String value1, String value2) {
            addCriterion("BORDERCOLOR between", value1, value2, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotBetween(String value1, String value2) {
            addCriterion("BORDERCOLOR not between", value1, value2, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorIsNull() {
            addCriterion("TEXTCOLOR is null");
            return (Criteria) this;
        }

        public Criteria andTextcolorIsNotNull() {
            addCriterion("TEXTCOLOR is not null");
            return (Criteria) this;
        }

        public Criteria andTextcolorEqualTo(String value) {
            addCriterion("TEXTCOLOR =", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotEqualTo(String value) {
            addCriterion("TEXTCOLOR <>", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorGreaterThan(String value) {
            addCriterion("TEXTCOLOR >", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTCOLOR >=", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLessThan(String value) {
            addCriterion("TEXTCOLOR <", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLessThanOrEqualTo(String value) {
            addCriterion("TEXTCOLOR <=", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLike(String value) {
            addCriterion("TEXTCOLOR like", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotLike(String value) {
            addCriterion("TEXTCOLOR not like", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorIn(List<String> values) {
            addCriterion("TEXTCOLOR in", values, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotIn(List<String> values) {
            addCriterion("TEXTCOLOR not in", values, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorBetween(String value1, String value2) {
            addCriterion("TEXTCOLOR between", value1, value2, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotBetween(String value1, String value2) {
            addCriterion("TEXTCOLOR not between", value1, value2, "textcolor");
            return (Criteria) this;
        }

        public Criteria andExpandXmlIsNull() {
            addCriterion("EXPAND_XML is null");
            return (Criteria) this;
        }

        public Criteria andExpandXmlIsNotNull() {
            addCriterion("EXPAND_XML is not null");
            return (Criteria) this;
        }

        public Criteria andExpandXmlEqualTo(String value) {
            addCriterion("EXPAND_XML =", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlNotEqualTo(String value) {
            addCriterion("EXPAND_XML <>", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlGreaterThan(String value) {
            addCriterion("EXPAND_XML >", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlGreaterThanOrEqualTo(String value) {
            addCriterion("EXPAND_XML >=", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlLessThan(String value) {
            addCriterion("EXPAND_XML <", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlLessThanOrEqualTo(String value) {
            addCriterion("EXPAND_XML <=", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlLike(String value) {
            addCriterion("EXPAND_XML like", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlNotLike(String value) {
            addCriterion("EXPAND_XML not like", value, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlIn(List<String> values) {
            addCriterion("EXPAND_XML in", values, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlNotIn(List<String> values) {
            addCriterion("EXPAND_XML not in", values, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlBetween(String value1, String value2) {
            addCriterion("EXPAND_XML between", value1, value2, "expandXml");
            return (Criteria) this;
        }

        public Criteria andExpandXmlNotBetween(String value1, String value2) {
            addCriterion("EXPAND_XML not between", value1, value2, "expandXml");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("UNITID is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("UNITID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("UNITID =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("UNITID <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("UNITID >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("UNITID >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("UNITID <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("UNITID <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("UNITID like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("UNITID not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("UNITID in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("UNITID not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("UNITID between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("UNITID not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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