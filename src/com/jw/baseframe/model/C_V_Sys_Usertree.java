package com.jw.baseframe.model;

import org.apache.struts2.json.annotations.JSON;

public class C_V_Sys_Usertree {
    private String uuid;

    private String id;

    private String name;

    private String pId;

    private String deptId;

    private String unitId;

    private String fla;
    
    private String icon;

    private String isParent;
    
    private boolean isParentB;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

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

    public String getFla() {
        return fla;
    }

    public void setFla(String fla) {
        this.fla = fla == null ? null : fla.trim();
    }

    @JSON(name="IsParentS")
    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent == null ? null : isParent.trim();
    }

    @JSON(name="isParent")
	public boolean getIsParentB() {
		return "true".equals(isParent)? true : false;
	}
	
	public void setParentB(boolean isParentB) {
		this.isParentB = isParentB;
	}

	@JSON(name="icon")
	public String getIcon() {
		return "1".equals(fla)?"../../css/zTree/img/danwei.gif":"2".equals(fla)?"../../css/zTree/img/bumen.gif" : "../../css/zTree/img/renyuan.gif";
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
    
    
}