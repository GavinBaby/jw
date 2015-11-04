package com.jw.magicbpm.model.documentmanagement;

public class B_V_Flow_FileOut {
    private String uuid;

    private String moduleId;

    private String curTacheName;

    private String tacheTransactorBackup;

    private Integer isFinished;

    private String fileoutDraftDate;

    private String fileoutRecordtypeid;

    private String fileoutYear;

    private String fileoutSerial;

    private String fileoutTitle;

    private String fileoutUrgency;

    private String tacheTransactorBackupShow;

    private String createTime;

    private String recordtypeName;

    private String unitid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getCurTacheName() {
        return curTacheName;
    }

    public void setCurTacheName(String curTacheName) {
        this.curTacheName = curTacheName == null ? null : curTacheName.trim();
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

    public String getFileoutDraftDate() {
        return fileoutDraftDate;
    }

    public void setFileoutDraftDate(String fileoutDraftDate) {
        this.fileoutDraftDate = fileoutDraftDate == null ? null : fileoutDraftDate.trim();
    }

    public String getFileoutRecordtypeid() {
        return fileoutRecordtypeid;
    }

    public void setFileoutRecordtypeid(String fileoutRecordtypeid) {
        this.fileoutRecordtypeid = fileoutRecordtypeid == null ? null : fileoutRecordtypeid.trim();
    }

    public String getFileoutYear() {
        return fileoutYear;
    }

    public void setFileoutYear(String fileoutYear) {
        this.fileoutYear = fileoutYear == null ? null : fileoutYear.trim();
    }

    public String getFileoutSerial() {
        return fileoutSerial;
    }

    public void setFileoutSerial(String fileoutSerial) {
        this.fileoutSerial = fileoutSerial == null ? null : fileoutSerial.trim();
    }

    public String getFileoutTitle() {
        return fileoutTitle;
    }

    public void setFileoutTitle(String fileoutTitle) {
        this.fileoutTitle = fileoutTitle == null ? null : fileoutTitle.trim();
    }

    public String getFileoutUrgency() {
        return fileoutUrgency;
    }

    public void setFileoutUrgency(String fileoutUrgency) {
        this.fileoutUrgency = fileoutUrgency == null ? null : fileoutUrgency.trim();
    }

    public String getTacheTransactorBackupShow() {
        return tacheTransactorBackupShow;
    }

    public void setTacheTransactorBackupShow(String tacheTransactorBackupShow) {
        this.tacheTransactorBackupShow = tacheTransactorBackupShow == null ? null : tacheTransactorBackupShow.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getRecordtypeName() {
        return recordtypeName;
    }

    public void setRecordtypeName(String recordtypeName) {
        this.recordtypeName = recordtypeName == null ? null : recordtypeName.trim();
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }
}