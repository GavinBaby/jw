package com.jw.magicbpm.model.publicinformation;

public class B_V_Ufp_Mail {
    private String uuid;

    private Integer isNew;

    private String sendUser;

    private String sendSysUser;

    private String title;

    private String sendTime;

    private String receiverSysUser;

    private String receiverUser;

    private String receiverTime;

    private Long mailType;

    private Integer isDelete;

    private String canseeuser;

    private Integer replyFlag;

    private Integer isFile;

    private String priorityLeve;

    private String importantLeve;

    private Integer isReceipt;

    private String copyUser;

    private String darkUser;

    private String specificRecsysUser;

    private String tipDarkInfo;

    private String content;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getSendUser() {
        return sendUser;
    }

    public void setSendUser(String sendUser) {
        this.sendUser = sendUser == null ? null : sendUser.trim();
    }

    public String getSendSysUser() {
        return sendSysUser;
    }

    public void setSendSysUser(String sendSysUser) {
        this.sendSysUser = sendSysUser == null ? null : sendSysUser.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public String getReceiverSysUser() {
        return receiverSysUser;
    }

    public void setReceiverSysUser(String receiverSysUser) {
        this.receiverSysUser = receiverSysUser == null ? null : receiverSysUser.trim();
    }

    public String getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(String receiverUser) {
        this.receiverUser = receiverUser == null ? null : receiverUser.trim();
    }

    public String getReceiverTime() {
        return receiverTime;
    }

    public void setReceiverTime(String receiverTime) {
        this.receiverTime = receiverTime == null ? null : receiverTime.trim();
    }

    public Long getMailType() {
        return mailType;
    }

    public void setMailType(Long mailType) {
        this.mailType = mailType;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCanseeuser() {
        return canseeuser;
    }

    public void setCanseeuser(String canseeuser) {
        this.canseeuser = canseeuser == null ? null : canseeuser.trim();
    }

    public Integer getReplyFlag() {
        return replyFlag;
    }

    public void setReplyFlag(Integer replyFlag) {
        this.replyFlag = replyFlag;
    }

    public Integer getIsFile() {
        return isFile;
    }

    public void setIsFile(Integer isFile) {
        this.isFile = isFile;
    }

    public String getPriorityLeve() {
        return priorityLeve;
    }

    public void setPriorityLeve(String priorityLeve) {
        this.priorityLeve = priorityLeve == null ? null : priorityLeve.trim();
    }

    public String getImportantLeve() {
        return importantLeve;
    }

    public void setImportantLeve(String importantLeve) {
        this.importantLeve = importantLeve == null ? null : importantLeve.trim();
    }

    public Integer getIsReceipt() {
        return isReceipt;
    }

    public void setIsReceipt(Integer isReceipt) {
        this.isReceipt = isReceipt;
    }

    public String getCopyUser() {
        return copyUser;
    }

    public void setCopyUser(String copyUser) {
        this.copyUser = copyUser == null ? null : copyUser.trim();
    }

    public String getDarkUser() {
        return darkUser;
    }

    public void setDarkUser(String darkUser) {
        this.darkUser = darkUser == null ? null : darkUser.trim();
    }

    public String getSpecificRecsysUser() {
        return specificRecsysUser;
    }

    public void setSpecificRecsysUser(String specificRecsysUser) {
        this.specificRecsysUser = specificRecsysUser == null ? null : specificRecsysUser.trim();
    }

    public String getTipDarkInfo() {
        return tipDarkInfo;
    }

    public void setTipDarkInfo(String tipDarkInfo) {
        this.tipDarkInfo = tipDarkInfo == null ? null : tipDarkInfo.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}