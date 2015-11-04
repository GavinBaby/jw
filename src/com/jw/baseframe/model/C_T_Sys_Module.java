package com.jw.baseframe.model;

import org.apache.struts2.json.annotations.JSON;

public class C_T_Sys_Module {
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

    private Integer isDelete;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;
    @JSON(name="uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
    @JSON(name="id")
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }
    @JSON(name="moduleName")
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }
    @JSON(name="moduleType")
    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }
    @JSON(name="sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    @JSON(name="linkUrl")
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }
    @JSON(name="target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }
    @JSON(name="pId")
    public String getParenModule() {
        return parenModule;
    }

    public void setParenModule(String parenModule) {
        this.parenModule = parenModule == null ? null : parenModule.trim();
    }
    @JSON(name="moduleDescription")
    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription == null ? null : moduleDescription.trim();
    }
    @JSON(name="picUrl")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
    @JSON(name="tableName")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }
    @JSON(name="isHaveSms")
    public Integer getIsHaveSms() {
        return isHaveSms;
    }

    public void setIsHaveSms(Integer isHaveSms) {
        this.isHaveSms = isHaveSms;
    }
    @JSON(name="isHaveMsg")
    public Integer getIsHaveMsg() {
        return isHaveMsg;
    }

    public void setIsHaveMsg(Integer isHaveMsg) {
        this.isHaveMsg = isHaveMsg;
    }
    @JSON(name="pkId")
    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId == null ? null : pkId.trim();
    }
    @JSON(name="titleId")
    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId == null ? null : titleId.trim();
    }
    @JSON(name="isLogicDelete")
    public Integer getIsLogicDelete() {
        return isLogicDelete;
    }

    public void setIsLogicDelete(Integer isLogicDelete) {
        this.isLogicDelete = isLogicDelete;
    }
    @JSON(name="expandXml")
    public String getExpandXml() {
        return expandXml;
    }

    public void setExpandXml(String expandXml) {
        this.expandXml = expandXml == null ? null : expandXml.trim();
    }
    @JSON(name="unitid")
    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
    @JSON(name="isDelete")
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    @JSON(name="createUser")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
    @JSON(name="createTime")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
    @JSON(name="updateUser")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
    @JSON(name="updateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}