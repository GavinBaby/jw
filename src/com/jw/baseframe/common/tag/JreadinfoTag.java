/*     */ package com.jw.baseframe.common.tag;
/*     */ 
/*     */ import com.jw.baseframe.common.bean.BeanLocator;
/*     */ import com.jw.baseframe.dao.C_T_Flow_History_Tache_InfoMapper;
/*     */ import com.jw.baseframe.model.C_T_Flow_History_Tache_InfoExample;
/*     */ import com.jw.baseframe.model.C_T_Flow_History_Tache_InfoExample.Criteria;
/*     */ import com.jw.baseframe.model.C_T_Flow_History_Tache_InfoWithBLOBs;
/*     */ import com.opensymphony.xwork2.util.ValueStack;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.struts2.components.Component;
/*     */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*     */ 
/*     */ public class JreadinfoTag extends AbstractUITag
/*     */ {
/*     */   private static final long serialVersionUID = 2893425931773864807L;
/*  25 */   private C_T_Flow_History_Tache_InfoMapper mapper = (C_T_Flow_History_Tache_InfoMapper)BeanLocator.getService("c_T_Flow_History_Tache_InfoMapper");
/*     */   protected String moduleId;
/*     */   protected String mainId;
/*     */   protected String readInfo;
/*     */   protected String isReaded;
/*     */   private List<C_T_Flow_History_Tache_InfoWithBLOBs> list_C_T_Flow_History_Tache_InfoWithBLOBs;
/*     */ 
/*     */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*     */   {
/*  42 */     return new Jreadinfo(arg0, arg1, arg2);
/*     */   }
/*     */ 
/*     */   protected void populateParams() {
/*  46 */     super.populateParams();
/*  47 */     this.mainId = (this.mainId == null ? "" : this.mainId);
/*  48 */     this.isReaded = (this.isReaded == null ? "1" : this.isReaded);
/*  49 */     this.readInfo = "";
/*  50 */     String tmpid = (String)getStack().findValue(this.id);
/*  51 */     if (tmpid != null)
/*  52 */       this.id = ((String)getStack().findValue(this.id));
/*  53 */     if (this.id == null) {
/*  54 */       this.id = "";
/*     */     }
/*  56 */     String tmModuleId = (String)getStack().findValue(this.moduleId);
/*     */ 
/*  58 */     if (tmModuleId != null)
/*  59 */       this.moduleId = ((String)getStack().findValue(this.moduleId));
/*  60 */     if (this.moduleId == null) {
/*  61 */       this.moduleId = "";
/*     */     }
/*     */ 
/*  65 */     if ((this.mainId != null) && 
/*  66 */       (!"".equals(this.mainId)))
/*     */     {
/*  68 */       C_T_Flow_History_Tache_InfoExample example = new C_T_Flow_History_Tache_InfoExample();
/*  69 */       example.or().andMainDocIdEqualTo(this.mainId);
/*     */       try {
/*  71 */         example.setOrderByClause("CREATE_TIME");
/*  72 */         this.list_C_T_Flow_History_Tache_InfoWithBLOBs = this.mapper
/*  73 */           .selectByExampleWithBLOBs(example);
/*     */       }
/*     */       catch (Exception e) {
/*  76 */         e.printStackTrace();
/*     */       }
/*     */ 
/*  80 */       int i = 0;
/*  81 */       for (; i < this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  81 */         .size(); i++) {
/*  82 */         if (i == 0)
/*  83 */           this.readInfo = 
/*  88 */             ((((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  84 */             .get(i)).getPasserReadedCh() == null ? "无" : 
/*  86 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  86 */             .get(i)).getPasserReadedCh()) + 
/*  87 */             "*" + (
/*  89 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  89 */             .get(i)).getPasserUnreadCh() == null ? 
/*  89 */             "无" : 
/*  91 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  91 */             .get(i)).getPasserUnreadCh()));
/*     */         else {
/*  93 */           this.readInfo = 
/*  99 */             (this.readInfo + "?" + (
/*  95 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  95 */             .get(i)).getPasserReadedCh() == null ? 
/*  95 */             "无" : 
/*  97 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/*  97 */             .get(i)).getPasserReadedCh()) + 
/*  98 */             "*" + (
/* 100 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/* 100 */             .get(i)).getPasserUnreadCh() == null ? 
/* 100 */             "无" : 
/* 102 */             ((C_T_Flow_History_Tache_InfoWithBLOBs)this.list_C_T_Flow_History_Tache_InfoWithBLOBs
/* 102 */             .get(i)).getPasserUnreadCh()));
/*     */         }
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 108 */     Jreadinfo jreadinfo = (Jreadinfo)this.component;
/* 109 */     jreadinfo.setModuleId(this.moduleId);
/* 110 */     jreadinfo.setMainId(this.mainId);
/* 111 */     jreadinfo.setReadInfo(this.readInfo);
/* 112 */     jreadinfo.setIsReaded(this.isReaded);
/* 113 */     jreadinfo.setId(this.id);
/*     */   }
/*     */ 
/*     */   public void setMainId(String mainId) {
/* 117 */     this.mainId = mainId;
/*     */   }
/*     */ 
/*     */   public void setModuleId(String moduleId) {
/* 121 */     this.moduleId = moduleId;
/*     */   }
/*     */ 
/*     */   public void setReadInfo(String readInfo) {
/* 125 */     this.readInfo = readInfo;
/*     */   }
/*     */ 
/*     */   public void setIsReaded(String isReaded) {
/* 129 */     this.isReaded = isReaded;
/*     */   }
/*     */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JreadinfoTag
 * JD-Core Version:    0.6.0
 */