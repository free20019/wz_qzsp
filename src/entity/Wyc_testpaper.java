package entity;

import java.util.Date;

public class Wyc_testpaper {
    private Integer id;

    private Date answertime;

    private Integer subjectId;

    private Short totalscore;

    private Short passscore;

    private Short state;

    private Short testtype;

    private Integer topicruleId;

    private String name;

    private String createperson;

    private Date createtime;

    private String testgather;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAnswertime() {
        return answertime;
    }

    public void setAnswertime(Date answertime) {
        this.answertime = answertime;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Short getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Short totalscore) {
        this.totalscore = totalscore;
    }

    public Short getPassscore() {
        return passscore;
    }

    public void setPassscore(Short passscore) {
        this.passscore = passscore;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getTesttype() {
        return testtype;
    }

    public void setTesttype(Short testtype) {
        this.testtype = testtype;
    }

    public Integer getTopicruleId() {
        return topicruleId;
    }

    public void setTopicruleId(Integer topicruleId) {
        this.topicruleId = topicruleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTestgather() {
        return testgather;
    }

    public void setTestgather(String testgather) {
        this.testgather = testgather == null ? null : testgather.trim();
    }
}