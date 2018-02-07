package com.student.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class IndexMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexMessageExample() {
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

        public Criteria andInfoNameIsNull() {
            addCriterion("info_name is null");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNotNull() {
            addCriterion("info_name is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNameEqualTo(String value) {
            addCriterion("info_name =", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotEqualTo(String value) {
            addCriterion("info_name <>", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThan(String value) {
            addCriterion("info_name >", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("info_name >=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThan(String value) {
            addCriterion("info_name <", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThanOrEqualTo(String value) {
            addCriterion("info_name <=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLike(String value) {
            addCriterion("info_name like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotLike(String value) {
            addCriterion("info_name not like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameIn(List<String> values) {
            addCriterion("info_name in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotIn(List<String> values) {
            addCriterion("info_name not in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameBetween(String value1, String value2) {
            addCriterion("info_name between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotBetween(String value1, String value2) {
            addCriterion("info_name not between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNumIsNull() {
            addCriterion("info_num is null");
            return (Criteria) this;
        }

        public Criteria andInfoNumIsNotNull() {
            addCriterion("info_num is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNumEqualTo(Integer value) {
            addCriterion("info_num =", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotEqualTo(Integer value) {
            addCriterion("info_num <>", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumGreaterThan(Integer value) {
            addCriterion("info_num >", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_num >=", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumLessThan(Integer value) {
            addCriterion("info_num <", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumLessThanOrEqualTo(Integer value) {
            addCriterion("info_num <=", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumIn(List<Integer> values) {
            addCriterion("info_num in", values, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotIn(List<Integer> values) {
            addCriterion("info_num not in", values, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumBetween(Integer value1, Integer value2) {
            addCriterion("info_num between", value1, value2, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("info_num not between", value1, value2, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoPropIsNull() {
            addCriterion("info_prop is null");
            return (Criteria) this;
        }

        public Criteria andInfoPropIsNotNull() {
            addCriterion("info_prop is not null");
            return (Criteria) this;
        }

        public Criteria andInfoPropEqualTo(Float value) {
            addCriterion("info_prop =", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropNotEqualTo(Float value) {
            addCriterion("info_prop <>", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropGreaterThan(Float value) {
            addCriterion("info_prop >", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropGreaterThanOrEqualTo(Float value) {
            addCriterion("info_prop >=", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropLessThan(Float value) {
            addCriterion("info_prop <", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropLessThanOrEqualTo(Float value) {
            addCriterion("info_prop <=", value, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropIn(List<Float> values) {
            addCriterion("info_prop in", values, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropNotIn(List<Float> values) {
            addCriterion("info_prop not in", values, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropBetween(Float value1, Float value2) {
            addCriterion("info_prop between", value1, value2, "infoProp");
            return (Criteria) this;
        }

        public Criteria andInfoPropNotBetween(Float value1, Float value2) {
            addCriterion("info_prop not between", value1, value2, "infoProp");
            return (Criteria) this;
        }

        public Criteria andIndoTypeIsNull() {
            addCriterion("indo_type is null");
            return (Criteria) this;
        }

        public Criteria andIndoTypeIsNotNull() {
            addCriterion("indo_type is not null");
            return (Criteria) this;
        }

        public Criteria andIndoTypeEqualTo(Integer value) {
            addCriterion("indo_type =", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeNotEqualTo(Integer value) {
            addCriterion("indo_type <>", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeGreaterThan(Integer value) {
            addCriterion("indo_type >", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("indo_type >=", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeLessThan(Integer value) {
            addCriterion("indo_type <", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("indo_type <=", value, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeIn(List<Integer> values) {
            addCriterion("indo_type in", values, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeNotIn(List<Integer> values) {
            addCriterion("indo_type not in", values, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeBetween(Integer value1, Integer value2) {
            addCriterion("indo_type between", value1, value2, "indoType");
            return (Criteria) this;
        }

        public Criteria andIndoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("indo_type not between", value1, value2, "indoType");
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