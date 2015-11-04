package com.jw.baseframe.model;

import org.apache.struts2.json.annotations.JSON;

public class C_T_Sys_BaseSelect {
    private String id;
    
	private String name;

    private String pId;
    
    @JSON(name="id")
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@JSON(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 @JSON(name="pId")
	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

    
}