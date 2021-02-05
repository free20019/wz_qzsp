package entity;

import java.util.Date;

public class Wyc_testplan {
    private Integer id;

    private Integer testpaperId;

    private Date planstartime;

    private Date planovertime;

    private Date implestartime;

    private Date impleovertime;

    private Integer subjectId;

    private Integer testpositionId;

    private Integer classroomId;

    private Integer usertableId;

    private Short examnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestpaperId() {
        return testpaperId;
    }

    public void setTestpaperId(Integer testpaperId) {
        this.testpaperId = testpaperId;
    }

    public Date getPlanstartime() {
        return planstartime;
    }

    public void setPlanstartime(Date planstartime) {
        this.planstartime = planstartime;
    }

    public Date getPlanovertime() {
        return planovertime;
    }

    public void setPlanovertime(Date planovertime) {
        this.planovertime = planovertime;
    }

    public Date getImplestartime() {
        return implestartime;
    }

    public void setImplestartime(Date implestartime) {
        this.implestartime = implestartime;
    }

    public Date getImpleovertime() {
        return impleovertime;
    }

    public void setImpleovertime(Date impleovertime) {
        this.impleovertime = impleovertime;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTestpositionId() {
        return testpositionId;
    }

    public void setTestpositionId(Integer testpositionId) {
        this.testpositionId = testpositionId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getUsertableId() {
        return usertableId;
    }

    public void setUsertableId(Integer usertableId) {
        this.usertableId = usertableId;
    }

    public Short getExamnum() {
        return examnum;
    }

    public void setExamnum(Short examnum) {
        this.examnum = examnum;
    }
}