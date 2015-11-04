package com.jw.baseframe.model;

public class C_V_Flow_History_Tache_Info {

	//环节名称
	//环节处理人员</td>
	//环节传阅人员</td>
	//处理时间</td></tr>
    private String tacheName;

    private String clr;

    private String cyr;

    private String tacheFinishTime;

	public String getTacheName() {
		return tacheName;
	}

	public void setTacheName(String tacheName) {
		this.tacheName = tacheName;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public String getCyr() {
		return cyr;
	}

	public void setCyr(String cyr) {
		this.cyr = cyr;
	}

	public String getTacheFinishTime() {
		return tacheFinishTime;
	}

	public void setTacheFinishTime(String tacheFinishTime) {
		this.tacheFinishTime = tacheFinishTime;
	}
}
