package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_V_Flow_MeetingserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_V_Flow_MeetingserviceExample() {
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

        public Criteria andApplicantpersonIsNull() {
            addCriterion("APPLICANTPERSON is null");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonIsNotNull() {
            addCriterion("APPLICANTPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonEqualTo(String value) {
            addCriterion("APPLICANTPERSON =", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonNotEqualTo(String value) {
            addCriterion("APPLICANTPERSON <>", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonGreaterThan(String value) {
            addCriterion("APPLICANTPERSON >", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTPERSON >=", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonLessThan(String value) {
            addCriterion("APPLICANTPERSON <", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTPERSON <=", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonLike(String value) {
            addCriterion("APPLICANTPERSON like", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonNotLike(String value) {
            addCriterion("APPLICANTPERSON not like", value, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonIn(List<String> values) {
            addCriterion("APPLICANTPERSON in", values, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonNotIn(List<String> values) {
            addCriterion("APPLICANTPERSON not in", values, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonBetween(String value1, String value2) {
            addCriterion("APPLICANTPERSON between", value1, value2, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicantpersonNotBetween(String value1, String value2) {
            addCriterion("APPLICANTPERSON not between", value1, value2, "applicantperson");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeIsNull() {
            addCriterion("APPLICANTTIME is null");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeIsNotNull() {
            addCriterion("APPLICANTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeEqualTo(String value) {
            addCriterion("APPLICANTTIME =", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeNotEqualTo(String value) {
            addCriterion("APPLICANTTIME <>", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeGreaterThan(String value) {
            addCriterion("APPLICANTTIME >", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICANTTIME >=", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeLessThan(String value) {
            addCriterion("APPLICANTTIME <", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeLessThanOrEqualTo(String value) {
            addCriterion("APPLICANTTIME <=", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeLike(String value) {
            addCriterion("APPLICANTTIME like", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeNotLike(String value) {
            addCriterion("APPLICANTTIME not like", value, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeIn(List<String> values) {
            addCriterion("APPLICANTTIME in", values, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeNotIn(List<String> values) {
            addCriterion("APPLICANTTIME not in", values, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeBetween(String value1, String value2) {
            addCriterion("APPLICANTTIME between", value1, value2, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andApplicanttimeNotBetween(String value1, String value2) {
            addCriterion("APPLICANTTIME not between", value1, value2, "applicanttime");
            return (Criteria) this;
        }

        public Criteria andReservationnumIsNull() {
            addCriterion("RESERVATIONNUM is null");
            return (Criteria) this;
        }

        public Criteria andReservationnumIsNotNull() {
            addCriterion("RESERVATIONNUM is not null");
            return (Criteria) this;
        }

        public Criteria andReservationnumEqualTo(Integer value) {
            addCriterion("RESERVATIONNUM =", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumNotEqualTo(Integer value) {
            addCriterion("RESERVATIONNUM <>", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumGreaterThan(Integer value) {
            addCriterion("RESERVATIONNUM >", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESERVATIONNUM >=", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumLessThan(Integer value) {
            addCriterion("RESERVATIONNUM <", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumLessThanOrEqualTo(Integer value) {
            addCriterion("RESERVATIONNUM <=", value, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumIn(List<Integer> values) {
            addCriterion("RESERVATIONNUM in", values, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumNotIn(List<Integer> values) {
            addCriterion("RESERVATIONNUM not in", values, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumBetween(Integer value1, Integer value2) {
            addCriterion("RESERVATIONNUM between", value1, value2, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andReservationnumNotBetween(Integer value1, Integer value2) {
            addCriterion("RESERVATIONNUM not between", value1, value2, "reservationnum");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("STARTTIME like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("STARTTIME not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("ENDTIME like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("ENDTIME not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdIsNull() {
            addCriterion("MEETINGROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdIsNotNull() {
            addCriterion("MEETINGROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdEqualTo(String value) {
            addCriterion("MEETINGROOM_ID =", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotEqualTo(String value) {
            addCriterion("MEETINGROOM_ID <>", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdGreaterThan(String value) {
            addCriterion("MEETINGROOM_ID >", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGROOM_ID >=", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdLessThan(String value) {
            addCriterion("MEETINGROOM_ID <", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdLessThanOrEqualTo(String value) {
            addCriterion("MEETINGROOM_ID <=", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdLike(String value) {
            addCriterion("MEETINGROOM_ID like", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotLike(String value) {
            addCriterion("MEETINGROOM_ID not like", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdIn(List<String> values) {
            addCriterion("MEETINGROOM_ID in", values, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotIn(List<String> values) {
            addCriterion("MEETINGROOM_ID not in", values, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdBetween(String value1, String value2) {
            addCriterion("MEETINGROOM_ID between", value1, value2, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotBetween(String value1, String value2) {
            addCriterion("MEETINGROOM_ID not between", value1, value2, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIsNull() {
            addCriterion("MEETINGROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIsNotNull() {
            addCriterion("MEETINGROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameEqualTo(String value) {
            addCriterion("MEETINGROOM_NAME =", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotEqualTo(String value) {
            addCriterion("MEETINGROOM_NAME <>", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameGreaterThan(String value) {
            addCriterion("MEETINGROOM_NAME >", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGROOM_NAME >=", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLessThan(String value) {
            addCriterion("MEETINGROOM_NAME <", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLessThanOrEqualTo(String value) {
            addCriterion("MEETINGROOM_NAME <=", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLike(String value) {
            addCriterion("MEETINGROOM_NAME like", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotLike(String value) {
            addCriterion("MEETINGROOM_NAME not like", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIn(List<String> values) {
            addCriterion("MEETINGROOM_NAME in", values, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotIn(List<String> values) {
            addCriterion("MEETINGROOM_NAME not in", values, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameBetween(String value1, String value2) {
            addCriterion("MEETINGROOM_NAME between", value1, value2, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotBetween(String value1, String value2) {
            addCriterion("MEETINGROOM_NAME not between", value1, value2, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleIsNull() {
            addCriterion("MEETINGTITLE is null");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleIsNotNull() {
            addCriterion("MEETINGTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleEqualTo(String value) {
            addCriterion("MEETINGTITLE =", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleNotEqualTo(String value) {
            addCriterion("MEETINGTITLE <>", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleGreaterThan(String value) {
            addCriterion("MEETINGTITLE >", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGTITLE >=", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleLessThan(String value) {
            addCriterion("MEETINGTITLE <", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleLessThanOrEqualTo(String value) {
            addCriterion("MEETINGTITLE <=", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleLike(String value) {
            addCriterion("MEETINGTITLE like", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleNotLike(String value) {
            addCriterion("MEETINGTITLE not like", value, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleIn(List<String> values) {
            addCriterion("MEETINGTITLE in", values, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleNotIn(List<String> values) {
            addCriterion("MEETINGTITLE not in", values, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleBetween(String value1, String value2) {
            addCriterion("MEETINGTITLE between", value1, value2, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andMeetingtitleNotBetween(String value1, String value2) {
            addCriterion("MEETINGTITLE not between", value1, value2, "meetingtitle");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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