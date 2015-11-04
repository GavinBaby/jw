/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JtlTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = -4935824157231144079L;
/*    */   protected String maxlength;
/*    */   protected String readonly;
/*    */   protected String size;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 36 */     return new Jtl(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 40 */     super.populateParams();
/*    */ 
/* 42 */     Jtl jtl = (Jtl)this.component;
/* 43 */     jtl.setMaxlength(this.maxlength);
/* 44 */     jtl.setReadonly(this.readonly);
/* 45 */     jtl.setSize(this.size);
/* 46 */     jtl.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   /** @deprecated */
/*    */   public void setMaxLength(String maxlength)
/*    */   {
/* 53 */     this.maxlength = maxlength;
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 57 */     this.editCondition = editCondition;
/*    */   }
/*    */ 
/*    */   public void setMaxlength(String maxlength) {
/* 61 */     this.maxlength = maxlength;
/*    */   }
/*    */ 
/*    */   public void setReadonly(String readonly) {
/* 65 */     this.readonly = readonly;
/*    */   }
/*    */ 
/*    */   public void setSize(String size) {
/* 69 */     this.size = size;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JtlTag
 * JD-Core Version:    0.6.0
 */