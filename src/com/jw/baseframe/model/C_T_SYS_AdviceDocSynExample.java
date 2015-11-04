package com.jw.baseframe.model;

import java.util.ArrayList;
import java.util.List;

public class C_T_SYS_AdviceDocSynExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C_T_SYS_AdviceDocSynExample() {
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

        public Criteria andNoteidIsNull() {
            addCriterion("NOTEID is null");
            return (Criteria) this;
        }

        public Criteria andNoteidIsNotNull() {
            addCriterion("NOTEID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteidEqualTo(String value) {
            addCriterion("NOTEID =", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotEqualTo(String value) {
            addCriterion("NOTEID <>", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThan(String value) {
            addCriterion("NOTEID >", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThanOrEqualTo(String value) {
            addCriterion("NOTEID >=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThan(String value) {
            addCriterion("NOTEID <", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThanOrEqualTo(String value) {
            addCriterion("NOTEID <=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLike(String value) {
            addCriterion("NOTEID like", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotLike(String value) {
            addCriterion("NOTEID not like", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidIn(List<String> values) {
            addCriterion("NOTEID in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotIn(List<String> values) {
            addCriterion("NOTEID not in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidBetween(String value1, String value2) {
            addCriterion("NOTEID between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotBetween(String value1, String value2) {
            addCriterion("NOTEID not between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeIsNull() {
            addCriterion("THISDOCTYPE is null");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeIsNotNull() {
            addCriterion("THISDOCTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeEqualTo(String value) {
            addCriterion("THISDOCTYPE =", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeNotEqualTo(String value) {
            addCriterion("THISDOCTYPE <>", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeGreaterThan(String value) {
            addCriterion("THISDOCTYPE >", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeGreaterThanOrEqualTo(String value) {
            addCriterion("THISDOCTYPE >=", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeLessThan(String value) {
            addCriterion("THISDOCTYPE <", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeLessThanOrEqualTo(String value) {
            addCriterion("THISDOCTYPE <=", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeLike(String value) {
            addCriterion("THISDOCTYPE like", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeNotLike(String value) {
            addCriterion("THISDOCTYPE not like", value, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeIn(List<String> values) {
            addCriterion("THISDOCTYPE in", values, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeNotIn(List<String> values) {
            addCriterion("THISDOCTYPE not in", values, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeBetween(String value1, String value2) {
            addCriterion("THISDOCTYPE between", value1, value2, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andThisdoctypeNotBetween(String value1, String value2) {
            addCriterion("THISDOCTYPE not between", value1, value2, "thisdoctype");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsIsNull() {
            addCriterion("MEETINGNAME_JS is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsIsNotNull() {
            addCriterion("MEETINGNAME_JS is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsEqualTo(String value) {
            addCriterion("MEETINGNAME_JS =", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsNotEqualTo(String value) {
            addCriterion("MEETINGNAME_JS <>", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsGreaterThan(String value) {
            addCriterion("MEETINGNAME_JS >", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME_JS >=", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsLessThan(String value) {
            addCriterion("MEETINGNAME_JS <", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsLessThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME_JS <=", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsLike(String value) {
            addCriterion("MEETINGNAME_JS like", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsNotLike(String value) {
            addCriterion("MEETINGNAME_JS not like", value, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsIn(List<String> values) {
            addCriterion("MEETINGNAME_JS in", values, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsNotIn(List<String> values) {
            addCriterion("MEETINGNAME_JS not in", values, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsBetween(String value1, String value2) {
            addCriterion("MEETINGNAME_JS between", value1, value2, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameJsNotBetween(String value1, String value2) {
            addCriterion("MEETINGNAME_JS not between", value1, value2, "meetingnameJs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsIsNull() {
            addCriterion("MEETINGNAME_CS is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsIsNotNull() {
            addCriterion("MEETINGNAME_CS is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsEqualTo(String value) {
            addCriterion("MEETINGNAME_CS =", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsNotEqualTo(String value) {
            addCriterion("MEETINGNAME_CS <>", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsGreaterThan(String value) {
            addCriterion("MEETINGNAME_CS >", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME_CS >=", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsLessThan(String value) {
            addCriterion("MEETINGNAME_CS <", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsLessThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME_CS <=", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsLike(String value) {
            addCriterion("MEETINGNAME_CS like", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsNotLike(String value) {
            addCriterion("MEETINGNAME_CS not like", value, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsIn(List<String> values) {
            addCriterion("MEETINGNAME_CS in", values, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsNotIn(List<String> values) {
            addCriterion("MEETINGNAME_CS not in", values, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsBetween(String value1, String value2) {
            addCriterion("MEETINGNAME_CS between", value1, value2, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameCsNotBetween(String value1, String value2) {
            addCriterion("MEETINGNAME_CS not between", value1, value2, "meetingnameCs");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNull() {
            addCriterion("MEETINGNAME is null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIsNotNull() {
            addCriterion("MEETINGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingnameEqualTo(String value) {
            addCriterion("MEETINGNAME =", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotEqualTo(String value) {
            addCriterion("MEETINGNAME <>", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThan(String value) {
            addCriterion("MEETINGNAME >", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME >=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThan(String value) {
            addCriterion("MEETINGNAME <", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLessThanOrEqualTo(String value) {
            addCriterion("MEETINGNAME <=", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameLike(String value) {
            addCriterion("MEETINGNAME like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotLike(String value) {
            addCriterion("MEETINGNAME not like", value, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameIn(List<String> values) {
            addCriterion("MEETINGNAME in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotIn(List<String> values) {
            addCriterion("MEETINGNAME not in", values, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameBetween(String value1, String value2) {
            addCriterion("MEETINGNAME between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andMeetingnameNotBetween(String value1, String value2) {
            addCriterion("MEETINGNAME not between", value1, value2, "meetingname");
            return (Criteria) this;
        }

        public Criteria andRegidateIsNull() {
            addCriterion("REGIDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegidateIsNotNull() {
            addCriterion("REGIDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegidateEqualTo(String value) {
            addCriterion("REGIDATE =", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateNotEqualTo(String value) {
            addCriterion("REGIDATE <>", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateGreaterThan(String value) {
            addCriterion("REGIDATE >", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateGreaterThanOrEqualTo(String value) {
            addCriterion("REGIDATE >=", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateLessThan(String value) {
            addCriterion("REGIDATE <", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateLessThanOrEqualTo(String value) {
            addCriterion("REGIDATE <=", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateLike(String value) {
            addCriterion("REGIDATE like", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateNotLike(String value) {
            addCriterion("REGIDATE not like", value, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateIn(List<String> values) {
            addCriterion("REGIDATE in", values, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateNotIn(List<String> values) {
            addCriterion("REGIDATE not in", values, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateBetween(String value1, String value2) {
            addCriterion("REGIDATE between", value1, value2, "regidate");
            return (Criteria) this;
        }

        public Criteria andRegidateNotBetween(String value1, String value2) {
            addCriterion("REGIDATE not between", value1, value2, "regidate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateIsNull() {
            addCriterion("MEETINGSTATE is null");
            return (Criteria) this;
        }

        public Criteria andMeetingstateIsNotNull() {
            addCriterion("MEETINGSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingstateEqualTo(String value) {
            addCriterion("MEETINGSTATE =", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateNotEqualTo(String value) {
            addCriterion("MEETINGSTATE <>", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateGreaterThan(String value) {
            addCriterion("MEETINGSTATE >", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGSTATE >=", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateLessThan(String value) {
            addCriterion("MEETINGSTATE <", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateLessThanOrEqualTo(String value) {
            addCriterion("MEETINGSTATE <=", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateLike(String value) {
            addCriterion("MEETINGSTATE like", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateNotLike(String value) {
            addCriterion("MEETINGSTATE not like", value, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateIn(List<String> values) {
            addCriterion("MEETINGSTATE in", values, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateNotIn(List<String> values) {
            addCriterion("MEETINGSTATE not in", values, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateBetween(String value1, String value2) {
            addCriterion("MEETINGSTATE between", value1, value2, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andMeetingstateNotBetween(String value1, String value2) {
            addCriterion("MEETINGSTATE not between", value1, value2, "meetingstate");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNull() {
            addCriterion("CASETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("CASETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(String value) {
            addCriterion("CASETYPE =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(String value) {
            addCriterion("CASETYPE <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(String value) {
            addCriterion("CASETYPE >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASETYPE >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(String value) {
            addCriterion("CASETYPE <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(String value) {
            addCriterion("CASETYPE <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLike(String value) {
            addCriterion("CASETYPE like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotLike(String value) {
            addCriterion("CASETYPE not like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<String> values) {
            addCriterion("CASETYPE in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<String> values) {
            addCriterion("CASETYPE not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(String value1, String value2) {
            addCriterion("CASETYPE between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(String value1, String value2) {
            addCriterion("CASETYPE not between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andProposalclassIsNull() {
            addCriterion("PROPOSALCLASS is null");
            return (Criteria) this;
        }

        public Criteria andProposalclassIsNotNull() {
            addCriterion("PROPOSALCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andProposalclassEqualTo(String value) {
            addCriterion("PROPOSALCLASS =", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassNotEqualTo(String value) {
            addCriterion("PROPOSALCLASS <>", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassGreaterThan(String value) {
            addCriterion("PROPOSALCLASS >", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSALCLASS >=", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassLessThan(String value) {
            addCriterion("PROPOSALCLASS <", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassLessThanOrEqualTo(String value) {
            addCriterion("PROPOSALCLASS <=", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassLike(String value) {
            addCriterion("PROPOSALCLASS like", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassNotLike(String value) {
            addCriterion("PROPOSALCLASS not like", value, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassIn(List<String> values) {
            addCriterion("PROPOSALCLASS in", values, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassNotIn(List<String> values) {
            addCriterion("PROPOSALCLASS not in", values, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassBetween(String value1, String value2) {
            addCriterion("PROPOSALCLASS between", value1, value2, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andProposalclassNotBetween(String value1, String value2) {
            addCriterion("PROPOSALCLASS not between", value1, value2, "proposalclass");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNull() {
            addCriterion("CASENO is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("CASENO is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("CASENO =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("CASENO <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("CASENO >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("CASENO >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("CASENO <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("CASENO <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("CASENO like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("CASENO not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("CASENO in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("CASENO not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("CASENO between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("CASENO not between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("PROPERTYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("PROPERTYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("PROPERTYTYPE =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("PROPERTYTYPE <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("PROPERTYTYPE >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("PROPERTYTYPE <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("PROPERTYTYPE like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("PROPERTYTYPE not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("PROPERTYTYPE in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("PROPERTYTYPE not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE not between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("PROPERTY like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("PROPERTY not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieIsNull() {
            addCriterion("DELEGATIONJIEBIE is null");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieIsNotNull() {
            addCriterion("DELEGATIONJIEBIE is not null");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieEqualTo(String value) {
            addCriterion("DELEGATIONJIEBIE =", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieNotEqualTo(String value) {
            addCriterion("DELEGATIONJIEBIE <>", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieGreaterThan(String value) {
            addCriterion("DELEGATIONJIEBIE >", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieGreaterThanOrEqualTo(String value) {
            addCriterion("DELEGATIONJIEBIE >=", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieLessThan(String value) {
            addCriterion("DELEGATIONJIEBIE <", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieLessThanOrEqualTo(String value) {
            addCriterion("DELEGATIONJIEBIE <=", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieLike(String value) {
            addCriterion("DELEGATIONJIEBIE like", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieNotLike(String value) {
            addCriterion("DELEGATIONJIEBIE not like", value, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieIn(List<String> values) {
            addCriterion("DELEGATIONJIEBIE in", values, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieNotIn(List<String> values) {
            addCriterion("DELEGATIONJIEBIE not in", values, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieBetween(String value1, String value2) {
            addCriterion("DELEGATIONJIEBIE between", value1, value2, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andDelegationjiebieNotBetween(String value1, String value2) {
            addCriterion("DELEGATIONJIEBIE not between", value1, value2, "delegationjiebie");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleIsNull() {
            addCriterion("HEADPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleIsNotNull() {
            addCriterion("HEADPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleEqualTo(String value) {
            addCriterion("HEADPEOPLE =", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleNotEqualTo(String value) {
            addCriterion("HEADPEOPLE <>", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleGreaterThan(String value) {
            addCriterion("HEADPEOPLE >", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("HEADPEOPLE >=", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleLessThan(String value) {
            addCriterion("HEADPEOPLE <", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleLessThanOrEqualTo(String value) {
            addCriterion("HEADPEOPLE <=", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleLike(String value) {
            addCriterion("HEADPEOPLE like", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleNotLike(String value) {
            addCriterion("HEADPEOPLE not like", value, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleIn(List<String> values) {
            addCriterion("HEADPEOPLE in", values, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleNotIn(List<String> values) {
            addCriterion("HEADPEOPLE not in", values, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleBetween(String value1, String value2) {
            addCriterion("HEADPEOPLE between", value1, value2, "headpeople");
            return (Criteria) this;
        }

        public Criteria andHeadpeopleNotBetween(String value1, String value2) {
            addCriterion("HEADPEOPLE not between", value1, value2, "headpeople");
            return (Criteria) this;
        }

        public Criteria andFuyirenIsNull() {
            addCriterion("FUYIREN is null");
            return (Criteria) this;
        }

        public Criteria andFuyirenIsNotNull() {
            addCriterion("FUYIREN is not null");
            return (Criteria) this;
        }

        public Criteria andFuyirenEqualTo(String value) {
            addCriterion("FUYIREN =", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenNotEqualTo(String value) {
            addCriterion("FUYIREN <>", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenGreaterThan(String value) {
            addCriterion("FUYIREN >", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenGreaterThanOrEqualTo(String value) {
            addCriterion("FUYIREN >=", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenLessThan(String value) {
            addCriterion("FUYIREN <", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenLessThanOrEqualTo(String value) {
            addCriterion("FUYIREN <=", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenLike(String value) {
            addCriterion("FUYIREN like", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenNotLike(String value) {
            addCriterion("FUYIREN not like", value, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenIn(List<String> values) {
            addCriterion("FUYIREN in", values, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenNotIn(List<String> values) {
            addCriterion("FUYIREN not in", values, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenBetween(String value1, String value2) {
            addCriterion("FUYIREN between", value1, value2, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenNotBetween(String value1, String value2) {
            addCriterion("FUYIREN not between", value1, value2, "fuyiren");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuIsNull() {
            addCriterion("FUYIRENSHU is null");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuIsNotNull() {
            addCriterion("FUYIRENSHU is not null");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuEqualTo(String value) {
            addCriterion("FUYIRENSHU =", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuNotEqualTo(String value) {
            addCriterion("FUYIRENSHU <>", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuGreaterThan(String value) {
            addCriterion("FUYIRENSHU >", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuGreaterThanOrEqualTo(String value) {
            addCriterion("FUYIRENSHU >=", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuLessThan(String value) {
            addCriterion("FUYIRENSHU <", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuLessThanOrEqualTo(String value) {
            addCriterion("FUYIRENSHU <=", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuLike(String value) {
            addCriterion("FUYIRENSHU like", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuNotLike(String value) {
            addCriterion("FUYIRENSHU not like", value, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuIn(List<String> values) {
            addCriterion("FUYIRENSHU in", values, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuNotIn(List<String> values) {
            addCriterion("FUYIRENSHU not in", values, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuBetween(String value1, String value2) {
            addCriterion("FUYIRENSHU between", value1, value2, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andFuyirenshuNotBetween(String value1, String value2) {
            addCriterion("FUYIRENSHU not between", value1, value2, "fuyirenshu");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIsNull() {
            addCriterion("UPLOADFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIsNotNull() {
            addCriterion("UPLOADFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameEqualTo(String value) {
            addCriterion("UPLOADFILENAME =", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotEqualTo(String value) {
            addCriterion("UPLOADFILENAME <>", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameGreaterThan(String value) {
            addCriterion("UPLOADFILENAME >", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOADFILENAME >=", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLessThan(String value) {
            addCriterion("UPLOADFILENAME <", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLessThanOrEqualTo(String value) {
            addCriterion("UPLOADFILENAME <=", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLike(String value) {
            addCriterion("UPLOADFILENAME like", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotLike(String value) {
            addCriterion("UPLOADFILENAME not like", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIn(List<String> values) {
            addCriterion("UPLOADFILENAME in", values, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotIn(List<String> values) {
            addCriterion("UPLOADFILENAME not in", values, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameBetween(String value1, String value2) {
            addCriterion("UPLOADFILENAME between", value1, value2, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotBetween(String value1, String value2) {
            addCriterion("UPLOADFILENAME not between", value1, value2, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitIsNull() {
            addCriterion("ISMAINTRANSACTUNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitIsNotNull() {
            addCriterion("ISMAINTRANSACTUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitEqualTo(String value) {
            addCriterion("ISMAINTRANSACTUNIT =", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitNotEqualTo(String value) {
            addCriterion("ISMAINTRANSACTUNIT <>", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitGreaterThan(String value) {
            addCriterion("ISMAINTRANSACTUNIT >", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitGreaterThanOrEqualTo(String value) {
            addCriterion("ISMAINTRANSACTUNIT >=", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitLessThan(String value) {
            addCriterion("ISMAINTRANSACTUNIT <", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitLessThanOrEqualTo(String value) {
            addCriterion("ISMAINTRANSACTUNIT <=", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitLike(String value) {
            addCriterion("ISMAINTRANSACTUNIT like", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitNotLike(String value) {
            addCriterion("ISMAINTRANSACTUNIT not like", value, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitIn(List<String> values) {
            addCriterion("ISMAINTRANSACTUNIT in", values, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitNotIn(List<String> values) {
            addCriterion("ISMAINTRANSACTUNIT not in", values, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitBetween(String value1, String value2) {
            addCriterion("ISMAINTRANSACTUNIT between", value1, value2, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andIsmaintransactunitNotBetween(String value1, String value2) {
            addCriterion("ISMAINTRANSACTUNIT not between", value1, value2, "ismaintransactunit");
            return (Criteria) this;
        }

        public Criteria andMainunitIsNull() {
            addCriterion("MAINUNIT is null");
            return (Criteria) this;
        }

        public Criteria andMainunitIsNotNull() {
            addCriterion("MAINUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMainunitEqualTo(String value) {
            addCriterion("MAINUNIT =", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitNotEqualTo(String value) {
            addCriterion("MAINUNIT <>", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitGreaterThan(String value) {
            addCriterion("MAINUNIT >", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitGreaterThanOrEqualTo(String value) {
            addCriterion("MAINUNIT >=", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitLessThan(String value) {
            addCriterion("MAINUNIT <", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitLessThanOrEqualTo(String value) {
            addCriterion("MAINUNIT <=", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitLike(String value) {
            addCriterion("MAINUNIT like", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitNotLike(String value) {
            addCriterion("MAINUNIT not like", value, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitIn(List<String> values) {
            addCriterion("MAINUNIT in", values, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitNotIn(List<String> values) {
            addCriterion("MAINUNIT not in", values, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitBetween(String value1, String value2) {
            addCriterion("MAINUNIT between", value1, value2, "mainunit");
            return (Criteria) this;
        }

        public Criteria andMainunitNotBetween(String value1, String value2) {
            addCriterion("MAINUNIT not between", value1, value2, "mainunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitIsNull() {
            addCriterion("ASSISTTRANSACTUNIT is null");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitIsNotNull() {
            addCriterion("ASSISTTRANSACTUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitEqualTo(String value) {
            addCriterion("ASSISTTRANSACTUNIT =", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitNotEqualTo(String value) {
            addCriterion("ASSISTTRANSACTUNIT <>", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitGreaterThan(String value) {
            addCriterion("ASSISTTRANSACTUNIT >", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitGreaterThanOrEqualTo(String value) {
            addCriterion("ASSISTTRANSACTUNIT >=", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitLessThan(String value) {
            addCriterion("ASSISTTRANSACTUNIT <", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitLessThanOrEqualTo(String value) {
            addCriterion("ASSISTTRANSACTUNIT <=", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitLike(String value) {
            addCriterion("ASSISTTRANSACTUNIT like", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitNotLike(String value) {
            addCriterion("ASSISTTRANSACTUNIT not like", value, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitIn(List<String> values) {
            addCriterion("ASSISTTRANSACTUNIT in", values, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitNotIn(List<String> values) {
            addCriterion("ASSISTTRANSACTUNIT not in", values, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitBetween(String value1, String value2) {
            addCriterion("ASSISTTRANSACTUNIT between", value1, value2, "assisttransactunit");
            return (Criteria) this;
        }

        public Criteria andAssisttransactunitNotBetween(String value1, String value2) {
            addCriterion("ASSISTTRANSACTUNIT not between", value1, value2, "assisttransactunit");
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