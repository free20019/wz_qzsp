package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClsqxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClsqxxExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andJdcsyrbhIsNull() {
            addCriterion("JDCSYRBH is null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhIsNotNull() {
            addCriterion("JDCSYRBH is not null");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhEqualTo(String value) {
            addCriterion("JDCSYRBH =", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhNotEqualTo(String value) {
            addCriterion("JDCSYRBH <>", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhGreaterThan(String value) {
            addCriterion("JDCSYRBH >", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhGreaterThanOrEqualTo(String value) {
            addCriterion("JDCSYRBH >=", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhLessThan(String value) {
            addCriterion("JDCSYRBH <", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhLessThanOrEqualTo(String value) {
            addCriterion("JDCSYRBH <=", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhLike(String value) {
            addCriterion("JDCSYRBH like", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhNotLike(String value) {
            addCriterion("JDCSYRBH not like", value, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhIn(List<String> values) {
            addCriterion("JDCSYRBH in", values, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhNotIn(List<String> values) {
            addCriterion("JDCSYRBH not in", values, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhBetween(String value1, String value2) {
            addCriterion("JDCSYRBH between", value1, value2, "jdcsyrbh");
            return (Criteria) this;
        }

        public Criteria andJdcsyrbhNotBetween(String value1, String value2) {
            addCriterion("JDCSYRBH not between", value1, value2, "jdcsyrbh");
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

        public Criteria andClbhIsNull() {
            addCriterion("CLBH is null");
            return (Criteria) this;
        }

        public Criteria andClbhIsNotNull() {
            addCriterion("CLBH is not null");
            return (Criteria) this;
        }

        public Criteria andClbhEqualTo(String value) {
            addCriterion("CLBH =", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhNotEqualTo(String value) {
            addCriterion("CLBH <>", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhGreaterThan(String value) {
            addCriterion("CLBH >", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhGreaterThanOrEqualTo(String value) {
            addCriterion("CLBH >=", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhLessThan(String value) {
            addCriterion("CLBH <", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhLessThanOrEqualTo(String value) {
            addCriterion("CLBH <=", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhLike(String value) {
            addCriterion("CLBH like", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhNotLike(String value) {
            addCriterion("CLBH not like", value, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhIn(List<String> values) {
            addCriterion("CLBH in", values, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhNotIn(List<String> values) {
            addCriterion("CLBH not in", values, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhBetween(String value1, String value2) {
            addCriterion("CLBH between", value1, value2, "clbh");
            return (Criteria) this;
        }

        public Criteria andClbhNotBetween(String value1, String value2) {
            addCriterion("CLBH not between", value1, value2, "clbh");
            return (Criteria) this;
        }

        public Criteria andCphmIsNull() {
            addCriterion("CPHM is null");
            return (Criteria) this;
        }

        public Criteria andCphmIsNotNull() {
            addCriterion("CPHM is not null");
            return (Criteria) this;
        }

        public Criteria andCphmEqualTo(String value) {
            addCriterion("CPHM =", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotEqualTo(String value) {
            addCriterion("CPHM <>", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmGreaterThan(String value) {
            addCriterion("CPHM >", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmGreaterThanOrEqualTo(String value) {
            addCriterion("CPHM >=", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLessThan(String value) {
            addCriterion("CPHM <", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLessThanOrEqualTo(String value) {
            addCriterion("CPHM <=", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmLike(String value) {
            addCriterion("CPHM like", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotLike(String value) {
            addCriterion("CPHM not like", value, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmIn(List<String> values) {
            addCriterion("CPHM in", values, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotIn(List<String> values) {
            addCriterion("CPHM not in", values, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmBetween(String value1, String value2) {
            addCriterion("CPHM between", value1, value2, "cphm");
            return (Criteria) this;
        }

        public Criteria andCphmNotBetween(String value1, String value2) {
            addCriterion("CPHM not between", value1, value2, "cphm");
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

        public Criteria andYgjzsyjIsNull() {
            addCriterion("YGJZSYJ is null");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjIsNotNull() {
            addCriterion("YGJZSYJ is not null");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjEqualTo(String value) {
            addCriterion("YGJZSYJ =", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjNotEqualTo(String value) {
            addCriterion("YGJZSYJ <>", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjGreaterThan(String value) {
            addCriterion("YGJZSYJ >", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjGreaterThanOrEqualTo(String value) {
            addCriterion("YGJZSYJ >=", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjLessThan(String value) {
            addCriterion("YGJZSYJ <", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjLessThanOrEqualTo(String value) {
            addCriterion("YGJZSYJ <=", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjLike(String value) {
            addCriterion("YGJZSYJ like", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjNotLike(String value) {
            addCriterion("YGJZSYJ not like", value, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjIn(List<String> values) {
            addCriterion("YGJZSYJ in", values, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjNotIn(List<String> values) {
            addCriterion("YGJZSYJ not in", values, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjBetween(String value1, String value2) {
            addCriterion("YGJZSYJ between", value1, value2, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andYgjzsyjNotBetween(String value1, String value2) {
            addCriterion("YGJZSYJ not between", value1, value2, "ygjzsyj");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhIsNull() {
            addCriterion("WYCYSLZMBH is null");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhIsNotNull() {
            addCriterion("WYCYSLZMBH is not null");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhEqualTo(String value) {
            addCriterion("WYCYSLZMBH =", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhNotEqualTo(String value) {
            addCriterion("WYCYSLZMBH <>", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhGreaterThan(String value) {
            addCriterion("WYCYSLZMBH >", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhGreaterThanOrEqualTo(String value) {
            addCriterion("WYCYSLZMBH >=", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhLessThan(String value) {
            addCriterion("WYCYSLZMBH <", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhLessThanOrEqualTo(String value) {
            addCriterion("WYCYSLZMBH <=", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhLike(String value) {
            addCriterion("WYCYSLZMBH like", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhNotLike(String value) {
            addCriterion("WYCYSLZMBH not like", value, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhIn(List<String> values) {
            addCriterion("WYCYSLZMBH in", values, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhNotIn(List<String> values) {
            addCriterion("WYCYSLZMBH not in", values, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhBetween(String value1, String value2) {
            addCriterion("WYCYSLZMBH between", value1, value2, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmbhNotBetween(String value1, String value2) {
            addCriterion("WYCYSLZMBH not between", value1, value2, "wycyslzmbh");
            return (Criteria) this;
        }

        public Criteria andWycyslzmIsNull() {
            addCriterion("WYCYSLZM is null");
            return (Criteria) this;
        }

        public Criteria andWycyslzmIsNotNull() {
            addCriterion("WYCYSLZM is not null");
            return (Criteria) this;
        }

        public Criteria andWycyslzmEqualTo(String value) {
            addCriterion("WYCYSLZM =", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmNotEqualTo(String value) {
            addCriterion("WYCYSLZM <>", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmGreaterThan(String value) {
            addCriterion("WYCYSLZM >", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmGreaterThanOrEqualTo(String value) {
            addCriterion("WYCYSLZM >=", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmLessThan(String value) {
            addCriterion("WYCYSLZM <", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmLessThanOrEqualTo(String value) {
            addCriterion("WYCYSLZM <=", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmLike(String value) {
            addCriterion("WYCYSLZM like", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmNotLike(String value) {
            addCriterion("WYCYSLZM not like", value, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmIn(List<String> values) {
            addCriterion("WYCYSLZM in", values, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmNotIn(List<String> values) {
            addCriterion("WYCYSLZM not in", values, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmBetween(String value1, String value2) {
            addCriterion("WYCYSLZM between", value1, value2, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andWycyslzmNotBetween(String value1, String value2) {
            addCriterion("WYCYSLZM not between", value1, value2, "wycyslzm");
            return (Criteria) this;
        }

        public Criteria andDxqrztIsNull() {
            addCriterion("DXQRZT is null");
            return (Criteria) this;
        }

        public Criteria andDxqrztIsNotNull() {
            addCriterion("DXQRZT is not null");
            return (Criteria) this;
        }

        public Criteria andDxqrztEqualTo(String value) {
            addCriterion("DXQRZT =", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztNotEqualTo(String value) {
            addCriterion("DXQRZT <>", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztGreaterThan(String value) {
            addCriterion("DXQRZT >", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztGreaterThanOrEqualTo(String value) {
            addCriterion("DXQRZT >=", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztLessThan(String value) {
            addCriterion("DXQRZT <", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztLessThanOrEqualTo(String value) {
            addCriterion("DXQRZT <=", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztLike(String value) {
            addCriterion("DXQRZT like", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztNotLike(String value) {
            addCriterion("DXQRZT not like", value, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztIn(List<String> values) {
            addCriterion("DXQRZT in", values, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztNotIn(List<String> values) {
            addCriterion("DXQRZT not in", values, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztBetween(String value1, String value2) {
            addCriterion("DXQRZT between", value1, value2, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andDxqrztNotBetween(String value1, String value2) {
            addCriterion("DXQRZT not between", value1, value2, "dxqrzt");
            return (Criteria) this;
        }

        public Criteria andXgryIsNull() {
            addCriterion("XGRY is null");
            return (Criteria) this;
        }

        public Criteria andXgryIsNotNull() {
            addCriterion("XGRY is not null");
            return (Criteria) this;
        }

        public Criteria andXgryEqualTo(String value) {
            addCriterion("XGRY =", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryNotEqualTo(String value) {
            addCriterion("XGRY <>", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryGreaterThan(String value) {
            addCriterion("XGRY >", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryGreaterThanOrEqualTo(String value) {
            addCriterion("XGRY >=", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryLessThan(String value) {
            addCriterion("XGRY <", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryLessThanOrEqualTo(String value) {
            addCriterion("XGRY <=", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryLike(String value) {
            addCriterion("XGRY like", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryNotLike(String value) {
            addCriterion("XGRY not like", value, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryIn(List<String> values) {
            addCriterion("XGRY in", values, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryNotIn(List<String> values) {
            addCriterion("XGRY not in", values, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryBetween(String value1, String value2) {
            addCriterion("XGRY between", value1, value2, "xgry");
            return (Criteria) this;
        }

        public Criteria andXgryNotBetween(String value1, String value2) {
            addCriterion("XGRY not between", value1, value2, "xgry");
            return (Criteria) this;
        }

        public Criteria andZxxgsjIsNull() {
            addCriterion("ZXXGSJ is null");
            return (Criteria) this;
        }

        public Criteria andZxxgsjIsNotNull() {
            addCriterion("ZXXGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZxxgsjEqualTo(Date value) {
            addCriterionForJDBCDate("ZXXGSJ =", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("ZXXGSJ <>", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjGreaterThan(Date value) {
            addCriterionForJDBCDate("ZXXGSJ >", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZXXGSJ >=", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjLessThan(Date value) {
            addCriterionForJDBCDate("ZXXGSJ <", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ZXXGSJ <=", value, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjIn(List<Date> values) {
            addCriterionForJDBCDate("ZXXGSJ in", values, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("ZXXGSJ not in", values, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZXXGSJ between", value1, value2, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ZXXGSJ not between", value1, value2, "zxxgsj");
            return (Criteria) this;
        }

        public Criteria andZxxgjlIsNull() {
            addCriterion("ZXXGJL is null");
            return (Criteria) this;
        }

        public Criteria andZxxgjlIsNotNull() {
            addCriterion("ZXXGJL is not null");
            return (Criteria) this;
        }

        public Criteria andZxxgjlEqualTo(String value) {
            addCriterion("ZXXGJL =", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlNotEqualTo(String value) {
            addCriterion("ZXXGJL <>", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlGreaterThan(String value) {
            addCriterion("ZXXGJL >", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlGreaterThanOrEqualTo(String value) {
            addCriterion("ZXXGJL >=", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlLessThan(String value) {
            addCriterion("ZXXGJL <", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlLessThanOrEqualTo(String value) {
            addCriterion("ZXXGJL <=", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlLike(String value) {
            addCriterion("ZXXGJL like", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlNotLike(String value) {
            addCriterion("ZXXGJL not like", value, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlIn(List<String> values) {
            addCriterion("ZXXGJL in", values, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlNotIn(List<String> values) {
            addCriterion("ZXXGJL not in", values, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlBetween(String value1, String value2) {
            addCriterion("ZXXGJL between", value1, value2, "zxxgjl");
            return (Criteria) this;
        }

        public Criteria andZxxgjlNotBetween(String value1, String value2) {
            addCriterion("ZXXGJL not between", value1, value2, "zxxgjl");
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