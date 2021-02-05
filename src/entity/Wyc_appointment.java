package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Wyc_appointment {
    private Integer id;

    private Integer testplanId;

    private Integer stuid;

    private BigDecimal ticketnumber;

    private Integer seatId;

    private Short state;

    private Date signtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestplanId() {
        return testplanId;
    }

    public void setTestplanId(Integer testplanId) {
        this.testplanId = testplanId;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public BigDecimal getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(BigDecimal ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }
}