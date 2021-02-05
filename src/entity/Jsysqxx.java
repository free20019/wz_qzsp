package entity;

import java.util.Date;

public class Jsysqxx {
    private String id;

    private String sqbh;

    private String jsybh;

    private String xm;

    private String sqlx;

    private String sqzt;

    private Date sqrq;

    private String cgscsyj;

    private String ygjcsyj;

    private String zafjcsyj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSqbh() {
        return sqbh;
    }

    public void setSqbh(String sqbh) {
        this.sqbh = sqbh == null ? null : sqbh.trim();
    }

    public String getJsybh() {
        return jsybh;
    }

    public void setJsybh(String jsybh) {
        this.jsybh = jsybh == null ? null : jsybh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getSqlx() {
        return sqlx;
    }

    public void setSqlx(String sqlx) {
        this.sqlx = sqlx == null ? null : sqlx.trim();
    }

    public String getSqzt() {
        return sqzt;
    }

    public void setSqzt(String sqzt) {
        this.sqzt = sqzt == null ? null : sqzt.trim();
    }

    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    public String getCgscsyj() {
        return cgscsyj;
    }

    public void setCgscsyj(String cgscsyj) {
        this.cgscsyj = cgscsyj == null ? null : cgscsyj.trim();
    }

    public String getYgjcsyj() {
        return ygjcsyj;
    }

    public void setYgjcsyj(String ygjcsyj) {
        this.ygjcsyj = ygjcsyj == null ? null : ygjcsyj.trim();
    }

    public String getZafjcsyj() {
        return zafjcsyj;
    }

    public void setZafjcsyj(String zafjcsyj) {
        this.zafjcsyj = zafjcsyj == null ? null : zafjcsyj.trim();
    }
}