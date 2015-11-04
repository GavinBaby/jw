/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.ListUIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTag;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ @StrutsTag(name="jcll", tldTagClass="com.jw.magicbpm.basecommon.ui.JcllTag", description="Render a list of checkboxes")
/*    */ public class Jcll extends ListUIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jcll";
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jcll(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 24 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate() {
/* 28 */     return "jcll";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 32 */     super.evaluateExtraParams();
/*    */ 
/* 34 */     if (this.editCondition != null)
/* 35 */       addParameter("editCondition", findString(this.editCondition));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 41 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jcll
 * JD-Core Version:    0.6.0
 */