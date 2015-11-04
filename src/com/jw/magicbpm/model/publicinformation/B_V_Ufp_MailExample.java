package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_MailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_MailExample() {
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

        public Criteria andSendSysUserIsNull() {
            addCriterion("SEND_SYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andSendSysUserIsNotNull() {
            addCriterion("SEND_SYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSendSysUserEqualTo(String value) {
            addCriterion("SEND_SYS_USER =", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserNotEqualTo(String value) {
            addCriterion("SEND_SYS_USER <>", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserGreaterThan(String value) {
            addCriterion("SEND_SYS_USER >", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_SYS_USER >=", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserLessThan(String value) {
            addCriterion("SEND_SYS_USER <", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserLessThanOrEqualTo(String value) {
            addCriterion("SEND_SYS_USER <=", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserLike(String value) {
            addCriterion("SEND_SYS_USER like", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserNotLike(String value) {
            addCriterion("SEND_SYS_USER not like", value, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserIn(List<String> values) {
            addCriterion("SEND_SYS_USER in", values, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserNotIn(List<String> values) {
            addCriterion("SEND_SYS_USER not in", values, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserBetween(String value1, String value2) {
            addCriterion("SEND_SYS_USER between", value1, value2, "sendSysUser");
            return (Criteria) this;
        }

        public Criteria andSendSysUserNotBetween(String value1, String value2) {
            addCriterion("SEND_SYS_USER not between", value1, value2, "sendSysUser");
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

        public Criteria andReceiverSysUserIsNull() {
            addCriterion("RECEIVER_SYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserIsNotNull() {
            addCriterion("RECEIVER_SYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserEqualTo(String value) {
            addCriterion("RECEIVER_SYS_USER =", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserNotEqualTo(String value) {
            addCriterion("RECEIVER_SYS_USER <>", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserGreaterThan(String value) {
            addCriterion("RECEIVER_SYS_USER >", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_SYS_USER >=", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserLessThan(String value) {
            addCriterion("RECEIVER_SYS_USER <", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_SYS_USER <=", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserLike(String value) {
            addCriterion("RECEIVER_SYS_USER like", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserNotLike(String value) {
            addCriterion("RECEIVER_SYS_USER not like", value, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserIn(List<String> values) {
            addCriterion("RECEIVER_SYS_USER in", values, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserNotIn(List<String> values) {
            addCriterion("RECEIVER_SYS_USER not in", values, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserBetween(String value1, String value2) {
            addCriterion("RECEIVER_SYS_USER between", value1, value2, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverSysUserNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_SYS_USER not between", value1, value2, "receiverSysUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIsNull() {
            addCriterion("RECEIVER_USER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIsNotNull() {
            addCriterion("RECEIVER_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverUserEqualTo(String value) {
            addCriterion("RECEIVER_USER =", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotEqualTo(String value) {
            addCriterion("RECEIVER_USER <>", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserGreaterThan(String value) {
            addCriterion("RECEIVER_USER >", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_USER >=", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLessThan(String value) {
            addCriterion("RECEIVER_USER <", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_USER <=", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserLike(String value) {
            addCriterion("RECEIVER_USER like", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotLike(String value) {
            addCriterion("RECEIVER_USER not like", value, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserIn(List<String> values) {
            addCriterion("RECEIVER_USER in", values, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotIn(List<String> values) {
            addCriterion("RECEIVER_USER not in", values, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserBetween(String value1, String value2) {
            addCriterion("RECEIVER_USER between", value1, value2, "receiverUser");
            return (Criteria) this;
        }

        public Criteria andReceiverUserNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_USER not between", value1, value2, "receiverUser");
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

        public Criteria andCanseeuserIsNull() {
            addCriterion("CANSEEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCanseeuserIsNotNull() {
            addCriterion("CANSEEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCanseeuserEqualTo(String value) {
            addCriterion("CANSEEUSER =", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserNotEqualTo(String value) {
            addCriterion("CANSEEUSER <>", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserGreaterThan(String value) {
            addCriterion("CANSEEUSER >", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserGreaterThanOrEqualTo(String value) {
            addCriterion("CANSEEUSER >=", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserLessThan(String value) {
            addCriterion("CANSEEUSER <", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserLessThanOrEqualTo(String value) {
            addCriterion("CANSEEUSER <=", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserLike(String value) {
            addCriterion("CANSEEUSER like", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserNotLike(String value) {
            addCriterion("CANSEEUSER not like", value, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserIn(List<String> values) {
            addCriterion("CANSEEUSER in", values, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserNotIn(List<String> values) {
            addCriterion("CANSEEUSER not in", values, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserBetween(String value1, String value2) {
            addCriterion("CANSEEUSER between", value1, value2, "canseeuser");
            return (Criteria) this;
        }

        public Criteria andCanseeuserNotBetween(String value1, String value2) {
            addCriterion("CANSEEUSER not between", value1, value2, "canseeuser");
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

        public Criteria andPriorityLeveIsNull() {
            addCriterion("PRIORITY_LEVE is null");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveIsNotNull() {
            addCriterion("PRIORITY_LEVE is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveEqualTo(String value) {
            addCriterion("PRIORITY_LEVE =", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveNotEqualTo(String value) {
            addCriterion("PRIORITY_LEVE <>", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveGreaterThan(String value) {
            addCriterion("PRIORITY_LEVE >", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY_LEVE >=", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveLessThan(String value) {
            addCriterion("PRIORITY_LEVE <", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY_LEVE <=", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveLike(String value) {
            addCriterion("PRIORITY_LEVE like", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveNotLike(String value) {
            addCriterion("PRIORITY_LEVE not like", value, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveIn(List<String> values) {
            addCriterion("PRIORITY_LEVE in", values, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveNotIn(List<String> values) {
            addCriterion("PRIORITY_LEVE not in", values, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveBetween(String value1, String value2) {
            addCriterion("PRIORITY_LEVE between", value1, value2, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andPriorityLeveNotBetween(String value1, String value2) {
            addCriterion("PRIORITY_LEVE not between", value1, value2, "priorityLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveIsNull() {
            addCriterion("IMPORTANT_LEVE is null");
            return (Criteria) this;
        }

        public Criteria andImportantLeveIsNotNull() {
            addCriterion("IMPORTANT_LEVE is not null");
            return (Criteria) this;
        }

        public Criteria andImportantLeveEqualTo(String value) {
            addCriterion("IMPORTANT_LEVE =", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveNotEqualTo(String value) {
            addCriterion("IMPORTANT_LEVE <>", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveGreaterThan(String value) {
            addCriterion("IMPORTANT_LEVE >", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_LEVE >=", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveLessThan(String value) {
            addCriterion("IMPORTANT_LEVE <", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_LEVE <=", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveLike(String value) {
            addCriterion("IMPORTANT_LEVE like", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveNotLike(String value) {
            addCriterion("IMPORTANT_LEVE not like", value, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveIn(List<String> values) {
            addCriterion("IMPORTANT_LEVE in", values, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveNotIn(List<String> values) {
            addCriterion("IMPORTANT_LEVE not in", values, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveBetween(String value1, String value2) {
            addCriterion("IMPORTANT_LEVE between", value1, value2, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andImportantLeveNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_LEVE not between", value1, value2, "importantLeve");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIsNull() {
            addCriterion("IS_RECEIPT is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIsNotNull() {
            addCriterion("IS_RECEIPT is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiptEqualTo(Integer value) {
            addCriterion("IS_RECEIPT =", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotEqualTo(Integer value) {
            addCriterion("IS_RECEIPT <>", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptGreaterThan(Integer value) {
            addCriterion("IS_RECEIPT >", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RECEIPT >=", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptLessThan(Integer value) {
            addCriterion("IS_RECEIPT <", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RECEIPT <=", value, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptIn(List<Integer> values) {
            addCriterion("IS_RECEIPT in", values, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotIn(List<Integer> values) {
            addCriterion("IS_RECEIPT not in", values, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECEIPT between", value1, value2, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andIsReceiptNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RECEIPT not between", value1, value2, "isReceipt");
            return (Criteria) this;
        }

        public Criteria andCopyUserIsNull() {
            addCriterion("COPY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCopyUserIsNotNull() {
            addCriterion("COPY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCopyUserEqualTo(String value) {
            addCriterion("COPY_USER =", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserNotEqualTo(String value) {
            addCriterion("COPY_USER <>", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserGreaterThan(String value) {
            addCriterion("COPY_USER >", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserGreaterThanOrEqualTo(String value) {
            addCriterion("COPY_USER >=", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserLessThan(String value) {
            addCriterion("COPY_USER <", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserLessThanOrEqualTo(String value) {
            addCriterion("COPY_USER <=", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserLike(String value) {
            addCriterion("COPY_USER like", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserNotLike(String value) {
            addCriterion("COPY_USER not like", value, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserIn(List<String> values) {
            addCriterion("COPY_USER in", values, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserNotIn(List<String> values) {
            addCriterion("COPY_USER not in", values, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserBetween(String value1, String value2) {
            addCriterion("COPY_USER between", value1, value2, "copyUser");
            return (Criteria) this;
        }

        public Criteria andCopyUserNotBetween(String value1, String value2) {
            addCriterion("COPY_USER not between", value1, value2, "copyUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserIsNull() {
            addCriterion("DARK_USER is null");
            return (Criteria) this;
        }

        public Criteria andDarkUserIsNotNull() {
            addCriterion("DARK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDarkUserEqualTo(String value) {
            addCriterion("DARK_USER =", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserNotEqualTo(String value) {
            addCriterion("DARK_USER <>", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserGreaterThan(String value) {
            addCriterion("DARK_USER >", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserGreaterThanOrEqualTo(String value) {
            addCriterion("DARK_USER >=", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserLessThan(String value) {
            addCriterion("DARK_USER <", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserLessThanOrEqualTo(String value) {
            addCriterion("DARK_USER <=", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserLike(String value) {
            addCriterion("DARK_USER like", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserNotLike(String value) {
            addCriterion("DARK_USER not like", value, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserIn(List<String> values) {
            addCriterion("DARK_USER in", values, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserNotIn(List<String> values) {
            addCriterion("DARK_USER not in", values, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserBetween(String value1, String value2) {
            addCriterion("DARK_USER between", value1, value2, "darkUser");
            return (Criteria) this;
        }

        public Criteria andDarkUserNotBetween(String value1, String value2) {
            addCriterion("DARK_USER not between", value1, value2, "darkUser");
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

        public Criteria andTipDarkInfoIsNull() {
            addCriterion("TIP_DARK_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoIsNotNull() {
            addCriterion("TIP_DARK_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoEqualTo(String value) {
            addCriterion("TIP_DARK_INFO =", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoNotEqualTo(String value) {
            addCriterion("TIP_DARK_INFO <>", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoGreaterThan(String value) {
            addCriterion("TIP_DARK_INFO >", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TIP_DARK_INFO >=", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoLessThan(String value) {
            addCriterion("TIP_DARK_INFO <", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoLessThanOrEqualTo(String value) {
            addCriterion("TIP_DARK_INFO <=", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoLike(String value) {
            addCriterion("TIP_DARK_INFO like", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoNotLike(String value) {
            addCriterion("TIP_DARK_INFO not like", value, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoIn(List<String> values) {
            addCriterion("TIP_DARK_INFO in", values, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoNotIn(List<String> values) {
            addCriterion("TIP_DARK_INFO not in", values, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoBetween(String value1, String value2) {
            addCriterion("TIP_DARK_INFO between", value1, value2, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andTipDarkInfoNotBetween(String value1, String value2) {
            addCriterion("TIP_DARK_INFO not between", value1, value2, "tipDarkInfo");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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