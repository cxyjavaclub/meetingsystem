package com.quansu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingRoomExample() {
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

        public Criteria andMeetingRoomIdIsNull() {
            addCriterion("meeting_room_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIsNotNull() {
            addCriterion("meeting_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdEqualTo(Long value) {
            addCriterion("meeting_room_id =", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotEqualTo(Long value) {
            addCriterion("meeting_room_id <>", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThan(Long value) {
            addCriterion("meeting_room_id >", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meeting_room_id >=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThan(Long value) {
            addCriterion("meeting_room_id <", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("meeting_room_id <=", value, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdIn(List<Long> values) {
            addCriterion("meeting_room_id in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotIn(List<Long> values) {
            addCriterion("meeting_room_id not in", values, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdBetween(Long value1, Long value2) {
            addCriterion("meeting_room_id between", value1, value2, "meetingRoomId");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIdNotBetween(Long value1, Long value2) {
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

        public Criteria andMeetingRoomImgIsNull() {
            addCriterion("meeting_room_img is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgIsNotNull() {
            addCriterion("meeting_room_img is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgEqualTo(String value) {
            addCriterion("meeting_room_img =", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgNotEqualTo(String value) {
            addCriterion("meeting_room_img <>", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgGreaterThan(String value) {
            addCriterion("meeting_room_img >", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_img >=", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgLessThan(String value) {
            addCriterion("meeting_room_img <", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_img <=", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgLike(String value) {
            addCriterion("meeting_room_img like", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgNotLike(String value) {
            addCriterion("meeting_room_img not like", value, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgIn(List<String> values) {
            addCriterion("meeting_room_img in", values, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgNotIn(List<String> values) {
            addCriterion("meeting_room_img not in", values, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgBetween(String value1, String value2) {
            addCriterion("meeting_room_img between", value1, value2, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomImgNotBetween(String value1, String value2) {
            addCriterion("meeting_room_img not between", value1, value2, "meetingRoomImg");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulIsNull() {
            addCriterion("meeting_room_galleryful is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulIsNotNull() {
            addCriterion("meeting_room_galleryful is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulEqualTo(Integer value) {
            addCriterion("meeting_room_galleryful =", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulNotEqualTo(Integer value) {
            addCriterion("meeting_room_galleryful <>", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulGreaterThan(Integer value) {
            addCriterion("meeting_room_galleryful >", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_galleryful >=", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulLessThan(Integer value) {
            addCriterion("meeting_room_galleryful <", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_room_galleryful <=", value, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulIn(List<Integer> values) {
            addCriterion("meeting_room_galleryful in", values, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulNotIn(List<Integer> values) {
            addCriterion("meeting_room_galleryful not in", values, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_galleryful between", value1, value2, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGalleryfulNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_room_galleryful not between", value1, value2, "meetingRoomGalleryful");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteIsNull() {
            addCriterion("meeting_room_site is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteIsNotNull() {
            addCriterion("meeting_room_site is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteEqualTo(String value) {
            addCriterion("meeting_room_site =", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteNotEqualTo(String value) {
            addCriterion("meeting_room_site <>", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteGreaterThan(String value) {
            addCriterion("meeting_room_site >", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_site >=", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteLessThan(String value) {
            addCriterion("meeting_room_site <", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_site <=", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteLike(String value) {
            addCriterion("meeting_room_site like", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteNotLike(String value) {
            addCriterion("meeting_room_site not like", value, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteIn(List<String> values) {
            addCriterion("meeting_room_site in", values, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteNotIn(List<String> values) {
            addCriterion("meeting_room_site not in", values, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteBetween(String value1, String value2) {
            addCriterion("meeting_room_site between", value1, value2, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomSiteNotBetween(String value1, String value2) {
            addCriterion("meeting_room_site not between", value1, value2, "meetingRoomSite");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesIsNull() {
            addCriterion("meeting_room_resources is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesIsNotNull() {
            addCriterion("meeting_room_resources is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesEqualTo(String value) {
            addCriterion("meeting_room_resources =", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesNotEqualTo(String value) {
            addCriterion("meeting_room_resources <>", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesGreaterThan(String value) {
            addCriterion("meeting_room_resources >", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room_resources >=", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesLessThan(String value) {
            addCriterion("meeting_room_resources <", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesLessThanOrEqualTo(String value) {
            addCriterion("meeting_room_resources <=", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesLike(String value) {
            addCriterion("meeting_room_resources like", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesNotLike(String value) {
            addCriterion("meeting_room_resources not like", value, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesIn(List<String> values) {
            addCriterion("meeting_room_resources in", values, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesNotIn(List<String> values) {
            addCriterion("meeting_room_resources not in", values, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesBetween(String value1, String value2) {
            addCriterion("meeting_room_resources between", value1, value2, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomResourcesNotBetween(String value1, String value2) {
            addCriterion("meeting_room_resources not between", value1, value2, "meetingRoomResources");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateIsNull() {
            addCriterion("meeting_room_state is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateIsNotNull() {
            addCriterion("meeting_room_state is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateEqualTo(Byte value) {
            addCriterion("meeting_room_state =", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateNotEqualTo(Byte value) {
            addCriterion("meeting_room_state <>", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateGreaterThan(Byte value) {
            addCriterion("meeting_room_state >", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("meeting_room_state >=", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateLessThan(Byte value) {
            addCriterion("meeting_room_state <", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateLessThanOrEqualTo(Byte value) {
            addCriterion("meeting_room_state <=", value, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateIn(List<Byte> values) {
            addCriterion("meeting_room_state in", values, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateNotIn(List<Byte> values) {
            addCriterion("meeting_room_state not in", values, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateBetween(Byte value1, Byte value2) {
            addCriterion("meeting_room_state between", value1, value2, "meetingRoomState");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomStateNotBetween(Byte value1, Byte value2) {
            addCriterion("meeting_room_state not between", value1, value2, "meetingRoomState");
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