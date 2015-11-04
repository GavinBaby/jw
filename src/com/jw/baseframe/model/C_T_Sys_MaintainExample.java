package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_MaintainExample() {
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

        public Criteria andMaintainIdIsNull() {
            addCriterion("MAINTAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIsNotNull() {
            addCriterion("MAINTAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdEqualTo(String value) {
            addCriterion("MAINTAIN_ID =", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotEqualTo(String value) {
            addCriterion("MAINTAIN_ID <>", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThan(String value) {
            addCriterion("MAINTAIN_ID >", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_ID >=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThan(String value) {
            addCriterion("MAINTAIN_ID <", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_ID <=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLike(String value) {
            addCriterion("MAINTAIN_ID like", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotLike(String value) {
            addCriterion("MAINTAIN_ID not like", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIn(List<String> values) {
            addCriterion("MAINTAIN_ID in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotIn(List<String> values) {
            addCriterion("MAINTAIN_ID not in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdBetween(String value1, String value2) {
            addCriterion("MAINTAIN_ID between", value1, value2, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotBetween(String value1, String value2) {
            addCriterion("MAINTAIN_ID not between", value1, value2, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNull() {
            addCriterion("MAINTAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIsNotNull() {
            addCriterion("MAINTAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNameEqualTo(String value) {
            addCriterion("MAINTAIN_NAME =", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotEqualTo(String value) {
            addCriterion("MAINTAIN_NAME <>", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThan(String value) {
            addCriterion("MAINTAIN_NAME >", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_NAME >=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThan(String value) {
            addCriterion("MAINTAIN_NAME <", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLessThanOrEqualTo(String value) {
            addCriterion("MAINTAIN_NAME <=", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameLike(String value) {
            addCriterion("MAINTAIN_NAME like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotLike(String value) {
            addCriterion("MAINTAIN_NAME not like", value, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameIn(List<String> values) {
            addCriterion("MAINTAIN_NAME in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotIn(List<String> values) {
            addCriterion("MAINTAIN_NAME not in", values, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameBetween(String value1, String value2) {
            addCriterion("MAINTAIN_NAME between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andMaintainNameNotBetween(String value1, String value2) {
            addCriterion("MAINTAIN_NAME not between", value1, value2, "maintainName");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdIsNull() {
            addCriterion("PAREN_MAINTAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdIsNotNull() {
            addCriterion("PAREN_MAINTAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdEqualTo(String value) {
            addCriterion("PAREN_MAINTAIN_ID =", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdNotEqualTo(String value) {
            addCriterion("PAREN_MAINTAIN_ID <>", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdGreaterThan(String value) {
            addCriterion("PAREN_MAINTAIN_ID >", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAREN_MAINTAIN_ID >=", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdLessThan(String value) {
            addCriterion("PAREN_MAINTAIN_ID <", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdLessThanOrEqualTo(String value) {
            addCriterion("PAREN_MAINTAIN_ID <=", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdLike(String value) {
            addCriterion("PAREN_MAINTAIN_ID like", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdNotLike(String value) {
            addCriterion("PAREN_MAINTAIN_ID not like", value, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdIn(List<String> values) {
            addCriterion("PAREN_MAINTAIN_ID in", values, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdNotIn(List<String> values) {
            addCriterion("PAREN_MAINTAIN_ID not in", values, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdBetween(String value1, String value2) {
            addCriterion("PAREN_MAINTAIN_ID between", value1, value2, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andParenMaintainIdNotBetween(String value1, String value2) {
            addCriterion("PAREN_MAINTAIN_ID not between", value1, value2, "parenMaintainId");
            return (Criteria) this;
        }

        public Criteria andModuleUuidIsNull() {
            addCriterion("MODULE_UUID is null");
            return (Criteria) this;
        }

        public Criteria andModuleUuidIsNotNull() {
            addCriterion("MODULE_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUuidEqualTo(String value) {
            addCriterion("MODULE_UUID =", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidNotEqualTo(String value) {
            addCriterion("MODULE_UUID <>", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidGreaterThan(String value) {
            addCriterion("MODULE_UUID >", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_UUID >=", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidLessThan(String value) {
            addCriterion("MODULE_UUID <", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidLessThanOrEqualTo(String value) {
            addCriterion("MODULE_UUID <=", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidLike(String value) {
            addCriterion("MODULE_UUID like", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidNotLike(String value) {
            addCriterion("MODULE_UUID not like", value, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidIn(List<String> values) {
            addCriterion("MODULE_UUID in", values, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidNotIn(List<String> values) {
            addCriterion("MODULE_UUID not in", values, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidBetween(String value1, String value2) {
            addCriterion("MODULE_UUID between", value1, value2, "moduleUuid");
            return (Criteria) this;
        }

        public Criteria andModuleUuidNotBetween(String value1, String value2) {
            addCriterion("MODULE_UUID not between", value1, value2, "moduleUuid");
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

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNull() {
            addCriterion("RELATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNotNull() {
            addCriterion("RELATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelateIdEqualTo(String value) {
            addCriterion("RELATE_ID =", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotEqualTo(String value) {
            addCriterion("RELATE_ID <>", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThan(String value) {
            addCriterion("RELATE_ID >", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATE_ID >=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThan(String value) {
            addCriterion("RELATE_ID <", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThanOrEqualTo(String value) {
            addCriterion("RELATE_ID <=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLike(String value) {
            addCriterion("RELATE_ID like", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotLike(String value) {
            addCriterion("RELATE_ID not like", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdIn(List<String> values) {
            addCriterion("RELATE_ID in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotIn(List<String> values) {
            addCriterion("RELATE_ID not in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdBetween(String value1, String value2) {
            addCriterion("RELATE_ID between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotBetween(String value1, String value2) {
            addCriterion("RELATE_ID not between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleIsNull() {
            addCriterion("IS_ASS_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleIsNotNull() {
            addCriterion("IS_ASS_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleEqualTo(Integer value) {
            addCriterion("IS_ASS_MODULE =", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleNotEqualTo(Integer value) {
            addCriterion("IS_ASS_MODULE <>", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleGreaterThan(Integer value) {
            addCriterion("IS_ASS_MODULE >", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ASS_MODULE >=", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleLessThan(Integer value) {
            addCriterion("IS_ASS_MODULE <", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ASS_MODULE <=", value, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleIn(List<Integer> values) {
            addCriterion("IS_ASS_MODULE in", values, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleNotIn(List<Integer> values) {
            addCriterion("IS_ASS_MODULE not in", values, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleBetween(Integer value1, Integer value2) {
            addCriterion("IS_ASS_MODULE between", value1, value2, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andIsAssModuleNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ASS_MODULE not between", value1, value2, "isAssModule");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("MTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("MTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(Integer value) {
            addCriterion("MTYPE =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(Integer value) {
            addCriterion("MTYPE <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(Integer value) {
            addCriterion("MTYPE >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MTYPE >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(Integer value) {
            addCriterion("MTYPE <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(Integer value) {
            addCriterion("MTYPE <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<Integer> values) {
            addCriterion("MTYPE in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<Integer> values) {
            addCriterion("MTYPE not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(Integer value1, Integer value2) {
            addCriterion("MTYPE between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MTYPE not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMuserIsNull() {
            addCriterion("MUSER is null");
            return (Criteria) this;
        }

        public Criteria andMuserIsNotNull() {
            addCriterion("MUSER is not null");
            return (Criteria) this;
        }

        public Criteria andMuserEqualTo(String value) {
            addCriterion("MUSER =", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserNotEqualTo(String value) {
            addCriterion("MUSER <>", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserGreaterThan(String value) {
            addCriterion("MUSER >", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserGreaterThanOrEqualTo(String value) {
            addCriterion("MUSER >=", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserLessThan(String value) {
            addCriterion("MUSER <", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserLessThanOrEqualTo(String value) {
            addCriterion("MUSER <=", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserLike(String value) {
            addCriterion("MUSER like", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserNotLike(String value) {
            addCriterion("MUSER not like", value, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserIn(List<String> values) {
            addCriterion("MUSER in", values, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserNotIn(List<String> values) {
            addCriterion("MUSER not in", values, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserBetween(String value1, String value2) {
            addCriterion("MUSER between", value1, value2, "muser");
            return (Criteria) this;
        }

        public Criteria andMuserNotBetween(String value1, String value2) {
            addCriterion("MUSER not between", value1, value2, "muser");
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