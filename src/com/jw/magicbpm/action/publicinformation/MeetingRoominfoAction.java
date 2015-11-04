package com.jw.magicbpm.action.publicinformation;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.logic.FileIdUpdata;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Meeting_RoominfoMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Roominfo;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_RoominfoExample;

public class MeetingRoominfoAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * ��������ҹ���action
	 */
	private static final long serialVersionUID = 1L;

	
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEETING_ROOMINFO;
	//�����������ϸ��Ϣ
	private B_T_Ufp_Meeting_Roominfo b_T_Ufp_Meeting_Roominfo;
	//Ȩ��
	private String allPermission;
	@Resource
	B_T_Ufp_Meeting_RoominfoMapper mapperME;
	/**
	 * ɾ������
	 */
	public String detailsDelete()throws Exception {
			DbOperationFation.deleteByExample("B_T_Ufp_Meeting_Roominfo", checkedIds,
					moduleId);
			sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
			return SUCCESS;
	}

	/**
	 * ��ϸ�������
	 * 
	 */
	public String detailsLoad()throws Exception {
		allPermission="*";

		if (StringTools.isNullOrNoValue(mainDocId)) {
			b_T_Ufp_Meeting_Roominfo = new B_T_Ufp_Meeting_Roominfo();
		} else {
			b_T_Ufp_Meeting_Roominfo = mapperME.selectByPrimaryKey(mainDocId);
			// ȡ�ø���ʱ��
			getDocUpdateTime("B_T_Ufp_Meeting_Roominfo");	
		}
		
		return SUCCESS;
	}

	
	/**
	 * ����/��������
	 */
	public String detailsUpdate()throws Exception {
		String returnMsg = "";

		if (StringTools.isNullOrNoValue(mainDocId)){
			String uuid=new GUID().toString();
			b_T_Ufp_Meeting_Roominfo.setUuid(uuid);
			mapperME.insertSelective(b_T_Ufp_Meeting_Roominfo);
			// ���¸���������ĵ�ID
			FileIdUpdata.Updata(newFileIds, uuid);
			
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		}else{
			//�ж��Ƿ����˱༭��
			if (isDocUpdated("B_T_Ufp_Meeting_Roominfo")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				mapperME.updateByPrimaryKeySelective(b_T_Ufp_Meeting_Roominfo);
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
	public String gridLoad() throws Exception {
		B_T_Ufp_Meeting_RoominfoExample example = null;
		B_T_Ufp_Meeting_RoominfoExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_Meeting_RoominfoExample();
			criteria = example.createCriteria();
			criteria.andIsDeleteEqualTo(0);
			// ȡ���ܵļ�¼����
			total = mapperME.countByExample(example);
			//��ҳ
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//����
			example.setOrderByClause("sort");
			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperME
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}
	//==============================get/set==============================
	
	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public B_T_Ufp_Meeting_Roominfo getB_T_Ufp_Meeting_Roominfo() {
		return b_T_Ufp_Meeting_Roominfo;
	}

	public void setB_T_Ufp_Meeting_Roominfo(
			B_T_Ufp_Meeting_Roominfo bTUfpMeetingRoominfo) {
		b_T_Ufp_Meeting_Roominfo = bTUfpMeetingRoominfo;
	}
	
}
