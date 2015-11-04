/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.jw.baseframe.common.bean.BeanLocator;
/*     */ import com.jw.baseframe.common.session.SessionFactory;
/*     */ import com.jw.baseframe.dao.C_T_Sys_NoteMapper;
/*     */ import com.jw.baseframe.model.C_T_Sys_Note;
/*     */ import com.jw.baseframe.model.C_T_Sys_NoteExample;
/*     */ import com.jw.baseframe.model.C_T_Sys_NoteExample.Criteria;
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.Component;
/*     */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*     */ 
/*     */ public class JnoteTag extends AbstractUITag
/*     */ {
/*     */   private static final long serialVersionUID = 931689781440284710L;
/*  33 */   private C_T_Sys_NoteMapper mapper = (C_T_Sys_NoteMapper)BeanLocator.getService("c_T_Sys_NoteMapper");
/*     */   protected String cols;
/*     */   protected String readonly;
/*     */   protected String rows;
/*     */   protected String wrap;
/*     */   protected String editCondition;
/*     */   protected String mouduleId;
/*     */   protected String mainId;
/*     */   protected String tacheId;
/*     */ 
/*     */   public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res)
/*     */   {
/*  53 */     return new Jnote(stack, req, res);
/*     */   }
/*     */ 
/*     */   protected void populateParams() {
/*  57 */     super.populateParams();
/*     */ 
/*  59 */     String note = "";
/*  60 */     String noteall = "";
/*  61 */     List list_C_T_Sys_Note = null;
/*  62 */     List list_C_T_Sys_Note_all = null;
/*     */ 
/*  64 */     if (this.mouduleId == null)
/*  65 */       this.mouduleId = "";
/*  66 */     if (this.mainId == null)
/*  67 */       this.mainId = "";
/*  68 */     if (this.tacheId == null) {
/*  69 */       this.tacheId = "";
/*     */     }
/*     */ 
/*  72 */     C_T_Sys_NoteExample example = new C_T_Sys_NoteExample();
/*  73 */     example.or().andMainDocIdEqualTo(this.mainId)
/*  74 */       .andCurTacheIdEqualTo(this.tacheId).andFieldIdEqualTo(this.id)
/*  75 */       .andCreateUserEqualTo(SessionFactory.getSessionUserId());
/*     */     try {
/*  77 */       example.setOrderByClause("CREATE_TIME desc");
/*  78 */       list_C_T_Sys_Note = this.mapper.selectByExampleWithBLOBs(example);
/*     */ 
/*  80 */       example.clear();
/*  81 */       example.or().andMainDocIdEqualTo(
/*  82 */         this.mainId).andFieldIdEqualTo(this.id);
/*  83 */       example.setOrderByClause("CREATE_TIME asc");
/*  84 */       list_C_T_Sys_Note_all = this.mapper.selectByExampleWithBLOBs(example);
/*     */     }
/*     */     catch (SecurityException e) {
/*  87 */       e.printStackTrace();
/*     */     }
/*     */     catch (IllegalArgumentException e) {
/*  90 */       e.printStackTrace();
/*     */     }
/*     */ 
/*  93 */     if (list_C_T_Sys_Note.size() > 0) {
/*  94 */       C_T_Sys_Note sys_note = (C_T_Sys_Note)list_C_T_Sys_Note.get(0);
/*  95 */       note = sys_note.getNote();
/*     */     }
/*     */ 
/*  98 */     for (int i = 0; i < list_C_T_Sys_Note_all.size(); i++) {
/*  99 */       C_T_Sys_Note sys_note = (C_T_Sys_Note)list_C_T_Sys_Note_all.get(i);
/* 100 */       if (i == 0)
/* 101 */         noteall = sys_note.getNote();
/*     */       else
/* 103 */         noteall = noteall + "<br>" + sys_note.getNote();
/*     */     }
/* 105 */     if ((noteall == null) || (noteall.equals(""))) {
/* 106 */       noteall = "&nbsp;";
/*     */     }
/* 108 */     Jnote jnote = (Jnote)this.component;
/* 109 */     jnote.setCols(this.cols);
/* 110 */     jnote.setReadonly(this.readonly);
/* 111 */     jnote.setRows(this.rows);
/* 112 */     jnote.setWrap(this.wrap);
/* 113 */     jnote.setEditCondition(this.editCondition);
/* 114 */     jnote.setMouduleId(this.mouduleId);
/* 115 */     jnote.setMainId(this.mainId);
/* 116 */     jnote.setTacheId(this.tacheId);
/*     */ 
/* 118 */     jnote.setNote(note);
/* 119 */     jnote.setNoteAll(noteall);
/*     */   }
/*     */ 
/*     */   public void setCols(String cols) {
/* 123 */     this.cols = cols;
/*     */   }
/*     */ 
/*     */   public void setReadonly(String readonly) {
/* 127 */     this.readonly = readonly;
/*     */   }
/*     */ 
/*     */   public void setRows(String rows) {
/* 131 */     this.rows = rows;
/*     */   }
/*     */ 
/*     */   public void setWrap(String wrap) {
/* 135 */     this.wrap = wrap;
/*     */   }
/*     */ 
/*     */   public void setEditCondition(String editCondition) {
/* 139 */     this.editCondition = editCondition;
/*     */   }
/*     */ 
/*     */   public void setMouduleId(String mouduleId) {
/* 143 */     this.mouduleId = mouduleId;
/*     */   }
/*     */ 
/*     */   public void setMainId(String mainId) {
/* 147 */     this.mainId = mainId;
/*     */   }
/*     */ 
/*     */   public void setTacheId(String tacheId) {
/* 151 */     this.tacheId = tacheId;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JnoteTag
 * JD-Core Version:    0.6.0
 */