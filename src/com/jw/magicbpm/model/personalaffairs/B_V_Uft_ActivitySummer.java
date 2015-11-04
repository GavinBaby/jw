package com.jw.magicbpm.model.personalaffairs;

public class B_V_Uft_ActivitySummer {
    private String startofweek;

    private String endofweek;

    public String getStartofweek() {
        return startofweek;
    }

    public void setStartofweek(String startofweek) {
        this.startofweek = startofweek == null ? null : startofweek.trim();
    }

    public String getEndofweek() {
        return endofweek;
    }

    public void setEndofweek(String endofweek) {
        this.endofweek = endofweek == null ? null : endofweek.trim();
    }
}