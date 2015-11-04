package com.jw.magicbpm.model.publicinformation;

import java.util.ArrayList;
import java.util.List;

public class B_T_Flow_MeetingserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B_T_Flow_MeetingserviceExample() {
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

        public Criteria andRegistrantIsNull() {
            addCriterion("REGISTRANT is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantIsNotNull() {
            addCriterion("REGISTRANT is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantEqualTo(String value) {
            addCriterion("REGISTRANT =", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotEqualTo(String value) {
            addCriterion("REGISTRANT <>", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThan(String value) {
            addCriterion("REGISTRANT >", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRANT >=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThan(String value) {
            addCriterion("REGISTRANT <", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThanOrEqualTo(String value) {
            addCriterion("REGISTRANT <=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLike(String value) {
            addCriterion("REGISTRANT like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotLike(String value) {
            addCriterion("REGISTRANT not like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantIn(List<String> values) {
            addCriterion("REGISTRANT in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotIn(List<String> values) {
            addCriterion("REGISTRANT not in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantBetween(String value1, String value2) {
            addCriterion("REGISTRANT between", value1, value2, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotBetween(String value1, String value2) {
            addCriterion("REGISTRANT not between", value1, value2, "registrant");
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

        public Criteria andMeetingdemandIsNull() {
            addCriterion("MEETINGDEMAND is null");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandIsNotNull() {
            addCriterion("MEETINGDEMAND is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandEqualTo(String value) {
            addCriterion("MEETINGDEMAND =", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandNotEqualTo(String value) {
            addCriterion("MEETINGDEMAND <>", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandGreaterThan(String value) {
            addCriterion("MEETINGDEMAND >", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGDEMAND >=", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandLessThan(String value) {
            addCriterion("MEETINGDEMAND <", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandLessThanOrEqualTo(String value) {
            addCriterion("MEETINGDEMAND <=", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandLike(String value) {
            addCriterion("MEETINGDEMAND like", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandNotLike(String value) {
            addCriterion("MEETINGDEMAND not like", value, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandIn(List<String> values) {
            addCriterion("MEETINGDEMAND in", values, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandNotIn(List<String> values) {
            addCriterion("MEETINGDEMAND not in", values, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandBetween(String value1, String value2) {
            addCriterion("MEETINGDEMAND between", value1, value2, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andMeetingdemandNotBetween(String value1, String value2) {
            addCriterion("MEETINGDEMAND not between", value1, value2, "meetingdemand");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireIsNull() {
            addCriterion("SPECIALREQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireIsNotNull() {
            addCriterion("SPECIALREQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireEqualTo(String value) {
            addCriterion("SPECIALREQUIRE =", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireNotEqualTo(String value) {
            addCriterion("SPECIALREQUIRE <>", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireGreaterThan(String value) {
            addCriterion("SPECIALREQUIRE >", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALREQUIRE >=", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireLessThan(String value) {
            addCriterion("SPECIALREQUIRE <", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireLessThanOrEqualTo(String value) {
            addCriterion("SPECIALREQUIRE <=", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireLike(String value) {
            addCriterion("SPECIALREQUIRE like", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireNotLike(String value) {
            addCriterion("SPECIALREQUIRE not like", value, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireIn(List<String> values) {
            addCriterion("SPECIALREQUIRE in", values, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireNotIn(List<String> values) {
            addCriterion("SPECIALREQUIRE not in", values, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireBetween(String value1, String value2) {
            addCriterion("SPECIALREQUIRE between", value1, value2, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andSpecialrequireNotBetween(String value1, String value2) {
            addCriterion("SPECIALREQUIRE not between", value1, value2, "specialrequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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