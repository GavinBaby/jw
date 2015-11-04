package com.jw.magicbpm.model.personalaffairs;

import java.math.BigDecimal;

public class B_V_Uft_Department {
    private String deptId;

    private String unitId;

    private String deptName;

    private Integer sort;

    private String parenDeptid;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private Integer isDelete;

    private BigDecimal deptidLength;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getParenDeptid() {
        return parenDeptid;
    }

    public void setParenDeptid(String parenDeptid) {
        this.parenDeptid = parenDeptid == null ? null : parenDeptid.trim();
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getDeptidLength() {
        return deptidLength;
    }

    public void setDeptidLength(BigDecimal deptidLength) {
        this.deptidLength = deptidLength;
    }
}