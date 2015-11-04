package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_T_Ufp_FilesBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Ufp_FilesBaseExample() {
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

        public Criteria andDocumentbaseIdIsNull() {
            addCriterion("DOCUMENTBASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdIsNotNull() {
            addCriterion("DOCUMENTBASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdEqualTo(String value) {
            addCriterion("DOCUMENTBASE_ID =", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_ID <>", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_ID >", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_ID >=", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdLessThan(String value) {
            addCriterion("DOCUMENTBASE_ID <", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_ID <=", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdLike(String value) {
            addCriterion("DOCUMENTBASE_ID like", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdNotLike(String value) {
            addCriterion("DOCUMENTBASE_ID not like", value, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdIn(List<String> values) {
            addCriterion("DOCUMENTBASE_ID in", values, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_ID not in", values, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_ID between", value1, value2, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseIdNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_ID not between", value1, value2, "documentbaseId");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleIsNull() {
            addCriterion("DOCUMENTBASE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleIsNotNull() {
            addCriterion("DOCUMENTBASE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleEqualTo(String value) {
            addCriterion("DOCUMENTBASE_TITLE =", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_TITLE <>", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_TITLE >", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_TITLE >=", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleLessThan(String value) {
            addCriterion("DOCUMENTBASE_TITLE <", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_TITLE <=", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleLike(String value) {
            addCriterion("DOCUMENTBASE_TITLE like", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleNotLike(String value) {
            addCriterion("DOCUMENTBASE_TITLE not like", value, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleIn(List<String> values) {
            addCriterion("DOCUMENTBASE_TITLE in", values, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_TITLE not in", values, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_TITLE between", value1, value2, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseTitleNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_TITLE not between", value1, value2, "documentbaseTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkIsNull() {
            addCriterion("DOCUMENTBASE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkIsNotNull() {
            addCriterion("DOCUMENTBASE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MARK =", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MARK <>", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_MARK >", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MARK >=", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkLessThan(String value) {
            addCriterion("DOCUMENTBASE_MARK <", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MARK <=", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkLike(String value) {
            addCriterion("DOCUMENTBASE_MARK like", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkNotLike(String value) {
            addCriterion("DOCUMENTBASE_MARK not like", value, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkIn(List<String> values) {
            addCriterion("DOCUMENTBASE_MARK in", values, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_MARK not in", values, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_MARK between", value1, value2, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMarkNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_MARK not between", value1, value2, "documentbaseMark");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathIsNull() {
            addCriterion("DOCUMENTBASE_FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathIsNotNull() {
            addCriterion("DOCUMENTBASE_FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH =", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH <>", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH >", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH >=", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathLessThan(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH <", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH <=", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathLike(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH like", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathNotLike(String value) {
            addCriterion("DOCUMENTBASE_FILEPATH not like", value, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FILEPATH in", values, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FILEPATH not in", values, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FILEPATH between", value1, value2, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFilepathNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FILEPATH not between", value1, value2, "documentbaseFilepath");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateIsNull() {
            addCriterion("DOCUMENTBASE_FILEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateIsNotNull() {
            addCriterion("DOCUMENTBASE_FILEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE =", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE <>", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE >", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE >=", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateLessThan(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE <", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE <=", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateLike(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE like", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateNotLike(String value) {
            addCriterion("DOCUMENTBASE_FILEDATE not like", value, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FILEDATE in", values, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FILEDATE not in", values, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FILEDATE between", value1, value2, "documentbaseFiledate");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFiledateNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FILEDATE not between", value1, value2, "documentbaseFiledate");
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

        public Criteria andDocumentbaseSwwhIsNull() {
            addCriterion("DOCUMENTBASE_SWWH is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhIsNotNull() {
            addCriterion("DOCUMENTBASE_SWWH is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhEqualTo(String value) {
            addCriterion("DOCUMENTBASE_SWWH =", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_SWWH <>", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_SWWH >", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_SWWH >=", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhLessThan(String value) {
            addCriterion("DOCUMENTBASE_SWWH <", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_SWWH <=", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhLike(String value) {
            addCriterion("DOCUMENTBASE_SWWH like", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhNotLike(String value) {
            addCriterion("DOCUMENTBASE_SWWH not like", value, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhIn(List<String> values) {
            addCriterion("DOCUMENTBASE_SWWH in", values, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_SWWH not in", values, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_SWWH between", value1, value2, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseSwwhNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_SWWH not between", value1, value2, "documentbaseSwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhIsNull() {
            addCriterion("DOCUMENTBASE_LWWH is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhIsNotNull() {
            addCriterion("DOCUMENTBASE_LWWH is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhEqualTo(String value) {
            addCriterion("DOCUMENTBASE_LWWH =", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_LWWH <>", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_LWWH >", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_LWWH >=", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhLessThan(String value) {
            addCriterion("DOCUMENTBASE_LWWH <", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_LWWH <=", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhLike(String value) {
            addCriterion("DOCUMENTBASE_LWWH like", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhNotLike(String value) {
            addCriterion("DOCUMENTBASE_LWWH not like", value, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhIn(List<String> values) {
            addCriterion("DOCUMENTBASE_LWWH in", values, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_LWWH not in", values, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_LWWH between", value1, value2, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseLwwhNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_LWWH not between", value1, value2, "documentbaseLwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjIsNull() {
            addCriterion("DOCUMENTBASE_MJ is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjIsNotNull() {
            addCriterion("DOCUMENTBASE_MJ is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MJ =", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MJ <>", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_MJ >", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MJ >=", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjLessThan(String value) {
            addCriterion("DOCUMENTBASE_MJ <", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_MJ <=", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjLike(String value) {
            addCriterion("DOCUMENTBASE_MJ like", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjNotLike(String value) {
            addCriterion("DOCUMENTBASE_MJ not like", value, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjIn(List<String> values) {
            addCriterion("DOCUMENTBASE_MJ in", values, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_MJ not in", values, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_MJ between", value1, value2, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseMjNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_MJ not between", value1, value2, "documentbaseMj");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhIsNull() {
            addCriterion("DOCUMENTBASE_FWWH is null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhIsNotNull() {
            addCriterion("DOCUMENTBASE_FWWH is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FWWH =", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhNotEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FWWH <>", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhGreaterThan(String value) {
            addCriterion("DOCUMENTBASE_FWWH >", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FWWH >=", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhLessThan(String value) {
            addCriterion("DOCUMENTBASE_FWWH <", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTBASE_FWWH <=", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhLike(String value) {
            addCriterion("DOCUMENTBASE_FWWH like", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhNotLike(String value) {
            addCriterion("DOCUMENTBASE_FWWH not like", value, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FWWH in", values, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhNotIn(List<String> values) {
            addCriterion("DOCUMENTBASE_FWWH not in", values, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FWWH between", value1, value2, "documentbaseFwwh");
            return (Criteria) this;
        }

        public Criteria andDocumentbaseFwwhNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTBASE_FWWH not between", value1, value2, "documentbaseFwwh");
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