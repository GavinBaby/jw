package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_TodomattersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_TodomattersExample() {
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

        public Criteria andSentUserIsNull() {
            addCriterion("SENT_USER is null");
            return (Criteria) this;
        }

        public Criteria andSentUserIsNotNull() {
            addCriterion("SENT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSentUserEqualTo(String value) {
            addCriterion("SENT_USER =", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserNotEqualTo(String value) {
            addCriterion("SENT_USER <>", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserGreaterThan(String value) {
            addCriterion("SENT_USER >", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserGreaterThanOrEqualTo(String value) {
            addCriterion("SENT_USER >=", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserLessThan(String value) {
            addCriterion("SENT_USER <", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserLessThanOrEqualTo(String value) {
            addCriterion("SENT_USER <=", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserLike(String value) {
            addCriterion("SENT_USER like", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserNotLike(String value) {
            addCriterion("SENT_USER not like", value, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserIn(List<String> values) {
            addCriterion("SENT_USER in", values, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserNotIn(List<String> values) {
            addCriterion("SENT_USER not in", values, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserBetween(String value1, String value2) {
            addCriterion("SENT_USER between", value1, value2, "sentUser");
            return (Criteria) this;
        }

        public Criteria andSentUserNotBetween(String value1, String value2) {
            addCriterion("SENT_USER not between", value1, value2, "sentUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("RECEIVE_USER is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("RECEIVE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(String value) {
            addCriterion("RECEIVE_USER =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(String value) {
            addCriterion("RECEIVE_USER <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(String value) {
            addCriterion("RECEIVE_USER >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_USER >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(String value) {
            addCriterion("RECEIVE_USER <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_USER <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLike(String value) {
            addCriterion("RECEIVE_USER like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotLike(String value) {
            addCriterion("RECEIVE_USER not like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<String> values) {
            addCriterion("RECEIVE_USER in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<String> values) {
            addCriterion("RECEIVE_USER not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(String value1, String value2) {
            addCriterion("RECEIVE_USER between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_USER not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andMainUrlIsNull() {
            addCriterion("MAIN_URL is null");
            return (Criteria) this;
        }

        public Criteria andMainUrlIsNotNull() {
            addCriterion("MAIN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMainUrlEqualTo(String value) {
            addCriterion("MAIN_URL =", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlNotEqualTo(String value) {
            addCriterion("MAIN_URL <>", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlGreaterThan(String value) {
            addCriterion("MAIN_URL >", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_URL >=", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlLessThan(String value) {
            addCriterion("MAIN_URL <", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlLessThanOrEqualTo(String value) {
            addCriterion("MAIN_URL <=", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlLike(String value) {
            addCriterion("MAIN_URL like", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlNotLike(String value) {
            addCriterion("MAIN_URL not like", value, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlIn(List<String> values) {
            addCriterion("MAIN_URL in", values, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlNotIn(List<String> values) {
            addCriterion("MAIN_URL not in", values, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlBetween(String value1, String value2) {
            addCriterion("MAIN_URL between", value1, value2, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andMainUrlNotBetween(String value1, String value2) {
            addCriterion("MAIN_URL not between", value1, value2, "mainUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNull() {
            addCriterion("DOC_URL is null");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNotNull() {
            addCriterion("DOC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andDocUrlEqualTo(String value) {
            addCriterion("DOC_URL =", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotEqualTo(String value) {
            addCriterion("DOC_URL <>", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThan(String value) {
            addCriterion("DOC_URL >", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_URL >=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThan(String value) {
            addCriterion("DOC_URL <", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThanOrEqualTo(String value) {
            addCriterion("DOC_URL <=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLike(String value) {
            addCriterion("DOC_URL like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotLike(String value) {
            addCriterion("DOC_URL not like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlIn(List<String> values) {
            addCriterion("DOC_URL in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotIn(List<String> values) {
            addCriterion("DOC_URL not in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlBetween(String value1, String value2) {
            addCriterion("DOC_URL between", value1, value2, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotBetween(String value1, String value2) {
            addCriterion("DOC_URL not between", value1, value2, "docUrl");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("PROPERTY like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("PROPERTY not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andTacheIdIsNull() {
            addCriterion("TACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTacheIdIsNotNull() {
            addCriterion("TACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIdEqualTo(String value) {
            addCriterion("TACHE_ID =", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdNotEqualTo(String value) {
            addCriterion("TACHE_ID <>", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdGreaterThan(String value) {
            addCriterion("TACHE_ID >", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_ID >=", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdLessThan(String value) {
            addCriterion("TACHE_ID <", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdLessThanOrEqualTo(String value) {
            addCriterion("TACHE_ID <=", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdLike(String value) {
            addCriterion("TACHE_ID like", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdNotLike(String value) {
            addCriterion("TACHE_ID not like", value, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdIn(List<String> values) {
            addCriterion("TACHE_ID in", values, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdNotIn(List<String> values) {
            addCriterion("TACHE_ID not in", values, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdBetween(String value1, String value2) {
            addCriterion("TACHE_ID between", value1, value2, "tacheId");
            return (Criteria) this;
        }

        public Criteria andTacheIdNotBetween(String value1, String value2) {
            addCriterion("TACHE_ID not between", value1, value2, "tacheId");
            return (Criteria) this;
        }

        public Criteria andMaindocidIsNull() {
            addCriterion("MAINDOCID is null");
            return (Criteria) this;
        }

        public Criteria andMaindocidIsNotNull() {
            addCriterion("MAINDOCID is not null");
            return (Criteria) this;
        }

        public Criteria andMaindocidEqualTo(String value) {
            addCriterion("MAINDOCID =", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidNotEqualTo(String value) {
            addCriterion("MAINDOCID <>", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidGreaterThan(String value) {
            addCriterion("MAINDOCID >", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidGreaterThanOrEqualTo(String value) {
            addCriterion("MAINDOCID >=", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidLessThan(String value) {
            addCriterion("MAINDOCID <", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidLessThanOrEqualTo(String value) {
            addCriterion("MAINDOCID <=", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidLike(String value) {
            addCriterion("MAINDOCID like", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidNotLike(String value) {
            addCriterion("MAINDOCID not like", value, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidIn(List<String> values) {
            addCriterion("MAINDOCID in", values, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidNotIn(List<String> values) {
            addCriterion("MAINDOCID not in", values, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidBetween(String value1, String value2) {
            addCriterion("MAINDOCID between", value1, value2, "maindocid");
            return (Criteria) this;
        }

        public Criteria andMaindocidNotBetween(String value1, String value2) {
            addCriterion("MAINDOCID not between", value1, value2, "maindocid");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgIsNull() {
            addCriterion("IF_SEND_MSG is null");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgIsNotNull() {
            addCriterion("IF_SEND_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgEqualTo(Integer value) {
            addCriterion("IF_SEND_MSG =", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgNotEqualTo(Integer value) {
            addCriterion("IF_SEND_MSG <>", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgGreaterThan(Integer value) {
            addCriterion("IF_SEND_MSG >", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("IF_SEND_MSG >=", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgLessThan(Integer value) {
            addCriterion("IF_SEND_MSG <", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgLessThanOrEqualTo(Integer value) {
            addCriterion("IF_SEND_MSG <=", value, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgIn(List<Integer> values) {
            addCriterion("IF_SEND_MSG in", values, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgNotIn(List<Integer> values) {
            addCriterion("IF_SEND_MSG not in", values, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgBetween(Integer value1, Integer value2) {
            addCriterion("IF_SEND_MSG between", value1, value2, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andIfSendMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("IF_SEND_MSG not between", value1, value2, "ifSendMsg");
            return (Criteria) this;
        }

        public Criteria andTitleSubIsNull() {
            addCriterion("TITLE_SUB is null");
            return (Criteria) this;
        }

        public Criteria andTitleSubIsNotNull() {
            addCriterion("TITLE_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andTitleSubEqualTo(String value) {
            addCriterion("TITLE_SUB =", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubNotEqualTo(String value) {
            addCriterion("TITLE_SUB <>", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubGreaterThan(String value) {
            addCriterion("TITLE_SUB >", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_SUB >=", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubLessThan(String value) {
            addCriterion("TITLE_SUB <", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubLessThanOrEqualTo(String value) {
            addCriterion("TITLE_SUB <=", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubLike(String value) {
            addCriterion("TITLE_SUB like", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubNotLike(String value) {
            addCriterion("TITLE_SUB not like", value, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubIn(List<String> values) {
            addCriterion("TITLE_SUB in", values, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubNotIn(List<String> values) {
            addCriterion("TITLE_SUB not in", values, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubBetween(String value1, String value2) {
            addCriterion("TITLE_SUB between", value1, value2, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTitleSubNotBetween(String value1, String value2) {
            addCriterion("TITLE_SUB not between", value1, value2, "titleSub");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andIsWtDocIsNull() {
            addCriterion("IS_WT_DOC is null");
            return (Criteria) this;
        }

        public Criteria andIsWtDocIsNotNull() {
            addCriterion("IS_WT_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andIsWtDocEqualTo(Integer value) {
            addCriterion("IS_WT_DOC =", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocNotEqualTo(Integer value) {
            addCriterion("IS_WT_DOC <>", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocGreaterThan(Integer value) {
            addCriterion("IS_WT_DOC >", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_WT_DOC >=", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocLessThan(Integer value) {
            addCriterion("IS_WT_DOC <", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocLessThanOrEqualTo(Integer value) {
            addCriterion("IS_WT_DOC <=", value, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocIn(List<Integer> values) {
            addCriterion("IS_WT_DOC in", values, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocNotIn(List<Integer> values) {
            addCriterion("IS_WT_DOC not in", values, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocBetween(Integer value1, Integer value2) {
            addCriterion("IS_WT_DOC between", value1, value2, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andIsWtDocNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_WT_DOC not between", value1, value2, "isWtDoc");
            return (Criteria) this;
        }

        public Criteria andPrioritiesIsNull() {
            addCriterion("PRIORITIES is null");
            return (Criteria) this;
        }

        public Criteria andPrioritiesIsNotNull() {
            addCriterion("PRIORITIES is not null");
            return (Criteria) this;
        }

        public Criteria andPrioritiesEqualTo(String value) {
            addCriterion("PRIORITIES =", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesNotEqualTo(String value) {
            addCriterion("PRIORITIES <>", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesGreaterThan(String value) {
            addCriterion("PRIORITIES >", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITIES >=", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesLessThan(String value) {
            addCriterion("PRIORITIES <", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesLessThanOrEqualTo(String value) {
            addCriterion("PRIORITIES <=", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesLike(String value) {
            addCriterion("PRIORITIES like", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesNotLike(String value) {
            addCriterion("PRIORITIES not like", value, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesIn(List<String> values) {
            addCriterion("PRIORITIES in", values, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesNotIn(List<String> values) {
            addCriterion("PRIORITIES not in", values, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesBetween(String value1, String value2) {
            addCriterion("PRIORITIES between", value1, value2, "priorities");
            return (Criteria) this;
        }

        public Criteria andPrioritiesNotBetween(String value1, String value2) {
            addCriterion("PRIORITIES not between", value1, value2, "priorities");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("IS_READ is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("IS_READ is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Integer value) {
            addCriterion("IS_READ =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Integer value) {
            addCriterion("IS_READ <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Integer value) {
            addCriterion("IS_READ >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_READ >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Integer value) {
            addCriterion("IS_READ <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Integer value) {
            addCriterion("IS_READ <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Integer> values) {
            addCriterion("IS_READ in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Integer> values) {
            addCriterion("IS_READ not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Integer value1, Integer value2) {
            addCriterion("IS_READ between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_READ not between", value1, value2, "isRead");
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