package com.student.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class BusiUserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusiUserMessageExample() {
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

        public Criteria andBusiUserIdIsNull() {
            addCriterion("busi_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdIsNotNull() {
            addCriterion("busi_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdEqualTo(String value) {
            addCriterion("busi_user_id =", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdNotEqualTo(String value) {
            addCriterion("busi_user_id <>", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdGreaterThan(String value) {
            addCriterion("busi_user_id >", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("busi_user_id >=", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdLessThan(String value) {
            addCriterion("busi_user_id <", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdLessThanOrEqualTo(String value) {
            addCriterion("busi_user_id <=", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdLike(String value) {
            addCriterion("busi_user_id like", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdNotLike(String value) {
            addCriterion("busi_user_id not like", value, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdIn(List<String> values) {
            addCriterion("busi_user_id in", values, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdNotIn(List<String> values) {
            addCriterion("busi_user_id not in", values, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdBetween(String value1, String value2) {
            addCriterion("busi_user_id between", value1, value2, "busiUserId");
            return (Criteria) this;
        }

        public Criteria andBusiUserIdNotBetween(String value1, String value2) {
            addCriterion("busi_user_id not between", value1, value2, "busiUserId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNull() {
            addCriterion("companyType is null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNotNull() {
            addCriterion("companyType is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeEqualTo(String value) {
            addCriterion("companyType =", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotEqualTo(String value) {
            addCriterion("companyType <>", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThan(String value) {
            addCriterion("companyType >", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThanOrEqualTo(String value) {
            addCriterion("companyType >=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThan(String value) {
            addCriterion("companyType <", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThanOrEqualTo(String value) {
            addCriterion("companyType <=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLike(String value) {
            addCriterion("companyType like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotLike(String value) {
            addCriterion("companyType not like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIn(List<String> values) {
            addCriterion("companyType in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotIn(List<String> values) {
            addCriterion("companyType not in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeBetween(String value1, String value2) {
            addCriterion("companyType between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotBetween(String value1, String value2) {
            addCriterion("companyType not between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIsNull() {
            addCriterion("company_Introduce is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIsNotNull() {
            addCriterion("company_Introduce is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceEqualTo(String value) {
            addCriterion("company_Introduce =", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotEqualTo(String value) {
            addCriterion("company_Introduce <>", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceGreaterThan(String value) {
            addCriterion("company_Introduce >", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("company_Introduce >=", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLessThan(String value) {
            addCriterion("company_Introduce <", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLessThanOrEqualTo(String value) {
            addCriterion("company_Introduce <=", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLike(String value) {
            addCriterion("company_Introduce like", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotLike(String value) {
            addCriterion("company_Introduce not like", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIn(List<String> values) {
            addCriterion("company_Introduce in", values, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotIn(List<String> values) {
            addCriterion("company_Introduce not in", values, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceBetween(String value1, String value2) {
            addCriterion("company_Introduce between", value1, value2, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotBetween(String value1, String value2) {
            addCriterion("company_Introduce not between", value1, value2, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIsNull() {
            addCriterion("company_web is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIsNotNull() {
            addCriterion("company_web is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebEqualTo(String value) {
            addCriterion("company_web =", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotEqualTo(String value) {
            addCriterion("company_web <>", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebGreaterThan(String value) {
            addCriterion("company_web >", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebGreaterThanOrEqualTo(String value) {
            addCriterion("company_web >=", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLessThan(String value) {
            addCriterion("company_web <", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLessThanOrEqualTo(String value) {
            addCriterion("company_web <=", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLike(String value) {
            addCriterion("company_web like", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotLike(String value) {
            addCriterion("company_web not like", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIn(List<String> values) {
            addCriterion("company_web in", values, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotIn(List<String> values) {
            addCriterion("company_web not in", values, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebBetween(String value1, String value2) {
            addCriterion("company_web between", value1, value2, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotBetween(String value1, String value2) {
            addCriterion("company_web not between", value1, value2, "companyWeb");
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