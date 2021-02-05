package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CljcxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CljcxxExample() {
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

        public Criteria andCpysIsNull() {
            addCriterion("CPYS is null");
            return (Criteria) this;
        }

        public Criteria andCpysIsNotNull() {
            addCriterion("CPYS is not null");
            return (Criteria) this;
        }

        public Criteria andCpysEqualTo(String value) {
            addCriterion("CPYS =", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysNotEqualTo(String value) {
            addCriterion("CPYS <>", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysGreaterThan(String value) {
            addCriterion("CPYS >", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysGreaterThanOrEqualTo(String value) {
            addCriterion("CPYS >=", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysLessThan(String value) {
            addCriterion("CPYS <", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysLessThanOrEqualTo(String value) {
            addCriterion("CPYS <=", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysLike(String value) {
            addCriterion("CPYS like", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysNotLike(String value) {
            addCriterion("CPYS not like", value, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysIn(List<String> values) {
            addCriterion("CPYS in", values, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysNotIn(List<String> values) {
            addCriterion("CPYS not in", values, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysBetween(String value1, String value2) {
            addCriterion("CPYS between", value1, value2, "cpys");
            return (Criteria) this;
        }

        public Criteria andCpysNotBetween(String value1, String value2) {
            addCriterion("CPYS not between", value1, value2, "cpys");
            return (Criteria) this;
        }

        public Criteria andZzcmcIsNull() {
            addCriterion("ZZCMC is null");
            return (Criteria) this;
        }

        public Criteria andZzcmcIsNotNull() {
            addCriterion("ZZCMC is not null");
            return (Criteria) this;
        }

        public Criteria andZzcmcEqualTo(String value) {
            addCriterion("ZZCMC =", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcNotEqualTo(String value) {
            addCriterion("ZZCMC <>", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcGreaterThan(String value) {
            addCriterion("ZZCMC >", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZZCMC >=", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcLessThan(String value) {
            addCriterion("ZZCMC <", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcLessThanOrEqualTo(String value) {
            addCriterion("ZZCMC <=", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcLike(String value) {
            addCriterion("ZZCMC like", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcNotLike(String value) {
            addCriterion("ZZCMC not like", value, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcIn(List<String> values) {
            addCriterion("ZZCMC in", values, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcNotIn(List<String> values) {
            addCriterion("ZZCMC not in", values, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcBetween(String value1, String value2) {
            addCriterion("ZZCMC between", value1, value2, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andZzcmcNotBetween(String value1, String value2) {
            addCriterion("ZZCMC not between", value1, value2, "zzcmc");
            return (Criteria) this;
        }

        public Criteria andClppIsNull() {
            addCriterion("CLPP is null");
            return (Criteria) this;
        }

        public Criteria andClppIsNotNull() {
            addCriterion("CLPP is not null");
            return (Criteria) this;
        }

        public Criteria andClppEqualTo(String value) {
            addCriterion("CLPP =", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotEqualTo(String value) {
            addCriterion("CLPP <>", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppGreaterThan(String value) {
            addCriterion("CLPP >", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppGreaterThanOrEqualTo(String value) {
            addCriterion("CLPP >=", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLessThan(String value) {
            addCriterion("CLPP <", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLessThanOrEqualTo(String value) {
            addCriterion("CLPP <=", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppLike(String value) {
            addCriterion("CLPP like", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotLike(String value) {
            addCriterion("CLPP not like", value, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppIn(List<String> values) {
            addCriterion("CLPP in", values, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotIn(List<String> values) {
            addCriterion("CLPP not in", values, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppBetween(String value1, String value2) {
            addCriterion("CLPP between", value1, value2, "clpp");
            return (Criteria) this;
        }

        public Criteria andClppNotBetween(String value1, String value2) {
            addCriterion("CLPP not between", value1, value2, "clpp");
            return (Criteria) this;
        }

        public Criteria andCllxIsNull() {
            addCriterion("CLLX is null");
            return (Criteria) this;
        }

        public Criteria andCllxIsNotNull() {
            addCriterion("CLLX is not null");
            return (Criteria) this;
        }

        public Criteria andCllxEqualTo(String value) {
            addCriterion("CLLX =", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotEqualTo(String value) {
            addCriterion("CLLX <>", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThan(String value) {
            addCriterion("CLLX >", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxGreaterThanOrEqualTo(String value) {
            addCriterion("CLLX >=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThan(String value) {
            addCriterion("CLLX <", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLessThanOrEqualTo(String value) {
            addCriterion("CLLX <=", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxLike(String value) {
            addCriterion("CLLX like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotLike(String value) {
            addCriterion("CLLX not like", value, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxIn(List<String> values) {
            addCriterion("CLLX in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotIn(List<String> values) {
            addCriterion("CLLX not in", values, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxBetween(String value1, String value2) {
            addCriterion("CLLX between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andCllxNotBetween(String value1, String value2) {
            addCriterion("CLLX not between", value1, value2, "cllx");
            return (Criteria) this;
        }

        public Criteria andClxhIsNull() {
            addCriterion("CLXH is null");
            return (Criteria) this;
        }

        public Criteria andClxhIsNotNull() {
            addCriterion("CLXH is not null");
            return (Criteria) this;
        }

        public Criteria andClxhEqualTo(String value) {
            addCriterion("CLXH =", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhNotEqualTo(String value) {
            addCriterion("CLXH <>", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhGreaterThan(String value) {
            addCriterion("CLXH >", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhGreaterThanOrEqualTo(String value) {
            addCriterion("CLXH >=", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhLessThan(String value) {
            addCriterion("CLXH <", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhLessThanOrEqualTo(String value) {
            addCriterion("CLXH <=", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhLike(String value) {
            addCriterion("CLXH like", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhNotLike(String value) {
            addCriterion("CLXH not like", value, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhIn(List<String> values) {
            addCriterion("CLXH in", values, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhNotIn(List<String> values) {
            addCriterion("CLXH not in", values, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhBetween(String value1, String value2) {
            addCriterion("CLXH between", value1, value2, "clxh");
            return (Criteria) this;
        }

        public Criteria andClxhNotBetween(String value1, String value2) {
            addCriterion("CLXH not between", value1, value2, "clxh");
            return (Criteria) this;
        }

        public Criteria andClszcsIsNull() {
            addCriterion("CLSZCS is null");
            return (Criteria) this;
        }

        public Criteria andClszcsIsNotNull() {
            addCriterion("CLSZCS is not null");
            return (Criteria) this;
        }

        public Criteria andClszcsEqualTo(String value) {
            addCriterion("CLSZCS =", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotEqualTo(String value) {
            addCriterion("CLSZCS <>", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsGreaterThan(String value) {
            addCriterion("CLSZCS >", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsGreaterThanOrEqualTo(String value) {
            addCriterion("CLSZCS >=", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLessThan(String value) {
            addCriterion("CLSZCS <", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLessThanOrEqualTo(String value) {
            addCriterion("CLSZCS <=", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsLike(String value) {
            addCriterion("CLSZCS like", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotLike(String value) {
            addCriterion("CLSZCS not like", value, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsIn(List<String> values) {
            addCriterion("CLSZCS in", values, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotIn(List<String> values) {
            addCriterion("CLSZCS not in", values, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsBetween(String value1, String value2) {
            addCriterion("CLSZCS between", value1, value2, "clszcs");
            return (Criteria) this;
        }

        public Criteria andClszcsNotBetween(String value1, String value2) {
            addCriterion("CLSZCS not between", value1, value2, "clszcs");
            return (Criteria) this;
        }

        public Criteria andSsczIsNull() {
            addCriterion("SSCZ is null");
            return (Criteria) this;
        }

        public Criteria andSsczIsNotNull() {
            addCriterion("SSCZ is not null");
            return (Criteria) this;
        }

        public Criteria andSsczEqualTo(String value) {
            addCriterion("SSCZ =", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczNotEqualTo(String value) {
            addCriterion("SSCZ <>", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczGreaterThan(String value) {
            addCriterion("SSCZ >", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczGreaterThanOrEqualTo(String value) {
            addCriterion("SSCZ >=", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczLessThan(String value) {
            addCriterion("SSCZ <", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczLessThanOrEqualTo(String value) {
            addCriterion("SSCZ <=", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczLike(String value) {
            addCriterion("SSCZ like", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczNotLike(String value) {
            addCriterion("SSCZ not like", value, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczIn(List<String> values) {
            addCriterion("SSCZ in", values, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczNotIn(List<String> values) {
            addCriterion("SSCZ not in", values, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczBetween(String value1, String value2) {
            addCriterion("SSCZ between", value1, value2, "sscz");
            return (Criteria) this;
        }

        public Criteria andSsczNotBetween(String value1, String value2) {
            addCriterion("SSCZ not between", value1, value2, "sscz");
            return (Criteria) this;
        }

        public Criteria andCsysIsNull() {
            addCriterion("CSYS is null");
            return (Criteria) this;
        }

        public Criteria andCsysIsNotNull() {
            addCriterion("CSYS is not null");
            return (Criteria) this;
        }

        public Criteria andCsysEqualTo(String value) {
            addCriterion("CSYS =", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotEqualTo(String value) {
            addCriterion("CSYS <>", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysGreaterThan(String value) {
            addCriterion("CSYS >", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysGreaterThanOrEqualTo(String value) {
            addCriterion("CSYS >=", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLessThan(String value) {
            addCriterion("CSYS <", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLessThanOrEqualTo(String value) {
            addCriterion("CSYS <=", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLike(String value) {
            addCriterion("CSYS like", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotLike(String value) {
            addCriterion("CSYS not like", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysIn(List<String> values) {
            addCriterion("CSYS in", values, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotIn(List<String> values) {
            addCriterion("CSYS not in", values, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysBetween(String value1, String value2) {
            addCriterion("CSYS between", value1, value2, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotBetween(String value1, String value2) {
            addCriterion("CSYS not between", value1, value2, "csys");
            return (Criteria) this;
        }

        public Criteria andClzpIsNull() {
            addCriterion("CLZP is null");
            return (Criteria) this;
        }

        public Criteria andClzpIsNotNull() {
            addCriterion("CLZP is not null");
            return (Criteria) this;
        }

        public Criteria andClzpEqualTo(String value) {
            addCriterion("CLZP =", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpNotEqualTo(String value) {
            addCriterion("CLZP <>", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpGreaterThan(String value) {
            addCriterion("CLZP >", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpGreaterThanOrEqualTo(String value) {
            addCriterion("CLZP >=", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpLessThan(String value) {
            addCriterion("CLZP <", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpLessThanOrEqualTo(String value) {
            addCriterion("CLZP <=", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpLike(String value) {
            addCriterion("CLZP like", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpNotLike(String value) {
            addCriterion("CLZP not like", value, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpIn(List<String> values) {
            addCriterion("CLZP in", values, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpNotIn(List<String> values) {
            addCriterion("CLZP not in", values, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpBetween(String value1, String value2) {
            addCriterion("CLZP between", value1, value2, "clzp");
            return (Criteria) this;
        }

        public Criteria andClzpNotBetween(String value1, String value2) {
            addCriterion("CLZP not between", value1, value2, "clzp");
            return (Criteria) this;
        }

        public Criteria andFdjhIsNull() {
            addCriterion("FDJH is null");
            return (Criteria) this;
        }

        public Criteria andFdjhIsNotNull() {
            addCriterion("FDJH is not null");
            return (Criteria) this;
        }

        public Criteria andFdjhEqualTo(String value) {
            addCriterion("FDJH =", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhNotEqualTo(String value) {
            addCriterion("FDJH <>", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhGreaterThan(String value) {
            addCriterion("FDJH >", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhGreaterThanOrEqualTo(String value) {
            addCriterion("FDJH >=", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhLessThan(String value) {
            addCriterion("FDJH <", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhLessThanOrEqualTo(String value) {
            addCriterion("FDJH <=", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhLike(String value) {
            addCriterion("FDJH like", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhNotLike(String value) {
            addCriterion("FDJH not like", value, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhIn(List<String> values) {
            addCriterion("FDJH in", values, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhNotIn(List<String> values) {
            addCriterion("FDJH not in", values, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhBetween(String value1, String value2) {
            addCriterion("FDJH between", value1, value2, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjhNotBetween(String value1, String value2) {
            addCriterion("FDJH not between", value1, value2, "fdjh");
            return (Criteria) this;
        }

        public Criteria andFdjxhIsNull() {
            addCriterion("FDJXH is null");
            return (Criteria) this;
        }

        public Criteria andFdjxhIsNotNull() {
            addCriterion("FDJXH is not null");
            return (Criteria) this;
        }

        public Criteria andFdjxhEqualTo(String value) {
            addCriterion("FDJXH =", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotEqualTo(String value) {
            addCriterion("FDJXH <>", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhGreaterThan(String value) {
            addCriterion("FDJXH >", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhGreaterThanOrEqualTo(String value) {
            addCriterion("FDJXH >=", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLessThan(String value) {
            addCriterion("FDJXH <", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLessThanOrEqualTo(String value) {
            addCriterion("FDJXH <=", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhLike(String value) {
            addCriterion("FDJXH like", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotLike(String value) {
            addCriterion("FDJXH not like", value, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhIn(List<String> values) {
            addCriterion("FDJXH in", values, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotIn(List<String> values) {
            addCriterion("FDJXH not in", values, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhBetween(String value1, String value2) {
            addCriterion("FDJXH between", value1, value2, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andFdjxhNotBetween(String value1, String value2) {
            addCriterion("FDJXH not between", value1, value2, "fdjxh");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andRllxIsNull() {
            addCriterion("RLLX is null");
            return (Criteria) this;
        }

        public Criteria andRllxIsNotNull() {
            addCriterion("RLLX is not null");
            return (Criteria) this;
        }

        public Criteria andRllxEqualTo(String value) {
            addCriterion("RLLX =", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxNotEqualTo(String value) {
            addCriterion("RLLX <>", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxGreaterThan(String value) {
            addCriterion("RLLX >", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxGreaterThanOrEqualTo(String value) {
            addCriterion("RLLX >=", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxLessThan(String value) {
            addCriterion("RLLX <", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxLessThanOrEqualTo(String value) {
            addCriterion("RLLX <=", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxLike(String value) {
            addCriterion("RLLX like", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxNotLike(String value) {
            addCriterion("RLLX not like", value, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxIn(List<String> values) {
            addCriterion("RLLX in", values, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxNotIn(List<String> values) {
            addCriterion("RLLX not in", values, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxBetween(String value1, String value2) {
            addCriterion("RLLX between", value1, value2, "rllx");
            return (Criteria) this;
        }

        public Criteria andRllxNotBetween(String value1, String value2) {
            addCriterion("RLLX not between", value1, value2, "rllx");
            return (Criteria) this;
        }

        public Criteria andHdzkwIsNull() {
            addCriterion("HDZKW is null");
            return (Criteria) this;
        }

        public Criteria andHdzkwIsNotNull() {
            addCriterion("HDZKW is not null");
            return (Criteria) this;
        }

        public Criteria andHdzkwEqualTo(String value) {
            addCriterion("HDZKW =", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwNotEqualTo(String value) {
            addCriterion("HDZKW <>", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwGreaterThan(String value) {
            addCriterion("HDZKW >", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwGreaterThanOrEqualTo(String value) {
            addCriterion("HDZKW >=", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwLessThan(String value) {
            addCriterion("HDZKW <", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwLessThanOrEqualTo(String value) {
            addCriterion("HDZKW <=", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwLike(String value) {
            addCriterion("HDZKW like", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwNotLike(String value) {
            addCriterion("HDZKW not like", value, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwIn(List<String> values) {
            addCriterion("HDZKW in", values, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwNotIn(List<String> values) {
            addCriterion("HDZKW not in", values, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwBetween(String value1, String value2) {
            addCriterion("HDZKW between", value1, value2, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andHdzkwNotBetween(String value1, String value2) {
            addCriterion("HDZKW not between", value1, value2, "hdzkw");
            return (Criteria) this;
        }

        public Criteria andClzcrqIsNull() {
            addCriterion("CLZCRQ is null");
            return (Criteria) this;
        }

        public Criteria andClzcrqIsNotNull() {
            addCriterion("CLZCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andClzcrqEqualTo(Date value) {
            addCriterionForJDBCDate("CLZCRQ =", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLZCRQ <>", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("CLZCRQ >", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLZCRQ >=", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqLessThan(Date value) {
            addCriterionForJDBCDate("CLZCRQ <", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLZCRQ <=", value, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqIn(List<Date> values) {
            addCriterionForJDBCDate("CLZCRQ in", values, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLZCRQ not in", values, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLZCRQ between", value1, value2, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andClzcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLZCRQ not between", value1, value2, "clzcrq");
            return (Criteria) this;
        }

        public Criteria andNdsyztIsNull() {
            addCriterion("NDSYZT is null");
            return (Criteria) this;
        }

        public Criteria andNdsyztIsNotNull() {
            addCriterion("NDSYZT is not null");
            return (Criteria) this;
        }

        public Criteria andNdsyztEqualTo(String value) {
            addCriterion("NDSYZT =", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztNotEqualTo(String value) {
            addCriterion("NDSYZT <>", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztGreaterThan(String value) {
            addCriterion("NDSYZT >", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztGreaterThanOrEqualTo(String value) {
            addCriterion("NDSYZT >=", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztLessThan(String value) {
            addCriterion("NDSYZT <", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztLessThanOrEqualTo(String value) {
            addCriterion("NDSYZT <=", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztLike(String value) {
            addCriterion("NDSYZT like", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztNotLike(String value) {
            addCriterion("NDSYZT not like", value, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztIn(List<String> values) {
            addCriterion("NDSYZT in", values, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztNotIn(List<String> values) {
            addCriterion("NDSYZT not in", values, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztBetween(String value1, String value2) {
            addCriterion("NDSYZT between", value1, value2, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andNdsyztNotBetween(String value1, String value2) {
            addCriterion("NDSYZT not between", value1, value2, "ndsyzt");
            return (Criteria) this;
        }

        public Criteria andQljIsNull() {
            addCriterion("QLJ is null");
            return (Criteria) this;
        }

        public Criteria andQljIsNotNull() {
            addCriterion("QLJ is not null");
            return (Criteria) this;
        }

        public Criteria andQljEqualTo(Integer value) {
            addCriterion("QLJ =", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljNotEqualTo(Integer value) {
            addCriterion("QLJ <>", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljGreaterThan(Integer value) {
            addCriterion("QLJ >", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljGreaterThanOrEqualTo(Integer value) {
            addCriterion("QLJ >=", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljLessThan(Integer value) {
            addCriterion("QLJ <", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljLessThanOrEqualTo(Integer value) {
            addCriterion("QLJ <=", value, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljIn(List<Integer> values) {
            addCriterion("QLJ in", values, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljNotIn(List<Integer> values) {
            addCriterion("QLJ not in", values, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljBetween(Integer value1, Integer value2) {
            addCriterion("QLJ between", value1, value2, "qlj");
            return (Criteria) this;
        }

        public Criteria andQljNotBetween(Integer value1, Integer value2) {
            addCriterion("QLJ not between", value1, value2, "qlj");
            return (Criteria) this;
        }

        public Criteria andHljIsNull() {
            addCriterion("HLJ is null");
            return (Criteria) this;
        }

        public Criteria andHljIsNotNull() {
            addCriterion("HLJ is not null");
            return (Criteria) this;
        }

        public Criteria andHljEqualTo(Integer value) {
            addCriterion("HLJ =", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljNotEqualTo(Integer value) {
            addCriterion("HLJ <>", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljGreaterThan(Integer value) {
            addCriterion("HLJ >", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljGreaterThanOrEqualTo(Integer value) {
            addCriterion("HLJ >=", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljLessThan(Integer value) {
            addCriterion("HLJ <", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljLessThanOrEqualTo(Integer value) {
            addCriterion("HLJ <=", value, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljIn(List<Integer> values) {
            addCriterion("HLJ in", values, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljNotIn(List<Integer> values) {
            addCriterion("HLJ not in", values, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljBetween(Integer value1, Integer value2) {
            addCriterion("HLJ between", value1, value2, "hlj");
            return (Criteria) this;
        }

        public Criteria andHljNotBetween(Integer value1, Integer value2) {
            addCriterion("HLJ not between", value1, value2, "hlj");
            return (Criteria) this;
        }

        public Criteria andLtggIsNull() {
            addCriterion("LTGG is null");
            return (Criteria) this;
        }

        public Criteria andLtggIsNotNull() {
            addCriterion("LTGG is not null");
            return (Criteria) this;
        }

        public Criteria andLtggEqualTo(String value) {
            addCriterion("LTGG =", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggNotEqualTo(String value) {
            addCriterion("LTGG <>", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggGreaterThan(String value) {
            addCriterion("LTGG >", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggGreaterThanOrEqualTo(String value) {
            addCriterion("LTGG >=", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggLessThan(String value) {
            addCriterion("LTGG <", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggLessThanOrEqualTo(String value) {
            addCriterion("LTGG <=", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggLike(String value) {
            addCriterion("LTGG like", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggNotLike(String value) {
            addCriterion("LTGG not like", value, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggIn(List<String> values) {
            addCriterion("LTGG in", values, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggNotIn(List<String> values) {
            addCriterion("LTGG not in", values, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggBetween(String value1, String value2) {
            addCriterion("LTGG between", value1, value2, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtggNotBetween(String value1, String value2) {
            addCriterion("LTGG not between", value1, value2, "ltgg");
            return (Criteria) this;
        }

        public Criteria andLtsIsNull() {
            addCriterion("LTS is null");
            return (Criteria) this;
        }

        public Criteria andLtsIsNotNull() {
            addCriterion("LTS is not null");
            return (Criteria) this;
        }

        public Criteria andLtsEqualTo(Integer value) {
            addCriterion("LTS =", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsNotEqualTo(Integer value) {
            addCriterion("LTS <>", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsGreaterThan(Integer value) {
            addCriterion("LTS >", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LTS >=", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsLessThan(Integer value) {
            addCriterion("LTS <", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsLessThanOrEqualTo(Integer value) {
            addCriterion("LTS <=", value, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsIn(List<Integer> values) {
            addCriterion("LTS in", values, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsNotIn(List<Integer> values) {
            addCriterion("LTS not in", values, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsBetween(Integer value1, Integer value2) {
            addCriterion("LTS between", value1, value2, "lts");
            return (Criteria) this;
        }

        public Criteria andLtsNotBetween(Integer value1, Integer value2) {
            addCriterion("LTS not between", value1, value2, "lts");
            return (Criteria) this;
        }

        public Criteria andGbthpsIsNull() {
            addCriterion("GBTHPS is null");
            return (Criteria) this;
        }

        public Criteria andGbthpsIsNotNull() {
            addCriterion("GBTHPS is not null");
            return (Criteria) this;
        }

        public Criteria andGbthpsEqualTo(Integer value) {
            addCriterion("GBTHPS =", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsNotEqualTo(Integer value) {
            addCriterion("GBTHPS <>", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsGreaterThan(Integer value) {
            addCriterion("GBTHPS >", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("GBTHPS >=", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsLessThan(Integer value) {
            addCriterion("GBTHPS <", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsLessThanOrEqualTo(Integer value) {
            addCriterion("GBTHPS <=", value, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsIn(List<Integer> values) {
            addCriterion("GBTHPS in", values, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsNotIn(List<Integer> values) {
            addCriterion("GBTHPS not in", values, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsBetween(Integer value1, Integer value2) {
            addCriterion("GBTHPS between", value1, value2, "gbthps");
            return (Criteria) this;
        }

        public Criteria andGbthpsNotBetween(Integer value1, Integer value2) {
            addCriterion("GBTHPS not between", value1, value2, "gbthps");
            return (Criteria) this;
        }

        public Criteria andClhdfsIsNull() {
            addCriterion("CLHDFS is null");
            return (Criteria) this;
        }

        public Criteria andClhdfsIsNotNull() {
            addCriterion("CLHDFS is not null");
            return (Criteria) this;
        }

        public Criteria andClhdfsEqualTo(String value) {
            addCriterion("CLHDFS =", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsNotEqualTo(String value) {
            addCriterion("CLHDFS <>", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsGreaterThan(String value) {
            addCriterion("CLHDFS >", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsGreaterThanOrEqualTo(String value) {
            addCriterion("CLHDFS >=", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsLessThan(String value) {
            addCriterion("CLHDFS <", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsLessThanOrEqualTo(String value) {
            addCriterion("CLHDFS <=", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsLike(String value) {
            addCriterion("CLHDFS like", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsNotLike(String value) {
            addCriterion("CLHDFS not like", value, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsIn(List<String> values) {
            addCriterion("CLHDFS in", values, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsNotIn(List<String> values) {
            addCriterion("CLHDFS not in", values, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsBetween(String value1, String value2) {
            addCriterion("CLHDFS between", value1, value2, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andClhdfsNotBetween(String value1, String value2) {
            addCriterion("CLHDFS not between", value1, value2, "clhdfs");
            return (Criteria) this;
        }

        public Criteria andGcjkIsNull() {
            addCriterion("GCJK is null");
            return (Criteria) this;
        }

        public Criteria andGcjkIsNotNull() {
            addCriterion("GCJK is not null");
            return (Criteria) this;
        }

        public Criteria andGcjkEqualTo(String value) {
            addCriterion("GCJK =", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkNotEqualTo(String value) {
            addCriterion("GCJK <>", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkGreaterThan(String value) {
            addCriterion("GCJK >", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkGreaterThanOrEqualTo(String value) {
            addCriterion("GCJK >=", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkLessThan(String value) {
            addCriterion("GCJK <", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkLessThanOrEqualTo(String value) {
            addCriterion("GCJK <=", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkLike(String value) {
            addCriterion("GCJK like", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkNotLike(String value) {
            addCriterion("GCJK not like", value, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkIn(List<String> values) {
            addCriterion("GCJK in", values, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkNotIn(List<String> values) {
            addCriterion("GCJK not in", values, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkBetween(String value1, String value2) {
            addCriterion("GCJK between", value1, value2, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGcjkNotBetween(String value1, String value2) {
            addCriterion("GCJK not between", value1, value2, "gcjk");
            return (Criteria) this;
        }

        public Criteria andGlIsNull() {
            addCriterion("GL is null");
            return (Criteria) this;
        }

        public Criteria andGlIsNotNull() {
            addCriterion("GL is not null");
            return (Criteria) this;
        }

        public Criteria andGlEqualTo(Integer value) {
            addCriterion("GL =", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotEqualTo(Integer value) {
            addCriterion("GL <>", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThan(Integer value) {
            addCriterion("GL >", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlGreaterThanOrEqualTo(Integer value) {
            addCriterion("GL >=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThan(Integer value) {
            addCriterion("GL <", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlLessThanOrEqualTo(Integer value) {
            addCriterion("GL <=", value, "gl");
            return (Criteria) this;
        }

        public Criteria andGlIn(List<Integer> values) {
            addCriterion("GL in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotIn(List<Integer> values) {
            addCriterion("GL not in", values, "gl");
            return (Criteria) this;
        }

        public Criteria andGlBetween(Integer value1, Integer value2) {
            addCriterion("GL between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andGlNotBetween(Integer value1, Integer value2) {
            addCriterion("GL not between", value1, value2, "gl");
            return (Criteria) this;
        }

        public Criteria andZxxsIsNull() {
            addCriterion("ZXXS is null");
            return (Criteria) this;
        }

        public Criteria andZxxsIsNotNull() {
            addCriterion("ZXXS is not null");
            return (Criteria) this;
        }

        public Criteria andZxxsEqualTo(String value) {
            addCriterion("ZXXS =", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsNotEqualTo(String value) {
            addCriterion("ZXXS <>", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsGreaterThan(String value) {
            addCriterion("ZXXS >", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsGreaterThanOrEqualTo(String value) {
            addCriterion("ZXXS >=", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsLessThan(String value) {
            addCriterion("ZXXS <", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsLessThanOrEqualTo(String value) {
            addCriterion("ZXXS <=", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsLike(String value) {
            addCriterion("ZXXS like", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsNotLike(String value) {
            addCriterion("ZXXS not like", value, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsIn(List<String> values) {
            addCriterion("ZXXS in", values, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsNotIn(List<String> values) {
            addCriterion("ZXXS not in", values, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsBetween(String value1, String value2) {
            addCriterion("ZXXS between", value1, value2, "zxxs");
            return (Criteria) this;
        }

        public Criteria andZxxsNotBetween(String value1, String value2) {
            addCriterion("ZXXS not between", value1, value2, "zxxs");
            return (Criteria) this;
        }

        public Criteria andBxgsIsNull() {
            addCriterion("BXGS is null");
            return (Criteria) this;
        }

        public Criteria andBxgsIsNotNull() {
            addCriterion("BXGS is not null");
            return (Criteria) this;
        }

        public Criteria andBxgsEqualTo(String value) {
            addCriterion("BXGS =", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsNotEqualTo(String value) {
            addCriterion("BXGS <>", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsGreaterThan(String value) {
            addCriterion("BXGS >", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsGreaterThanOrEqualTo(String value) {
            addCriterion("BXGS >=", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsLessThan(String value) {
            addCriterion("BXGS <", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsLessThanOrEqualTo(String value) {
            addCriterion("BXGS <=", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsLike(String value) {
            addCriterion("BXGS like", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsNotLike(String value) {
            addCriterion("BXGS not like", value, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsIn(List<String> values) {
            addCriterion("BXGS in", values, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsNotIn(List<String> values) {
            addCriterion("BXGS not in", values, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsBetween(String value1, String value2) {
            addCriterion("BXGS between", value1, value2, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxgsNotBetween(String value1, String value2) {
            addCriterion("BXGS not between", value1, value2, "bxgs");
            return (Criteria) this;
        }

        public Criteria andBxhIsNull() {
            addCriterion("BXH is null");
            return (Criteria) this;
        }

        public Criteria andBxhIsNotNull() {
            addCriterion("BXH is not null");
            return (Criteria) this;
        }

        public Criteria andBxhEqualTo(String value) {
            addCriterion("BXH =", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhNotEqualTo(String value) {
            addCriterion("BXH <>", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhGreaterThan(String value) {
            addCriterion("BXH >", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhGreaterThanOrEqualTo(String value) {
            addCriterion("BXH >=", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhLessThan(String value) {
            addCriterion("BXH <", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhLessThanOrEqualTo(String value) {
            addCriterion("BXH <=", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhLike(String value) {
            addCriterion("BXH like", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhNotLike(String value) {
            addCriterion("BXH not like", value, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhIn(List<String> values) {
            addCriterion("BXH in", values, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhNotIn(List<String> values) {
            addCriterion("BXH not in", values, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhBetween(String value1, String value2) {
            addCriterion("BXH between", value1, value2, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxhNotBetween(String value1, String value2) {
            addCriterion("BXH not between", value1, value2, "bxh");
            return (Criteria) this;
        }

        public Criteria andBxlxIsNull() {
            addCriterion("BXLX is null");
            return (Criteria) this;
        }

        public Criteria andBxlxIsNotNull() {
            addCriterion("BXLX is not null");
            return (Criteria) this;
        }

        public Criteria andBxlxEqualTo(String value) {
            addCriterion("BXLX =", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxNotEqualTo(String value) {
            addCriterion("BXLX <>", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxGreaterThan(String value) {
            addCriterion("BXLX >", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxGreaterThanOrEqualTo(String value) {
            addCriterion("BXLX >=", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxLessThan(String value) {
            addCriterion("BXLX <", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxLessThanOrEqualTo(String value) {
            addCriterion("BXLX <=", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxLike(String value) {
            addCriterion("BXLX like", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxNotLike(String value) {
            addCriterion("BXLX not like", value, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxIn(List<String> values) {
            addCriterion("BXLX in", values, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxNotIn(List<String> values) {
            addCriterion("BXLX not in", values, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxBetween(String value1, String value2) {
            addCriterion("BXLX between", value1, value2, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxlxNotBetween(String value1, String value2) {
            addCriterion("BXLX not between", value1, value2, "bxlx");
            return (Criteria) this;
        }

        public Criteria andBxjeIsNull() {
            addCriterion("BXJE is null");
            return (Criteria) this;
        }

        public Criteria andBxjeIsNotNull() {
            addCriterion("BXJE is not null");
            return (Criteria) this;
        }

        public Criteria andBxjeEqualTo(String value) {
            addCriterion("BXJE =", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeNotEqualTo(String value) {
            addCriterion("BXJE <>", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeGreaterThan(String value) {
            addCriterion("BXJE >", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeGreaterThanOrEqualTo(String value) {
            addCriterion("BXJE >=", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeLessThan(String value) {
            addCriterion("BXJE <", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeLessThanOrEqualTo(String value) {
            addCriterion("BXJE <=", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeLike(String value) {
            addCriterion("BXJE like", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeNotLike(String value) {
            addCriterion("BXJE not like", value, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeIn(List<String> values) {
            addCriterion("BXJE in", values, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeNotIn(List<String> values) {
            addCriterion("BXJE not in", values, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeBetween(String value1, String value2) {
            addCriterion("BXJE between", value1, value2, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxjeNotBetween(String value1, String value2) {
            addCriterion("BXJE not between", value1, value2, "bxje");
            return (Criteria) this;
        }

        public Criteria andBxsxsjIsNull() {
            addCriterion("BXSXSJ is null");
            return (Criteria) this;
        }

        public Criteria andBxsxsjIsNotNull() {
            addCriterion("BXSXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBxsxsjEqualTo(Date value) {
            addCriterionForJDBCDate("BXSXSJ =", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("BXSXSJ <>", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjGreaterThan(Date value) {
            addCriterionForJDBCDate("BXSXSJ >", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BXSXSJ >=", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjLessThan(Date value) {
            addCriterionForJDBCDate("BXSXSJ <", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BXSXSJ <=", value, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjIn(List<Date> values) {
            addCriterionForJDBCDate("BXSXSJ in", values, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("BXSXSJ not in", values, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BXSXSJ between", value1, value2, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxsxsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BXSXSJ not between", value1, value2, "bxsxsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjIsNull() {
            addCriterion("BXDQSJ is null");
            return (Criteria) this;
        }

        public Criteria andBxdqsjIsNotNull() {
            addCriterion("BXDQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBxdqsjEqualTo(Date value) {
            addCriterionForJDBCDate("BXDQSJ =", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("BXDQSJ <>", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("BXDQSJ >", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BXDQSJ >=", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjLessThan(Date value) {
            addCriterionForJDBCDate("BXDQSJ <", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BXDQSJ <=", value, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjIn(List<Date> values) {
            addCriterionForJDBCDate("BXDQSJ in", values, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("BXDQSJ not in", values, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BXDQSJ between", value1, value2, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andBxdqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BXDQSJ not between", value1, value2, "bxdqsj");
            return (Criteria) this;
        }

        public Criteria andYjlxIsNull() {
            addCriterion("YJLX is null");
            return (Criteria) this;
        }

        public Criteria andYjlxIsNotNull() {
            addCriterion("YJLX is not null");
            return (Criteria) this;
        }

        public Criteria andYjlxEqualTo(String value) {
            addCriterion("YJLX =", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxNotEqualTo(String value) {
            addCriterion("YJLX <>", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxGreaterThan(String value) {
            addCriterion("YJLX >", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxGreaterThanOrEqualTo(String value) {
            addCriterion("YJLX >=", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxLessThan(String value) {
            addCriterion("YJLX <", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxLessThanOrEqualTo(String value) {
            addCriterion("YJLX <=", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxLike(String value) {
            addCriterion("YJLX like", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxNotLike(String value) {
            addCriterion("YJLX not like", value, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxIn(List<String> values) {
            addCriterion("YJLX in", values, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxNotIn(List<String> values) {
            addCriterion("YJLX not in", values, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxBetween(String value1, String value2) {
            addCriterion("YJLX between", value1, value2, "yjlx");
            return (Criteria) this;
        }

        public Criteria andYjlxNotBetween(String value1, String value2) {
            addCriterion("YJLX not between", value1, value2, "yjlx");
            return (Criteria) this;
        }

        public Criteria andFdjplIsNull() {
            addCriterion("FDJPL is null");
            return (Criteria) this;
        }

        public Criteria andFdjplIsNotNull() {
            addCriterion("FDJPL is not null");
            return (Criteria) this;
        }

        public Criteria andFdjplEqualTo(String value) {
            addCriterion("FDJPL =", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplNotEqualTo(String value) {
            addCriterion("FDJPL <>", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplGreaterThan(String value) {
            addCriterion("FDJPL >", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplGreaterThanOrEqualTo(String value) {
            addCriterion("FDJPL >=", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplLessThan(String value) {
            addCriterion("FDJPL <", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplLessThanOrEqualTo(String value) {
            addCriterion("FDJPL <=", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplLike(String value) {
            addCriterion("FDJPL like", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplNotLike(String value) {
            addCriterion("FDJPL not like", value, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplIn(List<String> values) {
            addCriterion("FDJPL in", values, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplNotIn(List<String> values) {
            addCriterion("FDJPL not in", values, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplBetween(String value1, String value2) {
            addCriterion("FDJPL between", value1, value2, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andFdjplNotBetween(String value1, String value2) {
            addCriterion("FDJPL not between", value1, value2, "fdjpl");
            return (Criteria) this;
        }

        public Criteria andXszlcIsNull() {
            addCriterion("XSZLC is null");
            return (Criteria) this;
        }

        public Criteria andXszlcIsNotNull() {
            addCriterion("XSZLC is not null");
            return (Criteria) this;
        }

        public Criteria andXszlcEqualTo(String value) {
            addCriterion("XSZLC =", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcNotEqualTo(String value) {
            addCriterion("XSZLC <>", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcGreaterThan(String value) {
            addCriterion("XSZLC >", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcGreaterThanOrEqualTo(String value) {
            addCriterion("XSZLC >=", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcLessThan(String value) {
            addCriterion("XSZLC <", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcLessThanOrEqualTo(String value) {
            addCriterion("XSZLC <=", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcLike(String value) {
            addCriterion("XSZLC like", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcNotLike(String value) {
            addCriterion("XSZLC not like", value, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcIn(List<String> values) {
            addCriterion("XSZLC in", values, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcNotIn(List<String> values) {
            addCriterion("XSZLC not in", values, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcBetween(String value1, String value2) {
            addCriterion("XSZLC between", value1, value2, "xszlc");
            return (Criteria) this;
        }

        public Criteria andXszlcNotBetween(String value1, String value2) {
            addCriterion("XSZLC not between", value1, value2, "xszlc");
            return (Criteria) this;
        }

        public Criteria andObdxlhIsNull() {
            addCriterion("OBDXLH is null");
            return (Criteria) this;
        }

        public Criteria andObdxlhIsNotNull() {
            addCriterion("OBDXLH is not null");
            return (Criteria) this;
        }

        public Criteria andObdxlhEqualTo(String value) {
            addCriterion("OBDXLH =", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhNotEqualTo(String value) {
            addCriterion("OBDXLH <>", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhGreaterThan(String value) {
            addCriterion("OBDXLH >", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhGreaterThanOrEqualTo(String value) {
            addCriterion("OBDXLH >=", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhLessThan(String value) {
            addCriterion("OBDXLH <", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhLessThanOrEqualTo(String value) {
            addCriterion("OBDXLH <=", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhLike(String value) {
            addCriterion("OBDXLH like", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhNotLike(String value) {
            addCriterion("OBDXLH not like", value, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhIn(List<String> values) {
            addCriterion("OBDXLH in", values, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhNotIn(List<String> values) {
            addCriterion("OBDXLH not in", values, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhBetween(String value1, String value2) {
            addCriterion("OBDXLH between", value1, value2, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andObdxlhNotBetween(String value1, String value2) {
            addCriterion("OBDXLH not between", value1, value2, "obdxlh");
            return (Criteria) this;
        }

        public Criteria andCljxztIsNull() {
            addCriterion("CLJXZT is null");
            return (Criteria) this;
        }

        public Criteria andCljxztIsNotNull() {
            addCriterion("CLJXZT is not null");
            return (Criteria) this;
        }

        public Criteria andCljxztEqualTo(String value) {
            addCriterion("CLJXZT =", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztNotEqualTo(String value) {
            addCriterion("CLJXZT <>", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztGreaterThan(String value) {
            addCriterion("CLJXZT >", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztGreaterThanOrEqualTo(String value) {
            addCriterion("CLJXZT >=", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztLessThan(String value) {
            addCriterion("CLJXZT <", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztLessThanOrEqualTo(String value) {
            addCriterion("CLJXZT <=", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztLike(String value) {
            addCriterion("CLJXZT like", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztNotLike(String value) {
            addCriterion("CLJXZT not like", value, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztIn(List<String> values) {
            addCriterion("CLJXZT in", values, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztNotIn(List<String> values) {
            addCriterion("CLJXZT not in", values, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztBetween(String value1, String value2) {
            addCriterion("CLJXZT between", value1, value2, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andCljxztNotBetween(String value1, String value2) {
            addCriterion("CLJXZT not between", value1, value2, "cljxzt");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjIsNull() {
            addCriterion("CLXCNJSJ is null");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjIsNotNull() {
            addCriterion("CLXCNJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjEqualTo(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ =", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ <>", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ >", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ >=", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjLessThan(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ <", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLXCNJSJ <=", value, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjIn(List<Date> values) {
            addCriterionForJDBCDate("CLXCNJSJ in", values, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLXCNJSJ not in", values, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLXCNJSJ between", value1, value2, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andClxcnjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLXCNJSJ not between", value1, value2, "clxcnjsj");
            return (Criteria) this;
        }

        public Criteria andYszhIsNull() {
            addCriterion("YSZH is null");
            return (Criteria) this;
        }

        public Criteria andYszhIsNotNull() {
            addCriterion("YSZH is not null");
            return (Criteria) this;
        }

        public Criteria andYszhEqualTo(String value) {
            addCriterion("YSZH =", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhNotEqualTo(String value) {
            addCriterion("YSZH <>", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhGreaterThan(String value) {
            addCriterion("YSZH >", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhGreaterThanOrEqualTo(String value) {
            addCriterion("YSZH >=", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhLessThan(String value) {
            addCriterion("YSZH <", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhLessThanOrEqualTo(String value) {
            addCriterion("YSZH <=", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhLike(String value) {
            addCriterion("YSZH like", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhNotLike(String value) {
            addCriterion("YSZH not like", value, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhIn(List<String> values) {
            addCriterion("YSZH in", values, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhNotIn(List<String> values) {
            addCriterion("YSZH not in", values, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhBetween(String value1, String value2) {
            addCriterion("YSZH between", value1, value2, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszhNotBetween(String value1, String value2) {
            addCriterion("YSZH not between", value1, value2, "yszh");
            return (Criteria) this;
        }

        public Criteria andYszjIsNull() {
            addCriterion("YSZJ is null");
            return (Criteria) this;
        }

        public Criteria andYszjIsNotNull() {
            addCriterion("YSZJ is not null");
            return (Criteria) this;
        }

        public Criteria andYszjEqualTo(String value) {
            addCriterion("YSZJ =", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjNotEqualTo(String value) {
            addCriterion("YSZJ <>", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjGreaterThan(String value) {
            addCriterion("YSZJ >", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjGreaterThanOrEqualTo(String value) {
            addCriterion("YSZJ >=", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjLessThan(String value) {
            addCriterion("YSZJ <", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjLessThanOrEqualTo(String value) {
            addCriterion("YSZJ <=", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjLike(String value) {
            addCriterion("YSZJ like", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjNotLike(String value) {
            addCriterion("YSZJ not like", value, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjIn(List<String> values) {
            addCriterion("YSZJ in", values, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjNotIn(List<String> values) {
            addCriterion("YSZJ not in", values, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjBetween(String value1, String value2) {
            addCriterion("YSZJ between", value1, value2, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszjNotBetween(String value1, String value2) {
            addCriterion("YSZJ not between", value1, value2, "yszj");
            return (Criteria) this;
        }

        public Criteria andYszfzjgIsNull() {
            addCriterion("YSZFZJG is null");
            return (Criteria) this;
        }

        public Criteria andYszfzjgIsNotNull() {
            addCriterion("YSZFZJG is not null");
            return (Criteria) this;
        }

        public Criteria andYszfzjgEqualTo(String value) {
            addCriterion("YSZFZJG =", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgNotEqualTo(String value) {
            addCriterion("YSZFZJG <>", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgGreaterThan(String value) {
            addCriterion("YSZFZJG >", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgGreaterThanOrEqualTo(String value) {
            addCriterion("YSZFZJG >=", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgLessThan(String value) {
            addCriterion("YSZFZJG <", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgLessThanOrEqualTo(String value) {
            addCriterion("YSZFZJG <=", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgLike(String value) {
            addCriterion("YSZFZJG like", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgNotLike(String value) {
            addCriterion("YSZFZJG not like", value, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgIn(List<String> values) {
            addCriterion("YSZFZJG in", values, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgNotIn(List<String> values) {
            addCriterion("YSZFZJG not in", values, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgBetween(String value1, String value2) {
            addCriterion("YSZFZJG between", value1, value2, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andYszfzjgNotBetween(String value1, String value2) {
            addCriterion("YSZFZJG not between", value1, value2, "yszfzjg");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNull() {
            addCriterion("JYFW is null");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNotNull() {
            addCriterion("JYFW is not null");
            return (Criteria) this;
        }

        public Criteria andJyfwEqualTo(String value) {
            addCriterion("JYFW =", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotEqualTo(String value) {
            addCriterion("JYFW <>", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThan(String value) {
            addCriterion("JYFW >", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThanOrEqualTo(String value) {
            addCriterion("JYFW >=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThan(String value) {
            addCriterion("JYFW <", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThanOrEqualTo(String value) {
            addCriterion("JYFW <=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLike(String value) {
            addCriterion("JYFW like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotLike(String value) {
            addCriterion("JYFW not like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIn(List<String> values) {
            addCriterion("JYFW in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotIn(List<String> values) {
            addCriterion("JYFW not in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwBetween(String value1, String value2) {
            addCriterion("JYFW between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotBetween(String value1, String value2) {
            addCriterion("JYFW not between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andYszyxqqIsNull() {
            addCriterion("YSZYXQQ is null");
            return (Criteria) this;
        }

        public Criteria andYszyxqqIsNotNull() {
            addCriterion("YSZYXQQ is not null");
            return (Criteria) this;
        }

        public Criteria andYszyxqqEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQQ =", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqNotEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQQ <>", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqGreaterThan(Date value) {
            addCriterionForJDBCDate("YSZYXQQ >", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQQ >=", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqLessThan(Date value) {
            addCriterionForJDBCDate("YSZYXQQ <", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQQ <=", value, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqIn(List<Date> values) {
            addCriterionForJDBCDate("YSZYXQQ in", values, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqNotIn(List<Date> values) {
            addCriterionForJDBCDate("YSZYXQQ not in", values, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YSZYXQQ between", value1, value2, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YSZYXQQ not between", value1, value2, "yszyxqq");
            return (Criteria) this;
        }

        public Criteria andYszyxqzIsNull() {
            addCriterion("YSZYXQZ is null");
            return (Criteria) this;
        }

        public Criteria andYszyxqzIsNotNull() {
            addCriterion("YSZYXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andYszyxqzEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQZ =", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzNotEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQZ <>", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzGreaterThan(Date value) {
            addCriterionForJDBCDate("YSZYXQZ >", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQZ >=", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzLessThan(Date value) {
            addCriterionForJDBCDate("YSZYXQZ <", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YSZYXQZ <=", value, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzIn(List<Date> values) {
            addCriterionForJDBCDate("YSZYXQZ in", values, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzNotIn(List<Date> values) {
            addCriterionForJDBCDate("YSZYXQZ not in", values, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YSZYXQZ between", value1, value2, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andYszyxqzNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YSZYXQZ not between", value1, value2, "yszyxqz");
            return (Criteria) this;
        }

        public Criteria andClccrqIsNull() {
            addCriterion("CLCCRQ is null");
            return (Criteria) this;
        }

        public Criteria andClccrqIsNotNull() {
            addCriterion("CLCCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andClccrqEqualTo(Date value) {
            addCriterionForJDBCDate("CLCCRQ =", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLCCRQ <>", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqGreaterThan(Date value) {
            addCriterionForJDBCDate("CLCCRQ >", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLCCRQ >=", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqLessThan(Date value) {
            addCriterionForJDBCDate("CLCCRQ <", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLCCRQ <=", value, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqIn(List<Date> values) {
            addCriterionForJDBCDate("CLCCRQ in", values, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLCCRQ not in", values, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLCCRQ between", value1, value2, "clccrq");
            return (Criteria) this;
        }

        public Criteria andClccrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLCCRQ not between", value1, value2, "clccrq");
            return (Criteria) this;
        }

        public Criteria andCscdIsNull() {
            addCriterion("CSCD is null");
            return (Criteria) this;
        }

        public Criteria andCscdIsNotNull() {
            addCriterion("CSCD is not null");
            return (Criteria) this;
        }

        public Criteria andCscdEqualTo(String value) {
            addCriterion("CSCD =", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdNotEqualTo(String value) {
            addCriterion("CSCD <>", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdGreaterThan(String value) {
            addCriterion("CSCD >", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdGreaterThanOrEqualTo(String value) {
            addCriterion("CSCD >=", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdLessThan(String value) {
            addCriterion("CSCD <", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdLessThanOrEqualTo(String value) {
            addCriterion("CSCD <=", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdLike(String value) {
            addCriterion("CSCD like", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdNotLike(String value) {
            addCriterion("CSCD not like", value, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdIn(List<String> values) {
            addCriterion("CSCD in", values, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdNotIn(List<String> values) {
            addCriterion("CSCD not in", values, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdBetween(String value1, String value2) {
            addCriterion("CSCD between", value1, value2, "cscd");
            return (Criteria) this;
        }

        public Criteria andCscdNotBetween(String value1, String value2) {
            addCriterion("CSCD not between", value1, value2, "cscd");
            return (Criteria) this;
        }

        public Criteria andCskdIsNull() {
            addCriterion("CSKD is null");
            return (Criteria) this;
        }

        public Criteria andCskdIsNotNull() {
            addCriterion("CSKD is not null");
            return (Criteria) this;
        }

        public Criteria andCskdEqualTo(String value) {
            addCriterion("CSKD =", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdNotEqualTo(String value) {
            addCriterion("CSKD <>", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdGreaterThan(String value) {
            addCriterion("CSKD >", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdGreaterThanOrEqualTo(String value) {
            addCriterion("CSKD >=", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdLessThan(String value) {
            addCriterion("CSKD <", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdLessThanOrEqualTo(String value) {
            addCriterion("CSKD <=", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdLike(String value) {
            addCriterion("CSKD like", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdNotLike(String value) {
            addCriterion("CSKD not like", value, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdIn(List<String> values) {
            addCriterion("CSKD in", values, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdNotIn(List<String> values) {
            addCriterion("CSKD not in", values, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdBetween(String value1, String value2) {
            addCriterion("CSKD between", value1, value2, "cskd");
            return (Criteria) this;
        }

        public Criteria andCskdNotBetween(String value1, String value2) {
            addCriterion("CSKD not between", value1, value2, "cskd");
            return (Criteria) this;
        }

        public Criteria andCsgdIsNull() {
            addCriterion("CSGD is null");
            return (Criteria) this;
        }

        public Criteria andCsgdIsNotNull() {
            addCriterion("CSGD is not null");
            return (Criteria) this;
        }

        public Criteria andCsgdEqualTo(String value) {
            addCriterion("CSGD =", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdNotEqualTo(String value) {
            addCriterion("CSGD <>", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdGreaterThan(String value) {
            addCriterion("CSGD >", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdGreaterThanOrEqualTo(String value) {
            addCriterion("CSGD >=", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdLessThan(String value) {
            addCriterion("CSGD <", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdLessThanOrEqualTo(String value) {
            addCriterion("CSGD <=", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdLike(String value) {
            addCriterion("CSGD like", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdNotLike(String value) {
            addCriterion("CSGD not like", value, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdIn(List<String> values) {
            addCriterion("CSGD in", values, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdNotIn(List<String> values) {
            addCriterion("CSGD not in", values, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdBetween(String value1, String value2) {
            addCriterion("CSGD between", value1, value2, "csgd");
            return (Criteria) this;
        }

        public Criteria andCsgdNotBetween(String value1, String value2) {
            addCriterion("CSGD not between", value1, value2, "csgd");
            return (Criteria) this;
        }

        public Criteria andClzjIsNull() {
            addCriterion("CLZJ is null");
            return (Criteria) this;
        }

        public Criteria andClzjIsNotNull() {
            addCriterion("CLZJ is not null");
            return (Criteria) this;
        }

        public Criteria andClzjEqualTo(String value) {
            addCriterion("CLZJ =", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjNotEqualTo(String value) {
            addCriterion("CLZJ <>", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjGreaterThan(String value) {
            addCriterion("CLZJ >", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjGreaterThanOrEqualTo(String value) {
            addCriterion("CLZJ >=", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjLessThan(String value) {
            addCriterion("CLZJ <", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjLessThanOrEqualTo(String value) {
            addCriterion("CLZJ <=", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjLike(String value) {
            addCriterion("CLZJ like", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjNotLike(String value) {
            addCriterion("CLZJ not like", value, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjIn(List<String> values) {
            addCriterion("CLZJ in", values, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjNotIn(List<String> values) {
            addCriterion("CLZJ not in", values, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjBetween(String value1, String value2) {
            addCriterion("CLZJ between", value1, value2, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzjNotBetween(String value1, String value2) {
            addCriterion("CLZJ not between", value1, value2, "clzj");
            return (Criteria) this;
        }

        public Criteria andClzsIsNull() {
            addCriterion("CLZS is null");
            return (Criteria) this;
        }

        public Criteria andClzsIsNotNull() {
            addCriterion("CLZS is not null");
            return (Criteria) this;
        }

        public Criteria andClzsEqualTo(Integer value) {
            addCriterion("CLZS =", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsNotEqualTo(Integer value) {
            addCriterion("CLZS <>", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsGreaterThan(Integer value) {
            addCriterion("CLZS >", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLZS >=", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsLessThan(Integer value) {
            addCriterion("CLZS <", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsLessThanOrEqualTo(Integer value) {
            addCriterion("CLZS <=", value, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsIn(List<Integer> values) {
            addCriterion("CLZS in", values, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsNotIn(List<Integer> values) {
            addCriterion("CLZS not in", values, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsBetween(Integer value1, Integer value2) {
            addCriterion("CLZS between", value1, value2, "clzs");
            return (Criteria) this;
        }

        public Criteria andClzsNotBetween(Integer value1, Integer value2) {
            addCriterion("CLZS not between", value1, value2, "clzs");
            return (Criteria) this;
        }

        public Criteria andZgssIsNull() {
            addCriterion("ZGSS is null");
            return (Criteria) this;
        }

        public Criteria andZgssIsNotNull() {
            addCriterion("ZGSS is not null");
            return (Criteria) this;
        }

        public Criteria andZgssEqualTo(String value) {
            addCriterion("ZGSS =", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssNotEqualTo(String value) {
            addCriterion("ZGSS <>", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssGreaterThan(String value) {
            addCriterion("ZGSS >", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssGreaterThanOrEqualTo(String value) {
            addCriterion("ZGSS >=", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssLessThan(String value) {
            addCriterion("ZGSS <", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssLessThanOrEqualTo(String value) {
            addCriterion("ZGSS <=", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssLike(String value) {
            addCriterion("ZGSS like", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssNotLike(String value) {
            addCriterion("ZGSS not like", value, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssIn(List<String> values) {
            addCriterion("ZGSS in", values, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssNotIn(List<String> values) {
            addCriterion("ZGSS not in", values, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssBetween(String value1, String value2) {
            addCriterion("ZGSS between", value1, value2, "zgss");
            return (Criteria) this;
        }

        public Criteria andZgssNotBetween(String value1, String value2) {
            addCriterion("ZGSS not between", value1, value2, "zgss");
            return (Criteria) this;
        }

        public Criteria andXhlcIsNull() {
            addCriterion("XHLC is null");
            return (Criteria) this;
        }

        public Criteria andXhlcIsNotNull() {
            addCriterion("XHLC is not null");
            return (Criteria) this;
        }

        public Criteria andXhlcEqualTo(String value) {
            addCriterion("XHLC =", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcNotEqualTo(String value) {
            addCriterion("XHLC <>", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcGreaterThan(String value) {
            addCriterion("XHLC >", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcGreaterThanOrEqualTo(String value) {
            addCriterion("XHLC >=", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcLessThan(String value) {
            addCriterion("XHLC <", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcLessThanOrEqualTo(String value) {
            addCriterion("XHLC <=", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcLike(String value) {
            addCriterion("XHLC like", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcNotLike(String value) {
            addCriterion("XHLC not like", value, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcIn(List<String> values) {
            addCriterion("XHLC in", values, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcNotIn(List<String> values) {
            addCriterion("XHLC not in", values, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcBetween(String value1, String value2) {
            addCriterion("XHLC between", value1, value2, "xhlc");
            return (Criteria) this;
        }

        public Criteria andXhlcNotBetween(String value1, String value2) {
            addCriterion("XHLC not between", value1, value2, "xhlc");
            return (Criteria) this;
        }

        public Criteria andYclyyxzIsNull() {
            addCriterion("YCLYYXZ is null");
            return (Criteria) this;
        }

        public Criteria andYclyyxzIsNotNull() {
            addCriterion("YCLYYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andYclyyxzEqualTo(String value) {
            addCriterion("YCLYYXZ =", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzNotEqualTo(String value) {
            addCriterion("YCLYYXZ <>", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzGreaterThan(String value) {
            addCriterion("YCLYYXZ >", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzGreaterThanOrEqualTo(String value) {
            addCriterion("YCLYYXZ >=", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzLessThan(String value) {
            addCriterion("YCLYYXZ <", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzLessThanOrEqualTo(String value) {
            addCriterion("YCLYYXZ <=", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzLike(String value) {
            addCriterion("YCLYYXZ like", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzNotLike(String value) {
            addCriterion("YCLYYXZ not like", value, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzIn(List<String> values) {
            addCriterion("YCLYYXZ in", values, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzNotIn(List<String> values) {
            addCriterion("YCLYYXZ not in", values, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzBetween(String value1, String value2) {
            addCriterion("YCLYYXZ between", value1, value2, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andYclyyxzNotBetween(String value1, String value2) {
            addCriterion("YCLYYXZ not between", value1, value2, "yclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzIsNull() {
            addCriterion("XCLYYXZ is null");
            return (Criteria) this;
        }

        public Criteria andXclyyxzIsNotNull() {
            addCriterion("XCLYYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXclyyxzEqualTo(String value) {
            addCriterion("XCLYYXZ =", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzNotEqualTo(String value) {
            addCriterion("XCLYYXZ <>", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzGreaterThan(String value) {
            addCriterion("XCLYYXZ >", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzGreaterThanOrEqualTo(String value) {
            addCriterion("XCLYYXZ >=", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzLessThan(String value) {
            addCriterion("XCLYYXZ <", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzLessThanOrEqualTo(String value) {
            addCriterion("XCLYYXZ <=", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzLike(String value) {
            addCriterion("XCLYYXZ like", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzNotLike(String value) {
            addCriterion("XCLYYXZ not like", value, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzIn(List<String> values) {
            addCriterion("XCLYYXZ in", values, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzNotIn(List<String> values) {
            addCriterion("XCLYYXZ not in", values, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzBetween(String value1, String value2) {
            addCriterion("XCLYYXZ between", value1, value2, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andXclyyxzNotBetween(String value1, String value2) {
            addCriterion("XCLYYXZ not between", value1, value2, "xclyyxz");
            return (Criteria) this;
        }

        public Criteria andClgzjeIsNull() {
            addCriterion("CLGZJE is null");
            return (Criteria) this;
        }

        public Criteria andClgzjeIsNotNull() {
            addCriterion("CLGZJE is not null");
            return (Criteria) this;
        }

        public Criteria andClgzjeEqualTo(String value) {
            addCriterion("CLGZJE =", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeNotEqualTo(String value) {
            addCriterion("CLGZJE <>", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeGreaterThan(String value) {
            addCriterion("CLGZJE >", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeGreaterThanOrEqualTo(String value) {
            addCriterion("CLGZJE >=", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeLessThan(String value) {
            addCriterion("CLGZJE <", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeLessThanOrEqualTo(String value) {
            addCriterion("CLGZJE <=", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeLike(String value) {
            addCriterion("CLGZJE like", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeNotLike(String value) {
            addCriterion("CLGZJE not like", value, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeIn(List<String> values) {
            addCriterion("CLGZJE in", values, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeNotIn(List<String> values) {
            addCriterion("CLGZJE not in", values, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeBetween(String value1, String value2) {
            addCriterion("CLGZJE between", value1, value2, "clgzje");
            return (Criteria) this;
        }

        public Criteria andClgzjeNotBetween(String value1, String value2) {
            addCriterion("CLGZJE not between", value1, value2, "clgzje");
            return (Criteria) this;
        }

        public Criteria andHbdjIsNull() {
            addCriterion("HBDJ is null");
            return (Criteria) this;
        }

        public Criteria andHbdjIsNotNull() {
            addCriterion("HBDJ is not null");
            return (Criteria) this;
        }

        public Criteria andHbdjEqualTo(String value) {
            addCriterion("HBDJ =", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjNotEqualTo(String value) {
            addCriterion("HBDJ <>", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjGreaterThan(String value) {
            addCriterion("HBDJ >", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjGreaterThanOrEqualTo(String value) {
            addCriterion("HBDJ >=", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjLessThan(String value) {
            addCriterion("HBDJ <", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjLessThanOrEqualTo(String value) {
            addCriterion("HBDJ <=", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjLike(String value) {
            addCriterion("HBDJ like", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjNotLike(String value) {
            addCriterion("HBDJ not like", value, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjIn(List<String> values) {
            addCriterion("HBDJ in", values, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjNotIn(List<String> values) {
            addCriterion("HBDJ not in", values, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjBetween(String value1, String value2) {
            addCriterion("HBDJ between", value1, value2, "hbdj");
            return (Criteria) this;
        }

        public Criteria andHbdjNotBetween(String value1, String value2) {
            addCriterion("HBDJ not between", value1, value2, "hbdj");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzIsNull() {
            addCriterion("CLWXDWZZ is null");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzIsNotNull() {
            addCriterion("CLWXDWZZ is not null");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzEqualTo(String value) {
            addCriterion("CLWXDWZZ =", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzNotEqualTo(String value) {
            addCriterion("CLWXDWZZ <>", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzGreaterThan(String value) {
            addCriterion("CLWXDWZZ >", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzGreaterThanOrEqualTo(String value) {
            addCriterion("CLWXDWZZ >=", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzLessThan(String value) {
            addCriterion("CLWXDWZZ <", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzLessThanOrEqualTo(String value) {
            addCriterion("CLWXDWZZ <=", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzLike(String value) {
            addCriterion("CLWXDWZZ like", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzNotLike(String value) {
            addCriterion("CLWXDWZZ not like", value, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzIn(List<String> values) {
            addCriterion("CLWXDWZZ in", values, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzNotIn(List<String> values) {
            addCriterion("CLWXDWZZ not in", values, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzBetween(String value1, String value2) {
            addCriterion("CLWXDWZZ between", value1, value2, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andClwxdwzzNotBetween(String value1, String value2) {
            addCriterion("CLWXDWZZ not between", value1, value2, "clwxdwzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzIsNull() {
            addCriterion("YJBJZZ is null");
            return (Criteria) this;
        }

        public Criteria andYjbjzzIsNotNull() {
            addCriterion("YJBJZZ is not null");
            return (Criteria) this;
        }

        public Criteria andYjbjzzEqualTo(String value) {
            addCriterion("YJBJZZ =", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzNotEqualTo(String value) {
            addCriterion("YJBJZZ <>", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzGreaterThan(String value) {
            addCriterion("YJBJZZ >", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzGreaterThanOrEqualTo(String value) {
            addCriterion("YJBJZZ >=", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzLessThan(String value) {
            addCriterion("YJBJZZ <", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzLessThanOrEqualTo(String value) {
            addCriterion("YJBJZZ <=", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzLike(String value) {
            addCriterion("YJBJZZ like", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzNotLike(String value) {
            addCriterion("YJBJZZ not like", value, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzIn(List<String> values) {
            addCriterion("YJBJZZ in", values, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzNotIn(List<String> values) {
            addCriterion("YJBJZZ not in", values, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzBetween(String value1, String value2) {
            addCriterion("YJBJZZ between", value1, value2, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andYjbjzzNotBetween(String value1, String value2) {
            addCriterion("YJBJZZ not between", value1, value2, "yjbjzz");
            return (Criteria) this;
        }

        public Criteria andPtbzbsIsNull() {
            addCriterion("PTBZBS is null");
            return (Criteria) this;
        }

        public Criteria andPtbzbsIsNotNull() {
            addCriterion("PTBZBS is not null");
            return (Criteria) this;
        }

        public Criteria andPtbzbsEqualTo(String value) {
            addCriterion("PTBZBS =", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsNotEqualTo(String value) {
            addCriterion("PTBZBS <>", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsGreaterThan(String value) {
            addCriterion("PTBZBS >", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsGreaterThanOrEqualTo(String value) {
            addCriterion("PTBZBS >=", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsLessThan(String value) {
            addCriterion("PTBZBS <", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsLessThanOrEqualTo(String value) {
            addCriterion("PTBZBS <=", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsLike(String value) {
            addCriterion("PTBZBS like", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsNotLike(String value) {
            addCriterion("PTBZBS not like", value, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsIn(List<String> values) {
            addCriterion("PTBZBS in", values, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsNotIn(List<String> values) {
            addCriterion("PTBZBS not in", values, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsBetween(String value1, String value2) {
            addCriterion("PTBZBS between", value1, value2, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andPtbzbsNotBetween(String value1, String value2) {
            addCriterion("PTBZBS not between", value1, value2, "ptbzbs");
            return (Criteria) this;
        }

        public Criteria andDdzzIsNull() {
            addCriterion("DDZZ is null");
            return (Criteria) this;
        }

        public Criteria andDdzzIsNotNull() {
            addCriterion("DDZZ is not null");
            return (Criteria) this;
        }

        public Criteria andDdzzEqualTo(String value) {
            addCriterion("DDZZ =", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzNotEqualTo(String value) {
            addCriterion("DDZZ <>", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzGreaterThan(String value) {
            addCriterion("DDZZ >", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzGreaterThanOrEqualTo(String value) {
            addCriterion("DDZZ >=", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzLessThan(String value) {
            addCriterion("DDZZ <", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzLessThanOrEqualTo(String value) {
            addCriterion("DDZZ <=", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzLike(String value) {
            addCriterion("DDZZ like", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzNotLike(String value) {
            addCriterion("DDZZ not like", value, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzIn(List<String> values) {
            addCriterion("DDZZ in", values, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzNotIn(List<String> values) {
            addCriterion("DDZZ not in", values, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzBetween(String value1, String value2) {
            addCriterion("DDZZ between", value1, value2, "ddzz");
            return (Criteria) this;
        }

        public Criteria andDdzzNotBetween(String value1, String value2) {
            addCriterion("DDZZ not between", value1, value2, "ddzz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzIsNull() {
            addCriterion("JDCDJZ is null");
            return (Criteria) this;
        }

        public Criteria andJdcdjzIsNotNull() {
            addCriterion("JDCDJZ is not null");
            return (Criteria) this;
        }

        public Criteria andJdcdjzEqualTo(String value) {
            addCriterion("JDCDJZ =", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzNotEqualTo(String value) {
            addCriterion("JDCDJZ <>", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzGreaterThan(String value) {
            addCriterion("JDCDJZ >", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzGreaterThanOrEqualTo(String value) {
            addCriterion("JDCDJZ >=", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzLessThan(String value) {
            addCriterion("JDCDJZ <", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzLessThanOrEqualTo(String value) {
            addCriterion("JDCDJZ <=", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzLike(String value) {
            addCriterion("JDCDJZ like", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzNotLike(String value) {
            addCriterion("JDCDJZ not like", value, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzIn(List<String> values) {
            addCriterion("JDCDJZ in", values, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzNotIn(List<String> values) {
            addCriterion("JDCDJZ not in", values, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzBetween(String value1, String value2) {
            addCriterion("JDCDJZ between", value1, value2, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjzNotBetween(String value1, String value2) {
            addCriterion("JDCDJZ not between", value1, value2, "jdcdjz");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhIsNull() {
            addCriterion("JDCDJBH is null");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhIsNotNull() {
            addCriterion("JDCDJBH is not null");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhEqualTo(String value) {
            addCriterion("JDCDJBH =", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhNotEqualTo(String value) {
            addCriterion("JDCDJBH <>", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhGreaterThan(String value) {
            addCriterion("JDCDJBH >", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhGreaterThanOrEqualTo(String value) {
            addCriterion("JDCDJBH >=", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhLessThan(String value) {
            addCriterion("JDCDJBH <", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhLessThanOrEqualTo(String value) {
            addCriterion("JDCDJBH <=", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhLike(String value) {
            addCriterion("JDCDJBH like", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhNotLike(String value) {
            addCriterion("JDCDJBH not like", value, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhIn(List<String> values) {
            addCriterion("JDCDJBH in", values, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhNotIn(List<String> values) {
            addCriterion("JDCDJBH not in", values, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhBetween(String value1, String value2) {
            addCriterion("JDCDJBH between", value1, value2, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andJdcdjbhNotBetween(String value1, String value2) {
            addCriterion("JDCDJBH not between", value1, value2, "jdcdjbh");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqIsNull() {
            addCriterion("DJZDJRQ is null");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqIsNotNull() {
            addCriterion("DJZDJRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqEqualTo(Date value) {
            addCriterionForJDBCDate("DJZDJRQ =", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("DJZDJRQ <>", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqGreaterThan(Date value) {
            addCriterionForJDBCDate("DJZDJRQ >", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJZDJRQ >=", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqLessThan(Date value) {
            addCriterionForJDBCDate("DJZDJRQ <", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJZDJRQ <=", value, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqIn(List<Date> values) {
            addCriterionForJDBCDate("DJZDJRQ in", values, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("DJZDJRQ not in", values, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJZDJRQ between", value1, value2, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJZDJRQ not between", value1, value2, "djzdjrq");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgIsNull() {
            addCriterion("DJZDJJG is null");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgIsNotNull() {
            addCriterion("DJZDJJG is not null");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgEqualTo(String value) {
            addCriterion("DJZDJJG =", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgNotEqualTo(String value) {
            addCriterion("DJZDJJG <>", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgGreaterThan(String value) {
            addCriterion("DJZDJJG >", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgGreaterThanOrEqualTo(String value) {
            addCriterion("DJZDJJG >=", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgLessThan(String value) {
            addCriterion("DJZDJJG <", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgLessThanOrEqualTo(String value) {
            addCriterion("DJZDJJG <=", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgLike(String value) {
            addCriterion("DJZDJJG like", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgNotLike(String value) {
            addCriterion("DJZDJJG not like", value, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgIn(List<String> values) {
            addCriterion("DJZDJJG in", values, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgNotIn(List<String> values) {
            addCriterion("DJZDJJG not in", values, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgBetween(String value1, String value2) {
            addCriterion("DJZDJJG between", value1, value2, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzdjjgNotBetween(String value1, String value2) {
            addCriterion("DJZDJJG not between", value1, value2, "djzdjjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgIsNull() {
            addCriterion("DJZFZJG is null");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgIsNotNull() {
            addCriterion("DJZFZJG is not null");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgEqualTo(String value) {
            addCriterion("DJZFZJG =", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgNotEqualTo(String value) {
            addCriterion("DJZFZJG <>", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgGreaterThan(String value) {
            addCriterion("DJZFZJG >", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgGreaterThanOrEqualTo(String value) {
            addCriterion("DJZFZJG >=", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgLessThan(String value) {
            addCriterion("DJZFZJG <", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgLessThanOrEqualTo(String value) {
            addCriterion("DJZFZJG <=", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgLike(String value) {
            addCriterion("DJZFZJG like", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgNotLike(String value) {
            addCriterion("DJZFZJG not like", value, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgIn(List<String> values) {
            addCriterion("DJZFZJG in", values, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgNotIn(List<String> values) {
            addCriterion("DJZFZJG not in", values, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgBetween(String value1, String value2) {
            addCriterion("DJZFZJG between", value1, value2, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzjgNotBetween(String value1, String value2) {
            addCriterion("DJZFZJG not between", value1, value2, "djzfzjg");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqIsNull() {
            addCriterion("DJZFZRQ is null");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqIsNotNull() {
            addCriterion("DJZFZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqEqualTo(Date value) {
            addCriterionForJDBCDate("DJZFZRQ =", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("DJZFZRQ <>", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("DJZFZRQ >", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJZFZRQ >=", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqLessThan(Date value) {
            addCriterionForJDBCDate("DJZFZRQ <", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DJZFZRQ <=", value, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqIn(List<Date> values) {
            addCriterionForJDBCDate("DJZFZRQ in", values, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("DJZFZRQ not in", values, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJZFZRQ between", value1, value2, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andDjzfzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DJZFZRQ not between", value1, value2, "djzfzrq");
            return (Criteria) this;
        }

        public Criteria andYjdcxszIsNull() {
            addCriterion("YJDCXSZ is null");
            return (Criteria) this;
        }

        public Criteria andYjdcxszIsNotNull() {
            addCriterion("YJDCXSZ is not null");
            return (Criteria) this;
        }

        public Criteria andYjdcxszEqualTo(String value) {
            addCriterion("YJDCXSZ =", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszNotEqualTo(String value) {
            addCriterion("YJDCXSZ <>", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszGreaterThan(String value) {
            addCriterion("YJDCXSZ >", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszGreaterThanOrEqualTo(String value) {
            addCriterion("YJDCXSZ >=", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszLessThan(String value) {
            addCriterion("YJDCXSZ <", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszLessThanOrEqualTo(String value) {
            addCriterion("YJDCXSZ <=", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszLike(String value) {
            addCriterion("YJDCXSZ like", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszNotLike(String value) {
            addCriterion("YJDCXSZ not like", value, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszIn(List<String> values) {
            addCriterion("YJDCXSZ in", values, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszNotIn(List<String> values) {
            addCriterion("YJDCXSZ not in", values, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszBetween(String value1, String value2) {
            addCriterion("YJDCXSZ between", value1, value2, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYjdcxszNotBetween(String value1, String value2) {
            addCriterion("YJDCXSZ not between", value1, value2, "yjdcxsz");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqIsNull() {
            addCriterion("YXSZZCRQ is null");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqIsNotNull() {
            addCriterion("YXSZZCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ =", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ <>", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ >", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ >=", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqLessThan(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ <", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZZCRQ <=", value, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqIn(List<Date> values) {
            addCriterionForJDBCDate("YXSZZCRQ in", values, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("YXSZZCRQ not in", values, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YXSZZCRQ between", value1, value2, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszzcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YXSZZCRQ not between", value1, value2, "yxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqIsNull() {
            addCriterion("XXSZZCRQ is null");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqIsNotNull() {
            addCriterion("XXSZZCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ =", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ <>", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ >", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ >=", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqLessThan(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ <", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZZCRQ <=", value, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqIn(List<Date> values) {
            addCriterionForJDBCDate("XXSZZCRQ in", values, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("XXSZZCRQ not in", values, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXSZZCRQ between", value1, value2, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andXxszzcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXSZZCRQ not between", value1, value2, "xxszzcrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqIsNull() {
            addCriterion("YXSZFZRQ is null");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqIsNotNull() {
            addCriterion("YXSZFZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ =", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ <>", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ >", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ >=", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqLessThan(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ <", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YXSZFZRQ <=", value, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqIn(List<Date> values) {
            addCriterionForJDBCDate("YXSZFZRQ in", values, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("YXSZFZRQ not in", values, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YXSZFZRQ between", value1, value2, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszfzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YXSZFZRQ not between", value1, value2, "yxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqIsNull() {
            addCriterion("XXSZFZRQ is null");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqIsNotNull() {
            addCriterion("XXSZFZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ =", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ <>", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqGreaterThan(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ >", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ >=", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqLessThan(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ <", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XXSZFZRQ <=", value, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqIn(List<Date> values) {
            addCriterionForJDBCDate("XXSZFZRQ in", values, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("XXSZFZRQ not in", values, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXSZFZRQ between", value1, value2, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andXxszfzrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XXSZFZRQ not between", value1, value2, "xxszfzrq");
            return (Criteria) this;
        }

        public Criteria andYxszdabhIsNull() {
            addCriterion("YXSZDABH is null");
            return (Criteria) this;
        }

        public Criteria andYxszdabhIsNotNull() {
            addCriterion("YXSZDABH is not null");
            return (Criteria) this;
        }

        public Criteria andYxszdabhEqualTo(String value) {
            addCriterion("YXSZDABH =", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhNotEqualTo(String value) {
            addCriterion("YXSZDABH <>", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhGreaterThan(String value) {
            addCriterion("YXSZDABH >", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhGreaterThanOrEqualTo(String value) {
            addCriterion("YXSZDABH >=", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhLessThan(String value) {
            addCriterion("YXSZDABH <", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhLessThanOrEqualTo(String value) {
            addCriterion("YXSZDABH <=", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhLike(String value) {
            addCriterion("YXSZDABH like", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhNotLike(String value) {
            addCriterion("YXSZDABH not like", value, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhIn(List<String> values) {
            addCriterion("YXSZDABH in", values, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhNotIn(List<String> values) {
            addCriterion("YXSZDABH not in", values, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhBetween(String value1, String value2) {
            addCriterion("YXSZDABH between", value1, value2, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andYxszdabhNotBetween(String value1, String value2) {
            addCriterion("YXSZDABH not between", value1, value2, "yxszdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhIsNull() {
            addCriterion("XXSZFDABH is null");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhIsNotNull() {
            addCriterion("XXSZFDABH is not null");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhEqualTo(String value) {
            addCriterion("XXSZFDABH =", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhNotEqualTo(String value) {
            addCriterion("XXSZFDABH <>", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhGreaterThan(String value) {
            addCriterion("XXSZFDABH >", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhGreaterThanOrEqualTo(String value) {
            addCriterion("XXSZFDABH >=", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhLessThan(String value) {
            addCriterion("XXSZFDABH <", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhLessThanOrEqualTo(String value) {
            addCriterion("XXSZFDABH <=", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhLike(String value) {
            addCriterion("XXSZFDABH like", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhNotLike(String value) {
            addCriterion("XXSZFDABH not like", value, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhIn(List<String> values) {
            addCriterion("XXSZFDABH in", values, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhNotIn(List<String> values) {
            addCriterion("XXSZFDABH not in", values, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhBetween(String value1, String value2) {
            addCriterion("XXSZFDABH between", value1, value2, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXxszfdabhNotBetween(String value1, String value2) {
            addCriterion("XXSZFDABH not between", value1, value2, "xxszfdabh");
            return (Criteria) this;
        }

        public Criteria andXszbgsjIsNull() {
            addCriterion("XSZBGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXszbgsjIsNotNull() {
            addCriterion("XSZBGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXszbgsjEqualTo(Date value) {
            addCriterionForJDBCDate("XSZBGSJ =", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("XSZBGSJ <>", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjGreaterThan(Date value) {
            addCriterionForJDBCDate("XSZBGSJ >", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XSZBGSJ >=", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjLessThan(Date value) {
            addCriterionForJDBCDate("XSZBGSJ <", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XSZBGSJ <=", value, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjIn(List<Date> values) {
            addCriterionForJDBCDate("XSZBGSJ in", values, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("XSZBGSJ not in", values, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XSZBGSJ between", value1, value2, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andXszbgsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XSZBGSJ not between", value1, value2, "xszbgsj");
            return (Criteria) this;
        }

        public Criteria andZzlIsNull() {
            addCriterion("ZZL is null");
            return (Criteria) this;
        }

        public Criteria andZzlIsNotNull() {
            addCriterion("ZZL is not null");
            return (Criteria) this;
        }

        public Criteria andZzlEqualTo(String value) {
            addCriterion("ZZL =", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotEqualTo(String value) {
            addCriterion("ZZL <>", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThan(String value) {
            addCriterion("ZZL >", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZZL >=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThan(String value) {
            addCriterion("ZZL <", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThanOrEqualTo(String value) {
            addCriterion("ZZL <=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLike(String value) {
            addCriterion("ZZL like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotLike(String value) {
            addCriterion("ZZL not like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlIn(List<String> values) {
            addCriterion("ZZL in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotIn(List<String> values) {
            addCriterion("ZZL not in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlBetween(String value1, String value2) {
            addCriterion("ZZL between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotBetween(String value1, String value2) {
            addCriterion("ZZL not between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNull() {
            addCriterion("ZBZL is null");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNotNull() {
            addCriterion("ZBZL is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlEqualTo(String value) {
            addCriterion("ZBZL =", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotEqualTo(String value) {
            addCriterion("ZBZL <>", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThan(String value) {
            addCriterion("ZBZL >", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZBZL >=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThan(String value) {
            addCriterion("ZBZL <", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThanOrEqualTo(String value) {
            addCriterion("ZBZL <=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLike(String value) {
            addCriterion("ZBZL like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotLike(String value) {
            addCriterion("ZBZL not like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlIn(List<String> values) {
            addCriterion("ZBZL in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotIn(List<String> values) {
            addCriterion("ZBZL not in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlBetween(String value1, String value2) {
            addCriterion("ZBZL between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotBetween(String value1, String value2) {
            addCriterion("ZBZL not between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlIsNull() {
            addCriterion("HDZZL is null");
            return (Criteria) this;
        }

        public Criteria andHdzzlIsNotNull() {
            addCriterion("HDZZL is not null");
            return (Criteria) this;
        }

        public Criteria andHdzzlEqualTo(String value) {
            addCriterion("HDZZL =", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotEqualTo(String value) {
            addCriterion("HDZZL <>", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlGreaterThan(String value) {
            addCriterion("HDZZL >", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlGreaterThanOrEqualTo(String value) {
            addCriterion("HDZZL >=", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLessThan(String value) {
            addCriterion("HDZZL <", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLessThanOrEqualTo(String value) {
            addCriterion("HDZZL <=", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLike(String value) {
            addCriterion("HDZZL like", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotLike(String value) {
            addCriterion("HDZZL not like", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlIn(List<String> values) {
            addCriterion("HDZZL in", values, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotIn(List<String> values) {
            addCriterion("HDZZL not in", values, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlBetween(String value1, String value2) {
            addCriterion("HDZZL between", value1, value2, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotBetween(String value1, String value2) {
            addCriterion("HDZZL not between", value1, value2, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlIsNull() {
            addCriterion("ZQYZZL is null");
            return (Criteria) this;
        }

        public Criteria andZqyzzlIsNotNull() {
            addCriterion("ZQYZZL is not null");
            return (Criteria) this;
        }

        public Criteria andZqyzzlEqualTo(String value) {
            addCriterion("ZQYZZL =", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlNotEqualTo(String value) {
            addCriterion("ZQYZZL <>", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlGreaterThan(String value) {
            addCriterion("ZQYZZL >", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlGreaterThanOrEqualTo(String value) {
            addCriterion("ZQYZZL >=", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlLessThan(String value) {
            addCriterion("ZQYZZL <", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlLessThanOrEqualTo(String value) {
            addCriterion("ZQYZZL <=", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlLike(String value) {
            addCriterion("ZQYZZL like", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlNotLike(String value) {
            addCriterion("ZQYZZL not like", value, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlIn(List<String> values) {
            addCriterion("ZQYZZL in", values, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlNotIn(List<String> values) {
            addCriterion("ZQYZZL not in", values, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlBetween(String value1, String value2) {
            addCriterion("ZQYZZL between", value1, value2, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andZqyzzlNotBetween(String value1, String value2) {
            addCriterion("ZQYZZL not between", value1, value2, "zqyzzl");
            return (Criteria) this;
        }

        public Criteria andWkccIsNull() {
            addCriterion("WKCC is null");
            return (Criteria) this;
        }

        public Criteria andWkccIsNotNull() {
            addCriterion("WKCC is not null");
            return (Criteria) this;
        }

        public Criteria andWkccEqualTo(String value) {
            addCriterion("WKCC =", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccNotEqualTo(String value) {
            addCriterion("WKCC <>", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccGreaterThan(String value) {
            addCriterion("WKCC >", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccGreaterThanOrEqualTo(String value) {
            addCriterion("WKCC >=", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccLessThan(String value) {
            addCriterion("WKCC <", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccLessThanOrEqualTo(String value) {
            addCriterion("WKCC <=", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccLike(String value) {
            addCriterion("WKCC like", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccNotLike(String value) {
            addCriterion("WKCC not like", value, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccIn(List<String> values) {
            addCriterion("WKCC in", values, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccNotIn(List<String> values) {
            addCriterion("WKCC not in", values, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccBetween(String value1, String value2) {
            addCriterion("WKCC between", value1, value2, "wkcc");
            return (Criteria) this;
        }

        public Criteria andWkccNotBetween(String value1, String value2) {
            addCriterion("WKCC not between", value1, value2, "wkcc");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBz1IsNull() {
            addCriterion("BZ1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("BZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("BZ1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("BZ1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("BZ1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("BZ1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("BZ1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("BZ1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("BZ1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("BZ1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("BZ1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("BZ1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("BZ1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("BZ1 not between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNull() {
            addCriterion("JYJL is null");
            return (Criteria) this;
        }

        public Criteria andJyjlIsNotNull() {
            addCriterion("JYJL is not null");
            return (Criteria) this;
        }

        public Criteria andJyjlEqualTo(String value) {
            addCriterion("JYJL =", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotEqualTo(String value) {
            addCriterion("JYJL <>", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThan(String value) {
            addCriterion("JYJL >", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlGreaterThanOrEqualTo(String value) {
            addCriterion("JYJL >=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThan(String value) {
            addCriterion("JYJL <", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLessThanOrEqualTo(String value) {
            addCriterion("JYJL <=", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlLike(String value) {
            addCriterion("JYJL like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotLike(String value) {
            addCriterion("JYJL not like", value, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlIn(List<String> values) {
            addCriterion("JYJL in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotIn(List<String> values) {
            addCriterion("JYJL not in", values, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlBetween(String value1, String value2) {
            addCriterion("JYJL between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJyjlNotBetween(String value1, String value2) {
            addCriterion("JYJL not between", value1, value2, "jyjl");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpIsNull() {
            addCriterion("JDCGZFP is null");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpIsNotNull() {
            addCriterion("JDCGZFP is not null");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpEqualTo(String value) {
            addCriterion("JDCGZFP =", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpNotEqualTo(String value) {
            addCriterion("JDCGZFP <>", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpGreaterThan(String value) {
            addCriterion("JDCGZFP >", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpGreaterThanOrEqualTo(String value) {
            addCriterion("JDCGZFP >=", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpLessThan(String value) {
            addCriterion("JDCGZFP <", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpLessThanOrEqualTo(String value) {
            addCriterion("JDCGZFP <=", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpLike(String value) {
            addCriterion("JDCGZFP like", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpNotLike(String value) {
            addCriterion("JDCGZFP not like", value, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpIn(List<String> values) {
            addCriterion("JDCGZFP in", values, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpNotIn(List<String> values) {
            addCriterion("JDCGZFP not in", values, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpBetween(String value1, String value2) {
            addCriterion("JDCGZFP between", value1, value2, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andJdcgzfpNotBetween(String value1, String value2) {
            addCriterion("JDCGZFP not between", value1, value2, "jdcgzfp");
            return (Criteria) this;
        }

        public Criteria andCljspzIsNull() {
            addCriterion("CLJSPZ is null");
            return (Criteria) this;
        }

        public Criteria andCljspzIsNotNull() {
            addCriterion("CLJSPZ is not null");
            return (Criteria) this;
        }

        public Criteria andCljspzEqualTo(String value) {
            addCriterion("CLJSPZ =", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzNotEqualTo(String value) {
            addCriterion("CLJSPZ <>", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzGreaterThan(String value) {
            addCriterion("CLJSPZ >", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzGreaterThanOrEqualTo(String value) {
            addCriterion("CLJSPZ >=", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzLessThan(String value) {
            addCriterion("CLJSPZ <", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzLessThanOrEqualTo(String value) {
            addCriterion("CLJSPZ <=", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzLike(String value) {
            addCriterion("CLJSPZ like", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzNotLike(String value) {
            addCriterion("CLJSPZ not like", value, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzIn(List<String> values) {
            addCriterion("CLJSPZ in", values, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzNotIn(List<String> values) {
            addCriterion("CLJSPZ not in", values, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzBetween(String value1, String value2) {
            addCriterion("CLJSPZ between", value1, value2, "cljspz");
            return (Criteria) this;
        }

        public Criteria andCljspzNotBetween(String value1, String value2) {
            addCriterion("CLJSPZ not between", value1, value2, "cljspz");
            return (Criteria) this;
        }

        public Criteria andClbxzmIsNull() {
            addCriterion("CLBXZM is null");
            return (Criteria) this;
        }

        public Criteria andClbxzmIsNotNull() {
            addCriterion("CLBXZM is not null");
            return (Criteria) this;
        }

        public Criteria andClbxzmEqualTo(String value) {
            addCriterion("CLBXZM =", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmNotEqualTo(String value) {
            addCriterion("CLBXZM <>", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmGreaterThan(String value) {
            addCriterion("CLBXZM >", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmGreaterThanOrEqualTo(String value) {
            addCriterion("CLBXZM >=", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmLessThan(String value) {
            addCriterion("CLBXZM <", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmLessThanOrEqualTo(String value) {
            addCriterion("CLBXZM <=", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmLike(String value) {
            addCriterion("CLBXZM like", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmNotLike(String value) {
            addCriterion("CLBXZM not like", value, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmIn(List<String> values) {
            addCriterion("CLBXZM in", values, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmNotIn(List<String> values) {
            addCriterion("CLBXZM not in", values, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmBetween(String value1, String value2) {
            addCriterion("CLBXZM between", value1, value2, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andClbxzmNotBetween(String value1, String value2) {
            addCriterion("CLBXZM not between", value1, value2, "clbxzm");
            return (Criteria) this;
        }

        public Criteria andJcbgIsNull() {
            addCriterion("JCBG is null");
            return (Criteria) this;
        }

        public Criteria andJcbgIsNotNull() {
            addCriterion("JCBG is not null");
            return (Criteria) this;
        }

        public Criteria andJcbgEqualTo(String value) {
            addCriterion("JCBG =", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgNotEqualTo(String value) {
            addCriterion("JCBG <>", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgGreaterThan(String value) {
            addCriterion("JCBG >", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgGreaterThanOrEqualTo(String value) {
            addCriterion("JCBG >=", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgLessThan(String value) {
            addCriterion("JCBG <", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgLessThanOrEqualTo(String value) {
            addCriterion("JCBG <=", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgLike(String value) {
            addCriterion("JCBG like", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgNotLike(String value) {
            addCriterion("JCBG not like", value, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgIn(List<String> values) {
            addCriterion("JCBG in", values, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgNotIn(List<String> values) {
            addCriterion("JCBG not in", values, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgBetween(String value1, String value2) {
            addCriterion("JCBG between", value1, value2, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJcbgNotBetween(String value1, String value2) {
            addCriterion("JCBG not between", value1, value2, "jcbg");
            return (Criteria) this;
        }

        public Criteria andJchgzmIsNull() {
            addCriterion("JCHGZM is null");
            return (Criteria) this;
        }

        public Criteria andJchgzmIsNotNull() {
            addCriterion("JCHGZM is not null");
            return (Criteria) this;
        }

        public Criteria andJchgzmEqualTo(String value) {
            addCriterion("JCHGZM =", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmNotEqualTo(String value) {
            addCriterion("JCHGZM <>", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmGreaterThan(String value) {
            addCriterion("JCHGZM >", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmGreaterThanOrEqualTo(String value) {
            addCriterion("JCHGZM >=", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmLessThan(String value) {
            addCriterion("JCHGZM <", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmLessThanOrEqualTo(String value) {
            addCriterion("JCHGZM <=", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmLike(String value) {
            addCriterion("JCHGZM like", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmNotLike(String value) {
            addCriterion("JCHGZM not like", value, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmIn(List<String> values) {
            addCriterion("JCHGZM in", values, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmNotIn(List<String> values) {
            addCriterion("JCHGZM not in", values, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmBetween(String value1, String value2) {
            addCriterion("JCHGZM between", value1, value2, "jchgzm");
            return (Criteria) this;
        }

        public Criteria andJchgzmNotBetween(String value1, String value2) {
            addCriterion("JCHGZM not between", value1, value2, "jchgzm");
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