package entity;

import java.util.Date;

public class Wyc_questions {
    private Integer id;

    private Integer subjectId;

    private Integer testcenterId;

    private Integer topictypeId;

    private Short score;

    private String sourceId;

    private String keyword;

    private Date createtime;

    private String createperson;

    private String rightkey;

    private Date upTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTestcenterId() {
        return testcenterId;
    }

    public void setTestcenterId(Integer testcenterId) {
        this.testcenterId = testcenterId;
    }

    public Integer getTopictypeId() {
        return topictypeId;
    }

    public void setTopictypeId(Integer topictypeId) {
        this.topictypeId = topictypeId;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public String getRightkey() {
        return rightkey;
    }

    public void setRightkey(String rightkey) {
        this.rightkey = rightkey == null ? null : rightkey.trim();
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}