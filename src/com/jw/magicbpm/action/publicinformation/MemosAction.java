package com.jw.magicbpm.action.publicinformation;

import java.util.List;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.flow.WorkflowengineMessage;

import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.model.C_T_Sys_Unit;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_MemosMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Memos;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_MemosExample;


public class MemosAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * ����¼ģ��
	 */
	private static final long serialVersionUID = 1L;

	//����¼��ϸ��Ϣ
	private B_T_Ufp_Memos b_T_Ufp_Memos;
	//��λ�б�
	private List<C_T_Sys_Unit> listC_T_Sys_Unit; 
	// ��ѯ����
	private String memosS;
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEMOS;
	// ���ѷ�ʽ
	private String remindTypeS;
	//���ſ�ʼʱ��
	private String arrangeTimeSS;
	//���Ž���ʱ��
	private String arrangeTimeES;
	//ѡ���ֵ
	private String chk_value;
	// ѡ��õ�λ��ش������ĵ�λID
	private String unitId;
	// ��λ����(���û���Ϊ��������Աʱ��ʾ��)
	private String unitName;
	//ʱ�б�
	private  String hour;
	//��
	private  String minute;
	//���Ƹ�ѡ����ʾ
    private  String checkboxflag;
    @Resource
    B_T_Ufp_MemosMapper mapperMT;
	/**
	 * ɾ������
	 */
	public String detailsDelete() throws Exception{
			DbOperationFation.deleteByExample("b_T_Ufp_Memos", checkedIds,
					moduleId);
			sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
			return SUCCESS;
	}

	/**
	 * ��ϸ����(���б�)����
	 */
	public String detailsLoad()throws Exception {

		b_T_Ufp_Memos = mapperMT.selectByPrimaryKey(mainDocId);
		if(b_T_Ufp_Memos==null){
			b_T_Ufp_Memos=new B_T_Ufp_Memos();
			b_T_Ufp_Memos.setRegisteredTime(DateTools.getServerDateTime(9));
			b_T_Ufp_Memos.setRegisteredUser(SessionFactory.getSessionUserNm());	
			checkboxflag = "2";//Ĭ��ѡ�����	
		}else{ 
			String type =	b_T_Ufp_Memos.getRemindType();
			if("1".equals(type)){
				checkboxflag = "1";//��ʾѡ�����
			}else if("2".equals(type)){
				checkboxflag = "2";
			}else {
				checkboxflag ="3";//��ʾ��ѡ
			}
			//ȡ�ø���ʱ��
			getDocUpdateTime("b_t_ufp_memos");	
			WorkflowengineMessage.updataDbToYbNoFlow(mainDocId, moduleId);
		}
		return SUCCESS;
	}
	
	/**
	 * ����/��������
	 */
	public String detailsUpdate() throws Exception{
	
		String returnMsg = "";
		if (StringTools.isNullOrNoValue(mainDocId)){
			b_T_Ufp_Memos.setUuid(new GUID().toString());
			b_T_Ufp_Memos.setRegisteredUser(SessionFactory.getSessionUserNm());
			b_T_Ufp_Memos.setRegisteredTime(DateTools.getServerDateTime(9));
			b_T_Ufp_Memos.setRemindType(chk_value);
			mapperMT.insertSelective(b_T_Ufp_Memos);
			returnMsg=Constants.SAVE_SUCCESSFUL_MSG;	
			// ���ʹ�������
			if(StringTools.isNullOrNoValue(b_T_Ufp_Memos.getHour())){
				WorkflowengineMessage.createDbsyNoFlow(moduleId,
						b_T_Ufp_Memos.getUuid(),
						SessionFactory.getSessionUserId(), "", 0, "����¼["+b_T_Ufp_Memos.getArrangeTime()+"]-" + b_T_Ufp_Memos.getMemos(),
						"publicinformation/Memos_detailsLoad.action?mainDocId="
								+ b_T_Ufp_Memos.getUuid());
			}
		}else
		{
			//�ж��Ƿ����˱༭��
			if (isDocUpdated("B_T_UFP_MEMOS")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				b_T_Ufp_Memos.setRemindType(chk_value);
				mapperMT.updateByPrimaryKeySelective(b_T_Ufp_Memos);
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
	public String gridLoad() throws Exception{
		B_T_Ufp_MemosExample example = null;
		B_T_Ufp_MemosExample.Criteria criteria = null;
		try{
			// ������ѯ����
			example = new B_T_Ufp_MemosExample();
			criteria = example.createCriteria();
			criteria.andIsDeleteEqualTo(0);
			// ���ҳ���ѯ����
			if (StringTools.isNotNullAndHasValue(memosS)) {
				criteria.andMemosLike("%"+memosS.trim()+"%");
			}
			if (StringTools.isNotNullAndHasValue(remindTypeS)) {
				criteria.andRemindTypeEqualTo(remindTypeS);
			}
			if (StringTools.isNotNullAndHasValue(arrangeTimeSS)) {
				criteria.andArrangeTimeGreaterThanOrEqualTo(arrangeTimeSS);
			}
			if (StringTools.isNotNullAndHasValue(arrangeTimeES)) {
				criteria.andArrangeTimeLessThanOrEqualTo(arrangeTimeES);
			}
	        //���˿���������
			criteria.andRegisteredUserEqualTo(SessionFactory.getSessionUserNm());
			// ȡ���ܵļ�¼����
			total = mapperMT.countByExample(example);
			//��ҳ
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//����
			example.setOrderByClause("CREATE_TIME desc");
			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperMT
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

	// *************************************get/set*****************************************************

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public B_T_Ufp_Memos getB_T_Ufp_Memos() {
		return b_T_Ufp_Memos;
	}

	public void setB_T_Ufp_Memos(B_T_Ufp_Memos bTUfpMemos) {
		b_T_Ufp_Memos = bTUfpMemos;
	}

	public List<C_T_Sys_Unit> getListC_T_Sys_Unit() {
		return listC_T_Sys_Unit;
	}

	public void setListC_T_Sys_Unit(List<C_T_Sys_Unit> listCTSysUnit) {
		listC_T_Sys_Unit = listCTSysUnit;
	}

	public String getMemosS() {
		return memosS;
	}

	public void setMemosS(String memosS) {
		this.memosS = memosS;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getRemindTypeS() {
		return remindTypeS;
	}

	public void setRemindTypeS(String remindTypeS) {
		this.remindTypeS = remindTypeS;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getChk_value() {
		return chk_value;
	}

	public void setChk_value(String chkValue) {
		chk_value = chkValue;
	}

	public String getCheckboxflag() {
		return checkboxflag;
	}

	public void setCheckboxflag(String checkboxflag) {
		this.checkboxflag = checkboxflag;
	}

    public String getArrangeTimeSS() {
		return arrangeTimeSS;
	}

	public void setArrangeTimeSS(String arrangeTimeSS) {
		this.arrangeTimeSS = arrangeTimeSS;
	}
	public String getArrangeTimeES() {
		return arrangeTimeES;
	}

	public void setArrangeTimeES(String arrangeTimeES) {
		this.arrangeTimeES = arrangeTimeES;
	}

}
