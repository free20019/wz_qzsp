package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_examExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_examExample() {
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

        public Criteria andTestpaperIdIsNull() {
            addCriterion("TestPaper_id is null");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdIsNotNull() {
            addCriterion("TestPaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdEqualTo(Integer value) {
            addCriterion("TestPaper_id =", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdNotEqualTo(Integer value) {
            addCriterion("TestPaper_id <>", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdGreaterThan(Integer value) {
            addCriterion("TestPaper_id >", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TestPaper_id >=", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdLessThan(Integer value) {
            addCriterion("TestPaper_id <", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("TestPaper_id <=", value, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdIn(List<Integer> values) {
            addCriterion("TestPaper_id in", values, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdNotIn(List<Integer> values) {
            addCriterion("TestPaper_id not in", values, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdBetween(Integer value1, Integer value2) {
            addCriterion("TestPaper_id between", value1, value2, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andTestpaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TestPaper_id not between", value1, value2, "testpaperId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNull() {
            addCriterion("Appointment_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNotNull() {
            addCriterion("Appointment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdEqualTo(Integer value) {
            addCriterion("Appointment_id =", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotEqualTo(Integer value) {
            addCriterion("Appointment_id <>", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThan(Integer value) {
            addCriterion("Appointment_id >", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Appointment_id >=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThan(Integer value) {
            addCriterion("Appointment_id <", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Appointment_id <=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIn(List<Integer> values) {
            addCriterion("Appointment_id in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotIn(List<Integer> values) {
            addCriterion("Appointment_id not in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Appointment_id between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Appointment_id not between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("StuID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("StuID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("StuID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("StuID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("StuID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StuID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("StuID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("StuID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("StuID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("StuID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("StuID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("StuID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andImplestartimeIsNull() {
            addCriterion("ImpleStarTime is null");
            return (Criteria) this;
        }

        public Criteria andImplestartimeIsNotNull() {
            addCriterion("ImpleStarTime is not null");
            return (Criteria) this;
        }

        public Criteria andImplestartimeEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleStarTime =", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleStarTime <>", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ImpleStarTime >", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleStarTime >=", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeLessThan(Date value) {
            addCriterionForJDBCDate("ImpleStarTime <", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleStarTime <=", value, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeIn(List<Date> values) {
            addCriterionForJDBCDate("ImpleStarTime in", values, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ImpleStarTime not in", values, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpleStarTime between", value1, value2, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImplestartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpleStarTime not between", value1, value2, "implestartime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeIsNull() {
            addCriterion("ImpleOverTime is null");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeIsNotNull() {
            addCriterion("ImpleOverTime is not null");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleOverTime =", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleOverTime <>", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ImpleOverTime >", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleOverTime >=", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeLessThan(Date value) {
            addCriterionForJDBCDate("ImpleOverTime <", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpleOverTime <=", value, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeIn(List<Date> values) {
            addCriterionForJDBCDate("ImpleOverTime in", values, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ImpleOverTime not in", values, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpleOverTime between", value1, value2, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andImpleovertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpleOverTime not between", value1, value2, "impleovertime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeIsNull() {
            addCriterion("experienceTime is null");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeIsNotNull() {
            addCriterion("experienceTime is not null");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeEqualTo(Integer value) {
            addCriterion("experienceTime =", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeNotEqualTo(Integer value) {
            addCriterion("experienceTime <>", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeGreaterThan(Integer value) {
            addCriterion("experienceTime >", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("experienceTime >=", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeLessThan(Integer value) {
            addCriterion("experienceTime <", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeLessThanOrEqualTo(Integer value) {
            addCriterion("experienceTime <=", value, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeIn(List<Integer> values) {
            addCriterion("experienceTime in", values, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeNotIn(List<Integer> values) {
            addCriterion("experienceTime not in", values, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeBetween(Integer value1, Integer value2) {
            addCriterion("experienceTime between", value1, value2, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andExperiencetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("experienceTime not between", value1, value2, "experiencetime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeIsNull() {
            addCriterion("AccumulationTime is null");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeIsNotNull() {
            addCriterion("AccumulationTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeEqualTo(Integer value) {
            addCriterion("AccumulationTime =", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeNotEqualTo(Integer value) {
            addCriterion("AccumulationTime <>", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeGreaterThan(Integer value) {
            addCriterion("AccumulationTime >", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccumulationTime >=", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeLessThan(Integer value) {
            addCriterion("AccumulationTime <", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeLessThanOrEqualTo(Integer value) {
            addCriterion("AccumulationTime <=", value, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeIn(List<Integer> values) {
            addCriterion("AccumulationTime in", values, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeNotIn(List<Integer> values) {
            addCriterion("AccumulationTime not in", values, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeBetween(Integer value1, Integer value2) {
            addCriterion("AccumulationTime between", value1, value2, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andAccumulationtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccumulationTime not between", value1, value2, "accumulationtime");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderIsNull() {
            addCriterion("QuestionsOrder is null");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderIsNotNull() {
            addCriterion("QuestionsOrder is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderEqualTo(String value) {
            addCriterion("QuestionsOrder =", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderNotEqualTo(String value) {
            addCriterion("QuestionsOrder <>", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderGreaterThan(String value) {
            addCriterion("QuestionsOrder >", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderGreaterThanOrEqualTo(String value) {
            addCriterion("QuestionsOrder >=", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderLessThan(String value) {
            addCriterion("QuestionsOrder <", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderLessThanOrEqualTo(String value) {
            addCriterion("QuestionsOrder <=", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderLike(String value) {
            addCriterion("QuestionsOrder like", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderNotLike(String value) {
            addCriterion("QuestionsOrder not like", value, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderIn(List<String> values) {
            addCriterion("QuestionsOrder in", values, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderNotIn(List<String> values) {
            addCriterion("QuestionsOrder not in", values, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderBetween(String value1, String value2) {
            addCriterion("QuestionsOrder between", value1, value2, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andQuestionsorderNotBetween(String value1, String value2) {
            addCriterion("QuestionsOrder not between", value1, value2, "questionsorder");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNull() {
            addCriterion("Achievement is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNotNull() {
            addCriterion("Achievement is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementEqualTo(Short value) {
            addCriterion("Achievement =", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotEqualTo(Short value) {
            addCriterion("Achievement <>", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThan(Short value) {
            addCriterion("Achievement >", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThanOrEqualTo(Short value) {
            addCriterion("Achievement >=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThan(Short value) {
            addCriterion("Achievement <", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThanOrEqualTo(Short value) {
            addCriterion("Achievement <=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementIn(List<Short> values) {
            addCriterion("Achievement in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotIn(List<Short> values) {
            addCriterion("Achievement not in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementBetween(Short value1, Short value2) {
            addCriterion("Achievement between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotBetween(Short value1, Short value2) {
            addCriterion("Achievement not between", value1, value2, "achievement");
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