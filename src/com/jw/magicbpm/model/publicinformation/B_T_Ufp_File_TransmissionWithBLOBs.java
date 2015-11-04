package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_File_TransmissionWithBLOBs extends B_T_Ufp_File_Transmission {
    private String receiveperson;

    private String receivename;

    public String getReceiveperson() {
        return receiveperson;
    }

    public void setReceiveperson(String receiveperson) {
        this.receiveperson = receiveperson == null ? null : receiveperson.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }
}