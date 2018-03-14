package com.student.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMessageExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andGraTimeIsNull() {
            addCriterion("gra_time is null");
            return (Criteria) this;
        }

        public Criteria andGraTimeIsNotNull() {
            addCriterion("gra_time is not null");
            return (Criteria) this;
        }

        public Criteria andGraTimeEqualTo(Integer value) {
            addCriterion("gra_time =", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotEqualTo(Integer value) {
            addCriterion("gra_time <>", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeGreaterThan(Integer value) {
            addCriterion("gra_time >", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("gra_time >=", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeLessThan(Integer value) {
            addCriterion("gra_time <", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeLessThanOrEqualTo(Integer value) {
            addCriterion("gra_time <=", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeIn(List<Integer> values) {
            addCriterion("gra_time in", values, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotIn(List<Integer> values) {
            addCriterion("gra_time not in", values, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeBetween(Integer value1, Integer value2) {
            addCriterion("gra_time between", value1, value2, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("gra_time not between", value1, value2, "graTime");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolIsNull() {
            addCriterion("is_top_school is null");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolIsNotNull() {
            addCriterion("is_top_school is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolEqualTo(String value) {
            addCriterion("is_top_school =", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolNotEqualTo(String value) {
            addCriterion("is_top_school <>", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolGreaterThan(String value) {
            addCriterion("is_top_school >", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("is_top_school >=", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolLessThan(String value) {
            addCriterion("is_top_school <", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolLessThanOrEqualTo(String value) {
            addCriterion("is_top_school <=", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolLike(String value) {
            addCriterion("is_top_school like", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolNotLike(String value) {
            addCriterion("is_top_school not like", value, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolIn(List<String> values) {
            addCriterion("is_top_school in", values, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolNotIn(List<String> values) {
            addCriterion("is_top_school not in", values, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolBetween(String value1, String value2) {
            addCriterion("is_top_school between", value1, value2, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andIsTopSchoolNotBetween(String value1, String value2) {
            addCriterion("is_top_school not between", value1, value2, "isTopSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsIsNull() {
            addCriterion("pref_standards is null");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsIsNotNull() {
            addCriterion("pref_standards is not null");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsEqualTo(String value) {
            addCriterion("pref_standards =", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsNotEqualTo(String value) {
            addCriterion("pref_standards <>", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsGreaterThan(String value) {
            addCriterion("pref_standards >", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsGreaterThanOrEqualTo(String value) {
            addCriterion("pref_standards >=", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsLessThan(String value) {
            addCriterion("pref_standards <", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsLessThanOrEqualTo(String value) {
            addCriterion("pref_standards <=", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsLike(String value) {
            addCriterion("pref_standards like", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsNotLike(String value) {
            addCriterion("pref_standards not like", value, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsIn(List<String> values) {
            addCriterion("pref_standards in", values, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsNotIn(List<String> values) {
            addCriterion("pref_standards not in", values, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsBetween(String value1, String value2) {
            addCriterion("pref_standards between", value1, value2, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andPrefStandardsNotBetween(String value1, String value2) {
            addCriterion("pref_standards not between", value1, value2, "prefStandards");
            return (Criteria) this;
        }

        public Criteria andWorkspaceIsNull() {
            addCriterion("workspace is null");
            return (Criteria) this;
        }

        public Criteria andWorkspaceIsNotNull() {
            addCriterion("workspace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkspaceEqualTo(String value) {
            addCriterion("workspace =", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceNotEqualTo(String value) {
            addCriterion("workspace <>", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceGreaterThan(String value) {
            addCriterion("workspace >", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceGreaterThanOrEqualTo(String value) {
            addCriterion("workspace >=", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceLessThan(String value) {
            addCriterion("workspace <", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceLessThanOrEqualTo(String value) {
            addCriterion("workspace <=", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceLike(String value) {
            addCriterion("workspace like", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceNotLike(String value) {
            addCriterion("workspace not like", value, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceIn(List<String> values) {
            addCriterion("workspace in", values, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceNotIn(List<String> values) {
            addCriterion("workspace not in", values, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceBetween(String value1, String value2) {
            addCriterion("workspace between", value1, value2, "workspace");
            return (Criteria) this;
        }

        public Criteria andWorkspaceNotBetween(String value1, String value2) {
            addCriterion("workspace not between", value1, value2, "workspace");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNull() {
            addCriterion("city_type is null");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNotNull() {
            addCriterion("city_type is not null");
            return (Criteria) this;
        }

        public Criteria andCityTypeEqualTo(String value) {
            addCriterion("city_type =", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotEqualTo(String value) {
            addCriterion("city_type <>", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThan(String value) {
            addCriterion("city_type >", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("city_type >=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThan(String value) {
            addCriterion("city_type <", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThanOrEqualTo(String value) {
            addCriterion("city_type <=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLike(String value) {
            addCriterion("city_type like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotLike(String value) {
            addCriterion("city_type not like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeIn(List<String> values) {
            addCriterion("city_type in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotIn(List<String> values) {
            addCriterion("city_type not in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeBetween(String value1, String value2) {
            addCriterion("city_type between", value1, value2, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotBetween(String value1, String value2) {
            addCriterion("city_type not between", value1, value2, "cityType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Integer value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("work like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("work not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andIsMajorIsNull() {
            addCriterion("is_major is null");
            return (Criteria) this;
        }

        public Criteria andIsMajorIsNotNull() {
            addCriterion("is_major is not null");
            return (Criteria) this;
        }

        public Criteria andIsMajorEqualTo(Integer value) {
            addCriterion("is_major =", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorNotEqualTo(Integer value) {
            addCriterion("is_major <>", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorGreaterThan(Integer value) {
            addCriterion("is_major >", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_major >=", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorLessThan(Integer value) {
            addCriterion("is_major <", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorLessThanOrEqualTo(Integer value) {
            addCriterion("is_major <=", value, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorIn(List<Integer> values) {
            addCriterion("is_major in", values, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorNotIn(List<Integer> values) {
            addCriterion("is_major not in", values, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorBetween(Integer value1, Integer value2) {
            addCriterion("is_major between", value1, value2, "isMajor");
            return (Criteria) this;
        }

        public Criteria andIsMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_major not between", value1, value2, "isMajor");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andIsTrainIsNull() {
            addCriterion("is_train is null");
            return (Criteria) this;
        }

        public Criteria andIsTrainIsNotNull() {
            addCriterion("is_train is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrainEqualTo(String value) {
            addCriterion("is_train =", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainNotEqualTo(String value) {
            addCriterion("is_train <>", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainGreaterThan(String value) {
            addCriterion("is_train >", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainGreaterThanOrEqualTo(String value) {
            addCriterion("is_train >=", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainLessThan(String value) {
            addCriterion("is_train <", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainLessThanOrEqualTo(String value) {
            addCriterion("is_train <=", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainLike(String value) {
            addCriterion("is_train like", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainNotLike(String value) {
            addCriterion("is_train not like", value, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainIn(List<String> values) {
            addCriterion("is_train in", values, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainNotIn(List<String> values) {
            addCriterion("is_train not in", values, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainBetween(String value1, String value2) {
            addCriterion("is_train between", value1, value2, "isTrain");
            return (Criteria) this;
        }

        public Criteria andIsTrainNotBetween(String value1, String value2) {
            addCriterion("is_train not between", value1, value2, "isTrain");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferIsNull() {
            addCriterion("way_of_offer is null");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferIsNotNull() {
            addCriterion("way_of_offer is not null");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferEqualTo(Integer value) {
            addCriterion("way_of_offer =", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferNotEqualTo(Integer value) {
            addCriterion("way_of_offer <>", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferGreaterThan(Integer value) {
            addCriterion("way_of_offer >", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_of_offer >=", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferLessThan(Integer value) {
            addCriterion("way_of_offer <", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferLessThanOrEqualTo(Integer value) {
            addCriterion("way_of_offer <=", value, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferIn(List<Integer> values) {
            addCriterion("way_of_offer in", values, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferNotIn(List<Integer> values) {
            addCriterion("way_of_offer not in", values, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferBetween(Integer value1, Integer value2) {
            addCriterion("way_of_offer between", value1, value2, "wayOfOffer");
            return (Criteria) this;
        }

        public Criteria andWayOfOfferNotBetween(Integer value1, Integer value2) {
            addCriterion("way_of_offer not between", value1, value2, "wayOfOffer");
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