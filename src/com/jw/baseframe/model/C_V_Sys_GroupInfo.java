package com.jw.baseframe.model;

public class C_V_Sys_GroupInfo {
    private String userSysName;

    private String groupId;

    public String getUserSysName() {
        return userSysName;
    }

    public void setUserSysName(String userSysName) {
        this.userSysName = userSysName == null ? null : userSysName.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }
}