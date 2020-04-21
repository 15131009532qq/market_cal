package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderGoodsPurchasePayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsPurchasePayExample() {
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

        public Criteria andPaymentShopIdIsNull() {
            addCriterion("payment_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdIsNotNull() {
            addCriterion("payment_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdEqualTo(String value) {
            addCriterion("payment_shop_id =", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdNotEqualTo(String value) {
            addCriterion("payment_shop_id <>", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdGreaterThan(String value) {
            addCriterion("payment_shop_id >", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_shop_id >=", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdLessThan(String value) {
            addCriterion("payment_shop_id <", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdLessThanOrEqualTo(String value) {
            addCriterion("payment_shop_id <=", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdLike(String value) {
            addCriterion("payment_shop_id like", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdNotLike(String value) {
            addCriterion("payment_shop_id not like", value, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdIn(List<String> values) {
            addCriterion("payment_shop_id in", values, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdNotIn(List<String> values) {
            addCriterion("payment_shop_id not in", values, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdBetween(String value1, String value2) {
            addCriterion("payment_shop_id between", value1, value2, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andPaymentShopIdNotBetween(String value1, String value2) {
            addCriterion("payment_shop_id not between", value1, value2, "paymentShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdIsNull() {
            addCriterion("receive_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdIsNotNull() {
            addCriterion("receive_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdEqualTo(String value) {
            addCriterion("receive_shop_id =", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdNotEqualTo(String value) {
            addCriterion("receive_shop_id <>", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdGreaterThan(String value) {
            addCriterion("receive_shop_id >", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("receive_shop_id >=", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdLessThan(String value) {
            addCriterion("receive_shop_id <", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdLessThanOrEqualTo(String value) {
            addCriterion("receive_shop_id <=", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdLike(String value) {
            addCriterion("receive_shop_id like", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdNotLike(String value) {
            addCriterion("receive_shop_id not like", value, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdIn(List<String> values) {
            addCriterion("receive_shop_id in", values, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdNotIn(List<String> values) {
            addCriterion("receive_shop_id not in", values, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdBetween(String value1, String value2) {
            addCriterion("receive_shop_id between", value1, value2, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andReceiveShopIdNotBetween(String value1, String value2) {
            addCriterion("receive_shop_id not between", value1, value2, "receiveShopId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
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

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

        public Criteria andRetFlowIdIsNull() {
            addCriterion("ret_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdIsNotNull() {
            addCriterion("ret_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdEqualTo(String value) {
            addCriterion("ret_flow_id =", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdNotEqualTo(String value) {
            addCriterion("ret_flow_id <>", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdGreaterThan(String value) {
            addCriterion("ret_flow_id >", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("ret_flow_id >=", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdLessThan(String value) {
            addCriterion("ret_flow_id <", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdLessThanOrEqualTo(String value) {
            addCriterion("ret_flow_id <=", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdLike(String value) {
            addCriterion("ret_flow_id like", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdNotLike(String value) {
            addCriterion("ret_flow_id not like", value, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdIn(List<String> values) {
            addCriterion("ret_flow_id in", values, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdNotIn(List<String> values) {
            addCriterion("ret_flow_id not in", values, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdBetween(String value1, String value2) {
            addCriterion("ret_flow_id between", value1, value2, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andRetFlowIdNotBetween(String value1, String value2) {
            addCriterion("ret_flow_id not between", value1, value2, "retFlowId");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("return_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("return_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("return_code =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("return_code <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("return_code >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("return_code >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("return_code <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("return_code <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("return_code like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("return_code not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("return_code in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("return_code not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("return_code between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("return_code not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNull() {
            addCriterion("time_end is null");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNotNull() {
            addCriterion("time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEndEqualTo(String value) {
            addCriterion("time_end =", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotEqualTo(String value) {
            addCriterion("time_end <>", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThan(String value) {
            addCriterion("time_end >", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("time_end >=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThan(String value) {
            addCriterion("time_end <", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThanOrEqualTo(String value) {
            addCriterion("time_end <=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLike(String value) {
            addCriterion("time_end like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotLike(String value) {
            addCriterion("time_end not like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndIn(List<String> values) {
            addCriterion("time_end in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotIn(List<String> values) {
            addCriterion("time_end not in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndBetween(String value1, String value2) {
            addCriterion("time_end between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotBetween(String value1, String value2) {
            addCriterion("time_end not between", value1, value2, "timeEnd");
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

        public Criteria andSysPayCnlIsNull() {
            addCriterion("sys_pay_cnl is null");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlIsNotNull() {
            addCriterion("sys_pay_cnl is not null");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlEqualTo(Integer value) {
            addCriterion("sys_pay_cnl =", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlNotEqualTo(Integer value) {
            addCriterion("sys_pay_cnl <>", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlGreaterThan(Integer value) {
            addCriterion("sys_pay_cnl >", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_pay_cnl >=", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlLessThan(Integer value) {
            addCriterion("sys_pay_cnl <", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlLessThanOrEqualTo(Integer value) {
            addCriterion("sys_pay_cnl <=", value, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlIn(List<Integer> values) {
            addCriterion("sys_pay_cnl in", values, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlNotIn(List<Integer> values) {
            addCriterion("sys_pay_cnl not in", values, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlBetween(Integer value1, Integer value2) {
            addCriterion("sys_pay_cnl between", value1, value2, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andSysPayCnlNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_pay_cnl not between", value1, value2, "sysPayCnl");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNull() {
            addCriterion("biz_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNotNull() {
            addCriterion("biz_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoEqualTo(String value) {
            addCriterion("biz_order_no =", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotEqualTo(String value) {
            addCriterion("biz_order_no <>", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThan(String value) {
            addCriterion("biz_order_no >", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_order_no >=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThan(String value) {
            addCriterion("biz_order_no <", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThanOrEqualTo(String value) {
            addCriterion("biz_order_no <=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLike(String value) {
            addCriterion("biz_order_no like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotLike(String value) {
            addCriterion("biz_order_no not like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIn(List<String> values) {
            addCriterion("biz_order_no in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotIn(List<String> values) {
            addCriterion("biz_order_no not in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoBetween(String value1, String value2) {
            addCriterion("biz_order_no between", value1, value2, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotBetween(String value1, String value2) {
            addCriterion("biz_order_no not between", value1, value2, "bizOrderNo");
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