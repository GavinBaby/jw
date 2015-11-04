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
 * 会议室管理
 */
public class MeetingserviceAction extends JwBaseFlowAction implements JwBaseActionI {

	/**
	 * 版本标识
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// 会议室信息列表
	private List<B_T_Flow_Meetingservice> list_B_T_Flow_Meetingservice;

	// 会议室信息详细信息
	private B_T_Flow_Meetingservice b_T_Flow_Meetingservice;
	
	// 会议室设备列表
	private List<B_V_Ufp_Meeting_Equipuse> list_B_V_Ufp_Meeting_Equipuse;
	//模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEETINGSERVICE;

	// 查询条件申请人，部门
	private String applicantperson;
	private String deptname;
	// 会务状态（0待审核1已受理2已取消）
	private String flag;
	// 开始时间
	private String begindate;
	// 结束时间
	private String enddate;

	// 资源
	@Resource
	B_T_Flow_MeetingserviceMapper mapperMS;
	@Resource
	B_V_Flow_MeetingserviceMapper mapperMSV;
	@Resource
	B_T_Flow_MeetinguseinfoMapper mapperMUI;
	@Resource
	B_T_Ufp_Meeting_EquipuseMapper mapperME;
	/**
	 * 会议室管理 删除
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
	 * 会议室管理 详细信息页面加载 
	 */
	public String detailsLoad() throws Exception {
		//获取流程基本信息
		getBaseFlowInfor(moduleId);
		b_T_Flow_Meetingservice = mapperMS.selectByPrimaryKey(mainDocId);
		if (b_T_Flow_Meetingservice == null) {
			b_T_Flow_Meetingservice = new B_T_Flow_Meetingservice();
			b_T_Flow_Meetingservice.setRegistrant(SessionFactory.getSessionUserId());
			b_T_Flow_Meetingservice.setApplicanttime(DateTools.getServerDateTime(9));
			b_T_Flow_Meetingservice.setDeptname(SessionFactory.getSessionDeptName());
		} else {
			docIsRead();
			// 取得更新时间
			getDocUpdateTime("B_T_Flow_Meetingservice");
		}
		return SUCCESS;
	}

	/**
	 * 会议室管理 详细信息新建或修改
	 */
	public String detailsUpdate() throws Exception {
		// 取得数据连接
		String returnMsg = "";
		boolean s = true;
		if(!"2".equals(flag)){
			//会务结束时间小于当前时间
			String str = ismeetingServiceByDate(b_T_Flow_Meetingservice.getMeetingroomId(),b_T_Flow_Meetingservice.getMeetingroomName(),b_T_Flow_Meetingservice.getStarttime(),b_T_Flow_Meetingservice.getEndtime());
			if (str.length() > 0){
				returnMsg = str.substring(0, str.length()-1) + "在该时间段已被预订";
				s = false;
			}
		}
		
		if(s){
			// 创建需要更新的记录集合
			if (StringTools.isNullOrNoValue(mainDocId)) {
				b_T_Flow_Meetingservice.setUuid(new GUID().toString());
				b_T_Flow_Meetingservice.setRegistrant(SessionFactory.getSessionUserId());
				b_T_Flow_Meetingservice.setApplicanttime(DateTools.getServerDateTime(9));
				b_T_Flow_Meetingservice.setDeptname(SessionFactory.getSessionDeptName());
				b_T_Flow_Meetingservice.setStatus(flag);
				mapperMS.insertSelective(b_T_Flow_Meetingservice);
				// 给mainDocId赋值
				mainDocId = b_T_Flow_Meetingservice.getUuid();
				returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
			} else {
				// 判断是否有人编辑过
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
			
			// 更新会议室使用情况
			if (b_T_Flow_Meetingservice != null){
				meetingroomuseinsert(b_T_Flow_Meetingservice.getUuid());
			}
			
			// 更新会场设备使用情况
			if (b_T_Flow_Meetingservice != null){
				meetingEquipuseUpdate(b_T_Flow_Meetingservice.getUuid());
			}
			// 设置流程信息
			setDocTacheInfo(moduleId,
					"publicinformation/Meetingservice_detailsLoad.action?mainDocId="
							+ mainDocId, "\"" +b_T_Flow_Meetingservice.getMeetingroomName() + "\"的会务申请");
			sucessMessage(returnMsg);
		}else{
			errorMessage(returnMsg);
		}
		
		return SUCCESS;
	}

	/**
	 * 收文管理 Grid数据加载 
	 */
	public String gridLoad() throws Exception {
		B_V_Flow_MeetingserviceExample example = null;
		B_V_Flow_MeetingserviceExample.Criteria criteria = null;
		try {
			String cur_Sys_Name = SessionFactory.getSessionUserId();

			// 创建查询条件
			example = new B_V_Flow_MeetingserviceExample();
			criteria = example.createCriteria();
			// 判断逻辑删除（必须）
			criteria.andModuleIdEqualTo(moduleId);
			//导航条件
			criteria.andStatusEqualTo(flag);
			//流程经过人
			criteria.andTacheuserLike("%," + cur_Sys_Name + ",%");
			// 添加页面查询条件
			if (StringTools.isNotNullAndHasValue(applicantperson)) {
				criteria.andApplicantpersonLike("%" + applicantperson.trim() + "%");
			}
			if (StringTools.isNotNullAndHasValue(deptname)) {
				criteria.andDeptnameLike("%" + deptname.trim() + "%");
			}
			//已受理查询时间
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
				//待审核
				if("0".equals(flag)){
					criteria.andIsFinishedEqualTo(0);
				}else{
					//已取消
					criteria.andIsFinishedEqualTo(1);
				}
			}
			
			example.or(criteria);
			// 记录条数的记录
			total = mapperMSV.countByExample(example);
			// 分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			//已受理查询时间
			if (StringTools.isNotNullAndHasValue(flag)&&"1".equals(flag)) {
				example.setOrderByClause("STARTTIME desc");
			}else{
			    example.setOrderByClause("APPLICANTTIME desc");
			}
			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperMSV
					.selectByExample(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	/**
	 * 会议室管理 列表加载（其他需要数据库获得的数据） 
	 */
	public String listLoad() {

		return SUCCESS;
	}
	
	/**
	 * 查找某个时间段会议室是否被预定
	 * @param meetingRoomid 会议室ID
	 * @param starttime 开始时间
	 * @param endtime 开始时间
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
	 * 插入会议室使用情况
	 * @param sqlSession
	 * @param id 会务ID
	 * @throws Exception
	 */
	public void meetingroomuseinsert(String id)throws Exception {
		if(b_T_Flow_Meetingservice.getReservationnum()!=null){
			meetingroomusedelete(id);// 插入之前先删除记录
			B_T_Flow_Meetinguseinfo record = null;
			String meetingRoomids = b_T_Flow_Meetingservice.getMeetingroomId();
			if (meetingRoomids != null && !"".equals(meetingRoomids)) {
				String[] ids = meetingRoomids.split(",");
				float evlNum=Math.round((b_T_Flow_Meetingservice.getReservationnum()*1.0)/ids.length);//将总人数四舍五入分别存入每个会议室中
				for (int i = 0; i < ids.length; i++) {
					record = new B_T_Flow_Meetinguseinfo();
					record.setUuid(new GUID().toString());// 主键
					record.setReservationnum((int)evlNum);//每个会议室人数
					record.setMeetingroomId(ids[i]);// 会议室id
					record.setMeetingserviceId(id);// 会务id
					mapperMUI.insertSelective(record);
				}
			}
	   }
	}
	
	/**
	 * 删除会议室使用情况
	 * @param sqlSession
	 * @param id 会务服务ID
	 * @throws Exception
	 */
	public void meetingroomusedelete(String id)throws Exception {
		B_T_Flow_MeetinguseinfoExample example = new B_T_Flow_MeetinguseinfoExample();
		example.or().andMeetingserviceIdEqualTo(id);
		mapperMUI.deleteByExample(example);
	}
	
	/**
	 * 会议设备使用信息更新
	 * @param sqlSession
	 * @param meetingserId 会务ID
	 * @throws Exception
	 */
	public void meetingEquipuseUpdate(String meetingserId)throws Exception {

		// 更新前删除记录
		if (list_B_V_Ufp_Meeting_Equipuse != null){
			meetingEuipusedelete(meetingserId);
		}

		if (list_B_V_Ufp_Meeting_Equipuse == null){
			return;
		}
		list_B_V_Ufp_Meeting_Equipuse.remove(null);// 清除list中为null的数据

		for (int i = 0; i < list_B_V_Ufp_Meeting_Equipuse.size(); i++) {
			if (list_B_V_Ufp_Meeting_Equipuse.get(i) != null) {
				B_T_Ufp_Meeting_Equipuse record = new B_T_Ufp_Meeting_Equipuse();
				record.setUuid(list_B_V_Ufp_Meeting_Equipuse.get(i).getUuid());// 主键
				record.setEquipmentId(list_B_V_Ufp_Meeting_Equipuse.get(i)
						.getEquipmentId());// 会场设备ID
				record.setEquipmentNum(list_B_V_Ufp_Meeting_Equipuse.get(i)
						.getEquipmentNum());// 设备数量
				record.setMeetingserviceId(meetingserId);// 会务ID

				if (record.getUuid() != null && !"".equals(record.getUuid()))// 修改
				{
					mapperME.updateByPrimaryKeySelective(record);
				} else// 新增
				{
					record.setUuid(new GUID().toString());
					record.setSort(i + 1);
					mapperME.insertSelective(record);
				}
			}
		}
	}

	/**
	 * 删除会议设备使用情况
	 * @param sqlSession
	 * @param id 会务服务ID
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
