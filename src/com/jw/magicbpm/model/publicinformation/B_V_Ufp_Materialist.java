package com.jw.magicbpm.model.publicinformation;

import java.math.BigDecimal;

public class B_V_Ufp_Materialist {
    private String uuid;

    private String materiaTitle;

    private BigDecimal frequency;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMateriaTitle() {
        return materiaTitle;
    }

    public void setMateriaTitle(String materiaTitle) {
        this.materiaTitle = materiaTitle == null ? null : materiaTitle.trim();
    }

    public BigDecimal getFrequency() {
        return frequency;
    }

    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }
}