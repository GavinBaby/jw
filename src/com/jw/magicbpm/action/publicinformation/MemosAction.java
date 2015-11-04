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
	 * 备忘录模块
	 */
	private static final long serialVersionUID = 1L;

	//备忘录详细信息
	private B_T_Ufp_Memos b_T_Ufp_Memos;
	//单位列表
	private List<C_T_Sys_Unit> listC_T_Sys_Unit; 
	// 查询条件
	private String memosS;
	//模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MEMOS;
	// 提醒方式
	private String remindTypeS;
	//安排开始时间
	private String arrangeTimeSS;
	//安排结束时间
	private String arrangeTimeES;
	//选择框值
	private String chk_value;
	// 选择好单位后回传过来的单位ID
	private String unitId;
	// 单位名称(当用户不为超级管理员时显示用)
	private String unitName;
	//时列表
	private  String hour;
	//分
	private  String minute;
	//控制复选框显示
    private  String checkboxflag;
    @Resource
    B_T_Ufp_MemosMapper mapperMT;
	/**
	 * 删除数据
	 */
	public String detailsDelete() throws Exception{
			DbOperationFation.deleteByExample("b_T_Ufp_Memos", checkedIds,
					moduleId);
			sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
			return SUCCESS;
	}

	/**
	 * 详细画面(带列表)加载
	 */
	public String detailsLoad()throws Exception {

		b_T_Ufp_Memos = mapperMT.selectByPrimaryKey(mainDocId);
		if(b_T_Ufp_Memos==null){
			b_T_Ufp_Memos=new B_T_Ufp_Memos();
			b_T_Ufp_Memos.setRegisteredTime(DateTools.getServerDateTime(9));
			b_T_Ufp_Memos.setRegisteredUser(SessionFactory.getSessionUserNm());	
			checkboxflag = "2";//默认选择待办	
		}else{ 
			String type =	b_T_Ufp_Memos.getRemindType();
			if("1".equals(type)){
				checkboxflag = "1";//显示选择短信
			}else if("2".equals(type)){
				checkboxflag = "2";
			}else {
				checkboxflag ="3";//显示都选
			}
			//取得更新时间
			getDocUpdateTime("b_t_ufp_memos");	
			WorkflowengineMessage.updataDbToYbNoFlow(mainDocId, moduleId);
		}
		return SUCCESS;
	}
	
	/**
	 * 更新/新增数据
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
			// 发送代办事宜
			if(StringTools.isNullOrNoValue(b_T_Ufp_Memos.getHour())){
				WorkflowengineMessage.createDbsyNoFlow(moduleId,
						b_T_Ufp_Memos.getUuid(),
						SessionFactory.getSessionUserId(), "", 0, "备忘录["+b_T_Ufp_Memos.getArrangeTime()+"]-" + b_T_Ufp_Memos.getMemos(),
						"publicinformation/Memos_detailsLoad.action?mainDocId="
								+ b_T_Ufp_Memos.getUuid());
			}
		}else
		{
			//判断是否有人编辑过
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
	 * 列表画面加载
	 */
	public String listLoad() {
		return SUCCESS;
	}

	/**
	 * Grid数据加载
	 */
	public String gridLoad() throws Exception{
		B_T_Ufp_MemosExample example = null;
		B_T_Ufp_MemosExample.Criteria criteria = null;
		try{
			// 创建查询条件
			example = new B_T_Ufp_MemosExample();
			criteria = example.createCriteria();
			criteria.andIsDeleteEqualTo(0);
			// 添加页面查询条件
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
	        //个人看个人数据
			criteria.andRegisteredUserEqualTo(SessionFactory.getSessionUserNm());
			// 取得总的记录条数
			total = mapperMT.countByExample(example);
			//分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("CREATE_TIME desc");
			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperMT
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
