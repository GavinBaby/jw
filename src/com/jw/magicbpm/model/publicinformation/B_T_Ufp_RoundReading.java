package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_RoundReading {
    private String uuid;

    private String title;

    private String roundreadingPerson;

    private String roundreadingTime;

    private String roundreadingId;

    private Integer isread;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRoundreadingPerson() {
        return roundreadingPerson;
    }

    public void setRoundreadingPerson(String roundreadingPerson) {
        this.roundreadingPerson = roundreadingPerson == null ? null : roundreadingPerson.trim();
    }

    public String getRoundreadingTime() {
        return roundreadingTime;
    }

    public void setRoundreadingTime(String roundreadingTime) {
        this.roundreadingTime = roundreadingTime == null ? null : roundreadingTime.trim();
    }

    public String getRoundreadingId() {
        return roundreadingId;
    }

    public void setRoundreadingId(String roundreadingId) {
        this.roundreadingId = roundreadingId == null ? null : roundreadingId.trim();
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
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