/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JimportTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = -150158053284865744L;
/*    */   protected String editCondition;
/*    */   protected String uploadId;
/*    */ 
/*    */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*    */   {
/* 28 */     return new Jimport(arg0, arg1, arg2);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 32 */     super.populateParams();
/* 33 */     this.uploadId = "";
/*    */ 
/* 35 */     Jimport jimport = (Jimport)this.component;
/* 36 */     jimport.setUploadId(this.uploadId);
/* 37 */     jimport.setEditCondition(this.editCondition);
/* 38 */     jimport.setId(this.id);
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 42 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JimportTag
 * JD-Core Version:    0.6.0
 */