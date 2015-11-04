package com.jw.baseframe.model;

public class C_V_Sys_ManagementleaderGroup {
    private String systemUserId;

    private String userName;

    private String depids;

    private String depnames;

    public String getSystemUserId() {
        return systemUserId;
    }

    public void setSystemUserId(String systemUserId) {
        this.systemUserId = systemUserId == null ? null : systemUserId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDepids() {
        return depids;
    }

    public void setDepids(String depids) {
        this.depids = depids == null ? null : depids.trim();
    }

    public String getDepnames() {
        return depnames;
    }

    public void setDepnames(String depnames) {
        this.depnames = depnames == null ? null : depnames.trim();
    }
}