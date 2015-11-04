package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_V_Flow_Tache_RoleuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Flow_Tache_RoleuserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNull() {
            addCriterion("ROLE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNotNull() {
            addCriterion("ROLE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSortEqualTo(Integer value) {
            addCriterion("ROLE_SORT =", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotEqualTo(Integer value) {
            addCriterion("ROLE_SORT <>", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThan(Integer value) {
            addCriterion("ROLE_SORT >", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_SORT >=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThan(Integer value) {
            addCriterion("ROLE_SORT <", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_SORT <=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortIn(List<Integer> values) {
            addCriterion("ROLE_SORT in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotIn(List<Integer> values) {
            addCriterion("ROLE_SORT not in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_SORT between", value1, value2, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_SORT not between", value1, value2, "roleSort");
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