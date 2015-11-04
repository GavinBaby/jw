package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_System_InforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_System_InforExample() {
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

        public Criteria andSystemNameIsNull() {
            addCriterion("SYSTEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("SYSTEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("SYSTEM_NAME =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("SYSTEM_NAME <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("SYSTEM_NAME >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("SYSTEM_NAME <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("SYSTEM_NAME like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("SYSTEM_NAME not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("SYSTEM_NAME in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("SYSTEM_NAME not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME not between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNull() {
            addCriterion("SYSTEM_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNotNull() {
            addCriterion("SYSTEM_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionEqualTo(String value) {
            addCriterion("SYSTEM_VERSION =", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotEqualTo(String value) {
            addCriterion("SYSTEM_VERSION <>", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThan(String value) {
            addCriterion("SYSTEM_VERSION >", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_VERSION >=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThan(String value) {
            addCriterion("SYSTEM_VERSION <", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_VERSION <=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLike(String value) {
            addCriterion("SYSTEM_VERSION like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotLike(String value) {
            addCriterion("SYSTEM_VERSION not like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIn(List<String> values) {
            addCriterion("SYSTEM_VERSION in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotIn(List<String> values) {
            addCriterion("SYSTEM_VERSION not in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionBetween(String value1, String value2) {
            addCriterion("SYSTEM_VERSION between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_VERSION not between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightIsNull() {
            addCriterion("SYSTEM_COPYRIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightIsNotNull() {
            addCriterion("SYSTEM_COPYRIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightEqualTo(String value) {
            addCriterion("SYSTEM_COPYRIGHT =", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightNotEqualTo(String value) {
            addCriterion("SYSTEM_COPYRIGHT <>", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightGreaterThan(String value) {
            addCriterion("SYSTEM_COPYRIGHT >", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_COPYRIGHT >=", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightLessThan(String value) {
            addCriterion("SYSTEM_COPYRIGHT <", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_COPYRIGHT <=", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightLike(String value) {
            addCriterion("SYSTEM_COPYRIGHT like", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightNotLike(String value) {
            addCriterion("SYSTEM_COPYRIGHT not like", value, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightIn(List<String> values) {
            addCriterion("SYSTEM_COPYRIGHT in", values, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightNotIn(List<String> values) {
            addCriterion("SYSTEM_COPYRIGHT not in", values, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightBetween(String value1, String value2) {
            addCriterion("SYSTEM_COPYRIGHT between", value1, value2, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andSystemCopyrightNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_COPYRIGHT not between", value1, value2, "systemCopyright");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionIsNull() {
            addCriterion("DATEBASE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionIsNotNull() {
            addCriterion("DATEBASE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionEqualTo(Integer value) {
            addCriterion("DATEBASE_VERSION =", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionNotEqualTo(Integer value) {
            addCriterion("DATEBASE_VERSION <>", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionGreaterThan(Integer value) {
            addCriterion("DATEBASE_VERSION >", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATEBASE_VERSION >=", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionLessThan(Integer value) {
            addCriterion("DATEBASE_VERSION <", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionLessThanOrEqualTo(Integer value) {
            addCriterion("DATEBASE_VERSION <=", value, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionIn(List<Integer> values) {
            addCriterion("DATEBASE_VERSION in", values, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionNotIn(List<Integer> values) {
            addCriterion("DATEBASE_VERSION not in", values, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionBetween(Integer value1, Integer value2) {
            addCriterion("DATEBASE_VERSION between", value1, value2, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andDatebaseVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("DATEBASE_VERSION not between", value1, value2, "datebaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionIsNull() {
            addCriterion("RELEASE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionIsNotNull() {
            addCriterion("RELEASE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionEqualTo(Integer value) {
            addCriterion("RELEASE_VERSION =", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionNotEqualTo(Integer value) {
            addCriterion("RELEASE_VERSION <>", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionGreaterThan(Integer value) {
            addCriterion("RELEASE_VERSION >", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELEASE_VERSION >=", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionLessThan(Integer value) {
            addCriterion("RELEASE_VERSION <", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionLessThanOrEqualTo(Integer value) {
            addCriterion("RELEASE_VERSION <=", value, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionIn(List<Integer> values) {
            addCriterion("RELEASE_VERSION in", values, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionNotIn(List<Integer> values) {
            addCriterion("RELEASE_VERSION not in", values, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionBetween(Integer value1, Integer value2) {
            addCriterion("RELEASE_VERSION between", value1, value2, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andReleaseVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("RELEASE_VERSION not between", value1, value2, "releaseVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNull() {
            addCriterion("OS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNotNull() {
            addCriterion("OS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andOsVersionEqualTo(Integer value) {
            addCriterion("OS_VERSION =", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotEqualTo(Integer value) {
            addCriterion("OS_VERSION <>", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThan(Integer value) {
            addCriterion("OS_VERSION >", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("OS_VERSION >=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThan(Integer value) {
            addCriterion("OS_VERSION <", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThanOrEqualTo(Integer value) {
            addCriterion("OS_VERSION <=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionIn(List<Integer> values) {
            addCriterion("OS_VERSION in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotIn(List<Integer> values) {
            addCriterion("OS_VERSION not in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionBetween(Integer value1, Integer value2) {
            addCriterion("OS_VERSION between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("OS_VERSION not between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenIsNull() {
            addCriterion("CAN_LOCK_SCREEN is null");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenIsNotNull() {
            addCriterion("CAN_LOCK_SCREEN is not null");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenEqualTo(Integer value) {
            addCriterion("CAN_LOCK_SCREEN =", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenNotEqualTo(Integer value) {
            addCriterion("CAN_LOCK_SCREEN <>", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenGreaterThan(Integer value) {
            addCriterion("CAN_LOCK_SCREEN >", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_LOCK_SCREEN >=", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenLessThan(Integer value) {
            addCriterion("CAN_LOCK_SCREEN <", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_LOCK_SCREEN <=", value, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenIn(List<Integer> values) {
            addCriterion("CAN_LOCK_SCREEN in", values, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenNotIn(List<Integer> values) {
            addCriterion("CAN_LOCK_SCREEN not in", values, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenBetween(Integer value1, Integer value2) {
            addCriterion("CAN_LOCK_SCREEN between", value1, value2, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanLockScreenNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_LOCK_SCREEN not between", value1, value2, "canLockScreen");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserIsNull() {
            addCriterion("CAN_SINGLE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserIsNotNull() {
            addCriterion("CAN_SINGLE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserEqualTo(Integer value) {
            addCriterion("CAN_SINGLE_USER =", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserNotEqualTo(Integer value) {
            addCriterion("CAN_SINGLE_USER <>", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserGreaterThan(Integer value) {
            addCriterion("CAN_SINGLE_USER >", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_SINGLE_USER >=", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserLessThan(Integer value) {
            addCriterion("CAN_SINGLE_USER <", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_SINGLE_USER <=", value, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserIn(List<Integer> values) {
            addCriterion("CAN_SINGLE_USER in", values, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserNotIn(List<Integer> values) {
            addCriterion("CAN_SINGLE_USER not in", values, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserBetween(Integer value1, Integer value2) {
            addCriterion("CAN_SINGLE_USER between", value1, value2, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanSingleUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_SINGLE_USER not between", value1, value2, "canSingleUser");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdIsNull() {
            addCriterion("CAN_RETRIEVE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdIsNotNull() {
            addCriterion("CAN_RETRIEVE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdEqualTo(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD =", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdNotEqualTo(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD <>", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdGreaterThan(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD >", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD >=", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdLessThan(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD <", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_RETRIEVE_PWD <=", value, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdIn(List<Integer> values) {
            addCriterion("CAN_RETRIEVE_PWD in", values, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdNotIn(List<Integer> values) {
            addCriterion("CAN_RETRIEVE_PWD not in", values, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdBetween(Integer value1, Integer value2) {
            addCriterion("CAN_RETRIEVE_PWD between", value1, value2, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanRetrievePwdNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_RETRIEVE_PWD not between", value1, value2, "canRetrievePwd");
            return (Criteria) this;
        }

        public Criteria andCanLockUserIsNull() {
            addCriterion("CAN_LOCK_USER is null");
            return (Criteria) this;
        }

        public Criteria andCanLockUserIsNotNull() {
            addCriterion("CAN_LOCK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCanLockUserEqualTo(Integer value) {
            addCriterion("CAN_LOCK_USER =", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserNotEqualTo(Integer value) {
            addCriterion("CAN_LOCK_USER <>", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserGreaterThan(Integer value) {
            addCriterion("CAN_LOCK_USER >", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_LOCK_USER >=", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserLessThan(Integer value) {
            addCriterion("CAN_LOCK_USER <", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_LOCK_USER <=", value, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserIn(List<Integer> values) {
            addCriterion("CAN_LOCK_USER in", values, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserNotIn(List<Integer> values) {
            addCriterion("CAN_LOCK_USER not in", values, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserBetween(Integer value1, Integer value2) {
            addCriterion("CAN_LOCK_USER between", value1, value2, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanLockUserNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_LOCK_USER not between", value1, value2, "canLockUser");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitIsNull() {
            addCriterion("CAN_IP_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitIsNotNull() {
            addCriterion("CAN_IP_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitEqualTo(Integer value) {
            addCriterion("CAN_IP_LIMIT =", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitNotEqualTo(Integer value) {
            addCriterion("CAN_IP_LIMIT <>", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitGreaterThan(Integer value) {
            addCriterion("CAN_IP_LIMIT >", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_IP_LIMIT >=", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitLessThan(Integer value) {
            addCriterion("CAN_IP_LIMIT <", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_IP_LIMIT <=", value, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitIn(List<Integer> values) {
            addCriterion("CAN_IP_LIMIT in", values, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitNotIn(List<Integer> values) {
            addCriterion("CAN_IP_LIMIT not in", values, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitBetween(Integer value1, Integer value2) {
            addCriterion("CAN_IP_LIMIT between", value1, value2, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanIpLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_IP_LIMIT not between", value1, value2, "canIpLimit");
            return (Criteria) this;
        }

        public Criteria andCanCaIsNull() {
            addCriterion("CAN_CA is null");
            return (Criteria) this;
        }

        public Criteria andCanCaIsNotNull() {
            addCriterion("CAN_CA is not null");
            return (Criteria) this;
        }

        public Criteria andCanCaEqualTo(Integer value) {
            addCriterion("CAN_CA =", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaNotEqualTo(Integer value) {
            addCriterion("CAN_CA <>", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaGreaterThan(Integer value) {
            addCriterion("CAN_CA >", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_CA >=", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaLessThan(Integer value) {
            addCriterion("CAN_CA <", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_CA <=", value, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaIn(List<Integer> values) {
            addCriterion("CAN_CA in", values, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaNotIn(List<Integer> values) {
            addCriterion("CAN_CA not in", values, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaBetween(Integer value1, Integer value2) {
            addCriterion("CAN_CA between", value1, value2, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanCaNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_CA not between", value1, value2, "canCa");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeIsNull() {
            addCriterion("CAN_VERIFICATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeIsNotNull() {
            addCriterion("CAN_VERIFICATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeEqualTo(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE =", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeNotEqualTo(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE <>", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeGreaterThan(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE >", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE >=", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeLessThan(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE <", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_VERIFICATION_CODE <=", value, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeIn(List<Integer> values) {
            addCriterion("CAN_VERIFICATION_CODE in", values, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeNotIn(List<Integer> values) {
            addCriterion("CAN_VERIFICATION_CODE not in", values, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeBetween(Integer value1, Integer value2) {
            addCriterion("CAN_VERIFICATION_CODE between", value1, value2, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andCanVerificationCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_VERIFICATION_CODE not between", value1, value2, "canVerificationCode");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeIsNull() {
            addCriterion("SESSION_EXPIRATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeIsNotNull() {
            addCriterion("SESSION_EXPIRATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeEqualTo(String value) {
            addCriterion("SESSION_EXPIRATION_TIME =", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeNotEqualTo(String value) {
            addCriterion("SESSION_EXPIRATION_TIME <>", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeGreaterThan(String value) {
            addCriterion("SESSION_EXPIRATION_TIME >", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_EXPIRATION_TIME >=", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeLessThan(String value) {
            addCriterion("SESSION_EXPIRATION_TIME <", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeLessThanOrEqualTo(String value) {
            addCriterion("SESSION_EXPIRATION_TIME <=", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeLike(String value) {
            addCriterion("SESSION_EXPIRATION_TIME like", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeNotLike(String value) {
            addCriterion("SESSION_EXPIRATION_TIME not like", value, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeIn(List<String> values) {
            addCriterion("SESSION_EXPIRATION_TIME in", values, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeNotIn(List<String> values) {
            addCriterion("SESSION_EXPIRATION_TIME not in", values, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeBetween(String value1, String value2) {
            addCriterion("SESSION_EXPIRATION_TIME between", value1, value2, "sessionExpirationTime");
            return (Criteria) this;
        }

        public Criteria andSessionExpirationTimeNotBetween(String value1, String value2) {
            addCriterion("SESSION_EXPIRATION_TIME not between", value1, value2, "sessionExpirationTime");
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

        public Criteria andCanMemoryPwdIsNull() {
            addCriterion("CAN_MEMORY_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdIsNotNull() {
            addCriterion("CAN_MEMORY_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdEqualTo(Integer value) {
            addCriterion("CAN_MEMORY_PWD =", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdNotEqualTo(Integer value) {
            addCriterion("CAN_MEMORY_PWD <>", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdGreaterThan(Integer value) {
            addCriterion("CAN_MEMORY_PWD >", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAN_MEMORY_PWD >=", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdLessThan(Integer value) {
            addCriterion("CAN_MEMORY_PWD <", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdLessThanOrEqualTo(Integer value) {
            addCriterion("CAN_MEMORY_PWD <=", value, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdIn(List<Integer> values) {
            addCriterion("CAN_MEMORY_PWD in", values, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdNotIn(List<Integer> values) {
            addCriterion("CAN_MEMORY_PWD not in", values, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdBetween(Integer value1, Integer value2) {
            addCriterion("CAN_MEMORY_PWD between", value1, value2, "canMemoryPwd");
            return (Criteria) this;
        }

        public Criteria andCanMemoryPwdNotBetween(Integer value1, Integer value2) {
            addCriterion("CAN_MEMORY_PWD not between", value1, value2, "canMemoryPwd");
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