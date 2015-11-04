/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.jw.baseframe.common.bean.BeanLocator;
/*    */ import com.jw.baseframe.dao.C_T_Sys_System_InforMapper;
/*    */ import com.jw.baseframe.model.C_T_Sys_System_Infor;
/*    */ import com.jw.baseframe.model.C_T_Sys_System_InforExample;
/*    */ import com.jw.baseframe.model.C_T_Sys_System_InforExample.Criteria;
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.springframework.stereotype.Repository;
/*    */ 
/*    */ @Repository
/*    */ public class Jhead extends UIBean
/*    */ {
/*    */   public Jhead(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 24 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 29 */     return "jhead";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 33 */     super.evaluateExtraParams();
/*    */ 
/* 35 */     List list_C_T_Sys_System_Infor = null;
/* 36 */     C_T_Sys_System_InforExample example = new C_T_Sys_System_InforExample();
/* 37 */     example.or().andUnitidIsNotNull();
/*    */     try {
/* 39 */       C_T_Sys_System_InforMapper mapper = (C_T_Sys_System_InforMapper)BeanLocator.getService("c_T_Sys_System_InforMapper");
/* 40 */       list_C_T_Sys_System_Infor = mapper.selectByExample(example);
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 44 */       e.printStackTrace();
/*    */     }
/*    */ 
/* 47 */     String webTitle = "";
/* 48 */     if (list_C_T_Sys_System_Infor.size() > 0)
/*    */     {
/* 50 */       C_T_Sys_System_Infor sys_info = (C_T_Sys_System_Infor)list_C_T_Sys_System_Infor.get(0);
/* 51 */       webTitle = sys_info.getSystemName();
/*    */     }
/*    */ 
/* 54 */     if (webTitle != null)
/* 55 */       addParameter("webTitle", webTitle);
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jhead
 * JD-Core Version:    0.6.0
 */