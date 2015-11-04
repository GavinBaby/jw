package com.jw.baseframe.model;

public class C_V_Sys_Login_Log {
    private String loginUserName;

    private String loginTime;

    private String loginIp;

    private String loginMacaddress;

    private String deptName;

    private String unitid;

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName == null ? null : loginUserName.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginMacaddress() {
        return loginMacaddress;
    }

    public void setLoginMacaddress(String loginMacaddress) {
        this.loginMacaddress = loginMacaddress == null ? null : loginMacaddress.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
}