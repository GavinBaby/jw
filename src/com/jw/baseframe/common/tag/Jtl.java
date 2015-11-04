/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTag;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ @StrutsTag(name="jtl", tldTagClass="com.jw.magicbpm.basecommon.ui.JtlTag", description="Render an HTML input field of type text", allowDynamicAttributes=true)
/*    */ public class Jtl extends UIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jtl";
/*    */   protected String maxlength;
/*    */   protected String readonly;
/*    */   protected String size;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jtl(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 30 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate() {
/* 34 */     return "jtl";
/*    */   }
/*    */ 
/*    */   protected void evaluateExtraParams() {
/* 38 */     super.evaluateExtraParams();
/*    */ 
/* 40 */     if (this.size != null) {
/* 41 */       addParameter("size", findString(this.size));
/*    */     }
/*    */ 
/* 44 */     if (this.maxlength != null) {
/* 45 */       addParameter("maxlength", findString(this.maxlength));
/*    */     }
/*    */ 
/* 48 */     if (this.readonly != null) {
/* 49 */       addParameter("readonly", findValue(this.readonly, Boolean.class));
/*    */     }
/*    */ 
/* 52 */     if (this.editCondition != null) {
/* 53 */       addParameter("editCondition", findString(this.editCondition));
/*    */     }
/*    */ 
/* 56 */     this.onmouseover = "this.className='text4'";
/* 57 */     this.onmouseout = "this.className='text3'";
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML maxlength attribute", type="Integer")
/*    */   public void setMaxlength(String maxlength) {
/* 62 */     this.maxlength = maxlength;
/*    */   }
/*    */   @StrutsTagAttribute(description="Deprecated. Use maxlength instead.", type="Integer")
/*    */   public void setMaxLength(String maxlength) {
/* 67 */     this.maxlength = maxlength;
/*    */   }
/*    */   @StrutsTagAttribute(description="Whether the input is readonly", type="Boolean", defaultValue="false")
/*    */   public void setReadonly(String readonly) {
/* 72 */     this.readonly = readonly;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML size attribute", type="Integer")
/*    */   public void setSize(String size) {
/* 77 */     this.size = size;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 82 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jtl
 * JD-Core Version:    0.6.0
 */