package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Wyc_appointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyc_appointmentExample() {
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

        public Criteria andTestplanIdIsNull() {
            addCriterion("TestPlan_id is null");
            return (Criteria) this;
        }

        public Criteria andTestplanIdIsNotNull() {
            addCriterion("TestPlan_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestplanIdEqualTo(Integer value) {
            addCriterion("TestPlan_id =", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdNotEqualTo(Integer value) {
            addCriterion("TestPlan_id <>", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdGreaterThan(Integer value) {
            addCriterion("TestPlan_id >", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TestPlan_id >=", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdLessThan(Integer value) {
            addCriterion("TestPlan_id <", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("TestPlan_id <=", value, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdIn(List<Integer> values) {
            addCriterion("TestPlan_id in", values, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdNotIn(List<Integer> values) {
            addCriterion("TestPlan_id not in", values, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdBetween(Integer value1, Integer value2) {
            addCriterion("TestPlan_id between", value1, value2, "testplanId");
            return (Criteria) this;
        }

        public Criteria andTestplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TestPlan_id not between", value1, value2, "testplanId");
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

        public Criteria andTicketnumberIsNull() {
            addCriterion("TicketNumber is null");
            return (Criteria) this;
        }

        public Criteria andTicketnumberIsNotNull() {
            addCriterion("TicketNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnumberEqualTo(BigDecimal value) {
            addCriterion("TicketNumber =", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotEqualTo(BigDecimal value) {
            addCriterion("TicketNumber <>", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberGreaterThan(BigDecimal value) {
            addCriterion("TicketNumber >", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TicketNumber >=", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberLessThan(BigDecimal value) {
            addCriterion("TicketNumber <", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TicketNumber <=", value, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberIn(List<BigDecimal> values) {
            addCriterion("TicketNumber in", values, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotIn(List<BigDecimal> values) {
            addCriterion("TicketNumber not in", values, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TicketNumber between", value1, value2, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andTicketnumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TicketNumber not between", value1, value2, "ticketnumber");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("Seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("Seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("Seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("Seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("Seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("Seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("Seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("Seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("Seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_id not between", value1, value2, "seatId");
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

        public Criteria andSigntimeIsNull() {
            addCriterion("SignTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("SignTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterionForJDBCDate("SignTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SignTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SignTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SignTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterionForJDBCDate("SignTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SignTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterionForJDBCDate("SignTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SignTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SignTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SignTime not between", value1, value2, "signtime");
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