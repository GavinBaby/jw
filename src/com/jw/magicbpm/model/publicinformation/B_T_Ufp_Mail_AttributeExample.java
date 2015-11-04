package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_T_Ufp_Mail_AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Ufp_Mail_AttributeExample() {
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

        public Criteria andCopySysUserIsNull() {
            addCriterion("COPY_SYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andCopySysUserIsNotNull() {
            addCriterion("COPY_SYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCopySysUserEqualTo(String value) {
            addCriterion("COPY_SYS_USER =", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserNotEqualTo(String value) {
            addCriterion("COPY_SYS_USER <>", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserGreaterThan(String value) {
            addCriterion("COPY_SYS_USER >", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserGreaterThanOrEqualTo(String value) {
            addCriterion("COPY_SYS_USER >=", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserLessThan(String value) {
            addCriterion("COPY_SYS_USER <", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserLessThanOrEqualTo(String value) {
            addCriterion("COPY_SYS_USER <=", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserLike(String value) {
            addCriterion("COPY_SYS_USER like", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserNotLike(String value) {
            addCriterion("COPY_SYS_USER not like", value, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserIn(List<String> values) {
            addCriterion("COPY_SYS_USER in", values, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserNotIn(List<String> values) {
            addCriterion("COPY_SYS_USER not in", values, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserBetween(String value1, String value2) {
            addCriterion("COPY_SYS_USER between", value1, value2, "copySysUser");
            return (Criteria) this;
        }

        public Criteria andCopySysUserNotBetween(String value1, String value2) {
            addCriterion("COPY_SYS_USER not between", value1, value2, "copySysUser");
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

        public Criteria andDarkSysUserIsNull() {
            addCriterion("DARK_SYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserIsNotNull() {
            addCriterion("DARK_SYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserEqualTo(String value) {
            addCriterion("DARK_SYS_USER =", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserNotEqualTo(String value) {
            addCriterion("DARK_SYS_USER <>", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserGreaterThan(String value) {
            addCriterion("DARK_SYS_USER >", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("DARK_SYS_USER >=", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserLessThan(String value) {
            addCriterion("DARK_SYS_USER <", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserLessThanOrEqualTo(String value) {
            addCriterion("DARK_SYS_USER <=", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserLike(String value) {
            addCriterion("DARK_SYS_USER like", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserNotLike(String value) {
            addCriterion("DARK_SYS_USER not like", value, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserIn(List<String> values) {
            addCriterion("DARK_SYS_USER in", values, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserNotIn(List<String> values) {
            addCriterion("DARK_SYS_USER not in", values, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserBetween(String value1, String value2) {
            addCriterion("DARK_SYS_USER between", value1, value2, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andDarkSysUserNotBetween(String value1, String value2) {
            addCriterion("DARK_SYS_USER not between", value1, value2, "darkSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgIsNull() {
            addCriterion("IS_SEND_MSG is null");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgIsNotNull() {
            addCriterion("IS_SEND_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgEqualTo(Integer value) {
            addCriterion("IS_SEND_MSG =", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgNotEqualTo(Integer value) {
            addCriterion("IS_SEND_MSG <>", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgGreaterThan(Integer value) {
            addCriterion("IS_SEND_MSG >", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_MSG >=", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgLessThan(Integer value) {
            addCriterion("IS_SEND_MSG <", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SEND_MSG <=", value, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgIn(List<Integer> values) {
            addCriterion("IS_SEND_MSG in", values, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgNotIn(List<Integer> values) {
            addCriterion("IS_SEND_MSG not in", values, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_MSG between", value1, value2, "isSendMsg");
            return (Criteria) this;
        }

        public Criteria andIsSendMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SEND_MSG not between", value1, value2, "isSendMsg");
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