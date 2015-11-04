package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_Filein_SerialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_Filein_SerialExample() {
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

        public Criteria andFileinSerialnameIsNull() {
            addCriterion("FILEIN_SERIALNAME is null");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameIsNotNull() {
            addCriterion("FILEIN_SERIALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameEqualTo(String value) {
            addCriterion("FILEIN_SERIALNAME =", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameNotEqualTo(String value) {
            addCriterion("FILEIN_SERIALNAME <>", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameGreaterThan(String value) {
            addCriterion("FILEIN_SERIALNAME >", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_SERIALNAME >=", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameLessThan(String value) {
            addCriterion("FILEIN_SERIALNAME <", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_SERIALNAME <=", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameLike(String value) {
            addCriterion("FILEIN_SERIALNAME like", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameNotLike(String value) {
            addCriterion("FILEIN_SERIALNAME not like", value, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameIn(List<String> values) {
            addCriterion("FILEIN_SERIALNAME in", values, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameNotIn(List<String> values) {
            addCriterion("FILEIN_SERIALNAME not in", values, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameBetween(String value1, String value2) {
            addCriterion("FILEIN_SERIALNAME between", value1, value2, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinSerialnameNotBetween(String value1, String value2) {
            addCriterion("FILEIN_SERIALNAME not between", value1, value2, "fileinSerialname");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidIsNull() {
            addCriterion("FILEIN_TYPEID is null");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidIsNotNull() {
            addCriterion("FILEIN_TYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidEqualTo(String value) {
            addCriterion("FILEIN_TYPEID =", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidNotEqualTo(String value) {
            addCriterion("FILEIN_TYPEID <>", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidGreaterThan(String value) {
            addCriterion("FILEIN_TYPEID >", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_TYPEID >=", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidLessThan(String value) {
            addCriterion("FILEIN_TYPEID <", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_TYPEID <=", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidLike(String value) {
            addCriterion("FILEIN_TYPEID like", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidNotLike(String value) {
            addCriterion("FILEIN_TYPEID not like", value, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidIn(List<String> values) {
            addCriterion("FILEIN_TYPEID in", values, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidNotIn(List<String> values) {
            addCriterion("FILEIN_TYPEID not in", values, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidBetween(String value1, String value2) {
            addCriterion("FILEIN_TYPEID between", value1, value2, "fileinTypeid");
            return (Criteria) this;
        }

        public Criteria andFileinTypeidNotBetween(String value1, String value2) {
            addCriterion("FILEIN_TYPEID not between", value1, value2, "fileinTypeid");
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

        public Criteria andFileinYearIsNull() {
            addCriterion("FILEIN_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andFileinYearIsNotNull() {
            addCriterion("FILEIN_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFileinYearEqualTo(String value) {
            addCriterion("FILEIN_YEAR =", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearNotEqualTo(String value) {
            addCriterion("FILEIN_YEAR <>", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearGreaterThan(String value) {
            addCriterion("FILEIN_YEAR >", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_YEAR >=", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearLessThan(String value) {
            addCriterion("FILEIN_YEAR <", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_YEAR <=", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearLike(String value) {
            addCriterion("FILEIN_YEAR like", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearNotLike(String value) {
            addCriterion("FILEIN_YEAR not like", value, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearIn(List<String> values) {
            addCriterion("FILEIN_YEAR in", values, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearNotIn(List<String> values) {
            addCriterion("FILEIN_YEAR not in", values, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearBetween(String value1, String value2) {
            addCriterion("FILEIN_YEAR between", value1, value2, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinYearNotBetween(String value1, String value2) {
            addCriterion("FILEIN_YEAR not between", value1, value2, "fileinYear");
            return (Criteria) this;
        }

        public Criteria andFileinSerialIsNull() {
            addCriterion("FILEIN_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andFileinSerialIsNotNull() {
            addCriterion("FILEIN_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andFileinSerialEqualTo(String value) {
            addCriterion("FILEIN_SERIAL =", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialNotEqualTo(String value) {
            addCriterion("FILEIN_SERIAL <>", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialGreaterThan(String value) {
            addCriterion("FILEIN_SERIAL >", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_SERIAL >=", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialLessThan(String value) {
            addCriterion("FILEIN_SERIAL <", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_SERIAL <=", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialLike(String value) {
            addCriterion("FILEIN_SERIAL like", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialNotLike(String value) {
            addCriterion("FILEIN_SERIAL not like", value, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialIn(List<String> values) {
            addCriterion("FILEIN_SERIAL in", values, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialNotIn(List<String> values) {
            addCriterion("FILEIN_SERIAL not in", values, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialBetween(String value1, String value2) {
            addCriterion("FILEIN_SERIAL between", value1, value2, "fileinSerial");
            return (Criteria) this;
        }

        public Criteria andFileinSerialNotBetween(String value1, String value2) {
            addCriterion("FILEIN_SERIAL not between", value1, value2, "fileinSerial");
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