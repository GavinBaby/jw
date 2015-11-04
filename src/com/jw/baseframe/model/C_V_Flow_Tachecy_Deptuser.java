package com.jw.baseframe.model;

public class C_V_Flow_Tachecy_Deptuser {
    private String unitid;

    private String userSysName;

    private String userName;

    private String deptId;

    private String deptName;

    private Integer deptSort;

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptSort() {
        return deptSort;
    }

    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }
}