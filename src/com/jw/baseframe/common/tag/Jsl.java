/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.ListUIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTag;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ @StrutsTag(name="jsl", tldTagClass="com.jw.magicbpm.basecommon.ui.JslTag", description="Render a select element", allowDynamicAttributes=true)
/*    */ public class Jsl extends ListUIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jsl";
/*    */   protected String emptyOption;
/*    */   protected String headerKey;
/*    */   protected String headerValue;
/*    */   protected String multiple;
/*    */   protected String size;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jsl(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 31 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate() {
/* 35 */     return "jsl";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 39 */     super.evaluateExtraParams();
/*    */ 
/* 41 */     if (this.emptyOption != null) {
/* 42 */       addParameter("emptyOption", findValue(this.emptyOption, Boolean.class));
/*    */     }
/*    */ 
/* 45 */     if (this.multiple != null) {
/* 46 */       addParameter("multiple", findValue(this.multiple, Boolean.class));
/*    */     }
/*    */ 
/* 49 */     if (this.size != null) {
/* 50 */       addParameter("size", findString(this.size));
/*    */     }
/*    */ 
/* 53 */     if ((this.headerKey != null) && (this.headerValue != null)) {
/* 54 */       addParameter("headerKey", findString(this.headerKey));
/* 55 */       addParameter("headerValue", findString(this.headerValue));
/*    */     }
/*    */ 
/* 58 */     if (this.editCondition != null)
/* 59 */       addParameter("editCondition", findString(this.editCondition));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="Whether or not to add an empty (--) option after the header option", type="Boolean", defaultValue="false")
/*    */   public void setEmptyOption(String emptyOption) {
/* 65 */     this.emptyOption = emptyOption;
/*    */   }
/*    */   @StrutsTagAttribute(description=" Key for first item in list. Must not be empty! '-1' and '' is correct, '' is bad.")
/*    */   public void setHeaderKey(String headerKey) {
/* 70 */     this.headerKey = headerKey;
/*    */   }
/*    */   @StrutsTagAttribute(description="Value expression for first item in list")
/*    */   public void setHeaderValue(String headerValue) {
/* 75 */     this.headerValue = headerValue;
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description=" Creates a multiple select. The tag will pre-select multiple values if the values are passed as an Array or a Collection(of appropriate types) via the value attribute. If one of the keys equals one of the values in the Collection or Array it wil be selected", type="Boolean", defaultValue="false")
/*    */   public void setMultiple(String multiple)
/*    */   {
/* 82 */     this.multiple = multiple;
/*    */   }
/*    */   @StrutsTagAttribute(description="Size of the element box (# of elements to show)", type="Integer")
/*    */   public void setSize(String size) {
/* 87 */     this.size = size;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 92 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jsl
 * JD-Core Version:    0.6.0
 */