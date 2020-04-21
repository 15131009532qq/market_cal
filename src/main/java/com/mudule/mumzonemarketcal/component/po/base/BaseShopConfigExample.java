package com.mudule.mumzonemarketcal.component.po.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseShopConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseShopConfigExample() {
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

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeIsNull() {
            addCriterion("comapny_code is null");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeIsNotNull() {
            addCriterion("comapny_code is not null");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeEqualTo(String value) {
            addCriterion("comapny_code =", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeNotEqualTo(String value) {
            addCriterion("comapny_code <>", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeGreaterThan(String value) {
            addCriterion("comapny_code >", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comapny_code >=", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeLessThan(String value) {
            addCriterion("comapny_code <", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeLessThanOrEqualTo(String value) {
            addCriterion("comapny_code <=", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeLike(String value) {
            addCriterion("comapny_code like", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeNotLike(String value) {
            addCriterion("comapny_code not like", value, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeIn(List<String> values) {
            addCriterion("comapny_code in", values, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeNotIn(List<String> values) {
            addCriterion("comapny_code not in", values, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeBetween(String value1, String value2) {
            addCriterion("comapny_code between", value1, value2, "comapnyCode");
            return (Criteria) this;
        }

        public Criteria andComapnyCodeNotBetween(String value1, String value2) {
            addCriterion("comapny_code not between", value1, value2, "comapnyCode");
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

        public Criteria andBusinessWeekIsNull() {
            addCriterion("business_week is null");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekIsNotNull() {
            addCriterion("business_week is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekEqualTo(String value) {
            addCriterion("business_week =", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekNotEqualTo(String value) {
            addCriterion("business_week <>", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekGreaterThan(String value) {
            addCriterion("business_week >", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekGreaterThanOrEqualTo(String value) {
            addCriterion("business_week >=", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekLessThan(String value) {
            addCriterion("business_week <", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekLessThanOrEqualTo(String value) {
            addCriterion("business_week <=", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekLike(String value) {
            addCriterion("business_week like", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekNotLike(String value) {
            addCriterion("business_week not like", value, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekIn(List<String> values) {
            addCriterion("business_week in", values, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekNotIn(List<String> values) {
            addCriterion("business_week not in", values, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekBetween(String value1, String value2) {
            addCriterion("business_week between", value1, value2, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andBusinessWeekNotBetween(String value1, String value2) {
            addCriterion("business_week not between", value1, value2, "businessWeek");
            return (Criteria) this;
        }

        public Criteria andMechantIntroIsNull() {
            addCriterion("mechant_intro is null");
            return (Criteria) this;
        }

        public Criteria andMechantIntroIsNotNull() {
            addCriterion("mechant_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMechantIntroEqualTo(String value) {
            addCriterion("mechant_intro =", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroNotEqualTo(String value) {
            addCriterion("mechant_intro <>", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroGreaterThan(String value) {
            addCriterion("mechant_intro >", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroGreaterThanOrEqualTo(String value) {
            addCriterion("mechant_intro >=", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroLessThan(String value) {
            addCriterion("mechant_intro <", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroLessThanOrEqualTo(String value) {
            addCriterion("mechant_intro <=", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroLike(String value) {
            addCriterion("mechant_intro like", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroNotLike(String value) {
            addCriterion("mechant_intro not like", value, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroIn(List<String> values) {
            addCriterion("mechant_intro in", values, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroNotIn(List<String> values) {
            addCriterion("mechant_intro not in", values, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroBetween(String value1, String value2) {
            addCriterion("mechant_intro between", value1, value2, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantIntroNotBetween(String value1, String value2) {
            addCriterion("mechant_intro not between", value1, value2, "mechantIntro");
            return (Criteria) this;
        }

        public Criteria andMechantTabIsNull() {
            addCriterion("mechant_tab is null");
            return (Criteria) this;
        }

        public Criteria andMechantTabIsNotNull() {
            addCriterion("mechant_tab is not null");
            return (Criteria) this;
        }

        public Criteria andMechantTabEqualTo(String value) {
            addCriterion("mechant_tab =", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabNotEqualTo(String value) {
            addCriterion("mechant_tab <>", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabGreaterThan(String value) {
            addCriterion("mechant_tab >", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabGreaterThanOrEqualTo(String value) {
            addCriterion("mechant_tab >=", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabLessThan(String value) {
            addCriterion("mechant_tab <", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabLessThanOrEqualTo(String value) {
            addCriterion("mechant_tab <=", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabLike(String value) {
            addCriterion("mechant_tab like", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabNotLike(String value) {
            addCriterion("mechant_tab not like", value, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabIn(List<String> values) {
            addCriterion("mechant_tab in", values, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabNotIn(List<String> values) {
            addCriterion("mechant_tab not in", values, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabBetween(String value1, String value2) {
            addCriterion("mechant_tab between", value1, value2, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantTabNotBetween(String value1, String value2) {
            addCriterion("mechant_tab not between", value1, value2, "mechantTab");
            return (Criteria) this;
        }

        public Criteria andMechantItemIsNull() {
            addCriterion("mechant_item is null");
            return (Criteria) this;
        }

        public Criteria andMechantItemIsNotNull() {
            addCriterion("mechant_item is not null");
            return (Criteria) this;
        }

        public Criteria andMechantItemEqualTo(String value) {
            addCriterion("mechant_item =", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemNotEqualTo(String value) {
            addCriterion("mechant_item <>", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemGreaterThan(String value) {
            addCriterion("mechant_item >", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemGreaterThanOrEqualTo(String value) {
            addCriterion("mechant_item >=", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemLessThan(String value) {
            addCriterion("mechant_item <", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemLessThanOrEqualTo(String value) {
            addCriterion("mechant_item <=", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemLike(String value) {
            addCriterion("mechant_item like", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemNotLike(String value) {
            addCriterion("mechant_item not like", value, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemIn(List<String> values) {
            addCriterion("mechant_item in", values, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemNotIn(List<String> values) {
            addCriterion("mechant_item not in", values, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemBetween(String value1, String value2) {
            addCriterion("mechant_item between", value1, value2, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andMechantItemNotBetween(String value1, String value2) {
            addCriterion("mechant_item not between", value1, value2, "mechantItem");
            return (Criteria) this;
        }

        public Criteria andFitAgeIsNull() {
            addCriterion("fit_age is null");
            return (Criteria) this;
        }

        public Criteria andFitAgeIsNotNull() {
            addCriterion("fit_age is not null");
            return (Criteria) this;
        }

        public Criteria andFitAgeEqualTo(String value) {
            addCriterion("fit_age =", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeNotEqualTo(String value) {
            addCriterion("fit_age <>", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeGreaterThan(String value) {
            addCriterion("fit_age >", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeGreaterThanOrEqualTo(String value) {
            addCriterion("fit_age >=", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeLessThan(String value) {
            addCriterion("fit_age <", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeLessThanOrEqualTo(String value) {
            addCriterion("fit_age <=", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeLike(String value) {
            addCriterion("fit_age like", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeNotLike(String value) {
            addCriterion("fit_age not like", value, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeIn(List<String> values) {
            addCriterion("fit_age in", values, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeNotIn(List<String> values) {
            addCriterion("fit_age not in", values, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeBetween(String value1, String value2) {
            addCriterion("fit_age between", value1, value2, "fitAge");
            return (Criteria) this;
        }

        public Criteria andFitAgeNotBetween(String value1, String value2) {
            addCriterion("fit_age not between", value1, value2, "fitAge");
            return (Criteria) this;
        }

        public Criteria andTranInfoIsNull() {
            addCriterion("tran_info is null");
            return (Criteria) this;
        }

        public Criteria andTranInfoIsNotNull() {
            addCriterion("tran_info is not null");
            return (Criteria) this;
        }

        public Criteria andTranInfoEqualTo(String value) {
            addCriterion("tran_info =", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoNotEqualTo(String value) {
            addCriterion("tran_info <>", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoGreaterThan(String value) {
            addCriterion("tran_info >", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoGreaterThanOrEqualTo(String value) {
            addCriterion("tran_info >=", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoLessThan(String value) {
            addCriterion("tran_info <", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoLessThanOrEqualTo(String value) {
            addCriterion("tran_info <=", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoLike(String value) {
            addCriterion("tran_info like", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoNotLike(String value) {
            addCriterion("tran_info not like", value, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoIn(List<String> values) {
            addCriterion("tran_info in", values, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoNotIn(List<String> values) {
            addCriterion("tran_info not in", values, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoBetween(String value1, String value2) {
            addCriterion("tran_info between", value1, value2, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andTranInfoNotBetween(String value1, String value2) {
            addCriterion("tran_info not between", value1, value2, "tranInfo");
            return (Criteria) this;
        }

        public Criteria andAddrGuideIsNull() {
            addCriterion("addr_guide is null");
            return (Criteria) this;
        }

        public Criteria andAddrGuideIsNotNull() {
            addCriterion("addr_guide is not null");
            return (Criteria) this;
        }

        public Criteria andAddrGuideEqualTo(String value) {
            addCriterion("addr_guide =", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideNotEqualTo(String value) {
            addCriterion("addr_guide <>", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideGreaterThan(String value) {
            addCriterion("addr_guide >", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideGreaterThanOrEqualTo(String value) {
            addCriterion("addr_guide >=", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideLessThan(String value) {
            addCriterion("addr_guide <", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideLessThanOrEqualTo(String value) {
            addCriterion("addr_guide <=", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideLike(String value) {
            addCriterion("addr_guide like", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideNotLike(String value) {
            addCriterion("addr_guide not like", value, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideIn(List<String> values) {
            addCriterion("addr_guide in", values, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideNotIn(List<String> values) {
            addCriterion("addr_guide not in", values, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideBetween(String value1, String value2) {
            addCriterion("addr_guide between", value1, value2, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andAddrGuideNotBetween(String value1, String value2) {
            addCriterion("addr_guide not between", value1, value2, "addrGuide");
            return (Criteria) this;
        }

        public Criteria andStopPaceIsNull() {
            addCriterion("stop_pace is null");
            return (Criteria) this;
        }

        public Criteria andStopPaceIsNotNull() {
            addCriterion("stop_pace is not null");
            return (Criteria) this;
        }

        public Criteria andStopPaceEqualTo(String value) {
            addCriterion("stop_pace =", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceNotEqualTo(String value) {
            addCriterion("stop_pace <>", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceGreaterThan(String value) {
            addCriterion("stop_pace >", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceGreaterThanOrEqualTo(String value) {
            addCriterion("stop_pace >=", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceLessThan(String value) {
            addCriterion("stop_pace <", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceLessThanOrEqualTo(String value) {
            addCriterion("stop_pace <=", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceLike(String value) {
            addCriterion("stop_pace like", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceNotLike(String value) {
            addCriterion("stop_pace not like", value, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceIn(List<String> values) {
            addCriterion("stop_pace in", values, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceNotIn(List<String> values) {
            addCriterion("stop_pace not in", values, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceBetween(String value1, String value2) {
            addCriterion("stop_pace between", value1, value2, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceNotBetween(String value1, String value2) {
            addCriterion("stop_pace not between", value1, value2, "stopPace");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroIsNull() {
            addCriterion("stop_pace_intro is null");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroIsNotNull() {
            addCriterion("stop_pace_intro is not null");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroEqualTo(String value) {
            addCriterion("stop_pace_intro =", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroNotEqualTo(String value) {
            addCriterion("stop_pace_intro <>", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroGreaterThan(String value) {
            addCriterion("stop_pace_intro >", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroGreaterThanOrEqualTo(String value) {
            addCriterion("stop_pace_intro >=", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroLessThan(String value) {
            addCriterion("stop_pace_intro <", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroLessThanOrEqualTo(String value) {
            addCriterion("stop_pace_intro <=", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroLike(String value) {
            addCriterion("stop_pace_intro like", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroNotLike(String value) {
            addCriterion("stop_pace_intro not like", value, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroIn(List<String> values) {
            addCriterion("stop_pace_intro in", values, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroNotIn(List<String> values) {
            addCriterion("stop_pace_intro not in", values, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroBetween(String value1, String value2) {
            addCriterion("stop_pace_intro between", value1, value2, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andStopPaceIntroNotBetween(String value1, String value2) {
            addCriterion("stop_pace_intro not between", value1, value2, "stopPaceIntro");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimIsNull() {
            addCriterion("health_safe_swim is null");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimIsNotNull() {
            addCriterion("health_safe_swim is not null");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimEqualTo(String value) {
            addCriterion("health_safe_swim =", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimNotEqualTo(String value) {
            addCriterion("health_safe_swim <>", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimGreaterThan(String value) {
            addCriterion("health_safe_swim >", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimGreaterThanOrEqualTo(String value) {
            addCriterion("health_safe_swim >=", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimLessThan(String value) {
            addCriterion("health_safe_swim <", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimLessThanOrEqualTo(String value) {
            addCriterion("health_safe_swim <=", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimLike(String value) {
            addCriterion("health_safe_swim like", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimNotLike(String value) {
            addCriterion("health_safe_swim not like", value, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimIn(List<String> values) {
            addCriterion("health_safe_swim in", values, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimNotIn(List<String> values) {
            addCriterion("health_safe_swim not in", values, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimBetween(String value1, String value2) {
            addCriterion("health_safe_swim between", value1, value2, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafeSwimNotBetween(String value1, String value2) {
            addCriterion("health_safe_swim not between", value1, value2, "healthSafeSwim");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolIsNull() {
            addCriterion("health_safe_pool is null");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolIsNotNull() {
            addCriterion("health_safe_pool is not null");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolEqualTo(String value) {
            addCriterion("health_safe_pool =", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolNotEqualTo(String value) {
            addCriterion("health_safe_pool <>", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolGreaterThan(String value) {
            addCriterion("health_safe_pool >", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolGreaterThanOrEqualTo(String value) {
            addCriterion("health_safe_pool >=", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolLessThan(String value) {
            addCriterion("health_safe_pool <", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolLessThanOrEqualTo(String value) {
            addCriterion("health_safe_pool <=", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolLike(String value) {
            addCriterion("health_safe_pool like", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolNotLike(String value) {
            addCriterion("health_safe_pool not like", value, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolIn(List<String> values) {
            addCriterion("health_safe_pool in", values, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolNotIn(List<String> values) {
            addCriterion("health_safe_pool not in", values, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolBetween(String value1, String value2) {
            addCriterion("health_safe_pool between", value1, value2, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andHealthSafePoolNotBetween(String value1, String value2) {
            addCriterion("health_safe_pool not between", value1, value2, "healthSafePool");
            return (Criteria) this;
        }

        public Criteria andWarmPromptIsNull() {
            addCriterion("warm_prompt is null");
            return (Criteria) this;
        }

        public Criteria andWarmPromptIsNotNull() {
            addCriterion("warm_prompt is not null");
            return (Criteria) this;
        }

        public Criteria andWarmPromptEqualTo(String value) {
            addCriterion("warm_prompt =", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptNotEqualTo(String value) {
            addCriterion("warm_prompt <>", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptGreaterThan(String value) {
            addCriterion("warm_prompt >", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptGreaterThanOrEqualTo(String value) {
            addCriterion("warm_prompt >=", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptLessThan(String value) {
            addCriterion("warm_prompt <", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptLessThanOrEqualTo(String value) {
            addCriterion("warm_prompt <=", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptLike(String value) {
            addCriterion("warm_prompt like", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptNotLike(String value) {
            addCriterion("warm_prompt not like", value, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptIn(List<String> values) {
            addCriterion("warm_prompt in", values, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptNotIn(List<String> values) {
            addCriterion("warm_prompt not in", values, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptBetween(String value1, String value2) {
            addCriterion("warm_prompt between", value1, value2, "warmPrompt");
            return (Criteria) this;
        }

        public Criteria andWarmPromptNotBetween(String value1, String value2) {
            addCriterion("warm_prompt not between", value1, value2, "warmPrompt");
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