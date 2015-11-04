package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Flow_RouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Flow_RouteExample() {
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

        public Criteria andFlowRouteConditionIsNull() {
            addCriterion("FLOW_ROUTE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionIsNotNull() {
            addCriterion("FLOW_ROUTE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionEqualTo(String value) {
            addCriterion("FLOW_ROUTE_CONDITION =", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionNotEqualTo(String value) {
            addCriterion("FLOW_ROUTE_CONDITION <>", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionGreaterThan(String value) {
            addCriterion("FLOW_ROUTE_CONDITION >", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ROUTE_CONDITION >=", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionLessThan(String value) {
            addCriterion("FLOW_ROUTE_CONDITION <", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ROUTE_CONDITION <=", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionLike(String value) {
            addCriterion("FLOW_ROUTE_CONDITION like", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionNotLike(String value) {
            addCriterion("FLOW_ROUTE_CONDITION not like", value, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionIn(List<String> values) {
            addCriterion("FLOW_ROUTE_CONDITION in", values, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionNotIn(List<String> values) {
            addCriterion("FLOW_ROUTE_CONDITION not in", values, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionBetween(String value1, String value2) {
            addCriterion("FLOW_ROUTE_CONDITION between", value1, value2, "flowRouteCondition");
            return (Criteria) this;
        }

        public Criteria andFlowRouteConditionNotBetween(String value1, String value2) {
            addCriterion("FLOW_ROUTE_CONDITION not between", value1, value2, "flowRouteCondition");
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