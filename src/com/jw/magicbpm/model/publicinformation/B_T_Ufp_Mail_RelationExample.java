package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_T_Ufp_Mail_RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Ufp_Mail_RelationExample() {
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

        public Criteria andMailTypeIsNull() {
            addCriterion("MAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNotNull() {
            addCriterion("MAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMailTypeEqualTo(Long value) {
            addCriterion("MAIL_TYPE =", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotEqualTo(Long value) {
            addCriterion("MAIL_TYPE <>", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThan(Long value) {
            addCriterion("MAIL_TYPE >", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("MAIL_TYPE >=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThan(Long value) {
            addCriterion("MAIL_TYPE <", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThanOrEqualTo(Long value) {
            addCriterion("MAIL_TYPE <=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeIn(List<Long> values) {
            addCriterion("MAIL_TYPE in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotIn(List<Long> values) {
            addCriterion("MAIL_TYPE not in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeBetween(Long value1, Long value2) {
            addCriterion("MAIL_TYPE between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotBetween(Long value1, Long value2) {
            addCriterion("MAIL_TYPE not between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdIsNull() {
            addCriterion("MAIL_ATTRIBUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdIsNotNull() {
            addCriterion("MAIL_ATTRIBUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdEqualTo(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID =", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdNotEqualTo(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID <>", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdGreaterThan(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID >", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID >=", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdLessThan(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID <", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdLessThanOrEqualTo(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID <=", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdLike(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID like", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdNotLike(String value) {
            addCriterion("MAIL_ATTRIBUTE_ID not like", value, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdIn(List<String> values) {
            addCriterion("MAIL_ATTRIBUTE_ID in", values, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdNotIn(List<String> values) {
            addCriterion("MAIL_ATTRIBUTE_ID not in", values, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdBetween(String value1, String value2) {
            addCriterion("MAIL_ATTRIBUTE_ID between", value1, value2, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailAttributeIdNotBetween(String value1, String value2) {
            addCriterion("MAIL_ATTRIBUTE_ID not between", value1, value2, "mailAttributeId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdIsNull() {
            addCriterion("MAIL_CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMailContentIdIsNotNull() {
            addCriterion("MAIL_CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMailContentIdEqualTo(String value) {
            addCriterion("MAIL_CONTENT_ID =", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdNotEqualTo(String value) {
            addCriterion("MAIL_CONTENT_ID <>", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdGreaterThan(String value) {
            addCriterion("MAIL_CONTENT_ID >", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_CONTENT_ID >=", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdLessThan(String value) {
            addCriterion("MAIL_CONTENT_ID <", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdLessThanOrEqualTo(String value) {
            addCriterion("MAIL_CONTENT_ID <=", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdLike(String value) {
            addCriterion("MAIL_CONTENT_ID like", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdNotLike(String value) {
            addCriterion("MAIL_CONTENT_ID not like", value, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdIn(List<String> values) {
            addCriterion("MAIL_CONTENT_ID in", values, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdNotIn(List<String> values) {
            addCriterion("MAIL_CONTENT_ID not in", values, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdBetween(String value1, String value2) {
            addCriterion("MAIL_CONTENT_ID between", value1, value2, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andMailContentIdNotBetween(String value1, String value2) {
            addCriterion("MAIL_CONTENT_ID not between", value1, value2, "mailContentId");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("IS_NEW is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("IS_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Integer value) {
            addCriterion("IS_NEW =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Integer value) {
            addCriterion("IS_NEW <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Integer value) {
            addCriterion("IS_NEW >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_NEW >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Integer value) {
            addCriterion("IS_NEW <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Integer value) {
            addCriterion("IS_NEW <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Integer> values) {
            addCriterion("IS_NEW in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Integer> values) {
            addCriterion("IS_NEW not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Integer value1, Integer value2) {
            addCriterion("IS_NEW between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_NEW not between", value1, value2, "isNew");
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

        public Criteria andReceiverTimeIsNull() {
            addCriterion("RECEIVER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeIsNotNull() {
            addCriterion("RECEIVER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeEqualTo(String value) {
            addCriterion("RECEIVER_TIME =", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotEqualTo(String value) {
            addCriterion("RECEIVER_TIME <>", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeGreaterThan(String value) {
            addCriterion("RECEIVER_TIME >", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_TIME >=", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeLessThan(String value) {
            addCriterion("RECEIVER_TIME <", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_TIME <=", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeLike(String value) {
            addCriterion("RECEIVER_TIME like", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotLike(String value) {
            addCriterion("RECEIVER_TIME not like", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeIn(List<String> values) {
            addCriterion("RECEIVER_TIME in", values, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotIn(List<String> values) {
            addCriterion("RECEIVER_TIME not in", values, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeBetween(String value1, String value2) {
            addCriterion("RECEIVER_TIME between", value1, value2, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_TIME not between", value1, value2, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReplyFlagIsNull() {
            addCriterion("REPLY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReplyFlagIsNotNull() {
            addCriterion("REPLY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFlagEqualTo(Integer value) {
            addCriterion("REPLY_FLAG =", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagNotEqualTo(Integer value) {
            addCriterion("REPLY_FLAG <>", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagGreaterThan(Integer value) {
            addCriterion("REPLY_FLAG >", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPLY_FLAG >=", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagLessThan(Integer value) {
            addCriterion("REPLY_FLAG <", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("REPLY_FLAG <=", value, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagIn(List<Integer> values) {
            addCriterion("REPLY_FLAG in", values, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagNotIn(List<Integer> values) {
            addCriterion("REPLY_FLAG not in", values, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagBetween(Integer value1, Integer value2) {
            addCriterion("REPLY_FLAG between", value1, value2, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andReplyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("REPLY_FLAG not between", value1, value2, "replyFlag");
            return (Criteria) this;
        }

        public Criteria andIsFileIsNull() {
            addCriterion("IS_FILE is null");
            return (Criteria) this;
        }

        public Criteria andIsFileIsNotNull() {
            addCriterion("IS_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andIsFileEqualTo(Integer value) {
            addCriterion("IS_FILE =", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileNotEqualTo(Integer value) {
            addCriterion("IS_FILE <>", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileGreaterThan(Integer value) {
            addCriterion("IS_FILE >", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_FILE >=", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileLessThan(Integer value) {
            addCriterion("IS_FILE <", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileLessThanOrEqualTo(Integer value) {
            addCriterion("IS_FILE <=", value, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileIn(List<Integer> values) {
            addCriterion("IS_FILE in", values, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileNotIn(List<Integer> values) {
            addCriterion("IS_FILE not in", values, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileBetween(Integer value1, Integer value2) {
            addCriterion("IS_FILE between", value1, value2, "isFile");
            return (Criteria) this;
        }

        public Criteria andIsFileNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_FILE not between", value1, value2, "isFile");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserIsNull() {
            addCriterion("SPECIFIC_RECSYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserIsNotNull() {
            addCriterion("SPECIFIC_RECSYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserEqualTo(String value) {
            addCriterion("SPECIFIC_RECSYS_USER =", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserNotEqualTo(String value) {
            addCriterion("SPECIFIC_RECSYS_USER <>", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserGreaterThan(String value) {
            addCriterion("SPECIFIC_RECSYS_USER >", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_RECSYS_USER >=", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserLessThan(String value) {
            addCriterion("SPECIFIC_RECSYS_USER <", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserLessThanOrEqualTo(String value) {
            addCriterion("SPECIFIC_RECSYS_USER <=", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserLike(String value) {
            addCriterion("SPECIFIC_RECSYS_USER like", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserNotLike(String value) {
            addCriterion("SPECIFIC_RECSYS_USER not like", value, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserIn(List<String> values) {
            addCriterion("SPECIFIC_RECSYS_USER in", values, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserNotIn(List<String> values) {
            addCriterion("SPECIFIC_RECSYS_USER not in", values, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserBetween(String value1, String value2) {
            addCriterion("SPECIFIC_RECSYS_USER between", value1, value2, "specificRecsysUser");
            return (Criteria) this;
        }

        public Criteria andSpecificRecsysUserNotBetween(String value1, String value2) {
            addCriterion("SPECIFIC_RECSYS_USER not between", value1, value2, "specificRecsysUser");
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