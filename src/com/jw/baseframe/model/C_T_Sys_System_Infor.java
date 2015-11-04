package com.jw.baseframe.model;

public class C_T_Sys_System_Infor {
    private String uuid;

    private String systemName;

    private String systemVersion;

    private String systemCopyright;

    private Integer datebaseVersion;

    private Integer releaseVersion;

    private Integer osVersion;

    private Integer canLockScreen;

    private Integer canSingleUser;

    private Integer canRetrievePwd;

    private Integer canLockUser;

    private Integer canIpLimit;

    private Integer canCa;

    private Integer canVerificationCode;

    private String sessionExpirationTime;

    private String expandXml;

    private String unitid;

    private Integer isDelete;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private Integer canMemoryPwd;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion == null ? null : systemVersion.trim();
    }

    public String getSystemCopyright() {
        return systemCopyright;
    }

    public void setSystemCopyright(String systemCopyright) {
        this.systemCopyright = systemCopyright == null ? null : systemCopyright.trim();
    }

    public Integer getDatebaseVersion() {
        return datebaseVersion;
    }

    public void setDatebaseVersion(Integer datebaseVersion) {
        this.datebaseVersion = datebaseVersion;
    }

    public Integer getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(Integer releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public Integer getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(Integer osVersion) {
        this.osVersion = osVersion;
    }

    public Integer getCanLockScreen() {
        return canLockScreen;
    }

    public void setCanLockScreen(Integer canLockScreen) {
        this.canLockScreen = canLockScreen;
    }

    public Integer getCanSingleUser() {
        return canSingleUser;
    }

    public void setCanSingleUser(Integer canSingleUser) {
        this.canSingleUser = canSingleUser;
    }

    public Integer getCanRetrievePwd() {
        return canRetrievePwd;
    }

    public void setCanRetrievePwd(Integer canRetrievePwd) {
        this.canRetrievePwd = canRetrievePwd;
    }

    public Integer getCanLockUser() {
        return canLockUser;
    }

    public void setCanLockUser(Integer canLockUser) {
        this.canLockUser = canLockUser;
    }

    public Integer getCanIpLimit() {
        return canIpLimit;
    }

    public void setCanIpLimit(Integer canIpLimit) {
        this.canIpLimit = canIpLimit;
    }

    public Integer getCanCa() {
        return canCa;
    }

    public void setCanCa(Integer canCa) {
        this.canCa = canCa;
    }

    public Integer getCanVerificationCode() {
        return canVerificationCode;
    }

    public void setCanVerificationCode(Integer canVerificationCode) {
        this.canVerificationCode = canVerificationCode;
    }

    public String getSessionExpirationTime() {
        return sessionExpirationTime;
    }

    public void setSessionExpirationTime(String sessionExpirationTime) {
        this.sessionExpirationTime = sessionExpirationTime == null ? null : sessionExpirationTime.trim();
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

    public Integer getCanMemoryPwd() {
        return canMemoryPwd;
    }

    public void setCanMemoryPwd(Integer canMemoryPwd) {
        this.canMemoryPwd = canMemoryPwd;
    }
}