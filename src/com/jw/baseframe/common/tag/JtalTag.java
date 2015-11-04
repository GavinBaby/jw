/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JtalTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = -2437611785679910932L;
/*    */   protected String cols;
/*    */   protected String readonly;
/*    */   protected String rows;
/*    */   protected String wrap;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 34 */     return new Jtal(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 38 */     super.populateParams();
/*    */ 
/* 40 */     Jtal jtal = (Jtal)this.component;
/* 41 */     jtal.setCols(this.cols);
/* 42 */     jtal.setReadonly(this.readonly);
/* 43 */     jtal.setRows(this.rows);
/* 44 */     jtal.setWrap(this.wrap);
/* 45 */     jtal.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   public void setCols(String cols) {
/* 49 */     this.cols = cols;
/*    */   }
/*    */ 
/*    */   public void setReadonly(String readonly) {
/* 53 */     this.readonly = readonly;
/*    */   }
/*    */ 
/*    */   public void setRows(String rows) {
/* 57 */     this.rows = rows;
/*    */   }
/*    */ 
/*    */   public void setWrap(String wrap) {
/* 61 */     this.wrap = wrap;
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 65 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JtalTag
 * JD-Core Version:    0.6.0
 */