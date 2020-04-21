package com.mudule.mumzonemarketcal.component.po.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberLevelExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeIsNull() {
            addCriterion("upgrade_type is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeIsNotNull() {
            addCriterion("upgrade_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeEqualTo(Byte value) {
            addCriterion("upgrade_type =", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotEqualTo(Byte value) {
            addCriterion("upgrade_type <>", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeGreaterThan(Byte value) {
            addCriterion("upgrade_type >", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("upgrade_type >=", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeLessThan(Byte value) {
            addCriterion("upgrade_type <", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("upgrade_type <=", value, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeIn(List<Byte> values) {
            addCriterion("upgrade_type in", values, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotIn(List<Byte> values) {
            addCriterion("upgrade_type not in", values, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeBetween(Byte value1, Byte value2) {
            addCriterion("upgrade_type between", value1, value2, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("upgrade_type not between", value1, value2, "upgradeType");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
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

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discount_type is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(Byte value) {
            addCriterion("discount_type =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(Byte value) {
            addCriterion("discount_type <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(Byte value) {
            addCriterion("discount_type >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("discount_type >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(Byte value) {
            addCriterion("discount_type <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("discount_type <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<Byte> values) {
            addCriterion("discount_type in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<Byte> values) {
            addCriterion("discount_type not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(Byte value1, Byte value2) {
            addCriterion("discount_type between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("discount_type not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNull() {
            addCriterion("member_discount is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNotNull() {
            addCriterion("member_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountEqualTo(String value) {
            addCriterion("member_discount =", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotEqualTo(String value) {
            addCriterion("member_discount <>", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThan(String value) {
            addCriterion("member_discount >", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("member_discount >=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThan(String value) {
            addCriterion("member_discount <", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThanOrEqualTo(String value) {
            addCriterion("member_discount <=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLike(String value) {
            addCriterion("member_discount like", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotLike(String value) {
            addCriterion("member_discount not like", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIn(List<String> values) {
            addCriterion("member_discount in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotIn(List<String> values) {
            addCriterion("member_discount not in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountBetween(String value1, String value2) {
            addCriterion("member_discount between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotBetween(String value1, String value2) {
            addCriterion("member_discount not between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdIsNull() {
            addCriterion("member_price_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdIsNotNull() {
            addCriterion("member_price_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdEqualTo(String value) {
            addCriterion("member_price_level_id =", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdNotEqualTo(String value) {
            addCriterion("member_price_level_id <>", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdGreaterThan(String value) {
            addCriterion("member_price_level_id >", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_price_level_id >=", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdLessThan(String value) {
            addCriterion("member_price_level_id <", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdLessThanOrEqualTo(String value) {
            addCriterion("member_price_level_id <=", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdLike(String value) {
            addCriterion("member_price_level_id like", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdNotLike(String value) {
            addCriterion("member_price_level_id not like", value, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdIn(List<String> values) {
            addCriterion("member_price_level_id in", values, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdNotIn(List<String> values) {
            addCriterion("member_price_level_id not in", values, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdBetween(String value1, String value2) {
            addCriterion("member_price_level_id between", value1, value2, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLevelIdNotBetween(String value1, String value2) {
            addCriterion("member_price_level_id not between", value1, value2, "memberPriceLevelId");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeIsNull() {
            addCriterion("level_describe is null");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeIsNotNull() {
            addCriterion("level_describe is not null");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeEqualTo(String value) {
            addCriterion("level_describe =", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeNotEqualTo(String value) {
            addCriterion("level_describe <>", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeGreaterThan(String value) {
            addCriterion("level_describe >", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("level_describe >=", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeLessThan(String value) {
            addCriterion("level_describe <", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeLessThanOrEqualTo(String value) {
            addCriterion("level_describe <=", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeLike(String value) {
            addCriterion("level_describe like", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeNotLike(String value) {
            addCriterion("level_describe not like", value, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeIn(List<String> values) {
            addCriterion("level_describe in", values, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeNotIn(List<String> values) {
            addCriterion("level_describe not in", values, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeBetween(String value1, String value2) {
            addCriterion("level_describe between", value1, value2, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andLevelDescribeNotBetween(String value1, String value2) {
            addCriterion("level_describe not between", value1, value2, "levelDescribe");
            return (Criteria) this;
        }

        public Criteria andValidTypeIsNull() {
            addCriterion("valid_type is null");
            return (Criteria) this;
        }

        public Criteria andValidTypeIsNotNull() {
            addCriterion("valid_type is not null");
            return (Criteria) this;
        }

        public Criteria andValidTypeEqualTo(Byte value) {
            addCriterion("valid_type =", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeNotEqualTo(Byte value) {
            addCriterion("valid_type <>", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeGreaterThan(Byte value) {
            addCriterion("valid_type >", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid_type >=", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeLessThan(Byte value) {
            addCriterion("valid_type <", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeLessThanOrEqualTo(Byte value) {
            addCriterion("valid_type <=", value, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeIn(List<Byte> values) {
            addCriterion("valid_type in", values, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeNotIn(List<Byte> values) {
            addCriterion("valid_type not in", values, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeBetween(Byte value1, Byte value2) {
            addCriterion("valid_type between", value1, value2, "validType");
            return (Criteria) this;
        }

        public Criteria andValidTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("valid_type not between", value1, value2, "validType");
            return (Criteria) this;
        }

        public Criteria andRetainTimeIsNull() {
            addCriterion("retain_time is null");
            return (Criteria) this;
        }

        public Criteria andRetainTimeIsNotNull() {
            addCriterion("retain_time is not null");
            return (Criteria) this;
        }

        public Criteria andRetainTimeEqualTo(Integer value) {
            addCriterion("retain_time =", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeNotEqualTo(Integer value) {
            addCriterion("retain_time <>", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeGreaterThan(Integer value) {
            addCriterion("retain_time >", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("retain_time >=", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeLessThan(Integer value) {
            addCriterion("retain_time <", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeLessThanOrEqualTo(Integer value) {
            addCriterion("retain_time <=", value, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeIn(List<Integer> values) {
            addCriterion("retain_time in", values, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeNotIn(List<Integer> values) {
            addCriterion("retain_time not in", values, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeBetween(Integer value1, Integer value2) {
            addCriterion("retain_time between", value1, value2, "retainTime");
            return (Criteria) this;
        }

        public Criteria andRetainTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("retain_time not between", value1, value2, "retainTime");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Integer value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Integer value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Integer value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Integer value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Integer> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Integer> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralIsNull() {
            addCriterion("reward_integral is null");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralIsNotNull() {
            addCriterion("reward_integral is not null");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralEqualTo(Integer value) {
            addCriterion("reward_integral =", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralNotEqualTo(Integer value) {
            addCriterion("reward_integral <>", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralGreaterThan(Integer value) {
            addCriterion("reward_integral >", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_integral >=", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralLessThan(Integer value) {
            addCriterion("reward_integral <", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("reward_integral <=", value, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralIn(List<Integer> values) {
            addCriterion("reward_integral in", values, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralNotIn(List<Integer> values) {
            addCriterion("reward_integral not in", values, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralBetween(Integer value1, Integer value2) {
            addCriterion("reward_integral between", value1, value2, "rewardIntegral");
            return (Criteria) this;
        }

        public Criteria andRewardIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_integral not between", value1, value2, "rewardIntegral");
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