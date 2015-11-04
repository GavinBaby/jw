package com.jw.magicbpm.model.personalaffairs;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_Person_ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_Person_ActivityExample() {
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

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT not between", value1, value2, "sort");
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

        public Criteria andSundayIsNull() {
            addCriterion("SUNDAY is null");
            return (Criteria) this;
        }

        public Criteria andSundayIsNotNull() {
            addCriterion("SUNDAY is not null");
            return (Criteria) this;
        }

        public Criteria andSundayEqualTo(String value) {
            addCriterion("SUNDAY =", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotEqualTo(String value) {
            addCriterion("SUNDAY <>", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThan(String value) {
            addCriterion("SUNDAY >", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThanOrEqualTo(String value) {
            addCriterion("SUNDAY >=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThan(String value) {
            addCriterion("SUNDAY <", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThanOrEqualTo(String value) {
            addCriterion("SUNDAY <=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLike(String value) {
            addCriterion("SUNDAY like", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotLike(String value) {
            addCriterion("SUNDAY not like", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayIn(List<String> values) {
            addCriterion("SUNDAY in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotIn(List<String> values) {
            addCriterion("SUNDAY not in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayBetween(String value1, String value2) {
            addCriterion("SUNDAY between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotBetween(String value1, String value2) {
            addCriterion("SUNDAY not between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andMondayIsNull() {
            addCriterion("MONDAY is null");
            return (Criteria) this;
        }

        public Criteria andMondayIsNotNull() {
            addCriterion("MONDAY is not null");
            return (Criteria) this;
        }

        public Criteria andMondayEqualTo(String value) {
            addCriterion("MONDAY =", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotEqualTo(String value) {
            addCriterion("MONDAY <>", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThan(String value) {
            addCriterion("MONDAY >", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThanOrEqualTo(String value) {
            addCriterion("MONDAY >=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThan(String value) {
            addCriterion("MONDAY <", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThanOrEqualTo(String value) {
            addCriterion("MONDAY <=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLike(String value) {
            addCriterion("MONDAY like", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotLike(String value) {
            addCriterion("MONDAY not like", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayIn(List<String> values) {
            addCriterion("MONDAY in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotIn(List<String> values) {
            addCriterion("MONDAY not in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayBetween(String value1, String value2) {
            addCriterion("MONDAY between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotBetween(String value1, String value2) {
            addCriterion("MONDAY not between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNull() {
            addCriterion("TUESDAY is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNotNull() {
            addCriterion("TUESDAY is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEqualTo(String value) {
            addCriterion("TUESDAY =", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotEqualTo(String value) {
            addCriterion("TUESDAY <>", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThan(String value) {
            addCriterion("TUESDAY >", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThanOrEqualTo(String value) {
            addCriterion("TUESDAY >=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThan(String value) {
            addCriterion("TUESDAY <", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThanOrEqualTo(String value) {
            addCriterion("TUESDAY <=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLike(String value) {
            addCriterion("TUESDAY like", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotLike(String value) {
            addCriterion("TUESDAY not like", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIn(List<String> values) {
            addCriterion("TUESDAY in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotIn(List<String> values) {
            addCriterion("TUESDAY not in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayBetween(String value1, String value2) {
            addCriterion("TUESDAY between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotBetween(String value1, String value2) {
            addCriterion("TUESDAY not between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNull() {
            addCriterion("WEDNESDAY is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNotNull() {
            addCriterion("WEDNESDAY is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEqualTo(String value) {
            addCriterion("WEDNESDAY =", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotEqualTo(String value) {
            addCriterion("WEDNESDAY <>", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThan(String value) {
            addCriterion("WEDNESDAY >", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThanOrEqualTo(String value) {
            addCriterion("WEDNESDAY >=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThan(String value) {
            addCriterion("WEDNESDAY <", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThanOrEqualTo(String value) {
            addCriterion("WEDNESDAY <=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLike(String value) {
            addCriterion("WEDNESDAY like", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotLike(String value) {
            addCriterion("WEDNESDAY not like", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIn(List<String> values) {
            addCriterion("WEDNESDAY in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotIn(List<String> values) {
            addCriterion("WEDNESDAY not in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayBetween(String value1, String value2) {
            addCriterion("WEDNESDAY between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotBetween(String value1, String value2) {
            addCriterion("WEDNESDAY not between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNull() {
            addCriterion("THURSDAY is null");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNotNull() {
            addCriterion("THURSDAY is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayEqualTo(String value) {
            addCriterion("THURSDAY =", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotEqualTo(String value) {
            addCriterion("THURSDAY <>", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThan(String value) {
            addCriterion("THURSDAY >", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThanOrEqualTo(String value) {
            addCriterion("THURSDAY >=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThan(String value) {
            addCriterion("THURSDAY <", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThanOrEqualTo(String value) {
            addCriterion("THURSDAY <=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLike(String value) {
            addCriterion("THURSDAY like", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotLike(String value) {
            addCriterion("THURSDAY not like", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayIn(List<String> values) {
            addCriterion("THURSDAY in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotIn(List<String> values) {
            addCriterion("THURSDAY not in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayBetween(String value1, String value2) {
            addCriterion("THURSDAY between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotBetween(String value1, String value2) {
            addCriterion("THURSDAY not between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andFridayIsNull() {
            addCriterion("FRIDAY is null");
            return (Criteria) this;
        }

        public Criteria andFridayIsNotNull() {
            addCriterion("FRIDAY is not null");
            return (Criteria) this;
        }

        public Criteria andFridayEqualTo(String value) {
            addCriterion("FRIDAY =", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotEqualTo(String value) {
            addCriterion("FRIDAY <>", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThan(String value) {
            addCriterion("FRIDAY >", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThanOrEqualTo(String value) {
            addCriterion("FRIDAY >=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThan(String value) {
            addCriterion("FRIDAY <", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThanOrEqualTo(String value) {
            addCriterion("FRIDAY <=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLike(String value) {
            addCriterion("FRIDAY like", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotLike(String value) {
            addCriterion("FRIDAY not like", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayIn(List<String> values) {
            addCriterion("FRIDAY in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotIn(List<String> values) {
            addCriterion("FRIDAY not in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayBetween(String value1, String value2) {
            addCriterion("FRIDAY between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotBetween(String value1, String value2) {
            addCriterion("FRIDAY not between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNull() {
            addCriterion("SATURDAY is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNotNull() {
            addCriterion("SATURDAY is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEqualTo(String value) {
            addCriterion("SATURDAY =", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotEqualTo(String value) {
            addCriterion("SATURDAY <>", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThan(String value) {
            addCriterion("SATURDAY >", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThanOrEqualTo(String value) {
            addCriterion("SATURDAY >=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThan(String value) {
            addCriterion("SATURDAY <", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThanOrEqualTo(String value) {
            addCriterion("SATURDAY <=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLike(String value) {
            addCriterion("SATURDAY like", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotLike(String value) {
            addCriterion("SATURDAY not like", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIn(List<String> values) {
            addCriterion("SATURDAY in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotIn(List<String> values) {
            addCriterion("SATURDAY not in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayBetween(String value1, String value2) {
            addCriterion("SATURDAY between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotBetween(String value1, String value2) {
            addCriterion("SATURDAY not between", value1, value2, "saturday");
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