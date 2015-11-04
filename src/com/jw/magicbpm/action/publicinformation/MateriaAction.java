package com.jw.magicbpm.action.publicinformation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.action.baseintface.JwBaseFlowAction;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.logic.FileIdUpdata;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_MateriaMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Materia_ClassMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Ufp_MateriaMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_MateriaWithBLOBs;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_Class;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Materia_ClassExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_MateriaExample;

public class MateriaAction extends JwBaseFlowAction implements JwBaseActionI {

	/**
	 * 资料管理action
	 */
	private static final long serialVersionUID = 1L;
	//模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MATERIA;
	//资料管理详细信息
	private B_T_Ufp_MateriaWithBLOBs b_T_Ufp_MateriaWithBLOBs;
	//资料管理类别列表
	private List<B_T_Ufp_Materia_Class> list_B_T_Ufp_Materia_Class;
	//资料管理类别树
	private List<B_T_Ufp_Materia_Class> listMateriagetTypeTree;
	//权限
	private String allPermission;
	//是否审批1:上传0：未上传或撤消
	private String type;
	//查询条件标题
	private String materiaTitle;
	//登记开始时间
	private String startTime;
	//登记结束时间
	private String endTime;
	//导航1：公共0:自己
	private String flagtype;
	//所属资料类别
	private String typeid;
	@Resource
	B_T_Ufp_MateriaMapper mapperMT;
	@Resource
	B_T_Ufp_Materia_ClassMapper mapperMCT;
	@Resource
	B_V_Ufp_MateriaMapper mapperMV;
	/**
	 * 删除数据
	 */
	public String detailsDelete() throws Exception{
		DbOperationFation.deleteByExample("B_T_Ufp_Materia", checkedIds,
				moduleId);
		deleteDocFlowInfor();
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * 详细画面加载
	 * 
	 */
	public String detailsLoad() throws Exception{
		B_T_Ufp_Materia_ClassExample exampleClass = null;
		allPermission="*";
			
		if (StringTools.isNullOrNoValue(mainDocId)) {
			b_T_Ufp_MateriaWithBLOBs = new B_T_Ufp_MateriaWithBLOBs();
			b_T_Ufp_MateriaWithBLOBs.setMateriaAuthor(SessionFactory.getSessionUserNm());
			b_T_Ufp_MateriaWithBLOBs.setMateriaIscheck(0);
			allPermission=",save,upsave,materiaTitle,materiaPlace,materiaDetails,materiaDownname,selUploadUser,materiaClass,upload1,materiaRemark,";
		} else {
			b_T_Ufp_MateriaWithBLOBs = mapperMT.selectByPrimaryKey(mainDocId);
			//资料查看编辑权限
			if(b_T_Ufp_MateriaWithBLOBs.getCreateUser().equals(SessionFactory.getSessionUserId())&&b_T_Ufp_MateriaWithBLOBs.getMateriaIscheck()==0){
				allPermission=",save,upsave,materiaTitle,materiaPlace,materiaDetails,materiaDownname,selUploadUser,materiaClass,upload1,materiaRemark,";
			}
			else if(b_T_Ufp_MateriaWithBLOBs.getCreateUser().equals(SessionFactory.getSessionUserId())&&b_T_Ufp_MateriaWithBLOBs.getMateriaIscheck()==1){
				allPermission=",cancel,";
			}
			else{
				allPermission="#";	
			}
			// 取得更新时间	
			getDocUpdateTime("B_T_Ufp_Materia");	
		}
		exampleClass = new B_T_Ufp_Materia_ClassExample();

		if("1".equals(flagtype)){//公共资料不能编辑 显示类别
			exampleClass.or();
			exampleClass.setOrderByClause("sort");
			allPermission="#";	
		}else{
			exampleClass.or().andUploadpermitLike("%"+SessionFactory.getSessionUserId()+"%").andIsDeleteEqualTo(0);
			exampleClass.setOrderByClause("sort");
		}
		list_B_T_Ufp_Materia_Class = mapperMCT.selectByExample(exampleClass);

		return SUCCESS;
	}

	
	/**
	 * 更新/新增数据
	 */
	public String detailsUpdate() throws Exception{
		String returnMsg = "";

		if (StringTools.isNullOrNoValue(mainDocId)){
			String uuid = new GUID().toString();
			b_T_Ufp_MateriaWithBLOBs.setUuid(uuid);
			b_T_Ufp_MateriaWithBLOBs.setMateriaIscheck(Integer.parseInt(type));
			if(type.equals("1")){
				b_T_Ufp_MateriaWithBLOBs.setMateriaTime(DateTools.getServerDateTime(9));
			}
			mapperMT.insertSelective(b_T_Ufp_MateriaWithBLOBs);
			
			//更新附件表的主文档ID
			FileIdUpdata.Updata(newFileIds,uuid);
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		}else
		{
			//判断是否有人编辑过
			if (isDocUpdated("b_t_ufp_materia")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				b_T_Ufp_MateriaWithBLOBs.setMateriaIscheck(Integer.parseInt(type));
				//是否上传
				if(type.equals("1")){
					b_T_Ufp_MateriaWithBLOBs.setMateriaTime(DateTools.getServerDateTime(9));
				}else{
					b_T_Ufp_MateriaWithBLOBs.setMateriaTime("");
				}
				mapperMT.updateByPrimaryKeySelective(b_T_Ufp_MateriaWithBLOBs);
				returnMsg=Constants.UPDATE_SUCCESSFUL_MSG;
			}
		}
		sucessMessage(returnMsg);

		return SUCCESS;
	}
	
	/**
	 * 列表画面加载
	 */
	public String listLoad() {

		return SUCCESS;
	}
		
	/**
	 * Grid数据加载
	 */
	public String gridLoad() {
		B_V_Ufp_MateriaExample example = null;
		B_V_Ufp_MateriaExample.Criteria criteria = null;
		
		example = new B_V_Ufp_MateriaExample();
		criteria = example.createCriteria();
		if (StringTools.isNotNullAndHasValue(typeid)) {
			criteria.andMateriaClassEqualTo(typeid);
		}
		if (StringTools.isNotNullAndHasValue(materiaTitle)) {
			criteria.andMateriaTitleLike("%" + materiaTitle + "%");
		}
		if (StringTools.isNotNullAndHasValue(startTime)) {
			criteria.andMateriaTimeGreaterThanOrEqualTo(startTime);
		}
		if (StringTools.isNotNullAndHasValue(endTime)) {
			criteria.andMateriaTimeLessThanOrEqualTo(endTime);
		}
		if(flagtype!=null&&flagtype.equals("1")){
			criteria.andMateriaDownuserLike("%"+SessionFactory.getSessionUserId()+"%").andIsDeleteEqualTo(0);
			if (StringTools.isNotNullAndHasValue(typeid)) {
				example.or().andMateriaClassEqualTo(typeid)
				.andMateriaTitleLike("%" + (materiaTitle==null?"":materiaTitle) + "%")
				.andMateriaTimeGreaterThanOrEqualTo(startTime==null?"0000-00-00":startTime)
				.andMateriaTimeLessThanOrEqualTo(endTime==null?"9999-99-99":endTime)
				.andDownpermitLike("%"+SessionFactory.getSessionDeptId()+"%").andIsDeleteEqualTo(0);
			}else{
				if(StringTools.isNullOrNoValue(typeid)){
					//获取所属部门资料类别
					ArrayList<String> restr = getPersonMateriaClass();
					if(restr.size()>0){
						example.or().andMateriaClassIn(restr)
						.andMateriaTitleLike("%" + (materiaTitle==null?"":materiaTitle) + "%")
						.andMateriaTimeGreaterThanOrEqualTo(StringTools.isNullOrNoValue(startTime)?"0000-00-00":startTime)
						.andMateriaTimeLessThanOrEqualTo(StringTools.isNullOrNoValue(endTime)?"9999-99-99":endTime)
						.andDownpermitLike("%"+SessionFactory.getSessionDeptId()+"%").andIsDeleteEqualTo(0);
					}else{
						example.or()
						.andMateriaTitleLike("%" + (materiaTitle==null?"":materiaTitle) + "%")
						.andMateriaTimeGreaterThanOrEqualTo(StringTools.isNullOrNoValue(startTime)?"0000-00-00":startTime)
						.andMateriaTimeLessThanOrEqualTo(StringTools.isNullOrNoValue(endTime)?"9999-99-99":endTime)
						.andDownpermitLike("%"+SessionFactory.getSessionDeptId()+"%").andIsDeleteEqualTo(0);
					}
				}
			}
		}
		else{
			criteria.andCreateUserEqualTo(SessionFactory.getSessionUserId()).andIsDeleteEqualTo(0);
		}							
		// 取得总的记录条数
		total = mapperMV.countByExample(example);
		//分页
		criteria.setLimitValue(getRowStart(), getRowEnd());
		//排序
		example.setOrderByClause("materia_time");
		// 格式化result 一定要是JSONObject
		result = CommonLogic.getResult(total, mapperMV
				.selectByExampleWithBLOBs(example));
		return SUCCESS;
	}
	
	/**
	 * 获取资料类别
	 * @return
	 */
	public ArrayList<String> getPersonMateriaClass(){
		ArrayList<String> restr= new ArrayList<String>();
		String deptid = SessionFactory.getSessionDeptId();
		B_T_Ufp_Materia_ClassExample example = new B_T_Ufp_Materia_ClassExample();
		B_T_Ufp_Materia_ClassExample.Criteria criteria = example.createCriteria();
		criteria.andDownpermitLike("%"+deptid==null?"":deptid+"%");
		for(B_T_Ufp_Materia_Class temp:mapperMCT.selectByExample(example)){
			restr.add(temp.getUuid());
		}
		return restr;
	}
	
	
	/**
	 * 取得资料类别树
	 * @return
	 */
	public String getTypeTree()throws Exception {
		listMateriagetTypeTree= DbOperationFation.getTreeDataForJson("B_T_UFP_MATERIA_CLASS", "pid", "uuid", "CLASSNAME", "IS_DELETE=0 order by sort");
		return SUCCESS;
	}
	//==============================get/set==============================
	public String getMateriaTitle() {
		return materiaTitle;
	}

	public void setMateriaTitle(String materiaTitle) {
		this.materiaTitle = materiaTitle;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public B_T_Ufp_MateriaWithBLOBs getB_T_Ufp_MateriaWithBLOBs() {
		return b_T_Ufp_MateriaWithBLOBs;
	}

	public void setB_T_Ufp_MateriaWithBLOBs(
			B_T_Ufp_MateriaWithBLOBs bTUfpMateriaWithBLOBs) {
		b_T_Ufp_MateriaWithBLOBs = bTUfpMateriaWithBLOBs;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<B_T_Ufp_Materia_Class> getList_B_T_Ufp_Materia_Class() {
		return list_B_T_Ufp_Materia_Class;
	}

	public void setList_B_T_Ufp_Materia_Class(
			List<B_T_Ufp_Materia_Class> listBTUfpMateriaClass) {
		list_B_T_Ufp_Materia_Class = listBTUfpMateriaClass;
	}

	public String getFlagtype() {
		return flagtype;
	}

	public void setFlagtype(String flagtype) {
		this.flagtype = flagtype;
	}

	public List<B_T_Ufp_Materia_Class> getListMateriagetTypeTree() {
		return listMateriagetTypeTree;
	}

	public void setListMateriagetTypeTree(
			List<B_T_Ufp_Materia_Class> listMateriagetTypeTree) {
		this.listMateriagetTypeTree = listMateriagetTypeTree;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

}
