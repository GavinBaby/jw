package com.jw.magicbpm.model.documentmanagement;

public class B_V_Ufp_Filein_Serial {
    private String uuid;

    private String fileinSerialname;

    private String fileinTypeid;

    private String unitId;

    private String fileinYear;

    private String fileinSerial;

    private Integer sort;

    private Integer isDelete;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getFileinSerialname() {
        return fileinSerialname;
    }

    public void setFileinSerialname(String fileinSerialname) {
        this.fileinSerialname = fileinSerialname == null ? null : fileinSerialname.trim();
    }

    public String getFileinTypeid() {
        return fileinTypeid;
    }

    public void setFileinTypeid(String fileinTypeid) {
        this.fileinTypeid = fileinTypeid == null ? null : fileinTypeid.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}