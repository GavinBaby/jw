package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_V_Sys_TaskConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Sys_TaskConfigExample() {
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

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNull() {
            addCriterion("TASK_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNotNull() {
            addCriterion("TASK_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailEqualTo(String value) {
            addCriterion("TASK_DETAIL =", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotEqualTo(String value) {
            addCriterion("TASK_DETAIL <>", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThan(String value) {
            addCriterion("TASK_DETAIL >", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_DETAIL >=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThan(String value) {
            addCriterion("TASK_DETAIL <", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThanOrEqualTo(String value) {
            addCriterion("TASK_DETAIL <=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLike(String value) {
            addCriterion("TASK_DETAIL like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotLike(String value) {
            addCriterion("TASK_DETAIL not like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIn(List<String> values) {
            addCriterion("TASK_DETAIL in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotIn(List<String> values) {
            addCriterion("TASK_DETAIL not in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailBetween(String value1, String value2) {
            addCriterion("TASK_DETAIL between", value1, value2, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotBetween(String value1, String value2) {
            addCriterion("TASK_DETAIL not between", value1, value2, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("METHOD_NAME =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("METHOD_NAME <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("METHOD_NAME >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("METHOD_NAME <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("METHOD_NAME like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("METHOD_NAME not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("METHOD_NAME in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("METHOD_NAME not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("METHOD_NAME between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("METHOD_NAME not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andClassPathIsNull() {
            addCriterion("CLASS_PATH is null");
            return (Criteria) this;
        }

        public Criteria andClassPathIsNotNull() {
            addCriterion("CLASS_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andClassPathEqualTo(String value) {
            addCriterion("CLASS_PATH =", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotEqualTo(String value) {
            addCriterion("CLASS_PATH <>", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathGreaterThan(String value) {
            addCriterion("CLASS_PATH >", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_PATH >=", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLessThan(String value) {
            addCriterion("CLASS_PATH <", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLessThanOrEqualTo(String value) {
            addCriterion("CLASS_PATH <=", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathLike(String value) {
            addCriterion("CLASS_PATH like", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotLike(String value) {
            addCriterion("CLASS_PATH not like", value, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathIn(List<String> values) {
            addCriterion("CLASS_PATH in", values, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotIn(List<String> values) {
            addCriterion("CLASS_PATH not in", values, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathBetween(String value1, String value2) {
            addCriterion("CLASS_PATH between", value1, value2, "classPath");
            return (Criteria) this;
        }

        public Criteria andClassPathNotBetween(String value1, String value2) {
            addCriterion("CLASS_PATH not between", value1, value2, "classPath");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeIsNull() {
            addCriterion("SCHEDULER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeIsNotNull() {
            addCriterion("SCHEDULER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeEqualTo(String value) {
            addCriterion("SCHEDULER_TYPE =", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeNotEqualTo(String value) {
            addCriterion("SCHEDULER_TYPE <>", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeGreaterThan(String value) {
            addCriterion("SCHEDULER_TYPE >", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEDULER_TYPE >=", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeLessThan(String value) {
            addCriterion("SCHEDULER_TYPE <", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeLessThanOrEqualTo(String value) {
            addCriterion("SCHEDULER_TYPE <=", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeLike(String value) {
            addCriterion("SCHEDULER_TYPE like", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeNotLike(String value) {
            addCriterion("SCHEDULER_TYPE not like", value, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeIn(List<String> values) {
            addCriterion("SCHEDULER_TYPE in", values, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeNotIn(List<String> values) {
            addCriterion("SCHEDULER_TYPE not in", values, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeBetween(String value1, String value2) {
            addCriterion("SCHEDULER_TYPE between", value1, value2, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andSchedulerTypeNotBetween(String value1, String value2) {
            addCriterion("SCHEDULER_TYPE not between", value1, value2, "schedulerType");
            return (Criteria) this;
        }

        public Criteria andTimerNameIsNull() {
            addCriterion("TIMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimerNameIsNotNull() {
            addCriterion("TIMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimerNameEqualTo(String value) {
            addCriterion("TIMER_NAME =", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotEqualTo(String value) {
            addCriterion("TIMER_NAME <>", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThan(String value) {
            addCriterion("TIMER_NAME >", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME >=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThan(String value) {
            addCriterion("TIMER_NAME <", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME <=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLike(String value) {
            addCriterion("TIMER_NAME like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotLike(String value) {
            addCriterion("TIMER_NAME not like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameIn(List<String> values) {
            addCriterion("TIMER_NAME in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotIn(List<String> values) {
            addCriterion("TIMER_NAME not in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameBetween(String value1, String value2) {
            addCriterion("TIMER_NAME between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotBetween(String value1, String value2) {
            addCriterion("TIMER_NAME not between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("IS_USED is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("IS_USED is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(Integer value) {
            addCriterion("IS_USED =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(Integer value) {
            addCriterion("IS_USED <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(Integer value) {
            addCriterion("IS_USED >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_USED >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(Integer value) {
            addCriterion("IS_USED <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_USED <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<Integer> values) {
            addCriterion("IS_USED in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<Integer> values) {
            addCriterion("IS_USED not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(Integer value1, Integer value2) {
            addCriterion("IS_USED between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_USED not between", value1, value2, "isUsed");
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