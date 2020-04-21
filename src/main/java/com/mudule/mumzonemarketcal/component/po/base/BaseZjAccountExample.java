package com.mudule.mumzonemarketcal.component.po.base;

import java.util.ArrayList;
import java.util.List;

public class BaseZjAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseZjAccountExample() {
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

        public Criteria andBaseShopIdIsNull() {
            addCriterion("base_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdIsNotNull() {
            addCriterion("base_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdEqualTo(String value) {
            addCriterion("base_shop_id =", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdNotEqualTo(String value) {
            addCriterion("base_shop_id <>", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdGreaterThan(String value) {
            addCriterion("base_shop_id >", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_shop_id >=", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdLessThan(String value) {
            addCriterion("base_shop_id <", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdLessThanOrEqualTo(String value) {
            addCriterion("base_shop_id <=", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdLike(String value) {
            addCriterion("base_shop_id like", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdNotLike(String value) {
            addCriterion("base_shop_id not like", value, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdIn(List<String> values) {
            addCriterion("base_shop_id in", values, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdNotIn(List<String> values) {
            addCriterion("base_shop_id not in", values, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdBetween(String value1, String value2) {
            addCriterion("base_shop_id between", value1, value2, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andBaseShopIdNotBetween(String value1, String value2) {
            addCriterion("base_shop_id not between", value1, value2, "baseShopId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Byte value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Byte value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Byte value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Byte value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Byte> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Byte> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Byte value1, Byte value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_no =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_no <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_no >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_no >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_no <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_no <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_no in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_no not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_no between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_no not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Byte value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Byte value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Byte value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Byte value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Byte> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Byte> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Byte value1, Byte value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
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

        public Criteria andCltaccbnkeidIsNull() {
            addCriterion("cltaccBnkeid is null");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidIsNotNull() {
            addCriterion("cltaccBnkeid is not null");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidEqualTo(String value) {
            addCriterion("cltaccBnkeid =", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidNotEqualTo(String value) {
            addCriterion("cltaccBnkeid <>", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidGreaterThan(String value) {
            addCriterion("cltaccBnkeid >", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidGreaterThanOrEqualTo(String value) {
            addCriterion("cltaccBnkeid >=", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidLessThan(String value) {
            addCriterion("cltaccBnkeid <", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidLessThanOrEqualTo(String value) {
            addCriterion("cltaccBnkeid <=", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidLike(String value) {
            addCriterion("cltaccBnkeid like", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidNotLike(String value) {
            addCriterion("cltaccBnkeid not like", value, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidIn(List<String> values) {
            addCriterion("cltaccBnkeid in", values, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidNotIn(List<String> values) {
            addCriterion("cltaccBnkeid not in", values, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidBetween(String value1, String value2) {
            addCriterion("cltaccBnkeid between", value1, value2, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccbnkeidNotBetween(String value1, String value2) {
            addCriterion("cltaccBnkeid not between", value1, value2, "cltaccbnkeid");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdIsNull() {
            addCriterion("cltaccOpenbkcd is null");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdIsNotNull() {
            addCriterion("cltaccOpenbkcd is not null");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdEqualTo(String value) {
            addCriterion("cltaccOpenbkcd =", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdNotEqualTo(String value) {
            addCriterion("cltaccOpenbkcd <>", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdGreaterThan(String value) {
            addCriterion("cltaccOpenbkcd >", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdGreaterThanOrEqualTo(String value) {
            addCriterion("cltaccOpenbkcd >=", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdLessThan(String value) {
            addCriterion("cltaccOpenbkcd <", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdLessThanOrEqualTo(String value) {
            addCriterion("cltaccOpenbkcd <=", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdLike(String value) {
            addCriterion("cltaccOpenbkcd like", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdNotLike(String value) {
            addCriterion("cltaccOpenbkcd not like", value, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdIn(List<String> values) {
            addCriterion("cltaccOpenbkcd in", values, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdNotIn(List<String> values) {
            addCriterion("cltaccOpenbkcd not in", values, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdBetween(String value1, String value2) {
            addCriterion("cltaccOpenbkcd between", value1, value2, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbkcdNotBetween(String value1, String value2) {
            addCriterion("cltaccOpenbkcd not between", value1, value2, "cltaccopenbkcd");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmIsNull() {
            addCriterion("cltaccOpenbknm is null");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmIsNotNull() {
            addCriterion("cltaccOpenbknm is not null");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmEqualTo(String value) {
            addCriterion("cltaccOpenbknm =", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmNotEqualTo(String value) {
            addCriterion("cltaccOpenbknm <>", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmGreaterThan(String value) {
            addCriterion("cltaccOpenbknm >", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmGreaterThanOrEqualTo(String value) {
            addCriterion("cltaccOpenbknm >=", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmLessThan(String value) {
            addCriterion("cltaccOpenbknm <", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmLessThanOrEqualTo(String value) {
            addCriterion("cltaccOpenbknm <=", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmLike(String value) {
            addCriterion("cltaccOpenbknm like", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmNotLike(String value) {
            addCriterion("cltaccOpenbknm not like", value, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmIn(List<String> values) {
            addCriterion("cltaccOpenbknm in", values, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmNotIn(List<String> values) {
            addCriterion("cltaccOpenbknm not in", values, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmBetween(String value1, String value2) {
            addCriterion("cltaccOpenbknm between", value1, value2, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andCltaccopenbknmNotBetween(String value1, String value2) {
            addCriterion("cltaccOpenbknm not between", value1, value2, "cltaccopenbknm");
            return (Criteria) this;
        }

        public Criteria andMchidIsNull() {
            addCriterion("mchid is null");
            return (Criteria) this;
        }

        public Criteria andMchidIsNotNull() {
            addCriterion("mchid is not null");
            return (Criteria) this;
        }

        public Criteria andMchidEqualTo(String value) {
            addCriterion("mchid =", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotEqualTo(String value) {
            addCriterion("mchid <>", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThan(String value) {
            addCriterion("mchid >", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThanOrEqualTo(String value) {
            addCriterion("mchid >=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThan(String value) {
            addCriterion("mchid <", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThanOrEqualTo(String value) {
            addCriterion("mchid <=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLike(String value) {
            addCriterion("mchid like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotLike(String value) {
            addCriterion("mchid not like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidIn(List<String> values) {
            addCriterion("mchid in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotIn(List<String> values) {
            addCriterion("mchid not in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidBetween(String value1, String value2) {
            addCriterion("mchid between", value1, value2, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotBetween(String value1, String value2) {
            addCriterion("mchid not between", value1, value2, "mchid");
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