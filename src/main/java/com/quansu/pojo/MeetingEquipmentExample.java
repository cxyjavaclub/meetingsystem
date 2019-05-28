package com.quansu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingEquipmentExample() {
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Long value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Long value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Long value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Long value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Long> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Long> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Long value1, Long value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidIsNull() {
            addCriterion("equipment_uuid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidIsNotNull() {
            addCriterion("equipment_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidEqualTo(String value) {
            addCriterion("equipment_uuid =", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidNotEqualTo(String value) {
            addCriterion("equipment_uuid <>", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidGreaterThan(String value) {
            addCriterion("equipment_uuid >", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_uuid >=", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidLessThan(String value) {
            addCriterion("equipment_uuid <", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidLessThanOrEqualTo(String value) {
            addCriterion("equipment_uuid <=", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidLike(String value) {
            addCriterion("equipment_uuid like", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidNotLike(String value) {
            addCriterion("equipment_uuid not like", value, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidIn(List<String> values) {
            addCriterion("equipment_uuid in", values, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidNotIn(List<String> values) {
            addCriterion("equipment_uuid not in", values, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidBetween(String value1, String value2) {
            addCriterion("equipment_uuid between", value1, value2, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentUuidNotBetween(String value1, String value2) {
            addCriterion("equipment_uuid not between", value1, value2, "equipmentUuid");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIsNull() {
            addCriterion("equipment_site is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIsNotNull() {
            addCriterion("equipment_site is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteEqualTo(String value) {
            addCriterion("equipment_site =", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotEqualTo(String value) {
            addCriterion("equipment_site <>", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteGreaterThan(String value) {
            addCriterion("equipment_site >", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_site >=", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLessThan(String value) {
            addCriterion("equipment_site <", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLessThanOrEqualTo(String value) {
            addCriterion("equipment_site <=", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteLike(String value) {
            addCriterion("equipment_site like", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotLike(String value) {
            addCriterion("equipment_site not like", value, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteIn(List<String> values) {
            addCriterion("equipment_site in", values, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotIn(List<String> values) {
            addCriterion("equipment_site not in", values, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteBetween(String value1, String value2) {
            addCriterion("equipment_site between", value1, value2, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentSiteNotBetween(String value1, String value2) {
            addCriterion("equipment_site not between", value1, value2, "equipmentSite");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(Byte value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(Byte value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(Byte value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(Byte value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<Byte> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<Byte> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(Byte value1, Byte value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateIsNull() {
            addCriterion("equipment_state is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateIsNotNull() {
            addCriterion("equipment_state is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateEqualTo(Byte value) {
            addCriterion("equipment_state =", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateNotEqualTo(Byte value) {
            addCriterion("equipment_state <>", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateGreaterThan(Byte value) {
            addCriterion("equipment_state >", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("equipment_state >=", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateLessThan(Byte value) {
            addCriterion("equipment_state <", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateLessThanOrEqualTo(Byte value) {
            addCriterion("equipment_state <=", value, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateIn(List<Byte> values) {
            addCriterion("equipment_state in", values, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateNotIn(List<Byte> values) {
            addCriterion("equipment_state not in", values, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateBetween(Byte value1, Byte value2) {
            addCriterion("equipment_state between", value1, value2, "equipmentState");
            return (Criteria) this;
        }

        public Criteria andEquipmentStateNotBetween(Byte value1, Byte value2) {
            addCriterion("equipment_state not between", value1, value2, "equipmentState");
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