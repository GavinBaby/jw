package com.jw.baseframe.model;

public class C_V_Sys_Unit_Module {
    private String uuid;

    private String moduleId;

    private String moduleName;

    private Integer moduleType;

    private Integer sort;

    private String linkUrl;

    private String target;

    private String parenModule;

    private String moduleDescription;

    private String picUrl;

    private String tableName;

    private Integer isHaveSms;

    private Integer isHaveMsg;

    private String pkId;

    private String titleId;

    private Integer isLogicDelete;

    private String expandXml;

    private String unitid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

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

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Integer getIsHaveSms() {
        return isHaveSms;
    }

    public void setIsHaveSms(Integer isHaveSms) {
        this.isHaveSms = isHaveSms;
    }

    public Integer getIsHaveMsg() {
        return isHaveMsg;
    }

    public void setIsHaveMsg(Integer isHaveMsg) {
        this.isHaveMsg = isHaveMsg;
    }

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId == null ? null : pkId.trim();
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId == null ? null : titleId.trim();
    }

    public Integer getIsLogicDelete() {
        return isLogicDelete;
    }

    public void setIsLogicDelete(Integer isLogicDelete) {
        this.isLogicDelete = isLogicDelete;
    }

    public String getExpandXml() {
        return expandXml;
    }

    public void setExpandXml(String expandXml) {
        this.expandXml = expandXml == null ? null : expandXml.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
}