/*    */ package com.jw.baseframe.common.tag;
/*    */ 
/*    */ import com.opensymphony.xwork2.util.ValueStack;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.struts2.components.Component;
/*    */ import org.apache.struts2.views.jsp.ui.AbstractUITag;
/*    */ 
/*    */ public class JtitleTag extends AbstractUITag
/*    */ {
/*    */   private static final long serialVersionUID = 8737312034725694677L;
/*    */ 
/*    */   public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2)
/*    */   {
/* 20 */     return new Jtitle(arg0, arg1, arg2);
/*    */   }
/*    */ }

/* Location:           F:\jgdgwoa\WebRoot\WEB-INF\lib\jw_oracle.jar
 * Qualified Name:     com.jw.baseframe.common.tag.JtitleTag
 * JD-Core Version:    0.6.0
 */