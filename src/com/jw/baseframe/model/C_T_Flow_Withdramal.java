package com.jw.baseframe.model;

public class C_T_Flow_Withdramal {
    private String uuid;

    private String mainId;

    private String moduleId;

    private String withdramalFromTache;

    private String withdramalToTache;

    private String withdramalFromUser;

    private String withdramalToUser;

    private String withdramalopinion;

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

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getWithdramalFromTache() {
        return withdramalFromTache;
    }

    public void setWithdramalFromTache(String withdramalFromTache) {
        this.withdramalFromTache = withdramalFromTache == null ? null : withdramalFromTache.trim();
    }

    public String getWithdramalToTache() {
        return withdramalToTache;
    }

    public void setWithdramalToTache(String withdramalToTache) {
        this.withdramalToTache = withdramalToTache == null ? null : withdramalToTache.trim();
    }

    public String getWithdramalFromUser() {
        return withdramalFromUser;
    }

    public void setWithdramalFromUser(String withdramalFromUser) {
        this.withdramalFromUser = withdramalFromUser == null ? null : withdramalFromUser.trim();
    }

    public String getWithdramalToUser() {
        return withdramalToUser;
    }

    public void setWithdramalToUser(String withdramalToUser) {
        this.withdramalToUser = withdramalToUser == null ? null : withdramalToUser.trim();
    }

    public String getWithdramalopinion() {
        return withdramalopinion;
    }

    public void setWithdramalopinion(String withdramalopinion) {
        this.withdramalopinion = withdramalopinion == null ? null : withdramalopinion.trim();
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