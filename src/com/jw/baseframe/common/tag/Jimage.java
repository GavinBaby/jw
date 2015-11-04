/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ public class Jimage extends UIBean
/*    */ {
/*    */   protected String moduleId;
/*    */   protected String editCondition;
/*    */   protected String uploadId;
/*    */   protected String mainId;
/*    */   protected String imageW;
/*    */   protected String imageH;
/*    */ 
/*    */   public Jimage(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 15 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 34 */     return "jimage";
/*    */   }
/*    */ 
/*    */   protected void evaluateExtraParams() {
/* 38 */     super.evaluateExtraParams();
/*    */ 
/* 40 */     if (this.moduleId != null) {
/* 41 */       addParameter("moduleId", findString(this.moduleId));
/*    */     }
/*    */ 
/* 44 */     if (this.editCondition != null) {
/* 45 */       addParameter("editCondition", findString(this.editCondition));
/*    */     }
/*    */ 
/* 48 */     if (this.uploadId != null) {
/* 49 */       addParameter("uploadId", findString(this.uploadId));
/*    */     }
/*    */ 
/* 52 */     if (this.mainId != null) {
/* 53 */       addParameter("mainId", findString(this.mainId));
/*    */     }
/* 55 */     if (this.imageW != null) {
/* 56 */       addParameter("imageW", findString(this.imageW));
/*    */     }
/* 58 */     if (this.imageH != null)
/* 59 */       addParameter("imageH", findString(this.imageH));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="editCondition", type="String")
/*    */   public void setModuleId(String moduleId) {
/* 65 */     this.moduleId = moduleId;
/*    */   }
/*    */   @StrutsTagAttribute(description="是否可以编辑的条件", type="String")
/*    */   public void setEditCondition(String editCondition) {
/* 70 */     this.editCondition = editCondition;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传控件的ID", type="String")
/*    */   public void setUploadId(String uploadId) {
/* 75 */     this.uploadId = uploadId;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传控件的ID", type="String")
/*    */   public void setMainId(String mainId) {
/* 80 */     this.mainId = mainId;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传图片的宽度", type="String")
/*    */   public void setImageH(String imageH) {
/* 85 */     this.imageH = imageH;
/*    */   }
/*    */   @StrutsTagAttribute(description="上传图片的高度", type="String")
/*    */   public void setImageW(String imageW) {
/* 90 */     this.imageW = imageW;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jimage
 * JD-Core Version:    0.6.0
 */