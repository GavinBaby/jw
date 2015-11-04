/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.UIBean;
/*     */ import org.apache.struts2.views.annotations.StrutsTagAttribute;
/*     */ 
/*     */ public class Jnote extends UIBean
/*     */ {
/*     */   public static final String TEMPLATE = "jnote";
/*     */   protected String cols;
/*     */   protected String readonly;
/*     */   protected String rows;
/*     */   protected String wrap;
/*     */   protected String editCondition;
/*     */   protected String mouduleId;
/*     */   protected String mainId;
/*     */   protected String tacheId;
/*     */   protected String note;
/*     */   protected String noteall;
/*     */ 
/*     */   public Jnote(ValueStack stack, HttpServletRequest request, HttpServletResponse response)
/*     */   {
/*  38 */     super(stack, request, response);
/*     */   }
/*     */ 
/*     */   protected String getDefaultTemplate() {
/*  42 */     return "jnote";
/*     */   }
/*     */ 
/*     */   public void evaluateExtraParams() {
/*  46 */     super.evaluateExtraParams();
/*     */ 
/*  48 */     if (this.readonly != null) {
/*  49 */       addParameter("readonly", findValue(this.readonly, Boolean.class));
/*     */     }
/*     */ 
/*  52 */     if (this.cols != null) {
/*  53 */       addParameter("cols", findString(this.cols));
/*     */     }
/*     */ 
/*  56 */     if (this.rows != null) {
/*  57 */       addParameter("rows", findString(this.rows));
/*     */     }
/*     */ 
/*  60 */     if (this.wrap != null) {
/*  61 */       addParameter("wrap", findString(this.wrap));
/*     */     }
/*  63 */     if (this.editCondition != null) {
/*  64 */       addParameter("editCondition", findString(this.editCondition));
/*     */     }
/*     */ 
/*  68 */     if (this.mouduleId != null) {
/*  69 */       addParameter("mouduleId", findString(this.mouduleId));
/*     */     }
/*  71 */     if (this.mainId != null) {
/*  72 */       addParameter("mainId", findString(this.mainId));
/*     */     }
/*  74 */     if (this.tacheId != null) {
/*  75 */       addParameter("tacheId", findString(this.tacheId));
/*     */     }
/*     */ 
/*  80 */     if (this.note != null) {
/*  81 */       addParameter("note", findString(this.note));
/*     */     }
/*  83 */     if (this.noteall != null)
/*  84 */       addParameter("noteall", findString(this.noteall));
/*     */   }
/*     */ 
/*     */   @StrutsTagAttribute(description="HTML cols attribute", type="Integer")
/*     */   public void setCols(String cols)
/*     */   {
/*  91 */     this.cols = cols;
/*     */   }
/*     */   @StrutsTagAttribute(description="Whether the textarea is readonly", type="Boolean", defaultValue="false")
/*     */   public void setReadonly(String readonly) {
/*  96 */     this.readonly = readonly;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML rows attribute", type="Integer")
/*     */   public void setRows(String rows) {
/* 101 */     this.rows = rows;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML wrap attribute")
/*     */   public void setWrap(String wrap) {
/* 106 */     this.wrap = wrap;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML edit condition", type="String")
/*     */   public void setEditCondition(String editCondition) {
/* 111 */     this.editCondition = editCondition;
/*     */   }
/*     */ 
/*     */   @StrutsTagAttribute(description="HTML mouduleId", type="String")
/*     */   public void setMouduleId(String mouduleId) {
/* 117 */     this.mouduleId = mouduleId;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML mainId", type="String")
/*     */   public void setMainId(String mainId) {
/* 122 */     this.mainId = mainId;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML tacheId", type="String")
/*     */   public void setTacheId(String tacheId) {
/* 127 */     this.tacheId = tacheId;
/*     */   }
/*     */ 
/*     */   @StrutsTagAttribute(description="HTML note", type="String")
/*     */   public void setNote(String note)
/*     */   {
/* 137 */     this.note = note;
/*     */   }
/*     */   @StrutsTagAttribute(description="HTML noteall", type="String")
/*     */   public void setNoteAll(String noteall) {
/* 142 */     this.noteall = noteall;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.Jnote
 * JD-Core Version:    0.6.0
 */