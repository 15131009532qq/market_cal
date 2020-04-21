package com.mudule.mumzonemarketcal.component.po.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberBabyInvitationRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBabyInvitationRelationExample() {
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

        public Criteria andInviterMemberCompanyIdIsNull() {
            addCriterion("inviter_member_company_id is null");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdIsNotNull() {
            addCriterion("inviter_member_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdEqualTo(String value) {
            addCriterion("inviter_member_company_id =", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdNotEqualTo(String value) {
            addCriterion("inviter_member_company_id <>", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdGreaterThan(String value) {
            addCriterion("inviter_member_company_id >", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("inviter_member_company_id >=", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdLessThan(String value) {
            addCriterion("inviter_member_company_id <", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("inviter_member_company_id <=", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdLike(String value) {
            addCriterion("inviter_member_company_id like", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdNotLike(String value) {
            addCriterion("inviter_member_company_id not like", value, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdIn(List<String> values) {
            addCriterion("inviter_member_company_id in", values, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdNotIn(List<String> values) {
            addCriterion("inviter_member_company_id not in", values, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdBetween(String value1, String value2) {
            addCriterion("inviter_member_company_id between", value1, value2, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andInviterMemberCompanyIdNotBetween(String value1, String value2) {
            addCriterion("inviter_member_company_id not between", value1, value2, "inviterMemberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdIsNull() {
            addCriterion("member_company_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdIsNotNull() {
            addCriterion("member_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdEqualTo(String value) {
            addCriterion("member_company_id =", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdNotEqualTo(String value) {
            addCriterion("member_company_id <>", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdGreaterThan(String value) {
            addCriterion("member_company_id >", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_company_id >=", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdLessThan(String value) {
            addCriterion("member_company_id <", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("member_company_id <=", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdLike(String value) {
            addCriterion("member_company_id like", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdNotLike(String value) {
            addCriterion("member_company_id not like", value, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdIn(List<String> values) {
            addCriterion("member_company_id in", values, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdNotIn(List<String> values) {
            addCriterion("member_company_id not in", values, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdBetween(String value1, String value2) {
            addCriterion("member_company_id between", value1, value2, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberCompanyIdNotBetween(String value1, String value2) {
            addCriterion("member_company_id not between", value1, value2, "memberCompanyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdIsNull() {
            addCriterion("baby_id is null");
            return (Criteria) this;
        }

        public Criteria andBabyIdIsNotNull() {
            addCriterion("baby_id is not null");
            return (Criteria) this;
        }

        public Criteria andBabyIdEqualTo(String value) {
            addCriterion("baby_id =", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotEqualTo(String value) {
            addCriterion("baby_id <>", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThan(String value) {
            addCriterion("baby_id >", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThanOrEqualTo(String value) {
            addCriterion("baby_id >=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThan(String value) {
            addCriterion("baby_id <", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThanOrEqualTo(String value) {
            addCriterion("baby_id <=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLike(String value) {
            addCriterion("baby_id like", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotLike(String value) {
            addCriterion("baby_id not like", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdIn(List<String> values) {
            addCriterion("baby_id in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotIn(List<String> values) {
            addCriterion("baby_id not in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdBetween(String value1, String value2) {
            addCriterion("baby_id between", value1, value2, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotBetween(String value1, String value2) {
            addCriterion("baby_id not between", value1, value2, "babyId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIsNull() {
            addCriterion("relationship_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIsNotNull() {
            addCriterion("relationship_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdEqualTo(String value) {
            addCriterion("relationship_id =", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotEqualTo(String value) {
            addCriterion("relationship_id <>", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThan(String value) {
            addCriterion("relationship_id >", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_id >=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThan(String value) {
            addCriterion("relationship_id <", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLessThanOrEqualTo(String value) {
            addCriterion("relationship_id <=", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdLike(String value) {
            addCriterion("relationship_id like", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotLike(String value) {
            addCriterion("relationship_id not like", value, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdIn(List<String> values) {
            addCriterion("relationship_id in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotIn(List<String> values) {
            addCriterion("relationship_id not in", values, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdBetween(String value1, String value2) {
            addCriterion("relationship_id between", value1, value2, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipIdNotBetween(String value1, String value2) {
            addCriterion("relationship_id not between", value1, value2, "relationshipId");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIsNull() {
            addCriterion("relationship_name is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIsNotNull() {
            addCriterion("relationship_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameEqualTo(String value) {
            addCriterion("relationship_name =", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotEqualTo(String value) {
            addCriterion("relationship_name <>", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameGreaterThan(String value) {
            addCriterion("relationship_name >", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_name >=", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLessThan(String value) {
            addCriterion("relationship_name <", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLessThanOrEqualTo(String value) {
            addCriterion("relationship_name <=", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameLike(String value) {
            addCriterion("relationship_name like", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotLike(String value) {
            addCriterion("relationship_name not like", value, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameIn(List<String> values) {
            addCriterion("relationship_name in", values, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotIn(List<String> values) {
            addCriterion("relationship_name not in", values, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameBetween(String value1, String value2) {
            addCriterion("relationship_name between", value1, value2, "relationshipName");
            return (Criteria) this;
        }

        public Criteria andRelationshipNameNotBetween(String value1, String value2) {
            addCriterion("relationship_name not between", value1, value2, "relationshipName");
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