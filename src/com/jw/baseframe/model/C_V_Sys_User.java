package com.jw.baseframe.model;

import java.math.BigDecimal;

public class C_V_Sys_User {
    private String uuid;

    private String userSysName;

    private String userName;

    private String positionName;

    private String mobilephone;

    private String officephone;

    private BigDecimal isUnit;

    private BigDecimal userstate;

    private String state;

    private String usertype;

    private String pid;

    private String unitId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUserSysName() {
        return userSysName;
    }

    public void setUserSysName(String userSysName) {
        this.userSysName = userSysName == null ? null : userSysName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public BigDecimal getIsUnit() {
        return isUnit;
    }

    public void setIsUnit(BigDecimal isUnit) {
        this.isUnit = isUnit;
    }

    public BigDecimal getUserstate() {
        return userstate;
    }

    public void setUserstate(BigDecimal userstate) {
        this.userstate = userstate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }
}