package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Flow_WithdramalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Flow_WithdramalExample() {
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

        public Criteria andMainIdIsNull() {
            addCriterion("MAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("MAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("MAIN_ID =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("MAIN_ID <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("MAIN_ID >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_ID >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("MAIN_ID <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("MAIN_ID <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("MAIN_ID like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("MAIN_ID not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("MAIN_ID in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("MAIN_ID not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("MAIN_ID between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("MAIN_ID not between", value1, value2, "mainId");
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

        public Criteria andWithdramalFromTacheIsNull() {
            addCriterion("WITHDRAMAL_FROM_TACHE is null");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheIsNotNull() {
            addCriterion("WITHDRAMAL_FROM_TACHE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE =", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheNotEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE <>", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheGreaterThan(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE >", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE >=", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheLessThan(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE <", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE <=", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheLike(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE like", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheNotLike(String value) {
            addCriterion("WITHDRAMAL_FROM_TACHE not like", value, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheIn(List<String> values) {
            addCriterion("WITHDRAMAL_FROM_TACHE in", values, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheNotIn(List<String> values) {
            addCriterion("WITHDRAMAL_FROM_TACHE not in", values, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_FROM_TACHE between", value1, value2, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromTacheNotBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_FROM_TACHE not between", value1, value2, "withdramalFromTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheIsNull() {
            addCriterion("WITHDRAMAL_TO_TACHE is null");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheIsNotNull() {
            addCriterion("WITHDRAMAL_TO_TACHE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE =", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheNotEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE <>", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheGreaterThan(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE >", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE >=", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheLessThan(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE <", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE <=", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheLike(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE like", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheNotLike(String value) {
            addCriterion("WITHDRAMAL_TO_TACHE not like", value, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheIn(List<String> values) {
            addCriterion("WITHDRAMAL_TO_TACHE in", values, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheNotIn(List<String> values) {
            addCriterion("WITHDRAMAL_TO_TACHE not in", values, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_TO_TACHE between", value1, value2, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalToTacheNotBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_TO_TACHE not between", value1, value2, "withdramalToTache");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserIsNull() {
            addCriterion("WITHDRAMAL_FROM_USER is null");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserIsNotNull() {
            addCriterion("WITHDRAMAL_FROM_USER is not null");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_USER =", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserNotEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_USER <>", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserGreaterThan(String value) {
            addCriterion("WITHDRAMAL_FROM_USER >", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_USER >=", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserLessThan(String value) {
            addCriterion("WITHDRAMAL_FROM_USER <", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_FROM_USER <=", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserLike(String value) {
            addCriterion("WITHDRAMAL_FROM_USER like", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserNotLike(String value) {
            addCriterion("WITHDRAMAL_FROM_USER not like", value, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserIn(List<String> values) {
            addCriterion("WITHDRAMAL_FROM_USER in", values, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserNotIn(List<String> values) {
            addCriterion("WITHDRAMAL_FROM_USER not in", values, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_FROM_USER between", value1, value2, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalFromUserNotBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_FROM_USER not between", value1, value2, "withdramalFromUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserIsNull() {
            addCriterion("WITHDRAMAL_TO_USER is null");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserIsNotNull() {
            addCriterion("WITHDRAMAL_TO_USER is not null");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_USER =", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserNotEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_USER <>", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserGreaterThan(String value) {
            addCriterion("WITHDRAMAL_TO_USER >", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_USER >=", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserLessThan(String value) {
            addCriterion("WITHDRAMAL_TO_USER <", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAMAL_TO_USER <=", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserLike(String value) {
            addCriterion("WITHDRAMAL_TO_USER like", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserNotLike(String value) {
            addCriterion("WITHDRAMAL_TO_USER not like", value, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserIn(List<String> values) {
            addCriterion("WITHDRAMAL_TO_USER in", values, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserNotIn(List<String> values) {
            addCriterion("WITHDRAMAL_TO_USER not in", values, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_TO_USER between", value1, value2, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalToUserNotBetween(String value1, String value2) {
            addCriterion("WITHDRAMAL_TO_USER not between", value1, value2, "withdramalToUser");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionIsNull() {
            addCriterion("WITHDRAMALOPINION is null");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionIsNotNull() {
            addCriterion("WITHDRAMALOPINION is not null");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionEqualTo(String value) {
            addCriterion("WITHDRAMALOPINION =", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionNotEqualTo(String value) {
            addCriterion("WITHDRAMALOPINION <>", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionGreaterThan(String value) {
            addCriterion("WITHDRAMALOPINION >", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAMALOPINION >=", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionLessThan(String value) {
            addCriterion("WITHDRAMALOPINION <", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAMALOPINION <=", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionLike(String value) {
            addCriterion("WITHDRAMALOPINION like", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionNotLike(String value) {
            addCriterion("WITHDRAMALOPINION not like", value, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionIn(List<String> values) {
            addCriterion("WITHDRAMALOPINION in", values, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionNotIn(List<String> values) {
            addCriterion("WITHDRAMALOPINION not in", values, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionBetween(String value1, String value2) {
            addCriterion("WITHDRAMALOPINION between", value1, value2, "withdramalopinion");
            return (Criteria) this;
        }

        public Criteria andWithdramalopinionNotBetween(String value1, String value2) {
            addCriterion("WITHDRAMALOPINION not between", value1, value2, "withdramalopinion");
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