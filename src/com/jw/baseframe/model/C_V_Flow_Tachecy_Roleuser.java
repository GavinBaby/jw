package com.jw.baseframe.model;

public class C_V_Flow_Tachecy_Roleuser {
    private String unitid;

    private String tacheTransactorSys;

    private String userName;

    private String roleId;

    private String roleName;

    private Integer roleSort;

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    public String getTacheTransactorSys() {
        return tacheTransactorSys;
    }

    public void setTacheTransactorSys(String tacheTransactorSys) {
        this.tacheTransactorSys = tacheTransactorSys == null ? null : tacheTransactorSys.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }
}