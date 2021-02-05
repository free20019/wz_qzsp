package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JsyjcxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JsyjcxxExample() {
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

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("GJ is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("GJ is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("GJ =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("GJ <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("GJ >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("GJ >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("GJ <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("GJ <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLike(String value) {
            addCriterion("GJ like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotLike(String value) {
            addCriterion("GJ not like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("GJ in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("GJ not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("GJ between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("GJ not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andZzIsNull() {
            addCriterion("ZZ is null");
            return (Criteria) this;
        }

        public Criteria andZzIsNotNull() {
            addCriterion("ZZ is not null");
            return (Criteria) this;
        }

        public Criteria andZzEqualTo(String value) {
            addCriterion("ZZ =", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotEqualTo(String value) {
            addCriterion("ZZ <>", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThan(String value) {
            addCriterion("ZZ >", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzGreaterThanOrEqualTo(String value) {
            addCriterion("ZZ >=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThan(String value) {
            addCriterion("ZZ <", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLessThanOrEqualTo(String value) {
            addCriterion("ZZ <=", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzLike(String value) {
            addCriterion("ZZ like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotLike(String value) {
            addCriterion("ZZ not like", value, "zz");
            return (Criteria) this;
        }

        public Criteria andZzIn(List<String> values) {
            addCriterion("ZZ in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotIn(List<String> values) {
            addCriterion("ZZ not in", values, "zz");
            return (Criteria) this;
        }

        public Criteria andZzBetween(String value1, String value2) {
            addCriterion("ZZ between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andZzNotBetween(String value1, String value2) {
            addCriterion("ZZ not between", value1, value2, "zz");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNull() {
            addCriterion("ZJLX is null");
            return (Criteria) this;
        }

        public Criteria andZjlxIsNotNull() {
            addCriterion("ZJLX is not null");
            return (Criteria) this;
        }

        public Criteria andZjlxEqualTo(String value) {
            addCriterion("ZJLX =", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotEqualTo(String value) {
            addCriterion("ZJLX <>", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThan(String value) {
            addCriterion("ZJLX >", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxGreaterThanOrEqualTo(String value) {
            addCriterion("ZJLX >=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThan(String value) {
            addCriterion("ZJLX <", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLessThanOrEqualTo(String value) {
            addCriterion("ZJLX <=", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxLike(String value) {
            addCriterion("ZJLX like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotLike(String value) {
            addCriterion("ZJLX not like", value, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxIn(List<String> values) {
            addCriterion("ZJLX in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotIn(List<String> values) {
            addCriterion("ZJLX not in", values, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxBetween(String value1, String value2) {
            addCriterion("ZJLX between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjlxNotBetween(String value1, String value2) {
            addCriterion("ZJLX not between", value1, value2, "zjlx");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("ZJHM is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("ZJHM is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("ZJHM =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("ZJHM <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("ZJHM >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("ZJHM >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("ZJHM <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("ZJHM <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("ZJHM like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("ZJHM not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("ZJHM in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("ZJHM not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("ZJHM between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("ZJHM not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andSfzjIsNull() {
            addCriterion("SFZJ is null");
            return (Criteria) this;
        }

        public Criteria andSfzjIsNotNull() {
            addCriterion("SFZJ is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjEqualTo(String value) {
            addCriterion("SFZJ =", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjNotEqualTo(String value) {
            addCriterion("SFZJ <>", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjGreaterThan(String value) {
            addCriterion("SFZJ >", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJ >=", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjLessThan(String value) {
            addCriterion("SFZJ <", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjLessThanOrEqualTo(String value) {
            addCriterion("SFZJ <=", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjLike(String value) {
            addCriterion("SFZJ like", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjNotLike(String value) {
            addCriterion("SFZJ not like", value, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjIn(List<String> values) {
            addCriterion("SFZJ in", values, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjNotIn(List<String> values) {
            addCriterion("SFZJ not in", values, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjBetween(String value1, String value2) {
            addCriterion("SFZJ between", value1, value2, "sfzj");
            return (Criteria) this;
        }

        public Criteria andSfzjNotBetween(String value1, String value2) {
            addCriterion("SFZJ not between", value1, value2, "sfzj");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqIsNull() {
            addCriterion("JZZQFRQ is null");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqIsNotNull() {
            addCriterion("JZZQFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqEqualTo(Date value) {
            addCriterionForJDBCDate("JZZQFRQ =", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JZZQFRQ <>", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JZZQFRQ >", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZZQFRQ >=", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqLessThan(Date value) {
            addCriterionForJDBCDate("JZZQFRQ <", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZZQFRQ <=", value, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqIn(List<Date> values) {
            addCriterionForJDBCDate("JZZQFRQ in", values, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JZZQFRQ not in", values, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZZQFRQ between", value1, value2, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andJzzqfrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZZQFRQ not between", value1, value2, "jzzqfrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterionForJDBCDate("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterionForJDBCDate("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andJszhIsNull() {
            addCriterion("JSZH is null");
            return (Criteria) this;
        }

        public Criteria andJszhIsNotNull() {
            addCriterion("JSZH is not null");
            return (Criteria) this;
        }

        public Criteria andJszhEqualTo(String value) {
            addCriterion("JSZH =", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotEqualTo(String value) {
            addCriterion("JSZH <>", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhGreaterThan(String value) {
            addCriterion("JSZH >", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhGreaterThanOrEqualTo(String value) {
            addCriterion("JSZH >=", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLessThan(String value) {
            addCriterion("JSZH <", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLessThanOrEqualTo(String value) {
            addCriterion("JSZH <=", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLike(String value) {
            addCriterion("JSZH like", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotLike(String value) {
            addCriterion("JSZH not like", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhIn(List<String> values) {
            addCriterion("JSZH in", values, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotIn(List<String> values) {
            addCriterion("JSZH not in", values, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhBetween(String value1, String value2) {
            addCriterion("JSZH between", value1, value2, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotBetween(String value1, String value2) {
            addCriterion("JSZH not between", value1, value2, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszdabhIsNull() {
            addCriterion("JSZDABH is null");
            return (Criteria) this;
        }

        public Criteria andJszdabhIsNotNull() {
            addCriterion("JSZDABH is not null");
            return (Criteria) this;
        }

        public Criteria andJszdabhEqualTo(String value) {
            addCriterion("JSZDABH =", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhNotEqualTo(String value) {
            addCriterion("JSZDABH <>", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhGreaterThan(String value) {
            addCriterion("JSZDABH >", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhGreaterThanOrEqualTo(String value) {
            addCriterion("JSZDABH >=", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhLessThan(String value) {
            addCriterion("JSZDABH <", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhLessThanOrEqualTo(String value) {
            addCriterion("JSZDABH <=", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhLike(String value) {
            addCriterion("JSZDABH like", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhNotLike(String value) {
            addCriterion("JSZDABH not like", value, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhIn(List<String> values) {
            addCriterion("JSZDABH in", values, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhNotIn(List<String> values) {
            addCriterion("JSZDABH not in", values, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhBetween(String value1, String value2) {
            addCriterion("JSZDABH between", value1, value2, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszdabhNotBetween(String value1, String value2) {
            addCriterion("JSZDABH not between", value1, value2, "jszdabh");
            return (Criteria) this;
        }

        public Criteria andJszjIsNull() {
            addCriterion("JSZJ is null");
            return (Criteria) this;
        }

        public Criteria andJszjIsNotNull() {
            addCriterion("JSZJ is not null");
            return (Criteria) this;
        }

        public Criteria andJszjEqualTo(String value) {
            addCriterion("JSZJ =", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjNotEqualTo(String value) {
            addCriterion("JSZJ <>", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjGreaterThan(String value) {
            addCriterion("JSZJ >", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjGreaterThanOrEqualTo(String value) {
            addCriterion("JSZJ >=", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjLessThan(String value) {
            addCriterion("JSZJ <", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjLessThanOrEqualTo(String value) {
            addCriterion("JSZJ <=", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjLike(String value) {
            addCriterion("JSZJ like", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjNotLike(String value) {
            addCriterion("JSZJ not like", value, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjIn(List<String> values) {
            addCriterion("JSZJ in", values, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjNotIn(List<String> values) {
            addCriterion("JSZJ not in", values, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjBetween(String value1, String value2) {
            addCriterion("JSZJ between", value1, value2, "jszj");
            return (Criteria) this;
        }

        public Criteria andJszjNotBetween(String value1, String value2) {
            addCriterion("JSZJ not between", value1, value2, "jszj");
            return (Criteria) this;
        }

        public Criteria andCljszrqIsNull() {
            addCriterion("CLJSZRQ is null");
            return (Criteria) this;
        }

        public Criteria andCljszrqIsNotNull() {
            addCriterion("CLJSZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCljszrqEqualTo(Date value) {
            addCriterionForJDBCDate("CLJSZRQ =", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLJSZRQ <>", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqGreaterThan(Date value) {
            addCriterionForJDBCDate("CLJSZRQ >", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLJSZRQ >=", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqLessThan(Date value) {
            addCriterionForJDBCDate("CLJSZRQ <", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLJSZRQ <=", value, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqIn(List<Date> values) {
            addCriterionForJDBCDate("CLJSZRQ in", values, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLJSZRQ not in", values, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLJSZRQ between", value1, value2, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andCljszrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLJSZRQ not between", value1, value2, "cljszrq");
            return (Criteria) this;
        }

        public Criteria andZjcxIsNull() {
            addCriterion("ZJCX is null");
            return (Criteria) this;
        }

        public Criteria andZjcxIsNotNull() {
            addCriterion("ZJCX is not null");
            return (Criteria) this;
        }

        public Criteria andZjcxEqualTo(String value) {
            addCriterion("ZJCX =", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxNotEqualTo(String value) {
            addCriterion("ZJCX <>", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxGreaterThan(String value) {
            addCriterion("ZJCX >", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxGreaterThanOrEqualTo(String value) {
            addCriterion("ZJCX >=", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxLessThan(String value) {
            addCriterion("ZJCX <", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxLessThanOrEqualTo(String value) {
            addCriterion("ZJCX <=", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxLike(String value) {
            addCriterion("ZJCX like", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxNotLike(String value) {
            addCriterion("ZJCX not like", value, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxIn(List<String> values) {
            addCriterion("ZJCX in", values, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxNotIn(List<String> values) {
            addCriterion("ZJCX not in", values, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxBetween(String value1, String value2) {
            addCriterion("ZJCX between", value1, value2, "zjcx");
            return (Criteria) this;
        }

        public Criteria andZjcxNotBetween(String value1, String value2) {
            addCriterion("ZJCX not between", value1, value2, "zjcx");
            return (Criteria) this;
        }

        public Criteria andJszyxqqIsNull() {
            addCriterion("JSZYXQQ is null");
            return (Criteria) this;
        }

        public Criteria andJszyxqqIsNotNull() {
            addCriterion("JSZYXQQ is not null");
            return (Criteria) this;
        }

        public Criteria andJszyxqqEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQQ =", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQQ <>", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqGreaterThan(Date value) {
            addCriterionForJDBCDate("JSZYXQQ >", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQQ >=", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqLessThan(Date value) {
            addCriterionForJDBCDate("JSZYXQQ <", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQQ <=", value, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqIn(List<Date> values) {
            addCriterionForJDBCDate("JSZYXQQ in", values, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JSZYXQQ not in", values, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSZYXQQ between", value1, value2, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSZYXQQ not between", value1, value2, "jszyxqq");
            return (Criteria) this;
        }

        public Criteria andJszyxqzIsNull() {
            addCriterion("JSZYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andJszyxqzIsNotNull() {
            addCriterion("JSZYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andJszyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQZ =", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQZ <>", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("JSZYXQZ >", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQZ >=", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzLessThan(Date value) {
            addCriterionForJDBCDate("JSZYXQZ <", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSZYXQZ <=", value, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("JSZYXQZ in", values, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("JSZYXQZ not in", values, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSZYXQZ between", value1, value2, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJszyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSZYXQZ not between", value1, value2, "jszyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzbhIsNull() {
            addCriterion("JSYZBH is null");
            return (Criteria) this;
        }

        public Criteria andJsyzbhIsNotNull() {
            addCriterion("JSYZBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsyzbhEqualTo(String value) {
            addCriterion("JSYZBH =", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhNotEqualTo(String value) {
            addCriterion("JSYZBH <>", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhGreaterThan(String value) {
            addCriterion("JSYZBH >", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSYZBH >=", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhLessThan(String value) {
            addCriterion("JSYZBH <", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhLessThanOrEqualTo(String value) {
            addCriterion("JSYZBH <=", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhLike(String value) {
            addCriterion("JSYZBH like", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhNotLike(String value) {
            addCriterion("JSYZBH not like", value, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhIn(List<String> values) {
            addCriterion("JSYZBH in", values, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhNotIn(List<String> values) {
            addCriterion("JSYZBH not in", values, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhBetween(String value1, String value2) {
            addCriterion("JSYZBH between", value1, value2, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andJsyzbhNotBetween(String value1, String value2) {
            addCriterion("JSYZBH not between", value1, value2, "jsyzbh");
            return (Criteria) this;
        }

        public Criteria andZpIsNull() {
            addCriterion("ZP is null");
            return (Criteria) this;
        }

        public Criteria andZpIsNotNull() {
            addCriterion("ZP is not null");
            return (Criteria) this;
        }

        public Criteria andZpEqualTo(String value) {
            addCriterion("ZP =", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotEqualTo(String value) {
            addCriterion("ZP <>", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThan(String value) {
            addCriterion("ZP >", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThanOrEqualTo(String value) {
            addCriterion("ZP >=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThan(String value) {
            addCriterion("ZP <", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThanOrEqualTo(String value) {
            addCriterion("ZP <=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLike(String value) {
            addCriterion("ZP like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotLike(String value) {
            addCriterion("ZP not like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpIn(List<String> values) {
            addCriterion("ZP in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotIn(List<String> values) {
            addCriterion("ZP not in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpBetween(String value1, String value2) {
            addCriterion("ZP between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotBetween(String value1, String value2) {
            addCriterion("ZP not between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("MZ is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("MZ is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("MZ =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("MZ <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("MZ >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("MZ >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("MZ <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("MZ <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("MZ like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("MZ not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("MZ in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("MZ not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("MZ between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("MZ not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("HYZK is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("HYZK is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("HYZK =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("HYZK <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("HYZK >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("HYZK >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("HYZK <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("HYZK <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("HYZK like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("HYZK not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("HYZK in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("HYZK not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("HYZK between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("HYZK not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andWynlIsNull() {
            addCriterion("WYNL is null");
            return (Criteria) this;
        }

        public Criteria andWynlIsNotNull() {
            addCriterion("WYNL is not null");
            return (Criteria) this;
        }

        public Criteria andWynlEqualTo(String value) {
            addCriterion("WYNL =", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlNotEqualTo(String value) {
            addCriterion("WYNL <>", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlGreaterThan(String value) {
            addCriterion("WYNL >", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlGreaterThanOrEqualTo(String value) {
            addCriterion("WYNL >=", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlLessThan(String value) {
            addCriterion("WYNL <", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlLessThanOrEqualTo(String value) {
            addCriterion("WYNL <=", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlLike(String value) {
            addCriterion("WYNL like", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlNotLike(String value) {
            addCriterion("WYNL not like", value, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlIn(List<String> values) {
            addCriterion("WYNL in", values, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlNotIn(List<String> values) {
            addCriterion("WYNL not in", values, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlBetween(String value1, String value2) {
            addCriterion("WYNL between", value1, value2, "wynl");
            return (Criteria) this;
        }

        public Criteria andWynlNotBetween(String value1, String value2) {
            addCriterion("WYNL not between", value1, value2, "wynl");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("SJHM is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("SJHM is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("SJHM =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("SJHM <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("SJHM >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("SJHM >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("SJHM <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("SJHM <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("SJHM like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("SJHM not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("SJHM in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("SJHM not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("SJHM between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("SJHM not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNull() {
            addCriterion("TXDZ is null");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNotNull() {
            addCriterion("TXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andTxdzEqualTo(String value) {
            addCriterion("TXDZ =", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotEqualTo(String value) {
            addCriterion("TXDZ <>", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThan(String value) {
            addCriterion("TXDZ >", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThanOrEqualTo(String value) {
            addCriterion("TXDZ >=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThan(String value) {
            addCriterion("TXDZ <", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThanOrEqualTo(String value) {
            addCriterion("TXDZ <=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLike(String value) {
            addCriterion("TXDZ like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotLike(String value) {
            addCriterion("TXDZ not like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzIn(List<String> values) {
            addCriterion("TXDZ in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotIn(List<String> values) {
            addCriterion("TXDZ not in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzBetween(String value1, String value2) {
            addCriterion("TXDZ between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotBetween(String value1, String value2) {
            addCriterion("TXDZ not between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("DZYX is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("DZYX is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("DZYX =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("DZYX <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("DZYX >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("DZYX >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("DZYX <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("DZYX <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("DZYX like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("DZYX not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("DZYX in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("DZYX not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("DZYX between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("DZYX not between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("YB is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("YB is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(String value) {
            addCriterion("YB =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(String value) {
            addCriterion("YB <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(String value) {
            addCriterion("YB >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(String value) {
            addCriterion("YB >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(String value) {
            addCriterion("YB <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(String value) {
            addCriterion("YB <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLike(String value) {
            addCriterion("YB like", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotLike(String value) {
            addCriterion("YB not like", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<String> values) {
            addCriterion("YB in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<String> values) {
            addCriterion("YB not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(String value1, String value2) {
            addCriterion("YB between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(String value1, String value2) {
            addCriterion("YB not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("XL is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("XL is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(String value) {
            addCriterion("XL =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(String value) {
            addCriterion("XL <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(String value) {
            addCriterion("XL >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(String value) {
            addCriterion("XL >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(String value) {
            addCriterion("XL <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(String value) {
            addCriterion("XL <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLike(String value) {
            addCriterion("XL like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotLike(String value) {
            addCriterion("XL not like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<String> values) {
            addCriterion("XL in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<String> values) {
            addCriterion("XL not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(String value1, String value2) {
            addCriterion("XL between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(String value1, String value2) {
            addCriterion("XL not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqIsNull() {
            addCriterion("JSYZCLRQ is null");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqIsNotNull() {
            addCriterion("JSYZCLRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ =", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ <>", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ >", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ >=", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqLessThan(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ <", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZCLRQ <=", value, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqIn(List<Date> values) {
            addCriterionForJDBCDate("JSYZCLRQ in", values, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JSYZCLRQ not in", values, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSYZCLRQ between", value1, value2, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andJsyzclrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSYZCLRQ not between", value1, value2, "jsyzclrq");
            return (Criteria) this;
        }

        public Criteria andFzrqIsNull() {
            addCriterion("FZRQ is null");
            return (Criteria) this;
        }

        public Criteria andFzrqIsNotNull() {
            addCriterion("FZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andFzrqEqualTo(Date value) {
            addCriterionForJDBCDate("FZRQ =", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("FZRQ <>", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("FZRQ >", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FZRQ >=", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqLessThan(Date value) {
            addCriterionForJDBCDate("FZRQ <", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FZRQ <=", value, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqIn(List<Date> values) {
            addCriterionForJDBCDate("FZRQ in", values, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("FZRQ not in", values, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FZRQ between", value1, value2, "fzrq");
            return (Criteria) this;
        }

        public Criteria andFzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FZRQ not between", value1, value2, "fzrq");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzIsNull() {
            addCriterion("JSYZYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzIsNotNull() {
            addCriterion("JSYZYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ =", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ <>", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ >", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ >=", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzLessThan(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ <", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JSYZYXQZ <=", value, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("JSYZYXQZ in", values, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("JSYZYXQZ not in", values, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSYZYXQZ between", value1, value2, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JSYZYXQZ not between", value1, value2, "jsyzyxqz");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgIsNull() {
            addCriterion("JSYZFZJG is null");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgIsNotNull() {
            addCriterion("JSYZFZJG is not null");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgEqualTo(String value) {
            addCriterion("JSYZFZJG =", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgNotEqualTo(String value) {
            addCriterion("JSYZFZJG <>", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgGreaterThan(String value) {
            addCriterion("JSYZFZJG >", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgGreaterThanOrEqualTo(String value) {
            addCriterion("JSYZFZJG >=", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgLessThan(String value) {
            addCriterion("JSYZFZJG <", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgLessThanOrEqualTo(String value) {
            addCriterion("JSYZFZJG <=", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgLike(String value) {
            addCriterion("JSYZFZJG like", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgNotLike(String value) {
            addCriterion("JSYZFZJG not like", value, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgIn(List<String> values) {
            addCriterion("JSYZFZJG in", values, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgNotIn(List<String> values) {
            addCriterion("JSYZFZJG not in", values, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgBetween(String value1, String value2) {
            addCriterion("JSYZFZJG between", value1, value2, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andJsyzfzjgNotBetween(String value1, String value2) {
            addCriterion("JSYZFZJG not between", value1, value2, "jsyzfzjg");
            return (Criteria) this;
        }

        public Criteria andPxkcmcIsNull() {
            addCriterion("PXKCMC is null");
            return (Criteria) this;
        }

        public Criteria andPxkcmcIsNotNull() {
            addCriterion("PXKCMC is not null");
            return (Criteria) this;
        }

        public Criteria andPxkcmcEqualTo(String value) {
            addCriterion("PXKCMC =", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcNotEqualTo(String value) {
            addCriterion("PXKCMC <>", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcGreaterThan(String value) {
            addCriterion("PXKCMC >", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcGreaterThanOrEqualTo(String value) {
            addCriterion("PXKCMC >=", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcLessThan(String value) {
            addCriterion("PXKCMC <", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcLessThanOrEqualTo(String value) {
            addCriterion("PXKCMC <=", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcLike(String value) {
            addCriterion("PXKCMC like", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcNotLike(String value) {
            addCriterion("PXKCMC not like", value, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcIn(List<String> values) {
            addCriterion("PXKCMC in", values, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcNotIn(List<String> values) {
            addCriterion("PXKCMC not in", values, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcBetween(String value1, String value2) {
            addCriterion("PXKCMC between", value1, value2, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcmcNotBetween(String value1, String value2) {
            addCriterion("PXKCMC not between", value1, value2, "pxkcmc");
            return (Criteria) this;
        }

        public Criteria andPxkcrqIsNull() {
            addCriterion("PXKCRQ is null");
            return (Criteria) this;
        }

        public Criteria andPxkcrqIsNotNull() {
            addCriterion("PXKCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andPxkcrqEqualTo(Date value) {
            addCriterionForJDBCDate("PXKCRQ =", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("PXKCRQ <>", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("PXKCRQ >", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXKCRQ >=", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqLessThan(Date value) {
            addCriterionForJDBCDate("PXKCRQ <", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXKCRQ <=", value, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqIn(List<Date> values) {
            addCriterionForJDBCDate("PXKCRQ in", values, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("PXKCRQ not in", values, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXKCRQ between", value1, value2, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXKCRQ not between", value1, value2, "pxkcrq");
            return (Criteria) this;
        }

        public Criteria andPxkssjIsNull() {
            addCriterion("PXKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andPxkssjIsNotNull() {
            addCriterion("PXKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPxkssjEqualTo(Date value) {
            addCriterionForJDBCDate("PXKSSJ =", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjNotEqualTo(Date value) {
            addCriterionForJDBCDate("PXKSSJ <>", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjGreaterThan(Date value) {
            addCriterionForJDBCDate("PXKSSJ >", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXKSSJ >=", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjLessThan(Date value) {
            addCriterionForJDBCDate("PXKSSJ <", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXKSSJ <=", value, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjIn(List<Date> values) {
            addCriterionForJDBCDate("PXKSSJ in", values, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjNotIn(List<Date> values) {
            addCriterionForJDBCDate("PXKSSJ not in", values, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXKSSJ between", value1, value2, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxkssjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXKSSJ not between", value1, value2, "pxkssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjIsNull() {
            addCriterion("PXJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andPxjssjIsNotNull() {
            addCriterion("PXJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPxjssjEqualTo(Date value) {
            addCriterionForJDBCDate("PXJSSJ =", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjNotEqualTo(Date value) {
            addCriterionForJDBCDate("PXJSSJ <>", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjGreaterThan(Date value) {
            addCriterionForJDBCDate("PXJSSJ >", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXJSSJ >=", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjLessThan(Date value) {
            addCriterionForJDBCDate("PXJSSJ <", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PXJSSJ <=", value, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjIn(List<Date> values) {
            addCriterionForJDBCDate("PXJSSJ in", values, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjNotIn(List<Date> values) {
            addCriterionForJDBCDate("PXJSSJ not in", values, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXJSSJ between", value1, value2, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxjssjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PXJSSJ not between", value1, value2, "pxjssj");
            return (Criteria) this;
        }

        public Criteria andPxscIsNull() {
            addCriterion("PXSC is null");
            return (Criteria) this;
        }

        public Criteria andPxscIsNotNull() {
            addCriterion("PXSC is not null");
            return (Criteria) this;
        }

        public Criteria andPxscEqualTo(String value) {
            addCriterion("PXSC =", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscNotEqualTo(String value) {
            addCriterion("PXSC <>", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscGreaterThan(String value) {
            addCriterion("PXSC >", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscGreaterThanOrEqualTo(String value) {
            addCriterion("PXSC >=", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscLessThan(String value) {
            addCriterion("PXSC <", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscLessThanOrEqualTo(String value) {
            addCriterion("PXSC <=", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscLike(String value) {
            addCriterion("PXSC like", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscNotLike(String value) {
            addCriterion("PXSC not like", value, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscIn(List<String> values) {
            addCriterion("PXSC in", values, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscNotIn(List<String> values) {
            addCriterion("PXSC not in", values, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscBetween(String value1, String value2) {
            addCriterion("PXSC between", value1, value2, "pxsc");
            return (Criteria) this;
        }

        public Criteria andPxscNotBetween(String value1, String value2) {
            addCriterion("PXSC not between", value1, value2, "pxsc");
            return (Criteria) this;
        }

        public Criteria andWcddcsIsNull() {
            addCriterion("WCDDCS is null");
            return (Criteria) this;
        }

        public Criteria andWcddcsIsNotNull() {
            addCriterion("WCDDCS is not null");
            return (Criteria) this;
        }

        public Criteria andWcddcsEqualTo(String value) {
            addCriterion("WCDDCS =", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsNotEqualTo(String value) {
            addCriterion("WCDDCS <>", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsGreaterThan(String value) {
            addCriterion("WCDDCS >", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsGreaterThanOrEqualTo(String value) {
            addCriterion("WCDDCS >=", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsLessThan(String value) {
            addCriterion("WCDDCS <", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsLessThanOrEqualTo(String value) {
            addCriterion("WCDDCS <=", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsLike(String value) {
            addCriterion("WCDDCS like", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsNotLike(String value) {
            addCriterion("WCDDCS not like", value, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsIn(List<String> values) {
            addCriterion("WCDDCS in", values, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsNotIn(List<String> values) {
            addCriterion("WCDDCS not in", values, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsBetween(String value1, String value2) {
            addCriterion("WCDDCS between", value1, value2, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andWcddcsNotBetween(String value1, String value2) {
            addCriterion("WCDDCS not between", value1, value2, "wcddcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsIsNull() {
            addCriterion("JTWZCS is null");
            return (Criteria) this;
        }

        public Criteria andJtwzcsIsNotNull() {
            addCriterion("JTWZCS is not null");
            return (Criteria) this;
        }

        public Criteria andJtwzcsEqualTo(String value) {
            addCriterion("JTWZCS =", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsNotEqualTo(String value) {
            addCriterion("JTWZCS <>", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsGreaterThan(String value) {
            addCriterion("JTWZCS >", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsGreaterThanOrEqualTo(String value) {
            addCriterion("JTWZCS >=", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsLessThan(String value) {
            addCriterion("JTWZCS <", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsLessThanOrEqualTo(String value) {
            addCriterion("JTWZCS <=", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsLike(String value) {
            addCriterion("JTWZCS like", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsNotLike(String value) {
            addCriterion("JTWZCS not like", value, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsIn(List<String> values) {
            addCriterion("JTWZCS in", values, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsNotIn(List<String> values) {
            addCriterion("JTWZCS not in", values, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsBetween(String value1, String value2) {
            addCriterion("JTWZCS between", value1, value2, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andJtwzcsNotBetween(String value1, String value2) {
            addCriterion("JTWZCS not between", value1, value2, "jtwzcs");
            return (Criteria) this;
        }

        public Criteria andHtbhIsNull() {
            addCriterion("HTBH is null");
            return (Criteria) this;
        }

        public Criteria andHtbhIsNotNull() {
            addCriterion("HTBH is not null");
            return (Criteria) this;
        }

        public Criteria andHtbhEqualTo(String value) {
            addCriterion("HTBH =", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotEqualTo(String value) {
            addCriterion("HTBH <>", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhGreaterThan(String value) {
            addCriterion("HTBH >", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhGreaterThanOrEqualTo(String value) {
            addCriterion("HTBH >=", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLessThan(String value) {
            addCriterion("HTBH <", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLessThanOrEqualTo(String value) {
            addCriterion("HTBH <=", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLike(String value) {
            addCriterion("HTBH like", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotLike(String value) {
            addCriterion("HTBH not like", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhIn(List<String> values) {
            addCriterion("HTBH in", values, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotIn(List<String> values) {
            addCriterion("HTBH not in", values, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhBetween(String value1, String value2) {
            addCriterion("HTBH between", value1, value2, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotBetween(String value1, String value2) {
            addCriterion("HTBH not between", value1, value2, "htbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhIsNull() {
            addCriterion("QYGSBH is null");
            return (Criteria) this;
        }

        public Criteria andQygsbhIsNotNull() {
            addCriterion("QYGSBH is not null");
            return (Criteria) this;
        }

        public Criteria andQygsbhEqualTo(String value) {
            addCriterion("QYGSBH =", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhNotEqualTo(String value) {
            addCriterion("QYGSBH <>", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhGreaterThan(String value) {
            addCriterion("QYGSBH >", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhGreaterThanOrEqualTo(String value) {
            addCriterion("QYGSBH >=", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhLessThan(String value) {
            addCriterion("QYGSBH <", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhLessThanOrEqualTo(String value) {
            addCriterion("QYGSBH <=", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhLike(String value) {
            addCriterion("QYGSBH like", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhNotLike(String value) {
            addCriterion("QYGSBH not like", value, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhIn(List<String> values) {
            addCriterion("QYGSBH in", values, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhNotIn(List<String> values) {
            addCriterion("QYGSBH not in", values, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhBetween(String value1, String value2) {
            addCriterion("QYGSBH between", value1, value2, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsbhNotBetween(String value1, String value2) {
            addCriterion("QYGSBH not between", value1, value2, "qygsbh");
            return (Criteria) this;
        }

        public Criteria andQygsmcIsNull() {
            addCriterion("QYGSMC is null");
            return (Criteria) this;
        }

        public Criteria andQygsmcIsNotNull() {
            addCriterion("QYGSMC is not null");
            return (Criteria) this;
        }

        public Criteria andQygsmcEqualTo(String value) {
            addCriterion("QYGSMC =", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcNotEqualTo(String value) {
            addCriterion("QYGSMC <>", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcGreaterThan(String value) {
            addCriterion("QYGSMC >", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcGreaterThanOrEqualTo(String value) {
            addCriterion("QYGSMC >=", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcLessThan(String value) {
            addCriterion("QYGSMC <", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcLessThanOrEqualTo(String value) {
            addCriterion("QYGSMC <=", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcLike(String value) {
            addCriterion("QYGSMC like", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcNotLike(String value) {
            addCriterion("QYGSMC not like", value, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcIn(List<String> values) {
            addCriterion("QYGSMC in", values, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcNotIn(List<String> values) {
            addCriterion("QYGSMC not in", values, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcBetween(String value1, String value2) {
            addCriterion("QYGSMC between", value1, value2, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQygsmcNotBetween(String value1, String value2) {
            addCriterion("QYGSMC not between", value1, value2, "qygsmc");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNull() {
            addCriterion("QSRQ is null");
            return (Criteria) this;
        }

        public Criteria andQsrqIsNotNull() {
            addCriterion("QSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQsrqEqualTo(Date value) {
            addCriterionForJDBCDate("QSRQ =", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("QSRQ <>", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("QSRQ >", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QSRQ >=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThan(Date value) {
            addCriterionForJDBCDate("QSRQ <", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QSRQ <=", value, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqIn(List<Date> values) {
            addCriterionForJDBCDate("QSRQ in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("QSRQ not in", values, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QSRQ between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andQsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QSRQ not between", value1, value2, "qsrq");
            return (Criteria) this;
        }

        public Criteria andHtdqsjIsNull() {
            addCriterion("HTDQSJ is null");
            return (Criteria) this;
        }

        public Criteria andHtdqsjIsNotNull() {
            addCriterion("HTDQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andHtdqsjEqualTo(Date value) {
            addCriterionForJDBCDate("HTDQSJ =", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("HTDQSJ <>", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("HTDQSJ >", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HTDQSJ >=", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjLessThan(Date value) {
            addCriterionForJDBCDate("HTDQSJ <", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HTDQSJ <=", value, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjIn(List<Date> values) {
            addCriterionForJDBCDate("HTDQSJ in", values, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("HTDQSJ not in", values, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HTDQSJ between", value1, value2, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andHtdqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HTDQSJ not between", value1, value2, "htdqsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjIsNull() {
            addCriterion("YXHTSJ is null");
            return (Criteria) this;
        }

        public Criteria andYxhtsjIsNotNull() {
            addCriterion("YXHTSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYxhtsjEqualTo(Integer value) {
            addCriterion("YXHTSJ =", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjNotEqualTo(Integer value) {
            addCriterion("YXHTSJ <>", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjGreaterThan(Integer value) {
            addCriterion("YXHTSJ >", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjGreaterThanOrEqualTo(Integer value) {
            addCriterion("YXHTSJ >=", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjLessThan(Integer value) {
            addCriterion("YXHTSJ <", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjLessThanOrEqualTo(Integer value) {
            addCriterion("YXHTSJ <=", value, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjIn(List<Integer> values) {
            addCriterion("YXHTSJ in", values, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjNotIn(List<Integer> values) {
            addCriterion("YXHTSJ not in", values, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjBetween(Integer value1, Integer value2) {
            addCriterion("YXHTSJ between", value1, value2, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andYxhtsjNotBetween(Integer value1, Integer value2) {
            addCriterion("YXHTSJ not between", value1, value2, "yxhtsj");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverIsNull() {
            addCriterion("Is_TaxiDriver is null");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverIsNotNull() {
            addCriterion("Is_TaxiDriver is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverEqualTo(String value) {
            addCriterion("Is_TaxiDriver =", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverNotEqualTo(String value) {
            addCriterion("Is_TaxiDriver <>", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverGreaterThan(String value) {
            addCriterion("Is_TaxiDriver >", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverGreaterThanOrEqualTo(String value) {
            addCriterion("Is_TaxiDriver >=", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverLessThan(String value) {
            addCriterion("Is_TaxiDriver <", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverLessThanOrEqualTo(String value) {
            addCriterion("Is_TaxiDriver <=", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverLike(String value) {
            addCriterion("Is_TaxiDriver like", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverNotLike(String value) {
            addCriterion("Is_TaxiDriver not like", value, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverIn(List<String> values) {
            addCriterion("Is_TaxiDriver in", values, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverNotIn(List<String> values) {
            addCriterion("Is_TaxiDriver not in", values, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverBetween(String value1, String value2) {
            addCriterion("Is_TaxiDriver between", value1, value2, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andIsTaxidriverNotBetween(String value1, String value2) {
            addCriterion("Is_TaxiDriver not between", value1, value2, "isTaxidriver");
            return (Criteria) this;
        }

        public Criteria andSjxzIsNull() {
            addCriterion("SJXZ is null");
            return (Criteria) this;
        }

        public Criteria andSjxzIsNotNull() {
            addCriterion("SJXZ is not null");
            return (Criteria) this;
        }

        public Criteria andSjxzEqualTo(String value) {
            addCriterion("SJXZ =", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzNotEqualTo(String value) {
            addCriterion("SJXZ <>", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzGreaterThan(String value) {
            addCriterion("SJXZ >", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzGreaterThanOrEqualTo(String value) {
            addCriterion("SJXZ >=", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzLessThan(String value) {
            addCriterion("SJXZ <", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzLessThanOrEqualTo(String value) {
            addCriterion("SJXZ <=", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzLike(String value) {
            addCriterion("SJXZ like", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzNotLike(String value) {
            addCriterion("SJXZ not like", value, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzIn(List<String> values) {
            addCriterion("SJXZ in", values, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzNotIn(List<String> values) {
            addCriterion("SJXZ not in", values, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzBetween(String value1, String value2) {
            addCriterion("SJXZ between", value1, value2, "sjxz");
            return (Criteria) this;
        }

        public Criteria andSjxzNotBetween(String value1, String value2) {
            addCriterion("SJXZ not between", value1, value2, "sjxz");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistIsNull() {
            addCriterion("Is_BlackList is null");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistIsNotNull() {
            addCriterion("Is_BlackList is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistEqualTo(String value) {
            addCriterion("Is_BlackList =", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistNotEqualTo(String value) {
            addCriterion("Is_BlackList <>", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistGreaterThan(String value) {
            addCriterion("Is_BlackList >", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistGreaterThanOrEqualTo(String value) {
            addCriterion("Is_BlackList >=", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistLessThan(String value) {
            addCriterion("Is_BlackList <", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistLessThanOrEqualTo(String value) {
            addCriterion("Is_BlackList <=", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistLike(String value) {
            addCriterion("Is_BlackList like", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistNotLike(String value) {
            addCriterion("Is_BlackList not like", value, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistIn(List<String> values) {
            addCriterion("Is_BlackList in", values, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistNotIn(List<String> values) {
            addCriterion("Is_BlackList not in", values, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistBetween(String value1, String value2) {
            addCriterion("Is_BlackList between", value1, value2, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andIsBlacklistNotBetween(String value1, String value2) {
            addCriterion("Is_BlackList not between", value1, value2, "isBlacklist");
            return (Criteria) this;
        }

        public Criteria andSjsjxhIsNull() {
            addCriterion("SJSJXH is null");
            return (Criteria) this;
        }

        public Criteria andSjsjxhIsNotNull() {
            addCriterion("SJSJXH is not null");
            return (Criteria) this;
        }

        public Criteria andSjsjxhEqualTo(String value) {
            addCriterion("SJSJXH =", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhNotEqualTo(String value) {
            addCriterion("SJSJXH <>", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhGreaterThan(String value) {
            addCriterion("SJSJXH >", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhGreaterThanOrEqualTo(String value) {
            addCriterion("SJSJXH >=", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhLessThan(String value) {
            addCriterion("SJSJXH <", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhLessThanOrEqualTo(String value) {
            addCriterion("SJSJXH <=", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhLike(String value) {
            addCriterion("SJSJXH like", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhNotLike(String value) {
            addCriterion("SJSJXH not like", value, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhIn(List<String> values) {
            addCriterion("SJSJXH in", values, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhNotIn(List<String> values) {
            addCriterion("SJSJXH not in", values, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhBetween(String value1, String value2) {
            addCriterion("SJSJXH between", value1, value2, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjxhNotBetween(String value1, String value2) {
            addCriterion("SJSJXH not between", value1, value2, "sjsjxh");
            return (Criteria) this;
        }

        public Criteria andSjsjyysIsNull() {
            addCriterion("SJSJYYS is null");
            return (Criteria) this;
        }

        public Criteria andSjsjyysIsNotNull() {
            addCriterion("SJSJYYS is not null");
            return (Criteria) this;
        }

        public Criteria andSjsjyysEqualTo(String value) {
            addCriterion("SJSJYYS =", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysNotEqualTo(String value) {
            addCriterion("SJSJYYS <>", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysGreaterThan(String value) {
            addCriterion("SJSJYYS >", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysGreaterThanOrEqualTo(String value) {
            addCriterion("SJSJYYS >=", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysLessThan(String value) {
            addCriterion("SJSJYYS <", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysLessThanOrEqualTo(String value) {
            addCriterion("SJSJYYS <=", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysLike(String value) {
            addCriterion("SJSJYYS like", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysNotLike(String value) {
            addCriterion("SJSJYYS not like", value, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysIn(List<String> values) {
            addCriterion("SJSJYYS in", values, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysNotIn(List<String> values) {
            addCriterion("SJSJYYS not in", values, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysBetween(String value1, String value2) {
            addCriterion("SJSJYYS between", value1, value2, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjsjyysNotBetween(String value1, String value2) {
            addCriterion("SJSJYYS not between", value1, value2, "sjsjyys");
            return (Criteria) this;
        }

        public Criteria andSjappbbIsNull() {
            addCriterion("SJAPPBB is null");
            return (Criteria) this;
        }

        public Criteria andSjappbbIsNotNull() {
            addCriterion("SJAPPBB is not null");
            return (Criteria) this;
        }

        public Criteria andSjappbbEqualTo(String value) {
            addCriterion("SJAPPBB =", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbNotEqualTo(String value) {
            addCriterion("SJAPPBB <>", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbGreaterThan(String value) {
            addCriterion("SJAPPBB >", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbGreaterThanOrEqualTo(String value) {
            addCriterion("SJAPPBB >=", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbLessThan(String value) {
            addCriterion("SJAPPBB <", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbLessThanOrEqualTo(String value) {
            addCriterion("SJAPPBB <=", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbLike(String value) {
            addCriterion("SJAPPBB like", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbNotLike(String value) {
            addCriterion("SJAPPBB not like", value, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbIn(List<String> values) {
            addCriterion("SJAPPBB in", values, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbNotIn(List<String> values) {
            addCriterion("SJAPPBB not in", values, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbBetween(String value1, String value2) {
            addCriterion("SJAPPBB between", value1, value2, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSjappbbNotBetween(String value1, String value2) {
            addCriterion("SJAPPBB not between", value1, value2, "sjappbb");
            return (Criteria) this;
        }

        public Criteria andSydtIsNull() {
            addCriterion("SYDT is null");
            return (Criteria) this;
        }

        public Criteria andSydtIsNotNull() {
            addCriterion("SYDT is not null");
            return (Criteria) this;
        }

        public Criteria andSydtEqualTo(String value) {
            addCriterion("SYDT =", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtNotEqualTo(String value) {
            addCriterion("SYDT <>", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtGreaterThan(String value) {
            addCriterion("SYDT >", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtGreaterThanOrEqualTo(String value) {
            addCriterion("SYDT >=", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtLessThan(String value) {
            addCriterion("SYDT <", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtLessThanOrEqualTo(String value) {
            addCriterion("SYDT <=", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtLike(String value) {
            addCriterion("SYDT like", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtNotLike(String value) {
            addCriterion("SYDT not like", value, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtIn(List<String> values) {
            addCriterion("SYDT in", values, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtNotIn(List<String> values) {
            addCriterion("SYDT not in", values, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtBetween(String value1, String value2) {
            addCriterion("SYDT between", value1, value2, "sydt");
            return (Criteria) this;
        }

        public Criteria andSydtNotBetween(String value1, String value2) {
            addCriterion("SYDT not between", value1, value2, "sydt");
            return (Criteria) this;
        }

        public Criteria andJjlxrIsNull() {
            addCriterion("JJLXR is null");
            return (Criteria) this;
        }

        public Criteria andJjlxrIsNotNull() {
            addCriterion("JJLXR is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxrEqualTo(String value) {
            addCriterion("JJLXR =", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrNotEqualTo(String value) {
            addCriterion("JJLXR <>", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrGreaterThan(String value) {
            addCriterion("JJLXR >", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrGreaterThanOrEqualTo(String value) {
            addCriterion("JJLXR >=", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrLessThan(String value) {
            addCriterion("JJLXR <", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrLessThanOrEqualTo(String value) {
            addCriterion("JJLXR <=", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrLike(String value) {
            addCriterion("JJLXR like", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrNotLike(String value) {
            addCriterion("JJLXR not like", value, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrIn(List<String> values) {
            addCriterion("JJLXR in", values, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrNotIn(List<String> values) {
            addCriterion("JJLXR not in", values, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrBetween(String value1, String value2) {
            addCriterion("JJLXR between", value1, value2, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrNotBetween(String value1, String value2) {
            addCriterion("JJLXR not between", value1, value2, "jjlxr");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIsNull() {
            addCriterion("JJLXRDH is null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIsNotNull() {
            addCriterion("JJLXRDH is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhEqualTo(String value) {
            addCriterion("JJLXRDH =", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotEqualTo(String value) {
            addCriterion("JJLXRDH <>", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhGreaterThan(String value) {
            addCriterion("JJLXRDH >", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhGreaterThanOrEqualTo(String value) {
            addCriterion("JJLXRDH >=", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLessThan(String value) {
            addCriterion("JJLXRDH <", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLessThanOrEqualTo(String value) {
            addCriterion("JJLXRDH <=", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhLike(String value) {
            addCriterion("JJLXRDH like", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotLike(String value) {
            addCriterion("JJLXRDH not like", value, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhIn(List<String> values) {
            addCriterion("JJLXRDH in", values, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotIn(List<String> values) {
            addCriterion("JJLXRDH not in", values, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhBetween(String value1, String value2) {
            addCriterion("JJLXRDH between", value1, value2, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdhNotBetween(String value1, String value2) {
            addCriterion("JJLXRDH not between", value1, value2, "jjlxrdh");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzIsNull() {
            addCriterion("JJLXRDZ is null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzIsNotNull() {
            addCriterion("JJLXRDZ is not null");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzEqualTo(String value) {
            addCriterion("JJLXRDZ =", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzNotEqualTo(String value) {
            addCriterion("JJLXRDZ <>", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzGreaterThan(String value) {
            addCriterion("JJLXRDZ >", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzGreaterThanOrEqualTo(String value) {
            addCriterion("JJLXRDZ >=", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzLessThan(String value) {
            addCriterion("JJLXRDZ <", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzLessThanOrEqualTo(String value) {
            addCriterion("JJLXRDZ <=", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzLike(String value) {
            addCriterion("JJLXRDZ like", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzNotLike(String value) {
            addCriterion("JJLXRDZ not like", value, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzIn(List<String> values) {
            addCriterion("JJLXRDZ in", values, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzNotIn(List<String> values) {
            addCriterion("JJLXRDZ not in", values, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzBetween(String value1, String value2) {
            addCriterion("JJLXRDZ between", value1, value2, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andJjlxrdzNotBetween(String value1, String value2) {
            addCriterion("JJLXRDZ not between", value1, value2, "jjlxrdz");
            return (Criteria) this;
        }

        public Criteria andKsyyztIsNull() {
            addCriterion("KSYYZT is null");
            return (Criteria) this;
        }

        public Criteria andKsyyztIsNotNull() {
            addCriterion("KSYYZT is not null");
            return (Criteria) this;
        }

        public Criteria andKsyyztEqualTo(String value) {
            addCriterion("KSYYZT =", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztNotEqualTo(String value) {
            addCriterion("KSYYZT <>", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztGreaterThan(String value) {
            addCriterion("KSYYZT >", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztGreaterThanOrEqualTo(String value) {
            addCriterion("KSYYZT >=", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztLessThan(String value) {
            addCriterion("KSYYZT <", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztLessThanOrEqualTo(String value) {
            addCriterion("KSYYZT <=", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztLike(String value) {
            addCriterion("KSYYZT like", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztNotLike(String value) {
            addCriterion("KSYYZT not like", value, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztIn(List<String> values) {
            addCriterion("KSYYZT in", values, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztNotIn(List<String> values) {
            addCriterion("KSYYZT not in", values, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztBetween(String value1, String value2) {
            addCriterion("KSYYZT between", value1, value2, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsyyztNotBetween(String value1, String value2) {
            addCriterion("KSYYZT not between", value1, value2, "ksyyzt");
            return (Criteria) this;
        }

        public Criteria andKsfsIsNull() {
            addCriterion("KSFS is null");
            return (Criteria) this;
        }

        public Criteria andKsfsIsNotNull() {
            addCriterion("KSFS is not null");
            return (Criteria) this;
        }

        public Criteria andKsfsEqualTo(String value) {
            addCriterion("KSFS =", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotEqualTo(String value) {
            addCriterion("KSFS <>", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsGreaterThan(String value) {
            addCriterion("KSFS >", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsGreaterThanOrEqualTo(String value) {
            addCriterion("KSFS >=", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLessThan(String value) {
            addCriterion("KSFS <", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLessThanOrEqualTo(String value) {
            addCriterion("KSFS <=", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsLike(String value) {
            addCriterion("KSFS like", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotLike(String value) {
            addCriterion("KSFS not like", value, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsIn(List<String> values) {
            addCriterion("KSFS in", values, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotIn(List<String> values) {
            addCriterion("KSFS not in", values, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsBetween(String value1, String value2) {
            addCriterion("KSFS between", value1, value2, "ksfs");
            return (Criteria) this;
        }

        public Criteria andKsfsNotBetween(String value1, String value2) {
            addCriterion("KSFS not between", value1, value2, "ksfs");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentIsNull() {
            addCriterion("Is_TrafficAccident is null");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentIsNotNull() {
            addCriterion("Is_TrafficAccident is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentEqualTo(String value) {
            addCriterion("Is_TrafficAccident =", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentNotEqualTo(String value) {
            addCriterion("Is_TrafficAccident <>", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentGreaterThan(String value) {
            addCriterion("Is_TrafficAccident >", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentGreaterThanOrEqualTo(String value) {
            addCriterion("Is_TrafficAccident >=", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentLessThan(String value) {
            addCriterion("Is_TrafficAccident <", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentLessThanOrEqualTo(String value) {
            addCriterion("Is_TrafficAccident <=", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentLike(String value) {
            addCriterion("Is_TrafficAccident like", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentNotLike(String value) {
            addCriterion("Is_TrafficAccident not like", value, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentIn(List<String> values) {
            addCriterion("Is_TrafficAccident in", values, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentNotIn(List<String> values) {
            addCriterion("Is_TrafficAccident not in", values, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentBetween(String value1, String value2) {
            addCriterion("Is_TrafficAccident between", value1, value2, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsTrafficaccidentNotBetween(String value1, String value2) {
            addCriterion("Is_TrafficAccident not between", value1, value2, "isTrafficaccident");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingIsNull() {
            addCriterion("Is_DangerousDriving is null");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingIsNotNull() {
            addCriterion("Is_DangerousDriving is not null");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingEqualTo(String value) {
            addCriterion("Is_DangerousDriving =", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingNotEqualTo(String value) {
            addCriterion("Is_DangerousDriving <>", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingGreaterThan(String value) {
            addCriterion("Is_DangerousDriving >", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingGreaterThanOrEqualTo(String value) {
            addCriterion("Is_DangerousDriving >=", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingLessThan(String value) {
            addCriterion("Is_DangerousDriving <", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingLessThanOrEqualTo(String value) {
            addCriterion("Is_DangerousDriving <=", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingLike(String value) {
            addCriterion("Is_DangerousDriving like", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingNotLike(String value) {
            addCriterion("Is_DangerousDriving not like", value, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingIn(List<String> values) {
            addCriterion("Is_DangerousDriving in", values, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingNotIn(List<String> values) {
            addCriterion("Is_DangerousDriving not in", values, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingBetween(String value1, String value2) {
            addCriterion("Is_DangerousDriving between", value1, value2, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDangerousdrivingNotBetween(String value1, String value2) {
            addCriterion("Is_DangerousDriving not between", value1, value2, "isDangerousdriving");
            return (Criteria) this;
        }

        public Criteria andIsDrugIsNull() {
            addCriterion("Is_Drug is null");
            return (Criteria) this;
        }

        public Criteria andIsDrugIsNotNull() {
            addCriterion("Is_Drug is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrugEqualTo(String value) {
            addCriterion("Is_Drug =", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotEqualTo(String value) {
            addCriterion("Is_Drug <>", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugGreaterThan(String value) {
            addCriterion("Is_Drug >", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugGreaterThanOrEqualTo(String value) {
            addCriterion("Is_Drug >=", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugLessThan(String value) {
            addCriterion("Is_Drug <", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugLessThanOrEqualTo(String value) {
            addCriterion("Is_Drug <=", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugLike(String value) {
            addCriterion("Is_Drug like", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotLike(String value) {
            addCriterion("Is_Drug not like", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugIn(List<String> values) {
            addCriterion("Is_Drug in", values, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotIn(List<String> values) {
            addCriterion("Is_Drug not in", values, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugBetween(String value1, String value2) {
            addCriterion("Is_Drug between", value1, value2, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotBetween(String value1, String value2) {
            addCriterion("Is_Drug not between", value1, value2, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverIsNull() {
            addCriterion("Is_DrunkDriver is null");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverIsNotNull() {
            addCriterion("Is_DrunkDriver is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverEqualTo(String value) {
            addCriterion("Is_DrunkDriver =", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverNotEqualTo(String value) {
            addCriterion("Is_DrunkDriver <>", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverGreaterThan(String value) {
            addCriterion("Is_DrunkDriver >", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverGreaterThanOrEqualTo(String value) {
            addCriterion("Is_DrunkDriver >=", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverLessThan(String value) {
            addCriterion("Is_DrunkDriver <", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverLessThanOrEqualTo(String value) {
            addCriterion("Is_DrunkDriver <=", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverLike(String value) {
            addCriterion("Is_DrunkDriver like", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverNotLike(String value) {
            addCriterion("Is_DrunkDriver not like", value, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverIn(List<String> values) {
            addCriterion("Is_DrunkDriver in", values, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverNotIn(List<String> values) {
            addCriterion("Is_DrunkDriver not in", values, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverBetween(String value1, String value2) {
            addCriterion("Is_DrunkDriver between", value1, value2, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsDrunkdriverNotBetween(String value1, String value2) {
            addCriterion("Is_DrunkDriver not between", value1, value2, "isDrunkdriver");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeIsNull() {
            addCriterion("Is_ViolentCrime is null");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeIsNotNull() {
            addCriterion("Is_ViolentCrime is not null");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeEqualTo(String value) {
            addCriterion("Is_ViolentCrime =", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeNotEqualTo(String value) {
            addCriterion("Is_ViolentCrime <>", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeGreaterThan(String value) {
            addCriterion("Is_ViolentCrime >", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeGreaterThanOrEqualTo(String value) {
            addCriterion("Is_ViolentCrime >=", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeLessThan(String value) {
            addCriterion("Is_ViolentCrime <", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeLessThanOrEqualTo(String value) {
            addCriterion("Is_ViolentCrime <=", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeLike(String value) {
            addCriterion("Is_ViolentCrime like", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeNotLike(String value) {
            addCriterion("Is_ViolentCrime not like", value, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeIn(List<String> values) {
            addCriterion("Is_ViolentCrime in", values, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeNotIn(List<String> values) {
            addCriterion("Is_ViolentCrime not in", values, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeBetween(String value1, String value2) {
            addCriterion("Is_ViolentCrime between", value1, value2, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIsViolentcrimeNotBetween(String value1, String value2) {
            addCriterion("Is_ViolentCrime not between", value1, value2, "isViolentcrime");
            return (Criteria) this;
        }

        public Criteria andIs12mIsNull() {
            addCriterion("Is_12M is null");
            return (Criteria) this;
        }

        public Criteria andIs12mIsNotNull() {
            addCriterion("Is_12M is not null");
            return (Criteria) this;
        }

        public Criteria andIs12mEqualTo(String value) {
            addCriterion("Is_12M =", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mNotEqualTo(String value) {
            addCriterion("Is_12M <>", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mGreaterThan(String value) {
            addCriterion("Is_12M >", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mGreaterThanOrEqualTo(String value) {
            addCriterion("Is_12M >=", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mLessThan(String value) {
            addCriterion("Is_12M <", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mLessThanOrEqualTo(String value) {
            addCriterion("Is_12M <=", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mLike(String value) {
            addCriterion("Is_12M like", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mNotLike(String value) {
            addCriterion("Is_12M not like", value, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mIn(List<String> values) {
            addCriterion("Is_12M in", values, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mNotIn(List<String> values) {
            addCriterion("Is_12M not in", values, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mBetween(String value1, String value2) {
            addCriterion("Is_12M between", value1, value2, "is12m");
            return (Criteria) this;
        }

        public Criteria andIs12mNotBetween(String value1, String value2) {
            addCriterion("Is_12M not between", value1, value2, "is12m");
            return (Criteria) this;
        }

        public Criteria andIsRevokeIsNull() {
            addCriterion("\"Is_ Revoke\" is null");
            return (Criteria) this;
        }

        public Criteria andIsRevokeIsNotNull() {
            addCriterion("\"Is_ Revoke\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsRevokeEqualTo(String value) {
            addCriterion("\"Is_ Revoke\" =", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeNotEqualTo(String value) {
            addCriterion("\"Is_ Revoke\" <>", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeGreaterThan(String value) {
            addCriterion("\"Is_ Revoke\" >", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeGreaterThanOrEqualTo(String value) {
            addCriterion("\"Is_ Revoke\" >=", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeLessThan(String value) {
            addCriterion("\"Is_ Revoke\" <", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeLessThanOrEqualTo(String value) {
            addCriterion("\"Is_ Revoke\" <=", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeLike(String value) {
            addCriterion("\"Is_ Revoke\" like", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeNotLike(String value) {
            addCriterion("\"Is_ Revoke\" not like", value, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeIn(List<String> values) {
            addCriterion("\"Is_ Revoke\" in", values, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeNotIn(List<String> values) {
            addCriterion("\"Is_ Revoke\" not in", values, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeBetween(String value1, String value2) {
            addCriterion("\"Is_ Revoke\" between", value1, value2, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andIsRevokeNotBetween(String value1, String value2) {
            addCriterion("\"Is_ Revoke\" not between", value1, value2, "isRevoke");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("GXSJ is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("GXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterionForJDBCDate("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterionForJDBCDate("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterionForJDBCDate("GXSJ in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("GXSJ not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GXSJ not between", value1, value2, "gxsj");
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