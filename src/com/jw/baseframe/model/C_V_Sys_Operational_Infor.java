package com.jw.baseframe.model;

public class C_V_Sys_Operational_Infor {
    private String moduleName;

    private String mainDocId;

    private String operationType;

    private String operationSql;

    private String unitid;

    private String createUser;

    private String createTime;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getMainDocId() {
        return mainDocId;
    }

    public void setMainDocId(String mainDocId) {
        this.mainDocId = mainDocId == null ? null : mainDocId.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public String getOperationSql() {
        return operationSql;
    }

    public void setOperationSql(String operationSql) {
        this.operationSql = operationSql == null ? null : operationSql.trim();
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
}