/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.UIBean;
/*     */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*     */ 
/*     */ public class Jselect extends UIBean
/*     */ {
/*     */   protected String selRa;
/*     */   protected String selType;
/*     */   protected String editCondition;
/*     */   protected String isSglSel;
/*     */   protected String isLoadWay;
/*     */   protected String parUId;
/*     */   protected String parUname;
/*     */   protected String selUrlAtion;
/*     */ 
/*     */   public Jselect(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*     */   {
/*  15 */     super(stack, request, response);
/*     */   }
/*     */ 
/*     */   protected String getDefaultTemplate()
/*     */   {
/*  30 */     return "jselect";
/*     */   }
/*     */ 
/*     */   protected void evaluateExtraParams() {
/*  34 */     super.evaluateExtraParams();
/*     */ 
/*  36 */     if (this.selRa != null) {
/*  37 */       addParameter("selRa", findString(this.selRa));
/*     */     }
/*     */ 
/*  40 */     if (this.selType != null) {
/*  41 */       addParameter("selType", findString(this.selType));
/*     */     }
/*     */ 
/*  44 */     if (this.editCondition != null) {
/*  45 */       addParameter("editCondition", findString(this.editCondition));
/*     */     }
/*     */ 
/*  48 */     if (this.isSglSel != null) {
/*  49 */       addParameter("isSglSel", findString(this.isSglSel));
/*     */     }
/*     */ 
/*  52 */     if (this.isLoadWay != null) {
/*  53 */       addParameter("isLoadWay", findString(this.isLoadWay));
/*     */     }
/*     */ 
/*  56 */     if (this.parUId != null) {
/*  57 */       addParameter("parUId", findString(this.parUId));
/*     */     }
/*     */ 
/*  60 */     if (this.parUname != null) {
/*  61 */       addParameter("parUname", findString(this.parUname));
/*     */     }
/*     */ 
/*  64 */     if (this.selUrlAtion != null)
/*  65 */       addParameter("selUrlAtion", findString(this.selUrlAtion));
/*     */   }
/*     */ 
/*     */   @StrutsTagAttribute(description="是否可以编辑的条件", type="String")
/*     */   public void setEditCondition(String editCondition) {
/*  71 */     this.editCondition = editCondition;
/*     */   }
/*     */   @StrutsTagAttribute(description="选择范围", type="String")
/*     */   public void setSelRa(String selRa) {
/*  76 */     this.selRa = selRa;
/*     */   }
/*     */   @StrutsTagAttribute(description="选择类别", type="String")
/*     */   public void setSelType(String selType) {
/*  81 */     this.selType = selType;
/*     */   }
/*     */   @StrutsTagAttribute(description="单选或多选", type="String")
/*     */   public void setIsSglSel(String isSglSel) {
/*  86 */     this.isSglSel = isSglSel;
/*     */   }
/*     */   @StrutsTagAttribute(description="加载方式", type="String")
/*     */   public void setIsLoadWay(String isLoadWay) {
/*  91 */     this.isLoadWay = isLoadWay;
/*     */   }
/*     */   @StrutsTagAttribute(description="父窗体用户编号控件ID", type="String")
/*     */   public void setParUId(String parUId) {
/*  96 */     this.parUId = parUId;
/*     */   }
/*     */   @StrutsTagAttribute(description="父窗体用户名称控件ID", type="String")
/*     */   public void setParUname(String parUname) {
/* 101 */     this.parUname = parUname;
/*     */   }
/*     */   @StrutsTagAttribute(description="已选数据action", type="String")
/*     */   public void setSelUrlAtion(String selUrlAtion) {
/* 106 */     this.selUrlAtion = selUrlAtion;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jselect
 * JD-Core Version:    0.6.0
 */