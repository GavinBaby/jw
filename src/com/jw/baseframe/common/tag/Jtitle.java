/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.jw.baseframe.common.bean.BeanLocator;
/*    */ import com.jw.baseframe.dao.C_T_Sys_System_InforMapper;
/*    */ import com.jw.baseframe.model.C_T_Sys_System_Infor;
/*    */ import com.jw.baseframe.model.C_T_Sys_System_InforExample;
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import java.util.List;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ 
/*    */ public class Jtitle extends UIBean
/*    */ {
/* 17 */   private C_T_Sys_System_InforMapper mapper = (C_T_Sys_System_InforMapper)BeanLocator.getService("c_T_Sys_System_InforMapper");
/*    */ 
/*    */   public Jtitle(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
/* 20 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 25 */     return "jtitle";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 29 */     super.evaluateExtraParams();
/*    */ 
/* 31 */     List list_C_T_Sys_System_Infor = null;
/* 32 */     C_T_Sys_System_InforExample example = new C_T_Sys_System_InforExample();
/* 33 */     example.or();
/*    */     try {
/* 35 */       list_C_T_Sys_System_Infor = this.mapper.selectByExample(example);
/*    */     }
/*    */     catch (SecurityException e)
/*    */     {
/* 39 */       e.printStackTrace();
/*    */     }
/*    */     catch (IllegalArgumentException e) {
/* 42 */       e.printStackTrace();
/*    */     }
/*    */ 
/* 45 */     String webTitle = "";
/* 46 */     if (list_C_T_Sys_System_Infor.size() > 0)
/*    */     {
/* 48 */       C_T_Sys_System_Infor sys_info = (C_T_Sys_System_Infor)list_C_T_Sys_System_Infor.get(0);
/* 49 */       webTitle = sys_info.getSystemName();
/*    */     }
/*    */ 
/* 52 */     if (webTitle != null)
/* 53 */       addParameter("webTitle", webTitle);
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jtitle
 * JD-Core Version:    0.6.0
 */