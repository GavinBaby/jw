package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_T_Flow_FileInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Flow_FileInExample() {
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

        public Criteria andRegisteredUserIsNull() {
            addCriterion("REGISTERED_USER is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserIsNotNull() {
            addCriterion("REGISTERED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserEqualTo(String value) {
            addCriterion("REGISTERED_USER =", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserNotEqualTo(String value) {
            addCriterion("REGISTERED_USER <>", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserGreaterThan(String value) {
            addCriterion("REGISTERED_USER >", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_USER >=", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserLessThan(String value) {
            addCriterion("REGISTERED_USER <", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_USER <=", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserLike(String value) {
            addCriterion("REGISTERED_USER like", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserNotLike(String value) {
            addCriterion("REGISTERED_USER not like", value, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserIn(List<String> values) {
            addCriterion("REGISTERED_USER in", values, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserNotIn(List<String> values) {
            addCriterion("REGISTERED_USER not in", values, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserBetween(String value1, String value2) {
            addCriterion("REGISTERED_USER between", value1, value2, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredUserNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_USER not between", value1, value2, "registeredUser");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeIsNull() {
            addCriterion("REGISTERED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeIsNotNull() {
            addCriterion("REGISTERED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeEqualTo(String value) {
            addCriterion("REGISTERED_TIME =", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotEqualTo(String value) {
            addCriterion("REGISTERED_TIME <>", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeGreaterThan(String value) {
            addCriterion("REGISTERED_TIME >", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_TIME >=", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeLessThan(String value) {
            addCriterion("REGISTERED_TIME <", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_TIME <=", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeLike(String value) {
            addCriterion("REGISTERED_TIME like", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotLike(String value) {
            addCriterion("REGISTERED_TIME not like", value, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeIn(List<String> values) {
            addCriterion("REGISTERED_TIME in", values, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotIn(List<String> values) {
            addCriterion("REGISTERED_TIME not in", values, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeBetween(String value1, String value2) {
            addCriterion("REGISTERED_TIME between", value1, value2, "registeredTime");
            return (Criteria) this;
        }

        public Criteria andRegisteredTimeNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_TIME not between", value1, value2, "registeredTime");
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

        public Criteria andFileinTimeIsNull() {
            addCriterion("FILEIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFileinTimeIsNotNull() {
            addCriterion("FILEIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFileinTimeEqualTo(String value) {
            addCriterion("FILEIN_TIME =", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeNotEqualTo(String value) {
            addCriterion("FILEIN_TIME <>", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeGreaterThan(String value) {
            addCriterion("FILEIN_TIME >", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_TIME >=", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeLessThan(String value) {
            addCriterion("FILEIN_TIME <", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_TIME <=", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeLike(String value) {
            addCriterion("FILEIN_TIME like", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeNotLike(String value) {
            addCriterion("FILEIN_TIME not like", value, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeIn(List<String> values) {
            addCriterion("FILEIN_TIME in", values, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeNotIn(List<String> values) {
            addCriterion("FILEIN_TIME not in", values, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeBetween(String value1, String value2) {
            addCriterion("FILEIN_TIME between", value1, value2, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andFileinTimeNotBetween(String value1, String value2) {
            addCriterion("FILEIN_TIME not between", value1, value2, "fileinTime");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNull() {
            addCriterion("URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(String value) {
            addCriterion("URGENCY =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(String value) {
            addCriterion("URGENCY <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(String value) {
            addCriterion("URGENCY >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("URGENCY >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(String value) {
            addCriterion("URGENCY <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(String value) {
            addCriterion("URGENCY <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLike(String value) {
            addCriterion("URGENCY like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotLike(String value) {
            addCriterion("URGENCY not like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<String> values) {
            addCriterion("URGENCY in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<String> values) {
            addCriterion("URGENCY not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(String value1, String value2) {
            addCriterion("URGENCY between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(String value1, String value2) {
            addCriterion("URGENCY not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andFileinTitleIsNull() {
            addCriterion("FILEIN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFileinTitleIsNotNull() {
            addCriterion("FILEIN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFileinTitleEqualTo(String value) {
            addCriterion("FILEIN_TITLE =", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleNotEqualTo(String value) {
            addCriterion("FILEIN_TITLE <>", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleGreaterThan(String value) {
            addCriterion("FILEIN_TITLE >", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FILEIN_TITLE >=", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleLessThan(String value) {
            addCriterion("FILEIN_TITLE <", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleLessThanOrEqualTo(String value) {
            addCriterion("FILEIN_TITLE <=", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleLike(String value) {
            addCriterion("FILEIN_TITLE like", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleNotLike(String value) {
            addCriterion("FILEIN_TITLE not like", value, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleIn(List<String> values) {
            addCriterion("FILEIN_TITLE in", values, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleNotIn(List<String> values) {
            addCriterion("FILEIN_TITLE not in", values, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleBetween(String value1, String value2) {
            addCriterion("FILEIN_TITLE between", value1, value2, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andFileinTitleNotBetween(String value1, String value2) {
            addCriterion("FILEIN_TITLE not between", value1, value2, "fileinTitle");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("SYMBOL is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("SYMBOL is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("SYMBOL =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("SYMBOL <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("SYMBOL >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("SYMBOL >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("SYMBOL <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("SYMBOL <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("SYMBOL like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("SYMBOL not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("SYMBOL in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("SYMBOL not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("SYMBOL between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("SYMBOL not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolYearIsNull() {
            addCriterion("SYMBOL_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andSymbolYearIsNotNull() {
            addCriterion("SYMBOL_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolYearEqualTo(String value) {
            addCriterion("SYMBOL_YEAR =", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearNotEqualTo(String value) {
            addCriterion("SYMBOL_YEAR <>", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearGreaterThan(String value) {
            addCriterion("SYMBOL_YEAR >", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearGreaterThanOrEqualTo(String value) {
            addCriterion("SYMBOL_YEAR >=", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearLessThan(String value) {
            addCriterion("SYMBOL_YEAR <", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearLessThanOrEqualTo(String value) {
            addCriterion("SYMBOL_YEAR <=", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearLike(String value) {
            addCriterion("SYMBOL_YEAR like", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearNotLike(String value) {
            addCriterion("SYMBOL_YEAR not like", value, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearIn(List<String> values) {
            addCriterion("SYMBOL_YEAR in", values, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearNotIn(List<String> values) {
            addCriterion("SYMBOL_YEAR not in", values, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearBetween(String value1, String value2) {
            addCriterion("SYMBOL_YEAR between", value1, value2, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolYearNotBetween(String value1, String value2) {
            addCriterion("SYMBOL_YEAR not between", value1, value2, "symbolYear");
            return (Criteria) this;
        }

        public Criteria andSymbolNoIsNull() {
            addCriterion("SYMBOL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSymbolNoIsNotNull() {
            addCriterion("SYMBOL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolNoEqualTo(String value) {
            addCriterion("SYMBOL_NO =", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoNotEqualTo(String value) {
            addCriterion("SYMBOL_NO <>", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoGreaterThan(String value) {
            addCriterion("SYMBOL_NO >", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoGreaterThanOrEqualTo(String value) {
            addCriterion("SYMBOL_NO >=", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoLessThan(String value) {
            addCriterion("SYMBOL_NO <", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoLessThanOrEqualTo(String value) {
            addCriterion("SYMBOL_NO <=", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoLike(String value) {
            addCriterion("SYMBOL_NO like", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoNotLike(String value) {
            addCriterion("SYMBOL_NO not like", value, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoIn(List<String> values) {
            addCriterion("SYMBOL_NO in", values, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoNotIn(List<String> values) {
            addCriterion("SYMBOL_NO not in", values, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoBetween(String value1, String value2) {
            addCriterion("SYMBOL_NO between", value1, value2, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andSymbolNoNotBetween(String value1, String value2) {
            addCriterion("SYMBOL_NO not between", value1, value2, "symbolNo");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIsNull() {
            addCriterion("AUTHORITIES is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIsNotNull() {
            addCriterion("AUTHORITIES is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesEqualTo(String value) {
            addCriterion("AUTHORITIES =", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotEqualTo(String value) {
            addCriterion("AUTHORITIES <>", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesGreaterThan(String value) {
            addCriterion("AUTHORITIES >", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITIES >=", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLessThan(String value) {
            addCriterion("AUTHORITIES <", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITIES <=", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesLike(String value) {
            addCriterion("AUTHORITIES like", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotLike(String value) {
            addCriterion("AUTHORITIES not like", value, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIn(List<String> values) {
            addCriterion("AUTHORITIES in", values, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotIn(List<String> values) {
            addCriterion("AUTHORITIES not in", values, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesBetween(String value1, String value2) {
            addCriterion("AUTHORITIES between", value1, value2, "authorities");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesNotBetween(String value1, String value2) {
            addCriterion("AUTHORITIES not between", value1, value2, "authorities");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("DEADLINE =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("DEADLINE <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("DEADLINE >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("DEADLINE >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("DEADLINE <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("DEADLINE <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("DEADLINE like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("DEADLINE not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("DEADLINE in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("DEADLINE not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("DEADLINE between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("DEADLINE not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("PAGES is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("PAGES is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(String value) {
            addCriterion("PAGES =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(String value) {
            addCriterion("PAGES <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(String value) {
            addCriterion("PAGES >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(String value) {
            addCriterion("PAGES >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(String value) {
            addCriterion("PAGES <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(String value) {
            addCriterion("PAGES <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLike(String value) {
            addCriterion("PAGES like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotLike(String value) {
            addCriterion("PAGES not like", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<String> values) {
            addCriterion("PAGES in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<String> values) {
            addCriterion("PAGES not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(String value1, String value2) {
            addCriterion("PAGES between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(String value1, String value2) {
            addCriterion("PAGES not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNull() {
            addCriterion("COPIES is null");
            return (Criteria) this;
        }

        public Criteria andCopiesIsNotNull() {
            addCriterion("COPIES is not null");
            return (Criteria) this;
        }

        public Criteria andCopiesEqualTo(String value) {
            addCriterion("COPIES =", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotEqualTo(String value) {
            addCriterion("COPIES <>", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThan(String value) {
            addCriterion("COPIES >", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesGreaterThanOrEqualTo(String value) {
            addCriterion("COPIES >=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThan(String value) {
            addCriterion("COPIES <", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLessThanOrEqualTo(String value) {
            addCriterion("COPIES <=", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesLike(String value) {
            addCriterion("COPIES like", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotLike(String value) {
            addCriterion("COPIES not like", value, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesIn(List<String> values) {
            addCriterion("COPIES in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotIn(List<String> values) {
            addCriterion("COPIES not in", values, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesBetween(String value1, String value2) {
            addCriterion("COPIES between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andCopiesNotBetween(String value1, String value2) {
            addCriterion("COPIES not between", value1, value2, "copies");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNull() {
            addCriterion("VIEW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNotNull() {
            addCriterion("VIEW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andViewNameEqualTo(String value) {
            addCriterion("VIEW_NAME =", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotEqualTo(String value) {
            addCriterion("VIEW_NAME <>", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThan(String value) {
            addCriterion("VIEW_NAME >", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_NAME >=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThan(String value) {
            addCriterion("VIEW_NAME <", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThanOrEqualTo(String value) {
            addCriterion("VIEW_NAME <=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLike(String value) {
            addCriterion("VIEW_NAME like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotLike(String value) {
            addCriterion("VIEW_NAME not like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameIn(List<String> values) {
            addCriterion("VIEW_NAME in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotIn(List<String> values) {
            addCriterion("VIEW_NAME not in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameBetween(String value1, String value2) {
            addCriterion("VIEW_NAME between", value1, value2, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotBetween(String value1, String value2) {
            addCriterion("VIEW_NAME not between", value1, value2, "viewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameIsNull() {
            addCriterion("UNVIEW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnviewNameIsNotNull() {
            addCriterion("UNVIEW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnviewNameEqualTo(String value) {
            addCriterion("UNVIEW_NAME =", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameNotEqualTo(String value) {
            addCriterion("UNVIEW_NAME <>", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameGreaterThan(String value) {
            addCriterion("UNVIEW_NAME >", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNVIEW_NAME >=", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameLessThan(String value) {
            addCriterion("UNVIEW_NAME <", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameLessThanOrEqualTo(String value) {
            addCriterion("UNVIEW_NAME <=", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameLike(String value) {
            addCriterion("UNVIEW_NAME like", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameNotLike(String value) {
            addCriterion("UNVIEW_NAME not like", value, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameIn(List<String> values) {
            addCriterion("UNVIEW_NAME in", values, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameNotIn(List<String> values) {
            addCriterion("UNVIEW_NAME not in", values, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameBetween(String value1, String value2) {
            addCriterion("UNVIEW_NAME between", value1, value2, "unviewName");
            return (Criteria) this;
        }

        public Criteria andUnviewNameNotBetween(String value1, String value2) {
            addCriterion("UNVIEW_NAME not between", value1, value2, "unviewName");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNull() {
            addCriterion("IS_RELEASE is null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIsNotNull() {
            addCriterion("IS_RELEASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReleaseEqualTo(Integer value) {
            addCriterion("IS_RELEASE =", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotEqualTo(Integer value) {
            addCriterion("IS_RELEASE <>", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThan(Integer value) {
            addCriterion("IS_RELEASE >", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RELEASE >=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThan(Integer value) {
            addCriterion("IS_RELEASE <", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RELEASE <=", value, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseIn(List<Integer> values) {
            addCriterion("IS_RELEASE in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotIn(List<Integer> values) {
            addCriterion("IS_RELEASE not in", values, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseBetween(Integer value1, Integer value2) {
            addCriterion("IS_RELEASE between", value1, value2, "isRelease");
            return (Criteria) this;
        }

        public Criteria andIsReleaseNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RELEASE not between", value1, value2, "isRelease");
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