package com.quansu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingMessgaeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingMessgaeExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Long value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Long value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Long value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Long value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Long value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Long> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Long> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Long value1, Long value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Long value1, Long value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameIsNull() {
            addCriterion("meeting_sponsor_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameIsNotNull() {
            addCriterion("meeting_sponsor_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameEqualTo(String value) {
            addCriterion("meeting_sponsor_name =", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameNotEqualTo(String value) {
            addCriterion("meeting_sponsor_name <>", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameGreaterThan(String value) {
            addCriterion("meeting_sponsor_name >", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_sponsor_name >=", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameLessThan(String value) {
            addCriterion("meeting_sponsor_name <", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_sponsor_name <=", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameLike(String value) {
            addCriterion("meeting_sponsor_name like", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameNotLike(String value) {
            addCriterion("meeting_sponsor_name not like", value, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameIn(List<String> values) {
            addCriterion("meeting_sponsor_name in", values, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameNotIn(List<String> values) {
            addCriterion("meeting_sponsor_name not in", values, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameBetween(String value1, String value2) {
            addCriterion("meeting_sponsor_name between", value1, value2, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andMeetingSponsorNameNotBetween(String value1, String value2) {
            addCriterion("meeting_sponsor_name not between", value1, value2, "meetingSponsorName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameIsNull() {
            addCriterion("sponsor_true_name is null");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameIsNotNull() {
            addCriterion("sponsor_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameEqualTo(String value) {
            addCriterion("sponsor_true_name =", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameNotEqualTo(String value) {
            addCriterion("sponsor_true_name <>", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameGreaterThan(String value) {
            addCriterion("sponsor_true_name >", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor_true_name >=", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameLessThan(String value) {
            addCriterion("sponsor_true_name <", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameLessThanOrEqualTo(String value) {
            addCriterion("sponsor_true_name <=", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameLike(String value) {
            addCriterion("sponsor_true_name like", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameNotLike(String value) {
            addCriterion("sponsor_true_name not like", value, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameIn(List<String> values) {
            addCriterion("sponsor_true_name in", values, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameNotIn(List<String> values) {
            addCriterion("sponsor_true_name not in", values, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameBetween(String value1, String value2) {
            addCriterion("sponsor_true_name between", value1, value2, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andSponsorTrueNameNotBetween(String value1, String value2) {
            addCriterion("sponsor_true_name not between", value1, value2, "sponsorTrueName");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIsNull() {
            addCriterion("meeting_theme is null");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIsNotNull() {
            addCriterion("meeting_theme is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeEqualTo(String value) {
            addCriterion("meeting_theme =", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotEqualTo(String value) {
            addCriterion("meeting_theme <>", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeGreaterThan(String value) {
            addCriterion("meeting_theme >", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_theme >=", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLessThan(String value) {
            addCriterion("meeting_theme <", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLessThanOrEqualTo(String value) {
            addCriterion("meeting_theme <=", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLike(String value) {
            addCriterion("meeting_theme like", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotLike(String value) {
            addCriterion("meeting_theme not like", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIn(List<String> values) {
            addCriterion("meeting_theme in", values, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotIn(List<String> values) {
            addCriterion("meeting_theme not in", values, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeBetween(String value1, String value2) {
            addCriterion("meeting_theme between", value1, value2, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotBetween(String value1, String value2) {
            addCriterion("meeting_theme not between", value1, value2, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIsNull() {
            addCriterion("meeting_room_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIsNotNull() {
            addCriterion("meeting_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdEqualTo(String value) {
            addCriterion("meeting_room_id =", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotEqualTo(String value) {
            addCriterion("meeting_room_id <>", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThan(String value) {
            addCriterion("meeting_room_id >", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_id >=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThan(String value) {
            addCriterion("meeting_room_id <", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_id <=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLike(String value) {
            addCriterion("meeting_room_id like", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotLike(String value) {
            addCriterion("meeting_room_id not like", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIn(List<String> values) {
            addCriterion("meeting_room_id in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotIn(List<String> values) {
            addCriterion("meeting_room_id not in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdBetween(String value1, String value2) {
            addCriterion("meeting_room_id between", value1, value2, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotBetween(String value1, String value2) {
            addCriterion("meeting_room_id not between", value1, value2, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIsNull() {
            addCriterion("meeting_room_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIsNotNull() {
            addCriterion("meeting_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameEqualTo(String value) {
            addCriterion("meeting_room_name =", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotEqualTo(String value) {
            addCriterion("meeting_room_name <>", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameGreaterThan(String value) {
            addCriterion("meeting_room_name >", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_name >=", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLessThan(String value) {
            addCriterion("meeting_room_name <", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_name <=", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameLike(String value) {
            addCriterion("meeting_room_name like", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotLike(String value) {
            addCriterion("meeting_room_name not like", value, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameIn(List<String> values) {
            addCriterion("meeting_room_name in", values, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotIn(List<String> values) {
            addCriterion("meeting_room_name not in", values, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameBetween(String value1, String value2) {
            addCriterion("meeting_room_name between", value1, value2, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNameNotBetween(String value1, String value2) {
            addCriterion("meeting_room_name not between", value1, value2, "meetingRoomName");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateIsNull() {
            addCriterion("meeting_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateIsNotNull() {
            addCriterion("meeting_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateEqualTo(Date value) {
            addCriterion("meeting_begin_date =", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateNotEqualTo(Date value) {
            addCriterion("meeting_begin_date <>", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateGreaterThan(Date value) {
            addCriterion("meeting_begin_date >", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_begin_date >=", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateLessThan(Date value) {
            addCriterion("meeting_begin_date <", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("meeting_begin_date <=", value, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateIn(List<Date> values) {
            addCriterion("meeting_begin_date in", values, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateNotIn(List<Date> values) {
            addCriterion("meeting_begin_date not in", values, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateBetween(Date value1, Date value2) {
            addCriterion("meeting_begin_date between", value1, value2, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("meeting_begin_date not between", value1, value2, "meetingBeginDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateIsNull() {
            addCriterion("meeting_end_date is null");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateIsNotNull() {
            addCriterion("meeting_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateEqualTo(Date value) {
            addCriterion("meeting_end_date =", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateNotEqualTo(Date value) {
            addCriterion("meeting_end_date <>", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateGreaterThan(Date value) {
            addCriterion("meeting_end_date >", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_end_date >=", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateLessThan(Date value) {
            addCriterion("meeting_end_date <", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateLessThanOrEqualTo(Date value) {
            addCriterion("meeting_end_date <=", value, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateIn(List<Date> values) {
            addCriterion("meeting_end_date in", values, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateNotIn(List<Date> values) {
            addCriterion("meeting_end_date not in", values, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateBetween(Date value1, Date value2) {
            addCriterion("meeting_end_date between", value1, value2, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingEndDateNotBetween(Date value1, Date value2) {
            addCriterion("meeting_end_date not between", value1, value2, "meetingEndDate");
            return (Criteria) this;
        }

        public Criteria andMeetingContentIsNull() {
            addCriterion("meeting_content is null");
            return (Criteria) this;
        }

        public Criteria andMeetingContentIsNotNull() {
            addCriterion("meeting_content is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingContentEqualTo(String value) {
            addCriterion("meeting_content =", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotEqualTo(String value) {
            addCriterion("meeting_content <>", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentGreaterThan(String value) {
            addCriterion("meeting_content >", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_content >=", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLessThan(String value) {
            addCriterion("meeting_content <", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLessThanOrEqualTo(String value) {
            addCriterion("meeting_content <=", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentLike(String value) {
            addCriterion("meeting_content like", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotLike(String value) {
            addCriterion("meeting_content not like", value, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentIn(List<String> values) {
            addCriterion("meeting_content in", values, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotIn(List<String> values) {
            addCriterion("meeting_content not in", values, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentBetween(String value1, String value2) {
            addCriterion("meeting_content between", value1, value2, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingContentNotBetween(String value1, String value2) {
            addCriterion("meeting_content not between", value1, value2, "meetingContent");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeIsNull() {
            addCriterion("meeting_add_time is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeIsNotNull() {
            addCriterion("meeting_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeEqualTo(Integer value) {
            addCriterion("meeting_add_time =", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeNotEqualTo(Integer value) {
            addCriterion("meeting_add_time <>", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeGreaterThan(Integer value) {
            addCriterion("meeting_add_time >", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_add_time >=", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeLessThan(Integer value) {
            addCriterion("meeting_add_time <", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_add_time <=", value, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeIn(List<Integer> values) {
            addCriterion("meeting_add_time in", values, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeNotIn(List<Integer> values) {
            addCriterion("meeting_add_time not in", values, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("meeting_add_time between", value1, value2, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_add_time not between", value1, value2, "meetingAddTime");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateIsNull() {
            addCriterion("meeting_audit_state is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateIsNotNull() {
            addCriterion("meeting_audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateEqualTo(Byte value) {
            addCriterion("meeting_audit_state =", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateNotEqualTo(Byte value) {
            addCriterion("meeting_audit_state <>", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateGreaterThan(Byte value) {
            addCriterion("meeting_audit_state >", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("meeting_audit_state >=", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateLessThan(Byte value) {
            addCriterion("meeting_audit_state <", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateLessThanOrEqualTo(Byte value) {
            addCriterion("meeting_audit_state <=", value, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateIn(List<Byte> values) {
            addCriterion("meeting_audit_state in", values, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateNotIn(List<Byte> values) {
            addCriterion("meeting_audit_state not in", values, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateBetween(Byte value1, Byte value2) {
            addCriterion("meeting_audit_state between", value1, value2, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingAuditStateNotBetween(Byte value1, Byte value2) {
            addCriterion("meeting_audit_state not between", value1, value2, "meetingAuditState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateIsNull() {
            addCriterion("meeting_sign_in_state is null");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateIsNotNull() {
            addCriterion("meeting_sign_in_state is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateEqualTo(Byte value) {
            addCriterion("meeting_sign_in_state =", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateNotEqualTo(Byte value) {
            addCriterion("meeting_sign_in_state <>", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateGreaterThan(Byte value) {
            addCriterion("meeting_sign_in_state >", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("meeting_sign_in_state >=", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateLessThan(Byte value) {
            addCriterion("meeting_sign_in_state <", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateLessThanOrEqualTo(Byte value) {
            addCriterion("meeting_sign_in_state <=", value, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateIn(List<Byte> values) {
            addCriterion("meeting_sign_in_state in", values, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateNotIn(List<Byte> values) {
            addCriterion("meeting_sign_in_state not in", values, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateBetween(Byte value1, Byte value2) {
            addCriterion("meeting_sign_in_state between", value1, value2, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andMeetingSignInStateNotBetween(Byte value1, Byte value2) {
            addCriterion("meeting_sign_in_state not between", value1, value2, "meetingSignInState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNull() {
            addCriterion("delete_state is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNotNull() {
            addCriterion("delete_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateEqualTo(Boolean value) {
            addCriterion("delete_state =", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotEqualTo(Boolean value) {
            addCriterion("delete_state <>", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThan(Boolean value) {
            addCriterion("delete_state >", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_state >=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThan(Boolean value) {
            addCriterion("delete_state <", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_state <=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIn(List<Boolean> values) {
            addCriterion("delete_state in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotIn(List<Boolean> values) {
            addCriterion("delete_state not in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_state between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_state not between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}