package entity;

import java.util.Date;

public class Wyc_exam {
    private Integer id;

    private Integer testpaperId;

    private Integer appointmentId;

    private Integer stuid;

    private Date implestartime;

    private Date impleovertime;

    private Integer experiencetime;

    private Integer accumulationtime;

    private String questionsorder;

    private Short achievement;

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

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
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

    public Integer getExperiencetime() {
        return experiencetime;
    }

    public void setExperiencetime(Integer experiencetime) {
        this.experiencetime = experiencetime;
    }

    public Integer getAccumulationtime() {
        return accumulationtime;
    }

    public void setAccumulationtime(Integer accumulationtime) {
        this.accumulationtime = accumulationtime;
    }

    public String getQuestionsorder() {
        return questionsorder;
    }

    public void setQuestionsorder(String questionsorder) {
        this.questionsorder = questionsorder == null ? null : questionsorder.trim();
    }

    public Short getAchievement() {
        return achievement;
    }

    public void setAchievement(Short achievement) {
        this.achievement = achievement;
    }
}