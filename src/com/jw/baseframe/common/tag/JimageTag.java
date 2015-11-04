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
/*     */ public class JimageTag extends AbstractUITag
/*     */ {
/*     */   private static final long serialVersionUID = 844475655326310455L;
/*  25 */   private C_T_Sys_FileMapper mapper = (C_T_Sys_FileMapper)BeanLocator.getService("c_T_Sys_FileMapper");
/*     */   protected String moduleId;
/*     */   protected String editCondition;
/*     */   protected String uploadId;
/*     */   protected String mainId;
/*     */   protected String imageW;
/*     */   protected String imageH;
/*     */   private List<C_T_Sys_File> list_C_T_Sys_File;
/*     */ 
/*     */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*     */   {
/*  46 */     return new Jimage(arg0, arg1, arg2);
/*     */   }
/*     */ 
/*     */   protected void populateParams() {
/*  50 */     super.populateParams();
/*  51 */     this.mainId = ((String)getStack().findValue(this.mainId));
/*  52 */     if (this.mainId == null) {
/*  53 */       this.mainId = "";
/*     */     }
/*  55 */     this.uploadId = "";
/*     */ 
/*  57 */     String tmpid = (String)getStack().findValue(this.id);
/*  58 */     if (tmpid != null)
/*  59 */       this.id = ((String)getStack().findValue(this.id));
/*  60 */     if (this.id == null) {
/*  61 */       this.id = "";
/*     */     }
/*     */ 
/*  64 */     String tmModuleId = (String)getStack().findValue(this.moduleId);
/*     */ 
/*  66 */     if (tmModuleId != null)
/*  67 */       this.moduleId = ((String)getStack().findValue(this.moduleId));
/*  68 */     if (this.moduleId == null) {
/*  69 */       this.moduleId = "";
/*     */     }
/*     */ 
/*  72 */     String tmImageW = getStack().findValue(this.imageW).toString();
/*     */ 
/*  74 */     if (tmImageW != null)
/*  75 */       this.imageW = getStack().findValue(this.imageW).toString();
/*  76 */     if (this.imageW == null) {
/*  77 */       this.imageW = "295";
/*     */     }
/*     */ 
/*  80 */     String tmImageH = getStack().findValue(this.imageH).toString();
/*     */ 
/*  82 */     if (tmImageH != null)
/*  83 */       this.imageH = getStack().findValue(this.imageH).toString();
/*  84 */     if (this.imageH == null) {
/*  85 */       this.imageH = "413";
/*     */     }
/*     */ 
/*  89 */     if ((this.mainId != null) && 
/*  90 */       (!"".equals(this.mainId)))
/*     */     {
/*  92 */       C_T_Sys_FileExample example = new C_T_Sys_FileExample();
/*  93 */       example.or().andModuleIdEqualTo(this.moduleId).andFlgIdEqualTo(this.id)
/*  94 */         .andMainIdEqualTo(this.mainId);
/*     */       try {
/*  96 */         example.setOrderByClause("CREATE_TIME");
/*  97 */         this.list_C_T_Sys_File = this.mapper.selectByExample(example);
/*     */       }
/*     */       catch (SecurityException e) {
/* 100 */         e.printStackTrace();
/*     */       }
/*     */       catch (IllegalArgumentException e) {
/* 103 */         e.printStackTrace();
/*     */       }
/*     */ 
/* 107 */       for (int i = 0; i < this.list_C_T_Sys_File.size(); i++) {
/* 108 */         if (i == 0)
/* 109 */           this.uploadId = 
/* 111 */             (((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaePath() + 
/* 110 */             "/" + 
/* 111 */             ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaeName());
/*     */         else {
/* 113 */           this.uploadId = 
/* 116 */             (this.uploadId + "?" + 
/* 114 */             ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaePath() + 
/* 115 */             "/" + 
/* 116 */             ((C_T_Sys_File)this.list_C_T_Sys_File.get(i)).getFileSvaeName());
/*     */         }
/*     */       }
/* 119 */       this.uploadId = this.uploadId.replace("\\", "/");
/*     */     }
/*     */ 
/* 123 */     Jimage jimage = (Jimage)this.component;
/* 124 */     jimage.setUploadId(this.uploadId);
/* 125 */     jimage.setModuleId(this.moduleId);
/* 126 */     jimage.setEditCondition(this.editCondition);
/* 127 */     jimage.setMainId(this.mainId);
/* 128 */     jimage.setId(this.id);
/* 129 */     jimage.setImageW(this.imageW);
/* 130 */     jimage.setImageH(this.imageH);
/*     */   }
/*     */ 
/*     */   public void setMainId(String mainId) {
/* 134 */     this.mainId = mainId;
/*     */   }
/*     */ 
/*     */   public void setModuleId(String moduleId) {
/* 138 */     this.moduleId = moduleId;
/*     */   }
/*     */ 
/*     */   public void setEditCondition(String editCondition) {
/* 142 */     this.editCondition = editCondition;
/*     */   }
/*     */ 
/*     */   public void setImageW(String imageW) {
/* 146 */     this.imageW = imageW;
/*     */   }
/*     */ 
/*     */   public void setImageH(String imageH) {
/* 150 */     this.imageH = imageH;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JimageTag
 * JD-Core Version:    0.6.0
 */