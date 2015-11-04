package com.jw.magicbpm.model.documentmanagement;

import java.util.ArrayList;
import java.util.List;

public class B_V_Flow_FileOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Flow_FileOutExample() {
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

        public Criteria andFileoutDraftDateIsNull() {
            addCriterion("FILEOUT_DRAFT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateIsNotNull() {
            addCriterion("FILEOUT_DRAFT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE =", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <>", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateGreaterThan(String value) {
            addCriterion("FILEOUT_DRAFT_DATE >", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE >=", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLessThan(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_DRAFT_DATE <=", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateLike(String value) {
            addCriterion("FILEOUT_DRAFT_DATE like", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotLike(String value) {
            addCriterion("FILEOUT_DRAFT_DATE not like", value, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT_DATE in", values, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotIn(List<String> values) {
            addCriterion("FILEOUT_DRAFT_DATE not in", values, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT_DATE between", value1, value2, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutDraftDateNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_DRAFT_DATE not between", value1, value2, "fileoutDraftDate");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidIsNull() {
            addCriterion("FILEOUT_RECORDTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidIsNotNull() {
            addCriterion("FILEOUT_RECORDTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID =", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <>", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidGreaterThan(String value) {
            addCriterion("FILEOUT_RECORDTYPEID >", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID >=", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLessThan(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_RECORDTYPEID <=", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidLike(String value) {
            addCriterion("FILEOUT_RECORDTYPEID like", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotLike(String value) {
            addCriterion("FILEOUT_RECORDTYPEID not like", value, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidIn(List<String> values) {
            addCriterion("FILEOUT_RECORDTYPEID in", values, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotIn(List<String> values) {
            addCriterion("FILEOUT_RECORDTYPEID not in", values, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidBetween(String value1, String value2) {
            addCriterion("FILEOUT_RECORDTYPEID between", value1, value2, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutRecordtypeidNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_RECORDTYPEID not between", value1, value2, "fileoutRecordtypeid");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIsNull() {
            addCriterion("FILEOUT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIsNotNull() {
            addCriterion("FILEOUT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutYearEqualTo(String value) {
            addCriterion("FILEOUT_YEAR =", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotEqualTo(String value) {
            addCriterion("FILEOUT_YEAR <>", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearGreaterThan(String value) {
            addCriterion("FILEOUT_YEAR >", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_YEAR >=", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLessThan(String value) {
            addCriterion("FILEOUT_YEAR <", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_YEAR <=", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearLike(String value) {
            addCriterion("FILEOUT_YEAR like", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotLike(String value) {
            addCriterion("FILEOUT_YEAR not like", value, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearIn(List<String> values) {
            addCriterion("FILEOUT_YEAR in", values, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotIn(List<String> values) {
            addCriterion("FILEOUT_YEAR not in", values, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearBetween(String value1, String value2) {
            addCriterion("FILEOUT_YEAR between", value1, value2, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutYearNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_YEAR not between", value1, value2, "fileoutYear");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIsNull() {
            addCriterion("FILEOUT_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIsNotNull() {
            addCriterion("FILEOUT_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL =", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL <>", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialGreaterThan(String value) {
            addCriterion("FILEOUT_SERIAL >", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL >=", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLessThan(String value) {
            addCriterion("FILEOUT_SERIAL <", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_SERIAL <=", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialLike(String value) {
            addCriterion("FILEOUT_SERIAL like", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotLike(String value) {
            addCriterion("FILEOUT_SERIAL not like", value, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialIn(List<String> values) {
            addCriterion("FILEOUT_SERIAL in", values, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotIn(List<String> values) {
            addCriterion("FILEOUT_SERIAL not in", values, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialBetween(String value1, String value2) {
            addCriterion("FILEOUT_SERIAL between", value1, value2, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutSerialNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_SERIAL not between", value1, value2, "fileoutSerial");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIsNull() {
            addCriterion("FILEOUT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIsNotNull() {
            addCriterion("FILEOUT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleEqualTo(String value) {
            addCriterion("FILEOUT_TITLE =", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotEqualTo(String value) {
            addCriterion("FILEOUT_TITLE <>", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleGreaterThan(String value) {
            addCriterion("FILEOUT_TITLE >", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_TITLE >=", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLessThan(String value) {
            addCriterion("FILEOUT_TITLE <", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_TITLE <=", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleLike(String value) {
            addCriterion("FILEOUT_TITLE like", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotLike(String value) {
            addCriterion("FILEOUT_TITLE not like", value, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleIn(List<String> values) {
            addCriterion("FILEOUT_TITLE in", values, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotIn(List<String> values) {
            addCriterion("FILEOUT_TITLE not in", values, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleBetween(String value1, String value2) {
            addCriterion("FILEOUT_TITLE between", value1, value2, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutTitleNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_TITLE not between", value1, value2, "fileoutTitle");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIsNull() {
            addCriterion("FILEOUT_URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIsNotNull() {
            addCriterion("FILEOUT_URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY =", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY <>", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyGreaterThan(String value) {
            addCriterion("FILEOUT_URGENCY >", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY >=", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLessThan(String value) {
            addCriterion("FILEOUT_URGENCY <", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLessThanOrEqualTo(String value) {
            addCriterion("FILEOUT_URGENCY <=", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyLike(String value) {
            addCriterion("FILEOUT_URGENCY like", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotLike(String value) {
            addCriterion("FILEOUT_URGENCY not like", value, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyIn(List<String> values) {
            addCriterion("FILEOUT_URGENCY in", values, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotIn(List<String> values) {
            addCriterion("FILEOUT_URGENCY not in", values, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyBetween(String value1, String value2) {
            addCriterion("FILEOUT_URGENCY between", value1, value2, "fileoutUrgency");
            return (Criteria) this;
        }

        public Criteria andFileoutUrgencyNotBetween(String value1, String value2) {
            addCriterion("FILEOUT_URGENCY not between", value1, value2, "fileoutUrgency");
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

        public Criteria andRecordtypeNameIsNull() {
            addCriterion("RECORDTYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameIsNotNull() {
            addCriterion("RECORDTYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameEqualTo(String value) {
            addCriterion("RECORDTYPE_NAME =", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameNotEqualTo(String value) {
            addCriterion("RECORDTYPE_NAME <>", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameGreaterThan(String value) {
            addCriterion("RECORDTYPE_NAME >", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDTYPE_NAME >=", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameLessThan(String value) {
            addCriterion("RECORDTYPE_NAME <", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameLessThanOrEqualTo(String value) {
            addCriterion("RECORDTYPE_NAME <=", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameLike(String value) {
            addCriterion("RECORDTYPE_NAME like", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameNotLike(String value) {
            addCriterion("RECORDTYPE_NAME not like", value, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameIn(List<String> values) {
            addCriterion("RECORDTYPE_NAME in", values, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameNotIn(List<String> values) {
            addCriterion("RECORDTYPE_NAME not in", values, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameBetween(String value1, String value2) {
            addCriterion("RECORDTYPE_NAME between", value1, value2, "recordtypeName");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNameNotBetween(String value1, String value2) {
            addCriterion("RECORDTYPE_NAME not between", value1, value2, "recordtypeName");
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

        public Criteria andTacheuserIsNull() {
            addCriterion("TACHEUSER is null");
            return (Criteria) this;
        }

        public Criteria andTacheuserIsNotNull() {
            addCriterion("TACHEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andTacheuserEqualTo(String value) {
            addCriterion("TACHEUSER =", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserNotEqualTo(String value) {
            addCriterion("TACHEUSER <>", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserGreaterThan(String value) {
            addCriterion("TACHEUSER >", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserGreaterThanOrEqualTo(String value) {
            addCriterion("TACHEUSER >=", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserLessThan(String value) {
            addCriterion("TACHEUSER <", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserLessThanOrEqualTo(String value) {
            addCriterion("TACHEUSER <=", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserLike(String value) {
            addCriterion("TACHEUSER like", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserNotLike(String value) {
            addCriterion("TACHEUSER not like", value, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserIn(List<String> values) {
            addCriterion("TACHEUSER in", values, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserNotIn(List<String> values) {
            addCriterion("TACHEUSER not in", values, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserBetween(String value1, String value2) {
            addCriterion("TACHEUSER between", value1, value2, "tacheuser");
            return (Criteria) this;
        }

        public Criteria andTacheuserNotBetween(String value1, String value2) {
            addCriterion("TACHEUSER not between", value1, value2, "tacheuser");
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