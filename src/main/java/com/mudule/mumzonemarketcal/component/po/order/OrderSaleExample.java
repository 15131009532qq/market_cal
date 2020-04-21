package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSaleExample() {
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

        public Criteria andSalerIdIsNull() {
            addCriterion("saler_id is null");
            return (Criteria) this;
        }

        public Criteria andSalerIdIsNotNull() {
            addCriterion("saler_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalerIdEqualTo(String value) {
            addCriterion("saler_id =", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotEqualTo(String value) {
            addCriterion("saler_id <>", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThan(String value) {
            addCriterion("saler_id >", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThanOrEqualTo(String value) {
            addCriterion("saler_id >=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThan(String value) {
            addCriterion("saler_id <", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThanOrEqualTo(String value) {
            addCriterion("saler_id <=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLike(String value) {
            addCriterion("saler_id like", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotLike(String value) {
            addCriterion("saler_id not like", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdIn(List<String> values) {
            addCriterion("saler_id in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotIn(List<String> values) {
            addCriterion("saler_id not in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdBetween(String value1, String value2) {
            addCriterion("saler_id between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotBetween(String value1, String value2) {
            addCriterion("saler_id not between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCashierIsNull() {
            addCriterion("cashier is null");
            return (Criteria) this;
        }

        public Criteria andCashierIsNotNull() {
            addCriterion("cashier is not null");
            return (Criteria) this;
        }

        public Criteria andCashierEqualTo(String value) {
            addCriterion("cashier =", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotEqualTo(String value) {
            addCriterion("cashier <>", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThan(String value) {
            addCriterion("cashier >", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThanOrEqualTo(String value) {
            addCriterion("cashier >=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThan(String value) {
            addCriterion("cashier <", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThanOrEqualTo(String value) {
            addCriterion("cashier <=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLike(String value) {
            addCriterion("cashier like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotLike(String value) {
            addCriterion("cashier not like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierIn(List<String> values) {
            addCriterion("cashier in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotIn(List<String> values) {
            addCriterion("cashier not in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierBetween(String value1, String value2) {
            addCriterion("cashier between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotBetween(String value1, String value2) {
            addCriterion("cashier not between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andPosCodeIsNull() {
            addCriterion("pos_code is null");
            return (Criteria) this;
        }

        public Criteria andPosCodeIsNotNull() {
            addCriterion("pos_code is not null");
            return (Criteria) this;
        }

        public Criteria andPosCodeEqualTo(String value) {
            addCriterion("pos_code =", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotEqualTo(String value) {
            addCriterion("pos_code <>", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeGreaterThan(String value) {
            addCriterion("pos_code >", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pos_code >=", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLessThan(String value) {
            addCriterion("pos_code <", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLessThanOrEqualTo(String value) {
            addCriterion("pos_code <=", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeLike(String value) {
            addCriterion("pos_code like", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotLike(String value) {
            addCriterion("pos_code not like", value, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeIn(List<String> values) {
            addCriterion("pos_code in", values, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotIn(List<String> values) {
            addCriterion("pos_code not in", values, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeBetween(String value1, String value2) {
            addCriterion("pos_code between", value1, value2, "posCode");
            return (Criteria) this;
        }

        public Criteria andPosCodeNotBetween(String value1, String value2) {
            addCriterion("pos_code not between", value1, value2, "posCode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountIsNull() {
            addCriterion("bargaining_amount is null");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountIsNotNull() {
            addCriterion("bargaining_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountEqualTo(BigDecimal value) {
            addCriterion("bargaining_amount =", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountNotEqualTo(BigDecimal value) {
            addCriterion("bargaining_amount <>", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountGreaterThan(BigDecimal value) {
            addCriterion("bargaining_amount >", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bargaining_amount >=", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountLessThan(BigDecimal value) {
            addCriterion("bargaining_amount <", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bargaining_amount <=", value, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountIn(List<BigDecimal> values) {
            addCriterion("bargaining_amount in", values, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountNotIn(List<BigDecimal> values) {
            addCriterion("bargaining_amount not in", values, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargaining_amount between", value1, value2, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andBargainingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargaining_amount not between", value1, value2, "bargainingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNull() {
            addCriterion("activity_amount is null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNotNull() {
            addCriterion("activity_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountEqualTo(BigDecimal value) {
            addCriterion("activity_amount =", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotEqualTo(BigDecimal value) {
            addCriterion("activity_amount <>", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThan(BigDecimal value) {
            addCriterion("activity_amount >", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_amount >=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThan(BigDecimal value) {
            addCriterion("activity_amount <", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_amount <=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIn(List<BigDecimal> values) {
            addCriterion("activity_amount in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotIn(List<BigDecimal> values) {
            addCriterion("activity_amount not in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_amount between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_amount not between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(String value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(String value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(String value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(String value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(String value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLike(String value) {
            addCriterion("ticket_id like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotLike(String value) {
            addCriterion("ticket_id not like", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<String> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<String> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(String value1, String value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(String value1, String value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIsNull() {
            addCriterion("ticket_amount is null");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIsNotNull() {
            addCriterion("ticket_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTicketAmountEqualTo(BigDecimal value) {
            addCriterion("ticket_amount =", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotEqualTo(BigDecimal value) {
            addCriterion("ticket_amount <>", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountGreaterThan(BigDecimal value) {
            addCriterion("ticket_amount >", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_amount >=", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountLessThan(BigDecimal value) {
            addCriterion("ticket_amount <", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_amount <=", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIn(List<BigDecimal> values) {
            addCriterion("ticket_amount in", values, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotIn(List<BigDecimal> values) {
            addCriterion("ticket_amount not in", values, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_amount between", value1, value2, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_amount not between", value1, value2, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andMlPriceIsNull() {
            addCriterion("ml_price is null");
            return (Criteria) this;
        }

        public Criteria andMlPriceIsNotNull() {
            addCriterion("ml_price is not null");
            return (Criteria) this;
        }

        public Criteria andMlPriceEqualTo(BigDecimal value) {
            addCriterion("ml_price =", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceNotEqualTo(BigDecimal value) {
            addCriterion("ml_price <>", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceGreaterThan(BigDecimal value) {
            addCriterion("ml_price >", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ml_price >=", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceLessThan(BigDecimal value) {
            addCriterion("ml_price <", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ml_price <=", value, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceIn(List<BigDecimal> values) {
            addCriterion("ml_price in", values, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceNotIn(List<BigDecimal> values) {
            addCriterion("ml_price not in", values, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ml_price between", value1, value2, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andMlPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ml_price not between", value1, value2, "mlPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNull() {
            addCriterion("integral_money is null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNotNull() {
            addCriterion("integral_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyEqualTo(Integer value) {
            addCriterion("integral_money =", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotEqualTo(Integer value) {
            addCriterion("integral_money <>", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThan(Integer value) {
            addCriterion("integral_money >", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_money >=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThan(Integer value) {
            addCriterion("integral_money <", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("integral_money <=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIn(List<Integer> values) {
            addCriterion("integral_money in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotIn(List<Integer> values) {
            addCriterion("integral_money not in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyBetween(Integer value1, Integer value2) {
            addCriterion("integral_money between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_money not between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIsNull() {
            addCriterion("integral_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIsNotNull() {
            addCriterion("integral_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountEqualTo(BigDecimal value) {
            addCriterion("integral_amount =", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotEqualTo(BigDecimal value) {
            addCriterion("integral_amount <>", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountGreaterThan(BigDecimal value) {
            addCriterion("integral_amount >", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_amount >=", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountLessThan(BigDecimal value) {
            addCriterion("integral_amount <", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_amount <=", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIn(List<BigDecimal> values) {
            addCriterion("integral_amount in", values, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotIn(List<BigDecimal> values) {
            addCriterion("integral_amount not in", values, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_amount between", value1, value2, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_amount not between", value1, value2, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsIsNull() {
            addCriterion("integral_goods is null");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsIsNotNull() {
            addCriterion("integral_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsEqualTo(Integer value) {
            addCriterion("integral_goods =", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsNotEqualTo(Integer value) {
            addCriterion("integral_goods <>", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsGreaterThan(Integer value) {
            addCriterion("integral_goods >", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_goods >=", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsLessThan(Integer value) {
            addCriterion("integral_goods <", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("integral_goods <=", value, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsIn(List<Integer> values) {
            addCriterion("integral_goods in", values, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsNotIn(List<Integer> values) {
            addCriterion("integral_goods not in", values, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsBetween(Integer value1, Integer value2) {
            addCriterion("integral_goods between", value1, value2, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andIntegralGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_goods not between", value1, value2, "integralGoods");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andDlIsNull() {
            addCriterion("dl is null");
            return (Criteria) this;
        }

        public Criteria andDlIsNotNull() {
            addCriterion("dl is not null");
            return (Criteria) this;
        }

        public Criteria andDlEqualTo(Byte value) {
            addCriterion("dl =", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlNotEqualTo(Byte value) {
            addCriterion("dl <>", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlGreaterThan(Byte value) {
            addCriterion("dl >", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlGreaterThanOrEqualTo(Byte value) {
            addCriterion("dl >=", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlLessThan(Byte value) {
            addCriterion("dl <", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlLessThanOrEqualTo(Byte value) {
            addCriterion("dl <=", value, "dl");
            return (Criteria) this;
        }

        public Criteria andDlIn(List<Byte> values) {
            addCriterion("dl in", values, "dl");
            return (Criteria) this;
        }

        public Criteria andDlNotIn(List<Byte> values) {
            addCriterion("dl not in", values, "dl");
            return (Criteria) this;
        }

        public Criteria andDlBetween(Byte value1, Byte value2) {
            addCriterion("dl between", value1, value2, "dl");
            return (Criteria) this;
        }

        public Criteria andDlNotBetween(Byte value1, Byte value2) {
            addCriterion("dl not between", value1, value2, "dl");
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

        public Criteria andCashCollectionIsNull() {
            addCriterion("cash_collection is null");
            return (Criteria) this;
        }

        public Criteria andCashCollectionIsNotNull() {
            addCriterion("cash_collection is not null");
            return (Criteria) this;
        }

        public Criteria andCashCollectionEqualTo(BigDecimal value) {
            addCriterion("cash_collection =", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionNotEqualTo(BigDecimal value) {
            addCriterion("cash_collection <>", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionGreaterThan(BigDecimal value) {
            addCriterion("cash_collection >", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_collection >=", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionLessThan(BigDecimal value) {
            addCriterion("cash_collection <", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_collection <=", value, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionIn(List<BigDecimal> values) {
            addCriterion("cash_collection in", values, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionNotIn(List<BigDecimal> values) {
            addCriterion("cash_collection not in", values, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_collection between", value1, value2, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashCollectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_collection not between", value1, value2, "cashCollection");
            return (Criteria) this;
        }

        public Criteria andCashChangeIsNull() {
            addCriterion("cash_change is null");
            return (Criteria) this;
        }

        public Criteria andCashChangeIsNotNull() {
            addCriterion("cash_change is not null");
            return (Criteria) this;
        }

        public Criteria andCashChangeEqualTo(BigDecimal value) {
            addCriterion("cash_change =", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeNotEqualTo(BigDecimal value) {
            addCriterion("cash_change <>", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeGreaterThan(BigDecimal value) {
            addCriterion("cash_change >", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_change >=", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeLessThan(BigDecimal value) {
            addCriterion("cash_change <", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_change <=", value, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeIn(List<BigDecimal> values) {
            addCriterion("cash_change in", values, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeNotIn(List<BigDecimal> values) {
            addCriterion("cash_change not in", values, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_change between", value1, value2, "cashChange");
            return (Criteria) this;
        }

        public Criteria andCashChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_change not between", value1, value2, "cashChange");
            return (Criteria) this;
        }

        public Criteria andBillingUserIsNull() {
            addCriterion("billing_user is null");
            return (Criteria) this;
        }

        public Criteria andBillingUserIsNotNull() {
            addCriterion("billing_user is not null");
            return (Criteria) this;
        }

        public Criteria andBillingUserEqualTo(String value) {
            addCriterion("billing_user =", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserNotEqualTo(String value) {
            addCriterion("billing_user <>", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserGreaterThan(String value) {
            addCriterion("billing_user >", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserGreaterThanOrEqualTo(String value) {
            addCriterion("billing_user >=", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserLessThan(String value) {
            addCriterion("billing_user <", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserLessThanOrEqualTo(String value) {
            addCriterion("billing_user <=", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserLike(String value) {
            addCriterion("billing_user like", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserNotLike(String value) {
            addCriterion("billing_user not like", value, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserIn(List<String> values) {
            addCriterion("billing_user in", values, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserNotIn(List<String> values) {
            addCriterion("billing_user not in", values, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserBetween(String value1, String value2) {
            addCriterion("billing_user between", value1, value2, "billingUser");
            return (Criteria) this;
        }

        public Criteria andBillingUserNotBetween(String value1, String value2) {
            addCriterion("billing_user not between", value1, value2, "billingUser");
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

        public Criteria andExperienceIdIsNull() {
            addCriterion("experience_id is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIsNotNull() {
            addCriterion("experience_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdEqualTo(String value) {
            addCriterion("experience_id =", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotEqualTo(String value) {
            addCriterion("experience_id <>", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThan(String value) {
            addCriterion("experience_id >", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThanOrEqualTo(String value) {
            addCriterion("experience_id >=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThan(String value) {
            addCriterion("experience_id <", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThanOrEqualTo(String value) {
            addCriterion("experience_id <=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLike(String value) {
            addCriterion("experience_id like", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotLike(String value) {
            addCriterion("experience_id not like", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIn(List<String> values) {
            addCriterion("experience_id in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotIn(List<String> values) {
            addCriterion("experience_id not in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdBetween(String value1, String value2) {
            addCriterion("experience_id between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotBetween(String value1, String value2) {
            addCriterion("experience_id not between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceNameIsNull() {
            addCriterion("experience_name is null");
            return (Criteria) this;
        }

        public Criteria andExperienceNameIsNotNull() {
            addCriterion("experience_name is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceNameEqualTo(String value) {
            addCriterion("experience_name =", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameNotEqualTo(String value) {
            addCriterion("experience_name <>", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameGreaterThan(String value) {
            addCriterion("experience_name >", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameGreaterThanOrEqualTo(String value) {
            addCriterion("experience_name >=", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameLessThan(String value) {
            addCriterion("experience_name <", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameLessThanOrEqualTo(String value) {
            addCriterion("experience_name <=", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameLike(String value) {
            addCriterion("experience_name like", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameNotLike(String value) {
            addCriterion("experience_name not like", value, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameIn(List<String> values) {
            addCriterion("experience_name in", values, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameNotIn(List<String> values) {
            addCriterion("experience_name not in", values, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameBetween(String value1, String value2) {
            addCriterion("experience_name between", value1, value2, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceNameNotBetween(String value1, String value2) {
            addCriterion("experience_name not between", value1, value2, "experienceName");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountIsNull() {
            addCriterion("experience_amount is null");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountIsNotNull() {
            addCriterion("experience_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountEqualTo(BigDecimal value) {
            addCriterion("experience_amount =", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountNotEqualTo(BigDecimal value) {
            addCriterion("experience_amount <>", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountGreaterThan(BigDecimal value) {
            addCriterion("experience_amount >", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("experience_amount >=", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountLessThan(BigDecimal value) {
            addCriterion("experience_amount <", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("experience_amount <=", value, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountIn(List<BigDecimal> values) {
            addCriterion("experience_amount in", values, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountNotIn(List<BigDecimal> values) {
            addCriterion("experience_amount not in", values, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("experience_amount between", value1, value2, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andExperienceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("experience_amount not between", value1, value2, "experienceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalGainIsNull() {
            addCriterion("total_gain is null");
            return (Criteria) this;
        }

        public Criteria andTotalGainIsNotNull() {
            addCriterion("total_gain is not null");
            return (Criteria) this;
        }

        public Criteria andTotalGainEqualTo(Integer value) {
            addCriterion("total_gain =", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainNotEqualTo(Integer value) {
            addCriterion("total_gain <>", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainGreaterThan(Integer value) {
            addCriterion("total_gain >", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_gain >=", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainLessThan(Integer value) {
            addCriterion("total_gain <", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainLessThanOrEqualTo(Integer value) {
            addCriterion("total_gain <=", value, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainIn(List<Integer> values) {
            addCriterion("total_gain in", values, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainNotIn(List<Integer> values) {
            addCriterion("total_gain not in", values, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainBetween(Integer value1, Integer value2) {
            addCriterion("total_gain between", value1, value2, "totalGain");
            return (Criteria) this;
        }

        public Criteria andTotalGainNotBetween(Integer value1, Integer value2) {
            addCriterion("total_gain not between", value1, value2, "totalGain");
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

        public Criteria andTicketsIsNull() {
            addCriterion("tickets is null");
            return (Criteria) this;
        }

        public Criteria andTicketsIsNotNull() {
            addCriterion("tickets is not null");
            return (Criteria) this;
        }

        public Criteria andTicketsEqualTo(String value) {
            addCriterion("tickets =", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotEqualTo(String value) {
            addCriterion("tickets <>", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsGreaterThan(String value) {
            addCriterion("tickets >", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsGreaterThanOrEqualTo(String value) {
            addCriterion("tickets >=", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLessThan(String value) {
            addCriterion("tickets <", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLessThanOrEqualTo(String value) {
            addCriterion("tickets <=", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLike(String value) {
            addCriterion("tickets like", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotLike(String value) {
            addCriterion("tickets not like", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsIn(List<String> values) {
            addCriterion("tickets in", values, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotIn(List<String> values) {
            addCriterion("tickets not in", values, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsBetween(String value1, String value2) {
            addCriterion("tickets between", value1, value2, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotBetween(String value1, String value2) {
            addCriterion("tickets not between", value1, value2, "tickets");
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