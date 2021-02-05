package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_answerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_answerExample() {
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

        public Criteria andImplementresultIsNull() {
            addCriterion("ImplementResult is null");
            return (Criteria) this;
        }

        public Criteria andImplementresultIsNotNull() {
            addCriterion("ImplementResult is not null");
            return (Criteria) this;
        }

        public Criteria andImplementresultEqualTo(String value) {
            addCriterion("ImplementResult =", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultNotEqualTo(String value) {
            addCriterion("ImplementResult <>", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultGreaterThan(String value) {
            addCriterion("ImplementResult >", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultGreaterThanOrEqualTo(String value) {
            addCriterion("ImplementResult >=", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultLessThan(String value) {
            addCriterion("ImplementResult <", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultLessThanOrEqualTo(String value) {
            addCriterion("ImplementResult <=", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultLike(String value) {
            addCriterion("ImplementResult like", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultNotLike(String value) {
            addCriterion("ImplementResult not like", value, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultIn(List<String> values) {
            addCriterion("ImplementResult in", values, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultNotIn(List<String> values) {
            addCriterion("ImplementResult not in", values, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultBetween(String value1, String value2) {
            addCriterion("ImplementResult between", value1, value2, "implementresult");
            return (Criteria) this;
        }

        public Criteria andImplementresultNotBetween(String value1, String value2) {
            addCriterion("ImplementResult not between", value1, value2, "implementresult");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdIsNull() {
            addCriterion("Questions_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdIsNotNull() {
            addCriterion("Questions_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdEqualTo(Integer value) {
            addCriterion("Questions_id =", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdNotEqualTo(Integer value) {
            addCriterion("Questions_id <>", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdGreaterThan(Integer value) {
            addCriterion("Questions_id >", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Questions_id >=", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdLessThan(Integer value) {
            addCriterion("Questions_id <", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Questions_id <=", value, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdIn(List<Integer> values) {
            addCriterion("Questions_id in", values, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdNotIn(List<Integer> values) {
            addCriterion("Questions_id not in", values, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdBetween(Integer value1, Integer value2) {
            addCriterion("Questions_id between", value1, value2, "questionsId");
            return (Criteria) this;
        }

        public Criteria andQuestionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Questions_id not between", value1, value2, "questionsId");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNull() {
            addCriterion("IsCorrect is null");
            return (Criteria) this;
        }

        public Criteria andIscorrectIsNotNull() {
            addCriterion("IsCorrect is not null");
            return (Criteria) this;
        }

        public Criteria andIscorrectEqualTo(Short value) {
            addCriterion("IsCorrect =", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotEqualTo(Short value) {
            addCriterion("IsCorrect <>", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThan(Short value) {
            addCriterion("IsCorrect >", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectGreaterThanOrEqualTo(Short value) {
            addCriterion("IsCorrect >=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThan(Short value) {
            addCriterion("IsCorrect <", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectLessThanOrEqualTo(Short value) {
            addCriterion("IsCorrect <=", value, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectIn(List<Short> values) {
            addCriterion("IsCorrect in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotIn(List<Short> values) {
            addCriterion("IsCorrect not in", values, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectBetween(Short value1, Short value2) {
            addCriterion("IsCorrect between", value1, value2, "iscorrect");
            return (Criteria) this;
        }

        public Criteria andIscorrectNotBetween(Short value1, Short value2) {
            addCriterion("IsCorrect not between", value1, value2, "iscorrect");
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

        public Criteria andExamIdIsNull() {
            addCriterion("Exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("Exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("Exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("Exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("Exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("Exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("Exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("Exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("Exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("Exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Exam_id not between", value1, value2, "examId");
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