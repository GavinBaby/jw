package com.jw.baseframe.model;

public class C_T_Flow_Route {
    private String uuid;

    private String flowId;

    private String curTacheId;

    private String nextTacheId;

    private String flowRouteCondition;

    private String changeTacheId;

    private Integer transactorType;

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

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getCurTacheId() {
        return curTacheId;
    }

    public void setCurTacheId(String curTacheId) {
        this.curTacheId = curTacheId == null ? null : curTacheId.trim();
    }

    public String getNextTacheId() {
        return nextTacheId;
    }

    public void setNextTacheId(String nextTacheId) {
        this.nextTacheId = nextTacheId == null ? null : nextTacheId.trim();
    }

    public String getFlowRouteCondition() {
        return flowRouteCondition;
    }

    public void setFlowRouteCondition(String flowRouteCondition) {
        this.flowRouteCondition = flowRouteCondition == null ? null : flowRouteCondition.trim();
    }

    public String getChangeTacheId() {
        return changeTacheId;
    }

    public void setChangeTacheId(String changeTacheId) {
        this.changeTacheId = changeTacheId == null ? null : changeTacheId.trim();
    }

    public Integer getTransactorType() {
        return transactorType;
    }

    public void setTransactorType(Integer transactorType) {
        this.transactorType = transactorType;
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