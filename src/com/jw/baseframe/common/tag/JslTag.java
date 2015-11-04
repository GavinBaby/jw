/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractRequiredListTag;
/*    */ 
/*    */ public class JslTag extends AbstractRequiredListTag
/*    */ {
/*    */   private static final long serialVersionUID = 1551986091021956094L;
/*    */   protected String emptyOption;
/*    */   protected String headerKey;
/*    */   protected String headerValue;
/*    */   protected String multiple;
/*    */   protected String size;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 35 */     return new Jsl(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 39 */     super.populateParams();
/*    */ 
/* 41 */     Jsl jsl = (Jsl)this.component;
/* 42 */     jsl.setEmptyOption(this.emptyOption);
/* 43 */     jsl.setHeaderKey(this.headerKey);
/* 44 */     jsl.setHeaderValue(this.headerValue);
/* 45 */     jsl.setMultiple(this.multiple);
/* 46 */     jsl.setSize(this.size);
/* 47 */     jsl.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   public void setEmptyOption(String emptyOption) {
/* 51 */     this.emptyOption = emptyOption;
/*    */   }
/*    */ 
/*    */   public void setHeaderKey(String headerKey) {
/* 55 */     this.headerKey = headerKey;
/*    */   }
/*    */ 
/*    */   public void setHeaderValue(String headerValue) {
/* 59 */     this.headerValue = headerValue;
/*    */   }
/*    */ 
/*    */   public void setMultiple(String multiple) {
/* 63 */     this.multiple = multiple;
/*    */   }
/*    */ 
/*    */   public void setSize(String size) {
/* 67 */     this.size = size;
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 71 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JslTag
 * JD-Core Version:    0.6.0
 */