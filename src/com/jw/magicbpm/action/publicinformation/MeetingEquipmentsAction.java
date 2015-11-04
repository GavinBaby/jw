package com.jw.magicbpm.action.publicinformation;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Meeting_EquipmentsMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Equipments;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_EquipmentsExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Meeting_Equipuse;

public class MeetingEquipmentsAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * �����豸����action
	 */
	private static final long serialVersionUID = 1L;

	
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEETING_EQUIPMENTS;
	//�����豸��ϸ��Ϣ
	private B_T_Ufp_Meeting_Equipments b_T_Ufp_Meeting_Equipments;
	//�����豸�б�
	private List<B_T_Ufp_Meeting_Equipments> list_B_T_Ufp_Meeting_Equipments;
	//�����豸��ͼ��Ϣ
	private List<B_V_Ufp_Meeting_Equipuse> list_B_V_Ufp_Meeting_Equipuse;
	//Ȩ��
	private String allPermission;
	//��ѯ����
	private String equipmentName;
	//�����豸ʹ�����
	private String SelectEqips;
	@Resource
	B_T_Ufp_Meeting_EquipmentsMapper mapperME;
	
	
	/**
	 * // �����豸ʹ�����ѡ��(��ѡ��+δѡ��)
	 */
	public String Select() throws Exception {
		List<String> equipIdlist = new ArrayList<String>();

		//��ѡ��Ļ����豸
		if (SelectEqips != null) {
			SelectEqips = URLDecoder.decode(SelectEqips, "UTF-8");// new
			
			list_B_V_Ufp_Meeting_Equipuse = new ArrayList<B_V_Ufp_Meeting_Equipuse>();

			String[] eqip = SelectEqips.split("@");
			for (int a = 0; a < eqip.length; a++) {
				B_V_Ufp_Meeting_Equipuse record = new B_V_Ufp_Meeting_Equipuse();
				String[] eqips = eqip[a].split(",");
				if (eqips.length > 2) {
					equipIdlist.add(eqips[0]);
					record.setEquipmentId(eqips[0]);
					record.setEquipmentName(eqips[1]);
					record.setEquipmentNum(Integer.parseInt(eqips[2]));
					list_B_V_Ufp_Meeting_Equipuse.add(record);

				}
			}
		}
		
		B_T_Ufp_Meeting_EquipmentsExample example = new B_T_Ufp_Meeting_EquipmentsExample();

		//���ҳ���ѡ����豸
		if (equipIdlist.size() > 0)
			example.or().andUuidNotIn(equipIdlist);
		else
			example.or();
		example.setOrderByClause("sort asc");
		
		list_B_T_Ufp_Meeting_Equipments = mapperME.selectByExample(example);

		return SUCCESS;
	}
	
	/**
	 * ɾ������
	 */
	public String detailsDelete()throws Exception {
			DbOperationFation.deleteByExample("B_T_Ufp_Meeting_Equipments", checkedIds,
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
			b_T_Ufp_Meeting_Equipments = new B_T_Ufp_Meeting_Equipments();
		} else {
			b_T_Ufp_Meeting_Equipments = mapperME.selectByPrimaryKey(mainDocId);
			// ȡ�ø���ʱ��
			getDocUpdateTime("B_T_Ufp_Meeting_Equipments");	
		}
		
		return SUCCESS;
	}

	
	/**
	 * ����/��������
	 */
	public String detailsUpdate()throws Exception {
		String returnMsg = "";

		if (StringTools.isNullOrNoValue(mainDocId)){
			b_T_Ufp_Meeting_Equipments.setUuid(new GUID().toString());
			mapperME.insertSelective(b_T_Ufp_Meeting_Equipments);
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
		}else{
			//�ж��Ƿ����˱༭��
			if (isDocUpdated("B_T_Ufp_Meeting_Equipments")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				mapperME.updateByPrimaryKeySelective(b_T_Ufp_Meeting_Equipments);
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
		B_T_Ufp_Meeting_EquipmentsExample example = null;
		B_T_Ufp_Meeting_EquipmentsExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_Meeting_EquipmentsExample();
			criteria = example.createCriteria();
			if (StringTools.isNotNullAndHasValue(equipmentName)) {
				criteria.andEquipmentNameLike("%" + equipmentName + "%");
			}
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

	public B_T_Ufp_Meeting_Equipments getB_T_Ufp_Meeting_Equipments() {
		return b_T_Ufp_Meeting_Equipments;
	}

	public void setB_T_Ufp_Meeting_Equipments(
			B_T_Ufp_Meeting_Equipments bTUfpMeetingEquipments) {
		b_T_Ufp_Meeting_Equipments = bTUfpMeetingEquipments;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public String getSelectEqips() {
		return SelectEqips;
	}

	public void setSelectEqips(String selectEqips) {
		SelectEqips = selectEqips;
	}

	public List<B_T_Ufp_Meeting_Equipments> getList_B_T_Ufp_Meeting_Equipments() {
		return list_B_T_Ufp_Meeting_Equipments;
	}

	public void setList_B_T_Ufp_Meeting_Equipments(
			List<B_T_Ufp_Meeting_Equipments> listBTUfpMeetingEquipments) {
		list_B_T_Ufp_Meeting_Equipments = listBTUfpMeetingEquipments;
	}

	public List<B_V_Ufp_Meeting_Equipuse> getList_B_V_Ufp_Meeting_Equipuse() {
		return list_B_V_Ufp_Meeting_Equipuse;
	}

	public void setList_B_V_Ufp_Meeting_Equipuse(
			List<B_V_Ufp_Meeting_Equipuse> listBVUfpMeetingEquipuse) {
		list_B_V_Ufp_Meeting_Equipuse = listBVUfpMeetingEquipuse;
	}
	
}
