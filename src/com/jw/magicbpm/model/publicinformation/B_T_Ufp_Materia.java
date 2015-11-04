package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_Materia {
    private String uuid;

    private String materiaTime;

    private String materiaAuthor;

    private String materiaTitle;

    private String materiaPlace;

    private String materiaDetails;

    private String materiaClass;

    private String materiaUri;

    private Integer materiaIscheck;

    private String materiaRemark;

    private String unitid;

    private Integer isDelete;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private String expandXml;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMateriaTime() {
        return materiaTime;
    }

    public void setMateriaTime(String materiaTime) {
        this.materiaTime = materiaTime == null ? null : materiaTime.trim();
    }

    public String getMateriaAuthor() {
        return materiaAuthor;
    }

    public void setMateriaAuthor(String materiaAuthor) {
        this.materiaAuthor = materiaAuthor == null ? null : materiaAuthor.trim();
    }

    public String getMateriaTitle() {
        return materiaTitle;
    }

    public void setMateriaTitle(String materiaTitle) {
        this.materiaTitle = materiaTitle == null ? null : materiaTitle.trim();
    }

    public String getMateriaPlace() {
        return materiaPlace;
    }

    public void setMateriaPlace(String materiaPlace) {
        this.materiaPlace = materiaPlace == null ? null : materiaPlace.trim();
    }

    public String getMateriaDetails() {
        return materiaDetails;
    }

    public void setMateriaDetails(String materiaDetails) {
        this.materiaDetails = materiaDetails == null ? null : materiaDetails.trim();
    }

    public String getMateriaClass() {
        return materiaClass;
    }

    public void setMateriaClass(String materiaClass) {
        this.materiaClass = materiaClass == null ? null : materiaClass.trim();
    }

    public String getMateriaUri() {
        return materiaUri;
    }

    public void setMateriaUri(String materiaUri) {
        this.materiaUri = materiaUri == null ? null : materiaUri.trim();
    }

    public Integer getMateriaIscheck() {
        return materiaIscheck;
    }

    public void setMateriaIscheck(Integer materiaIscheck) {
        this.materiaIscheck = materiaIscheck;
    }

    public String getMateriaRemark() {
        return materiaRemark;
    }

    public void setMateriaRemark(String materiaRemark) {
        this.materiaRemark = materiaRemark == null ? null : materiaRemark.trim();
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

    public String getExpandXml() {
        return expandXml;
    }

    public void setExpandXml(String expandXml) {
        this.expandXml = expandXml == null ? null : expandXml.trim();
    }
}