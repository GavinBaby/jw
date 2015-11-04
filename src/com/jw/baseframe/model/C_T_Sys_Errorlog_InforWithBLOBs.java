package com.jw.baseframe.model;

public class C_T_Sys_Errorlog_InforWithBLOBs extends C_T_Sys_Errorlog_Infor {
    private String errorInfor;

    private String errorStacktrace;

    public String getErrorInfor() {
        return errorInfor;
    }

    public void setErrorInfor(String errorInfor) {
        this.errorInfor = errorInfor == null ? null : errorInfor.trim();
    }

    public String getErrorStacktrace() {
        return errorStacktrace;
    }

    public void setErrorStacktrace(String errorStacktrace) {
        this.errorStacktrace = errorStacktrace == null ? null : errorStacktrace.trim();
    }
}