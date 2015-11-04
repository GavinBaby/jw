package com.jw.magicbpm.model.documentmanagement;

public class B_T_Ufp_FilesBase {
    private String uuid;

    private String documentbaseId;

    private String documentbaseTitle;

    private String documentbaseMark;

    private String documentbaseFilepath;

    private String documentbaseFiledate;

    private Integer sort;

    private String expandXml;

    private String unitid;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private Integer isDelete;

    private String documentbaseSwwh;

    private String documentbaseLwwh;

    private String documentbaseMj;

    private String documentbaseFwwh;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDocumentbaseId() {
        return documentbaseId;
    }

    public void setDocumentbaseId(String documentbaseId) {
        this.documentbaseId = documentbaseId == null ? null : documentbaseId.trim();
    }

    public String getDocumentbaseTitle() {
        return documentbaseTitle;
    }

    public void setDocumentbaseTitle(String documentbaseTitle) {
        this.documentbaseTitle = documentbaseTitle == null ? null : documentbaseTitle.trim();
    }

    public String getDocumentbaseMark() {
        return documentbaseMark;
    }

    public void setDocumentbaseMark(String documentbaseMark) {
        this.documentbaseMark = documentbaseMark == null ? null : documentbaseMark.trim();
    }

    public String getDocumentbaseFilepath() {
        return documentbaseFilepath;
    }

    public void setDocumentbaseFilepath(String documentbaseFilepath) {
        this.documentbaseFilepath = documentbaseFilepath == null ? null : documentbaseFilepath.trim();
    }

    public String getDocumentbaseFiledate() {
        return documentbaseFiledate;
    }

    public void setDocumentbaseFiledate(String documentbaseFiledate) {
        this.documentbaseFiledate = documentbaseFiledate == null ? null : documentbaseFiledate.trim();
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getDocumentbaseSwwh() {
        return documentbaseSwwh;
    }

    public void setDocumentbaseSwwh(String documentbaseSwwh) {
        this.documentbaseSwwh = documentbaseSwwh == null ? null : documentbaseSwwh.trim();
    }

    public String getDocumentbaseLwwh() {
        return documentbaseLwwh;
    }

    public void setDocumentbaseLwwh(String documentbaseLwwh) {
        this.documentbaseLwwh = documentbaseLwwh == null ? null : documentbaseLwwh.trim();
    }

    public String getDocumentbaseMj() {
        return documentbaseMj;
    }

    public void setDocumentbaseMj(String documentbaseMj) {
        this.documentbaseMj = documentbaseMj == null ? null : documentbaseMj.trim();
    }

    public String getDocumentbaseFwwh() {
        return documentbaseFwwh;
    }

    public void setDocumentbaseFwwh(String documentbaseFwwh) {
        this.documentbaseFwwh = documentbaseFwwh == null ? null : documentbaseFwwh.trim();
    }
}