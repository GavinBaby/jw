package com.jw.baseframe.model;

public class C_T_Flow_History_Tache_InfoWithBLOBs extends C_T_Flow_History_Tache_Info {
    private String historyTacheTransactor;

    private String historyTacheTransactorShow;

    private String historyTachePasser;

    private String historyTachePasserShow;

    private String passerReaded;

    private String passerUnread;

    private String passerReadedCh;

    private String passerUnreadCh;

    public String getHistoryTacheTransactor() {
        return historyTacheTransactor;
    }

    public void setHistoryTacheTransactor(String historyTacheTransactor) {
        this.historyTacheTransactor = historyTacheTransactor == null ? null : historyTacheTransactor.trim();
    }

    public String getHistoryTacheTransactorShow() {
        return historyTacheTransactorShow;
    }

    public void setHistoryTacheTransactorShow(String historyTacheTransactorShow) {
        this.historyTacheTransactorShow = historyTacheTransactorShow == null ? null : historyTacheTransactorShow.trim();
    }

    public String getHistoryTachePasser() {
        return historyTachePasser;
    }

    public void setHistoryTachePasser(String historyTachePasser) {
        this.historyTachePasser = historyTachePasser == null ? null : historyTachePasser.trim();
    }

    public String getHistoryTachePasserShow() {
        return historyTachePasserShow;
    }

    public void setHistoryTachePasserShow(String historyTachePasserShow) {
        this.historyTachePasserShow = historyTachePasserShow == null ? null : historyTachePasserShow.trim();
    }

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

    public String getPasserReadedCh() {
        return passerReadedCh;
    }

    public void setPasserReadedCh(String passerReadedCh) {
        this.passerReadedCh = passerReadedCh == null ? null : passerReadedCh.trim();
    }

    public String getPasserUnreadCh() {
        return passerUnreadCh;
    }

    public void setPasserUnreadCh(String passerUnreadCh) {
        this.passerUnreadCh = passerUnreadCh == null ? null : passerUnreadCh.trim();
    }
}