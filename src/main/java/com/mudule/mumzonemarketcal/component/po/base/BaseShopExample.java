package com.mudule.mumzonemarketcal.component.po.base;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseShopExample() {
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

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlIsNull() {
            addCriterion("license_url is null");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlIsNotNull() {
            addCriterion("license_url is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlEqualTo(String value) {
            addCriterion("license_url =", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlNotEqualTo(String value) {
            addCriterion("license_url <>", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlGreaterThan(String value) {
            addCriterion("license_url >", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("license_url >=", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlLessThan(String value) {
            addCriterion("license_url <", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("license_url <=", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlLike(String value) {
            addCriterion("license_url like", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlNotLike(String value) {
            addCriterion("license_url not like", value, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlIn(List<String> values) {
            addCriterion("license_url in", values, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlNotIn(List<String> values) {
            addCriterion("license_url not in", values, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlBetween(String value1, String value2) {
            addCriterion("license_url between", value1, value2, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("license_url not between", value1, value2, "licenseUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNull() {
            addCriterion("idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNotNull() {
            addCriterion("idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberEqualTo(String value) {
            addCriterion("idcard_number =", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotEqualTo(String value) {
            addCriterion("idcard_number <>", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThan(String value) {
            addCriterion("idcard_number >", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_number >=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThan(String value) {
            addCriterion("idcard_number <", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("idcard_number <=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLike(String value) {
            addCriterion("idcard_number like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotLike(String value) {
            addCriterion("idcard_number not like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIn(List<String> values) {
            addCriterion("idcard_number in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotIn(List<String> values) {
            addCriterion("idcard_number not in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberBetween(String value1, String value2) {
            addCriterion("idcard_number between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("idcard_number not between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIsNull() {
            addCriterion("idcard_front is null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIsNotNull() {
            addCriterion("idcard_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontEqualTo(String value) {
            addCriterion("idcard_front =", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotEqualTo(String value) {
            addCriterion("idcard_front <>", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThan(String value) {
            addCriterion("idcard_front >", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_front >=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThan(String value) {
            addCriterion("idcard_front <", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThanOrEqualTo(String value) {
            addCriterion("idcard_front <=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLike(String value) {
            addCriterion("idcard_front like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotLike(String value) {
            addCriterion("idcard_front not like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIn(List<String> values) {
            addCriterion("idcard_front in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotIn(List<String> values) {
            addCriterion("idcard_front not in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontBetween(String value1, String value2) {
            addCriterion("idcard_front between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotBetween(String value1, String value2) {
            addCriterion("idcard_front not between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseIsNull() {
            addCriterion("idcard_reverse is null");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseIsNotNull() {
            addCriterion("idcard_reverse is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseEqualTo(String value) {
            addCriterion("idcard_reverse =", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseNotEqualTo(String value) {
            addCriterion("idcard_reverse <>", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseGreaterThan(String value) {
            addCriterion("idcard_reverse >", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_reverse >=", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseLessThan(String value) {
            addCriterion("idcard_reverse <", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseLessThanOrEqualTo(String value) {
            addCriterion("idcard_reverse <=", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseLike(String value) {
            addCriterion("idcard_reverse like", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseNotLike(String value) {
            addCriterion("idcard_reverse not like", value, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseIn(List<String> values) {
            addCriterion("idcard_reverse in", values, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseNotIn(List<String> values) {
            addCriterion("idcard_reverse not in", values, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseBetween(String value1, String value2) {
            addCriterion("idcard_reverse between", value1, value2, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andIdcardReverseNotBetween(String value1, String value2) {
            addCriterion("idcard_reverse not between", value1, value2, "idcardReverse");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberIsNull() {
            addCriterion("food_license_number is null");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberIsNotNull() {
            addCriterion("food_license_number is not null");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberEqualTo(String value) {
            addCriterion("food_license_number =", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberNotEqualTo(String value) {
            addCriterion("food_license_number <>", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberGreaterThan(String value) {
            addCriterion("food_license_number >", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("food_license_number >=", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberLessThan(String value) {
            addCriterion("food_license_number <", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("food_license_number <=", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberLike(String value) {
            addCriterion("food_license_number like", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberNotLike(String value) {
            addCriterion("food_license_number not like", value, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberIn(List<String> values) {
            addCriterion("food_license_number in", values, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberNotIn(List<String> values) {
            addCriterion("food_license_number not in", values, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberBetween(String value1, String value2) {
            addCriterion("food_license_number between", value1, value2, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("food_license_number not between", value1, value2, "foodLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andFoodUrlIsNull() {
            addCriterion("food_url is null");
            return (Criteria) this;
        }

        public Criteria andFoodUrlIsNotNull() {
            addCriterion("food_url is not null");
            return (Criteria) this;
        }

        public Criteria andFoodUrlEqualTo(String value) {
            addCriterion("food_url =", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlNotEqualTo(String value) {
            addCriterion("food_url <>", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlGreaterThan(String value) {
            addCriterion("food_url >", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlGreaterThanOrEqualTo(String value) {
            addCriterion("food_url >=", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlLessThan(String value) {
            addCriterion("food_url <", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlLessThanOrEqualTo(String value) {
            addCriterion("food_url <=", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlLike(String value) {
            addCriterion("food_url like", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlNotLike(String value) {
            addCriterion("food_url not like", value, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlIn(List<String> values) {
            addCriterion("food_url in", values, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlNotIn(List<String> values) {
            addCriterion("food_url not in", values, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlBetween(String value1, String value2) {
            addCriterion("food_url between", value1, value2, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andFoodUrlNotBetween(String value1, String value2) {
            addCriterion("food_url not between", value1, value2, "foodUrl");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeIsNull() {
            addCriterion("taxes_type is null");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeIsNotNull() {
            addCriterion("taxes_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeEqualTo(String value) {
            addCriterion("taxes_type =", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeNotEqualTo(String value) {
            addCriterion("taxes_type <>", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeGreaterThan(String value) {
            addCriterion("taxes_type >", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("taxes_type >=", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeLessThan(String value) {
            addCriterion("taxes_type <", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeLessThanOrEqualTo(String value) {
            addCriterion("taxes_type <=", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeLike(String value) {
            addCriterion("taxes_type like", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeNotLike(String value) {
            addCriterion("taxes_type not like", value, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeIn(List<String> values) {
            addCriterion("taxes_type in", values, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeNotIn(List<String> values) {
            addCriterion("taxes_type not in", values, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeBetween(String value1, String value2) {
            addCriterion("taxes_type between", value1, value2, "taxesType");
            return (Criteria) this;
        }

        public Criteria andTaxesTypeNotBetween(String value1, String value2) {
            addCriterion("taxes_type not between", value1, value2, "taxesType");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("link_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("link_phone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("link_phone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("link_phone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("link_phone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("link_phone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("link_phone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("link_phone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("link_phone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("link_phone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("link_phone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("link_phone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("link_phone not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNull() {
            addCriterion("fix_phone is null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNotNull() {
            addCriterion("fix_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneEqualTo(String value) {
            addCriterion("fix_phone =", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotEqualTo(String value) {
            addCriterion("fix_phone <>", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThan(String value) {
            addCriterion("fix_phone >", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fix_phone >=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThan(String value) {
            addCriterion("fix_phone <", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThanOrEqualTo(String value) {
            addCriterion("fix_phone <=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLike(String value) {
            addCriterion("fix_phone like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotLike(String value) {
            addCriterion("fix_phone not like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIn(List<String> values) {
            addCriterion("fix_phone in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotIn(List<String> values) {
            addCriterion("fix_phone not in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneBetween(String value1, String value2) {
            addCriterion("fix_phone between", value1, value2, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotBetween(String value1, String value2) {
            addCriterion("fix_phone not between", value1, value2, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNull() {
            addCriterion("is_login is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNotNull() {
            addCriterion("is_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginEqualTo(Byte value) {
            addCriterion("is_login =", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotEqualTo(Byte value) {
            addCriterion("is_login <>", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThan(Byte value) {
            addCriterion("is_login >", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_login >=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThan(Byte value) {
            addCriterion("is_login <", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThanOrEqualTo(Byte value) {
            addCriterion("is_login <=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginIn(List<Byte> values) {
            addCriterion("is_login in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotIn(List<Byte> values) {
            addCriterion("is_login not in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginBetween(Byte value1, Byte value2) {
            addCriterion("is_login between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotBetween(Byte value1, Byte value2) {
            addCriterion("is_login not between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNull() {
            addCriterion("open_account is null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNotNull() {
            addCriterion("open_account is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountEqualTo(Byte value) {
            addCriterion("open_account =", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotEqualTo(Byte value) {
            addCriterion("open_account <>", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThan(Byte value) {
            addCriterion("open_account >", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("open_account >=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThan(Byte value) {
            addCriterion("open_account <", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThanOrEqualTo(Byte value) {
            addCriterion("open_account <=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIn(List<Byte> values) {
            addCriterion("open_account in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotIn(List<Byte> values) {
            addCriterion("open_account not in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountBetween(Byte value1, Byte value2) {
            addCriterion("open_account between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotBetween(Byte value1, Byte value2) {
            addCriterion("open_account not between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(Byte value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(Byte value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(Byte value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(Byte value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(Byte value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<Byte> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<Byte> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(Byte value1, Byte value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(BigDecimal value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(BigDecimal value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(BigDecimal value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(BigDecimal value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<BigDecimal> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<BigDecimal> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoIsNull() {
            addCriterion("registered_no is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoIsNotNull() {
            addCriterion("registered_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoEqualTo(String value) {
            addCriterion("registered_no =", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoNotEqualTo(String value) {
            addCriterion("registered_no <>", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoGreaterThan(String value) {
            addCriterion("registered_no >", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoGreaterThanOrEqualTo(String value) {
            addCriterion("registered_no >=", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoLessThan(String value) {
            addCriterion("registered_no <", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoLessThanOrEqualTo(String value) {
            addCriterion("registered_no <=", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoLike(String value) {
            addCriterion("registered_no like", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoNotLike(String value) {
            addCriterion("registered_no not like", value, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoIn(List<String> values) {
            addCriterion("registered_no in", values, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoNotIn(List<String> values) {
            addCriterion("registered_no not in", values, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoBetween(String value1, String value2) {
            addCriterion("registered_no between", value1, value2, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andRegisteredNoNotBetween(String value1, String value2) {
            addCriterion("registered_no not between", value1, value2, "registeredNo");
            return (Criteria) this;
        }

        public Criteria andTexNoIsNull() {
            addCriterion("tex_no is null");
            return (Criteria) this;
        }

        public Criteria andTexNoIsNotNull() {
            addCriterion("tex_no is not null");
            return (Criteria) this;
        }

        public Criteria andTexNoEqualTo(String value) {
            addCriterion("tex_no =", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoNotEqualTo(String value) {
            addCriterion("tex_no <>", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoGreaterThan(String value) {
            addCriterion("tex_no >", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoGreaterThanOrEqualTo(String value) {
            addCriterion("tex_no >=", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoLessThan(String value) {
            addCriterion("tex_no <", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoLessThanOrEqualTo(String value) {
            addCriterion("tex_no <=", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoLike(String value) {
            addCriterion("tex_no like", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoNotLike(String value) {
            addCriterion("tex_no not like", value, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoIn(List<String> values) {
            addCriterion("tex_no in", values, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoNotIn(List<String> values) {
            addCriterion("tex_no not in", values, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoBetween(String value1, String value2) {
            addCriterion("tex_no between", value1, value2, "texNo");
            return (Criteria) this;
        }

        public Criteria andTexNoNotBetween(String value1, String value2) {
            addCriterion("tex_no not between", value1, value2, "texNo");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
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

        public Criteria andIsStoreIsNull() {
            addCriterion("is_store is null");
            return (Criteria) this;
        }

        public Criteria andIsStoreIsNotNull() {
            addCriterion("is_store is not null");
            return (Criteria) this;
        }

        public Criteria andIsStoreEqualTo(Byte value) {
            addCriterion("is_store =", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotEqualTo(Byte value) {
            addCriterion("is_store <>", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreGreaterThan(Byte value) {
            addCriterion("is_store >", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_store >=", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreLessThan(Byte value) {
            addCriterion("is_store <", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreLessThanOrEqualTo(Byte value) {
            addCriterion("is_store <=", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreIn(List<Byte> values) {
            addCriterion("is_store in", values, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotIn(List<Byte> values) {
            addCriterion("is_store not in", values, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreBetween(Byte value1, Byte value2) {
            addCriterion("is_store between", value1, value2, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotBetween(Byte value1, Byte value2) {
            addCriterion("is_store not between", value1, value2, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsTenantIsNull() {
            addCriterion("is_tenant is null");
            return (Criteria) this;
        }

        public Criteria andIsTenantIsNotNull() {
            addCriterion("is_tenant is not null");
            return (Criteria) this;
        }

        public Criteria andIsTenantEqualTo(Byte value) {
            addCriterion("is_tenant =", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantNotEqualTo(Byte value) {
            addCriterion("is_tenant <>", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantGreaterThan(Byte value) {
            addCriterion("is_tenant >", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_tenant >=", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantLessThan(Byte value) {
            addCriterion("is_tenant <", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantLessThanOrEqualTo(Byte value) {
            addCriterion("is_tenant <=", value, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantIn(List<Byte> values) {
            addCriterion("is_tenant in", values, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantNotIn(List<Byte> values) {
            addCriterion("is_tenant not in", values, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantBetween(Byte value1, Byte value2) {
            addCriterion("is_tenant between", value1, value2, "isTenant");
            return (Criteria) this;
        }

        public Criteria andIsTenantNotBetween(Byte value1, Byte value2) {
            addCriterion("is_tenant not between", value1, value2, "isTenant");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Byte value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Byte value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Byte value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Byte value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Byte value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Byte> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Byte> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Byte value1, Byte value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionIsNull() {
            addCriterion("reason_rejection is null");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionIsNotNull() {
            addCriterion("reason_rejection is not null");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionEqualTo(String value) {
            addCriterion("reason_rejection =", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionNotEqualTo(String value) {
            addCriterion("reason_rejection <>", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionGreaterThan(String value) {
            addCriterion("reason_rejection >", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionGreaterThanOrEqualTo(String value) {
            addCriterion("reason_rejection >=", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionLessThan(String value) {
            addCriterion("reason_rejection <", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionLessThanOrEqualTo(String value) {
            addCriterion("reason_rejection <=", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionLike(String value) {
            addCriterion("reason_rejection like", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionNotLike(String value) {
            addCriterion("reason_rejection not like", value, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionIn(List<String> values) {
            addCriterion("reason_rejection in", values, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionNotIn(List<String> values) {
            addCriterion("reason_rejection not in", values, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionBetween(String value1, String value2) {
            addCriterion("reason_rejection between", value1, value2, "reasonRejection");
            return (Criteria) this;
        }

        public Criteria andReasonRejectionNotBetween(String value1, String value2) {
            addCriterion("reason_rejection not between", value1, value2, "reasonRejection");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
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

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
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