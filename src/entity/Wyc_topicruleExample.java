package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_topicruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_topicruleExample() {
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("Subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("Subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("Subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("Subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("Subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("Subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("Subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("Subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("Subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("Subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdIsNull() {
            addCriterion("TestCenter_id is null");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdIsNotNull() {
            addCriterion("TestCenter_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdEqualTo(Integer value) {
            addCriterion("TestCenter_id =", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdNotEqualTo(Integer value) {
            addCriterion("TestCenter_id <>", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdGreaterThan(Integer value) {
            addCriterion("TestCenter_id >", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TestCenter_id >=", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdLessThan(Integer value) {
            addCriterion("TestCenter_id <", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("TestCenter_id <=", value, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdIn(List<Integer> values) {
            addCriterion("TestCenter_id in", values, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdNotIn(List<Integer> values) {
            addCriterion("TestCenter_id not in", values, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdBetween(Integer value1, Integer value2) {
            addCriterion("TestCenter_id between", value1, value2, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTestcenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TestCenter_id not between", value1, value2, "testcenterId");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("TotalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("TotalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Short value) {
            addCriterion("TotalScore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Short value) {
            addCriterion("TotalScore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Short value) {
            addCriterion("TotalScore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Short value) {
            addCriterion("TotalScore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Short value) {
            addCriterion("TotalScore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Short value) {
            addCriterion("TotalScore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Short> values) {
            addCriterion("TotalScore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Short> values) {
            addCriterion("TotalScore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Short value1, Short value2) {
            addCriterion("TotalScore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Short value1, Short value2) {
            addCriterion("TotalScore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdIsNull() {
            addCriterion("TopicType_id is null");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdIsNotNull() {
            addCriterion("TopicType_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdEqualTo(Integer value) {
            addCriterion("TopicType_id =", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdNotEqualTo(Integer value) {
            addCriterion("TopicType_id <>", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdGreaterThan(Integer value) {
            addCriterion("TopicType_id >", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopicType_id >=", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdLessThan(Integer value) {
            addCriterion("TopicType_id <", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TopicType_id <=", value, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdIn(List<Integer> values) {
            addCriterion("TopicType_id in", values, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdNotIn(List<Integer> values) {
            addCriterion("TopicType_id not in", values, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TopicType_id between", value1, value2, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andTopictypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TopicType_id not between", value1, value2, "topictypeId");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("UP_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("UP_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UP_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UP_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UP_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UP_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterionForJDBCDate("UP_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UP_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UP_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UP_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UP_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UP_time not between", value1, value2, "upTime");
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