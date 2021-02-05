package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_testpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_testpaperExample() {
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

        public Criteria andAnswertimeIsNull() {
            addCriterion("AnswerTime is null");
            return (Criteria) this;
        }

        public Criteria andAnswertimeIsNotNull() {
            addCriterion("AnswerTime is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertimeEqualTo(Date value) {
            addCriterionForJDBCDate("AnswerTime =", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("AnswerTime <>", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("AnswerTime >", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AnswerTime >=", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeLessThan(Date value) {
            addCriterionForJDBCDate("AnswerTime <", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AnswerTime <=", value, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeIn(List<Date> values) {
            addCriterionForJDBCDate("AnswerTime in", values, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("AnswerTime not in", values, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AnswerTime between", value1, value2, "answertime");
            return (Criteria) this;
        }

        public Criteria andAnswertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AnswerTime not between", value1, value2, "answertime");
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

        public Criteria andPassscoreIsNull() {
            addCriterion("PassScore is null");
            return (Criteria) this;
        }

        public Criteria andPassscoreIsNotNull() {
            addCriterion("PassScore is not null");
            return (Criteria) this;
        }

        public Criteria andPassscoreEqualTo(Short value) {
            addCriterion("PassScore =", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotEqualTo(Short value) {
            addCriterion("PassScore <>", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreGreaterThan(Short value) {
            addCriterion("PassScore >", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreGreaterThanOrEqualTo(Short value) {
            addCriterion("PassScore >=", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreLessThan(Short value) {
            addCriterion("PassScore <", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreLessThanOrEqualTo(Short value) {
            addCriterion("PassScore <=", value, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreIn(List<Short> values) {
            addCriterion("PassScore in", values, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotIn(List<Short> values) {
            addCriterion("PassScore not in", values, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreBetween(Short value1, Short value2) {
            addCriterion("PassScore between", value1, value2, "passscore");
            return (Criteria) this;
        }

        public Criteria andPassscoreNotBetween(Short value1, Short value2) {
            addCriterion("PassScore not between", value1, value2, "passscore");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNull() {
            addCriterion("TestType is null");
            return (Criteria) this;
        }

        public Criteria andTesttypeIsNotNull() {
            addCriterion("TestType is not null");
            return (Criteria) this;
        }

        public Criteria andTesttypeEqualTo(Short value) {
            addCriterion("TestType =", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotEqualTo(Short value) {
            addCriterion("TestType <>", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThan(Short value) {
            addCriterion("TestType >", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TestType >=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThan(Short value) {
            addCriterion("TestType <", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeLessThanOrEqualTo(Short value) {
            addCriterion("TestType <=", value, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeIn(List<Short> values) {
            addCriterion("TestType in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotIn(List<Short> values) {
            addCriterion("TestType not in", values, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeBetween(Short value1, Short value2) {
            addCriterion("TestType between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andTesttypeNotBetween(Short value1, Short value2) {
            addCriterion("TestType not between", value1, value2, "testtype");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdIsNull() {
            addCriterion("TopicRule_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdIsNotNull() {
            addCriterion("TopicRule_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdEqualTo(Integer value) {
            addCriterion("TopicRule_id =", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdNotEqualTo(Integer value) {
            addCriterion("TopicRule_id <>", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdGreaterThan(Integer value) {
            addCriterion("TopicRule_id >", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopicRule_id >=", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdLessThan(Integer value) {
            addCriterion("TopicRule_id <", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdLessThanOrEqualTo(Integer value) {
            addCriterion("TopicRule_id <=", value, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdIn(List<Integer> values) {
            addCriterion("TopicRule_id in", values, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdNotIn(List<Integer> values) {
            addCriterion("TopicRule_id not in", values, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdBetween(Integer value1, Integer value2) {
            addCriterion("TopicRule_id between", value1, value2, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andTopicruleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TopicRule_id not between", value1, value2, "topicruleId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNull() {
            addCriterion("CreatePerson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("CreatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("CreatePerson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("CreatePerson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("CreatePerson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("CreatePerson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("CreatePerson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("CreatePerson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("CreatePerson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("CreatePerson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("CreatePerson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("CreatePerson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("CreatePerson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("CreatePerson not between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("Createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("Createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("Createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("Createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Createtime not between", value1, value2, "createtime");
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