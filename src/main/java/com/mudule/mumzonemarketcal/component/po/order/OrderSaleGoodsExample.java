package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSaleGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSaleGoodsExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andSubCodeIsNull() {
            addCriterion("sub_code is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNotNull() {
            addCriterion("sub_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeEqualTo(String value) {
            addCriterion("sub_code =", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotEqualTo(String value) {
            addCriterion("sub_code <>", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThan(String value) {
            addCriterion("sub_code >", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_code >=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThan(String value) {
            addCriterion("sub_code <", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_code <=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLike(String value) {
            addCriterion("sub_code like", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotLike(String value) {
            addCriterion("sub_code not like", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeIn(List<String> values) {
            addCriterion("sub_code in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotIn(List<String> values) {
            addCriterion("sub_code not in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeBetween(String value1, String value2) {
            addCriterion("sub_code between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotBetween(String value1, String value2) {
            addCriterion("sub_code not between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdIsNull() {
            addCriterion("goods_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdIsNotNull() {
            addCriterion("goods_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdEqualTo(String value) {
            addCriterion("goods_sku_id =", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdNotEqualTo(String value) {
            addCriterion("goods_sku_id <>", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdGreaterThan(String value) {
            addCriterion("goods_sku_id >", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sku_id >=", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdLessThan(String value) {
            addCriterion("goods_sku_id <", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdLessThanOrEqualTo(String value) {
            addCriterion("goods_sku_id <=", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdLike(String value) {
            addCriterion("goods_sku_id like", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdNotLike(String value) {
            addCriterion("goods_sku_id not like", value, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdIn(List<String> values) {
            addCriterion("goods_sku_id in", values, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdNotIn(List<String> values) {
            addCriterion("goods_sku_id not in", values, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdBetween(String value1, String value2) {
            addCriterion("goods_sku_id between", value1, value2, "goodsSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSkuIdNotBetween(String value1, String value2) {
            addCriterion("goods_sku_id not between", value1, value2, "goodsSkuId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceIsNull() {
            addCriterion("bargaining_price is null");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceIsNotNull() {
            addCriterion("bargaining_price is not null");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceEqualTo(BigDecimal value) {
            addCriterion("bargaining_price =", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceNotEqualTo(BigDecimal value) {
            addCriterion("bargaining_price <>", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceGreaterThan(BigDecimal value) {
            addCriterion("bargaining_price >", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bargaining_price >=", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceLessThan(BigDecimal value) {
            addCriterion("bargaining_price <", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bargaining_price <=", value, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceIn(List<BigDecimal> values) {
            addCriterion("bargaining_price in", values, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceNotIn(List<BigDecimal> values) {
            addCriterion("bargaining_price not in", values, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargaining_price between", value1, value2, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andBargainingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bargaining_price not between", value1, value2, "bargainingPrice");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardIsNull() {
            addCriterion("is_timer_card is null");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardIsNotNull() {
            addCriterion("is_timer_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardEqualTo(Byte value) {
            addCriterion("is_timer_card =", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardNotEqualTo(Byte value) {
            addCriterion("is_timer_card <>", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardGreaterThan(Byte value) {
            addCriterion("is_timer_card >", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_timer_card >=", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardLessThan(Byte value) {
            addCriterion("is_timer_card <", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardLessThanOrEqualTo(Byte value) {
            addCriterion("is_timer_card <=", value, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardIn(List<Byte> values) {
            addCriterion("is_timer_card in", values, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardNotIn(List<Byte> values) {
            addCriterion("is_timer_card not in", values, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardBetween(Byte value1, Byte value2) {
            addCriterion("is_timer_card between", value1, value2, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andIsTimerCardNotBetween(Byte value1, Byte value2) {
            addCriterion("is_timer_card not between", value1, value2, "isTimerCard");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Byte value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Byte value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Byte value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Byte value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Byte> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Byte> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Byte value1, Byte value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNull() {
            addCriterion("discount_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNotNull() {
            addCriterion("discount_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdEqualTo(String value) {
            addCriterion("discount_id =", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotEqualTo(String value) {
            addCriterion("discount_id <>", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThan(String value) {
            addCriterion("discount_id >", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThanOrEqualTo(String value) {
            addCriterion("discount_id >=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThan(String value) {
            addCriterion("discount_id <", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThanOrEqualTo(String value) {
            addCriterion("discount_id <=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLike(String value) {
            addCriterion("discount_id like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotLike(String value) {
            addCriterion("discount_id not like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIn(List<String> values) {
            addCriterion("discount_id in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotIn(List<String> values) {
            addCriterion("discount_id not in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdBetween(String value1, String value2) {
            addCriterion("discount_id between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotBetween(String value1, String value2) {
            addCriterion("discount_id not between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
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

        public Criteria andIsConsignIsNull() {
            addCriterion("is_consign is null");
            return (Criteria) this;
        }

        public Criteria andIsConsignIsNotNull() {
            addCriterion("is_consign is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsignEqualTo(Byte value) {
            addCriterion("is_consign =", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotEqualTo(Byte value) {
            addCriterion("is_consign <>", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignGreaterThan(Byte value) {
            addCriterion("is_consign >", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_consign >=", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignLessThan(Byte value) {
            addCriterion("is_consign <", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignLessThanOrEqualTo(Byte value) {
            addCriterion("is_consign <=", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignIn(List<Byte> values) {
            addCriterion("is_consign in", values, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotIn(List<Byte> values) {
            addCriterion("is_consign not in", values, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignBetween(Byte value1, Byte value2) {
            addCriterion("is_consign between", value1, value2, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotBetween(Byte value1, Byte value2) {
            addCriterion("is_consign not between", value1, value2, "isConsign");
            return (Criteria) this;
        }

        public Criteria andConsignNumIsNull() {
            addCriterion("consign_num is null");
            return (Criteria) this;
        }

        public Criteria andConsignNumIsNotNull() {
            addCriterion("consign_num is not null");
            return (Criteria) this;
        }

        public Criteria andConsignNumEqualTo(Integer value) {
            addCriterion("consign_num =", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumNotEqualTo(Integer value) {
            addCriterion("consign_num <>", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumGreaterThan(Integer value) {
            addCriterion("consign_num >", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("consign_num >=", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumLessThan(Integer value) {
            addCriterion("consign_num <", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumLessThanOrEqualTo(Integer value) {
            addCriterion("consign_num <=", value, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumIn(List<Integer> values) {
            addCriterion("consign_num in", values, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumNotIn(List<Integer> values) {
            addCriterion("consign_num not in", values, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumBetween(Integer value1, Integer value2) {
            addCriterion("consign_num between", value1, value2, "consignNum");
            return (Criteria) this;
        }

        public Criteria andConsignNumNotBetween(Integer value1, Integer value2) {
            addCriterion("consign_num not between", value1, value2, "consignNum");
            return (Criteria) this;
        }

        public Criteria andSendNumIsNull() {
            addCriterion("send_num is null");
            return (Criteria) this;
        }

        public Criteria andSendNumIsNotNull() {
            addCriterion("send_num is not null");
            return (Criteria) this;
        }

        public Criteria andSendNumEqualTo(Integer value) {
            addCriterion("send_num =", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotEqualTo(Integer value) {
            addCriterion("send_num <>", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumGreaterThan(Integer value) {
            addCriterion("send_num >", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_num >=", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumLessThan(Integer value) {
            addCriterion("send_num <", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumLessThanOrEqualTo(Integer value) {
            addCriterion("send_num <=", value, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumIn(List<Integer> values) {
            addCriterion("send_num in", values, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotIn(List<Integer> values) {
            addCriterion("send_num not in", values, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumBetween(Integer value1, Integer value2) {
            addCriterion("send_num between", value1, value2, "sendNum");
            return (Criteria) this;
        }

        public Criteria andSendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("send_num not between", value1, value2, "sendNum");
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

        public Criteria andIsExchangeIsNull() {
            addCriterion("is_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIsNotNull() {
            addCriterion("is_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeEqualTo(Byte value) {
            addCriterion("is_exchange =", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotEqualTo(Byte value) {
            addCriterion("is_exchange <>", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThan(Byte value) {
            addCriterion("is_exchange >", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_exchange >=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThan(Byte value) {
            addCriterion("is_exchange <", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThanOrEqualTo(Byte value) {
            addCriterion("is_exchange <=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIn(List<Byte> values) {
            addCriterion("is_exchange in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotIn(List<Byte> values) {
            addCriterion("is_exchange not in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeBetween(Byte value1, Byte value2) {
            addCriterion("is_exchange between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_exchange not between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNull() {
            addCriterion("exchange_num is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNotNull() {
            addCriterion("exchange_num is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumEqualTo(Integer value) {
            addCriterion("exchange_num =", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotEqualTo(Integer value) {
            addCriterion("exchange_num <>", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThan(Integer value) {
            addCriterion("exchange_num >", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_num >=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThan(Integer value) {
            addCriterion("exchange_num <", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_num <=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIn(List<Integer> values) {
            addCriterion("exchange_num in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotIn(List<Integer> values) {
            addCriterion("exchange_num not in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumBetween(Integer value1, Integer value2) {
            addCriterion("exchange_num between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_num not between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNull() {
            addCriterion("is_return is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNotNull() {
            addCriterion("is_return is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnEqualTo(Byte value) {
            addCriterion("is_return =", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotEqualTo(Byte value) {
            addCriterion("is_return <>", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThan(Byte value) {
            addCriterion("is_return >", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_return >=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThan(Byte value) {
            addCriterion("is_return <", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThanOrEqualTo(Byte value) {
            addCriterion("is_return <=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnIn(List<Byte> values) {
            addCriterion("is_return in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotIn(List<Byte> values) {
            addCriterion("is_return not in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnBetween(Byte value1, Byte value2) {
            addCriterion("is_return between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotBetween(Byte value1, Byte value2) {
            addCriterion("is_return not between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNull() {
            addCriterion("return_num is null");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNotNull() {
            addCriterion("return_num is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNumEqualTo(Integer value) {
            addCriterion("return_num =", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotEqualTo(Integer value) {
            addCriterion("return_num <>", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThan(Integer value) {
            addCriterion("return_num >", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_num >=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThan(Integer value) {
            addCriterion("return_num <", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThanOrEqualTo(Integer value) {
            addCriterion("return_num <=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumIn(List<Integer> values) {
            addCriterion("return_num in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotIn(List<Integer> values) {
            addCriterion("return_num not in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumBetween(Integer value1, Integer value2) {
            addCriterion("return_num between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("return_num not between", value1, value2, "returnNum");
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

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNull() {
            addCriterion("goods_spec is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIsNotNull() {
            addCriterion("goods_spec is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecEqualTo(String value) {
            addCriterion("goods_spec =", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotEqualTo(String value) {
            addCriterion("goods_spec <>", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThan(String value) {
            addCriterion("goods_spec >", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec >=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThan(String value) {
            addCriterion("goods_spec <", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLessThanOrEqualTo(String value) {
            addCriterion("goods_spec <=", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecLike(String value) {
            addCriterion("goods_spec like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotLike(String value) {
            addCriterion("goods_spec not like", value, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIn(List<String> values) {
            addCriterion("goods_spec in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotIn(List<String> values) {
            addCriterion("goods_spec not in", values, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecBetween(String value1, String value2) {
            addCriterion("goods_spec between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecNotBetween(String value1, String value2) {
            addCriterion("goods_spec not between", value1, value2, "goodsSpec");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralIsNull() {
            addCriterion("obtain_integral is null");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralIsNotNull() {
            addCriterion("obtain_integral is not null");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralEqualTo(Integer value) {
            addCriterion("obtain_integral =", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralNotEqualTo(Integer value) {
            addCriterion("obtain_integral <>", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralGreaterThan(Integer value) {
            addCriterion("obtain_integral >", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("obtain_integral >=", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralLessThan(Integer value) {
            addCriterion("obtain_integral <", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("obtain_integral <=", value, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralIn(List<Integer> values) {
            addCriterion("obtain_integral in", values, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralNotIn(List<Integer> values) {
            addCriterion("obtain_integral not in", values, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralBetween(Integer value1, Integer value2) {
            addCriterion("obtain_integral between", value1, value2, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andObtainIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("obtain_integral not between", value1, value2, "obtainIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNull() {
            addCriterion("total_discount is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNotNull() {
            addCriterion("total_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountEqualTo(BigDecimal value) {
            addCriterion("total_discount =", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotEqualTo(BigDecimal value) {
            addCriterion("total_discount <>", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThan(BigDecimal value) {
            addCriterion("total_discount >", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_discount >=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThan(BigDecimal value) {
            addCriterion("total_discount <", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_discount <=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIn(List<BigDecimal> values) {
            addCriterion("total_discount in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotIn(List<BigDecimal> values) {
            addCriterion("total_discount not in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_discount between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_discount not between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andSubTicketsIsNull() {
            addCriterion("sub_tickets is null");
            return (Criteria) this;
        }

        public Criteria andSubTicketsIsNotNull() {
            addCriterion("sub_tickets is not null");
            return (Criteria) this;
        }

        public Criteria andSubTicketsEqualTo(String value) {
            addCriterion("sub_tickets =", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsNotEqualTo(String value) {
            addCriterion("sub_tickets <>", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsGreaterThan(String value) {
            addCriterion("sub_tickets >", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsGreaterThanOrEqualTo(String value) {
            addCriterion("sub_tickets >=", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsLessThan(String value) {
            addCriterion("sub_tickets <", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsLessThanOrEqualTo(String value) {
            addCriterion("sub_tickets <=", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsLike(String value) {
            addCriterion("sub_tickets like", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsNotLike(String value) {
            addCriterion("sub_tickets not like", value, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsIn(List<String> values) {
            addCriterion("sub_tickets in", values, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsNotIn(List<String> values) {
            addCriterion("sub_tickets not in", values, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsBetween(String value1, String value2) {
            addCriterion("sub_tickets between", value1, value2, "subTickets");
            return (Criteria) this;
        }

        public Criteria andSubTicketsNotBetween(String value1, String value2) {
            addCriterion("sub_tickets not between", value1, value2, "subTickets");
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