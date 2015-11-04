/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.jw.baseframe.common.bean.BeanLocator;
/*     */ import com.jw.baseframe.dao.C_T_Sys_FileMapper;
/*     */ import com.jw.baseframe.model.C_T_Sys_File;
/*     */ import com.jw.baseframe.model.C_T_Sys_FileExample;
/*     */ import com.jw.baseframe.model.C_T_Sys_FileExample.Criteria;
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.Component;
/*     */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*     */ 
/*     */ public class JuploadTag extends AbstractUITag
/*     */ {
/*     */   private static final long serialVersionUID = -2298220796500916001L;
/*  25 */   private C_T_Sys_FileMapper mapper = (C_T_Sys_FileMapper)BeanLocator.getService("c_T_Sys_FileMapper");
/*     */   protected String moduleId;
/*     */   protected String editCondition;
/*     */   protected String uploadId;
/*     */   protected String mainId;
/*     */   private List<C_T_Sys_File> list_C_T_Sys_File;
/*     */ 
/*     */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*     */   {
/*  42 */     return new Jupload(arg0, arg1, arg2);
/*     */   }
/*     */ 
/*     */   protected void populateParams() {
/*  46 */     super.populateParams();
/*  47 */     this.mainId = ((String)getStack().findValue(this.mainId));
/*  48 */     if (this.mainId == null) {
/*  49 */       this.mainId = "";
/*     */     }
/*  51 */     this.uploadId = "";
/*     */ 
/*  54 */     String tmpid = (String)getStack().findValue(this.id);
/*  55 */     if (tmpid != null)
/*  56 */       this.id = ((String)getStack().findValue(this.id));
/*  57 */     if (this.id == null) {
/*  58 */       this.id = "";
/*     */     }
/*     */ 
/*  61 */     String tmModuleId = (String)getStack().findValue(this.moduleId);
/*     */ 
/*  63 */     if (tmModuleId != null)
/*  64 */       this.moduleId = ((String)getStack().findValue(this.moduleId));
/*  65 */     if (this.moduleId == null) {
/*  66 */       this.moduleId = "";
/*     */     }
/*     */ 
/*  70 */     if ((this.mainId != null) && 
/*  71 */       (!"".equals(this.mainId)))
/*     */     {
/*  73 */       C_T_Sys_FileExample example = new C_T_Sys_FileExample();
/*  74 */       example.or().andModuleIdEqualTo(this.moduleId).andFlgIdEqualTo(this.id)
/*  75 */         .andMainIdEqualTo(this.mainId);
/*     */       try {
/*  77 */         example.setOrderByClause("CREATE_TIME");
/*  78 */         this.list_C_T_Sys_File = this.mapper.selectByExample(example);
/*     */       }
/*     */       catch (SecurityException e)
/*     */       {
/*  82 */         e.printStackTrace();
/*     */       }
/*     */       catch (IllegalArgumentException e) {
/*  85 */         e.printStackTrace();
/*     */       }
/*     */ 
/*  89 */       for (int i = 0; i < this.list_C_T_Sys_File.size(); i++) {
/*  90 */         if (i == 0)
/*  91 */           this.uploadId = 
/*  92 */             (((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaeName() + 
/*  92 */             "*" + ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileName());
/*     */         else {
/*  94 */           this.uploadId = 
/*  96 */             (this.uploadId + "?" + 
/*  95 */             ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaeName() + 
/*  96 */             "*" + ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileName());
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 102 */     Jupload jupload = (Jupload)this.component;
/* 103 */     jupload.setUploadId(this.uploadId);
/* 104 */     jupload.setModuleId(this.moduleId);
/* 105 */     jupload.setEditCondition(this.editCondition);
/* 106 */     jupload.setMainId(this.mainId);
/* 107 */     jupload.setId(this.id);
/*     */   }
/*     */ 
/*     */   public void setMainId(String mainId) {
/* 111 */     this.mainId = mainId;
/*     */   }
/*     */ 
/*     */   public void setModuleId(String moduleId) {
/* 115 */     this.moduleId = moduleId;
/*     */   }
/*     */ 
/*     */   public void setEditCondition(String editCondition) {
/* 119 */     this.editCondition = editCondition;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JuploadTag
 * JD-Core Version:    0.6.0
 */