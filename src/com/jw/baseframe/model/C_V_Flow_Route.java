package com.jw.baseframe.model;

public class C_V_Flow_Route {
    private String flowId;

    private String curTacheId;

    private String nextTacheId;

    private String tacheName;

    private String unitid;

    private Integer tacheIsConfirmsubmit;

    private Integer tacheIsPermitpass;

    private Integer tacheDoIsSentSms;

    private Integer tachePassIsSentsms;

    private Integer tacheDoIsSentMsg;

    private Integer tachePassIsSentMsg;

    private Integer tacheOneDirectSubmit;

    private Integer tacheShowMydepPerson;

    private Integer tacheShowAllPerson;

    private String changeTacheId;

    private Integer transactorType;

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

    public String getTacheName() {
        return tacheName;
    }

    public void setTacheName(String tacheName) {
        this.tacheName = tacheName == null ? null : tacheName.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    public Integer getTacheIsConfirmsubmit() {
        return tacheIsConfirmsubmit;
    }

    public void setTacheIsConfirmsubmit(Integer tacheIsConfirmsubmit) {
        this.tacheIsConfirmsubmit = tacheIsConfirmsubmit;
    }

    public Integer getTacheIsPermitpass() {
        return tacheIsPermitpass;
    }

    public void setTacheIsPermitpass(Integer tacheIsPermitpass) {
        this.tacheIsPermitpass = tacheIsPermitpass;
    }

    public Integer getTacheDoIsSentSms() {
        return tacheDoIsSentSms;
    }

    public void setTacheDoIsSentSms(Integer tacheDoIsSentSms) {
        this.tacheDoIsSentSms = tacheDoIsSentSms;
    }

    public Integer getTachePassIsSentsms() {
        return tachePassIsSentsms;
    }

    public void setTachePassIsSentsms(Integer tachePassIsSentsms) {
        this.tachePassIsSentsms = tachePassIsSentsms;
    }

    public Integer getTacheDoIsSentMsg() {
        return tacheDoIsSentMsg;
    }

    public void setTacheDoIsSentMsg(Integer tacheDoIsSentMsg) {
        this.tacheDoIsSentMsg = tacheDoIsSentMsg;
    }

    public Integer getTachePassIsSentMsg() {
        return tachePassIsSentMsg;
    }

    public void setTachePassIsSentMsg(Integer tachePassIsSentMsg) {
        this.tachePassIsSentMsg = tachePassIsSentMsg;
    }

    public Integer getTacheOneDirectSubmit() {
        return tacheOneDirectSubmit;
    }

    public void setTacheOneDirectSubmit(Integer tacheOneDirectSubmit) {
        this.tacheOneDirectSubmit = tacheOneDirectSubmit;
    }

    public Integer getTacheShowMydepPerson() {
        return tacheShowMydepPerson;
    }

    public void setTacheShowMydepPerson(Integer tacheShowMydepPerson) {
        this.tacheShowMydepPerson = tacheShowMydepPerson;
    }

    public Integer getTacheShowAllPerson() {
        return tacheShowAllPerson;
    }

    public void setTacheShowAllPerson(Integer tacheShowAllPerson) {
        this.tacheShowAllPerson = tacheShowAllPerson;
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
}