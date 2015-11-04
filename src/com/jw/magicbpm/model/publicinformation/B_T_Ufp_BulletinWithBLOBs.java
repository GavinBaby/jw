package com.jw.magicbpm.model.publicinformation;

public class B_T_Ufp_BulletinWithBLOBs extends B_T_Ufp_Bulletin{
	
    private String body;
    
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}