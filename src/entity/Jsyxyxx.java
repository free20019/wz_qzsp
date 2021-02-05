package entity;

import java.util.Date;

public class Jsyxyxx {
    private String id;

    private String jsybh;

    private String xm;

    private String xydj;

    private Date khrq;

    private String khjg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getXydj() {
        return xydj;
    }

    public void setXydj(String xydj) {
        this.xydj = xydj == null ? null : xydj.trim();
    }

    public Date getKhrq() {
        return khrq;
    }

    public void setKhrq(Date khrq) {
        this.khrq = khrq;
    }

    public String getKhjg() {
        return khjg;
    }

    public void setKhjg(String khjg) {
        this.khjg = khjg == null ? null : khjg.trim();
    }
}