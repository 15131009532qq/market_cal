package com.mudule.mumzonemarketcal.component.po.goods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsShopExample() {
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

        public Criteria andGoodsCompanyIdIsNull() {
            addCriterion("goods_company_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdIsNotNull() {
            addCriterion("goods_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdEqualTo(String value) {
            addCriterion("goods_company_id =", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdNotEqualTo(String value) {
            addCriterion("goods_company_id <>", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdGreaterThan(String value) {
            addCriterion("goods_company_id >", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_company_id >=", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdLessThan(String value) {
            addCriterion("goods_company_id <", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("goods_company_id <=", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdLike(String value) {
            addCriterion("goods_company_id like", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdNotLike(String value) {
            addCriterion("goods_company_id not like", value, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdIn(List<String> values) {
            addCriterion("goods_company_id in", values, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdNotIn(List<String> values) {
            addCriterion("goods_company_id not in", values, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdBetween(String value1, String value2) {
            addCriterion("goods_company_id between", value1, value2, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andGoodsCompanyIdNotBetween(String value1, String value2) {
            addCriterion("goods_company_id not between", value1, value2, "goodsCompanyId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdIsNull() {
            addCriterion("primary_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdIsNotNull() {
            addCriterion("primary_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdEqualTo(String value) {
            addCriterion("primary_classify_id =", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdNotEqualTo(String value) {
            addCriterion("primary_classify_id <>", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdGreaterThan(String value) {
            addCriterion("primary_classify_id >", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("primary_classify_id >=", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdLessThan(String value) {
            addCriterion("primary_classify_id <", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("primary_classify_id <=", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdLike(String value) {
            addCriterion("primary_classify_id like", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdNotLike(String value) {
            addCriterion("primary_classify_id not like", value, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdIn(List<String> values) {
            addCriterion("primary_classify_id in", values, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdNotIn(List<String> values) {
            addCriterion("primary_classify_id not in", values, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdBetween(String value1, String value2) {
            addCriterion("primary_classify_id between", value1, value2, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassifyIdNotBetween(String value1, String value2) {
            addCriterion("primary_classify_id not between", value1, value2, "primaryClassifyId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIsNull() {
            addCriterion("goods_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIsNotNull() {
            addCriterion("goods_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdEqualTo(String value) {
            addCriterion("goods_unit_id =", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotEqualTo(String value) {
            addCriterion("goods_unit_id <>", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdGreaterThan(String value) {
            addCriterion("goods_unit_id >", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit_id >=", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdLessThan(String value) {
            addCriterion("goods_unit_id <", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdLessThanOrEqualTo(String value) {
            addCriterion("goods_unit_id <=", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdLike(String value) {
            addCriterion("goods_unit_id like", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotLike(String value) {
            addCriterion("goods_unit_id not like", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIn(List<String> values) {
            addCriterion("goods_unit_id in", values, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotIn(List<String> values) {
            addCriterion("goods_unit_id not in", values, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdBetween(String value1, String value2) {
            addCriterion("goods_unit_id between", value1, value2, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotBetween(String value1, String value2) {
            addCriterion("goods_unit_id not between", value1, value2, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdIsNull() {
            addCriterion("goods_pack_parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdIsNotNull() {
            addCriterion("goods_pack_parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdEqualTo(String value) {
            addCriterion("goods_pack_parameter_id =", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdNotEqualTo(String value) {
            addCriterion("goods_pack_parameter_id <>", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdGreaterThan(String value) {
            addCriterion("goods_pack_parameter_id >", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_pack_parameter_id >=", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdLessThan(String value) {
            addCriterion("goods_pack_parameter_id <", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdLessThanOrEqualTo(String value) {
            addCriterion("goods_pack_parameter_id <=", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdLike(String value) {
            addCriterion("goods_pack_parameter_id like", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdNotLike(String value) {
            addCriterion("goods_pack_parameter_id not like", value, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdIn(List<String> values) {
            addCriterion("goods_pack_parameter_id in", values, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdNotIn(List<String> values) {
            addCriterion("goods_pack_parameter_id not in", values, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdBetween(String value1, String value2) {
            addCriterion("goods_pack_parameter_id between", value1, value2, "goodsPackParameterId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackParameterIdNotBetween(String value1, String value2) {
            addCriterion("goods_pack_parameter_id not between", value1, value2, "goodsPackParameterId");
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

        public Criteria andBulkBearIsNull() {
            addCriterion("bulk_bear is null");
            return (Criteria) this;
        }

        public Criteria andBulkBearIsNotNull() {
            addCriterion("bulk_bear is not null");
            return (Criteria) this;
        }

        public Criteria andBulkBearEqualTo(Byte value) {
            addCriterion("bulk_bear =", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearNotEqualTo(Byte value) {
            addCriterion("bulk_bear <>", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearGreaterThan(Byte value) {
            addCriterion("bulk_bear >", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearGreaterThanOrEqualTo(Byte value) {
            addCriterion("bulk_bear >=", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearLessThan(Byte value) {
            addCriterion("bulk_bear <", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearLessThanOrEqualTo(Byte value) {
            addCriterion("bulk_bear <=", value, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearIn(List<Byte> values) {
            addCriterion("bulk_bear in", values, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearNotIn(List<Byte> values) {
            addCriterion("bulk_bear not in", values, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearBetween(Byte value1, Byte value2) {
            addCriterion("bulk_bear between", value1, value2, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andBulkBearNotBetween(Byte value1, Byte value2) {
            addCriterion("bulk_bear not between", value1, value2, "bulkBear");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesIsNull() {
            addCriterion("income_tax_rates is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesIsNotNull() {
            addCriterion("income_tax_rates is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesEqualTo(String value) {
            addCriterion("income_tax_rates =", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesNotEqualTo(String value) {
            addCriterion("income_tax_rates <>", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesGreaterThan(String value) {
            addCriterion("income_tax_rates >", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesGreaterThanOrEqualTo(String value) {
            addCriterion("income_tax_rates >=", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesLessThan(String value) {
            addCriterion("income_tax_rates <", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesLessThanOrEqualTo(String value) {
            addCriterion("income_tax_rates <=", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesLike(String value) {
            addCriterion("income_tax_rates like", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesNotLike(String value) {
            addCriterion("income_tax_rates not like", value, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesIn(List<String> values) {
            addCriterion("income_tax_rates in", values, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesNotIn(List<String> values) {
            addCriterion("income_tax_rates not in", values, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesBetween(String value1, String value2) {
            addCriterion("income_tax_rates between", value1, value2, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIncomeTaxRatesNotBetween(String value1, String value2) {
            addCriterion("income_tax_rates not between", value1, value2, "incomeTaxRates");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNull() {
            addCriterion("is_batch is null");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNotNull() {
            addCriterion("is_batch is not null");
            return (Criteria) this;
        }

        public Criteria andIsBatchEqualTo(Byte value) {
            addCriterion("is_batch =", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotEqualTo(Byte value) {
            addCriterion("is_batch <>", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThan(Byte value) {
            addCriterion("is_batch >", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_batch >=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThan(Byte value) {
            addCriterion("is_batch <", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThanOrEqualTo(Byte value) {
            addCriterion("is_batch <=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchIn(List<Byte> values) {
            addCriterion("is_batch in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotIn(List<Byte> values) {
            addCriterion("is_batch not in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchBetween(Byte value1, Byte value2) {
            addCriterion("is_batch between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotBetween(Byte value1, Byte value2) {
            addCriterion("is_batch not between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsParameterIsNull() {
            addCriterion("is_parameter is null");
            return (Criteria) this;
        }

        public Criteria andIsParameterIsNotNull() {
            addCriterion("is_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andIsParameterEqualTo(Byte value) {
            addCriterion("is_parameter =", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterNotEqualTo(Byte value) {
            addCriterion("is_parameter <>", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterGreaterThan(Byte value) {
            addCriterion("is_parameter >", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_parameter >=", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterLessThan(Byte value) {
            addCriterion("is_parameter <", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterLessThanOrEqualTo(Byte value) {
            addCriterion("is_parameter <=", value, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterIn(List<Byte> values) {
            addCriterion("is_parameter in", values, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterNotIn(List<Byte> values) {
            addCriterion("is_parameter not in", values, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterBetween(Byte value1, Byte value2) {
            addCriterion("is_parameter between", value1, value2, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsParameterNotBetween(Byte value1, Byte value2) {
            addCriterion("is_parameter not between", value1, value2, "isParameter");
            return (Criteria) this;
        }

        public Criteria andIsAllotIsNull() {
            addCriterion("is_allot is null");
            return (Criteria) this;
        }

        public Criteria andIsAllotIsNotNull() {
            addCriterion("is_allot is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllotEqualTo(Byte value) {
            addCriterion("is_allot =", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotEqualTo(Byte value) {
            addCriterion("is_allot <>", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotGreaterThan(Byte value) {
            addCriterion("is_allot >", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allot >=", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotLessThan(Byte value) {
            addCriterion("is_allot <", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotLessThanOrEqualTo(Byte value) {
            addCriterion("is_allot <=", value, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotIn(List<Byte> values) {
            addCriterion("is_allot in", values, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotIn(List<Byte> values) {
            addCriterion("is_allot not in", values, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotBetween(Byte value1, Byte value2) {
            addCriterion("is_allot between", value1, value2, "isAllot");
            return (Criteria) this;
        }

        public Criteria andIsAllotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allot not between", value1, value2, "isAllot");
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

        public Criteria andDrEqualTo(String value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(String value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(String value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(String value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(String value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(String value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLike(String value) {
            addCriterion("dr like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotLike(String value) {
            addCriterion("dr not like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<String> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<String> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(String value1, String value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(String value1, String value2) {
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