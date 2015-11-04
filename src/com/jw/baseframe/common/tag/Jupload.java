/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ public class Jupload extends UIBean
/*    */ {
/*    */   protected String moduleId;
/*    */   protected String editCondition;
/*    */   protected String uploadId;
/*    */   protected String mainId;
/*    */ 
/*    */   public Jupload(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 15 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 30 */     return "jupload";
/*    */   }
/*    */ 
/*    */   protected void evaluateExtraParams() {
/* 34 */     super.evaluateExtraParams();
/*    */ 
/* 36 */     if (this.moduleId != null) {
/* 37 */       addParameter("moduleId", findString(this.moduleId));
/*    */     }
/*    */ 
/* 40 */     if (this.editCondition != null) {
/* 41 */       addParameter("editCondition", findString(this.editCondition));
/*    */     }
/*    */ 
/* 44 */     if (this.uploadId != null) {
/* 45 */       addParameter("uploadId", findString(this.uploadId));
/*    */     }
/*    */ 
/* 48 */     if (this.mainId != null)
/* 49 */       addParameter("mainId", findString(this.mainId));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="editCondition", type="String")
/*    */   public void setModuleId(String moduleId) {
/* 55 */     this.moduleId = moduleId;
/*    */   }
/*    */   @StrutsTagAttribute(description="是否可以编辑的条件", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 60 */     this.editCondition = editCondition;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传控件的ID", type="String")
/*    */   public void setUploadId(String uploadId) {
/* 65 */     this.uploadId = uploadId;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传控件的ID", type="String")
/*    */   public void setMainId(String mainId) {
/* 70 */     this.mainId = mainId;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jupload
 * JD-Core Version:    0.6.0
 */