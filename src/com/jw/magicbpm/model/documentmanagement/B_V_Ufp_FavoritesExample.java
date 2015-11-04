package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_V_Ufp_FavoritesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Ufp_FavoritesExample() {
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

        public Criteria andFavoritesUseridIsNull() {
            addCriterion("FAVORITES_USERID is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridIsNotNull() {
            addCriterion("FAVORITES_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridEqualTo(String value) {
            addCriterion("FAVORITES_USERID =", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridNotEqualTo(String value) {
            addCriterion("FAVORITES_USERID <>", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridGreaterThan(String value) {
            addCriterion("FAVORITES_USERID >", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_USERID >=", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridLessThan(String value) {
            addCriterion("FAVORITES_USERID <", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_USERID <=", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridLike(String value) {
            addCriterion("FAVORITES_USERID like", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridNotLike(String value) {
            addCriterion("FAVORITES_USERID not like", value, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridIn(List<String> values) {
            addCriterion("FAVORITES_USERID in", values, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridNotIn(List<String> values) {
            addCriterion("FAVORITES_USERID not in", values, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridBetween(String value1, String value2) {
            addCriterion("FAVORITES_USERID between", value1, value2, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUseridNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_USERID not between", value1, value2, "favoritesUserid");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmIsNull() {
            addCriterion("FAVORITES_USERNM is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmIsNotNull() {
            addCriterion("FAVORITES_USERNM is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmEqualTo(String value) {
            addCriterion("FAVORITES_USERNM =", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmNotEqualTo(String value) {
            addCriterion("FAVORITES_USERNM <>", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmGreaterThan(String value) {
            addCriterion("FAVORITES_USERNM >", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_USERNM >=", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmLessThan(String value) {
            addCriterion("FAVORITES_USERNM <", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_USERNM <=", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmLike(String value) {
            addCriterion("FAVORITES_USERNM like", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmNotLike(String value) {
            addCriterion("FAVORITES_USERNM not like", value, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmIn(List<String> values) {
            addCriterion("FAVORITES_USERNM in", values, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmNotIn(List<String> values) {
            addCriterion("FAVORITES_USERNM not in", values, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmBetween(String value1, String value2) {
            addCriterion("FAVORITES_USERNM between", value1, value2, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesUsernmNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_USERNM not between", value1, value2, "favoritesUsernm");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidIsNull() {
            addCriterion("FAVORITES_TYPEID is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidIsNotNull() {
            addCriterion("FAVORITES_TYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidEqualTo(String value) {
            addCriterion("FAVORITES_TYPEID =", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidNotEqualTo(String value) {
            addCriterion("FAVORITES_TYPEID <>", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidGreaterThan(String value) {
            addCriterion("FAVORITES_TYPEID >", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TYPEID >=", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidLessThan(String value) {
            addCriterion("FAVORITES_TYPEID <", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TYPEID <=", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidLike(String value) {
            addCriterion("FAVORITES_TYPEID like", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidNotLike(String value) {
            addCriterion("FAVORITES_TYPEID not like", value, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidIn(List<String> values) {
            addCriterion("FAVORITES_TYPEID in", values, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidNotIn(List<String> values) {
            addCriterion("FAVORITES_TYPEID not in", values, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidBetween(String value1, String value2) {
            addCriterion("FAVORITES_TYPEID between", value1, value2, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypeidNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_TYPEID not between", value1, value2, "favoritesTypeid");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameIsNull() {
            addCriterion("FAVORITES_TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameIsNotNull() {
            addCriterion("FAVORITES_TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameEqualTo(String value) {
            addCriterion("FAVORITES_TYPENAME =", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameNotEqualTo(String value) {
            addCriterion("FAVORITES_TYPENAME <>", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameGreaterThan(String value) {
            addCriterion("FAVORITES_TYPENAME >", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TYPENAME >=", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameLessThan(String value) {
            addCriterion("FAVORITES_TYPENAME <", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TYPENAME <=", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameLike(String value) {
            addCriterion("FAVORITES_TYPENAME like", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameNotLike(String value) {
            addCriterion("FAVORITES_TYPENAME not like", value, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameIn(List<String> values) {
            addCriterion("FAVORITES_TYPENAME in", values, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameNotIn(List<String> values) {
            addCriterion("FAVORITES_TYPENAME not in", values, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameBetween(String value1, String value2) {
            addCriterion("FAVORITES_TYPENAME between", value1, value2, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesTypenameNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_TYPENAME not between", value1, value2, "favoritesTypename");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlIsNull() {
            addCriterion("FAVORITES_URL is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlIsNotNull() {
            addCriterion("FAVORITES_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlEqualTo(String value) {
            addCriterion("FAVORITES_URL =", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlNotEqualTo(String value) {
            addCriterion("FAVORITES_URL <>", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlGreaterThan(String value) {
            addCriterion("FAVORITES_URL >", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_URL >=", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlLessThan(String value) {
            addCriterion("FAVORITES_URL <", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_URL <=", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlLike(String value) {
            addCriterion("FAVORITES_URL like", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlNotLike(String value) {
            addCriterion("FAVORITES_URL not like", value, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlIn(List<String> values) {
            addCriterion("FAVORITES_URL in", values, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlNotIn(List<String> values) {
            addCriterion("FAVORITES_URL not in", values, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlBetween(String value1, String value2) {
            addCriterion("FAVORITES_URL between", value1, value2, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andFavoritesUrlNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_URL not between", value1, value2, "favoritesUrl");
            return (Criteria) this;
        }

        public Criteria andMaindocIdIsNull() {
            addCriterion("MAINDOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaindocIdIsNotNull() {
            addCriterion("MAINDOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaindocIdEqualTo(String value) {
            addCriterion("MAINDOC_ID =", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdNotEqualTo(String value) {
            addCriterion("MAINDOC_ID <>", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdGreaterThan(String value) {
            addCriterion("MAINDOC_ID >", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAINDOC_ID >=", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdLessThan(String value) {
            addCriterion("MAINDOC_ID <", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdLessThanOrEqualTo(String value) {
            addCriterion("MAINDOC_ID <=", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdLike(String value) {
            addCriterion("MAINDOC_ID like", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdNotLike(String value) {
            addCriterion("MAINDOC_ID not like", value, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdIn(List<String> values) {
            addCriterion("MAINDOC_ID in", values, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdNotIn(List<String> values) {
            addCriterion("MAINDOC_ID not in", values, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdBetween(String value1, String value2) {
            addCriterion("MAINDOC_ID between", value1, value2, "maindocId");
            return (Criteria) this;
        }

        public Criteria andMaindocIdNotBetween(String value1, String value2) {
            addCriterion("MAINDOC_ID not between", value1, value2, "maindocId");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkIsNull() {
            addCriterion("FAVORITES_MARK is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkIsNotNull() {
            addCriterion("FAVORITES_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkEqualTo(String value) {
            addCriterion("FAVORITES_MARK =", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkNotEqualTo(String value) {
            addCriterion("FAVORITES_MARK <>", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkGreaterThan(String value) {
            addCriterion("FAVORITES_MARK >", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_MARK >=", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkLessThan(String value) {
            addCriterion("FAVORITES_MARK <", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_MARK <=", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkLike(String value) {
            addCriterion("FAVORITES_MARK like", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkNotLike(String value) {
            addCriterion("FAVORITES_MARK not like", value, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkIn(List<String> values) {
            addCriterion("FAVORITES_MARK in", values, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkNotIn(List<String> values) {
            addCriterion("FAVORITES_MARK not in", values, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkBetween(String value1, String value2) {
            addCriterion("FAVORITES_MARK between", value1, value2, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesMarkNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_MARK not between", value1, value2, "favoritesMark");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleIsNull() {
            addCriterion("FAVORITES_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleIsNotNull() {
            addCriterion("FAVORITES_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleEqualTo(String value) {
            addCriterion("FAVORITES_TITLE =", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleNotEqualTo(String value) {
            addCriterion("FAVORITES_TITLE <>", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleGreaterThan(String value) {
            addCriterion("FAVORITES_TITLE >", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TITLE >=", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleLessThan(String value) {
            addCriterion("FAVORITES_TITLE <", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TITLE <=", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleLike(String value) {
            addCriterion("FAVORITES_TITLE like", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleNotLike(String value) {
            addCriterion("FAVORITES_TITLE not like", value, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleIn(List<String> values) {
            addCriterion("FAVORITES_TITLE in", values, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleNotIn(List<String> values) {
            addCriterion("FAVORITES_TITLE not in", values, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleBetween(String value1, String value2) {
            addCriterion("FAVORITES_TITLE between", value1, value2, "favoritesTitle");
            return (Criteria) this;
        }

        public Criteria andFavoritesTitleNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_TITLE not between", value1, value2, "favoritesTitle");
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

        public Criteria andFavoritesWenhaoIsNull() {
            addCriterion("FAVORITES_WENHAO is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoIsNotNull() {
            addCriterion("FAVORITES_WENHAO is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoEqualTo(String value) {
            addCriterion("FAVORITES_WENHAO =", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoNotEqualTo(String value) {
            addCriterion("FAVORITES_WENHAO <>", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoGreaterThan(String value) {
            addCriterion("FAVORITES_WENHAO >", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_WENHAO >=", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoLessThan(String value) {
            addCriterion("FAVORITES_WENHAO <", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_WENHAO <=", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoLike(String value) {
            addCriterion("FAVORITES_WENHAO like", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoNotLike(String value) {
            addCriterion("FAVORITES_WENHAO not like", value, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoIn(List<String> values) {
            addCriterion("FAVORITES_WENHAO in", values, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoNotIn(List<String> values) {
            addCriterion("FAVORITES_WENHAO not in", values, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoBetween(String value1, String value2) {
            addCriterion("FAVORITES_WENHAO between", value1, value2, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesWenhaoNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_WENHAO not between", value1, value2, "favoritesWenhao");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeIsNull() {
            addCriterion("FAVORITES_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeIsNotNull() {
            addCriterion("FAVORITES_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeEqualTo(String value) {
            addCriterion("FAVORITES_TIME =", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeNotEqualTo(String value) {
            addCriterion("FAVORITES_TIME <>", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeGreaterThan(String value) {
            addCriterion("FAVORITES_TIME >", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TIME >=", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeLessThan(String value) {
            addCriterion("FAVORITES_TIME <", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeLessThanOrEqualTo(String value) {
            addCriterion("FAVORITES_TIME <=", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeLike(String value) {
            addCriterion("FAVORITES_TIME like", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeNotLike(String value) {
            addCriterion("FAVORITES_TIME not like", value, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeIn(List<String> values) {
            addCriterion("FAVORITES_TIME in", values, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeNotIn(List<String> values) {
            addCriterion("FAVORITES_TIME not in", values, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeBetween(String value1, String value2) {
            addCriterion("FAVORITES_TIME between", value1, value2, "favoritesTime");
            return (Criteria) this;
        }

        public Criteria andFavoritesTimeNotBetween(String value1, String value2) {
            addCriterion("FAVORITES_TIME not between", value1, value2, "favoritesTime");
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