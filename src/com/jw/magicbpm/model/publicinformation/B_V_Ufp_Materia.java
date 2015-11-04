package com.jw.magicbpm.model.publicinformation;

public class B_V_Ufp_Materia {
    private String uuid;

    private String materiaTime;

    private String materiaAuthor;

    private String materiaTitle;

    private String materiaClass;

    private Integer materiaIscheck;

    private String unitid;

    private Integer isDelete;

    private String createUser;

    private String createTime;

    private String classname;

    private Integer sort;

    private String downpermit;

    private String downpermitname;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMateriaTime() {
        return materiaTime;
    }

    public void setMateriaTime(String materiaTime) {
        this.materiaTime = materiaTime == null ? null : materiaTime.trim();
    }

    public String getMateriaAuthor() {
        return materiaAuthor;
    }

    public void setMateriaAuthor(String materiaAuthor) {
        this.materiaAuthor = materiaAuthor == null ? null : materiaAuthor.trim();
    }

    public String getMateriaTitle() {
        return materiaTitle;
    }

    public void setMateriaTitle(String materiaTitle) {
        this.materiaTitle = materiaTitle == null ? null : materiaTitle.trim();
    }

    public String getMateriaClass() {
        return materiaClass;
    }

    public void setMateriaClass(String materiaClass) {
        this.materiaClass = materiaClass == null ? null : materiaClass.trim();
    }

    public Integer getMateriaIscheck() {
        return materiaIscheck;
    }

    public void setMateriaIscheck(Integer materiaIscheck) {
        this.materiaIscheck = materiaIscheck;
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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDownpermit() {
        return downpermit;
    }

    public void setDownpermit(String downpermit) {
        this.downpermit = downpermit == null ? null : downpermit.trim();
    }

    public String getDownpermitname() {
        return downpermitname;
    }

    public void setDownpermitname(String downpermitname) {
        this.downpermitname = downpermitname == null ? null : downpermitname.trim();
    }
}