package com.jw.magicbpm.model.publicinformation;

public class B_V_Ufp_Meeting_Equipuse {
    private String equipmentId;

    private String uuid;

    private Integer equipmentNum;

    private String meetingserviceId;

    private String equipmentName;

    private Integer sort;

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(Integer equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public String getMeetingserviceId() {
        return meetingserviceId;
    }

    public void setMeetingserviceId(String meetingserviceId) {
        this.meetingserviceId = meetingserviceId == null ? null : meetingserviceId.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}