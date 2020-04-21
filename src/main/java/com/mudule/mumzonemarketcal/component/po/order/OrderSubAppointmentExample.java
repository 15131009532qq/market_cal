package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSubAppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSubAppointmentExample() {
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

        public Criteria andAppointmentIdIsNull() {
            addCriterion("appointment_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNotNull() {
            addCriterion("appointment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdEqualTo(String value) {
            addCriterion("appointment_id =", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotEqualTo(String value) {
            addCriterion("appointment_id <>", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThan(String value) {
            addCriterion("appointment_id >", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_id >=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThan(String value) {
            addCriterion("appointment_id <", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThanOrEqualTo(String value) {
            addCriterion("appointment_id <=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLike(String value) {
            addCriterion("appointment_id like", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotLike(String value) {
            addCriterion("appointment_id not like", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIn(List<String> values) {
            addCriterion("appointment_id in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotIn(List<String> values) {
            addCriterion("appointment_id not in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdBetween(String value1, String value2) {
            addCriterion("appointment_id between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotBetween(String value1, String value2) {
            addCriterion("appointment_id not between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdIsNull() {
            addCriterion("technician_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdIsNotNull() {
            addCriterion("technician_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdEqualTo(String value) {
            addCriterion("technician_id =", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdNotEqualTo(String value) {
            addCriterion("technician_id <>", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdGreaterThan(String value) {
            addCriterion("technician_id >", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdGreaterThanOrEqualTo(String value) {
            addCriterion("technician_id >=", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdLessThan(String value) {
            addCriterion("technician_id <", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdLessThanOrEqualTo(String value) {
            addCriterion("technician_id <=", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdLike(String value) {
            addCriterion("technician_id like", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdNotLike(String value) {
            addCriterion("technician_id not like", value, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdIn(List<String> values) {
            addCriterion("technician_id in", values, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdNotIn(List<String> values) {
            addCriterion("technician_id not in", values, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdBetween(String value1, String value2) {
            addCriterion("technician_id between", value1, value2, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianIdNotBetween(String value1, String value2) {
            addCriterion("technician_id not between", value1, value2, "technicianId");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIsNull() {
            addCriterion("technician_name is null");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIsNotNull() {
            addCriterion("technician_name is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameEqualTo(String value) {
            addCriterion("technician_name =", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotEqualTo(String value) {
            addCriterion("technician_name <>", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameGreaterThan(String value) {
            addCriterion("technician_name >", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameGreaterThanOrEqualTo(String value) {
            addCriterion("technician_name >=", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLessThan(String value) {
            addCriterion("technician_name <", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLessThanOrEqualTo(String value) {
            addCriterion("technician_name <=", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLike(String value) {
            addCriterion("technician_name like", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotLike(String value) {
            addCriterion("technician_name not like", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIn(List<String> values) {
            addCriterion("technician_name in", values, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotIn(List<String> values) {
            addCriterion("technician_name not in", values, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameBetween(String value1, String value2) {
            addCriterion("technician_name between", value1, value2, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotBetween(String value1, String value2) {
            addCriterion("technician_name not between", value1, value2, "technicianName");
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

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(Date value) {
            addCriterion("appointment_time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(Date value) {
            addCriterion("appointment_time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(Date value) {
            addCriterion("appointment_time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointment_time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(Date value) {
            addCriterion("appointment_time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("appointment_time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<Date> values) {
            addCriterion("appointment_time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<Date> values) {
            addCriterion("appointment_time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(Date value1, Date value2) {
            addCriterion("appointment_time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("appointment_time not between", value1, value2, "appointmentTime");
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

        public Criteria andServiceLengthIsNull() {
            addCriterion("service_length is null");
            return (Criteria) this;
        }

        public Criteria andServiceLengthIsNotNull() {
            addCriterion("service_length is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLengthEqualTo(Integer value) {
            addCriterion("service_length =", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthNotEqualTo(Integer value) {
            addCriterion("service_length <>", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthGreaterThan(Integer value) {
            addCriterion("service_length >", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_length >=", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthLessThan(Integer value) {
            addCriterion("service_length <", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthLessThanOrEqualTo(Integer value) {
            addCriterion("service_length <=", value, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthIn(List<Integer> values) {
            addCriterion("service_length in", values, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthNotIn(List<Integer> values) {
            addCriterion("service_length not in", values, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthBetween(Integer value1, Integer value2) {
            addCriterion("service_length between", value1, value2, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andServiceLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("service_length not between", value1, value2, "serviceLength");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNull() {
            addCriterion("origin_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNotNull() {
            addCriterion("origin_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceEqualTo(BigDecimal value) {
            addCriterion("origin_price =", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotEqualTo(BigDecimal value) {
            addCriterion("origin_price <>", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThan(BigDecimal value) {
            addCriterion("origin_price >", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_price >=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThan(BigDecimal value) {
            addCriterion("origin_price <", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_price <=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIn(List<BigDecimal> values) {
            addCriterion("origin_price in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotIn(List<BigDecimal> values) {
            addCriterion("origin_price not in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_price between", value1, value2, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_price not between", value1, value2, "originPrice");
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

        public Criteria andSuborderStatusIsNull() {
            addCriterion("suborder_status is null");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusIsNotNull() {
            addCriterion("suborder_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusEqualTo(Byte value) {
            addCriterion("suborder_status =", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusNotEqualTo(Byte value) {
            addCriterion("suborder_status <>", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusGreaterThan(Byte value) {
            addCriterion("suborder_status >", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("suborder_status >=", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusLessThan(Byte value) {
            addCriterion("suborder_status <", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("suborder_status <=", value, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusIn(List<Byte> values) {
            addCriterion("suborder_status in", values, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusNotIn(List<Byte> values) {
            addCriterion("suborder_status not in", values, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusBetween(Byte value1, Byte value2) {
            addCriterion("suborder_status between", value1, value2, "suborderStatus");
            return (Criteria) this;
        }

        public Criteria andSuborderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("suborder_status not between", value1, value2, "suborderStatus");
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