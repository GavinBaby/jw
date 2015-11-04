package com.jw.baseframe.model;

import java.math.BigDecimal;

public class C_V_Sys_LimitUserTree {
    private String uuid;

    private String id;

    private String name;

    private String pId;

    private String deptId;

    private String unitId;

    private String fla;

    private BigDecimal rowsort;

    private String isParent;

    private BigDecimal isFilein;

    private BigDecimal isFileout;

    private BigDecimal isSendmessage;

    private BigDecimal isReceivemessage;

    private BigDecimal isMessageimport;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getFla() {
        return fla;
    }

    public void setFla(String fla) {
        this.fla = fla == null ? null : fla.trim();
    }

    public BigDecimal getRowsort() {
        return rowsort;
    }

    public void setRowsort(BigDecimal rowsort) {
        this.rowsort = rowsort;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent == null ? null : isParent.trim();
    }

    public BigDecimal getIsFilein() {
        return isFilein;
    }

    public void setIsFilein(BigDecimal isFilein) {
        this.isFilein = isFilein;
    }

    public BigDecimal getIsFileout() {
        return isFileout;
    }

    public void setIsFileout(BigDecimal isFileout) {
        this.isFileout = isFileout;
    }

    public BigDecimal getIsSendmessage() {
        return isSendmessage;
    }

    public void setIsSendmessage(BigDecimal isSendmessage) {
        this.isSendmessage = isSendmessage;
    }

    public BigDecimal getIsReceivemessage() {
        return isReceivemessage;
    }

    public void setIsReceivemessage(BigDecimal isReceivemessage) {
        this.isReceivemessage = isReceivemessage;
    }

    public BigDecimal getIsMessageimport() {
        return isMessageimport;
    }

    public void setIsMessageimport(BigDecimal isMessageimport) {
        this.isMessageimport = isMessageimport;
    }
}