/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.jw.baseframe.common.bean.BeanLocator;
/*    */ import com.jw.baseframe.dao.C_T_Sys_ModuleLevelMapper;
/*    */ import com.jw.baseframe.model.C_T_Sys_ModuleLevel;
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ public class Jlevel extends UIBean
/*    */ {
/*    */   protected String moduleId;
/*    */ 
/*    */   public Jlevel(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 22 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 30 */     return "jlevel";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 34 */     super.evaluateExtraParams();
/*    */ 
/* 36 */     String levelName = "";
/*    */     try
/*    */     {
/* 42 */       Map map = new HashMap();
/*    */ 
/* 44 */       map.put("moduleLevel", findString(this.moduleId));
/* 45 */       C_T_Sys_ModuleLevelMapper mapper = (C_T_Sys_ModuleLevelMapper)BeanLocator.getService("c_T_Sys_ModuleLevelMapper");
/*    */ 
/* 47 */       List<C_T_Sys_ModuleLevel> list_C_T_Sys_ModuleLevel = mapper.selectByExample(map);
/*    */ 
/* 49 */       for (C_T_Sys_ModuleLevel c_T_Sys_ModuleLevel :  list_C_T_Sys_ModuleLevel)
/* 50 */         levelName = levelName + c_T_Sys_ModuleLevel.getModuleName() + " >> ";
/*    */     }
/*    */     catch (SecurityException e)
/*    */     {
/* 54 */       e.printStackTrace();
/*    */     }
/*    */     catch (IllegalArgumentException e) {
/* 57 */       e.printStackTrace();
/*    */     }
/* 59 */     if (!"".equals(levelName)) {
/* 60 */       levelName = levelName.substring(0, levelName.length() - 4);
/*    */     }
/*    */ 
/* 63 */     if (levelName != null)
/* 64 */       addParameter("levelName", levelName);
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="当前模块ID", type="String")
/*    */   public void setModuleId(String moduleId)
/*    */   {
/* 71 */     this.moduleId = moduleId;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jlevel
 * JD-Core Version:    0.6.0
 */