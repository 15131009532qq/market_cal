package com.mudule.mumzonemarketcal.component.po.base;

import java.util.ArrayList;
import java.util.List;

public class BaseShopDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseShopDetailExample() {
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIsNull() {
            addCriterion("is_business is null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIsNotNull() {
            addCriterion("is_business is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessEqualTo(Byte value) {
            addCriterion("is_business =", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotEqualTo(Byte value) {
            addCriterion("is_business <>", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessGreaterThan(Byte value) {
            addCriterion("is_business >", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_business >=", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLessThan(Byte value) {
            addCriterion("is_business <", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLessThanOrEqualTo(Byte value) {
            addCriterion("is_business <=", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIn(List<Byte> values) {
            addCriterion("is_business in", values, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotIn(List<Byte> values) {
            addCriterion("is_business not in", values, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessBetween(Byte value1, Byte value2) {
            addCriterion("is_business between", value1, value2, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotBetween(Byte value1, Byte value2) {
            addCriterion("is_business not between", value1, value2, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIsNull() {
            addCriterion("closed_time is null");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIsNotNull() {
            addCriterion("closed_time is not null");
            return (Criteria) this;
        }

        public Criteria andClosedTimeEqualTo(String value) {
            addCriterion("closed_time =", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotEqualTo(String value) {
            addCriterion("closed_time <>", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeGreaterThan(String value) {
            addCriterion("closed_time >", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("closed_time >=", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeLessThan(String value) {
            addCriterion("closed_time <", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeLessThanOrEqualTo(String value) {
            addCriterion("closed_time <=", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeLike(String value) {
            addCriterion("closed_time like", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotLike(String value) {
            addCriterion("closed_time not like", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIn(List<String> values) {
            addCriterion("closed_time in", values, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotIn(List<String> values) {
            addCriterion("closed_time not in", values, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeBetween(String value1, String value2) {
            addCriterion("closed_time between", value1, value2, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotBetween(String value1, String value2) {
            addCriterion("closed_time not between", value1, value2, "closedTime");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNull() {
            addCriterion("position_address is null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNotNull() {
            addCriterion("position_address is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressEqualTo(String value) {
            addCriterion("position_address =", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotEqualTo(String value) {
            addCriterion("position_address <>", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThan(String value) {
            addCriterion("position_address >", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("position_address >=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThan(String value) {
            addCriterion("position_address <", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThanOrEqualTo(String value) {
            addCriterion("position_address <=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLike(String value) {
            addCriterion("position_address like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotLike(String value) {
            addCriterion("position_address not like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIn(List<String> values) {
            addCriterion("position_address in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotIn(List<String> values) {
            addCriterion("position_address not in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressBetween(String value1, String value2) {
            addCriterion("position_address between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotBetween(String value1, String value2) {
            addCriterion("position_address not between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(Byte value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(Byte value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(Byte value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(Byte value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(Byte value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<Byte> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<Byte> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(Byte value1, Byte value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andPriceListIsNull() {
            addCriterion("price_list is null");
            return (Criteria) this;
        }

        public Criteria andPriceListIsNotNull() {
            addCriterion("price_list is not null");
            return (Criteria) this;
        }

        public Criteria andPriceListEqualTo(Byte value) {
            addCriterion("price_list =", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListNotEqualTo(Byte value) {
            addCriterion("price_list <>", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListGreaterThan(Byte value) {
            addCriterion("price_list >", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListGreaterThanOrEqualTo(Byte value) {
            addCriterion("price_list >=", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListLessThan(Byte value) {
            addCriterion("price_list <", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListLessThanOrEqualTo(Byte value) {
            addCriterion("price_list <=", value, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListIn(List<Byte> values) {
            addCriterion("price_list in", values, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListNotIn(List<Byte> values) {
            addCriterion("price_list not in", values, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListBetween(Byte value1, Byte value2) {
            addCriterion("price_list between", value1, value2, "priceList");
            return (Criteria) this;
        }

        public Criteria andPriceListNotBetween(Byte value1, Byte value2) {
            addCriterion("price_list not between", value1, value2, "priceList");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("store_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("store_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("store_code =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("store_code <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("store_code >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_code >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("store_code <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("store_code <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("store_code like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("store_code not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("store_code in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("store_code not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("store_code between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("store_code not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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