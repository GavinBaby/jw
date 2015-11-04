package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_MateriaWithBLOBs extends B_T_Ufp_Materia {
    private String materiaDownuser;

    private String materiaDownname;

    public String getMateriaDownuser() {
        return materiaDownuser;
    }

    public void setMateriaDownuser(String materiaDownuser) {
        this.materiaDownuser = materiaDownuser == null ? null : materiaDownuser.trim();
    }

    public String getMateriaDownname() {
        return materiaDownname;
    }

    public void setMateriaDownname(String materiaDownname) {
        this.materiaDownname = materiaDownname == null ? null : materiaDownname.trim();
    }
}