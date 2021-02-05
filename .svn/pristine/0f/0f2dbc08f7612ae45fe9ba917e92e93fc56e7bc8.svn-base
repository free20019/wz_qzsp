package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClsyrxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClsyrxxExample() {
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

        public Criteria andQzhulxIsNull() {
            addCriterion("QZHULX is null");
            return (Criteria) this;
        }

        public Criteria andQzhulxIsNotNull() {
            addCriterion("QZHULX is not null");
            return (Criteria) this;
        }

        public Criteria andQzhulxEqualTo(String value) {
            addCriterion("QZHULX =", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxNotEqualTo(String value) {
            addCriterion("QZHULX <>", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxGreaterThan(String value) {
            addCriterion("QZHULX >", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxGreaterThanOrEqualTo(String value) {
            addCriterion("QZHULX >=", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxLessThan(String value) {
            addCriterion("QZHULX <", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxLessThanOrEqualTo(String value) {
            addCriterion("QZHULX <=", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxLike(String value) {
            addCriterion("QZHULX like", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxNotLike(String value) {
            addCriterion("QZHULX not like", value, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxIn(List<String> values) {
            addCriterion("QZHULX in", values, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxNotIn(List<String> values) {
            addCriterion("QZHULX not in", values, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxBetween(String value1, String value2) {
            addCriterion("QZHULX between", value1, value2, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhulxNotBetween(String value1, String value2) {
            addCriterion("QZHULX not between", value1, value2, "qzhulx");
            return (Criteria) this;
        }

        public Criteria andQzhuhmIsNull() {
            addCriterion("QZHUHM is null");
            return (Criteria) this;
        }

        public Criteria andQzhuhmIsNotNull() {
            addCriterion("QZHUHM is not null");
            return (Criteria) this;
        }

        public Criteria andQzhuhmEqualTo(String value) {
            addCriterion("QZHUHM =", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmNotEqualTo(String value) {
            addCriterion("QZHUHM <>", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmGreaterThan(String value) {
            addCriterion("QZHUHM >", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmGreaterThanOrEqualTo(String value) {
            addCriterion("QZHUHM >=", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmLessThan(String value) {
            addCriterion("QZHUHM <", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmLessThanOrEqualTo(String value) {
            addCriterion("QZHUHM <=", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmLike(String value) {
            addCriterion("QZHUHM like", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmNotLike(String value) {
            addCriterion("QZHUHM not like", value, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmIn(List<String> values) {
            addCriterion("QZHUHM in", values, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmNotIn(List<String> values) {
            addCriterion("QZHUHM not in", values, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmBetween(String value1, String value2) {
            addCriterion("QZHUHM between", value1, value2, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuhmNotBetween(String value1, String value2) {
            addCriterion("QZHUHM not between", value1, value2, "qzhuhm");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqIsNull() {
            addCriterion("QZHUQFRQ is null");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqIsNotNull() {
            addCriterion("QZHUQFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ =", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ <>", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqGreaterThan(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ >", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ >=", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqLessThan(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ <", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUQFRQ <=", value, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqIn(List<Date> values) {
            addCriterionForJDBCDate("QZHUQFRQ in", values, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("QZHUQFRQ not in", values, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZHUQFRQ between", value1, value2, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuqfrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZHUQFRQ not between", value1, value2, "qzhuqfrq");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzIsNull() {
            addCriterion("QZHUYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzIsNotNull() {
            addCriterion("QZHUYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ =", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ <>", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ >", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ >=", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzLessThan(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ <", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZHUYXQZ <=", value, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("QZHUYXQZ in", values, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("QZHUYXQZ not in", values, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZHUYXQZ between", value1, value2, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzhuyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZHUYXQZ not between", value1, value2, "qzhuyxqz");
            return (Criteria) this;
        }

        public Criteria andQzlxIsNull() {
            addCriterion("QZLX is null");
            return (Criteria) this;
        }

        public Criteria andQzlxIsNotNull() {
            addCriterion("QZLX is not null");
            return (Criteria) this;
        }

        public Criteria andQzlxEqualTo(String value) {
            addCriterion("QZLX =", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxNotEqualTo(String value) {
            addCriterion("QZLX <>", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxGreaterThan(String value) {
            addCriterion("QZLX >", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxGreaterThanOrEqualTo(String value) {
            addCriterion("QZLX >=", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxLessThan(String value) {
            addCriterion("QZLX <", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxLessThanOrEqualTo(String value) {
            addCriterion("QZLX <=", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxLike(String value) {
            addCriterion("QZLX like", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxNotLike(String value) {
            addCriterion("QZLX not like", value, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxIn(List<String> values) {
            addCriterion("QZLX in", values, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxNotIn(List<String> values) {
            addCriterion("QZLX not in", values, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxBetween(String value1, String value2) {
            addCriterion("QZLX between", value1, value2, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzlxNotBetween(String value1, String value2) {
            addCriterion("QZLX not between", value1, value2, "qzlx");
            return (Criteria) this;
        }

        public Criteria andQzhmIsNull() {
            addCriterion("QZHM is null");
            return (Criteria) this;
        }

        public Criteria andQzhmIsNotNull() {
            addCriterion("QZHM is not null");
            return (Criteria) this;
        }

        public Criteria andQzhmEqualTo(String value) {
            addCriterion("QZHM =", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotEqualTo(String value) {
            addCriterion("QZHM <>", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmGreaterThan(String value) {
            addCriterion("QZHM >", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmGreaterThanOrEqualTo(String value) {
            addCriterion("QZHM >=", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLessThan(String value) {
            addCriterion("QZHM <", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLessThanOrEqualTo(String value) {
            addCriterion("QZHM <=", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLike(String value) {
            addCriterion("QZHM like", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotLike(String value) {
            addCriterion("QZHM not like", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmIn(List<String> values) {
            addCriterion("QZHM in", values, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotIn(List<String> values) {
            addCriterion("QZHM not in", values, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmBetween(String value1, String value2) {
            addCriterion("QZHM between", value1, value2, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotBetween(String value1, String value2) {
            addCriterion("QZHM not between", value1, value2, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzqfrqIsNull() {
            addCriterion("QZQFRQ is null");
            return (Criteria) this;
        }

        public Criteria andQzqfrqIsNotNull() {
            addCriterion("QZQFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQzqfrqEqualTo(Date value) {
            addCriterionForJDBCDate("QZQFRQ =", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("QZQFRQ <>", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqGreaterThan(Date value) {
            addCriterionForJDBCDate("QZQFRQ >", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZQFRQ >=", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqLessThan(Date value) {
            addCriterionForJDBCDate("QZQFRQ <", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZQFRQ <=", value, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqIn(List<Date> values) {
            addCriterionForJDBCDate("QZQFRQ in", values, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("QZQFRQ not in", values, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZQFRQ between", value1, value2, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzqfrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZQFRQ not between", value1, value2, "qzqfrq");
            return (Criteria) this;
        }

        public Criteria andQzyxqzIsNull() {
            addCriterion("QZYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andQzyxqzIsNotNull() {
            addCriterion("QZYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andQzyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("QZYXQZ =", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("QZYXQZ <>", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("QZYXQZ >", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZYXQZ >=", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzLessThan(Date value) {
            addCriterionForJDBCDate("QZYXQZ <", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QZYXQZ <=", value, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("QZYXQZ in", values, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("QZYXQZ not in", values, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZYXQZ between", value1, value2, "qzyxqz");
            return (Criteria) this;
        }

        public Criteria andQzyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QZYXQZ not between", value1, value2, "qzyxqz");
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

        public Criteria andLxdzIsNull() {
            addCriterion("LXDZ is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("LXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("LXDZ =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("LXDZ <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("LXDZ >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("LXDZ >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("LXDZ <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("LXDZ <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("LXDZ like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("LXDZ not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("LXDZ in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("LXDZ not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("LXDZ between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("LXDZ not between", value1, value2, "lxdz");
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