package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JsyxyxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JsyxyxxExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andJsybhIsNull() {
            addCriterion("JSYBH is null");
            return (Criteria) this;
        }

        public Criteria andJsybhIsNotNull() {
            addCriterion("JSYBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsybhEqualTo(String value) {
            addCriterion("JSYBH =", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhNotEqualTo(String value) {
            addCriterion("JSYBH <>", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhGreaterThan(String value) {
            addCriterion("JSYBH >", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhGreaterThanOrEqualTo(String value) {
            addCriterion("JSYBH >=", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhLessThan(String value) {
            addCriterion("JSYBH <", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhLessThanOrEqualTo(String value) {
            addCriterion("JSYBH <=", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhLike(String value) {
            addCriterion("JSYBH like", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhNotLike(String value) {
            addCriterion("JSYBH not like", value, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhIn(List<String> values) {
            addCriterion("JSYBH in", values, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhNotIn(List<String> values) {
            addCriterion("JSYBH not in", values, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhBetween(String value1, String value2) {
            addCriterion("JSYBH between", value1, value2, "jsybh");
            return (Criteria) this;
        }

        public Criteria andJsybhNotBetween(String value1, String value2) {
            addCriterion("JSYBH not between", value1, value2, "jsybh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXydjIsNull() {
            addCriterion("XYDJ is null");
            return (Criteria) this;
        }

        public Criteria andXydjIsNotNull() {
            addCriterion("XYDJ is not null");
            return (Criteria) this;
        }

        public Criteria andXydjEqualTo(String value) {
            addCriterion("XYDJ =", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotEqualTo(String value) {
            addCriterion("XYDJ <>", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjGreaterThan(String value) {
            addCriterion("XYDJ >", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjGreaterThanOrEqualTo(String value) {
            addCriterion("XYDJ >=", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLessThan(String value) {
            addCriterion("XYDJ <", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLessThanOrEqualTo(String value) {
            addCriterion("XYDJ <=", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLike(String value) {
            addCriterion("XYDJ like", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotLike(String value) {
            addCriterion("XYDJ not like", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjIn(List<String> values) {
            addCriterion("XYDJ in", values, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotIn(List<String> values) {
            addCriterion("XYDJ not in", values, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjBetween(String value1, String value2) {
            addCriterion("XYDJ between", value1, value2, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotBetween(String value1, String value2) {
            addCriterion("XYDJ not between", value1, value2, "xydj");
            return (Criteria) this;
        }

        public Criteria andKhrqIsNull() {
            addCriterion("KHRQ is null");
            return (Criteria) this;
        }

        public Criteria andKhrqIsNotNull() {
            addCriterion("KHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKhrqEqualTo(Date value) {
            addCriterionForJDBCDate("KHRQ =", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("KHRQ <>", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqGreaterThan(Date value) {
            addCriterionForJDBCDate("KHRQ >", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KHRQ >=", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqLessThan(Date value) {
            addCriterionForJDBCDate("KHRQ <", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KHRQ <=", value, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqIn(List<Date> values) {
            addCriterionForJDBCDate("KHRQ in", values, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("KHRQ not in", values, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KHRQ between", value1, value2, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KHRQ not between", value1, value2, "khrq");
            return (Criteria) this;
        }

        public Criteria andKhjgIsNull() {
            addCriterion("KHJG is null");
            return (Criteria) this;
        }

        public Criteria andKhjgIsNotNull() {
            addCriterion("KHJG is not null");
            return (Criteria) this;
        }

        public Criteria andKhjgEqualTo(String value) {
            addCriterion("KHJG =", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgNotEqualTo(String value) {
            addCriterion("KHJG <>", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgGreaterThan(String value) {
            addCriterion("KHJG >", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgGreaterThanOrEqualTo(String value) {
            addCriterion("KHJG >=", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgLessThan(String value) {
            addCriterion("KHJG <", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgLessThanOrEqualTo(String value) {
            addCriterion("KHJG <=", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgLike(String value) {
            addCriterion("KHJG like", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgNotLike(String value) {
            addCriterion("KHJG not like", value, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgIn(List<String> values) {
            addCriterion("KHJG in", values, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgNotIn(List<String> values) {
            addCriterion("KHJG not in", values, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgBetween(String value1, String value2) {
            addCriterion("KHJG between", value1, value2, "khjg");
            return (Criteria) this;
        }

        public Criteria andKhjgNotBetween(String value1, String value2) {
            addCriterion("KHJG not between", value1, value2, "khjg");
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