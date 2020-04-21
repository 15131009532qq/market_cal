package com.mudule.mumzonemarketcal.component.po.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseOrganizationAlipayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseOrganizationAlipayExample() {
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

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("organization_id like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("organization_id not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyIsNull() {
            addCriterion("zfb_public_key is null");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyIsNotNull() {
            addCriterion("zfb_public_key is not null");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyEqualTo(String value) {
            addCriterion("zfb_public_key =", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyNotEqualTo(String value) {
            addCriterion("zfb_public_key <>", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyGreaterThan(String value) {
            addCriterion("zfb_public_key >", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("zfb_public_key >=", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyLessThan(String value) {
            addCriterion("zfb_public_key <", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("zfb_public_key <=", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyLike(String value) {
            addCriterion("zfb_public_key like", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyNotLike(String value) {
            addCriterion("zfb_public_key not like", value, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyIn(List<String> values) {
            addCriterion("zfb_public_key in", values, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyNotIn(List<String> values) {
            addCriterion("zfb_public_key not in", values, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyBetween(String value1, String value2) {
            addCriterion("zfb_public_key between", value1, value2, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andZfbPublicKeyNotBetween(String value1, String value2) {
            addCriterion("zfb_public_key not between", value1, value2, "zfbPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIsNull() {
            addCriterion("rsa_public_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIsNotNull() {
            addCriterion("rsa_public_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyEqualTo(String value) {
            addCriterion("rsa_public_key =", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotEqualTo(String value) {
            addCriterion("rsa_public_key <>", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyGreaterThan(String value) {
            addCriterion("rsa_public_key >", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_public_key >=", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLessThan(String value) {
            addCriterion("rsa_public_key <", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_public_key <=", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLike(String value) {
            addCriterion("rsa_public_key like", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotLike(String value) {
            addCriterion("rsa_public_key not like", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIn(List<String> values) {
            addCriterion("rsa_public_key in", values, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotIn(List<String> values) {
            addCriterion("rsa_public_key not in", values, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyBetween(String value1, String value2) {
            addCriterion("rsa_public_key between", value1, value2, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_public_key not between", value1, value2, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIsNull() {
            addCriterion("rsa_private_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIsNotNull() {
            addCriterion("rsa_private_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyEqualTo(String value) {
            addCriterion("rsa_private_key =", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotEqualTo(String value) {
            addCriterion("rsa_private_key <>", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyGreaterThan(String value) {
            addCriterion("rsa_private_key >", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_private_key >=", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLessThan(String value) {
            addCriterion("rsa_private_key <", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_private_key <=", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLike(String value) {
            addCriterion("rsa_private_key like", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotLike(String value) {
            addCriterion("rsa_private_key not like", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIn(List<String> values) {
            addCriterion("rsa_private_key in", values, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotIn(List<String> values) {
            addCriterion("rsa_private_key not in", values, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyBetween(String value1, String value2) {
            addCriterion("rsa_private_key between", value1, value2, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_private_key not between", value1, value2, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andIsScanIsNull() {
            addCriterion("is_scan is null");
            return (Criteria) this;
        }

        public Criteria andIsScanIsNotNull() {
            addCriterion("is_scan is not null");
            return (Criteria) this;
        }

        public Criteria andIsScanEqualTo(Byte value) {
            addCriterion("is_scan =", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanNotEqualTo(Byte value) {
            addCriterion("is_scan <>", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanGreaterThan(Byte value) {
            addCriterion("is_scan >", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_scan >=", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanLessThan(Byte value) {
            addCriterion("is_scan <", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanLessThanOrEqualTo(Byte value) {
            addCriterion("is_scan <=", value, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanIn(List<Byte> values) {
            addCriterion("is_scan in", values, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanNotIn(List<Byte> values) {
            addCriterion("is_scan not in", values, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanBetween(Byte value1, Byte value2) {
            addCriterion("is_scan between", value1, value2, "isScan");
            return (Criteria) this;
        }

        public Criteria andIsScanNotBetween(Byte value1, Byte value2) {
            addCriterion("is_scan not between", value1, value2, "isScan");
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