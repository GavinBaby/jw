package com.jw.magicbpm.model.documentmanagement;

public class B_T_Ufp_Filein_Serial {
    private String uuid;

    private String fileinTypeid;

    private String fileinSerial;

    private String fileinYear;

    private Integer sort;

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

    public String getFileinTypeid() {
        return fileinTypeid;
    }

    public void setFileinTypeid(String fileinTypeid) {
        this.fileinTypeid = fileinTypeid == null ? null : fileinTypeid.trim();
    }

    public String getFileinSerial() {
        return fileinSerial;
    }

    public void setFileinSerial(String fileinSerial) {
        this.fileinSerial = fileinSerial == null ? null : fileinSerial.trim();
    }

    public String getFileinYear() {
        return fileinYear;
    }

    public void setFileinYear(String fileinYear) {
        this.fileinYear = fileinYear == null ? null : fileinYear.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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