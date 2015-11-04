package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_V_Flow_RouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Flow_RouteExample() {
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

        public Criteria andCurTacheIdIsNull() {
            addCriterion("CUR_TACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdIsNotNull() {
            addCriterion("CUR_TACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdEqualTo(String value) {
            addCriterion("CUR_TACHE_ID =", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdNotEqualTo(String value) {
            addCriterion("CUR_TACHE_ID <>", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdGreaterThan(String value) {
            addCriterion("CUR_TACHE_ID >", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_TACHE_ID >=", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdLessThan(String value) {
            addCriterion("CUR_TACHE_ID <", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdLessThanOrEqualTo(String value) {
            addCriterion("CUR_TACHE_ID <=", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdLike(String value) {
            addCriterion("CUR_TACHE_ID like", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdNotLike(String value) {
            addCriterion("CUR_TACHE_ID not like", value, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdIn(List<String> values) {
            addCriterion("CUR_TACHE_ID in", values, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdNotIn(List<String> values) {
            addCriterion("CUR_TACHE_ID not in", values, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdBetween(String value1, String value2) {
            addCriterion("CUR_TACHE_ID between", value1, value2, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andCurTacheIdNotBetween(String value1, String value2) {
            addCriterion("CUR_TACHE_ID not between", value1, value2, "curTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdIsNull() {
            addCriterion("NEXT_TACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdIsNotNull() {
            addCriterion("NEXT_TACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdEqualTo(String value) {
            addCriterion("NEXT_TACHE_ID =", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdNotEqualTo(String value) {
            addCriterion("NEXT_TACHE_ID <>", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdGreaterThan(String value) {
            addCriterion("NEXT_TACHE_ID >", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_TACHE_ID >=", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdLessThan(String value) {
            addCriterion("NEXT_TACHE_ID <", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdLessThanOrEqualTo(String value) {
            addCriterion("NEXT_TACHE_ID <=", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdLike(String value) {
            addCriterion("NEXT_TACHE_ID like", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdNotLike(String value) {
            addCriterion("NEXT_TACHE_ID not like", value, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdIn(List<String> values) {
            addCriterion("NEXT_TACHE_ID in", values, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdNotIn(List<String> values) {
            addCriterion("NEXT_TACHE_ID not in", values, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdBetween(String value1, String value2) {
            addCriterion("NEXT_TACHE_ID between", value1, value2, "nextTacheId");
            return (Criteria) this;
        }

        public Criteria andNextTacheIdNotBetween(String value1, String value2) {
            addCriterion("NEXT_TACHE_ID not between", value1, value2, "nextTacheId");
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

        public Criteria andChangeTacheIdIsNull() {
            addCriterion("CHANGE_TACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdIsNotNull() {
            addCriterion("CHANGE_TACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdEqualTo(String value) {
            addCriterion("CHANGE_TACHE_ID =", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdNotEqualTo(String value) {
            addCriterion("CHANGE_TACHE_ID <>", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdGreaterThan(String value) {
            addCriterion("CHANGE_TACHE_ID >", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TACHE_ID >=", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdLessThan(String value) {
            addCriterion("CHANGE_TACHE_ID <", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TACHE_ID <=", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdLike(String value) {
            addCriterion("CHANGE_TACHE_ID like", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdNotLike(String value) {
            addCriterion("CHANGE_TACHE_ID not like", value, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdIn(List<String> values) {
            addCriterion("CHANGE_TACHE_ID in", values, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdNotIn(List<String> values) {
            addCriterion("CHANGE_TACHE_ID not in", values, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdBetween(String value1, String value2) {
            addCriterion("CHANGE_TACHE_ID between", value1, value2, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andChangeTacheIdNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TACHE_ID not between", value1, value2, "changeTacheId");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeIsNull() {
            addCriterion("TRANSACTOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeIsNotNull() {
            addCriterion("TRANSACTOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeEqualTo(Integer value) {
            addCriterion("TRANSACTOR_TYPE =", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeNotEqualTo(Integer value) {
            addCriterion("TRANSACTOR_TYPE <>", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeGreaterThan(Integer value) {
            addCriterion("TRANSACTOR_TYPE >", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTOR_TYPE >=", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeLessThan(Integer value) {
            addCriterion("TRANSACTOR_TYPE <", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTOR_TYPE <=", value, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeIn(List<Integer> values) {
            addCriterion("TRANSACTOR_TYPE in", values, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeNotIn(List<Integer> values) {
            addCriterion("TRANSACTOR_TYPE not in", values, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTOR_TYPE between", value1, value2, "transactorType");
            return (Criteria) this;
        }

        public Criteria andTransactorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTOR_TYPE not between", value1, value2, "transactorType");
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