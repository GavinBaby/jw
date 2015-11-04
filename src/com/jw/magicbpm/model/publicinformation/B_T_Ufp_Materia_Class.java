package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_Materia_Class {
    private String uuid;

    private String pid;

    private String classname;

    private Integer sort;

    private String downpermit;

    private String downpermitname;

    private String uploadpermit;

    private String uploadpermitname;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDownpermit() {
        return downpermit;
    }

    public void setDownpermit(String downpermit) {
        this.downpermit = downpermit == null ? null : downpermit.trim();
    }

    public String getDownpermitname() {
        return downpermitname;
    }

    public void setDownpermitname(String downpermitname) {
        this.downpermitname = downpermitname == null ? null : downpermitname.trim();
    }

    public String getUploadpermit() {
        return uploadpermit;
    }

    public void setUploadpermit(String uploadpermit) {
        this.uploadpermit = uploadpermit == null ? null : uploadpermit.trim();
    }

    public String getUploadpermitname() {
        return uploadpermitname;
    }

    public void setUploadpermitname(String uploadpermitname) {
        this.uploadpermitname = uploadpermitname == null ? null : uploadpermitname.trim();
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