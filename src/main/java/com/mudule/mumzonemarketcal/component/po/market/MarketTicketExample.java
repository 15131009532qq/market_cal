package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MarketTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketTicketExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNull() {
            addCriterion("ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNotNull() {
            addCriterion("ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNameEqualTo(String value) {
            addCriterion("ticket_name =", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotEqualTo(String value) {
            addCriterion("ticket_name <>", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThan(String value) {
            addCriterion("ticket_name >", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_name >=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThan(String value) {
            addCriterion("ticket_name <", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_name <=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLike(String value) {
            addCriterion("ticket_name like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotLike(String value) {
            addCriterion("ticket_name not like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameIn(List<String> values) {
            addCriterion("ticket_name in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotIn(List<String> values) {
            addCriterion("ticket_name not in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameBetween(String value1, String value2) {
            addCriterion("ticket_name between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotBetween(String value1, String value2) {
            addCriterion("ticket_name not between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameIsNull() {
            addCriterion("ticket_sub_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameIsNotNull() {
            addCriterion("ticket_sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameEqualTo(String value) {
            addCriterion("ticket_sub_name =", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameNotEqualTo(String value) {
            addCriterion("ticket_sub_name <>", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameGreaterThan(String value) {
            addCriterion("ticket_sub_name >", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_sub_name >=", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameLessThan(String value) {
            addCriterion("ticket_sub_name <", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_sub_name <=", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameLike(String value) {
            addCriterion("ticket_sub_name like", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameNotLike(String value) {
            addCriterion("ticket_sub_name not like", value, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameIn(List<String> values) {
            addCriterion("ticket_sub_name in", values, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameNotIn(List<String> values) {
            addCriterion("ticket_sub_name not in", values, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameBetween(String value1, String value2) {
            addCriterion("ticket_sub_name between", value1, value2, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketSubNameNotBetween(String value1, String value2) {
            addCriterion("ticket_sub_name not between", value1, value2, "ticketSubName");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticket_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticket_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(Byte value) {
            addCriterion("ticket_type =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(Byte value) {
            addCriterion("ticket_type <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(Byte value) {
            addCriterion("ticket_type >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ticket_type >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(Byte value) {
            addCriterion("ticket_type <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ticket_type <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<Byte> values) {
            addCriterion("ticket_type in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<Byte> values) {
            addCriterion("ticket_type not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(Byte value1, Byte value2) {
            addCriterion("ticket_type between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ticket_type not between", value1, value2, "ticketType");
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

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Byte value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Byte value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Byte value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Byte value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Byte value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Byte> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Byte> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Byte value1, Byte value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(BigDecimal value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(BigDecimal value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<BigDecimal> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitCountIsNull() {
            addCriterion("limit_count is null");
            return (Criteria) this;
        }

        public Criteria andLimitCountIsNotNull() {
            addCriterion("limit_count is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCountEqualTo(Integer value) {
            addCriterion("limit_count =", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotEqualTo(Integer value) {
            addCriterion("limit_count <>", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountGreaterThan(Integer value) {
            addCriterion("limit_count >", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_count >=", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountLessThan(Integer value) {
            addCriterion("limit_count <", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountLessThanOrEqualTo(Integer value) {
            addCriterion("limit_count <=", value, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountIn(List<Integer> values) {
            addCriterion("limit_count in", values, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotIn(List<Integer> values) {
            addCriterion("limit_count not in", values, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountBetween(Integer value1, Integer value2) {
            addCriterion("limit_count between", value1, value2, "limitCount");
            return (Criteria) this;
        }

        public Criteria andLimitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_count not between", value1, value2, "limitCount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountIsNull() {
            addCriterion("ticket_discount is null");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountIsNotNull() {
            addCriterion("ticket_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountEqualTo(BigDecimal value) {
            addCriterion("ticket_discount =", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountNotEqualTo(BigDecimal value) {
            addCriterion("ticket_discount <>", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountGreaterThan(BigDecimal value) {
            addCriterion("ticket_discount >", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_discount >=", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountLessThan(BigDecimal value) {
            addCriterion("ticket_discount <", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_discount <=", value, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountIn(List<BigDecimal> values) {
            addCriterion("ticket_discount in", values, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountNotIn(List<BigDecimal> values) {
            addCriterion("ticket_discount not in", values, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_discount between", value1, value2, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_discount not between", value1, value2, "ticketDiscount");
            return (Criteria) this;
        }

        public Criteria andGiveCountIsNull() {
            addCriterion("give_count is null");
            return (Criteria) this;
        }

        public Criteria andGiveCountIsNotNull() {
            addCriterion("give_count is not null");
            return (Criteria) this;
        }

        public Criteria andGiveCountEqualTo(Integer value) {
            addCriterion("give_count =", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountNotEqualTo(Integer value) {
            addCriterion("give_count <>", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountGreaterThan(Integer value) {
            addCriterion("give_count >", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_count >=", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountLessThan(Integer value) {
            addCriterion("give_count <", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountLessThanOrEqualTo(Integer value) {
            addCriterion("give_count <=", value, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountIn(List<Integer> values) {
            addCriterion("give_count in", values, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountNotIn(List<Integer> values) {
            addCriterion("give_count not in", values, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountBetween(Integer value1, Integer value2) {
            addCriterion("give_count between", value1, value2, "giveCount");
            return (Criteria) this;
        }

        public Criteria andGiveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("give_count not between", value1, value2, "giveCount");
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

        public Criteria andValidDayIsNull() {
            addCriterion("valid_day is null");
            return (Criteria) this;
        }

        public Criteria andValidDayIsNotNull() {
            addCriterion("valid_day is not null");
            return (Criteria) this;
        }

        public Criteria andValidDayEqualTo(Integer value) {
            addCriterion("valid_day =", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotEqualTo(Integer value) {
            addCriterion("valid_day <>", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayGreaterThan(Integer value) {
            addCriterion("valid_day >", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_day >=", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayLessThan(Integer value) {
            addCriterion("valid_day <", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayLessThanOrEqualTo(Integer value) {
            addCriterion("valid_day <=", value, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayIn(List<Integer> values) {
            addCriterion("valid_day in", values, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotIn(List<Integer> values) {
            addCriterion("valid_day not in", values, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayBetween(Integer value1, Integer value2) {
            addCriterion("valid_day between", value1, value2, "validDay");
            return (Criteria) this;
        }

        public Criteria andValidDayNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_day not between", value1, value2, "validDay");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andPutChannelIsNull() {
            addCriterion("put_channel is null");
            return (Criteria) this;
        }

        public Criteria andPutChannelIsNotNull() {
            addCriterion("put_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPutChannelEqualTo(Byte value) {
            addCriterion("put_channel =", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotEqualTo(Byte value) {
            addCriterion("put_channel <>", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelGreaterThan(Byte value) {
            addCriterion("put_channel >", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("put_channel >=", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelLessThan(Byte value) {
            addCriterion("put_channel <", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelLessThanOrEqualTo(Byte value) {
            addCriterion("put_channel <=", value, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelIn(List<Byte> values) {
            addCriterion("put_channel in", values, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotIn(List<Byte> values) {
            addCriterion("put_channel not in", values, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelBetween(Byte value1, Byte value2) {
            addCriterion("put_channel between", value1, value2, "putChannel");
            return (Criteria) this;
        }

        public Criteria andPutChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("put_channel not between", value1, value2, "putChannel");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNull() {
            addCriterion("join_type is null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNotNull() {
            addCriterion("join_type is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeEqualTo(Byte value) {
            addCriterion("join_type =", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotEqualTo(Byte value) {
            addCriterion("join_type <>", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThan(Byte value) {
            addCriterion("join_type >", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("join_type >=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThan(Byte value) {
            addCriterion("join_type <", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThanOrEqualTo(Byte value) {
            addCriterion("join_type <=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIn(List<Byte> values) {
            addCriterion("join_type in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotIn(List<Byte> values) {
            addCriterion("join_type not in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeBetween(Byte value1, Byte value2) {
            addCriterion("join_type between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("join_type not between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
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