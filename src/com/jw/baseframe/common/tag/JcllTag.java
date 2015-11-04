/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractRequiredListTag;
/*    */ 
/*    */ public class JcllTag extends AbstractRequiredListTag
/*    */ {
/*    */   private static final long serialVersionUID = -1928108964516016844L;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 33 */     return new Jcll(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 37 */     super.populateParams();
/*    */ 
/* 39 */     Jcll jcll = (Jcll)this.component;
/* 40 */     jcll.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 44 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JcllTag
 * JD-Core Version:    0.6.0
 */