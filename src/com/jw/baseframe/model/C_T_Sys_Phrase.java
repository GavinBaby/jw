package com.jw.baseframe.model;

public class C_T_Sys_Phrase {
    private String uuid;

    private Integer sort;

    private String phraseBody;

    private String moduleUuid;

    private Integer isPersonalPhrase;

    private String belongsUser;

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPhraseBody() {
        return phraseBody;
    }

    public void setPhraseBody(String phraseBody) {
        this.phraseBody = phraseBody == null ? null : phraseBody.trim();
    }

    public String getModuleUuid() {
        return moduleUuid;
    }

    public void setModuleUuid(String moduleUuid) {
        this.moduleUuid = moduleUuid == null ? null : moduleUuid.trim();
    }

    public Integer getIsPersonalPhrase() {
        return isPersonalPhrase;
    }

    public void setIsPersonalPhrase(Integer isPersonalPhrase) {
        this.isPersonalPhrase = isPersonalPhrase;
    }

    public String getBelongsUser() {
        return belongsUser;
    }

    public void setBelongsUser(String belongsUser) {
        this.belongsUser = belongsUser == null ? null : belongsUser.trim();
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