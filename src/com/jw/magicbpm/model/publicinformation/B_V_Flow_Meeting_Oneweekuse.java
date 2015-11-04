package com.jw.magicbpm.model.publicinformation;

public class B_V_Flow_Meeting_Oneweekuse {
    private String meetingroomName;

    private Integer sort;

    private String ymdtime;

    private String starttime;

    private String endtime;

    public String getMeetingroomName() {
        return meetingroomName;
    }

    public void setMeetingroomName(String meetingroomName) {
        this.meetingroomName = meetingroomName == null ? null : meetingroomName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getYmdtime() {
        return ymdtime;
    }

    public void setYmdtime(String ymdtime) {
        this.ymdtime = ymdtime == null ? null : ymdtime.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}