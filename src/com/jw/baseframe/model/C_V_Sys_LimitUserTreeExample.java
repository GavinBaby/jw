package com.jw.baseframe.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class C_V_Sys_LimitUserTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_V_Sys_LimitUserTreeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("P_ID like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("P_ID not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("UNIT_ID like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("UNIT_ID not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andFlaIsNull() {
            addCriterion("FLA is null");
            return (Criteria) this;
        }

        public Criteria andFlaIsNotNull() {
            addCriterion("FLA is not null");
            return (Criteria) this;
        }

        public Criteria andFlaEqualTo(String value) {
            addCriterion("FLA =", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaNotEqualTo(String value) {
            addCriterion("FLA <>", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaGreaterThan(String value) {
            addCriterion("FLA >", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaGreaterThanOrEqualTo(String value) {
            addCriterion("FLA >=", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaLessThan(String value) {
            addCriterion("FLA <", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaLessThanOrEqualTo(String value) {
            addCriterion("FLA <=", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaLike(String value) {
            addCriterion("FLA like", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaNotLike(String value) {
            addCriterion("FLA not like", value, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaIn(List<String> values) {
            addCriterion("FLA in", values, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaNotIn(List<String> values) {
            addCriterion("FLA not in", values, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaBetween(String value1, String value2) {
            addCriterion("FLA between", value1, value2, "fla");
            return (Criteria) this;
        }

        public Criteria andFlaNotBetween(String value1, String value2) {
            addCriterion("FLA not between", value1, value2, "fla");
            return (Criteria) this;
        }

        public Criteria andRowsortIsNull() {
            addCriterion("ROWSORT is null");
            return (Criteria) this;
        }

        public Criteria andRowsortIsNotNull() {
            addCriterion("ROWSORT is not null");
            return (Criteria) this;
        }

        public Criteria andRowsortEqualTo(BigDecimal value) {
            addCriterion("ROWSORT =", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortNotEqualTo(BigDecimal value) {
            addCriterion("ROWSORT <>", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortGreaterThan(BigDecimal value) {
            addCriterion("ROWSORT >", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWSORT >=", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortLessThan(BigDecimal value) {
            addCriterion("ROWSORT <", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWSORT <=", value, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortIn(List<BigDecimal> values) {
            addCriterion("ROWSORT in", values, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortNotIn(List<BigDecimal> values) {
            addCriterion("ROWSORT not in", values, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWSORT between", value1, value2, "rowsort");
            return (Criteria) this;
        }

        public Criteria andRowsortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWSORT not between", value1, value2, "rowsort");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNull() {
            addCriterion("IS_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andIsParentIsNotNull() {
            addCriterion("IS_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsParentEqualTo(String value) {
            addCriterion("IS_PARENT =", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotEqualTo(String value) {
            addCriterion("IS_PARENT <>", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThan(String value) {
            addCriterion("IS_PARENT >", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PARENT >=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThan(String value) {
            addCriterion("IS_PARENT <", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLessThanOrEqualTo(String value) {
            addCriterion("IS_PARENT <=", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentLike(String value) {
            addCriterion("IS_PARENT like", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotLike(String value) {
            addCriterion("IS_PARENT not like", value, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentIn(List<String> values) {
            addCriterion("IS_PARENT in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotIn(List<String> values) {
            addCriterion("IS_PARENT not in", values, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentBetween(String value1, String value2) {
            addCriterion("IS_PARENT between", value1, value2, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsParentNotBetween(String value1, String value2) {
            addCriterion("IS_PARENT not between", value1, value2, "isParent");
            return (Criteria) this;
        }

        public Criteria andIsFileinIsNull() {
            addCriterion("IS_FILEIN is null");
            return (Criteria) this;
        }

        public Criteria andIsFileinIsNotNull() {
            addCriterion("IS_FILEIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsFileinEqualTo(BigDecimal value) {
            addCriterion("IS_FILEIN =", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinNotEqualTo(BigDecimal value) {
            addCriterion("IS_FILEIN <>", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinGreaterThan(BigDecimal value) {
            addCriterion("IS_FILEIN >", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_FILEIN >=", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinLessThan(BigDecimal value) {
            addCriterion("IS_FILEIN <", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_FILEIN <=", value, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinIn(List<BigDecimal> values) {
            addCriterion("IS_FILEIN in", values, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinNotIn(List<BigDecimal> values) {
            addCriterion("IS_FILEIN not in", values, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_FILEIN between", value1, value2, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_FILEIN not between", value1, value2, "isFilein");
            return (Criteria) this;
        }

        public Criteria andIsFileoutIsNull() {
            addCriterion("IS_FILEOUT is null");
            return (Criteria) this;
        }

        public Criteria andIsFileoutIsNotNull() {
            addCriterion("IS_FILEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsFileoutEqualTo(BigDecimal value) {
            addCriterion("IS_FILEOUT =", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutNotEqualTo(BigDecimal value) {
            addCriterion("IS_FILEOUT <>", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutGreaterThan(BigDecimal value) {
            addCriterion("IS_FILEOUT >", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_FILEOUT >=", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutLessThan(BigDecimal value) {
            addCriterion("IS_FILEOUT <", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_FILEOUT <=", value, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutIn(List<BigDecimal> values) {
            addCriterion("IS_FILEOUT in", values, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutNotIn(List<BigDecimal> values) {
            addCriterion("IS_FILEOUT not in", values, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_FILEOUT between", value1, value2, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsFileoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_FILEOUT not between", value1, value2, "isFileout");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageIsNull() {
            addCriterion("IS_SENDMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageIsNotNull() {
            addCriterion("IS_SENDMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageEqualTo(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE =", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageNotEqualTo(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE <>", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageGreaterThan(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE >", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE >=", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageLessThan(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE <", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_SENDMESSAGE <=", value, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageIn(List<BigDecimal> values) {
            addCriterion("IS_SENDMESSAGE in", values, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageNotIn(List<BigDecimal> values) {
            addCriterion("IS_SENDMESSAGE not in", values, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_SENDMESSAGE between", value1, value2, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsSendmessageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_SENDMESSAGE not between", value1, value2, "isSendmessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageIsNull() {
            addCriterion("IS_RECEIVEMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageIsNotNull() {
            addCriterion("IS_RECEIVEMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageEqualTo(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE =", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageNotEqualTo(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE <>", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageGreaterThan(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE >", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE >=", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageLessThan(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE <", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_RECEIVEMESSAGE <=", value, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageIn(List<BigDecimal> values) {
            addCriterion("IS_RECEIVEMESSAGE in", values, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageNotIn(List<BigDecimal> values) {
            addCriterion("IS_RECEIVEMESSAGE not in", values, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_RECEIVEMESSAGE between", value1, value2, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsReceivemessageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_RECEIVEMESSAGE not between", value1, value2, "isReceivemessage");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportIsNull() {
            addCriterion("IS_MESSAGEIMPORT is null");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportIsNotNull() {
            addCriterion("IS_MESSAGEIMPORT is not null");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportEqualTo(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT =", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportNotEqualTo(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT <>", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportGreaterThan(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT >", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT >=", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportLessThan(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT <", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_MESSAGEIMPORT <=", value, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportIn(List<BigDecimal> values) {
            addCriterion("IS_MESSAGEIMPORT in", values, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportNotIn(List<BigDecimal> values) {
            addCriterion("IS_MESSAGEIMPORT not in", values, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_MESSAGEIMPORT between", value1, value2, "isMessageimport");
            return (Criteria) this;
        }

        public Criteria andIsMessageimportNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_MESSAGEIMPORT not between", value1, value2, "isMessageimport");
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