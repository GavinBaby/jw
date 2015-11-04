package com.jw.baseframe.model;

public class C_T_Sys_Errorlog_Infor {
    private String uuid;

    private String moduleId;

    private String mainDocId;

    private String erroeType;

    private String errorId;

    private String exceptionnameEn;

    private String exceptionnameCn;

    private String exceptionAction;

    private String errorIp;

    private String expandXml;

    private String unitid;

    private Integer isDelete;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

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

    public String getMainDocId() {
        return mainDocId;
    }

    public void setMainDocId(String mainDocId) {
        this.mainDocId = mainDocId == null ? null : mainDocId.trim();
    }

    public String getErroeType() {
        return erroeType;
    }

    public void setErroeType(String erroeType) {
        this.erroeType = erroeType == null ? null : erroeType.trim();
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId == null ? null : errorId.trim();
    }

    public String getExceptionnameEn() {
        return exceptionnameEn;
    }

    public void setExceptionnameEn(String exceptionnameEn) {
        this.exceptionnameEn = exceptionnameEn == null ? null : exceptionnameEn.trim();
    }

    public String getExceptionnameCn() {
        return exceptionnameCn;
    }

    public void setExceptionnameCn(String exceptionnameCn) {
        this.exceptionnameCn = exceptionnameCn == null ? null : exceptionnameCn.trim();
    }

    public String getExceptionAction() {
        return exceptionAction;
    }

    public void setExceptionAction(String exceptionAction) {
        this.exceptionAction = exceptionAction == null ? null : exceptionAction.trim();
    }

    public String getErrorIp() {
        return errorIp;
    }

    public void setErrorIp(String errorIp) {
        this.errorIp = errorIp == null ? null : errorIp.trim();
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}