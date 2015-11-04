/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ public class Jtal extends UIBean
/*    */ {
/*    */   public static final String TEMPLATE = "jtal";
/*    */   protected String cols;
/*    */   protected String readonly;
/*    */   protected String rows;
/*    */   protected String wrap;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Jtal(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 25 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate() {
/* 29 */     return "jtal";
/*    */   }
/*    */ 
/*    */   public void evaluateExtraParams() {
/* 33 */     super.evaluateExtraParams();
/*    */ 
/* 35 */     if (this.readonly != null) {
/* 36 */       addParameter("readonly", findValue(this.readonly, Boolean.class));
/*    */     }
/*    */ 
/* 39 */     if (this.cols != null) {
/* 40 */       addParameter("cols", findString(this.cols));
/*    */     }
/*    */ 
/* 43 */     if (this.rows != null) {
/* 44 */       addParameter("rows", findString(this.rows));
/*    */     }
/*    */ 
/* 47 */     if (this.wrap != null) {
/* 48 */       addParameter("wrap", findString(this.wrap));
/*    */     }
/* 50 */     if (this.editCondition != null)
/* 51 */       addParameter("editCondition", findString(this.editCondition));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="HTML cols attribute", type="Integer")
/*    */   public void setCols(String cols)
/*    */   {
/* 64 */     this.cols = cols;
/*    */   }
/*    */   @StrutsTagAttribute(description="Whether the textarea is readonly", type="Boolean", defaultValue="false")
/*    */   public void setReadonly(String readonly) {
/* 69 */     this.readonly = readonly;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML rows attribute", type="Integer")
/*    */   public void setRows(String rows) {
/* 74 */     this.rows = rows;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML wrap attribute")
/*    */   public void setWrap(String wrap) {
/* 79 */     this.wrap = wrap;
/*    */   }
/*    */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 84 */     this.editCondition = editCondition;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jtal
 * JD-Core Version:    0.6.0
 */