package com.jw.baseframe.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class C_V_Sys_NavigationnotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Sys_NavigationnotesExample() {
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

        public void addCriterion(String condition) {
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

        public Criteria andModuleNameIsNull() {
            addCriterion("MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("MODULE_NAME =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("MODULE_NAME <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("MODULE_NAME >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("MODULE_NAME <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("MODULE_NAME like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("MODULE_NAME not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("MODULE_NAME in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("MODULE_NAME not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("MODULE_NAME between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("MODULE_NAME not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("LINK_URL is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("LINK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("LINK_URL =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("LINK_URL <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("LINK_URL >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_URL >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("LINK_URL <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("LINK_URL <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("LINK_URL like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("LINK_URL not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("LINK_URL in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("LINK_URL not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("LINK_URL between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("LINK_URL not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("TARGET =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("TARGET <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("TARGET >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("TARGET <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("TARGET <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("TARGET like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("TARGET not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("TARGET in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("TARGET not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("TARGET between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("TARGET not between", value1, value2, "target");
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

        public Criteria andParenModuleIsNull() {
            addCriterion("PAREN_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andParenModuleIsNotNull() {
            addCriterion("PAREN_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andParenModuleEqualTo(String value) {
            addCriterion("PAREN_MODULE =", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleNotEqualTo(String value) {
            addCriterion("PAREN_MODULE <>", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleGreaterThan(String value) {
            addCriterion("PAREN_MODULE >", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleGreaterThanOrEqualTo(String value) {
            addCriterion("PAREN_MODULE >=", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleLessThan(String value) {
            addCriterion("PAREN_MODULE <", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleLessThanOrEqualTo(String value) {
            addCriterion("PAREN_MODULE <=", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleLike(String value) {
            addCriterion("PAREN_MODULE like", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleNotLike(String value) {
            addCriterion("PAREN_MODULE not like", value, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleIn(List<String> values) {
            addCriterion("PAREN_MODULE in", values, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleNotIn(List<String> values) {
            addCriterion("PAREN_MODULE not in", values, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleBetween(String value1, String value2) {
            addCriterion("PAREN_MODULE between", value1, value2, "parenModule");
            return (Criteria) this;
        }

        public Criteria andParenModuleNotBetween(String value1, String value2) {
            addCriterion("PAREN_MODULE not between", value1, value2, "parenModule");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionIsNull() {
            addCriterion("MODULE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionIsNotNull() {
            addCriterion("MODULE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionEqualTo(String value) {
            addCriterion("MODULE_DESCRIPTION =", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionNotEqualTo(String value) {
            addCriterion("MODULE_DESCRIPTION <>", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionGreaterThan(String value) {
            addCriterion("MODULE_DESCRIPTION >", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_DESCRIPTION >=", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionLessThan(String value) {
            addCriterion("MODULE_DESCRIPTION <", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("MODULE_DESCRIPTION <=", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionLike(String value) {
            addCriterion("MODULE_DESCRIPTION like", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionNotLike(String value) {
            addCriterion("MODULE_DESCRIPTION not like", value, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionIn(List<String> values) {
            addCriterion("MODULE_DESCRIPTION in", values, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionNotIn(List<String> values) {
            addCriterion("MODULE_DESCRIPTION not in", values, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionBetween(String value1, String value2) {
            addCriterion("MODULE_DESCRIPTION between", value1, value2, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andModuleDescriptionNotBetween(String value1, String value2) {
            addCriterion("MODULE_DESCRIPTION not between", value1, value2, "moduleDescription");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andLevelnoIsNull() {
            addCriterion("LEVELNO is null");
            return (Criteria) this;
        }

        public Criteria andLevelnoIsNotNull() {
            addCriterion("LEVELNO is not null");
            return (Criteria) this;
        }

        public Criteria andLevelnoEqualTo(BigDecimal value) {
            addCriterion("LEVELNO =", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoNotEqualTo(BigDecimal value) {
            addCriterion("LEVELNO <>", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoGreaterThan(BigDecimal value) {
            addCriterion("LEVELNO >", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELNO >=", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoLessThan(BigDecimal value) {
            addCriterion("LEVELNO <", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELNO <=", value, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoIn(List<BigDecimal> values) {
            addCriterion("LEVELNO in", values, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoNotIn(List<BigDecimal> values) {
            addCriterion("LEVELNO not in", values, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELNO between", value1, value2, "levelno");
            return (Criteria) this;
        }

        public Criteria andLevelnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELNO not between", value1, value2, "levelno");
            return (Criteria) this;
        }

        public Criteria andRcountIsNull() {
            addCriterion("RCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRcountIsNotNull() {
            addCriterion("RCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRcountEqualTo(BigDecimal value) {
            addCriterion("RCOUNT =", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotEqualTo(BigDecimal value) {
            addCriterion("RCOUNT <>", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThan(BigDecimal value) {
            addCriterion("RCOUNT >", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RCOUNT >=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThan(BigDecimal value) {
            addCriterion("RCOUNT <", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RCOUNT <=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountIn(List<BigDecimal> values) {
            addCriterion("RCOUNT in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotIn(List<BigDecimal> values) {
            addCriterion("RCOUNT not in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RCOUNT between", value1, value2, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RCOUNT not between", value1, value2, "rcount");
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