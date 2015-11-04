package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_T_Flow_FileOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Flow_FileOutExample() {
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

        public Criteria andFileoutRecordtypeidIsNull() {
            addCriterion("FILEOUT_RECORDTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidIsNotNull() {
            addCriterion("FILEOUT_RECORDTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID =", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <>", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidGreaterThan(String value) {
            addCriterion("FILEOUT_RECORDTYPEID >", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID >=", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLessThan(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <=", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLike(String value) {
            addCriterion("FILEOUT_RECORDTYPEID like", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotLike(String value) {
            addCriterion("FILEOUT_RECORDTYPEID not like", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidIn(List<String> values) {
            addCriterion("FILEOUT_RECORDTYPEID in", values, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotIn(List<String> values) {
            addCriterion("FILEOUT_RECORDTYPEID not in", values, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidBetween(String value1, String value2) {
            addCriterion("FILEOUT_RECORDTYPEID between", value1, value2, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_RECORDTYPEID not between", value1, value2, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIsNull() {
            addCriterion("FILEOUT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIsNotNull() {
            addCriterion("FILEOUT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutYearEqualTo(String value) {
            addCriterion("FILEOUT_YEAR =", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotEqualTo(String value) {
            addCriterion("FILEOUT_YEAR <>", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearGreaterThan(String value) {
            addCriterion("FILEOUT_YEAR >", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_YEAR >=", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLessThan(String value) {
            addCriterion("FILEOUT_YEAR <", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_YEAR <=", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLike(String value) {
            addCriterion("FILEOUT_YEAR like", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotLike(String value) {
            addCriterion("FILEOUT_YEAR not like", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIn(List<String> values) {
            addCriterion("FILEOUT_YEAR in", values, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotIn(List<String> values) {
            addCriterion("FILEOUT_YEAR not in", values, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearBetween(String value1, String value2) {
            addCriterion("FILEOUT_YEAR between", value1, value2, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_YEAR not between", value1, value2, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIsNull() {
            addCriterion("FILEOUT_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIsNotNull() {
            addCriterion("FILEOUT_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL =", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL <>", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialGreaterThan(String value) {
            addCriterion("FILEOUT_SERIAL >", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL >=", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLessThan(String value) {
            addCriterion("FILEOUT_SERIAL <", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL <=", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLike(String value) {
            addCriterion("FILEOUT_SERIAL like", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotLike(String value) {
            addCriterion("FILEOUT_SERIAL not like", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIn(List<String> values) {
            addCriterion("FILEOUT_SERIAL in", values, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotIn(List<String> values) {
            addCriterion("FILEOUT_SERIAL not in", values, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialBetween(String value1, String value2) {
            addCriterion("FILEOUT_SERIAL between", value1, value2, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_SERIAL not between", value1, value2, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIsNull() {
            addCriterion("FILEOUT_URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIsNotNull() {
            addCriterion("FILEOUT_URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY =", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY <>", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyGreaterThan(String value) {
            addCriterion("FILEOUT_URGENCY >", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY >=", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLessThan(String value) {
            addCriterion("FILEOUT_URGENCY <", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY <=", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLike(String value) {
            addCriterion("FILEOUT_URGENCY like", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotLike(String value) {
            addCriterion("FILEOUT_URGENCY not like", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIn(List<String> values) {
            addCriterion("FILEOUT_URGENCY in", values, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotIn(List<String> values) {
            addCriterion("FILEOUT_URGENCY not in", values, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyBetween(String value1, String value2) {
            addCriterion("FILEOUT_URGENCY between", value1, value2, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_URGENCY not between", value1, value2, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelIsNull() {
            addCriterion("FILEOUT_SECRETLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelIsNotNull() {
            addCriterion("FILEOUT_SECRETLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelEqualTo(String value) {
            addCriterion("FILEOUT_SECRETLEVEL =", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelNotEqualTo(String value) {
            addCriterion("FILEOUT_SECRETLEVEL <>", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelGreaterThan(String value) {
            addCriterion("FILEOUT_SECRETLEVEL >", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SECRETLEVEL >=", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelLessThan(String value) {
            addCriterion("FILEOUT_SECRETLEVEL <", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SECRETLEVEL <=", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelLike(String value) {
            addCriterion("FILEOUT_SECRETLEVEL like", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelNotLike(String value) {
            addCriterion("FILEOUT_SECRETLEVEL not like", value, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelIn(List<String> values) {
            addCriterion("FILEOUT_SECRETLEVEL in", values, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelNotIn(List<String> values) {
            addCriterion("FILEOUT_SECRETLEVEL not in", values, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelBetween(String value1, String value2) {
            addCriterion("FILEOUT_SECRETLEVEL between", value1, value2, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutSecretlevelNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_SECRETLEVEL not between", value1, value2, "fileoutSecretlevel");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishIsNull() {
            addCriterion("FILEOUT_ISPUBLISH is null");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishIsNotNull() {
            addCriterion("FILEOUT_ISPUBLISH is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishEqualTo(String value) {
            addCriterion("FILEOUT_ISPUBLISH =", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishNotEqualTo(String value) {
            addCriterion("FILEOUT_ISPUBLISH <>", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishGreaterThan(String value) {
            addCriterion("FILEOUT_ISPUBLISH >", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_ISPUBLISH >=", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishLessThan(String value) {
            addCriterion("FILEOUT_ISPUBLISH <", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_ISPUBLISH <=", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishLike(String value) {
            addCriterion("FILEOUT_ISPUBLISH like", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishNotLike(String value) {
            addCriterion("FILEOUT_ISPUBLISH not like", value, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishIn(List<String> values) {
            addCriterion("FILEOUT_ISPUBLISH in", values, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishNotIn(List<String> values) {
            addCriterion("FILEOUT_ISPUBLISH not in", values, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishBetween(String value1, String value2) {
            addCriterion("FILEOUT_ISPUBLISH between", value1, value2, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutIspublishNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_ISPUBLISH not between", value1, value2, "fileoutIspublish");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterIsNull() {
            addCriterion("FILEOUT_DRAFTER is null");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterIsNotNull() {
            addCriterion("FILEOUT_DRAFTER is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterEqualTo(String value) {
            addCriterion("FILEOUT_DRAFTER =", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterNotEqualTo(String value) {
            addCriterion("FILEOUT_DRAFTER <>", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterGreaterThan(String value) {
            addCriterion("FILEOUT_DRAFTER >", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFTER >=", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterLessThan(String value) {
            addCriterion("FILEOUT_DRAFTER <", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFTER <=", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterLike(String value) {
            addCriterion("FILEOUT_DRAFTER like", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterNotLike(String value) {
            addCriterion("FILEOUT_DRAFTER not like", value, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterIn(List<String> values) {
            addCriterion("FILEOUT_DRAFTER in", values, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterNotIn(List<String> values) {
            addCriterion("FILEOUT_DRAFTER not in", values, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFTER between", value1, value2, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDrafterNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFTER not between", value1, value2, "fileoutDrafter");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateIsNull() {
            addCriterion("FILEOUT_DRAFT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateIsNotNull() {
            addCriterion("FILEOUT_DRAFT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE =", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <>", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateGreaterThan(String value) {
            addCriterion("FILEOUT_DRAFT_DATE >", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE >=", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLessThan(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <=", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLike(String value) {
            addCriterion("FILEOUT_DRAFT_DATE like", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotLike(String value) {
            addCriterion("FILEOUT_DRAFT_DATE not like", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT_DATE in", values, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT_DATE not in", values, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT_DATE between", value1, value2, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT_DATE not between", value1, value2, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIsNull() {
            addCriterion("FILEOUT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIsNotNull() {
            addCriterion("FILEOUT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleEqualTo(String value) {
            addCriterion("FILEOUT_TITLE =", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotEqualTo(String value) {
            addCriterion("FILEOUT_TITLE <>", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleGreaterThan(String value) {
            addCriterion("FILEOUT_TITLE >", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_TITLE >=", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLessThan(String value) {
            addCriterion("FILEOUT_TITLE <", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_TITLE <=", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLike(String value) {
            addCriterion("FILEOUT_TITLE like", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotLike(String value) {
            addCriterion("FILEOUT_TITLE not like", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIn(List<String> values) {
            addCriterion("FILEOUT_TITLE in", values, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotIn(List<String> values) {
            addCriterion("FILEOUT_TITLE not in", values, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleBetween(String value1, String value2) {
            addCriterion("FILEOUT_TITLE between", value1, value2, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_TITLE not between", value1, value2, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainIsNull() {
            addCriterion("FILEOUT_DEPTMENTMAIN is null");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainIsNotNull() {
            addCriterion("FILEOUT_DEPTMENTMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainEqualTo(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN =", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainNotEqualTo(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN <>", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainGreaterThan(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN >", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN >=", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainLessThan(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN <", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN <=", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainLike(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN like", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainNotLike(String value) {
            addCriterion("FILEOUT_DEPTMENTMAIN not like", value, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainIn(List<String> values) {
            addCriterion("FILEOUT_DEPTMENTMAIN in", values, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainNotIn(List<String> values) {
            addCriterion("FILEOUT_DEPTMENTMAIN not in", values, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainBetween(String value1, String value2) {
            addCriterion("FILEOUT_DEPTMENTMAIN between", value1, value2, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutDeptmentmainNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_DEPTMENTMAIN not between", value1, value2, "fileoutDeptmentmain");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyIsNull() {
            addCriterion("FILEOUT_CARBONCOPY is null");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyIsNotNull() {
            addCriterion("FILEOUT_CARBONCOPY is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyEqualTo(String value) {
            addCriterion("FILEOUT_CARBONCOPY =", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyNotEqualTo(String value) {
            addCriterion("FILEOUT_CARBONCOPY <>", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyGreaterThan(String value) {
            addCriterion("FILEOUT_CARBONCOPY >", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CARBONCOPY >=", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyLessThan(String value) {
            addCriterion("FILEOUT_CARBONCOPY <", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CARBONCOPY <=", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyLike(String value) {
            addCriterion("FILEOUT_CARBONCOPY like", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyNotLike(String value) {
            addCriterion("FILEOUT_CARBONCOPY not like", value, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyIn(List<String> values) {
            addCriterion("FILEOUT_CARBONCOPY in", values, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyNotIn(List<String> values) {
            addCriterion("FILEOUT_CARBONCOPY not in", values, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyBetween(String value1, String value2) {
            addCriterion("FILEOUT_CARBONCOPY between", value1, value2, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutCarboncopyNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_CARBONCOPY not between", value1, value2, "fileoutCarboncopy");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsIsNull() {
            addCriterion("FILEOUT_SUBJECTWORDS is null");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsIsNotNull() {
            addCriterion("FILEOUT_SUBJECTWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsEqualTo(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS =", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsNotEqualTo(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS <>", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsGreaterThan(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS >", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS >=", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsLessThan(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS <", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS <=", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsLike(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS like", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsNotLike(String value) {
            addCriterion("FILEOUT_SUBJECTWORDS not like", value, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsIn(List<String> values) {
            addCriterion("FILEOUT_SUBJECTWORDS in", values, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsNotIn(List<String> values) {
            addCriterion("FILEOUT_SUBJECTWORDS not in", values, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsBetween(String value1, String value2) {
            addCriterion("FILEOUT_SUBJECTWORDS between", value1, value2, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutSubjectwordsNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_SUBJECTWORDS not between", value1, value2, "fileoutSubjectwords");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftIsNull() {
            addCriterion("FILEOUT_DRAFT is null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftIsNotNull() {
            addCriterion("FILEOUT_DRAFT is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT =", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftNotEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT <>", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftGreaterThan(String value) {
            addCriterion("FILEOUT_DRAFT >", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT >=", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftLessThan(String value) {
            addCriterion("FILEOUT_DRAFT <", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT <=", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftLike(String value) {
            addCriterion("FILEOUT_DRAFT like", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftNotLike(String value) {
            addCriterion("FILEOUT_DRAFT not like", value, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT in", values, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftNotIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT not in", values, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT between", value1, value2, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT not between", value1, value2, "fileoutDraft");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerIsNull() {
            addCriterion("FILEOUT_CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerIsNotNull() {
            addCriterion("FILEOUT_CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerEqualTo(String value) {
            addCriterion("FILEOUT_CHECKER =", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerNotEqualTo(String value) {
            addCriterion("FILEOUT_CHECKER <>", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerGreaterThan(String value) {
            addCriterion("FILEOUT_CHECKER >", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CHECKER >=", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerLessThan(String value) {
            addCriterion("FILEOUT_CHECKER <", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CHECKER <=", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerLike(String value) {
            addCriterion("FILEOUT_CHECKER like", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerNotLike(String value) {
            addCriterion("FILEOUT_CHECKER not like", value, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerIn(List<String> values) {
            addCriterion("FILEOUT_CHECKER in", values, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerNotIn(List<String> values) {
            addCriterion("FILEOUT_CHECKER not in", values, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerBetween(String value1, String value2) {
            addCriterion("FILEOUT_CHECKER between", value1, value2, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutCheckerNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_CHECKER not between", value1, value2, "fileoutChecker");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateIsNull() {
            addCriterion("FILEOUT_PRINTDATE is null");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateIsNotNull() {
            addCriterion("FILEOUT_PRINTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateEqualTo(String value) {
            addCriterion("FILEOUT_PRINTDATE =", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateNotEqualTo(String value) {
            addCriterion("FILEOUT_PRINTDATE <>", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateGreaterThan(String value) {
            addCriterion("FILEOUT_PRINTDATE >", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_PRINTDATE >=", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateLessThan(String value) {
            addCriterion("FILEOUT_PRINTDATE <", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_PRINTDATE <=", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateLike(String value) {
            addCriterion("FILEOUT_PRINTDATE like", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateNotLike(String value) {
            addCriterion("FILEOUT_PRINTDATE not like", value, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateIn(List<String> values) {
            addCriterion("FILEOUT_PRINTDATE in", values, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateNotIn(List<String> values) {
            addCriterion("FILEOUT_PRINTDATE not in", values, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateBetween(String value1, String value2) {
            addCriterion("FILEOUT_PRINTDATE between", value1, value2, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutPrintdateNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_PRINTDATE not between", value1, value2, "fileoutPrintdate");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlIsNull() {
            addCriterion("FILEOUT_CONTENTURL is null");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlIsNotNull() {
            addCriterion("FILEOUT_CONTENTURL is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlEqualTo(String value) {
            addCriterion("FILEOUT_CONTENTURL =", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlNotEqualTo(String value) {
            addCriterion("FILEOUT_CONTENTURL <>", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlGreaterThan(String value) {
            addCriterion("FILEOUT_CONTENTURL >", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CONTENTURL >=", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlLessThan(String value) {
            addCriterion("FILEOUT_CONTENTURL <", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_CONTENTURL <=", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlLike(String value) {
            addCriterion("FILEOUT_CONTENTURL like", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlNotLike(String value) {
            addCriterion("FILEOUT_CONTENTURL not like", value, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlIn(List<String> values) {
            addCriterion("FILEOUT_CONTENTURL in", values, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlNotIn(List<String> values) {
            addCriterion("FILEOUT_CONTENTURL not in", values, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlBetween(String value1, String value2) {
            addCriterion("FILEOUT_CONTENTURL between", value1, value2, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutContenturlNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_CONTENTURL not between", value1, value2, "fileoutContenturl");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsIsNull() {
            addCriterion("FILEOUT_PORTIONS is null");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsIsNotNull() {
            addCriterion("FILEOUT_PORTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsEqualTo(String value) {
            addCriterion("FILEOUT_PORTIONS =", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsNotEqualTo(String value) {
            addCriterion("FILEOUT_PORTIONS <>", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsGreaterThan(String value) {
            addCriterion("FILEOUT_PORTIONS >", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_PORTIONS >=", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsLessThan(String value) {
            addCriterion("FILEOUT_PORTIONS <", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_PORTIONS <=", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsLike(String value) {
            addCriterion("FILEOUT_PORTIONS like", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsNotLike(String value) {
            addCriterion("FILEOUT_PORTIONS not like", value, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsIn(List<String> values) {
            addCriterion("FILEOUT_PORTIONS in", values, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsNotIn(List<String> values) {
            addCriterion("FILEOUT_PORTIONS not in", values, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsBetween(String value1, String value2) {
            addCriterion("FILEOUT_PORTIONS between", value1, value2, "fileoutPortions");
            return (Criteria) this;
        }

        public Criteria andFileoutPortionsNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_PORTIONS not between", value1, value2, "fileoutPortions");
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