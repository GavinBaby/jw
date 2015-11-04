package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Flow_Tache_InforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Flow_Tache_InforExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("FLOW_ID like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("FLOW_ID not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
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

        public Criteria andTacheNameIsNull() {
            addCriterion("TACHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTacheNameIsNotNull() {
            addCriterion("TACHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTacheNameEqualTo(String value) {
            addCriterion("TACHE_NAME =", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameNotEqualTo(String value) {
            addCriterion("TACHE_NAME <>", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameGreaterThan(String value) {
            addCriterion("TACHE_NAME >", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_NAME >=", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameLessThan(String value) {
            addCriterion("TACHE_NAME <", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameLessThanOrEqualTo(String value) {
            addCriterion("TACHE_NAME <=", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameLike(String value) {
            addCriterion("TACHE_NAME like", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameNotLike(String value) {
            addCriterion("TACHE_NAME not like", value, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameIn(List<String> values) {
            addCriterion("TACHE_NAME in", values, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameNotIn(List<String> values) {
            addCriterion("TACHE_NAME not in", values, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameBetween(String value1, String value2) {
            addCriterion("TACHE_NAME between", value1, value2, "tacheName");
            return (Criteria) this;
        }

        public Criteria andTacheNameNotBetween(String value1, String value2) {
            addCriterion("TACHE_NAME not between", value1, value2, "tacheName");
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

        public Criteria andTacheSmsIdIsNull() {
            addCriterion("TACHE_SMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdIsNotNull() {
            addCriterion("TACHE_SMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdEqualTo(String value) {
            addCriterion("TACHE_SMS_ID =", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdNotEqualTo(String value) {
            addCriterion("TACHE_SMS_ID <>", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdGreaterThan(String value) {
            addCriterion("TACHE_SMS_ID >", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_SMS_ID >=", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdLessThan(String value) {
            addCriterion("TACHE_SMS_ID <", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdLessThanOrEqualTo(String value) {
            addCriterion("TACHE_SMS_ID <=", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdLike(String value) {
            addCriterion("TACHE_SMS_ID like", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdNotLike(String value) {
            addCriterion("TACHE_SMS_ID not like", value, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdIn(List<String> values) {
            addCriterion("TACHE_SMS_ID in", values, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdNotIn(List<String> values) {
            addCriterion("TACHE_SMS_ID not in", values, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdBetween(String value1, String value2) {
            addCriterion("TACHE_SMS_ID between", value1, value2, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheSmsIdNotBetween(String value1, String value2) {
            addCriterion("TACHE_SMS_ID not between", value1, value2, "tacheSmsId");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitIsNull() {
            addCriterion("TACHE_IS_CONFIRMSUBMIT is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitIsNotNull() {
            addCriterion("TACHE_IS_CONFIRMSUBMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitEqualTo(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT =", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT <>", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitGreaterThan(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT >", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT >=", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitLessThan(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT <", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT <=", value, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitIn(List<Integer> values) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT in", values, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT not in", values, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT between", value1, value2, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsConfirmsubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_CONFIRMSUBMIT not between", value1, value2, "tacheIsConfirmsubmit");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassIsNull() {
            addCriterion("TACHE_IS_PERMITPASS is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassIsNotNull() {
            addCriterion("TACHE_IS_PERMITPASS is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassEqualTo(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS =", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS <>", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassGreaterThan(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS >", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS >=", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassLessThan(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS <", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_PERMITPASS <=", value, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassIn(List<Integer> values) {
            addCriterion("TACHE_IS_PERMITPASS in", values, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_PERMITPASS not in", values, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_PERMITPASS between", value1, value2, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsPermitpassNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_PERMITPASS not between", value1, value2, "tacheIsPermitpass");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackIsNull() {
            addCriterion("TACHE_IS_DRAWBACK is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackIsNotNull() {
            addCriterion("TACHE_IS_DRAWBACK is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackEqualTo(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK =", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK <>", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackGreaterThan(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK >", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK >=", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackLessThan(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK <", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_DRAWBACK <=", value, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackIn(List<Integer> values) {
            addCriterion("TACHE_IS_DRAWBACK in", values, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_DRAWBACK not in", values, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_DRAWBACK between", value1, value2, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsDrawbackNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_DRAWBACK not between", value1, value2, "tacheIsDrawback");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalIsNull() {
            addCriterion("TACHE_IS_WITHDRAMAL is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalIsNotNull() {
            addCriterion("TACHE_IS_WITHDRAMAL is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalEqualTo(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL =", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL <>", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalGreaterThan(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL >", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL >=", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalLessThan(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL <", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_WITHDRAMAL <=", value, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalIn(List<Integer> values) {
            addCriterion("TACHE_IS_WITHDRAMAL in", values, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_WITHDRAMAL not in", values, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_WITHDRAMAL between", value1, value2, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsWithdramalNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_WITHDRAMAL not between", value1, value2, "tacheIsWithdramal");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeIsNull() {
            addCriterion("TACHE_IS_HANDURGE is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeIsNotNull() {
            addCriterion("TACHE_IS_HANDURGE is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeEqualTo(Integer value) {
            addCriterion("TACHE_IS_HANDURGE =", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_HANDURGE <>", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeGreaterThan(Integer value) {
            addCriterion("TACHE_IS_HANDURGE >", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_HANDURGE >=", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeLessThan(Integer value) {
            addCriterion("TACHE_IS_HANDURGE <", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_HANDURGE <=", value, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeIn(List<Integer> values) {
            addCriterion("TACHE_IS_HANDURGE in", values, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_HANDURGE not in", values, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_HANDURGE between", value1, value2, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsHandurgeNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_HANDURGE not between", value1, value2, "tacheIsHandurge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeIsNull() {
            addCriterion("TACHE_IS_AUTOURGE is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeIsNotNull() {
            addCriterion("TACHE_IS_AUTOURGE is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeEqualTo(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE =", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE <>", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeGreaterThan(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE >", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE >=", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeLessThan(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE <", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_AUTOURGE <=", value, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeIn(List<Integer> values) {
            addCriterion("TACHE_IS_AUTOURGE in", values, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_AUTOURGE not in", values, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_AUTOURGE between", value1, value2, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheIsAutourgeNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_AUTOURGE not between", value1, value2, "tacheIsAutourge");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsIsNull() {
            addCriterion("TACHE_DO_IS_SENT_SMS is null");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsIsNotNull() {
            addCriterion("TACHE_DO_IS_SENT_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS =", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsNotEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS <>", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsGreaterThan(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS >", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS >=", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsLessThan(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS <", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_SMS <=", value, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsIn(List<Integer> values) {
            addCriterion("TACHE_DO_IS_SENT_SMS in", values, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsNotIn(List<Integer> values) {
            addCriterion("TACHE_DO_IS_SENT_SMS not in", values, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_IS_SENT_SMS between", value1, value2, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_IS_SENT_SMS not between", value1, value2, "tacheDoIsSentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsIsNull() {
            addCriterion("TACHE_PASS_IS_SENTSMS is null");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsIsNotNull() {
            addCriterion("TACHE_PASS_IS_SENTSMS is not null");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS =", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsNotEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS <>", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsGreaterThan(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS >", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS >=", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsLessThan(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS <", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENTSMS <=", value, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsIn(List<Integer> values) {
            addCriterion("TACHE_PASS_IS_SENTSMS in", values, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsNotIn(List<Integer> values) {
            addCriterion("TACHE_PASS_IS_SENTSMS not in", values, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_IS_SENTSMS between", value1, value2, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentsmsNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_IS_SENTSMS not between", value1, value2, "tachePassIsSentsms");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgIsNull() {
            addCriterion("TACHE_DO_IS_SENT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgIsNotNull() {
            addCriterion("TACHE_DO_IS_SENT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG =", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgNotEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG <>", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgGreaterThan(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG >", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG >=", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgLessThan(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG <", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_IS_SENT_MSG <=", value, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgIn(List<Integer> values) {
            addCriterion("TACHE_DO_IS_SENT_MSG in", values, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgNotIn(List<Integer> values) {
            addCriterion("TACHE_DO_IS_SENT_MSG not in", values, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_IS_SENT_MSG between", value1, value2, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoIsSentMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_IS_SENT_MSG not between", value1, value2, "tacheDoIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgIsNull() {
            addCriterion("TACHE_PASS_IS_SENT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgIsNotNull() {
            addCriterion("TACHE_PASS_IS_SENT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG =", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgNotEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG <>", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgGreaterThan(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG >", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG >=", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgLessThan(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG <", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_IS_SENT_MSG <=", value, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgIn(List<Integer> values) {
            addCriterion("TACHE_PASS_IS_SENT_MSG in", values, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgNotIn(List<Integer> values) {
            addCriterion("TACHE_PASS_IS_SENT_MSG not in", values, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_IS_SENT_MSG between", value1, value2, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassIsSentMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_IS_SENT_MSG not between", value1, value2, "tachePassIsSentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsIsNull() {
            addCriterion("TACHE_DO_FOR_CESENT_SMS is null");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsIsNotNull() {
            addCriterion("TACHE_DO_FOR_CESENT_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS =", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsNotEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS <>", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsGreaterThan(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS >", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS >=", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsLessThan(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS <", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS <=", value, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsIn(List<Integer> values) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS in", values, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsNotIn(List<Integer> values) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS not in", values, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS between", value1, value2, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_FOR_CESENT_SMS not between", value1, value2, "tacheDoForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsIsNull() {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS is null");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsIsNotNull() {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS =", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsNotEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS <>", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsGreaterThan(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS >", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS >=", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsLessThan(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS <", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS <=", value, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsIn(List<Integer> values) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS in", values, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsNotIn(List<Integer> values) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS not in", values, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS between", value1, value2, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_FOR_CESENT_SMS not between", value1, value2, "tachePassForCesentSms");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgIsNull() {
            addCriterion("TACHE_DO_FOR_CESENT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgIsNotNull() {
            addCriterion("TACHE_DO_FOR_CESENT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG =", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgNotEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG <>", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgGreaterThan(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG >", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG >=", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgLessThan(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG <", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG <=", value, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgIn(List<Integer> values) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG in", values, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgNotIn(List<Integer> values) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG not in", values, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG between", value1, value2, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheDoForCesentMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_DO_FOR_CESENT_MSG not between", value1, value2, "tacheDoForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgIsNull() {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgIsNotNull() {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG =", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgNotEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG <>", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgGreaterThan(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG >", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG >=", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgLessThan(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG <", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG <=", value, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgIn(List<Integer> values) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG in", values, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgNotIn(List<Integer> values) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG not in", values, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG between", value1, value2, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTachePassForCesentMsgNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_PASS_FOR_CESENT_MSG not between", value1, value2, "tachePassForCesentMsg");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitIsNull() {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT is null");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitIsNotNull() {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitEqualTo(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT =", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitNotEqualTo(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT <>", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitGreaterThan(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT >", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT >=", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitLessThan(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT <", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT <=", value, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitIn(List<Integer> values) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT in", values, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitNotIn(List<Integer> values) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT not in", values, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT between", value1, value2, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheOneDirectSubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_ONE_DIRECT_SUBMIT not between", value1, value2, "tacheOneDirectSubmit");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonIsNull() {
            addCriterion("TACHE_SHOW_MYDEP_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonIsNotNull() {
            addCriterion("TACHE_SHOW_MYDEP_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON =", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonNotEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON <>", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonGreaterThan(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON >", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON >=", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonLessThan(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON <", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON <=", value, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonIn(List<Integer> values) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON in", values, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonNotIn(List<Integer> values) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON not in", values, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON between", value1, value2, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowMydepPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_SHOW_MYDEP_PERSON not between", value1, value2, "tacheShowMydepPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonIsNull() {
            addCriterion("TACHE_SHOW_ALL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonIsNotNull() {
            addCriterion("TACHE_SHOW_ALL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON =", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonNotEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON <>", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonGreaterThan(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON >", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON >=", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonLessThan(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON <", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_SHOW_ALL_PERSON <=", value, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonIn(List<Integer> values) {
            addCriterion("TACHE_SHOW_ALL_PERSON in", values, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonNotIn(List<Integer> values) {
            addCriterion("TACHE_SHOW_ALL_PERSON not in", values, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_SHOW_ALL_PERSON between", value1, value2, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheShowAllPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_SHOW_ALL_PERSON not between", value1, value2, "tacheShowAllPerson");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserIsNull() {
            addCriterion("TACHE_IS_SINGLE_USER is null");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserIsNotNull() {
            addCriterion("TACHE_IS_SINGLE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserEqualTo(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER =", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserNotEqualTo(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER <>", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserGreaterThan(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER >", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER >=", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserLessThan(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER <", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_IS_SINGLE_USER <=", value, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserIn(List<Integer> values) {
            addCriterion("TACHE_IS_SINGLE_USER in", values, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserNotIn(List<Integer> values) {
            addCriterion("TACHE_IS_SINGLE_USER not in", values, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_SINGLE_USER between", value1, value2, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheIsSingleUserNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_IS_SINGLE_USER not between", value1, value2, "tacheIsSingleUser");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneIsNull() {
            addCriterion("TACHE_NEXT_SEVERAL_DONE is null");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneIsNotNull() {
            addCriterion("TACHE_NEXT_SEVERAL_DONE is not null");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneEqualTo(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE =", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneNotEqualTo(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE <>", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneGreaterThan(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE >", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE >=", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneLessThan(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE <", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneLessThanOrEqualTo(Integer value) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE <=", value, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneIn(List<Integer> values) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE in", values, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneNotIn(List<Integer> values) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE not in", values, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE between", value1, value2, "tacheNextSeveralDone");
            return (Criteria) this;
        }

        public Criteria andTacheNextSeveralDoneNotBetween(Integer value1, Integer value2) {
            addCriterion("TACHE_NEXT_SEVERAL_DONE not between", value1, value2, "tacheNextSeveralDone");
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