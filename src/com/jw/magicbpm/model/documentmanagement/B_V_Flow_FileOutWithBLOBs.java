package com.jw.magicbpm.model.documentmanagement;

public class B_V_Flow_FileOutWithBLOBs extends B_V_Flow_FileOut {
    private String passerReaded;

    private String passerUnread;

    private String tacheuser;

    public String getPasserReaded() {
        return passerReaded;
    }

    public void setPasserReaded(String passerReaded) {
        this.passerReaded = passerReaded == null ? null : passerReaded.trim();
    }

    public String getPasserUnread() {
        return passerUnread;
    }

    public void setPasserUnread(String passerUnread) {
        this.passerUnread = passerUnread == null ? null : passerUnread.trim();
    }

    public String getTacheuser() {
        return tacheuser;
    }

    public void setTacheuser(String tacheuser) {
        this.tacheuser = tacheuser == null ? null : tacheuser.trim();
    }
}