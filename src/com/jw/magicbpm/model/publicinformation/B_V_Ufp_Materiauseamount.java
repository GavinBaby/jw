package com.jw.magicbpm.model.publicinformation;

import java.math.BigDecimal;

public class B_V_Ufp_Materiauseamount {
    private String userId;

    private BigDecimal upfrequency;

    private BigDecimal downfrequency;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getUpfrequency() {
        return upfrequency;
    }

    public void setUpfrequency(BigDecimal upfrequency) {
        this.upfrequency = upfrequency;
    }

    public BigDecimal getDownfrequency() {
        return downfrequency;
    }

    public void setDownfrequency(BigDecimal downfrequency) {
        this.downfrequency = downfrequency;
    }
}