package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketActivityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Byte value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Byte value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Byte value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Byte value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Byte> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Byte> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Byte value1, Byte value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNull() {
            addCriterion("activity_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNotNull() {
            addCriterion("activity_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeEqualTo(Date value) {
            addCriterion("activity_start_time =", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotEqualTo(Date value) {
            addCriterion("activity_start_time <>", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThan(Date value) {
            addCriterion("activity_start_time >", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_time >=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThan(Date value) {
            addCriterion("activity_start_time <", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_time <=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIn(List<Date> values) {
            addCriterion("activity_start_time in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotIn(List<Date> values) {
            addCriterion("activity_start_time not in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeBetween(Date value1, Date value2) {
            addCriterion("activity_start_time between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_time not between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNull() {
            addCriterion("activity_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNotNull() {
            addCriterion("activity_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeEqualTo(Date value) {
            addCriterion("activity_end_time =", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotEqualTo(Date value) {
            addCriterion("activity_end_time <>", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThan(Date value) {
            addCriterion("activity_end_time >", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end_time >=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThan(Date value) {
            addCriterion("activity_end_time <", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_end_time <=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIn(List<Date> values) {
            addCriterion("activity_end_time in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotIn(List<Date> values) {
            addCriterion("activity_end_time not in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeBetween(Date value1, Date value2) {
            addCriterion("activity_end_time between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_end_time not between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIsNull() {
            addCriterion("activity_creater is null");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIsNotNull() {
            addCriterion("activity_creater is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterEqualTo(String value) {
            addCriterion("activity_creater =", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotEqualTo(String value) {
            addCriterion("activity_creater <>", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterGreaterThan(String value) {
            addCriterion("activity_creater >", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("activity_creater >=", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLessThan(String value) {
            addCriterion("activity_creater <", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLessThanOrEqualTo(String value) {
            addCriterion("activity_creater <=", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterLike(String value) {
            addCriterion("activity_creater like", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotLike(String value) {
            addCriterion("activity_creater not like", value, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterIn(List<String> values) {
            addCriterion("activity_creater in", values, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotIn(List<String> values) {
            addCriterion("activity_creater not in", values, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterBetween(String value1, String value2) {
            addCriterion("activity_creater between", value1, value2, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityCreaterNotBetween(String value1, String value2) {
            addCriterion("activity_creater not between", value1, value2, "activityCreater");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateIsNull() {
            addCriterion("activity_audit_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateIsNotNull() {
            addCriterion("activity_audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateEqualTo(Byte value) {
            addCriterion("activity_audit_state =", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateNotEqualTo(Byte value) {
            addCriterion("activity_audit_state <>", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateGreaterThan(Byte value) {
            addCriterion("activity_audit_state >", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_audit_state >=", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateLessThan(Byte value) {
            addCriterion("activity_audit_state <", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateLessThanOrEqualTo(Byte value) {
            addCriterion("activity_audit_state <=", value, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateIn(List<Byte> values) {
            addCriterion("activity_audit_state in", values, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateNotIn(List<Byte> values) {
            addCriterion("activity_audit_state not in", values, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateBetween(Byte value1, Byte value2) {
            addCriterion("activity_audit_state between", value1, value2, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityAuditStateNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_audit_state not between", value1, value2, "activityAuditState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStateEqualTo(Byte value) {
            addCriterion("activity_state =", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotEqualTo(Byte value) {
            addCriterion("activity_state <>", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThan(Byte value) {
            addCriterion("activity_state >", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_state >=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThan(Byte value) {
            addCriterion("activity_state <", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThanOrEqualTo(Byte value) {
            addCriterion("activity_state <=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIn(List<Byte> values) {
            addCriterion("activity_state in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotIn(List<Byte> values) {
            addCriterion("activity_state not in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateBetween(Byte value1, Byte value2) {
            addCriterion("activity_state between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_state not between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdIsNull() {
            addCriterion("activity_crowd is null");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdIsNotNull() {
            addCriterion("activity_crowd is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdEqualTo(Byte value) {
            addCriterion("activity_crowd =", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdNotEqualTo(Byte value) {
            addCriterion("activity_crowd <>", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdGreaterThan(Byte value) {
            addCriterion("activity_crowd >", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_crowd >=", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdLessThan(Byte value) {
            addCriterion("activity_crowd <", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdLessThanOrEqualTo(Byte value) {
            addCriterion("activity_crowd <=", value, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdIn(List<Byte> values) {
            addCriterion("activity_crowd in", values, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdNotIn(List<Byte> values) {
            addCriterion("activity_crowd not in", values, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdBetween(Byte value1, Byte value2) {
            addCriterion("activity_crowd between", value1, value2, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andActivityCrowdNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_crowd not between", value1, value2, "activityCrowd");
            return (Criteria) this;
        }

        public Criteria andMaxTimesIsNull() {
            addCriterion("max_times is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimesIsNotNull() {
            addCriterion("max_times is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimesEqualTo(Integer value) {
            addCriterion("max_times =", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesNotEqualTo(Integer value) {
            addCriterion("max_times <>", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesGreaterThan(Integer value) {
            addCriterion("max_times >", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_times >=", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesLessThan(Integer value) {
            addCriterion("max_times <", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesLessThanOrEqualTo(Integer value) {
            addCriterion("max_times <=", value, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesIn(List<Integer> values) {
            addCriterion("max_times in", values, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesNotIn(List<Integer> values) {
            addCriterion("max_times not in", values, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesBetween(Integer value1, Integer value2) {
            addCriterion("max_times between", value1, value2, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andMaxTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("max_times not between", value1, value2, "maxTimes");
            return (Criteria) this;
        }

        public Criteria andPutChannelIsNull() {
            addCriterion("put_channel is null");
            return (Criteria) this;
        }

        public Criteria andPutChannelIsNotNull() {
            addCriterion("put_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPutChannelEqualTo(String value) {
            addCriterion("put_channel =", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotEqualTo(String value) {
            addCriterion("put_channel <>", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelGreaterThan(String value) {
            addCriterion("put_channel >", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelGreaterThanOrEqualTo(String value) {
            addCriterion("put_channel >=", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelLessThan(String value) {
            addCriterion("put_channel <", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelLessThanOrEqualTo(String value) {
            addCriterion("put_channel <=", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelLike(String value) {
            addCriterion("put_channel like", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotLike(String value) {
            addCriterion("put_channel not like", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelIn(List<String> values) {
            addCriterion("put_channel in", values, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotIn(List<String> values) {
            addCriterion("put_channel not in", values, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelBetween(String value1, String value2) {
            addCriterion("put_channel between", value1, value2, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotBetween(String value1, String value2) {
            addCriterion("put_channel not between", value1, value2, "putChannel");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionIsNull() {
            addCriterion("activity_trigger_condition is null");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionIsNotNull() {
            addCriterion("activity_trigger_condition is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionEqualTo(String value) {
            addCriterion("activity_trigger_condition =", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionNotEqualTo(String value) {
            addCriterion("activity_trigger_condition <>", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionGreaterThan(String value) {
            addCriterion("activity_trigger_condition >", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_trigger_condition >=", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionLessThan(String value) {
            addCriterion("activity_trigger_condition <", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionLessThanOrEqualTo(String value) {
            addCriterion("activity_trigger_condition <=", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionLike(String value) {
            addCriterion("activity_trigger_condition like", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionNotLike(String value) {
            addCriterion("activity_trigger_condition not like", value, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionIn(List<String> values) {
            addCriterion("activity_trigger_condition in", values, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionNotIn(List<String> values) {
            addCriterion("activity_trigger_condition not in", values, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionBetween(String value1, String value2) {
            addCriterion("activity_trigger_condition between", value1, value2, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andActivityTriggerConditionNotBetween(String value1, String value2) {
            addCriterion("activity_trigger_condition not between", value1, value2, "activityTriggerCondition");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNull() {
            addCriterion("receive_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIsNotNull() {
            addCriterion("receive_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeEqualTo(Byte value) {
            addCriterion("receive_type =", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotEqualTo(Byte value) {
            addCriterion("receive_type <>", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThan(Byte value) {
            addCriterion("receive_type >", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("receive_type >=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThan(Byte value) {
            addCriterion("receive_type <", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeLessThanOrEqualTo(Byte value) {
            addCriterion("receive_type <=", value, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeIn(List<Byte> values) {
            addCriterion("receive_type in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotIn(List<Byte> values) {
            addCriterion("receive_type not in", values, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeBetween(Byte value1, Byte value2) {
            addCriterion("receive_type between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andReceiveTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("receive_type not between", value1, value2, "receiveType");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdIsNull() {
            addCriterion("msg_template_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdIsNotNull() {
            addCriterion("msg_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdEqualTo(String value) {
            addCriterion("msg_template_id =", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdNotEqualTo(String value) {
            addCriterion("msg_template_id <>", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdGreaterThan(String value) {
            addCriterion("msg_template_id >", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("msg_template_id >=", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdLessThan(String value) {
            addCriterion("msg_template_id <", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("msg_template_id <=", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdLike(String value) {
            addCriterion("msg_template_id like", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdNotLike(String value) {
            addCriterion("msg_template_id not like", value, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdIn(List<String> values) {
            addCriterion("msg_template_id in", values, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdNotIn(List<String> values) {
            addCriterion("msg_template_id not in", values, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdBetween(String value1, String value2) {
            addCriterion("msg_template_id between", value1, value2, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgTemplateIdNotBetween(String value1, String value2) {
            addCriterion("msg_template_id not between", value1, value2, "msgTemplateId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Byte value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Byte value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Byte value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Byte value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Byte value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Byte value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Byte> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Byte> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Byte value1, Byte value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Byte value1, Byte value2) {
            addCriterion("dr not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNull() {
            addCriterion("url_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNotNull() {
            addCriterion("url_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlIdEqualTo(String value) {
            addCriterion("url_id =", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotEqualTo(String value) {
            addCriterion("url_id <>", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThan(String value) {
            addCriterion("url_id >", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanOrEqualTo(String value) {
            addCriterion("url_id >=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThan(String value) {
            addCriterion("url_id <", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanOrEqualTo(String value) {
            addCriterion("url_id <=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLike(String value) {
            addCriterion("url_id like", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotLike(String value) {
            addCriterion("url_id not like", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdIn(List<String> values) {
            addCriterion("url_id in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotIn(List<String> values) {
            addCriterion("url_id not in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdBetween(String value1, String value2) {
            addCriterion("url_id between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotBetween(String value1, String value2) {
            addCriterion("url_id not between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIsNull() {
            addCriterion("activity_code is null");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIsNotNull() {
            addCriterion("activity_code is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCodeEqualTo(String value) {
            addCriterion("activity_code =", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotEqualTo(String value) {
            addCriterion("activity_code <>", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeGreaterThan(String value) {
            addCriterion("activity_code >", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_code >=", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLessThan(String value) {
            addCriterion("activity_code <", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLessThanOrEqualTo(String value) {
            addCriterion("activity_code <=", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLike(String value) {
            addCriterion("activity_code like", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotLike(String value) {
            addCriterion("activity_code not like", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIn(List<String> values) {
            addCriterion("activity_code in", values, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotIn(List<String> values) {
            addCriterion("activity_code not in", values, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeBetween(String value1, String value2) {
            addCriterion("activity_code between", value1, value2, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotBetween(String value1, String value2) {
            addCriterion("activity_code not between", value1, value2, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivitySourceIsNull() {
            addCriterion("activity_source is null");
            return (Criteria) this;
        }

        public Criteria andActivitySourceIsNotNull() {
            addCriterion("activity_source is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySourceEqualTo(Byte value) {
            addCriterion("activity_source =", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceNotEqualTo(Byte value) {
            addCriterion("activity_source <>", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceGreaterThan(Byte value) {
            addCriterion("activity_source >", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_source >=", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceLessThan(Byte value) {
            addCriterion("activity_source <", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceLessThanOrEqualTo(Byte value) {
            addCriterion("activity_source <=", value, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceIn(List<Byte> values) {
            addCriterion("activity_source in", values, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceNotIn(List<Byte> values) {
            addCriterion("activity_source not in", values, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceBetween(Byte value1, Byte value2) {
            addCriterion("activity_source between", value1, value2, "activitySource");
            return (Criteria) this;
        }

        public Criteria andActivitySourceNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_source not between", value1, value2, "activitySource");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNull() {
            addCriterion("join_type is null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNotNull() {
            addCriterion("join_type is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeEqualTo(Byte value) {
            addCriterion("join_type =", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotEqualTo(Byte value) {
            addCriterion("join_type <>", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThan(Byte value) {
            addCriterion("join_type >", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("join_type >=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThan(Byte value) {
            addCriterion("join_type <", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThanOrEqualTo(Byte value) {
            addCriterion("join_type <=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIn(List<Byte> values) {
            addCriterion("join_type in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotIn(List<Byte> values) {
            addCriterion("join_type not in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeBetween(Byte value1, Byte value2) {
            addCriterion("join_type between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("join_type not between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
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