package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_Meeting_EquipuseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_Meeting_EquipuseExample() {
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("EQUIPMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("EQUIPMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("EQUIPMENT_ID =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("EQUIPMENT_ID >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("EQUIPMENT_ID <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("EQUIPMENT_ID like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("EQUIPMENT_ID not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("EQUIPMENT_ID in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("EQUIPMENT_ID not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID not between", value1, value2, "equipmentId");
            return (Criteria) this;
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

        public Criteria andEquipmentNumIsNull() {
            addCriterion("EQUIPMENT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumIsNotNull() {
            addCriterion("EQUIPMENT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumEqualTo(Integer value) {
            addCriterion("EQUIPMENT_NUM =", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumNotEqualTo(Integer value) {
            addCriterion("EQUIPMENT_NUM <>", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumGreaterThan(Integer value) {
            addCriterion("EQUIPMENT_NUM >", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_NUM >=", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumLessThan(Integer value) {
            addCriterion("EQUIPMENT_NUM <", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_NUM <=", value, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumIn(List<Integer> values) {
            addCriterion("EQUIPMENT_NUM in", values, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumNotIn(List<Integer> values) {
            addCriterion("EQUIPMENT_NUM not in", values, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_NUM between", value1, value2, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_NUM not between", value1, value2, "equipmentNum");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdIsNull() {
            addCriterion("MEETINGSERVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdIsNotNull() {
            addCriterion("MEETINGSERVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdEqualTo(String value) {
            addCriterion("MEETINGSERVICE_ID =", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdNotEqualTo(String value) {
            addCriterion("MEETINGSERVICE_ID <>", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdGreaterThan(String value) {
            addCriterion("MEETINGSERVICE_ID >", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGSERVICE_ID >=", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdLessThan(String value) {
            addCriterion("MEETINGSERVICE_ID <", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdLessThanOrEqualTo(String value) {
            addCriterion("MEETINGSERVICE_ID <=", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdLike(String value) {
            addCriterion("MEETINGSERVICE_ID like", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdNotLike(String value) {
            addCriterion("MEETINGSERVICE_ID not like", value, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdIn(List<String> values) {
            addCriterion("MEETINGSERVICE_ID in", values, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdNotIn(List<String> values) {
            addCriterion("MEETINGSERVICE_ID not in", values, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdBetween(String value1, String value2) {
            addCriterion("MEETINGSERVICE_ID between", value1, value2, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andMeetingserviceIdNotBetween(String value1, String value2) {
            addCriterion("MEETINGSERVICE_ID not between", value1, value2, "meetingserviceId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("EQUIPMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("EQUIPMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("EQUIPMENT_NAME >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("EQUIPMENT_NAME <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("EQUIPMENT_NAME like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("EQUIPMENT_NAME not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("EQUIPMENT_NAME in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("EQUIPMENT_NAME not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_NAME between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_NAME not between", value1, value2, "equipmentName");
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