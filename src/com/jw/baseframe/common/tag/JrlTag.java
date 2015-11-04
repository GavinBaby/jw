/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractRequiredListTag;
/*    */ 
/*    */ public class JrlTag extends AbstractRequiredListTag
/*    */ {
/*    */   private static final long serialVersionUID = -2184081242587507279L;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 30 */     return new Jrl(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 34 */     super.populateParams();
/*    */ 
/* 36 */     Jrl jrl = (Jrl)this.component;
/* 37 */     jrl.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 41 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JrlTag
 * JD-Core Version:    0.6.0
 */