/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.ListUIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTag;
/*    */ 
/*    */ @StrutsTag(name="jrl", tldTagClass="com.jw.magicbpm.basecommon.ui.JrlTag", description="Renders a radio button input field")
/*    */ public class Jrl extends ListUIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jrl";
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jrl(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 22 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams()
/*    */   {
/* 27 */     if (this.editCondition != null)
/* 28 */       addParameter("editCondition", findString(this.editCondition));
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 33 */     return "jrl";
/*    */   }
/*    */ 
/*    */   public void setEditCondition(String editCondition) {
/* 37 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jrl
 * JD-Core Version:    0.6.0
 */