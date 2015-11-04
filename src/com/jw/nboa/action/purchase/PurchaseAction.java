package com.jw.nboa.action.purchase;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.bind.annotation.RequestBody;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.model.C_T_Sys_Maintain;
import com.jw.baseframe.model.C_T_Sys_PhraseExample;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.JsonTools;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.dao.personalaffairs.B_T_Ufp_Person_ActivityMapper;
import com.jw.magicbpm.dao.personalaffairs.B_V_Ufp_Person_ActivityMapper;
import com.jw.magicbpm.model.personalaffairs.B_T_Ufp_Person_ActivityExample;
import com.jw.magicbpm.model.personalaffairs.B_V_Ufp_Person_ActivityExample;
import com.jw.nboa.dao.purchase.P_InfoMapper;
import com.jw.nboa.dao.purchase.P_Info_DetailMapper;
import com.jw.nboa.model.purchase.P_Info;
import com.jw.nboa.model.purchase.P_InfoExample;
import com.jw.nboa.model.purchase.P_Info_Detail;
import com.jw.nboa.model.purchase.P_Info_DetailExample;
import com.opensymphony.xwork2.ActionContext;

public class PurchaseAction extends JwBaseAction implements JwBaseActionI {
	
	@Resource
	private P_Info_DetailMapper detail_mapper;
	@Resource
	private P_InfoMapper info_mapper;
	
	private List<P_Info_Detail> detail_list;
	private List<P_Info> info_list;
 
	private P_Info p_Info =new P_Info();

	@Override
	public String detailsDelete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String detailsLoad() throws Exception {
		// TODO Auto-generated method stub
//		 this.p_Info = this.info_mapper.(this.mainDocId);
//		 /*     */ 
//		 /*  59 */     this.selectModuleJson = DbOperationFation.getSelectDataForJson(
//		 /*  60 */       "C_T_SYS_MODULE", "PAREN_MODULE", "MODULE_ID", "MODULE_NAME", 
//		 /*  61 */       "IS_DELETE = 0");
		 /*     */ 
		 /*  63 */     return "success";
//		return null;
	}
	
	@Override
	public String detailsUpdate() throws Exception {
		// TODO Auto-generated method stub
		Map params = (Map)ActionContext.getContext().getParameters() ;
		
		  Set set = params.keySet();
		  String param =set.toArray()[0].toString();
		  Map object =JsonTools.getMapFromJson(param) ;
		  String lists = ((Map)object.get("data")).get("lists").toString();
		  JSONArray array= JSONArray.fromObject(lists) ;
		  
		   
	  
		  List list =  JsonTools.getDTOList(array.toString(), P_Info_Detail.class);
		  ((Map)object.get("data")).remove("lists");
		  String info =  object.get("data").toString() ;
		  p_Info=(P_Info)JsonTools.getDTO(info, P_Info.class);
		
		  String uuid = new GUID().toString();
		  p_Info.setUuid(uuid);
		info_mapper.insert(this.p_Info);
		for(int i=0;i<list.size();i++){
			P_Info_Detail a = (P_Info_Detail)list.get(i);
			a.setpId(uuid);
			detail_mapper.insert(a);
		}
//		List lists =JsonTools.getDTOList(map.get("lists").toString(), P_Info_Detail.class);  
//		map.remove("lists");
//		
//		map.put("uuid", uuid);
//		Object info = JsonTools.getDTO(map.toString(),P_Info.class);
		String returnMsg = "";
//		info_mapper.insert((P_Info)info);
		returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		sucessMessage(returnMsg);
		return SUCCESS;
	}

	@Override
	public String gridLoad() throws Exception {
		// TODO Auto-generated method stub
			/* 105 */     P_InfoExample example = null;
			/* 106 */     P_InfoExample.Criteria criteria = null;
			/*     */     try
			/*     */     {
			/* 110 */       example = new P_InfoExample();
			/* 111 */       criteria = example.createCriteria();
			/* 127 */       this.total = this.info_mapper.countByExample(example);
			/* 130 */       criteria.setLimitValue(getRowStart(), getRowEnd());
			/* 135 */       example.or(criteria);
			/* 138 */       this.result = CommonLogic.getResult(this.total, this.info_mapper
			/* 139 */         .selectByExample(example));
			/*     */     }
			/*     */     catch (Exception e) {
			/* 142 */       throw e;
			/*     */     }
			/*     */     finally {
			/* 145 */       criteria = null;
			/* 146 */       example = null;
			/*     */     }
			/* 148 */     return "success";
			/*     */   }

	@Override
	public String listLoad() throws Exception {
		// TODO Auto-generated method stub
//		P_Info_DetailExample p_info_detailexample = null;
//		P_InfoExample p_infoexample = null;
//		SimpleDateFormat sdf = null;
//		try {
//			example = new B_V_Ufp_Person_ActivityExample();
//			exampleT = new B_T_Ufp_Person_ActivityExample();
//		
		return SUCCESS;
	}

	public List<P_Info_Detail> getDetail_list() {
		return detail_list;
	}

	public void setDetail_list(List<P_Info_Detail> detailList) {
		detail_list = detailList;
	}

	public List<P_Info> getInfo_list() {
		return info_list;
	}

	public void setInfo_list(List<P_Info> infoList) {
		info_list = infoList;
	}

	public P_Info getP_Info() {
		return p_Info;
	}

	public void setP_Info(P_Info pInfo) {
		p_Info = pInfo;
	}

 
	

	
}
