package com.mudule.mumzonemarketcal.component.po.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberMarketCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberMarketCardExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdIsNull() {
            addCriterion("third_identity_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdIsNotNull() {
            addCriterion("third_identity_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdEqualTo(String value) {
            addCriterion("third_identity_id =", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdNotEqualTo(String value) {
            addCriterion("third_identity_id <>", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdGreaterThan(String value) {
            addCriterion("third_identity_id >", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_identity_id >=", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdLessThan(String value) {
            addCriterion("third_identity_id <", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdLessThanOrEqualTo(String value) {
            addCriterion("third_identity_id <=", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdLike(String value) {
            addCriterion("third_identity_id like", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdNotLike(String value) {
            addCriterion("third_identity_id not like", value, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdIn(List<String> values) {
            addCriterion("third_identity_id in", values, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdNotIn(List<String> values) {
            addCriterion("third_identity_id not in", values, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdBetween(String value1, String value2) {
            addCriterion("third_identity_id between", value1, value2, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andThirdIdentityIdNotBetween(String value1, String value2) {
            addCriterion("third_identity_id not between", value1, value2, "thirdIdentityId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdIsNull() {
            addCriterion("card_template_id is null");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdIsNotNull() {
            addCriterion("card_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdEqualTo(String value) {
            addCriterion("card_template_id =", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdNotEqualTo(String value) {
            addCriterion("card_template_id <>", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdGreaterThan(String value) {
            addCriterion("card_template_id >", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_template_id >=", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdLessThan(String value) {
            addCriterion("card_template_id <", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("card_template_id <=", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdLike(String value) {
            addCriterion("card_template_id like", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdNotLike(String value) {
            addCriterion("card_template_id not like", value, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdIn(List<String> values) {
            addCriterion("card_template_id in", values, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdNotIn(List<String> values) {
            addCriterion("card_template_id not in", values, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdBetween(String value1, String value2) {
            addCriterion("card_template_id between", value1, value2, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andCardTemplateIdNotBetween(String value1, String value2) {
            addCriterion("card_template_id not between", value1, value2, "cardTemplateId");
            return (Criteria) this;
        }

        public Criteria andBizCardNoIsNull() {
            addCriterion("biz_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBizCardNoIsNotNull() {
            addCriterion("biz_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizCardNoEqualTo(String value) {
            addCriterion("biz_card_no =", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoNotEqualTo(String value) {
            addCriterion("biz_card_no <>", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoGreaterThan(String value) {
            addCriterion("biz_card_no >", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_card_no >=", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoLessThan(String value) {
            addCriterion("biz_card_no <", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoLessThanOrEqualTo(String value) {
            addCriterion("biz_card_no <=", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoLike(String value) {
            addCriterion("biz_card_no like", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoNotLike(String value) {
            addCriterion("biz_card_no not like", value, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoIn(List<String> values) {
            addCriterion("biz_card_no in", values, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoNotIn(List<String> values) {
            addCriterion("biz_card_no not in", values, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoBetween(String value1, String value2) {
            addCriterion("biz_card_no between", value1, value2, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andBizCardNoNotBetween(String value1, String value2) {
            addCriterion("biz_card_no not between", value1, value2, "bizCardNo");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
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