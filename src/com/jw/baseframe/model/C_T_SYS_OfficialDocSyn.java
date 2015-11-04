package com.jw.baseframe.model;

public class C_T_SYS_OfficialDocSyn {
    private String uuid;

    private String pkid;

    private String doctype;

    private String docnum;

    private String doctitle;

    private String remark;

    private String senddepid;

    private String sendunit;

    private String recieveunit;

    private String filetype;

    private String keyword;

    private String regdate;

    private String fileid;

    private Integer isinput;

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

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid == null ? null : pkid.trim();
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype == null ? null : doctype.trim();
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum == null ? null : docnum.trim();
    }

    public String getDoctitle() {
        return doctitle;
    }

    public void setDoctitle(String doctitle) {
        this.doctitle = doctitle == null ? null : doctitle.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSenddepid() {
        return senddepid;
    }

    public void setSenddepid(String senddepid) {
        this.senddepid = senddepid == null ? null : senddepid.trim();
    }

    public String getSendunit() {
        return sendunit;
    }

    public void setSendunit(String sendunit) {
        this.sendunit = sendunit == null ? null : sendunit.trim();
    }

    public String getRecieveunit() {
        return recieveunit;
    }

    public void setRecieveunit(String recieveunit) {
        this.recieveunit = recieveunit == null ? null : recieveunit.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate == null ? null : regdate.trim();
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public Integer getIsinput() {
        return isinput;
    }

    public void setIsinput(Integer isinput) {
        this.isinput = isinput;
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