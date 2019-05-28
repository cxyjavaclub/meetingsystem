package com.quansu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingInformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingInformExample() {
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

        public Criteria andInformIdIsNull() {
            addCriterion("inform_id is null");
            return (Criteria) this;
        }

        public Criteria andInformIdIsNotNull() {
            addCriterion("inform_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformIdEqualTo(Long value) {
            addCriterion("inform_id =", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotEqualTo(Long value) {
            addCriterion("inform_id <>", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThan(Long value) {
            addCriterion("inform_id >", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inform_id >=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThan(Long value) {
            addCriterion("inform_id <", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdLessThanOrEqualTo(Long value) {
            addCriterion("inform_id <=", value, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdIn(List<Long> values) {
            addCriterion("inform_id in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotIn(List<Long> values) {
            addCriterion("inform_id not in", values, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdBetween(Long value1, Long value2) {
            addCriterion("inform_id between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andInformIdNotBetween(Long value1, Long value2) {
            addCriterion("inform_id not between", value1, value2, "informId");
            return (Criteria) this;
        }

        public Criteria andInformMessageIsNull() {
            addCriterion("inform_message is null");
            return (Criteria) this;
        }

        public Criteria andInformMessageIsNotNull() {
            addCriterion("inform_message is not null");
            return (Criteria) this;
        }

        public Criteria andInformMessageEqualTo(String value) {
            addCriterion("inform_message =", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageNotEqualTo(String value) {
            addCriterion("inform_message <>", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageGreaterThan(String value) {
            addCriterion("inform_message >", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageGreaterThanOrEqualTo(String value) {
            addCriterion("inform_message >=", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageLessThan(String value) {
            addCriterion("inform_message <", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageLessThanOrEqualTo(String value) {
            addCriterion("inform_message <=", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageLike(String value) {
            addCriterion("inform_message like", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageNotLike(String value) {
            addCriterion("inform_message not like", value, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageIn(List<String> values) {
            addCriterion("inform_message in", values, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageNotIn(List<String> values) {
            addCriterion("inform_message not in", values, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageBetween(String value1, String value2) {
            addCriterion("inform_message between", value1, value2, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformMessageNotBetween(String value1, String value2) {
            addCriterion("inform_message not between", value1, value2, "informMessage");
            return (Criteria) this;
        }

        public Criteria andInformUserNameIsNull() {
            addCriterion("inform_user_name is null");
            return (Criteria) this;
        }

        public Criteria andInformUserNameIsNotNull() {
            addCriterion("inform_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andInformUserNameEqualTo(String value) {
            addCriterion("inform_user_name =", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameNotEqualTo(String value) {
            addCriterion("inform_user_name <>", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameGreaterThan(String value) {
            addCriterion("inform_user_name >", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("inform_user_name >=", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameLessThan(String value) {
            addCriterion("inform_user_name <", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameLessThanOrEqualTo(String value) {
            addCriterion("inform_user_name <=", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameLike(String value) {
            addCriterion("inform_user_name like", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameNotLike(String value) {
            addCriterion("inform_user_name not like", value, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameIn(List<String> values) {
            addCriterion("inform_user_name in", values, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameNotIn(List<String> values) {
            addCriterion("inform_user_name not in", values, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameBetween(String value1, String value2) {
            addCriterion("inform_user_name between", value1, value2, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformUserNameNotBetween(String value1, String value2) {
            addCriterion("inform_user_name not between", value1, value2, "informUserName");
            return (Criteria) this;
        }

        public Criteria andInformStateIsNull() {
            addCriterion("inform_state is null");
            return (Criteria) this;
        }

        public Criteria andInformStateIsNotNull() {
            addCriterion("inform_state is not null");
            return (Criteria) this;
        }

        public Criteria andInformStateEqualTo(Byte value) {
            addCriterion("inform_state =", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateNotEqualTo(Byte value) {
            addCriterion("inform_state <>", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateGreaterThan(Byte value) {
            addCriterion("inform_state >", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("inform_state >=", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateLessThan(Byte value) {
            addCriterion("inform_state <", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateLessThanOrEqualTo(Byte value) {
            addCriterion("inform_state <=", value, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateIn(List<Byte> values) {
            addCriterion("inform_state in", values, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateNotIn(List<Byte> values) {
            addCriterion("inform_state not in", values, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateBetween(Byte value1, Byte value2) {
            addCriterion("inform_state between", value1, value2, "informState");
            return (Criteria) this;
        }

        public Criteria andInformStateNotBetween(Byte value1, Byte value2) {
            addCriterion("inform_state not between", value1, value2, "informState");
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