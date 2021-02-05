package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JsysqxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JsysqxxExample() {
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

        public Criteria andSqbhIsNull() {
            addCriterion("SQBH is null");
            return (Criteria) this;
        }

        public Criteria andSqbhIsNotNull() {
            addCriterion("SQBH is not null");
            return (Criteria) this;
        }

        public Criteria andSqbhEqualTo(String value) {
            addCriterion("SQBH =", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhNotEqualTo(String value) {
            addCriterion("SQBH <>", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhGreaterThan(String value) {
            addCriterion("SQBH >", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhGreaterThanOrEqualTo(String value) {
            addCriterion("SQBH >=", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhLessThan(String value) {
            addCriterion("SQBH <", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhLessThanOrEqualTo(String value) {
            addCriterion("SQBH <=", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhLike(String value) {
            addCriterion("SQBH like", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhNotLike(String value) {
            addCriterion("SQBH not like", value, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhIn(List<String> values) {
            addCriterion("SQBH in", values, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhNotIn(List<String> values) {
            addCriterion("SQBH not in", values, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhBetween(String value1, String value2) {
            addCriterion("SQBH between", value1, value2, "sqbh");
            return (Criteria) this;
        }

        public Criteria andSqbhNotBetween(String value1, String value2) {
            addCriterion("SQBH not between", value1, value2, "sqbh");
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

        public Criteria andSqlxIsNull() {
            addCriterion("SQLX is null");
            return (Criteria) this;
        }

        public Criteria andSqlxIsNotNull() {
            addCriterion("SQLX is not null");
            return (Criteria) this;
        }

        public Criteria andSqlxEqualTo(String value) {
            addCriterion("SQLX =", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotEqualTo(String value) {
            addCriterion("SQLX <>", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxGreaterThan(String value) {
            addCriterion("SQLX >", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxGreaterThanOrEqualTo(String value) {
            addCriterion("SQLX >=", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLessThan(String value) {
            addCriterion("SQLX <", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLessThanOrEqualTo(String value) {
            addCriterion("SQLX <=", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLike(String value) {
            addCriterion("SQLX like", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotLike(String value) {
            addCriterion("SQLX not like", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxIn(List<String> values) {
            addCriterion("SQLX in", values, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotIn(List<String> values) {
            addCriterion("SQLX not in", values, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxBetween(String value1, String value2) {
            addCriterion("SQLX between", value1, value2, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotBetween(String value1, String value2) {
            addCriterion("SQLX not between", value1, value2, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqztIsNull() {
            addCriterion("SQZT is null");
            return (Criteria) this;
        }

        public Criteria andSqztIsNotNull() {
            addCriterion("SQZT is not null");
            return (Criteria) this;
        }

        public Criteria andSqztEqualTo(String value) {
            addCriterion("SQZT =", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztNotEqualTo(String value) {
            addCriterion("SQZT <>", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztGreaterThan(String value) {
            addCriterion("SQZT >", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztGreaterThanOrEqualTo(String value) {
            addCriterion("SQZT >=", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztLessThan(String value) {
            addCriterion("SQZT <", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztLessThanOrEqualTo(String value) {
            addCriterion("SQZT <=", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztLike(String value) {
            addCriterion("SQZT like", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztNotLike(String value) {
            addCriterion("SQZT not like", value, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztIn(List<String> values) {
            addCriterion("SQZT in", values, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztNotIn(List<String> values) {
            addCriterion("SQZT not in", values, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztBetween(String value1, String value2) {
            addCriterion("SQZT between", value1, value2, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqztNotBetween(String value1, String value2) {
            addCriterion("SQZT not between", value1, value2, "sqzt");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNull() {
            addCriterion("SQRQ is null");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNotNull() {
            addCriterion("SQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqrqEqualTo(Date value) {
            addCriterionForJDBCDate("SQRQ =", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("SQRQ <>", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThan(Date value) {
            addCriterionForJDBCDate("SQRQ >", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQRQ >=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThan(Date value) {
            addCriterionForJDBCDate("SQRQ <", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SQRQ <=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqIn(List<Date> values) {
            addCriterionForJDBCDate("SQRQ in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("SQRQ not in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQRQ between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SQRQ not between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andCgscsyjIsNull() {
            addCriterion("CGSCSYJ is null");
            return (Criteria) this;
        }

        public Criteria andCgscsyjIsNotNull() {
            addCriterion("CGSCSYJ is not null");
            return (Criteria) this;
        }

        public Criteria andCgscsyjEqualTo(String value) {
            addCriterion("CGSCSYJ =", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjNotEqualTo(String value) {
            addCriterion("CGSCSYJ <>", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjGreaterThan(String value) {
            addCriterion("CGSCSYJ >", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjGreaterThanOrEqualTo(String value) {
            addCriterion("CGSCSYJ >=", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjLessThan(String value) {
            addCriterion("CGSCSYJ <", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjLessThanOrEqualTo(String value) {
            addCriterion("CGSCSYJ <=", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjLike(String value) {
            addCriterion("CGSCSYJ like", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjNotLike(String value) {
            addCriterion("CGSCSYJ not like", value, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjIn(List<String> values) {
            addCriterion("CGSCSYJ in", values, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjNotIn(List<String> values) {
            addCriterion("CGSCSYJ not in", values, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjBetween(String value1, String value2) {
            addCriterion("CGSCSYJ between", value1, value2, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andCgscsyjNotBetween(String value1, String value2) {
            addCriterion("CGSCSYJ not between", value1, value2, "cgscsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjIsNull() {
            addCriterion("YGJCSYJ is null");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjIsNotNull() {
            addCriterion("YGJCSYJ is not null");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjEqualTo(String value) {
            addCriterion("YGJCSYJ =", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjNotEqualTo(String value) {
            addCriterion("YGJCSYJ <>", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjGreaterThan(String value) {
            addCriterion("YGJCSYJ >", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjGreaterThanOrEqualTo(String value) {
            addCriterion("YGJCSYJ >=", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjLessThan(String value) {
            addCriterion("YGJCSYJ <", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjLessThanOrEqualTo(String value) {
            addCriterion("YGJCSYJ <=", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjLike(String value) {
            addCriterion("YGJCSYJ like", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjNotLike(String value) {
            addCriterion("YGJCSYJ not like", value, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjIn(List<String> values) {
            addCriterion("YGJCSYJ in", values, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjNotIn(List<String> values) {
            addCriterion("YGJCSYJ not in", values, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjBetween(String value1, String value2) {
            addCriterion("YGJCSYJ between", value1, value2, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andYgjcsyjNotBetween(String value1, String value2) {
            addCriterion("YGJCSYJ not between", value1, value2, "ygjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjIsNull() {
            addCriterion("ZAFJCSYJ is null");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjIsNotNull() {
            addCriterion("ZAFJCSYJ is not null");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjEqualTo(String value) {
            addCriterion("ZAFJCSYJ =", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjNotEqualTo(String value) {
            addCriterion("ZAFJCSYJ <>", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjGreaterThan(String value) {
            addCriterion("ZAFJCSYJ >", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjGreaterThanOrEqualTo(String value) {
            addCriterion("ZAFJCSYJ >=", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjLessThan(String value) {
            addCriterion("ZAFJCSYJ <", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjLessThanOrEqualTo(String value) {
            addCriterion("ZAFJCSYJ <=", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjLike(String value) {
            addCriterion("ZAFJCSYJ like", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjNotLike(String value) {
            addCriterion("ZAFJCSYJ not like", value, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjIn(List<String> values) {
            addCriterion("ZAFJCSYJ in", values, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjNotIn(List<String> values) {
            addCriterion("ZAFJCSYJ not in", values, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjBetween(String value1, String value2) {
            addCriterion("ZAFJCSYJ between", value1, value2, "zafjcsyj");
            return (Criteria) this;
        }

        public Criteria andZafjcsyjNotBetween(String value1, String value2) {
            addCriterion("ZAFJCSYJ not between", value1, value2, "zafjcsyj");
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