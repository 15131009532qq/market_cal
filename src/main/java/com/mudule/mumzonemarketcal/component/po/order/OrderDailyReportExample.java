package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderDailyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDailyReportExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterionForJDBCDate("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterionForJDBCDate("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterionForJDBCDate("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andDailyAmountIsNull() {
            addCriterion("daily_amount is null");
            return (Criteria) this;
        }

        public Criteria andDailyAmountIsNotNull() {
            addCriterion("daily_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDailyAmountEqualTo(BigDecimal value) {
            addCriterion("daily_amount =", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountNotEqualTo(BigDecimal value) {
            addCriterion("daily_amount <>", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountGreaterThan(BigDecimal value) {
            addCriterion("daily_amount >", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_amount >=", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountLessThan(BigDecimal value) {
            addCriterion("daily_amount <", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_amount <=", value, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountIn(List<BigDecimal> values) {
            addCriterion("daily_amount in", values, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountNotIn(List<BigDecimal> values) {
            addCriterion("daily_amount not in", values, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_amount between", value1, value2, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_amount not between", value1, value2, "dailyAmount");
            return (Criteria) this;
        }

        public Criteria andDailyCountIsNull() {
            addCriterion("daily_count is null");
            return (Criteria) this;
        }

        public Criteria andDailyCountIsNotNull() {
            addCriterion("daily_count is not null");
            return (Criteria) this;
        }

        public Criteria andDailyCountEqualTo(Integer value) {
            addCriterion("daily_count =", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountNotEqualTo(Integer value) {
            addCriterion("daily_count <>", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountGreaterThan(Integer value) {
            addCriterion("daily_count >", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_count >=", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountLessThan(Integer value) {
            addCriterion("daily_count <", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountLessThanOrEqualTo(Integer value) {
            addCriterion("daily_count <=", value, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountIn(List<Integer> values) {
            addCriterion("daily_count in", values, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountNotIn(List<Integer> values) {
            addCriterion("daily_count not in", values, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountBetween(Integer value1, Integer value2) {
            addCriterion("daily_count between", value1, value2, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andDailyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_count not between", value1, value2, "dailyCount");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIsNull() {
            addCriterion("average_price is null");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIsNotNull() {
            addCriterion("average_price is not null");
            return (Criteria) this;
        }

        public Criteria andAveragePriceEqualTo(BigDecimal value) {
            addCriterion("average_price =", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotEqualTo(BigDecimal value) {
            addCriterion("average_price <>", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceGreaterThan(BigDecimal value) {
            addCriterion("average_price >", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price >=", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceLessThan(BigDecimal value) {
            addCriterion("average_price <", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price <=", value, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceIn(List<BigDecimal> values) {
            addCriterion("average_price in", values, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotIn(List<BigDecimal> values) {
            addCriterion("average_price not in", values, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price between", value1, value2, "averagePrice");
            return (Criteria) this;
        }

        public Criteria andAveragePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price not between", value1, value2, "averagePrice");
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

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumIsNull() {
            addCriterion("negotiation_num is null");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumIsNotNull() {
            addCriterion("negotiation_num is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumEqualTo(Integer value) {
            addCriterion("negotiation_num =", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumNotEqualTo(Integer value) {
            addCriterion("negotiation_num <>", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumGreaterThan(Integer value) {
            addCriterion("negotiation_num >", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("negotiation_num >=", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumLessThan(Integer value) {
            addCriterion("negotiation_num <", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumLessThanOrEqualTo(Integer value) {
            addCriterion("negotiation_num <=", value, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumIn(List<Integer> values) {
            addCriterion("negotiation_num in", values, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumNotIn(List<Integer> values) {
            addCriterion("negotiation_num not in", values, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumBetween(Integer value1, Integer value2) {
            addCriterion("negotiation_num between", value1, value2, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("negotiation_num not between", value1, value2, "negotiationNum");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountIsNull() {
            addCriterion("negotiation_amount is null");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountIsNotNull() {
            addCriterion("negotiation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountEqualTo(BigDecimal value) {
            addCriterion("negotiation_amount =", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountNotEqualTo(BigDecimal value) {
            addCriterion("negotiation_amount <>", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountGreaterThan(BigDecimal value) {
            addCriterion("negotiation_amount >", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("negotiation_amount >=", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountLessThan(BigDecimal value) {
            addCriterion("negotiation_amount <", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("negotiation_amount <=", value, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountIn(List<BigDecimal> values) {
            addCriterion("negotiation_amount in", values, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountNotIn(List<BigDecimal> values) {
            addCriterion("negotiation_amount not in", values, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("negotiation_amount between", value1, value2, "negotiationAmount");
            return (Criteria) this;
        }

        public Criteria andNegotiationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("negotiation_amount not between", value1, value2, "negotiationAmount");
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

        public Criteria andLooseNumIsNull() {
            addCriterion("loose_num is null");
            return (Criteria) this;
        }

        public Criteria andLooseNumIsNotNull() {
            addCriterion("loose_num is not null");
            return (Criteria) this;
        }

        public Criteria andLooseNumEqualTo(Integer value) {
            addCriterion("loose_num =", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumNotEqualTo(Integer value) {
            addCriterion("loose_num <>", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumGreaterThan(Integer value) {
            addCriterion("loose_num >", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("loose_num >=", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumLessThan(Integer value) {
            addCriterion("loose_num <", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumLessThanOrEqualTo(Integer value) {
            addCriterion("loose_num <=", value, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumIn(List<Integer> values) {
            addCriterion("loose_num in", values, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumNotIn(List<Integer> values) {
            addCriterion("loose_num not in", values, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumBetween(Integer value1, Integer value2) {
            addCriterion("loose_num between", value1, value2, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("loose_num not between", value1, value2, "looseNum");
            return (Criteria) this;
        }

        public Criteria andLooseAmountIsNull() {
            addCriterion("loose_amount is null");
            return (Criteria) this;
        }

        public Criteria andLooseAmountIsNotNull() {
            addCriterion("loose_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLooseAmountEqualTo(BigDecimal value) {
            addCriterion("loose_amount =", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountNotEqualTo(BigDecimal value) {
            addCriterion("loose_amount <>", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountGreaterThan(BigDecimal value) {
            addCriterion("loose_amount >", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loose_amount >=", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountLessThan(BigDecimal value) {
            addCriterion("loose_amount <", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loose_amount <=", value, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountIn(List<BigDecimal> values) {
            addCriterion("loose_amount in", values, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountNotIn(List<BigDecimal> values) {
            addCriterion("loose_amount not in", values, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loose_amount between", value1, value2, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andLooseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loose_amount not between", value1, value2, "looseAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIsNull() {
            addCriterion("Integral_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIsNotNull() {
            addCriterion("Integral_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountEqualTo(BigDecimal value) {
            addCriterion("Integral_amount =", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotEqualTo(BigDecimal value) {
            addCriterion("Integral_amount <>", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountGreaterThan(BigDecimal value) {
            addCriterion("Integral_amount >", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Integral_amount >=", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountLessThan(BigDecimal value) {
            addCriterion("Integral_amount <", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Integral_amount <=", value, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountIn(List<BigDecimal> values) {
            addCriterion("Integral_amount in", values, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotIn(List<BigDecimal> values) {
            addCriterion("Integral_amount not in", values, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Integral_amount between", value1, value2, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andIntegralAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Integral_amount not between", value1, value2, "integralAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountIsNull() {
            addCriterion("received_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountIsNotNull() {
            addCriterion("received_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountEqualTo(BigDecimal value) {
            addCriterion("received_amount =", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountNotEqualTo(BigDecimal value) {
            addCriterion("received_amount <>", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountGreaterThan(BigDecimal value) {
            addCriterion("received_amount >", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("received_amount >=", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountLessThan(BigDecimal value) {
            addCriterion("received_amount <", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("received_amount <=", value, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountIn(List<BigDecimal> values) {
            addCriterion("received_amount in", values, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountNotIn(List<BigDecimal> values) {
            addCriterion("received_amount not in", values, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("received_amount between", value1, value2, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andReceivedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("received_amount not between", value1, value2, "receivedAmount");
            return (Criteria) this;
        }

        public Criteria andCardRechargeIsNull() {
            addCriterion("card_recharge is null");
            return (Criteria) this;
        }

        public Criteria andCardRechargeIsNotNull() {
            addCriterion("card_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andCardRechargeEqualTo(BigDecimal value) {
            addCriterion("card_recharge =", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeNotEqualTo(BigDecimal value) {
            addCriterion("card_recharge <>", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeGreaterThan(BigDecimal value) {
            addCriterion("card_recharge >", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("card_recharge >=", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeLessThan(BigDecimal value) {
            addCriterion("card_recharge <", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("card_recharge <=", value, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeIn(List<BigDecimal> values) {
            addCriterion("card_recharge in", values, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeNotIn(List<BigDecimal> values) {
            addCriterion("card_recharge not in", values, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_recharge between", value1, value2, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andCardRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_recharge not between", value1, value2, "cardRecharge");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(BigDecimal value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
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

        public Criteria andCashNumIsNull() {
            addCriterion("cash_num is null");
            return (Criteria) this;
        }

        public Criteria andCashNumIsNotNull() {
            addCriterion("cash_num is not null");
            return (Criteria) this;
        }

        public Criteria andCashNumEqualTo(Integer value) {
            addCriterion("cash_num =", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotEqualTo(Integer value) {
            addCriterion("cash_num <>", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumGreaterThan(Integer value) {
            addCriterion("cash_num >", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_num >=", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumLessThan(Integer value) {
            addCriterion("cash_num <", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumLessThanOrEqualTo(Integer value) {
            addCriterion("cash_num <=", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumIn(List<Integer> values) {
            addCriterion("cash_num in", values, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotIn(List<Integer> values) {
            addCriterion("cash_num not in", values, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumBetween(Integer value1, Integer value2) {
            addCriterion("cash_num between", value1, value2, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_num not between", value1, value2, "cashNum");
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

        public Criteria andBankcardNumIsNull() {
            addCriterion("bankcard_num is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumIsNotNull() {
            addCriterion("bankcard_num is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumEqualTo(Integer value) {
            addCriterion("bankcard_num =", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotEqualTo(Integer value) {
            addCriterion("bankcard_num <>", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumGreaterThan(Integer value) {
            addCriterion("bankcard_num >", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankcard_num >=", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumLessThan(Integer value) {
            addCriterion("bankcard_num <", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumLessThanOrEqualTo(Integer value) {
            addCriterion("bankcard_num <=", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumIn(List<Integer> values) {
            addCriterion("bankcard_num in", values, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotIn(List<Integer> values) {
            addCriterion("bankcard_num not in", values, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumBetween(Integer value1, Integer value2) {
            addCriterion("bankcard_num between", value1, value2, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bankcard_num not between", value1, value2, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountIsNull() {
            addCriterion("bankcard_amount is null");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountIsNotNull() {
            addCriterion("bankcard_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountEqualTo(BigDecimal value) {
            addCriterion("bankcard_amount =", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountNotEqualTo(BigDecimal value) {
            addCriterion("bankcard_amount <>", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountGreaterThan(BigDecimal value) {
            addCriterion("bankcard_amount >", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bankcard_amount >=", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountLessThan(BigDecimal value) {
            addCriterion("bankcard_amount <", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bankcard_amount <=", value, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountIn(List<BigDecimal> values) {
            addCriterion("bankcard_amount in", values, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountNotIn(List<BigDecimal> values) {
            addCriterion("bankcard_amount not in", values, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bankcard_amount between", value1, value2, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andBankcardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bankcard_amount not between", value1, value2, "bankcardAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNull() {
            addCriterion("alipay_num is null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNotNull() {
            addCriterion("alipay_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumEqualTo(Integer value) {
            addCriterion("alipay_num =", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotEqualTo(Integer value) {
            addCriterion("alipay_num <>", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThan(Integer value) {
            addCriterion("alipay_num >", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipay_num >=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThan(Integer value) {
            addCriterion("alipay_num <", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThanOrEqualTo(Integer value) {
            addCriterion("alipay_num <=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIn(List<Integer> values) {
            addCriterion("alipay_num in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotIn(List<Integer> values) {
            addCriterion("alipay_num not in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumBetween(Integer value1, Integer value2) {
            addCriterion("alipay_num between", value1, value2, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("alipay_num not between", value1, value2, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountIsNull() {
            addCriterion("alipay_amount is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountIsNotNull() {
            addCriterion("alipay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountEqualTo(BigDecimal value) {
            addCriterion("alipay_amount =", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountNotEqualTo(BigDecimal value) {
            addCriterion("alipay_amount <>", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountGreaterThan(BigDecimal value) {
            addCriterion("alipay_amount >", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("alipay_amount >=", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountLessThan(BigDecimal value) {
            addCriterion("alipay_amount <", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("alipay_amount <=", value, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountIn(List<BigDecimal> values) {
            addCriterion("alipay_amount in", values, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountNotIn(List<BigDecimal> values) {
            addCriterion("alipay_amount not in", values, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alipay_amount between", value1, value2, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andAlipayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alipay_amount not between", value1, value2, "alipayAmount");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNull() {
            addCriterion("wechat_num is null");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNotNull() {
            addCriterion("wechat_num is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNumEqualTo(Integer value) {
            addCriterion("wechat_num =", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotEqualTo(Integer value) {
            addCriterion("wechat_num <>", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThan(Integer value) {
            addCriterion("wechat_num >", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_num >=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThan(Integer value) {
            addCriterion("wechat_num <", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_num <=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumIn(List<Integer> values) {
            addCriterion("wechat_num in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotIn(List<Integer> values) {
            addCriterion("wechat_num not in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumBetween(Integer value1, Integer value2) {
            addCriterion("wechat_num between", value1, value2, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_num not between", value1, value2, "wechatNum");
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

        public Criteria andTimesNumIsNull() {
            addCriterion("times_num is null");
            return (Criteria) this;
        }

        public Criteria andTimesNumIsNotNull() {
            addCriterion("times_num is not null");
            return (Criteria) this;
        }

        public Criteria andTimesNumEqualTo(Integer value) {
            addCriterion("times_num =", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotEqualTo(Integer value) {
            addCriterion("times_num <>", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumGreaterThan(Integer value) {
            addCriterion("times_num >", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("times_num >=", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumLessThan(Integer value) {
            addCriterion("times_num <", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumLessThanOrEqualTo(Integer value) {
            addCriterion("times_num <=", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumIn(List<Integer> values) {
            addCriterion("times_num in", values, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotIn(List<Integer> values) {
            addCriterion("times_num not in", values, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumBetween(Integer value1, Integer value2) {
            addCriterion("times_num between", value1, value2, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("times_num not between", value1, value2, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesAmountIsNull() {
            addCriterion("times_amount is null");
            return (Criteria) this;
        }

        public Criteria andTimesAmountIsNotNull() {
            addCriterion("times_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTimesAmountEqualTo(BigDecimal value) {
            addCriterion("times_amount =", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountNotEqualTo(BigDecimal value) {
            addCriterion("times_amount <>", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountGreaterThan(BigDecimal value) {
            addCriterion("times_amount >", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("times_amount >=", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountLessThan(BigDecimal value) {
            addCriterion("times_amount <", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("times_amount <=", value, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountIn(List<BigDecimal> values) {
            addCriterion("times_amount in", values, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountNotIn(List<BigDecimal> values) {
            addCriterion("times_amount not in", values, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("times_amount between", value1, value2, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTimesAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("times_amount not between", value1, value2, "timesAmount");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
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

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(BigDecimal value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("return_amount >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(BigDecimal value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<BigDecimal> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andChangeNumIsNull() {
            addCriterion("change_num is null");
            return (Criteria) this;
        }

        public Criteria andChangeNumIsNotNull() {
            addCriterion("change_num is not null");
            return (Criteria) this;
        }

        public Criteria andChangeNumEqualTo(Integer value) {
            addCriterion("change_num =", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotEqualTo(Integer value) {
            addCriterion("change_num <>", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThan(Integer value) {
            addCriterion("change_num >", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_num >=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThan(Integer value) {
            addCriterion("change_num <", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("change_num <=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumIn(List<Integer> values) {
            addCriterion("change_num in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotIn(List<Integer> values) {
            addCriterion("change_num not in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumBetween(Integer value1, Integer value2) {
            addCriterion("change_num between", value1, value2, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("change_num not between", value1, value2, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNull() {
            addCriterion("change_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNotNull() {
            addCriterion("change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountEqualTo(BigDecimal value) {
            addCriterion("change_amount =", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotEqualTo(BigDecimal value) {
            addCriterion("change_amount <>", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThan(BigDecimal value) {
            addCriterion("change_amount >", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_amount >=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThan(BigDecimal value) {
            addCriterion("change_amount <", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_amount <=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIn(List<BigDecimal> values) {
            addCriterion("change_amount in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotIn(List<BigDecimal> values) {
            addCriterion("change_amount not in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_amount between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_amount not between", value1, value2, "changeAmount");
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