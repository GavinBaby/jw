package com.jw.magicbpm.model.publicinformation;

public class B_T_Flow_Meetinguseinfo {
    private String uuid;

    private String meetingroomId;

    private Integer reservationnum;

    private String meetingserviceId;

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

    public String getMeetingroomId() {
        return meetingroomId;
    }

    public void setMeetingroomId(String meetingroomId) {
        this.meetingroomId = meetingroomId == null ? null : meetingroomId.trim();
    }

    public Integer getReservationnum() {
        return reservationnum;
    }

    public void setReservationnum(Integer reservationnum) {
        this.reservationnum = reservationnum;
    }

    public String getMeetingserviceId() {
        return meetingserviceId;
    }

    public void setMeetingserviceId(String meetingserviceId) {
        this.meetingserviceId = meetingserviceId == null ? null : meetingserviceId.trim();
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