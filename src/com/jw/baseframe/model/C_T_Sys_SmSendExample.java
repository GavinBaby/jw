package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_SmSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_SmSendExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("SEND_TIME =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("SEND_TIME <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("SEND_TIME >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_TIME >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("SEND_TIME <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("SEND_TIME <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("SEND_TIME like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("SEND_TIME not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("SEND_TIME in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("SEND_TIME not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("SEND_TIME between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("SEND_TIME not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendUnitidIsNull() {
            addCriterion("SEND_UNITID is null");
            return (Criteria) this;
        }

        public Criteria andSendUnitidIsNotNull() {
            addCriterion("SEND_UNITID is not null");
            return (Criteria) this;
        }

        public Criteria andSendUnitidEqualTo(String value) {
            addCriterion("SEND_UNITID =", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidNotEqualTo(String value) {
            addCriterion("SEND_UNITID <>", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidGreaterThan(String value) {
            addCriterion("SEND_UNITID >", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_UNITID >=", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidLessThan(String value) {
            addCriterion("SEND_UNITID <", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidLessThanOrEqualTo(String value) {
            addCriterion("SEND_UNITID <=", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidLike(String value) {
            addCriterion("SEND_UNITID like", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidNotLike(String value) {
            addCriterion("SEND_UNITID not like", value, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidIn(List<String> values) {
            addCriterion("SEND_UNITID in", values, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidNotIn(List<String> values) {
            addCriterion("SEND_UNITID not in", values, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidBetween(String value1, String value2) {
            addCriterion("SEND_UNITID between", value1, value2, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitidNotBetween(String value1, String value2) {
            addCriterion("SEND_UNITID not between", value1, value2, "sendUnitid");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameIsNull() {
            addCriterion("SEND_UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameIsNotNull() {
            addCriterion("SEND_UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameEqualTo(String value) {
            addCriterion("SEND_UNITNAME =", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameNotEqualTo(String value) {
            addCriterion("SEND_UNITNAME <>", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameGreaterThan(String value) {
            addCriterion("SEND_UNITNAME >", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_UNITNAME >=", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameLessThan(String value) {
            addCriterion("SEND_UNITNAME <", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameLessThanOrEqualTo(String value) {
            addCriterion("SEND_UNITNAME <=", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameLike(String value) {
            addCriterion("SEND_UNITNAME like", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameNotLike(String value) {
            addCriterion("SEND_UNITNAME not like", value, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameIn(List<String> values) {
            addCriterion("SEND_UNITNAME in", values, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameNotIn(List<String> values) {
            addCriterion("SEND_UNITNAME not in", values, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameBetween(String value1, String value2) {
            addCriterion("SEND_UNITNAME between", value1, value2, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUnitnameNotBetween(String value1, String value2) {
            addCriterion("SEND_UNITNAME not between", value1, value2, "sendUnitname");
            return (Criteria) this;
        }

        public Criteria andSendUserIsNull() {
            addCriterion("SEND_USER is null");
            return (Criteria) this;
        }

        public Criteria andSendUserIsNotNull() {
            addCriterion("SEND_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSendUserEqualTo(String value) {
            addCriterion("SEND_USER =", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotEqualTo(String value) {
            addCriterion("SEND_USER <>", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserGreaterThan(String value) {
            addCriterion("SEND_USER >", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_USER >=", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLessThan(String value) {
            addCriterion("SEND_USER <", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLessThanOrEqualTo(String value) {
            addCriterion("SEND_USER <=", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserLike(String value) {
            addCriterion("SEND_USER like", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotLike(String value) {
            addCriterion("SEND_USER not like", value, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserIn(List<String> values) {
            addCriterion("SEND_USER in", values, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotIn(List<String> values) {
            addCriterion("SEND_USER not in", values, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserBetween(String value1, String value2) {
            addCriterion("SEND_USER between", value1, value2, "sendUser");
            return (Criteria) this;
        }

        public Criteria andSendUserNotBetween(String value1, String value2) {
            addCriterion("SEND_USER not between", value1, value2, "sendUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidIsNull() {
            addCriterion("RECEIVE_UNITID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidIsNotNull() {
            addCriterion("RECEIVE_UNITID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidEqualTo(String value) {
            addCriterion("RECEIVE_UNITID =", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidNotEqualTo(String value) {
            addCriterion("RECEIVE_UNITID <>", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidGreaterThan(String value) {
            addCriterion("RECEIVE_UNITID >", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_UNITID >=", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidLessThan(String value) {
            addCriterion("RECEIVE_UNITID <", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_UNITID <=", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidLike(String value) {
            addCriterion("RECEIVE_UNITID like", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidNotLike(String value) {
            addCriterion("RECEIVE_UNITID not like", value, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidIn(List<String> values) {
            addCriterion("RECEIVE_UNITID in", values, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidNotIn(List<String> values) {
            addCriterion("RECEIVE_UNITID not in", values, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidBetween(String value1, String value2) {
            addCriterion("RECEIVE_UNITID between", value1, value2, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitidNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_UNITID not between", value1, value2, "receiveUnitid");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameIsNull() {
            addCriterion("RECEIVE_UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameIsNotNull() {
            addCriterion("RECEIVE_UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameEqualTo(String value) {
            addCriterion("RECEIVE_UNITNAME =", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameNotEqualTo(String value) {
            addCriterion("RECEIVE_UNITNAME <>", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameGreaterThan(String value) {
            addCriterion("RECEIVE_UNITNAME >", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_UNITNAME >=", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameLessThan(String value) {
            addCriterion("RECEIVE_UNITNAME <", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_UNITNAME <=", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameLike(String value) {
            addCriterion("RECEIVE_UNITNAME like", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameNotLike(String value) {
            addCriterion("RECEIVE_UNITNAME not like", value, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameIn(List<String> values) {
            addCriterion("RECEIVE_UNITNAME in", values, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameNotIn(List<String> values) {
            addCriterion("RECEIVE_UNITNAME not in", values, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameBetween(String value1, String value2) {
            addCriterion("RECEIVE_UNITNAME between", value1, value2, "receiveUnitname");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitnameNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_UNITNAME not between", value1, value2, "receiveUnitname");
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

        public Criteria andSmContentIsNull() {
            addCriterion("SM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSmContentIsNotNull() {
            addCriterion("SM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSmContentEqualTo(String value) {
            addCriterion("SM_CONTENT =", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentNotEqualTo(String value) {
            addCriterion("SM_CONTENT <>", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentGreaterThan(String value) {
            addCriterion("SM_CONTENT >", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentGreaterThanOrEqualTo(String value) {
            addCriterion("SM_CONTENT >=", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentLessThan(String value) {
            addCriterion("SM_CONTENT <", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentLessThanOrEqualTo(String value) {
            addCriterion("SM_CONTENT <=", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentLike(String value) {
            addCriterion("SM_CONTENT like", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentNotLike(String value) {
            addCriterion("SM_CONTENT not like", value, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentIn(List<String> values) {
            addCriterion("SM_CONTENT in", values, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentNotIn(List<String> values) {
            addCriterion("SM_CONTENT not in", values, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentBetween(String value1, String value2) {
            addCriterion("SM_CONTENT between", value1, value2, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmContentNotBetween(String value1, String value2) {
            addCriterion("SM_CONTENT not between", value1, value2, "smContent");
            return (Criteria) this;
        }

        public Criteria andSmSplitIsNull() {
            addCriterion("SM_SPLIT is null");
            return (Criteria) this;
        }

        public Criteria andSmSplitIsNotNull() {
            addCriterion("SM_SPLIT is not null");
            return (Criteria) this;
        }

        public Criteria andSmSplitEqualTo(Integer value) {
            addCriterion("SM_SPLIT =", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitNotEqualTo(Integer value) {
            addCriterion("SM_SPLIT <>", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitGreaterThan(Integer value) {
            addCriterion("SM_SPLIT >", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SM_SPLIT >=", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitLessThan(Integer value) {
            addCriterion("SM_SPLIT <", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitLessThanOrEqualTo(Integer value) {
            addCriterion("SM_SPLIT <=", value, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitIn(List<Integer> values) {
            addCriterion("SM_SPLIT in", values, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitNotIn(List<Integer> values) {
            addCriterion("SM_SPLIT not in", values, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitBetween(Integer value1, Integer value2) {
            addCriterion("SM_SPLIT between", value1, value2, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmSplitNotBetween(Integer value1, Integer value2) {
            addCriterion("SM_SPLIT not between", value1, value2, "smSplit");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNull() {
            addCriterion("SM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNotNull() {
            addCriterion("SM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSmTypeEqualTo(String value) {
            addCriterion("SM_TYPE =", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotEqualTo(String value) {
            addCriterion("SM_TYPE <>", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThan(String value) {
            addCriterion("SM_TYPE >", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SM_TYPE >=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThan(String value) {
            addCriterion("SM_TYPE <", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThanOrEqualTo(String value) {
            addCriterion("SM_TYPE <=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLike(String value) {
            addCriterion("SM_TYPE like", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotLike(String value) {
            addCriterion("SM_TYPE not like", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeIn(List<String> values) {
            addCriterion("SM_TYPE in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotIn(List<String> values) {
            addCriterion("SM_TYPE not in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeBetween(String value1, String value2) {
            addCriterion("SM_TYPE between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotBetween(String value1, String value2) {
            addCriterion("SM_TYPE not between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("SEND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("SEND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("SEND_STATUS =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("SEND_STATUS <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("SEND_STATUS >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_STATUS >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("SEND_STATUS <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("SEND_STATUS <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("SEND_STATUS like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("SEND_STATUS not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("SEND_STATUS in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("SEND_STATUS not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("SEND_STATUS between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("SEND_STATUS not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIsNull() {
            addCriterion("IS_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIsNotNull() {
            addCriterion("IS_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveEqualTo(Integer value) {
            addCriterion("IS_RECEIVE =", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotEqualTo(Integer value) {
            addCriterion("IS_RECEIVE <>", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveGreaterThan(Integer value) {
            addCriterion("IS_RECEIVE >", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RECEIVE >=", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLessThan(Integer value) {
            addCriterion("IS_RECEIVE <", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RECEIVE <=", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIn(List<Integer> values) {
            addCriterion("IS_RECEIVE in", values, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotIn(List<Integer> values) {
            addCriterion("IS_RECEIVE not in", values, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECEIVE between", value1, value2, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECEIVE not between", value1, value2, "isReceive");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagIsNull() {
            addCriterion("RECEIVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagIsNotNull() {
            addCriterion("RECEIVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagEqualTo(String value) {
            addCriterion("RECEIVE_FLAG =", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagNotEqualTo(String value) {
            addCriterion("RECEIVE_FLAG <>", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagGreaterThan(String value) {
            addCriterion("RECEIVE_FLAG >", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_FLAG >=", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagLessThan(String value) {
            addCriterion("RECEIVE_FLAG <", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_FLAG <=", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagLike(String value) {
            addCriterion("RECEIVE_FLAG like", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagNotLike(String value) {
            addCriterion("RECEIVE_FLAG not like", value, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagIn(List<String> values) {
            addCriterion("RECEIVE_FLAG in", values, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagNotIn(List<String> values) {
            addCriterion("RECEIVE_FLAG not in", values, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagBetween(String value1, String value2) {
            addCriterion("RECEIVE_FLAG between", value1, value2, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveFlagNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_FLAG not between", value1, value2, "receiveFlag");
            return (Criteria) this;
        }

        public Criteria andIsTimeIsNull() {
            addCriterion("IS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIsTimeIsNotNull() {
            addCriterion("IS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIsTimeEqualTo(Integer value) {
            addCriterion("IS_TIME =", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeNotEqualTo(Integer value) {
            addCriterion("IS_TIME <>", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeGreaterThan(Integer value) {
            addCriterion("IS_TIME >", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_TIME >=", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeLessThan(Integer value) {
            addCriterion("IS_TIME <", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeLessThanOrEqualTo(Integer value) {
            addCriterion("IS_TIME <=", value, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeIn(List<Integer> values) {
            addCriterion("IS_TIME in", values, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeNotIn(List<Integer> values) {
            addCriterion("IS_TIME not in", values, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeBetween(Integer value1, Integer value2) {
            addCriterion("IS_TIME between", value1, value2, "isTime");
            return (Criteria) this;
        }

        public Criteria andIsTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_TIME not between", value1, value2, "isTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeIsNull() {
            addCriterion("PLANSEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeIsNotNull() {
            addCriterion("PLANSEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeEqualTo(String value) {
            addCriterion("PLANSEND_TIME =", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeNotEqualTo(String value) {
            addCriterion("PLANSEND_TIME <>", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeGreaterThan(String value) {
            addCriterion("PLANSEND_TIME >", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PLANSEND_TIME >=", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeLessThan(String value) {
            addCriterion("PLANSEND_TIME <", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeLessThanOrEqualTo(String value) {
            addCriterion("PLANSEND_TIME <=", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeLike(String value) {
            addCriterion("PLANSEND_TIME like", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeNotLike(String value) {
            addCriterion("PLANSEND_TIME not like", value, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeIn(List<String> values) {
            addCriterion("PLANSEND_TIME in", values, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeNotIn(List<String> values) {
            addCriterion("PLANSEND_TIME not in", values, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeBetween(String value1, String value2) {
            addCriterion("PLANSEND_TIME between", value1, value2, "plansendTime");
            return (Criteria) this;
        }

        public Criteria andPlansendTimeNotBetween(String value1, String value2) {
            addCriterion("PLANSEND_TIME not between", value1, value2, "plansendTime");
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