/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.UIBean;
/*    */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*    */ 
/*    */ public class Jreadinfo extends UIBean
/*    */ {
/*    */   protected String moduleId;
/*    */   protected String mainId;
/*    */   protected String readInfo;
/*    */   protected String isReaded;
/*    */ 
/*    */   public Jreadinfo(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*    */   {
/* 15 */     super(stack, request, response);
/*    */   }
/*    */ 
/*    */   protected String getDefaultTemplate()
/*    */   {
/* 30 */     return "jreadinfo";
/*    */   }
/*    */ 
/*    */   protected void evaluateExtraParams() {
/* 34 */     super.evaluateExtraParams();
/*    */ 
/* 36 */     if (this.moduleId != null) {
/* 37 */       addParameter("moduleId", findString(this.moduleId));
/*    */     }
/*    */ 
/* 40 */     if (this.mainId != null) {
/* 41 */       addParameter("mainId", findString(this.mainId));
/*    */     }
/*    */ 
/* 45 */     if (this.readInfo != null) {
/* 46 */       addParameter("readInfo", findString(this.readInfo));
/*    */     }
/*    */ 
/* 49 */     if (this.isReaded != null)
/* 50 */       addParameter("isReaded", findString(this.isReaded));
/*    */   }
/*    */ 
/*    */   @StrutsTagAttribute(description="editCondition", type="String")
/*    */   public void setModuleId(String moduleId) {
/* 56 */     this.moduleId = moduleId;
/*    */   }
/*    */   @StrutsTagAttribute(description="主文档ID", type="String")
/*    */   public void setMainId(String mainId) {
/* 61 */     this.mainId = mainId;
/*    */   }
/*    */   @StrutsTagAttribute(description="详细信息", type="String")
/*    */   public void setReadInfo(String readInfo) {
/* 66 */     this.readInfo = readInfo;
/*    */   }
/*    */   @StrutsTagAttribute(description="已阅未阅标志", type="String")
/*    */   public void setIsReaded(String isReaded) {
/* 71 */     this.isReaded = isReaded;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jreadinfo
 * JD-Core Version:    0.6.0
 */