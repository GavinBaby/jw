package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_UserExample() {
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

        public Criteria andUserSysNameIsNull() {
            addCriterion("USER_SYS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserSysNameIsNotNull() {
            addCriterion("USER_SYS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserSysNameEqualTo(String value) {
            addCriterion("USER_SYS_NAME =", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameNotEqualTo(String value) {
            addCriterion("USER_SYS_NAME <>", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameGreaterThan(String value) {
            addCriterion("USER_SYS_NAME >", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SYS_NAME >=", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameLessThan(String value) {
            addCriterion("USER_SYS_NAME <", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameLessThanOrEqualTo(String value) {
            addCriterion("USER_SYS_NAME <=", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameLike(String value) {
            addCriterion("USER_SYS_NAME like", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameNotLike(String value) {
            addCriterion("USER_SYS_NAME not like", value, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameIn(List<String> values) {
            addCriterion("USER_SYS_NAME in", values, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameNotIn(List<String> values) {
            addCriterion("USER_SYS_NAME not in", values, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameBetween(String value1, String value2) {
            addCriterion("USER_SYS_NAME between", value1, value2, "userSysName");
            return (Criteria) this;
        }

        public Criteria andUserSysNameNotBetween(String value1, String value2) {
            addCriterion("USER_SYS_NAME not between", value1, value2, "userSysName");
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

        public Criteria andUserShortNameIsNull() {
            addCriterion("USER_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserShortNameIsNotNull() {
            addCriterion("USER_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserShortNameEqualTo(String value) {
            addCriterion("USER_SHORT_NAME =", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameNotEqualTo(String value) {
            addCriterion("USER_SHORT_NAME <>", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameGreaterThan(String value) {
            addCriterion("USER_SHORT_NAME >", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SHORT_NAME >=", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameLessThan(String value) {
            addCriterion("USER_SHORT_NAME <", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameLessThanOrEqualTo(String value) {
            addCriterion("USER_SHORT_NAME <=", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameLike(String value) {
            addCriterion("USER_SHORT_NAME like", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameNotLike(String value) {
            addCriterion("USER_SHORT_NAME not like", value, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameIn(List<String> values) {
            addCriterion("USER_SHORT_NAME in", values, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameNotIn(List<String> values) {
            addCriterion("USER_SHORT_NAME not in", values, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameBetween(String value1, String value2) {
            addCriterion("USER_SHORT_NAME between", value1, value2, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserShortNameNotBetween(String value1, String value2) {
            addCriterion("USER_SHORT_NAME not between", value1, value2, "userShortName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("UNIT_ID like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("UNIT_ID not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
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

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(String value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(String value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(String value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(String value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(String value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLike(String value) {
            addCriterion("POSITION_ID like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotLike(String value) {
            addCriterion("POSITION_ID not like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<String> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<String> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(String value1, String value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(String value1, String value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("POSITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("POSITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("POSITION_NAME =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("POSITION_NAME <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("POSITION_NAME >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("POSITION_NAME <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("POSITION_NAME like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("POSITION_NAME not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("POSITION_NAME in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("POSITION_NAME not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("POSITION_NAME between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("POSITION_NAME not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BIRTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BIRTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("BIRTHDATE =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("BIRTHDATE <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("BIRTHDATE >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDATE >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("BIRTHDATE <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDATE <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("BIRTHDATE like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("BIRTHDATE not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("BIRTHDATE in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("BIRTHDATE not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("BIRTHDATE between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("BIRTHDATE not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNull() {
            addCriterion("HOMEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andHomephoneIsNotNull() {
            addCriterion("HOMEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHomephoneEqualTo(String value) {
            addCriterion("HOMEPHONE =", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotEqualTo(String value) {
            addCriterion("HOMEPHONE <>", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThan(String value) {
            addCriterion("HOMEPHONE >", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOMEPHONE >=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThan(String value) {
            addCriterion("HOMEPHONE <", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLessThanOrEqualTo(String value) {
            addCriterion("HOMEPHONE <=", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneLike(String value) {
            addCriterion("HOMEPHONE like", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotLike(String value) {
            addCriterion("HOMEPHONE not like", value, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneIn(List<String> values) {
            addCriterion("HOMEPHONE in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotIn(List<String> values) {
            addCriterion("HOMEPHONE not in", values, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneBetween(String value1, String value2) {
            addCriterion("HOMEPHONE between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andHomephoneNotBetween(String value1, String value2) {
            addCriterion("HOMEPHONE not between", value1, value2, "homephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneIsNull() {
            addCriterion("VIRTUALPHONE is null");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneIsNotNull() {
            addCriterion("VIRTUALPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneEqualTo(String value) {
            addCriterion("VIRTUALPHONE =", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneNotEqualTo(String value) {
            addCriterion("VIRTUALPHONE <>", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneGreaterThan(String value) {
            addCriterion("VIRTUALPHONE >", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneGreaterThanOrEqualTo(String value) {
            addCriterion("VIRTUALPHONE >=", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneLessThan(String value) {
            addCriterion("VIRTUALPHONE <", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneLessThanOrEqualTo(String value) {
            addCriterion("VIRTUALPHONE <=", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneLike(String value) {
            addCriterion("VIRTUALPHONE like", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneNotLike(String value) {
            addCriterion("VIRTUALPHONE not like", value, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneIn(List<String> values) {
            addCriterion("VIRTUALPHONE in", values, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneNotIn(List<String> values) {
            addCriterion("VIRTUALPHONE not in", values, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneBetween(String value1, String value2) {
            addCriterion("VIRTUALPHONE between", value1, value2, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andVirtualphoneNotBetween(String value1, String value2) {
            addCriterion("VIRTUALPHONE not between", value1, value2, "virtualphone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNull() {
            addCriterion("OFFICEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIsNotNull() {
            addCriterion("OFFICEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneEqualTo(String value) {
            addCriterion("OFFICEPHONE =", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotEqualTo(String value) {
            addCriterion("OFFICEPHONE <>", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThan(String value) {
            addCriterion("OFFICEPHONE >", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONE >=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThan(String value) {
            addCriterion("OFFICEPHONE <", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLessThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONE <=", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneLike(String value) {
            addCriterion("OFFICEPHONE like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotLike(String value) {
            addCriterion("OFFICEPHONE not like", value, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneIn(List<String> values) {
            addCriterion("OFFICEPHONE in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotIn(List<String> values) {
            addCriterion("OFFICEPHONE not in", values, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneBetween(String value1, String value2) {
            addCriterion("OFFICEPHONE between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andOfficephoneNotBetween(String value1, String value2) {
            addCriterion("OFFICEPHONE not between", value1, value2, "officephone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneIsNull() {
            addCriterion("FAXPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFaxphoneIsNotNull() {
            addCriterion("FAXPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFaxphoneEqualTo(String value) {
            addCriterion("FAXPHONE =", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneNotEqualTo(String value) {
            addCriterion("FAXPHONE <>", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneGreaterThan(String value) {
            addCriterion("FAXPHONE >", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneGreaterThanOrEqualTo(String value) {
            addCriterion("FAXPHONE >=", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneLessThan(String value) {
            addCriterion("FAXPHONE <", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneLessThanOrEqualTo(String value) {
            addCriterion("FAXPHONE <=", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneLike(String value) {
            addCriterion("FAXPHONE like", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneNotLike(String value) {
            addCriterion("FAXPHONE not like", value, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneIn(List<String> values) {
            addCriterion("FAXPHONE in", values, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneNotIn(List<String> values) {
            addCriterion("FAXPHONE not in", values, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneBetween(String value1, String value2) {
            addCriterion("FAXPHONE between", value1, value2, "faxphone");
            return (Criteria) this;
        }

        public Criteria andFaxphoneNotBetween(String value1, String value2) {
            addCriterion("FAXPHONE not between", value1, value2, "faxphone");
            return (Criteria) this;
        }

        public Criteria andIsWorkIsNull() {
            addCriterion("IS_WORK is null");
            return (Criteria) this;
        }

        public Criteria andIsWorkIsNotNull() {
            addCriterion("IS_WORK is not null");
            return (Criteria) this;
        }

        public Criteria andIsWorkEqualTo(Integer value) {
            addCriterion("IS_WORK =", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotEqualTo(Integer value) {
            addCriterion("IS_WORK <>", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkGreaterThan(Integer value) {
            addCriterion("IS_WORK >", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_WORK >=", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkLessThan(Integer value) {
            addCriterion("IS_WORK <", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkLessThanOrEqualTo(Integer value) {
            addCriterion("IS_WORK <=", value, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkIn(List<Integer> values) {
            addCriterion("IS_WORK in", values, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotIn(List<Integer> values) {
            addCriterion("IS_WORK not in", values, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkBetween(Integer value1, Integer value2) {
            addCriterion("IS_WORK between", value1, value2, "isWork");
            return (Criteria) this;
        }

        public Criteria andIsWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_WORK not between", value1, value2, "isWork");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountIsNull() {
            addCriterion("SEND_SMS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountIsNotNull() {
            addCriterion("SEND_SMS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountEqualTo(Integer value) {
            addCriterion("SEND_SMS_COUNT =", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountNotEqualTo(Integer value) {
            addCriterion("SEND_SMS_COUNT <>", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountGreaterThan(Integer value) {
            addCriterion("SEND_SMS_COUNT >", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEND_SMS_COUNT >=", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountLessThan(Integer value) {
            addCriterion("SEND_SMS_COUNT <", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountLessThanOrEqualTo(Integer value) {
            addCriterion("SEND_SMS_COUNT <=", value, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountIn(List<Integer> values) {
            addCriterion("SEND_SMS_COUNT in", values, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountNotIn(List<Integer> values) {
            addCriterion("SEND_SMS_COUNT not in", values, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountBetween(Integer value1, Integer value2) {
            addCriterion("SEND_SMS_COUNT between", value1, value2, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andSendSmsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SEND_SMS_COUNT not between", value1, value2, "sendSmsCount");
            return (Criteria) this;
        }

        public Criteria andMailQuotaIsNull() {
            addCriterion("MAIL_QUOTA is null");
            return (Criteria) this;
        }

        public Criteria andMailQuotaIsNotNull() {
            addCriterion("MAIL_QUOTA is not null");
            return (Criteria) this;
        }

        public Criteria andMailQuotaEqualTo(Integer value) {
            addCriterion("MAIL_QUOTA =", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaNotEqualTo(Integer value) {
            addCriterion("MAIL_QUOTA <>", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaGreaterThan(Integer value) {
            addCriterion("MAIL_QUOTA >", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIL_QUOTA >=", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaLessThan(Integer value) {
            addCriterion("MAIL_QUOTA <", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("MAIL_QUOTA <=", value, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaIn(List<Integer> values) {
            addCriterion("MAIL_QUOTA in", values, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaNotIn(List<Integer> values) {
            addCriterion("MAIL_QUOTA not in", values, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_QUOTA between", value1, value2, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andMailQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIL_QUOTA not between", value1, value2, "mailQuota");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andIsUnitIsNull() {
            addCriterion("IS_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsUnitIsNotNull() {
            addCriterion("IS_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnitEqualTo(Integer value) {
            addCriterion("IS_UNIT =", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotEqualTo(Integer value) {
            addCriterion("IS_UNIT <>", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitGreaterThan(Integer value) {
            addCriterion("IS_UNIT >", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_UNIT >=", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitLessThan(Integer value) {
            addCriterion("IS_UNIT <", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitLessThanOrEqualTo(Integer value) {
            addCriterion("IS_UNIT <=", value, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitIn(List<Integer> values) {
            addCriterion("IS_UNIT in", values, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotIn(List<Integer> values) {
            addCriterion("IS_UNIT not in", values, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitBetween(Integer value1, Integer value2) {
            addCriterion("IS_UNIT between", value1, value2, "isUnit");
            return (Criteria) this;
        }

        public Criteria andIsUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_UNIT not between", value1, value2, "isUnit");
            return (Criteria) this;
        }

        public Criteria andHomeAddessIsNull() {
            addCriterion("HOME_ADDESS is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddessIsNotNull() {
            addCriterion("HOME_ADDESS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddessEqualTo(String value) {
            addCriterion("HOME_ADDESS =", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessNotEqualTo(String value) {
            addCriterion("HOME_ADDESS <>", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessGreaterThan(String value) {
            addCriterion("HOME_ADDESS >", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ADDESS >=", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessLessThan(String value) {
            addCriterion("HOME_ADDESS <", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessLessThanOrEqualTo(String value) {
            addCriterion("HOME_ADDESS <=", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessLike(String value) {
            addCriterion("HOME_ADDESS like", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessNotLike(String value) {
            addCriterion("HOME_ADDESS not like", value, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessIn(List<String> values) {
            addCriterion("HOME_ADDESS in", values, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessNotIn(List<String> values) {
            addCriterion("HOME_ADDESS not in", values, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessBetween(String value1, String value2) {
            addCriterion("HOME_ADDESS between", value1, value2, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andHomeAddessNotBetween(String value1, String value2) {
            addCriterion("HOME_ADDESS not between", value1, value2, "homeAddess");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("IS_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("IS_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Integer value) {
            addCriterion("IS_ADMIN =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Integer value) {
            addCriterion("IS_ADMIN <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Integer value) {
            addCriterion("IS_ADMIN >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Integer value) {
            addCriterion("IS_ADMIN <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Integer> values) {
            addCriterion("IS_ADMIN in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Integer> values) {
            addCriterion("IS_ADMIN not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN not between", value1, value2, "isAdmin");
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