/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTag;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ @StrutsTag(name="jcl", tldTagClass="com.jw.magicbpm.basecommon.ui.JclTag", description="Render a checkbox input field", allowDynamicAttributes=true)
/*    */ public class Jcl extends UIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jcl";
/*    */   protected String fieldValue;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jcl(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 27 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 34 */     return "jcl";
/*    */   }
/*    */ 
/*    */   protected void evaluateExtraParams() {
/* 38 */     if (this.fieldValue != null)
/* 39 */       addParameter("fieldValue", findString(this.fieldValue));
/*    */     else {
/* 41 */       addParameter("fieldValue", "true");
/*    */     }
/*    */ 
/* 44 */     if (this.editCondition != null)
/* 45 */       addParameter("editCondition", findString(this.editCondition));
/*    */   }
/*    */ 
/*    */   protected Class getValueClassType()
/*    */   {
/* 50 */     return Boolean.class;
/*    */   }
/*    */   @StrutsTagAttribute(description="The actual HTML value attribute of the checkbox.", defaultValue="true")
/*    */   public void setFieldValue(String fieldValue) {
/* 55 */     this.fieldValue = fieldValue;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 60 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jcl
 * JD-Core Version:    0.6.0
 */