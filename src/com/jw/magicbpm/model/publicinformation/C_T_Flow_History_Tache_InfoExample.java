package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class C_T_Flow_History_Tache_InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Flow_History_Tache_InfoExample() {
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

        public Criteria andMainDocIdIsNull() {
            addCriterion("MAIN_DOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainDocIdIsNotNull() {
            addCriterion("MAIN_DOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainDocIdEqualTo(String value) {
            addCriterion("MAIN_DOC_ID =", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdNotEqualTo(String value) {
            addCriterion("MAIN_DOC_ID <>", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdGreaterThan(String value) {
            addCriterion("MAIN_DOC_ID >", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_DOC_ID >=", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdLessThan(String value) {
            addCriterion("MAIN_DOC_ID <", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdLessThanOrEqualTo(String value) {
            addCriterion("MAIN_DOC_ID <=", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdLike(String value) {
            addCriterion("MAIN_DOC_ID like", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdNotLike(String value) {
            addCriterion("MAIN_DOC_ID not like", value, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdIn(List<String> values) {
            addCriterion("MAIN_DOC_ID in", values, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdNotIn(List<String> values) {
            addCriterion("MAIN_DOC_ID not in", values, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdBetween(String value1, String value2) {
            addCriterion("MAIN_DOC_ID between", value1, value2, "mainDocId");
            return (Criteria) this;
        }

        public Criteria andMainDocIdNotBetween(String value1, String value2) {
            addCriterion("MAIN_DOC_ID not between", value1, value2, "mainDocId");
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

        public Criteria andTacheTransactorSysIsNull() {
            addCriterion("TACHE_TRANSACTOR_SYS is null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysIsNotNull() {
            addCriterion("TACHE_TRANSACTOR_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS =", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysNotEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS <>", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysGreaterThan(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS >", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS >=", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysLessThan(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS <", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysLessThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS <=", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysLike(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS like", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysNotLike(String value) {
            addCriterion("TACHE_TRANSACTOR_SYS not like", value, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_SYS in", values, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysNotIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_SYS not in", values, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_SYS between", value1, value2, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorSysNotBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_SYS not between", value1, value2, "tacheTransactorSys");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameIsNull() {
            addCriterion("TACHE_TRANSACTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameIsNotNull() {
            addCriterion("TACHE_TRANSACTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME =", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameNotEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME <>", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameGreaterThan(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME >", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME >=", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameLessThan(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME <", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameLessThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME <=", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameLike(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME like", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameNotLike(String value) {
            addCriterion("TACHE_TRANSACTOR_NAME not like", value, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_NAME in", values, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameNotIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_NAME not in", values, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_NAME between", value1, value2, "tacheTransactorName");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorNameNotBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_NAME not between", value1, value2, "tacheTransactorName");
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

        public Criteria andCurTacheNameIsNull() {
            addCriterion("CUR_TACHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameIsNotNull() {
            addCriterion("CUR_TACHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameEqualTo(String value) {
            addCriterion("CUR_TACHE_NAME =", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameNotEqualTo(String value) {
            addCriterion("CUR_TACHE_NAME <>", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameGreaterThan(String value) {
            addCriterion("CUR_TACHE_NAME >", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_TACHE_NAME >=", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameLessThan(String value) {
            addCriterion("CUR_TACHE_NAME <", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameLessThanOrEqualTo(String value) {
            addCriterion("CUR_TACHE_NAME <=", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameLike(String value) {
            addCriterion("CUR_TACHE_NAME like", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameNotLike(String value) {
            addCriterion("CUR_TACHE_NAME not like", value, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameIn(List<String> values) {
            addCriterion("CUR_TACHE_NAME in", values, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameNotIn(List<String> values) {
            addCriterion("CUR_TACHE_NAME not in", values, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameBetween(String value1, String value2) {
            addCriterion("CUR_TACHE_NAME between", value1, value2, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andCurTacheNameNotBetween(String value1, String value2) {
            addCriterion("CUR_TACHE_NAME not between", value1, value2, "curTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdIsNull() {
            addCriterion("HISTORY_TACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdIsNotNull() {
            addCriterion("HISTORY_TACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdEqualTo(String value) {
            addCriterion("HISTORY_TACHE_ID =", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_ID <>", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_ID >", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_ID >=", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdLessThan(String value) {
            addCriterion("HISTORY_TACHE_ID <", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_ID <=", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdLike(String value) {
            addCriterion("HISTORY_TACHE_ID like", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdNotLike(String value) {
            addCriterion("HISTORY_TACHE_ID not like", value, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdIn(List<String> values) {
            addCriterion("HISTORY_TACHE_ID in", values, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_ID not in", values, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_ID between", value1, value2, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheIdNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_ID not between", value1, value2, "historyTacheId");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameIsNull() {
            addCriterion("HISTORY_TACHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameIsNotNull() {
            addCriterion("HISTORY_TACHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameEqualTo(String value) {
            addCriterion("HISTORY_TACHE_NAME =", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_NAME <>", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_NAME >", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_NAME >=", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameLessThan(String value) {
            addCriterion("HISTORY_TACHE_NAME <", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_NAME <=", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameLike(String value) {
            addCriterion("HISTORY_TACHE_NAME like", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameNotLike(String value) {
            addCriterion("HISTORY_TACHE_NAME not like", value, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameIn(List<String> values) {
            addCriterion("HISTORY_TACHE_NAME in", values, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_NAME not in", values, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_NAME between", value1, value2, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheNameNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_NAME not between", value1, value2, "historyTacheName");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeIsNull() {
            addCriterion("HISTORY_TACHE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeIsNotNull() {
            addCriterion("HISTORY_TACHE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TIME =", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TIME <>", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_TIME >", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TIME >=", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeLessThan(String value) {
            addCriterion("HISTORY_TACHE_TIME <", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TIME <=", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeLike(String value) {
            addCriterion("HISTORY_TACHE_TIME like", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeNotLike(String value) {
            addCriterion("HISTORY_TACHE_TIME not like", value, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TIME in", values, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TIME not in", values, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TIME between", value1, value2, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTimeNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TIME not between", value1, value2, "historyTacheTime");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowIsNull() {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowIsNotNull() {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW =", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowNotEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW <>", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowGreaterThan(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW >", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW >=", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowLessThan(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW <", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowLessThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW <=", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowLike(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW like", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowNotLike(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW not like", value, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW in", values, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowNotIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW not in", values, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW between", value1, value2, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupShowNotBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_BACKUP_SHOW not between", value1, value2, "tacheTransactorBackupShow");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupIsNull() {
            addCriterion("TACHE_TRANSACTOR_BACKUP is null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupIsNotNull() {
            addCriterion("TACHE_TRANSACTOR_BACKUP is not null");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP =", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupNotEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP <>", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupGreaterThan(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP >", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupGreaterThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP >=", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupLessThan(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP <", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupLessThanOrEqualTo(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP <=", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupLike(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP like", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupNotLike(String value) {
            addCriterion("TACHE_TRANSACTOR_BACKUP not like", value, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_BACKUP in", values, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupNotIn(List<String> values) {
            addCriterion("TACHE_TRANSACTOR_BACKUP not in", values, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_BACKUP between", value1, value2, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andTacheTransactorBackupNotBetween(String value1, String value2) {
            addCriterion("TACHE_TRANSACTOR_BACKUP not between", value1, value2, "tacheTransactorBackup");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheIsNull() {
            addCriterion("IS_LAST_TACHE is null");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheIsNotNull() {
            addCriterion("IS_LAST_TACHE is not null");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheEqualTo(Integer value) {
            addCriterion("IS_LAST_TACHE =", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheNotEqualTo(Integer value) {
            addCriterion("IS_LAST_TACHE <>", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheGreaterThan(Integer value) {
            addCriterion("IS_LAST_TACHE >", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LAST_TACHE >=", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheLessThan(Integer value) {
            addCriterion("IS_LAST_TACHE <", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LAST_TACHE <=", value, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheIn(List<Integer> values) {
            addCriterion("IS_LAST_TACHE in", values, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheNotIn(List<Integer> values) {
            addCriterion("IS_LAST_TACHE not in", values, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheBetween(Integer value1, Integer value2) {
            addCriterion("IS_LAST_TACHE between", value1, value2, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsLastTacheNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LAST_TACHE not between", value1, value2, "isLastTache");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNull() {
            addCriterion("IS_FINISHED is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNotNull() {
            addCriterion("IS_FINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedEqualTo(Integer value) {
            addCriterion("IS_FINISHED =", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotEqualTo(Integer value) {
            addCriterion("IS_FINISHED <>", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThan(Integer value) {
            addCriterion("IS_FINISHED >", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_FINISHED >=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThan(Integer value) {
            addCriterion("IS_FINISHED <", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_FINISHED <=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIn(List<Integer> values) {
            addCriterion("IS_FINISHED in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotIn(List<Integer> values) {
            addCriterion("IS_FINISHED not in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedBetween(Integer value1, Integer value2) {
            addCriterion("IS_FINISHED between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_FINISHED not between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNull() {
            addCriterion("FINISHED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNotNull() {
            addCriterion("FINISHED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeEqualTo(String value) {
            addCriterion("FINISHED_TIME =", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotEqualTo(String value) {
            addCriterion("FINISHED_TIME <>", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThan(String value) {
            addCriterion("FINISHED_TIME >", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FINISHED_TIME >=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThan(String value) {
            addCriterion("FINISHED_TIME <", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThanOrEqualTo(String value) {
            addCriterion("FINISHED_TIME <=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLike(String value) {
            addCriterion("FINISHED_TIME like", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotLike(String value) {
            addCriterion("FINISHED_TIME not like", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIn(List<String> values) {
            addCriterion("FINISHED_TIME in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotIn(List<String> values) {
            addCriterion("FINISHED_TIME not in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeBetween(String value1, String value2) {
            addCriterion("FINISHED_TIME between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotBetween(String value1, String value2) {
            addCriterion("FINISHED_TIME not between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateIsNull() {
            addCriterion("HISTORY_TACHE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateIsNotNull() {
            addCriterion("HISTORY_TACHE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateEqualTo(String value) {
            addCriterion("HISTORY_TACHE_STATE =", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_STATE <>", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_STATE >", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_STATE >=", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateLessThan(String value) {
            addCriterion("HISTORY_TACHE_STATE <", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_STATE <=", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateLike(String value) {
            addCriterion("HISTORY_TACHE_STATE like", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateNotLike(String value) {
            addCriterion("HISTORY_TACHE_STATE not like", value, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateIn(List<String> values) {
            addCriterion("HISTORY_TACHE_STATE in", values, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_STATE not in", values, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_STATE between", value1, value2, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheStateNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_STATE not between", value1, value2, "historyTacheState");
            return (Criteria) this;
        }

        public Criteria andOtherReaderIsNull() {
            addCriterion("OTHER_READER is null");
            return (Criteria) this;
        }

        public Criteria andOtherReaderIsNotNull() {
            addCriterion("OTHER_READER is not null");
            return (Criteria) this;
        }

        public Criteria andOtherReaderEqualTo(String value) {
            addCriterion("OTHER_READER =", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderNotEqualTo(String value) {
            addCriterion("OTHER_READER <>", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderGreaterThan(String value) {
            addCriterion("OTHER_READER >", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_READER >=", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderLessThan(String value) {
            addCriterion("OTHER_READER <", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderLessThanOrEqualTo(String value) {
            addCriterion("OTHER_READER <=", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderLike(String value) {
            addCriterion("OTHER_READER like", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderNotLike(String value) {
            addCriterion("OTHER_READER not like", value, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderIn(List<String> values) {
            addCriterion("OTHER_READER in", values, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderNotIn(List<String> values) {
            addCriterion("OTHER_READER not in", values, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderBetween(String value1, String value2) {
            addCriterion("OTHER_READER between", value1, value2, "otherReader");
            return (Criteria) this;
        }

        public Criteria andOtherReaderNotBetween(String value1, String value2) {
            addCriterion("OTHER_READER not between", value1, value2, "otherReader");
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

        public Criteria andHistoryTacheTransactorIsNull() {
            addCriterion("HISTORY_TACHE_TRANSACTOR is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorIsNotNull() {
            addCriterion("HISTORY_TACHE_TRANSACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR =", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR <>", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR >", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR >=", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorLessThan(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR <", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR <=", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorLike(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR like", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorNotLike(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR not like", value, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TRANSACTOR in", values, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TRANSACTOR not in", values, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TRANSACTOR between", value1, value2, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TRANSACTOR not between", value1, value2, "historyTacheTransactor");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowIsNull() {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowIsNotNull() {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW =", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW <>", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW >", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW >=", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowLessThan(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW <", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW <=", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowLike(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW like", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowNotLike(String value) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW not like", value, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW in", values, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW not in", values, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW between", value1, value2, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTacheTransactorShowNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_TRANSACTOR_SHOW not between", value1, value2, "historyTacheTransactorShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserIsNull() {
            addCriterion("HISTORY_TACHE_PASSER is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserIsNotNull() {
            addCriterion("HISTORY_TACHE_PASSER is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER =", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER <>", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_PASSER >", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER >=", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserLessThan(String value) {
            addCriterion("HISTORY_TACHE_PASSER <", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER <=", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserLike(String value) {
            addCriterion("HISTORY_TACHE_PASSER like", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserNotLike(String value) {
            addCriterion("HISTORY_TACHE_PASSER not like", value, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserIn(List<String> values) {
            addCriterion("HISTORY_TACHE_PASSER in", values, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_PASSER not in", values, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_PASSER between", value1, value2, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_PASSER not between", value1, value2, "historyTachePasser");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowIsNull() {
            addCriterion("HISTORY_TACHE_PASSER_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowIsNotNull() {
            addCriterion("HISTORY_TACHE_PASSER_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW =", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowNotEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW <>", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowGreaterThan(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW >", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW >=", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowLessThan(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW <", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW <=", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowLike(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW like", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowNotLike(String value) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW not like", value, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowIn(List<String> values) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW in", values, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowNotIn(List<String> values) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW not in", values, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW between", value1, value2, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andHistoryTachePasserShowNotBetween(String value1, String value2) {
            addCriterion("HISTORY_TACHE_PASSER_SHOW not between", value1, value2, "historyTachePasserShow");
            return (Criteria) this;
        }

        public Criteria andPasserReadedIsNull() {
            addCriterion("PASSER_READED is null");
            return (Criteria) this;
        }

        public Criteria andPasserReadedIsNotNull() {
            addCriterion("PASSER_READED is not null");
            return (Criteria) this;
        }

        public Criteria andPasserReadedEqualTo(String value) {
            addCriterion("PASSER_READED =", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedNotEqualTo(String value) {
            addCriterion("PASSER_READED <>", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedGreaterThan(String value) {
            addCriterion("PASSER_READED >", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedGreaterThanOrEqualTo(String value) {
            addCriterion("PASSER_READED >=", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedLessThan(String value) {
            addCriterion("PASSER_READED <", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedLessThanOrEqualTo(String value) {
            addCriterion("PASSER_READED <=", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedLike(String value) {
            addCriterion("PASSER_READED like", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedNotLike(String value) {
            addCriterion("PASSER_READED not like", value, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedIn(List<String> values) {
            addCriterion("PASSER_READED in", values, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedNotIn(List<String> values) {
            addCriterion("PASSER_READED not in", values, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedBetween(String value1, String value2) {
            addCriterion("PASSER_READED between", value1, value2, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserReadedNotBetween(String value1, String value2) {
            addCriterion("PASSER_READED not between", value1, value2, "passerReaded");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadIsNull() {
            addCriterion("PASSER_UNREAD is null");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadIsNotNull() {
            addCriterion("PASSER_UNREAD is not null");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadEqualTo(String value) {
            addCriterion("PASSER_UNREAD =", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadNotEqualTo(String value) {
            addCriterion("PASSER_UNREAD <>", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadGreaterThan(String value) {
            addCriterion("PASSER_UNREAD >", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadGreaterThanOrEqualTo(String value) {
            addCriterion("PASSER_UNREAD >=", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadLessThan(String value) {
            addCriterion("PASSER_UNREAD <", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadLessThanOrEqualTo(String value) {
            addCriterion("PASSER_UNREAD <=", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadLike(String value) {
            addCriterion("PASSER_UNREAD like", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadNotLike(String value) {
            addCriterion("PASSER_UNREAD not like", value, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadIn(List<String> values) {
            addCriterion("PASSER_UNREAD in", values, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadNotIn(List<String> values) {
            addCriterion("PASSER_UNREAD not in", values, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadBetween(String value1, String value2) {
            addCriterion("PASSER_UNREAD between", value1, value2, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadNotBetween(String value1, String value2) {
            addCriterion("PASSER_UNREAD not between", value1, value2, "passerUnread");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChIsNull() {
            addCriterion("PASSER_READED_CH is null");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChIsNotNull() {
            addCriterion("PASSER_READED_CH is not null");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChEqualTo(String value) {
            addCriterion("PASSER_READED_CH =", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChNotEqualTo(String value) {
            addCriterion("PASSER_READED_CH <>", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChGreaterThan(String value) {
            addCriterion("PASSER_READED_CH >", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChGreaterThanOrEqualTo(String value) {
            addCriterion("PASSER_READED_CH >=", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChLessThan(String value) {
            addCriterion("PASSER_READED_CH <", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChLessThanOrEqualTo(String value) {
            addCriterion("PASSER_READED_CH <=", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChLike(String value) {
            addCriterion("PASSER_READED_CH like", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChNotLike(String value) {
            addCriterion("PASSER_READED_CH not like", value, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChIn(List<String> values) {
            addCriterion("PASSER_READED_CH in", values, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChNotIn(List<String> values) {
            addCriterion("PASSER_READED_CH not in", values, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChBetween(String value1, String value2) {
            addCriterion("PASSER_READED_CH between", value1, value2, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserReadedChNotBetween(String value1, String value2) {
            addCriterion("PASSER_READED_CH not between", value1, value2, "passerReadedCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChIsNull() {
            addCriterion("PASSER_UNREAD_CH is null");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChIsNotNull() {
            addCriterion("PASSER_UNREAD_CH is not null");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChEqualTo(String value) {
            addCriterion("PASSER_UNREAD_CH =", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChNotEqualTo(String value) {
            addCriterion("PASSER_UNREAD_CH <>", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChGreaterThan(String value) {
            addCriterion("PASSER_UNREAD_CH >", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChGreaterThanOrEqualTo(String value) {
            addCriterion("PASSER_UNREAD_CH >=", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChLessThan(String value) {
            addCriterion("PASSER_UNREAD_CH <", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChLessThanOrEqualTo(String value) {
            addCriterion("PASSER_UNREAD_CH <=", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChLike(String value) {
            addCriterion("PASSER_UNREAD_CH like", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChNotLike(String value) {
            addCriterion("PASSER_UNREAD_CH not like", value, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChIn(List<String> values) {
            addCriterion("PASSER_UNREAD_CH in", values, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChNotIn(List<String> values) {
            addCriterion("PASSER_UNREAD_CH not in", values, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChBetween(String value1, String value2) {
            addCriterion("PASSER_UNREAD_CH between", value1, value2, "passerUnreadCh");
            return (Criteria) this;
        }

        public Criteria andPasserUnreadChNotBetween(String value1, String value2) {
            addCriterion("PASSER_UNREAD_CH not between", value1, value2, "passerUnreadCh");
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