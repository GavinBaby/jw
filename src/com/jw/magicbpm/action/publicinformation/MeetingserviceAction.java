package com.jw.magicbpm.action.publicinformation;

import java.util.List;
import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.action.baseintface.JwBaseFlowAction;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.CommonOperation;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Flow_MeetingserviceMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Flow_MeetinguseinfoMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Meeting_EquipuseMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Flow_MeetingserviceMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_Meetingservice;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_MeetingserviceExample;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_Meetinguseinfo;
import com.jw.magicbpm.model.publicinformation.B_T_Flow_MeetinguseinfoExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_Equipuse;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Meeting_EquipuseExample;
import com.jw.magicbpm.model.publicinformation.B_V_Flow_MeetingserviceExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Meeting_Equipuse;

/**
 * �����ҹ���
 */
public class MeetingserviceAction extends JwBaseFlowAction implements JwBaseActionI {

	/**
	 * �汾��ʶ
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// ��������Ϣ�б�
	private List<B_T_Flow_Meetingservice> list_B_T_Flow_Meetingservice;

	// ��������Ϣ��ϸ��Ϣ
	private B_T_Flow_Meetingservice b_T_Flow_Meetingservice;
	
	// �������豸�б�
	private List<B_V_Ufp_Meeting_Equipuse> list_B_V_Ufp_Meeting_Equipuse;
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEETINGSERVICE;

	// ��ѯ���������ˣ�����
	private String applicantperson;
	private String deptname;
	// ����״̬��0�����1������2��ȡ����
	private String flag;
	// ��ʼʱ��
	private String begindate;
	// ����ʱ��
	private String enddate;

	// ��Դ
	@Resource
	B_T_Flow_MeetingserviceMapper mapperMS;
	@Resource
	B_V_Flow_MeetingserviceMapper mapperMSV;
	@Resource
	B_T_Flow_MeetinguseinfoMapper mapperMUI;
	@Resource
	B_T_Ufp_Meeting_EquipuseMapper mapperME;
	/**
	 * �����ҹ��� ɾ��
	 */
	public String detailsDelete() {
		DbOperationFation.deleteByExample("B_T_Flow_Meetingservice", checkedIds,
				moduleId);
		deleteDocFlowInfor();
		CommonOperation.deleteFavAndBase(checkedIds,true);
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * �����ҹ��� ��ϸ��Ϣҳ����� 
	 */
	public String detailsLoad() throws Exception {
		//��ȡ���̻�����Ϣ
		getBaseFlowInfor(moduleId);
		b_T_Flow_Meetingservice = mapperMS.selectByPrimaryKey(mainDocId);
		if (b_T_Flow_Meetingservice == null) {
			b_T_Flow_Meetingservice = new B_T_Flow_Meetingservice();
			b_T_Flow_Meetingservice.setRegistrant(SessionFactory.getSessionUserId());
			b_T_Flow_Meetingservice.setApplicanttime(DateTools.getServerDateTime(9));
			b_T_Flow_Meetingservice.setDeptname(SessionFactory.getSessionDeptName());
		} else {
			docIsRead();
			// ȡ�ø���ʱ��
			getDocUpdateTime("B_T_Flow_Meetingservice");
		}
		return SUCCESS;
	}

	/**
	 * �����ҹ��� ��ϸ��Ϣ�½����޸�
	 */
	public String detailsUpdate() throws Exception {
		// ȡ����������
		String returnMsg = "";
		boolean s = true;
		if(!"2".equals(flag)){
			//�������ʱ��С�ڵ�ǰʱ��
			String str = ismeetingServiceByDate(b_T_Flow_Meetingservice.getMeetingroomId(),b_T_Flow_Meetingservice.getMeetingroomName(),b_T_Flow_Meetingservice.getStarttime(),b_T_Flow_Meetingservice.getEndtime());
			if (str.length() > 0){
				returnMsg = str.substring(0, str.length()-1) + "�ڸ�ʱ����ѱ�Ԥ��";
				s = false;
			}
		}
		
		if(s){
			// ������Ҫ���µļ�¼����
			if (StringTools.isNullOrNoValue(mainDocId)) {
				b_T_Flow_Meetingservice.setUuid(new GUID().toString());
				b_T_Flow_Meetingservice.setRegistrant(SessionFactory.getSessionUserId());
				b_T_Flow_Meetingservice.setApplicanttime(DateTools.getServerDateTime(9));
				b_T_Flow_Meetingservice.setDeptname(SessionFactory.getSessionDeptName());
				b_T_Flow_Meetingservice.setStatus(flag);
				mapperMS.insertSelective(b_T_Flow_Meetingservice);
				// ��mainDocId��ֵ
				mainDocId = b_T_Flow_Meetingservice.getUuid();
				returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
			} else {
				// �ж��Ƿ����˱༭��
				if (isDocUpdated("B_T_Flow_Meetingservice")) {
					errorMessage(Constants.DISP_EDIT_CONFLICTS);
					return SUCCESS;
				} else {
					b_T_Flow_Meetingservice.setStatus(flag);
					mapperMS.updateByPrimaryKeySelective(b_T_Flow_Meetingservice);
					returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
				}
			}
			
			b_T_Flow_Meetingservice = mapperMS.selectByPrimaryKey(mainDocId);
			
			// ���»�����ʹ�����
			if (b_T_Flow_Meetingservice != null){
				meetingroomuseinsert(b_T_Flow_Meetingservice.getUuid());
			}
			
			// ���»᳡�豸ʹ�����
			if (b_T_Flow_Meetingservice != null){
				meetingEquipuseUpdate(b_T_Flow_Meetingservice.getUuid());
			}
			// ����������Ϣ
			setDocTacheInfo(moduleId,
					"publicinformation/Meetingservice_detailsLoad.action?mainDocId="
							+ mainDocId, "\"" +b_T_Flow_Meetingservice.getMeetingroomName() + "\"�Ļ�������");
			sucessMessage(returnMsg);
		}else{
			errorMessage(returnMsg);
		}
		
		return SUCCESS;
	}

	/**
	 * ���Ĺ��� Grid���ݼ��� 
	 */
	public String gridLoad() throws Exception {
		B_V_Flow_MeetingserviceExample example = null;
		B_V_Flow_MeetingserviceExample.Criteria criteria = null;
		try {
			String cur_Sys_Name = SessionFactory.getSessionUserId();

			// ������ѯ����
			example = new B_V_Flow_MeetingserviceExample();
			criteria = example.createCriteria();
			// �ж��߼�ɾ�������룩
			criteria.andModuleIdEqualTo(moduleId);
			//��������
			criteria.andStatusEqualTo(flag);
			//���̾�����
			criteria.andTacheuserLike("%," + cur_Sys_Name + ",%");
			// ���ҳ���ѯ����
			if (StringTools.isNotNullAndHasValue(applicantperson)) {
				criteria.andApplicantpersonLike("%" + applicantperson.trim() + "%");
			}
			if (StringTools.isNotNullAndHasValue(deptname)) {
				criteria.andDeptnameLike("%" + deptname.trim() + "%");
			}
			//�������ѯʱ��
			if (StringTools.isNotNullAndHasValue(flag)&&"1".equals(flag)) {
				if(StringTools.isNotNullAndHasValue(begindate)){
					criteria.andStarttimeGreaterThanOrEqualTo(begindate);
				}
				if(StringTools.isNotNullAndHasValue(enddate)){
					criteria.andStarttimeLessThanOrEqualTo(enddate);
				}
				criteria.andIsFinishedEqualTo(1);
			}else{
				if(StringTools.isNotNullAndHasValue(begindate)){
					criteria.andApplicanttimeGreaterThanOrEqualTo(begindate);
				}
				if(StringTools.isNotNullAndHasValue(enddate)){
					criteria.andApplicanttimeLessThanOrEqualTo(enddate);
				}
				//�����
				if("0".equals(flag)){
					criteria.andIsFinishedEqualTo(0);
				}else{
					//��ȡ��
					criteria.andIsFinishedEqualTo(1);
				}
			}
			
			example.or(criteria);
			// ��¼�����ļ�¼
			total = mapperMSV.countByExample(example);
			// ��ҳ
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//����
			//�������ѯʱ��
			if (StringTools.isNotNullAndHasValue(flag)&&"1".equals(flag)) {
				example.setOrderByClause("STARTTIME desc");
			}else{
			    example.setOrderByClause("APPLICANTTIME desc");
			}
			// ��ʽ��result һ��Ҫ��JSONObject
			result = CommonLogic.getResult(total, mapperMSV
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

	/**
	 * �����ҹ��� �б���أ�������Ҫ���ݿ��õ����ݣ� 
	 */
	public String listLoad() {

		return SUCCESS;
	}
	
	/**
	 * ����ĳ��ʱ��λ������Ƿ�Ԥ��
	 * @param meetingRoomid ������ID
	 * @param starttime ��ʼʱ��
	 * @param endtime ��ʼʱ��
	 * @return
	 * @throws Exception
	 */
	public String ismeetingServiceByDate(String meetingRoomid, String meetingroomName,String starttime, String endtime)
			throws Exception {
		String[] ids = meetingRoomid.split(",");
		String[] names = meetingroomName.split(",");
		String name = "";
		for(int i=0;i<ids.length;i++){
			B_T_Flow_MeetingserviceExample exampleM = new B_T_Flow_MeetingserviceExample();
			exampleM.or().andStatusEqualTo("1").andMeetingroomIdLike("%"+ids[i]+"%").andStarttimeBetween(starttime, endtime);
			exampleM.or().andStatusEqualTo("1").andMeetingroomIdLike("%"+ids[i]+"%").andEndtimeBetween(starttime, endtime);
			list_B_T_Flow_Meetingservice = mapperMS.selectByExample(exampleM);
			if(list_B_T_Flow_Meetingservice.size()>0){
				name+=names[i]+",";
			}
		}
		if(name.length()>0){
			return name;
		}else{
			return name;
		}
	}
	
	/**
	 * ���������ʹ�����
	 * @param sqlSession
	 * @param id ����ID
	 * @throws Exception
	 */
	public void meetingroomuseinsert(String id)throws Exception {
		if(b_T_Flow_Meetingservice.getReservationnum()!=null){
			meetingroomusedelete(id);// ����֮ǰ��ɾ����¼
			B_T_Flow_Meetinguseinfo record = null;
			String meetingRoomids = b_T_Flow_Meetingservice.getMeetingroomId();
			if (meetingRoomids != null && !"".equals(meetingRoomids)) {
				String[] ids = meetingRoomids.split(",");
				float evlNum=Math.round((b_T_Flow_Meetingservice.getReservationnum()*1.0)/ids.length);//����������������ֱ����ÿ����������
				for (int i = 0; i < ids.length; i++) {
					record = new B_T_Flow_Meetinguseinfo();
					record.setUuid(new GUID().toString());// ����
					record.setReservationnum((int)evlNum);//ÿ������������
					record.setMeetingroomId(ids[i]);// ������id
					record.setMeetingserviceId(id);// ����id
					mapperMUI.insertSelective(record);
				}
			}
	   }
	}
	
	/**
	 * ɾ��������ʹ�����
	 * @param sqlSession
	 * @param id �������ID
	 * @throws Exception
	 */
	public void meetingroomusedelete(String id)throws Exception {
		B_T_Flow_MeetinguseinfoExample example = new B_T_Flow_MeetinguseinfoExample();
		example.or().andMeetingserviceIdEqualTo(id);
		mapperMUI.deleteByExample(example);
	}
	
	/**
	 * �����豸ʹ����Ϣ����
	 * @param sqlSession
	 * @param meetingserId ����ID
	 * @throws Exception
	 */
	public void meetingEquipuseUpdate(String meetingserId)throws Exception {

		// ����ǰɾ����¼
		if (list_B_V_Ufp_Meeting_Equipuse != null){
			meetingEuipusedelete(meetingserId);
		}

		if (list_B_V_Ufp_Meeting_Equipuse == null){
			return;
		}
		list_B_V_Ufp_Meeting_Equipuse.remove(null);// ���list��Ϊnull������

		for (int i = 0; i < list_B_V_Ufp_Meeting_Equipuse.size(); i++) {
			if (list_B_V_Ufp_Meeting_Equipuse.get(i) != null) {
				B_T_Ufp_Meeting_Equipuse record = new B_T_Ufp_Meeting_Equipuse();
				record.setUuid(list_B_V_Ufp_Meeting_Equipuse.get(i).getUuid());// ����
				record.setEquipmentId(list_B_V_Ufp_Meeting_Equipuse.get(i)
						.getEquipmentId());// �᳡�豸ID
				record.setEquipmentNum(list_B_V_Ufp_Meeting_Equipuse.get(i)
						.getEquipmentNum());// �豸����
				record.setMeetingserviceId(meetingserId);// ����ID

				if (record.getUuid() != null && !"".equals(record.getUuid()))// �޸�
				{
					mapperME.updateByPrimaryKeySelective(record);
				} else// ����
				{
					record.setUuid(new GUID().toString());
					record.setSort(i + 1);
					mapperME.insertSelective(record);
				}
			}
		}
	}

	/**
	 * ɾ�������豸ʹ�����
	 * @param sqlSession
	 * @param id �������ID
	 * @throws Exception
	 */
	public void meetingEuipusedelete(String id)throws Exception {
		B_T_Ufp_Meeting_EquipuseExample example = new B_T_Ufp_Meeting_EquipuseExample();
		example.or().andMeetingserviceIdEqualTo(id);
		mapperME.deleteByExample(example);
	}
	

	//-------------------------------get set-------------------------------
	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<B_T_Flow_Meetingservice> getList_B_T_Flow_Meetingservice() {
		return list_B_T_Flow_Meetingservice;
	}

	public void setList_B_T_Flow_Meetingservice(
			List<B_T_Flow_Meetingservice> listBTFlowMeetingservice) {
		list_B_T_Flow_Meetingservice = listBTFlowMeetingservice;
	}

	public B_T_Flow_Meetingservice getB_T_Flow_Meetingservice() {
		return b_T_Flow_Meetingservice;
	}

	public void setB_T_Flow_Meetingservice(
			B_T_Flow_Meetingservice bTFlowMeetingservice) {
		b_T_Flow_Meetingservice = bTFlowMeetingservice;
	}

	public String getApplicantperson() {
		return applicantperson;
	}

	public void setApplicantperson(String applicantperson) {
		this.applicantperson = applicantperson;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getBegindate() {
		return begindate;
	}

	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public List<B_V_Ufp_Meeting_Equipuse> getList_B_V_Ufp_Meeting_Equipuse() {
		return list_B_V_Ufp_Meeting_Equipuse;
	}

	public void setList_B_V_Ufp_Meeting_Equipuse(
			List<B_V_Ufp_Meeting_Equipuse> listBVUfpMeetingEquipuse) {
		list_B_V_Ufp_Meeting_Equipuse = listBVUfpMeetingEquipuse;
	}

}
