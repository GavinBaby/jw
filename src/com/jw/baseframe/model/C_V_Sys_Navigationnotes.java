package com.jw.baseframe.model;

import java.math.BigDecimal;

public class C_V_Sys_Navigationnotes {
    private String moduleId;

    private String moduleName;

    private String linkUrl;

    private String target;

    private Integer sort;

    private String parenModule;

    private String moduleDescription;

    private String picUrl;

    private BigDecimal levelno;

    private BigDecimal rcount;

    private String expandXml;

    private String muser;

    private String unitid;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getParenModule() {
        return parenModule;
    }

    public void setParenModule(String parenModule) {
        this.parenModule = parenModule == null ? null : parenModule.trim();
    }

    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription == null ? null : moduleDescription.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public BigDecimal getLevelno() {
        return levelno;
    }

    public void setLevelno(BigDecimal levelno) {
        this.levelno = levelno;
    }

    public BigDecimal getRcount() {
        return rcount;
    }

    public void setRcount(BigDecimal rcount) {
        this.rcount = rcount;
    }

    public String getExpandXml() {
        return expandXml;
    }

    public void setExpandXml(String expandXml) {
        this.expandXml = expandXml == null ? null : expandXml.trim();
    }

    public String getMuser() {
        return muser;
    }

    public void setMuser(String muser) {
        this.muser = muser == null ? null : muser.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
}