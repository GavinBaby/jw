package com.jw.baseframe.model;

public class C_V_Flow_Tache_Deptuser {
    private String tacheId;

    private String flowId;

    private String unitid;

    private String tacheTransactorSys;

    private String userName;

    private String deptId;

    private String deptName;

    private Integer deptSort;

    public String getTacheId() {
        return tacheId;
    }

    public void setTacheId(String tacheId) {
        this.tacheId = tacheId == null ? null : tacheId.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

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