package com.student.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class MainInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainInfoExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andKpiCodeIsNull() {
            addCriterion("kpi_code is null");
            return (Criteria) this;
        }

        public Criteria andKpiCodeIsNotNull() {
            addCriterion("kpi_code is not null");
            return (Criteria) this;
        }

        public Criteria andKpiCodeEqualTo(String value) {
            addCriterion("kpi_code =", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNotEqualTo(String value) {
            addCriterion("kpi_code <>", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeGreaterThan(String value) {
            addCriterion("kpi_code >", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("kpi_code >=", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeLessThan(String value) {
            addCriterion("kpi_code <", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeLessThanOrEqualTo(String value) {
            addCriterion("kpi_code <=", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeLike(String value) {
            addCriterion("kpi_code like", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNotLike(String value) {
            addCriterion("kpi_code not like", value, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeIn(List<String> values) {
            addCriterion("kpi_code in", values, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNotIn(List<String> values) {
            addCriterion("kpi_code not in", values, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeBetween(String value1, String value2) {
            addCriterion("kpi_code between", value1, value2, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNotBetween(String value1, String value2) {
            addCriterion("kpi_code not between", value1, value2, "kpiCode");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameIsNull() {
            addCriterion("kpi_code_name is null");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameIsNotNull() {
            addCriterion("kpi_code_name is not null");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameEqualTo(String value) {
            addCriterion("kpi_code_name =", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameNotEqualTo(String value) {
            addCriterion("kpi_code_name <>", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameGreaterThan(String value) {
            addCriterion("kpi_code_name >", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("kpi_code_name >=", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameLessThan(String value) {
            addCriterion("kpi_code_name <", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameLessThanOrEqualTo(String value) {
            addCriterion("kpi_code_name <=", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameLike(String value) {
            addCriterion("kpi_code_name like", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameNotLike(String value) {
            addCriterion("kpi_code_name not like", value, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameIn(List<String> values) {
            addCriterion("kpi_code_name in", values, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameNotIn(List<String> values) {
            addCriterion("kpi_code_name not in", values, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameBetween(String value1, String value2) {
            addCriterion("kpi_code_name between", value1, value2, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiCodeNameNotBetween(String value1, String value2) {
            addCriterion("kpi_code_name not between", value1, value2, "kpiCodeName");
            return (Criteria) this;
        }

        public Criteria andKpiValueIsNull() {
            addCriterion("kpi_value is null");
            return (Criteria) this;
        }

        public Criteria andKpiValueIsNotNull() {
            addCriterion("kpi_value is not null");
            return (Criteria) this;
        }

        public Criteria andKpiValueEqualTo(Integer value) {
            addCriterion("kpi_value =", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueNotEqualTo(Integer value) {
            addCriterion("kpi_value <>", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueGreaterThan(Integer value) {
            addCriterion("kpi_value >", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("kpi_value >=", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueLessThan(Integer value) {
            addCriterion("kpi_value <", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueLessThanOrEqualTo(Integer value) {
            addCriterion("kpi_value <=", value, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueIn(List<Integer> values) {
            addCriterion("kpi_value in", values, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueNotIn(List<Integer> values) {
            addCriterion("kpi_value not in", values, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueBetween(Integer value1, Integer value2) {
            addCriterion("kpi_value between", value1, value2, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValueNotBetween(Integer value1, Integer value2) {
            addCriterion("kpi_value not between", value1, value2, "kpiValue");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropIsNull() {
            addCriterion("kpi_value_prop is null");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropIsNotNull() {
            addCriterion("kpi_value_prop is not null");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropEqualTo(Float value) {
            addCriterion("kpi_value_prop =", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropNotEqualTo(Float value) {
            addCriterion("kpi_value_prop <>", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropGreaterThan(Float value) {
            addCriterion("kpi_value_prop >", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropGreaterThanOrEqualTo(Float value) {
            addCriterion("kpi_value_prop >=", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropLessThan(Float value) {
            addCriterion("kpi_value_prop <", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropLessThanOrEqualTo(Float value) {
            addCriterion("kpi_value_prop <=", value, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropIn(List<Float> values) {
            addCriterion("kpi_value_prop in", values, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropNotIn(List<Float> values) {
            addCriterion("kpi_value_prop not in", values, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropBetween(Float value1, Float value2) {
            addCriterion("kpi_value_prop between", value1, value2, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andKpiValuePropNotBetween(Float value1, Float value2) {
            addCriterion("kpi_value_prop not between", value1, value2, "kpiValueProp");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(String value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(String value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(String value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(String value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(String value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(String value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Like(String value) {
            addCriterion("type1 like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotLike(String value) {
            addCriterion("type1 not like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<String> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<String> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(String value1, String value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(String value1, String value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(String value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(String value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(String value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(String value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(String value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(String value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Like(String value) {
            addCriterion("type2 like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotLike(String value) {
            addCriterion("type2 not like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<String> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<String> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(String value1, String value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(String value1, String value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType3IsNull() {
            addCriterion("type3 is null");
            return (Criteria) this;
        }

        public Criteria andType3IsNotNull() {
            addCriterion("type3 is not null");
            return (Criteria) this;
        }

        public Criteria andType3EqualTo(String value) {
            addCriterion("type3 =", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotEqualTo(String value) {
            addCriterion("type3 <>", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThan(String value) {
            addCriterion("type3 >", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3GreaterThanOrEqualTo(String value) {
            addCriterion("type3 >=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThan(String value) {
            addCriterion("type3 <", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3LessThanOrEqualTo(String value) {
            addCriterion("type3 <=", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3Like(String value) {
            addCriterion("type3 like", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotLike(String value) {
            addCriterion("type3 not like", value, "type3");
            return (Criteria) this;
        }

        public Criteria andType3In(List<String> values) {
            addCriterion("type3 in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotIn(List<String> values) {
            addCriterion("type3 not in", values, "type3");
            return (Criteria) this;
        }

        public Criteria andType3Between(String value1, String value2) {
            addCriterion("type3 between", value1, value2, "type3");
            return (Criteria) this;
        }

        public Criteria andType3NotBetween(String value1, String value2) {
            addCriterion("type3 not between", value1, value2, "type3");
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