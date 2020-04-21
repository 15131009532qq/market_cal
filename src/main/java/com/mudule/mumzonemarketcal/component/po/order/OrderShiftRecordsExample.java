package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderShiftRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderShiftRecordsExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountIsNull() {
            addCriterion("receivable_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountIsNotNull() {
            addCriterion("receivable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountEqualTo(BigDecimal value) {
            addCriterion("receivable_amount =", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountNotEqualTo(BigDecimal value) {
            addCriterion("receivable_amount <>", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountGreaterThan(BigDecimal value) {
            addCriterion("receivable_amount >", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_amount >=", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountLessThan(BigDecimal value) {
            addCriterion("receivable_amount <", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_amount <=", value, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountIn(List<BigDecimal> values) {
            addCriterion("receivable_amount in", values, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountNotIn(List<BigDecimal> values) {
            addCriterion("receivable_amount not in", values, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_amount between", value1, value2, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andReceivableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_amount not between", value1, value2, "receivableAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNull() {
            addCriterion("actual_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualAmountIsNotNull() {
            addCriterion("actual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualAmountEqualTo(BigDecimal value) {
            addCriterion("actual_amount =", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotEqualTo(BigDecimal value) {
            addCriterion("actual_amount <>", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThan(BigDecimal value) {
            addCriterion("actual_amount >", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount >=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThan(BigDecimal value) {
            addCriterion("actual_amount <", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_amount <=", value, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountIn(List<BigDecimal> values) {
            addCriterion("actual_amount in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotIn(List<BigDecimal> values) {
            addCriterion("actual_amount not in", values, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andActualAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_amount not between", value1, value2, "actualAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountIsNull() {
            addCriterion("quotation_amount is null");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountIsNotNull() {
            addCriterion("quotation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountEqualTo(BigDecimal value) {
            addCriterion("quotation_amount =", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountNotEqualTo(BigDecimal value) {
            addCriterion("quotation_amount <>", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountGreaterThan(BigDecimal value) {
            addCriterion("quotation_amount >", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quotation_amount >=", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountLessThan(BigDecimal value) {
            addCriterion("quotation_amount <", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quotation_amount <=", value, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountIn(List<BigDecimal> values) {
            addCriterion("quotation_amount in", values, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountNotIn(List<BigDecimal> values) {
            addCriterion("quotation_amount not in", values, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotation_amount between", value1, value2, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andQuotationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotation_amount not between", value1, value2, "quotationAmount");
            return (Criteria) this;
        }

        public Criteria andOverAndShortIsNull() {
            addCriterion("over_and_short is null");
            return (Criteria) this;
        }

        public Criteria andOverAndShortIsNotNull() {
            addCriterion("over_and_short is not null");
            return (Criteria) this;
        }

        public Criteria andOverAndShortEqualTo(BigDecimal value) {
            addCriterion("over_and_short =", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortNotEqualTo(BigDecimal value) {
            addCriterion("over_and_short <>", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortGreaterThan(BigDecimal value) {
            addCriterion("over_and_short >", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("over_and_short >=", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortLessThan(BigDecimal value) {
            addCriterion("over_and_short <", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("over_and_short <=", value, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortIn(List<BigDecimal> values) {
            addCriterion("over_and_short in", values, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortNotIn(List<BigDecimal> values) {
            addCriterion("over_and_short not in", values, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("over_and_short between", value1, value2, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andOverAndShortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("over_and_short not between", value1, value2, "overAndShort");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNull() {
            addCriterion("cash_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNotNull() {
            addCriterion("cash_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmountEqualTo(BigDecimal value) {
            addCriterion("cash_amount =", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotEqualTo(BigDecimal value) {
            addCriterion("cash_amount <>", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThan(BigDecimal value) {
            addCriterion("cash_amount >", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_amount >=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThan(BigDecimal value) {
            addCriterion("cash_amount <", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_amount <=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIn(List<BigDecimal> values) {
            addCriterion("cash_amount in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotIn(List<BigDecimal> values) {
            addCriterion("cash_amount not in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_amount between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_amount not between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountIsNull() {
            addCriterion("card_amount is null");
            return (Criteria) this;
        }

        public Criteria andCardAmountIsNotNull() {
            addCriterion("card_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCardAmountEqualTo(BigDecimal value) {
            addCriterion("card_amount =", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountNotEqualTo(BigDecimal value) {
            addCriterion("card_amount <>", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountGreaterThan(BigDecimal value) {
            addCriterion("card_amount >", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("card_amount >=", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountLessThan(BigDecimal value) {
            addCriterion("card_amount <", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("card_amount <=", value, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountIn(List<BigDecimal> values) {
            addCriterion("card_amount in", values, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountNotIn(List<BigDecimal> values) {
            addCriterion("card_amount not in", values, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_amount between", value1, value2, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andCardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_amount not between", value1, value2, "cardAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountIsNull() {
            addCriterion("wechat_amount is null");
            return (Criteria) this;
        }

        public Criteria andWechatAmountIsNotNull() {
            addCriterion("wechat_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWechatAmountEqualTo(BigDecimal value) {
            addCriterion("wechat_amount =", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountNotEqualTo(BigDecimal value) {
            addCriterion("wechat_amount <>", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountGreaterThan(BigDecimal value) {
            addCriterion("wechat_amount >", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_amount >=", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountLessThan(BigDecimal value) {
            addCriterion("wechat_amount <", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wechat_amount <=", value, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountIn(List<BigDecimal> values) {
            addCriterion("wechat_amount in", values, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountNotIn(List<BigDecimal> values) {
            addCriterion("wechat_amount not in", values, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_amount between", value1, value2, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andWechatAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wechat_amount not between", value1, value2, "wechatAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountIsNull() {
            addCriterion("ali_amount is null");
            return (Criteria) this;
        }

        public Criteria andAliAmountIsNotNull() {
            addCriterion("ali_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAliAmountEqualTo(BigDecimal value) {
            addCriterion("ali_amount =", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountNotEqualTo(BigDecimal value) {
            addCriterion("ali_amount <>", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountGreaterThan(BigDecimal value) {
            addCriterion("ali_amount >", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ali_amount >=", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountLessThan(BigDecimal value) {
            addCriterion("ali_amount <", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ali_amount <=", value, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountIn(List<BigDecimal> values) {
            addCriterion("ali_amount in", values, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountNotIn(List<BigDecimal> values) {
            addCriterion("ali_amount not in", values, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ali_amount between", value1, value2, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andAliAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ali_amount not between", value1, value2, "aliAmount");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andCashFirmIsNull() {
            addCriterion("cash_firm is null");
            return (Criteria) this;
        }

        public Criteria andCashFirmIsNotNull() {
            addCriterion("cash_firm is not null");
            return (Criteria) this;
        }

        public Criteria andCashFirmEqualTo(BigDecimal value) {
            addCriterion("cash_firm =", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmNotEqualTo(BigDecimal value) {
            addCriterion("cash_firm <>", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmGreaterThan(BigDecimal value) {
            addCriterion("cash_firm >", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_firm >=", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmLessThan(BigDecimal value) {
            addCriterion("cash_firm <", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_firm <=", value, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmIn(List<BigDecimal> values) {
            addCriterion("cash_firm in", values, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmNotIn(List<BigDecimal> values) {
            addCriterion("cash_firm not in", values, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_firm between", value1, value2, "cashFirm");
            return (Criteria) this;
        }

        public Criteria andCashFirmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_firm not between", value1, value2, "cashFirm");
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountIsNull() {
            addCriterion("time_card_amount is null");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountIsNotNull() {
            addCriterion("time_card_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountEqualTo(BigDecimal value) {
            addCriterion("time_card_amount =", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountNotEqualTo(BigDecimal value) {
            addCriterion("time_card_amount <>", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountGreaterThan(BigDecimal value) {
            addCriterion("time_card_amount >", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_card_amount >=", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountLessThan(BigDecimal value) {
            addCriterion("time_card_amount <", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_card_amount <=", value, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountIn(List<BigDecimal> values) {
            addCriterion("time_card_amount in", values, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountNotIn(List<BigDecimal> values) {
            addCriterion("time_card_amount not in", values, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_card_amount between", value1, value2, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andTimeCardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_card_amount not between", value1, value2, "timeCardAmount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIsNull() {
            addCriterion("member_account is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIsNotNull() {
            addCriterion("member_account is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountEqualTo(BigDecimal value) {
            addCriterion("member_account =", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotEqualTo(BigDecimal value) {
            addCriterion("member_account <>", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountGreaterThan(BigDecimal value) {
            addCriterion("member_account >", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_account >=", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountLessThan(BigDecimal value) {
            addCriterion("member_account <", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_account <=", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIn(List<BigDecimal> values) {
            addCriterion("member_account in", values, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotIn(List<BigDecimal> values) {
            addCriterion("member_account not in", values, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_account between", value1, value2, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_account not between", value1, value2, "memberAccount");
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