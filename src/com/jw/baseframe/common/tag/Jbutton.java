/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import com.opensymphony.xwork2.util.logging.Logger;
/*     */ import com.opensymphony.xwork2.util.logging.LoggerFactory;
/*     */ import java.io.Writer;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.FormButton;
/*     */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*     */ 
/*     */ public class Jbutton extends FormButton
/*     */ {
/*  16 */   private static final Logger LOG = LoggerFactory.getLogger(Jbutton.class);
/*     */   public static final String OPEN_TEMPLATE = "jbutton";
/*     */   public static final String TEMPLATE = "jbutton-close";
/*     */   protected String src;
/*     */   protected String editCondition;
/*     */   protected String specialConditions;
/*     */   protected String moduleId;
/*     */ 
/*     */   public Jbutton(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*     */   {
/*  29 */     super(stack, request, response);
/*     */   }
/*     */ 
/*     */   public String getDefaultOpenTemplate() {
/*  33 */     return "jbutton";
/*     */   }
/*     */ 
/*     */   protected String getDefaultTemplate() {
/*  37 */     return "jbutton-close";
/*     */   }
/*     */ 
/*     */   public void evaluateParams() {
/*  41 */     if ((this.key == null) && (this.value == null)) {
/*  42 */       this.value = "Submit";
/*     */     }
/*     */ 
/*  45 */     if ((this.key != null) && (this.value == null)) {
/*  46 */       this.value = ("%{getText('" + this.key + "')}");
/*     */     }
/*     */ 
/*  49 */     if (this.editCondition != null) {
/*  50 */       addParameter("editCondition", findString(this.editCondition));
/*     */     }
/*     */ 
/*  53 */     if (this.specialConditions != null) {
/*  54 */       addParameter("specialConditions", findString(this.specialConditions));
/*     */     }
/*     */ 
/*  57 */     if (this.moduleId != null) {
/*  58 */       addParameter("moduleId", this.moduleId);
/*     */     }
/*  60 */     super.evaluateParams();
/*     */   }
/*     */ 
/*     */   public void evaluateExtraParams() {
/*  64 */     super.evaluateExtraParams();
/*     */ 
/*  66 */     if (this.src != null)
/*  67 */       addParameter("src", findString(this.src));
/*     */   }
/*     */ 
/*     */   protected boolean supportsImageType()
/*     */   {
/*  76 */     return true;
/*     */   }
/*     */   @StrutsTagAttribute(description="Supply an image src for <i>image</i> type submit button. Will have no effect for types <i>input</i> and <i>button</i>.")
/*     */   public void setSrc(String src) {
/*  81 */     this.src = src;
/*     */   }
/*     */ 
/*     */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*     */   public void setEditCondition(String editCondition) {
/*  87 */     this.editCondition = editCondition;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*     */   public void setSpecialConditions(String specialConditions) {
/*  92 */     this.specialConditions = specialConditions;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*     */   public void setModuleId(String moduleId) {
/*  97 */     this.moduleId = moduleId;
/*     */   }
/*     */ 
/*     */   public boolean usesBody()
/*     */   {
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean end(Writer writer, String body)
/*     */   {
/* 109 */     evaluateParams();
/*     */     try {
/* 111 */       addParameter("body", body);
/*     */ 
/* 113 */       mergeTemplate(writer, buildTemplateName(this.template, getDefaultTemplate()));
/*     */     } catch (Exception e) {
/* 115 */       LOG.error("error when rendering", e, new String[0]);
/*     */     }
/*     */     finally {
/* 118 */       popComponentStack();
/*     */     }
/*     */ 
/* 121 */     return false;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jbutton
 * JD-Core Version:    0.6.0
 */