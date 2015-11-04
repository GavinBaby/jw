/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JlevelTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = -4157133837204369197L;
/*    */   protected String moduleId;
/*    */ 
/*    */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*    */   {
/* 25 */     return new Jlevel(arg0, arg1, arg2);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 29 */     super.populateParams();
/*    */ 
/* 31 */     Jlevel jlevel = (Jlevel)this.component;
/* 32 */     jlevel.setModuleId(this.moduleId);
/*    */   }
/*    */   @StrutsTagAttribute(description="当前模块ID", type="String")
/*    */   public void setModuleId(String moduleId) {
/* 37 */     this.moduleId = moduleId;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JlevelTag
 * JD-Core Version:    0.6.0
 */