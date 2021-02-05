package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_testplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_testplanExample() {
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

        public Criteria andPlanstartimeIsNull() {
            addCriterion("PlanStarTime is null");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeIsNotNull() {
            addCriterion("PlanStarTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeEqualTo(Date value) {
            addCriterionForJDBCDate("PlanStarTime =", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PlanStarTime <>", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PlanStarTime >", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PlanStarTime >=", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeLessThan(Date value) {
            addCriterionForJDBCDate("PlanStarTime <", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PlanStarTime <=", value, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeIn(List<Date> values) {
            addCriterionForJDBCDate("PlanStarTime in", values, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PlanStarTime not in", values, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PlanStarTime between", value1, value2, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanstartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PlanStarTime not between", value1, value2, "planstartime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeIsNull() {
            addCriterion("PlanOverTime is null");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeIsNotNull() {
            addCriterion("PlanOverTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeEqualTo(Date value) {
            addCriterionForJDBCDate("PlanOverTime =", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PlanOverTime <>", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PlanOverTime >", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PlanOverTime >=", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeLessThan(Date value) {
            addCriterionForJDBCDate("PlanOverTime <", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PlanOverTime <=", value, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeIn(List<Date> values) {
            addCriterionForJDBCDate("PlanOverTime in", values, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PlanOverTime not in", values, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PlanOverTime between", value1, value2, "planovertime");
            return (Criteria) this;
        }

        public Criteria andPlanovertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PlanOverTime not between", value1, value2, "planovertime");
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

        public Criteria andTestpositionIdIsNull() {
            addCriterion("TestPosition_id is null");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdIsNotNull() {
            addCriterion("TestPosition_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdEqualTo(Integer value) {
            addCriterion("TestPosition_id =", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdNotEqualTo(Integer value) {
            addCriterion("TestPosition_id <>", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdGreaterThan(Integer value) {
            addCriterion("TestPosition_id >", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TestPosition_id >=", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdLessThan(Integer value) {
            addCriterion("TestPosition_id <", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("TestPosition_id <=", value, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdIn(List<Integer> values) {
            addCriterion("TestPosition_id in", values, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdNotIn(List<Integer> values) {
            addCriterion("TestPosition_id not in", values, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdBetween(Integer value1, Integer value2) {
            addCriterion("TestPosition_id between", value1, value2, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andTestpositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TestPosition_id not between", value1, value2, "testpositionId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("ClassRoom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("ClassRoom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Integer value) {
            addCriterion("ClassRoom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Integer value) {
            addCriterion("ClassRoom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Integer value) {
            addCriterion("ClassRoom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassRoom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Integer value) {
            addCriterion("ClassRoom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("ClassRoom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Integer> values) {
            addCriterion("ClassRoom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Integer> values) {
            addCriterion("ClassRoom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Integer value1, Integer value2) {
            addCriterion("ClassRoom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassRoom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdIsNull() {
            addCriterion("UserTable_id is null");
            return (Criteria) this;
        }

        public Criteria andUsertableIdIsNotNull() {
            addCriterion("UserTable_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsertableIdEqualTo(Integer value) {
            addCriterion("UserTable_id =", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdNotEqualTo(Integer value) {
            addCriterion("UserTable_id <>", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdGreaterThan(Integer value) {
            addCriterion("UserTable_id >", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserTable_id >=", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdLessThan(Integer value) {
            addCriterion("UserTable_id <", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdLessThanOrEqualTo(Integer value) {
            addCriterion("UserTable_id <=", value, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdIn(List<Integer> values) {
            addCriterion("UserTable_id in", values, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdNotIn(List<Integer> values) {
            addCriterion("UserTable_id not in", values, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdBetween(Integer value1, Integer value2) {
            addCriterion("UserTable_id between", value1, value2, "usertableId");
            return (Criteria) this;
        }

        public Criteria andUsertableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UserTable_id not between", value1, value2, "usertableId");
            return (Criteria) this;
        }

        public Criteria andExamnumIsNull() {
            addCriterion("ExamNum is null");
            return (Criteria) this;
        }

        public Criteria andExamnumIsNotNull() {
            addCriterion("ExamNum is not null");
            return (Criteria) this;
        }

        public Criteria andExamnumEqualTo(Short value) {
            addCriterion("ExamNum =", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumNotEqualTo(Short value) {
            addCriterion("ExamNum <>", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumGreaterThan(Short value) {
            addCriterion("ExamNum >", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumGreaterThanOrEqualTo(Short value) {
            addCriterion("ExamNum >=", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumLessThan(Short value) {
            addCriterion("ExamNum <", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumLessThanOrEqualTo(Short value) {
            addCriterion("ExamNum <=", value, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumIn(List<Short> values) {
            addCriterion("ExamNum in", values, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumNotIn(List<Short> values) {
            addCriterion("ExamNum not in", values, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumBetween(Short value1, Short value2) {
            addCriterion("ExamNum between", value1, value2, "examnum");
            return (Criteria) this;
        }

        public Criteria andExamnumNotBetween(Short value1, Short value2) {
            addCriterion("ExamNum not between", value1, value2, "examnum");
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