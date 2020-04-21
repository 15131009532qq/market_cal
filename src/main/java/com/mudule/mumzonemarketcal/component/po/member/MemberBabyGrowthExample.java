package com.mudule.mumzonemarketcal.component.po.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberBabyGrowthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBabyGrowthExample() {
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

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNull() {
            addCriterion("image_type is null");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("image_type is not null");
            return (Criteria) this;
        }

        public Criteria andImageTypeEqualTo(Byte value) {
            addCriterion("image_type =", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotEqualTo(Byte value) {
            addCriterion("image_type <>", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThan(Byte value) {
            addCriterion("image_type >", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("image_type >=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThan(Byte value) {
            addCriterion("image_type <", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(Byte value) {
            addCriterion("image_type <=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeIn(List<Byte> values) {
            addCriterion("image_type in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotIn(List<Byte> values) {
            addCriterion("image_type not in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeBetween(Byte value1, Byte value2) {
            addCriterion("image_type between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("image_type not between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andThumbnailUrlIsNull() {
            addCriterion("thumbnail_url is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlIsNotNull() {
            addCriterion("thumbnail_url is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlEqualTo(String value) {
            addCriterion("thumbnail_url =", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotEqualTo(String value) {
            addCriterion("thumbnail_url <>", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlGreaterThan(String value) {
            addCriterion("thumbnail_url >", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_url >=", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLessThan(String value) {
            addCriterion("thumbnail_url <", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_url <=", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlLike(String value) {
            addCriterion("thumbnail_url like", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotLike(String value) {
            addCriterion("thumbnail_url not like", value, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlIn(List<String> values) {
            addCriterion("thumbnail_url in", values, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotIn(List<String> values) {
            addCriterion("thumbnail_url not in", values, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlBetween(String value1, String value2) {
            addCriterion("thumbnail_url between", value1, value2, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andThumbnailUrlNotBetween(String value1, String value2) {
            addCriterion("thumbnail_url not between", value1, value2, "thumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdIsNull() {
            addCriterion("life_record_id is null");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdIsNotNull() {
            addCriterion("life_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdEqualTo(String value) {
            addCriterion("life_record_id =", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdNotEqualTo(String value) {
            addCriterion("life_record_id <>", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdGreaterThan(String value) {
            addCriterion("life_record_id >", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("life_record_id >=", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdLessThan(String value) {
            addCriterion("life_record_id <", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdLessThanOrEqualTo(String value) {
            addCriterion("life_record_id <=", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdLike(String value) {
            addCriterion("life_record_id like", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdNotLike(String value) {
            addCriterion("life_record_id not like", value, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdIn(List<String> values) {
            addCriterion("life_record_id in", values, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdNotIn(List<String> values) {
            addCriterion("life_record_id not in", values, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdBetween(String value1, String value2) {
            addCriterion("life_record_id between", value1, value2, "lifeRecordId");
            return (Criteria) this;
        }

        public Criteria andLifeRecordIdNotBetween(String value1, String value2) {
            addCriterion("life_record_id not between", value1, value2, "lifeRecordId");
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