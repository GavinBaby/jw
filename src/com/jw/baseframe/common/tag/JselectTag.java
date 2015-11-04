/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JselectTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = -4935824157231144079L;
/*    */   protected String selRa;
/*    */   protected String selType;
/*    */   protected String isSglSel;
/*    */   protected String isLoadWay;
/*    */   protected String parUId;
/*    */   protected String parUname;
/*    */   protected String selUrlAtion;
/*    */   protected String editCondition;
/*    */ 
/*    */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*    */   {
/* 37 */     return new Jselect(stack, req, res);
/*    */   }
/*    */ 
/*    */   protected void populateParams() {
/* 41 */     super.populateParams();
/*    */ 
/* 43 */     Jselect jselect = (Jselect)this.component;
/* 44 */     jselect.setSelRa(this.selRa);
/* 45 */     jselect.setSelType(this.selType);
/* 46 */     jselect.setIsSglSel(this.isSglSel);
/* 47 */     jselect.setIsLoadWay(this.isLoadWay);
/* 48 */     jselect.setParUId(this.parUId);
/* 49 */     jselect.setParUname(this.parUname);
/* 50 */     jselect.setSelUrlAtion(this.selUrlAtion);
/* 51 */     jselect.setEditCondition(this.editCondition);
/*    */   }
/*    */ 
/*    */   /** @deprecated */
/*    */   public void setEditCondition(String editCondition)
/*    */   {
/* 58 */     this.editCondition = editCondition;
/*    */   }
/*    */ 
/*    */   public void setSelRa(String selRa) {
/* 62 */     this.selRa = selRa;
/*    */   }
/*    */ 
/*    */   public void setSelType(String selType) {
/* 66 */     this.selType = selType;
/*    */   }
/*    */ 
/*    */   public void setIsSglSel(String isSglSel) {
/* 70 */     this.isSglSel = isSglSel;
/*    */   }
/*    */ 
/*    */   public void setIsLoadWay(String isLoadWay) {
/* 74 */     this.isLoadWay = isLoadWay;
/*    */   }
/*    */ 
/*    */   public void setParUId(String parUId) {
/* 78 */     this.parUId = parUId;
/*    */   }
/*    */ 
/*    */   public void setParUname(String parUname) {
/* 82 */     this.parUname = parUname;
/*    */   }
/*    */ 
/*    */   public void setSelUrlAtion(String selUrlAtion) {
/* 86 */     this.selUrlAtion = selUrlAtion;
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JselectTag
 * JD-Core Version:    0.6.0
 */