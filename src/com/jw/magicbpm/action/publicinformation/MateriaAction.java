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
	 * ���Ϲ���action
	 */
	private static final long serialVersionUID = 1L;
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MATERIA;
	//���Ϲ�����ϸ��Ϣ
	private B_T_Ufp_MateriaWithBLOBs b_T_Ufp_MateriaWithBLOBs;
	//���Ϲ�������б�
	private List<B_T_Ufp_Materia_Class> list_B_T_Ufp_Materia_Class;
	//���Ϲ��������
	private List<B_T_Ufp_Materia_Class> listMateriagetTypeTree;
	//Ȩ��
	private String allPermission;
	//�Ƿ�����1:�ϴ�0��δ�ϴ�����
	private String type;
	//��ѯ��������
	private String materiaTitle;
	//�Ǽǿ�ʼʱ��
	private String startTime;
	//�Ǽǽ���ʱ��
	private String endTime;
	//����1������0:�Լ�
	private String flagtype;
	//�����������
	private String typeid;
	@Resource
	B_T_Ufp_MateriaMapper mapperMT;
	@Resource
	B_T_Ufp_Materia_ClassMapper mapperMCT;
	@Resource
	B_V_Ufp_MateriaMapper mapperMV;
	/**
	 * ɾ������
	 */
	public String detailsDelete() throws Exception{
		DbOperationFation.deleteByExample("B_T_Ufp_Materia", checkedIds,
				moduleId);
		deleteDocFlowInfor();
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * ��ϸ�������
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
			//���ϲ鿴�༭Ȩ��
			if(b_T_Ufp_MateriaWithBLOBs.getCreateUser().equals(SessionFactory.getSessionUserId())&&b_T_Ufp_MateriaWithBLOBs.getMateriaIscheck()==0){
				allPermission=",save,upsave,materiaTitle,materiaPlace,materiaDetails,materiaDownname,selUploadUser,materiaClass,upload1,materiaRemark,";
			}
			else if(b_T_Ufp_MateriaWithBLOBs.getCreateUser().equals(SessionFactory.getSessionUserId())&&b_T_Ufp_MateriaWithBLOBs.getMateriaIscheck()==1){
				allPermission=",cancel,";
			}
			else{
				allPermission="#";	
			}
			// ȡ�ø���ʱ��	
			getDocUpdateTime("B_T_Ufp_Materia");	
		}
		exampleClass = new B_T_Ufp_Materia_ClassExample();

		if("1".equals(flagtype)){//�������ϲ��ܱ༭ ��ʾ���
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
	 * ����/��������
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
			
			//���¸���������ĵ�ID
			FileIdUpdata.Updata(newFileIds,uuid);
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		}else
		{
			//�ж��Ƿ����˱༭��
			if (isDocUpdated("b_t_ufp_materia")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				b_T_Ufp_MateriaWithBLOBs.setMateriaIscheck(Integer.parseInt(type));
				//�Ƿ��ϴ�
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
	 * �б������
	 */
	public String listLoad() {

		return SUCCESS;
	}
		
	/**
	 * Grid���ݼ���
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
					//��ȡ���������������
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
		// ȡ���ܵļ�¼����
		total = mapperMV.countByExample(example);
		//��ҳ
		criteria.setLimitValue(getRowStart(), getRowEnd());
		//����
		example.setOrderByClause("materia_time");
		// ��ʽ��result һ��Ҫ��JSONObject
		result = CommonLogic.getResult(total, mapperMV
				.selectByExampleWithBLOBs(example));
		return SUCCESS;
	}
	
	/**
	 * ��ȡ�������
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
	 * ȡ�����������
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
