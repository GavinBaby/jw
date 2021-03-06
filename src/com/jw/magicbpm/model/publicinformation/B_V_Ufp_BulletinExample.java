package com.jw.magicbpm.model.publicinformation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_BulletinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_BulletinExample() {
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

        public Criteria andRegdateIsNull() {
            addCriterion("REGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("REGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(String value) {
            addCriterion("REGDATE =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(String value) {
            addCriterion("REGDATE <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(String value) {
            addCriterion("REGDATE >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(String value) {
            addCriterion("REGDATE >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(String value) {
            addCriterion("REGDATE <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(String value) {
            addCriterion("REGDATE <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLike(String value) {
            addCriterion("REGDATE like", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotLike(String value) {
            addCriterion("REGDATE not like", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<String> values) {
            addCriterion("REGDATE in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<String> values) {
            addCriterion("REGDATE not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(String value1, String value2) {
            addCriterion("REGDATE between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(String value1, String value2) {
            addCriterion("REGDATE not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("PUBLISHDATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("PUBLISHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(String value) {
            addCriterion("PUBLISHDATE =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(String value) {
            addCriterion("PUBLISHDATE <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(String value) {
            addCriterion("PUBLISHDATE >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISHDATE >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(String value) {
            addCriterion("PUBLISHDATE <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(String value) {
            addCriterion("PUBLISHDATE <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLike(String value) {
            addCriterion("PUBLISHDATE like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotLike(String value) {
            addCriterion("PUBLISHDATE not like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<String> values) {
            addCriterion("PUBLISHDATE in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<String> values) {
            addCriterion("PUBLISHDATE not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(String value1, String value2) {
            addCriterion("PUBLISHDATE between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(String value1, String value2) {
            addCriterion("PUBLISHDATE not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateIsNull() {
            addCriterion("ENDSHOWDATE is null");
            return (Criteria) this;
        }

        public Criteria andEndshowdateIsNotNull() {
            addCriterion("ENDSHOWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndshowdateEqualTo(String value) {
            addCriterion("ENDSHOWDATE =", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateNotEqualTo(String value) {
            addCriterion("ENDSHOWDATE <>", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateGreaterThan(String value) {
            addCriterion("ENDSHOWDATE >", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDSHOWDATE >=", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateLessThan(String value) {
            addCriterion("ENDSHOWDATE <", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateLessThanOrEqualTo(String value) {
            addCriterion("ENDSHOWDATE <=", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateLike(String value) {
            addCriterion("ENDSHOWDATE like", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateNotLike(String value) {
            addCriterion("ENDSHOWDATE not like", value, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateIn(List<String> values) {
            addCriterion("ENDSHOWDATE in", values, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateNotIn(List<String> values) {
            addCriterion("ENDSHOWDATE not in", values, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateBetween(String value1, String value2) {
            addCriterion("ENDSHOWDATE between", value1, value2, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andEndshowdateNotBetween(String value1, String value2) {
            addCriterion("ENDSHOWDATE not between", value1, value2, "endshowdate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNull() {
            addCriterion("CANCELDATE is null");
            return (Criteria) this;
        }

        public Criteria andCanceldateIsNotNull() {
            addCriterion("CANCELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCanceldateEqualTo(String value) {
            addCriterion("CANCELDATE =", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotEqualTo(String value) {
            addCriterion("CANCELDATE <>", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThan(String value) {
            addCriterion("CANCELDATE >", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELDATE >=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThan(String value) {
            addCriterion("CANCELDATE <", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLessThanOrEqualTo(String value) {
            addCriterion("CANCELDATE <=", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateLike(String value) {
            addCriterion("CANCELDATE like", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotLike(String value) {
            addCriterion("CANCELDATE not like", value, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateIn(List<String> values) {
            addCriterion("CANCELDATE in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotIn(List<String> values) {
            addCriterion("CANCELDATE not in", values, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateBetween(String value1, String value2) {
            addCriterion("CANCELDATE between", value1, value2, "canceldate");
            return (Criteria) this;
        }

        public Criteria andCanceldateNotBetween(String value1, String value2) {
            addCriterion("CANCELDATE not between", value1, value2, "canceldate");
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(BigDecimal value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(BigDecimal value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(BigDecimal value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(BigDecimal value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<BigDecimal> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<BigDecimal> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("BODY is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("BODY is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("BODY =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("BODY <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("BODY >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("BODY >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("BODY <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("BODY <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("BODY like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("BODY not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("BODY in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("BODY not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("BODY between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("BODY not between", value1, value2, "body");
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