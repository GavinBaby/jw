/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JclTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = 4294977985551067491L;
/*    */   protected String fieldValue;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 33 */     return new Jcl(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 37 */     super.populateParams();
/*    */ 
/* 39 */     Jcl jcl = (Jcl)this.component;
/* 40 */     jcl.setFieldValue(this.fieldValue);
/* 41 */     jcl.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   public void setFieldValue(String aValue) {
/* 45 */     this.fieldValue = aValue;
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 49 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JclTag
 * JD-Core Version:    0.6.0
 */