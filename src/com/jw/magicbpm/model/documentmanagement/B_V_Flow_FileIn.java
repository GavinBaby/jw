package com.jw.magicbpm.model.documentmanagement;

public class B_V_Flow_FileIn {
    private String uuid;

    private String registeredTime;

    private String urgency;

    private String fileinTitle;

    private String fileinTypeid;

    private String fileinTypename;

    private String fileinYear;

    private String fileinSerial;

    private String curTacheName;

    private String tacheTransactorBackupShow;

    private String tacheTransactorBackup;

    private Integer isFinished;

    private String moduleId;

    private String createTime;

    private String unitid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime == null ? null : registeredTime.trim();
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    public String getFileinTitle() {
        return fileinTitle;
    }

    public void setFileinTitle(String fileinTitle) {
        this.fileinTitle = fileinTitle == null ? null : fileinTitle.trim();
    }

    public String getFileinTypeid() {
        return fileinTypeid;
    }

    public void setFileinTypeid(String fileinTypeid) {
        this.fileinTypeid = fileinTypeid == null ? null : fileinTypeid.trim();
    }

    public String getFileinTypename() {
        return fileinTypename;
    }

    public void setFileinTypename(String fileinTypename) {
        this.fileinTypename = fileinTypename == null ? null : fileinTypename.trim();
    }

    public String getFileinYear() {
        return fileinYear;
    }

    public void setFileinYear(String fileinYear) {
        this.fileinYear = fileinYear == null ? null : fileinYear.trim();
    }

    public String getFileinSerial() {
        return fileinSerial;
    }

    public void setFileinSerial(String fileinSerial) {
        this.fileinSerial = fileinSerial == null ? null : fileinSerial.trim();
    }

    public String getCurTacheName() {
        return curTacheName;
    }

    public void setCurTacheName(String curTacheName) {
        this.curTacheName = curTacheName == null ? null : curTacheName.trim();
    }

    public String getTacheTransactorBackupShow() {
        return tacheTransactorBackupShow;
    }

    public void setTacheTransactorBackupShow(String tacheTransactorBackupShow) {
        this.tacheTransactorBackupShow = tacheTransactorBackupShow == null ? null : tacheTransactorBackupShow.trim();
    }

    public String getTacheTransactorBackup() {
        return tacheTransactorBackup;
    }

    public void setTacheTransactorBackup(String tacheTransactorBackup) {
        this.tacheTransactorBackup = tacheTransactorBackup == null ? null : tacheTransactorBackup.trim();
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
}