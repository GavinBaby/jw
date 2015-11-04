package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_Sys_Sy_ModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_Sys_Sy_ModuleExample() {
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

        public Criteria andModuleTitleIsNull() {
            addCriterion("MODULE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andModuleTitleIsNotNull() {
            addCriterion("MODULE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTitleEqualTo(String value) {
            addCriterion("MODULE_TITLE =", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleNotEqualTo(String value) {
            addCriterion("MODULE_TITLE <>", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleGreaterThan(String value) {
            addCriterion("MODULE_TITLE >", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_TITLE >=", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleLessThan(String value) {
            addCriterion("MODULE_TITLE <", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleLessThanOrEqualTo(String value) {
            addCriterion("MODULE_TITLE <=", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleLike(String value) {
            addCriterion("MODULE_TITLE like", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleNotLike(String value) {
            addCriterion("MODULE_TITLE not like", value, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleIn(List<String> values) {
            addCriterion("MODULE_TITLE in", values, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleNotIn(List<String> values) {
            addCriterion("MODULE_TITLE not in", values, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleBetween(String value1, String value2) {
            addCriterion("MODULE_TITLE between", value1, value2, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTitleNotBetween(String value1, String value2) {
            addCriterion("MODULE_TITLE not between", value1, value2, "moduleTitle");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNull() {
            addCriterion("MODULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNotNull() {
            addCriterion("MODULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("MODULE_TYPE =", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("MODULE_TYPE <>", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("MODULE_TYPE >", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_TYPE >=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("MODULE_TYPE <", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("MODULE_TYPE <=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLike(String value) {
            addCriterion("MODULE_TYPE like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("MODULE_TYPE not like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("MODULE_TYPE in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("MODULE_TYPE not in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("MODULE_TYPE between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("MODULE_TYPE not between", value1, value2, "moduleType");
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

        public Criteria andModuleMoreLinkIsNull() {
            addCriterion("MODULE_MORE_LINK is null");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkIsNotNull() {
            addCriterion("MODULE_MORE_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkEqualTo(String value) {
            addCriterion("MODULE_MORE_LINK =", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkNotEqualTo(String value) {
            addCriterion("MODULE_MORE_LINK <>", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkGreaterThan(String value) {
            addCriterion("MODULE_MORE_LINK >", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_MORE_LINK >=", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkLessThan(String value) {
            addCriterion("MODULE_MORE_LINK <", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkLessThanOrEqualTo(String value) {
            addCriterion("MODULE_MORE_LINK <=", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkLike(String value) {
            addCriterion("MODULE_MORE_LINK like", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkNotLike(String value) {
            addCriterion("MODULE_MORE_LINK not like", value, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkIn(List<String> values) {
            addCriterion("MODULE_MORE_LINK in", values, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkNotIn(List<String> values) {
            addCriterion("MODULE_MORE_LINK not in", values, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkBetween(String value1, String value2) {
            addCriterion("MODULE_MORE_LINK between", value1, value2, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleMoreLinkNotBetween(String value1, String value2) {
            addCriterion("MODULE_MORE_LINK not between", value1, value2, "moduleMoreLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkIsNull() {
            addCriterion("MODULE_CONTENT_LINK is null");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkIsNotNull() {
            addCriterion("MODULE_CONTENT_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkEqualTo(String value) {
            addCriterion("MODULE_CONTENT_LINK =", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkNotEqualTo(String value) {
            addCriterion("MODULE_CONTENT_LINK <>", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkGreaterThan(String value) {
            addCriterion("MODULE_CONTENT_LINK >", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_CONTENT_LINK >=", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkLessThan(String value) {
            addCriterion("MODULE_CONTENT_LINK <", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkLessThanOrEqualTo(String value) {
            addCriterion("MODULE_CONTENT_LINK <=", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkLike(String value) {
            addCriterion("MODULE_CONTENT_LINK like", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkNotLike(String value) {
            addCriterion("MODULE_CONTENT_LINK not like", value, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkIn(List<String> values) {
            addCriterion("MODULE_CONTENT_LINK in", values, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkNotIn(List<String> values) {
            addCriterion("MODULE_CONTENT_LINK not in", values, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkBetween(String value1, String value2) {
            addCriterion("MODULE_CONTENT_LINK between", value1, value2, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinkNotBetween(String value1, String value2) {
            addCriterion("MODULE_CONTENT_LINK not between", value1, value2, "moduleContentLink");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgIsNull() {
            addCriterion("MODULE_ICON_IMG is null");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgIsNotNull() {
            addCriterion("MODULE_ICON_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgEqualTo(String value) {
            addCriterion("MODULE_ICON_IMG =", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgNotEqualTo(String value) {
            addCriterion("MODULE_ICON_IMG <>", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgGreaterThan(String value) {
            addCriterion("MODULE_ICON_IMG >", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ICON_IMG >=", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgLessThan(String value) {
            addCriterion("MODULE_ICON_IMG <", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ICON_IMG <=", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgLike(String value) {
            addCriterion("MODULE_ICON_IMG like", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgNotLike(String value) {
            addCriterion("MODULE_ICON_IMG not like", value, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgIn(List<String> values) {
            addCriterion("MODULE_ICON_IMG in", values, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgNotIn(List<String> values) {
            addCriterion("MODULE_ICON_IMG not in", values, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgBetween(String value1, String value2) {
            addCriterion("MODULE_ICON_IMG between", value1, value2, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconImgNotBetween(String value1, String value2) {
            addCriterion("MODULE_ICON_IMG not between", value1, value2, "moduleIconImg");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssIsNull() {
            addCriterion("MODULE_ICON_CSS is null");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssIsNotNull() {
            addCriterion("MODULE_ICON_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssEqualTo(String value) {
            addCriterion("MODULE_ICON_CSS =", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssNotEqualTo(String value) {
            addCriterion("MODULE_ICON_CSS <>", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssGreaterThan(String value) {
            addCriterion("MODULE_ICON_CSS >", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ICON_CSS >=", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssLessThan(String value) {
            addCriterion("MODULE_ICON_CSS <", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ICON_CSS <=", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssLike(String value) {
            addCriterion("MODULE_ICON_CSS like", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssNotLike(String value) {
            addCriterion("MODULE_ICON_CSS not like", value, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssIn(List<String> values) {
            addCriterion("MODULE_ICON_CSS in", values, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssNotIn(List<String> values) {
            addCriterion("MODULE_ICON_CSS not in", values, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssBetween(String value1, String value2) {
            addCriterion("MODULE_ICON_CSS between", value1, value2, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleIconCssNotBetween(String value1, String value2) {
            addCriterion("MODULE_ICON_CSS not between", value1, value2, "moduleIconCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssIsNull() {
            addCriterion("MODULE_TITLE_CSS is null");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssIsNotNull() {
            addCriterion("MODULE_TITLE_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssEqualTo(String value) {
            addCriterion("MODULE_TITLE_CSS =", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssNotEqualTo(String value) {
            addCriterion("MODULE_TITLE_CSS <>", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssGreaterThan(String value) {
            addCriterion("MODULE_TITLE_CSS >", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_TITLE_CSS >=", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssLessThan(String value) {
            addCriterion("MODULE_TITLE_CSS <", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssLessThanOrEqualTo(String value) {
            addCriterion("MODULE_TITLE_CSS <=", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssLike(String value) {
            addCriterion("MODULE_TITLE_CSS like", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssNotLike(String value) {
            addCriterion("MODULE_TITLE_CSS not like", value, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssIn(List<String> values) {
            addCriterion("MODULE_TITLE_CSS in", values, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssNotIn(List<String> values) {
            addCriterion("MODULE_TITLE_CSS not in", values, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssBetween(String value1, String value2) {
            addCriterion("MODULE_TITLE_CSS between", value1, value2, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleTitleCssNotBetween(String value1, String value2) {
            addCriterion("MODULE_TITLE_CSS not between", value1, value2, "moduleTitleCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssIsNull() {
            addCriterion("MODULE_HEADER_CSS is null");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssIsNotNull() {
            addCriterion("MODULE_HEADER_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssEqualTo(String value) {
            addCriterion("MODULE_HEADER_CSS =", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssNotEqualTo(String value) {
            addCriterion("MODULE_HEADER_CSS <>", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssGreaterThan(String value) {
            addCriterion("MODULE_HEADER_CSS >", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_HEADER_CSS >=", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssLessThan(String value) {
            addCriterion("MODULE_HEADER_CSS <", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssLessThanOrEqualTo(String value) {
            addCriterion("MODULE_HEADER_CSS <=", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssLike(String value) {
            addCriterion("MODULE_HEADER_CSS like", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssNotLike(String value) {
            addCriterion("MODULE_HEADER_CSS not like", value, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssIn(List<String> values) {
            addCriterion("MODULE_HEADER_CSS in", values, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssNotIn(List<String> values) {
            addCriterion("MODULE_HEADER_CSS not in", values, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssBetween(String value1, String value2) {
            addCriterion("MODULE_HEADER_CSS between", value1, value2, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleHeaderCssNotBetween(String value1, String value2) {
            addCriterion("MODULE_HEADER_CSS not between", value1, value2, "moduleHeaderCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssIsNull() {
            addCriterion("MODULE_BODY_CSS is null");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssIsNotNull() {
            addCriterion("MODULE_BODY_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssEqualTo(String value) {
            addCriterion("MODULE_BODY_CSS =", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssNotEqualTo(String value) {
            addCriterion("MODULE_BODY_CSS <>", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssGreaterThan(String value) {
            addCriterion("MODULE_BODY_CSS >", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_BODY_CSS >=", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssLessThan(String value) {
            addCriterion("MODULE_BODY_CSS <", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssLessThanOrEqualTo(String value) {
            addCriterion("MODULE_BODY_CSS <=", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssLike(String value) {
            addCriterion("MODULE_BODY_CSS like", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssNotLike(String value) {
            addCriterion("MODULE_BODY_CSS not like", value, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssIn(List<String> values) {
            addCriterion("MODULE_BODY_CSS in", values, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssNotIn(List<String> values) {
            addCriterion("MODULE_BODY_CSS not in", values, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssBetween(String value1, String value2) {
            addCriterion("MODULE_BODY_CSS between", value1, value2, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleBodyCssNotBetween(String value1, String value2) {
            addCriterion("MODULE_BODY_CSS not between", value1, value2, "moduleBodyCss");
            return (Criteria) this;
        }

        public Criteria andModuleWidthIsNull() {
            addCriterion("MODULE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andModuleWidthIsNotNull() {
            addCriterion("MODULE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andModuleWidthEqualTo(String value) {
            addCriterion("MODULE_WIDTH =", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthNotEqualTo(String value) {
            addCriterion("MODULE_WIDTH <>", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthGreaterThan(String value) {
            addCriterion("MODULE_WIDTH >", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_WIDTH >=", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthLessThan(String value) {
            addCriterion("MODULE_WIDTH <", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthLessThanOrEqualTo(String value) {
            addCriterion("MODULE_WIDTH <=", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthLike(String value) {
            addCriterion("MODULE_WIDTH like", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthNotLike(String value) {
            addCriterion("MODULE_WIDTH not like", value, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthIn(List<String> values) {
            addCriterion("MODULE_WIDTH in", values, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthNotIn(List<String> values) {
            addCriterion("MODULE_WIDTH not in", values, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthBetween(String value1, String value2) {
            addCriterion("MODULE_WIDTH between", value1, value2, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleWidthNotBetween(String value1, String value2) {
            addCriterion("MODULE_WIDTH not between", value1, value2, "moduleWidth");
            return (Criteria) this;
        }

        public Criteria andModuleHeightIsNull() {
            addCriterion("MODULE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andModuleHeightIsNotNull() {
            addCriterion("MODULE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andModuleHeightEqualTo(String value) {
            addCriterion("MODULE_HEIGHT =", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightNotEqualTo(String value) {
            addCriterion("MODULE_HEIGHT <>", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightGreaterThan(String value) {
            addCriterion("MODULE_HEIGHT >", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_HEIGHT >=", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightLessThan(String value) {
            addCriterion("MODULE_HEIGHT <", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightLessThanOrEqualTo(String value) {
            addCriterion("MODULE_HEIGHT <=", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightLike(String value) {
            addCriterion("MODULE_HEIGHT like", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightNotLike(String value) {
            addCriterion("MODULE_HEIGHT not like", value, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightIn(List<String> values) {
            addCriterion("MODULE_HEIGHT in", values, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightNotIn(List<String> values) {
            addCriterion("MODULE_HEIGHT not in", values, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightBetween(String value1, String value2) {
            addCriterion("MODULE_HEIGHT between", value1, value2, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleHeightNotBetween(String value1, String value2) {
            addCriterion("MODULE_HEIGHT not between", value1, value2, "moduleHeight");
            return (Criteria) this;
        }

        public Criteria andModuleCheckIsNull() {
            addCriterion("MODULE_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andModuleCheckIsNotNull() {
            addCriterion("MODULE_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCheckEqualTo(Integer value) {
            addCriterion("MODULE_CHECK =", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckNotEqualTo(Integer value) {
            addCriterion("MODULE_CHECK <>", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckGreaterThan(Integer value) {
            addCriterion("MODULE_CHECK >", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODULE_CHECK >=", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckLessThan(Integer value) {
            addCriterion("MODULE_CHECK <", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckLessThanOrEqualTo(Integer value) {
            addCriterion("MODULE_CHECK <=", value, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckIn(List<Integer> values) {
            addCriterion("MODULE_CHECK in", values, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckNotIn(List<Integer> values) {
            addCriterion("MODULE_CHECK not in", values, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_CHECK between", value1, value2, "moduleCheck");
            return (Criteria) this;
        }

        public Criteria andModuleCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_CHECK not between", value1, value2, "moduleCheck");
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

        public Criteria andModuleContentLinktypeIsNull() {
            addCriterion("MODULE_CONTENT_LINKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeIsNotNull() {
            addCriterion("MODULE_CONTENT_LINKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeEqualTo(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE =", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeNotEqualTo(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE <>", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeGreaterThan(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE >", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE >=", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeLessThan(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE <", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeLessThanOrEqualTo(Integer value) {
            addCriterion("MODULE_CONTENT_LINKTYPE <=", value, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeIn(List<Integer> values) {
            addCriterion("MODULE_CONTENT_LINKTYPE in", values, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeNotIn(List<Integer> values) {
            addCriterion("MODULE_CONTENT_LINKTYPE not in", values, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_CONTENT_LINKTYPE between", value1, value2, "moduleContentLinktype");
            return (Criteria) this;
        }

        public Criteria andModuleContentLinktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MODULE_CONTENT_LINKTYPE not between", value1, value2, "moduleContentLinktype");
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