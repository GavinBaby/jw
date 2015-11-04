/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import javax.servlet.jsp.JspException;
/*     */ import org.apache.struts2.components.Component;
/*     */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*     */ 
/*     */ public class JbuttonTag extends AbstractUITag
/*     */ {
/*     */   private static final long serialVersionUID = 566398691691721880L;
/*  18 */   private boolean isAccess = false;
/*     */   protected String action;
/*     */   protected String method;
/*     */   protected String align;
/*     */   protected String type;
/*     */   protected String src;
/*     */   protected String editCondition;
/*     */   protected String specialConditions;
/*     */   protected String moduleId;
/*     */ 
/*     */   public int doEndTag()
/*     */     throws JspException
/*     */   {
/*  34 */     if (this.isAccess) {
/*  35 */       return 0;
/*     */     }
/*  37 */     return super.doEndTag();
/*     */   }
/*     */ 
/*     */   public int doStartTag() throws JspException
/*     */   {
/*  42 */     if (this.editCondition != null)
/*     */     {
/*  44 */       this.editCondition = findString(this.editCondition);
/*     */     }
/*  46 */     if (this.specialConditions != null)
/*     */     {
/*  48 */       this.specialConditions = ("%{" + findString(this.specialConditions) + "}");
/*     */     }
/*     */ 
/*  54 */     if (("*".equals(this.editCondition)) || (this.editCondition.indexOf(this.id + ",") >= 0)) {
/*  55 */       this.isAccess = false;
/*     */     }
/*     */     else
/*     */     {
/*  59 */       this.isAccess = true;
/*     */     }
/*  61 */     if (this.isAccess) {
/*  62 */       return 0;
/*     */     }
/*     */ 
/*  65 */     return super.doStartTag();
/*     */   }
/*     */ 
/*     */   protected void populateParams()
/*     */   {
/*  70 */     super.populateParams();
/*     */ 
/*  72 */     Jbutton jbutton = (Jbutton)this.component;
/*  73 */     jbutton.setAction(this.action);
/*  74 */     jbutton.setMethod(this.method);
/*  75 */     jbutton.setAlign(this.align);
/*  76 */     jbutton.setType(this.type);
/*  77 */     jbutton.setSrc(this.src);
/*  78 */     jbutton.setEditCondition(this.editCondition);
/*  79 */     jbutton.setSpecialConditions(this.specialConditions);
/*  80 */     jbutton.setModuleId(this.moduleId);
/*     */   }
/*     */ 
/*     */   public void setModuleId(String moduleId) {
/*  84 */     this.moduleId = moduleId;
/*     */   }
/*     */ 
/*     */   public void setEditCondition(String editCondition) {
/*  88 */     this.editCondition = editCondition;
/*     */   }
/*     */ 
/*     */   public void setAction(String action) {
/*  92 */     this.action = action;
/*     */   }
/*     */ 
/*     */   public void setMethod(String method) {
/*  96 */     this.method = method;
/*     */   }
/*     */ 
/*     */   public void setAlign(String align) {
/* 100 */     this.align = align;
/*     */   }
/*     */ 
/*     */   public String getType() {
/* 104 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String type) {
/* 108 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public void setSrc(String src) {
/* 112 */     this.src = src;
/*     */   }
/*     */ 
/*     */   public void setSpecialConditions(String specialConditions) {
/* 116 */     this.specialConditions = specialConditions;
/*     */   }
/*     */ 
/*     */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*     */   {
/* 122 */     return new Jbutton(stack, req, res);
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JbuttonTag
 * JD-Core Version:    0.6.0
 */