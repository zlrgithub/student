package com.student.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class ShowMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowMessageExample() {
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

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("work_type like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("work_type not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("work_type not between", value1, value2, "workType");
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

        public Criteria andPerfStandardsIsNull() {
            addCriterion("perf_standards is null");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsIsNotNull() {
            addCriterion("perf_standards is not null");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsEqualTo(String value) {
            addCriterion("perf_standards =", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsNotEqualTo(String value) {
            addCriterion("perf_standards <>", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsGreaterThan(String value) {
            addCriterion("perf_standards >", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsGreaterThanOrEqualTo(String value) {
            addCriterion("perf_standards >=", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsLessThan(String value) {
            addCriterion("perf_standards <", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsLessThanOrEqualTo(String value) {
            addCriterion("perf_standards <=", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsLike(String value) {
            addCriterion("perf_standards like", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsNotLike(String value) {
            addCriterion("perf_standards not like", value, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsIn(List<String> values) {
            addCriterion("perf_standards in", values, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsNotIn(List<String> values) {
            addCriterion("perf_standards not in", values, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsBetween(String value1, String value2) {
            addCriterion("perf_standards between", value1, value2, "perfStandards");
            return (Criteria) this;
        }

        public Criteria andPerfStandardsNotBetween(String value1, String value2) {
            addCriterion("perf_standards not between", value1, value2, "perfStandards");
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

        public Criteria andIsLocalIsNull() {
            addCriterion("is_local is null");
            return (Criteria) this;
        }

        public Criteria andIsLocalIsNotNull() {
            addCriterion("is_local is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocalEqualTo(Integer value) {
            addCriterion("is_local =", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotEqualTo(Integer value) {
            addCriterion("is_local <>", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThan(Integer value) {
            addCriterion("is_local >", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_local >=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThan(Integer value) {
            addCriterion("is_local <", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalLessThanOrEqualTo(Integer value) {
            addCriterion("is_local <=", value, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalIn(List<Integer> values) {
            addCriterion("is_local in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotIn(List<Integer> values) {
            addCriterion("is_local not in", values, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalBetween(Integer value1, Integer value2) {
            addCriterion("is_local between", value1, value2, "isLocal");
            return (Criteria) this;
        }

        public Criteria andIsLocalNotBetween(Integer value1, Integer value2) {
            addCriterion("is_local not between", value1, value2, "isLocal");
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