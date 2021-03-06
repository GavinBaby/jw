package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_MateriaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_MateriaExample() {
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

        public Criteria andMateriaTimeIsNull() {
            addCriterion("MATERIA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeIsNotNull() {
            addCriterion("MATERIA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeEqualTo(String value) {
            addCriterion("MATERIA_TIME =", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeNotEqualTo(String value) {
            addCriterion("MATERIA_TIME <>", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeGreaterThan(String value) {
            addCriterion("MATERIA_TIME >", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_TIME >=", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeLessThan(String value) {
            addCriterion("MATERIA_TIME <", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_TIME <=", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeLike(String value) {
            addCriterion("MATERIA_TIME like", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeNotLike(String value) {
            addCriterion("MATERIA_TIME not like", value, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeIn(List<String> values) {
            addCriterion("MATERIA_TIME in", values, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeNotIn(List<String> values) {
            addCriterion("MATERIA_TIME not in", values, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeBetween(String value1, String value2) {
            addCriterion("MATERIA_TIME between", value1, value2, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaTimeNotBetween(String value1, String value2) {
            addCriterion("MATERIA_TIME not between", value1, value2, "materiaTime");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorIsNull() {
            addCriterion("MATERIA_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorIsNotNull() {
            addCriterion("MATERIA_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorEqualTo(String value) {
            addCriterion("MATERIA_AUTHOR =", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorNotEqualTo(String value) {
            addCriterion("MATERIA_AUTHOR <>", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorGreaterThan(String value) {
            addCriterion("MATERIA_AUTHOR >", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_AUTHOR >=", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorLessThan(String value) {
            addCriterion("MATERIA_AUTHOR <", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_AUTHOR <=", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorLike(String value) {
            addCriterion("MATERIA_AUTHOR like", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorNotLike(String value) {
            addCriterion("MATERIA_AUTHOR not like", value, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorIn(List<String> values) {
            addCriterion("MATERIA_AUTHOR in", values, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorNotIn(List<String> values) {
            addCriterion("MATERIA_AUTHOR not in", values, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorBetween(String value1, String value2) {
            addCriterion("MATERIA_AUTHOR between", value1, value2, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaAuthorNotBetween(String value1, String value2) {
            addCriterion("MATERIA_AUTHOR not between", value1, value2, "materiaAuthor");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleIsNull() {
            addCriterion("MATERIA_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleIsNotNull() {
            addCriterion("MATERIA_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleEqualTo(String value) {
            addCriterion("MATERIA_TITLE =", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleNotEqualTo(String value) {
            addCriterion("MATERIA_TITLE <>", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleGreaterThan(String value) {
            addCriterion("MATERIA_TITLE >", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_TITLE >=", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleLessThan(String value) {
            addCriterion("MATERIA_TITLE <", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_TITLE <=", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleLike(String value) {
            addCriterion("MATERIA_TITLE like", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleNotLike(String value) {
            addCriterion("MATERIA_TITLE not like", value, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleIn(List<String> values) {
            addCriterion("MATERIA_TITLE in", values, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleNotIn(List<String> values) {
            addCriterion("MATERIA_TITLE not in", values, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleBetween(String value1, String value2) {
            addCriterion("MATERIA_TITLE between", value1, value2, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaTitleNotBetween(String value1, String value2) {
            addCriterion("MATERIA_TITLE not between", value1, value2, "materiaTitle");
            return (Criteria) this;
        }

        public Criteria andMateriaClassIsNull() {
            addCriterion("MATERIA_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andMateriaClassIsNotNull() {
            addCriterion("MATERIA_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaClassEqualTo(String value) {
            addCriterion("MATERIA_CLASS =", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassNotEqualTo(String value) {
            addCriterion("MATERIA_CLASS <>", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassGreaterThan(String value) {
            addCriterion("MATERIA_CLASS >", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_CLASS >=", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassLessThan(String value) {
            addCriterion("MATERIA_CLASS <", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_CLASS <=", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassLike(String value) {
            addCriterion("MATERIA_CLASS like", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassNotLike(String value) {
            addCriterion("MATERIA_CLASS not like", value, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassIn(List<String> values) {
            addCriterion("MATERIA_CLASS in", values, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassNotIn(List<String> values) {
            addCriterion("MATERIA_CLASS not in", values, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassBetween(String value1, String value2) {
            addCriterion("MATERIA_CLASS between", value1, value2, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaClassNotBetween(String value1, String value2) {
            addCriterion("MATERIA_CLASS not between", value1, value2, "materiaClass");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckIsNull() {
            addCriterion("MATERIA_ISCHECK is null");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckIsNotNull() {
            addCriterion("MATERIA_ISCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckEqualTo(Integer value) {
            addCriterion("MATERIA_ISCHECK =", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckNotEqualTo(Integer value) {
            addCriterion("MATERIA_ISCHECK <>", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckGreaterThan(Integer value) {
            addCriterion("MATERIA_ISCHECK >", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATERIA_ISCHECK >=", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckLessThan(Integer value) {
            addCriterion("MATERIA_ISCHECK <", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckLessThanOrEqualTo(Integer value) {
            addCriterion("MATERIA_ISCHECK <=", value, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckIn(List<Integer> values) {
            addCriterion("MATERIA_ISCHECK in", values, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckNotIn(List<Integer> values) {
            addCriterion("MATERIA_ISCHECK not in", values, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckBetween(Integer value1, Integer value2) {
            addCriterion("MATERIA_ISCHECK between", value1, value2, "materiaIscheck");
            return (Criteria) this;
        }

        public Criteria andMateriaIscheckNotBetween(Integer value1, Integer value2) {
            addCriterion("MATERIA_ISCHECK not between", value1, value2, "materiaIscheck");
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

        public Criteria andClassnameIsNull() {
            addCriterion("CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("CLASSNAME =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("CLASSNAME <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("CLASSNAME >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAME >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("CLASSNAME <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("CLASSNAME <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("CLASSNAME like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("CLASSNAME not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("CLASSNAME in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("CLASSNAME not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("CLASSNAME between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("CLASSNAME not between", value1, value2, "classname");
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

        public Criteria andDownpermitIsNull() {
            addCriterion("DOWNPERMIT is null");
            return (Criteria) this;
        }

        public Criteria andDownpermitIsNotNull() {
            addCriterion("DOWNPERMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDownpermitEqualTo(String value) {
            addCriterion("DOWNPERMIT =", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitNotEqualTo(String value) {
            addCriterion("DOWNPERMIT <>", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitGreaterThan(String value) {
            addCriterion("DOWNPERMIT >", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNPERMIT >=", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitLessThan(String value) {
            addCriterion("DOWNPERMIT <", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitLessThanOrEqualTo(String value) {
            addCriterion("DOWNPERMIT <=", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitLike(String value) {
            addCriterion("DOWNPERMIT like", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitNotLike(String value) {
            addCriterion("DOWNPERMIT not like", value, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitIn(List<String> values) {
            addCriterion("DOWNPERMIT in", values, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitNotIn(List<String> values) {
            addCriterion("DOWNPERMIT not in", values, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitBetween(String value1, String value2) {
            addCriterion("DOWNPERMIT between", value1, value2, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitNotBetween(String value1, String value2) {
            addCriterion("DOWNPERMIT not between", value1, value2, "downpermit");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameIsNull() {
            addCriterion("DOWNPERMITNAME is null");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameIsNotNull() {
            addCriterion("DOWNPERMITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameEqualTo(String value) {
            addCriterion("DOWNPERMITNAME =", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameNotEqualTo(String value) {
            addCriterion("DOWNPERMITNAME <>", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameGreaterThan(String value) {
            addCriterion("DOWNPERMITNAME >", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNPERMITNAME >=", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameLessThan(String value) {
            addCriterion("DOWNPERMITNAME <", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameLessThanOrEqualTo(String value) {
            addCriterion("DOWNPERMITNAME <=", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameLike(String value) {
            addCriterion("DOWNPERMITNAME like", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameNotLike(String value) {
            addCriterion("DOWNPERMITNAME not like", value, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameIn(List<String> values) {
            addCriterion("DOWNPERMITNAME in", values, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameNotIn(List<String> values) {
            addCriterion("DOWNPERMITNAME not in", values, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameBetween(String value1, String value2) {
            addCriterion("DOWNPERMITNAME between", value1, value2, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andDownpermitnameNotBetween(String value1, String value2) {
            addCriterion("DOWNPERMITNAME not between", value1, value2, "downpermitname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserIsNull() {
            addCriterion("MATERIA_DOWNUSER is null");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserIsNotNull() {
            addCriterion("MATERIA_DOWNUSER is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserEqualTo(String value) {
            addCriterion("MATERIA_DOWNUSER =", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserNotEqualTo(String value) {
            addCriterion("MATERIA_DOWNUSER <>", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserGreaterThan(String value) {
            addCriterion("MATERIA_DOWNUSER >", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_DOWNUSER >=", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserLessThan(String value) {
            addCriterion("MATERIA_DOWNUSER <", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_DOWNUSER <=", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserLike(String value) {
            addCriterion("MATERIA_DOWNUSER like", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserNotLike(String value) {
            addCriterion("MATERIA_DOWNUSER not like", value, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserIn(List<String> values) {
            addCriterion("MATERIA_DOWNUSER in", values, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserNotIn(List<String> values) {
            addCriterion("MATERIA_DOWNUSER not in", values, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserBetween(String value1, String value2) {
            addCriterion("MATERIA_DOWNUSER between", value1, value2, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownuserNotBetween(String value1, String value2) {
            addCriterion("MATERIA_DOWNUSER not between", value1, value2, "materiaDownuser");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameIsNull() {
            addCriterion("MATERIA_DOWNNAME is null");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameIsNotNull() {
            addCriterion("MATERIA_DOWNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameEqualTo(String value) {
            addCriterion("MATERIA_DOWNNAME =", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameNotEqualTo(String value) {
            addCriterion("MATERIA_DOWNNAME <>", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameGreaterThan(String value) {
            addCriterion("MATERIA_DOWNNAME >", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIA_DOWNNAME >=", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameLessThan(String value) {
            addCriterion("MATERIA_DOWNNAME <", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameLessThanOrEqualTo(String value) {
            addCriterion("MATERIA_DOWNNAME <=", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameLike(String value) {
            addCriterion("MATERIA_DOWNNAME like", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameNotLike(String value) {
            addCriterion("MATERIA_DOWNNAME not like", value, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameIn(List<String> values) {
            addCriterion("MATERIA_DOWNNAME in", values, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameNotIn(List<String> values) {
            addCriterion("MATERIA_DOWNNAME not in", values, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameBetween(String value1, String value2) {
            addCriterion("MATERIA_DOWNNAME between", value1, value2, "materiaDownname");
            return (Criteria) this;
        }

        public Criteria andMateriaDownnameNotBetween(String value1, String value2) {
            addCriterion("MATERIA_DOWNNAME not between", value1, value2, "materiaDownname");
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