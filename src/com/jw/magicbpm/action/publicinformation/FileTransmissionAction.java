package com.jw.magicbpm.action.publicinformation;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.action.baseintface.JwBaseFlowAction;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.flow.WorkflowengineMessage;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.logic.FileIdUpdata;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_File_TransmissionMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_File_TransmissionExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_File_TransmissionWithBLOBs;

public class FileTransmissionAction extends JwBaseFlowAction implements
		JwBaseActionI {

	/**
	 * 文件传输action
	 */
	private static final long serialVersionUID = 1L;

	// 模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_FILE_TRANSMISSION;
	//文件传输详细信息
	private B_T_Ufp_File_TransmissionWithBLOBs b_T_Ufp_File_TransmissionWithBLOBs;

	// 权限
	private String allPermission;
	//判断收取里type:1无法修改
	private String type;
	// 查询条件
	private String title;
	//登记开始时间
	private String startTime;
	//登记结束时间
	private String endTime;
	//发送人
	private String sendName;
	@Resource
	B_T_Ufp_File_TransmissionMapper mapperFTT;

	/**
	 * 删除数据
	 */
	public String detailsDelete() throws Exception {
		DbOperationFation.deleteByExample("B_T_Ufp_File_Transmission",
				checkedIds, moduleId);
		deleteDocFlowInfor();
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * 详细画面加载
	 * 
	 */
	public String detailsLoad() throws Exception {
		allPermission = "*";
		if (StringTools.isNullOrNoValue(mainDocId)) {
			b_T_Ufp_File_TransmissionWithBLOBs = new B_T_Ufp_File_TransmissionWithBLOBs();
			b_T_Ufp_File_TransmissionWithBLOBs.setSendperson(SessionFactory
					.getSessionUserNm());
			b_T_Ufp_File_TransmissionWithBLOBs.setSendtime(DateTools
					.getServerDateTime(9));
		} else {
			b_T_Ufp_File_TransmissionWithBLOBs = mapperFTT
					.selectByPrimaryKey(mainDocId);
			if (type != null && type.equals("1")) {
				allPermission = "#";
			}
			// 取得更新时间
			getDocUpdateTime("b_T_Ufp_File_Transmission");
			WorkflowengineMessage.updataDbToYbNoFlow(mainDocId, moduleId);
		}
		return SUCCESS;
	}

	/**
	 * 更新/新增数据
	 */
	public String detailsUpdate() throws Exception {
		String returnMsg = "";
		// 创建需要更新的记录集合
		if (StringTools.isNullOrNoValue(mainDocId)) {
			String uuid = new GUID().toString();
			b_T_Ufp_File_TransmissionWithBLOBs.setUuid(uuid);
			mapperFTT.insertSelective(b_T_Ufp_File_TransmissionWithBLOBs);

			// 更新附件表的主文档ID
			FileIdUpdata.Updata(newFileIds, uuid);
			returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
		} else {
			// 判断是否有人编辑过
			if (isDocUpdated("B_T_UFP_FILE_TRANSMISSION")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				b_T_Ufp_File_TransmissionWithBLOBs.setSendtime(DateTools
						.getServerDateTime(9));
				mapperFTT.updateByPrimaryKeySelective(b_T_Ufp_File_TransmissionWithBLOBs);
				returnMsg = Constants.UPDATE_SUCCESSFUL_MSG;
			}
		}
		String userIds = b_T_Ufp_File_TransmissionWithBLOBs.getReceiveperson();
		if (userIds != null) {
			String title = "";
			if (b_T_Ufp_File_TransmissionWithBLOBs.getTitle() != null) {
				title = b_T_Ufp_File_TransmissionWithBLOBs.getTitle();
			}
			//根据接收人发待办事宜
			String[] userIdArr = userIds.split(",");
			for (String tempuser : userIdArr) {
				if (!"".equals(tempuser)) {
					// 发送代办事宜
					WorkflowengineMessage.createDbsyNoFlow(moduleId,
							b_T_Ufp_File_TransmissionWithBLOBs.getUuid(),
							tempuser, "", 0, "待办-请查收文件传输：" + title,
							"publicinformation/FileTransmissionDetailLoad.action?uuidKey="
									+ b_T_Ufp_File_TransmissionWithBLOBs
											.getUuid() + "&type=1");
				}
			}
		}
		sucessMessage(returnMsg);
		return SUCCESS;
	}

	/**
	 * 列表画面加载
	 */
	public String listLoad() throws Exception {

		return SUCCESS;
	}

	/**
	 * Grid数据加载
	 */
	public String gridLoad() throws Exception {
		B_T_Ufp_File_TransmissionExample example = null;
		B_T_Ufp_File_TransmissionExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_File_TransmissionExample();
			criteria = example.createCriteria();
			if (StringTools.isNotNullAndHasValue(title)) {
				criteria.andTitleLike("%" + title.trim() + "%");
			}
			if (StringTools.isNotNullAndHasValue(startTime)) {
				criteria.andSendtimeGreaterThanOrEqualTo(startTime);
			}
			if (StringTools.isNotNullAndHasValue(endTime)) {
				criteria.andSendtimeLessThanOrEqualTo(endTime);
			}

			criteria.andCreateUserEqualTo(SessionFactory.getSessionUserId());
			criteria.andIsDeleteEqualTo(0);
			// 取得总的记录条数
			total = mapperFTT.countByExample(example);
			// 分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("sendtime");

			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperFTT
					.selectByExampleWithBLOBs(example));
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
	 * 列表画面加载
	 */
	public String reslistLoad() throws Exception {

		return SUCCESS;
	}

	/**
	 * Grid数据加载
	 */
	public String resgridLoad() throws Exception {
		B_T_Ufp_File_TransmissionExample example = null;
		B_T_Ufp_File_TransmissionExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_File_TransmissionExample();
			criteria = example.createCriteria();
			if (StringTools.isNotNullAndHasValue(sendName.trim())) {
				criteria.andSendpersonLike("%" + sendName.trim() + "%");
			}
			if (StringTools.isNotNullAndHasValue(title.trim())) {
				criteria.andTitleLike("%" + title.trim() + "%");
			}
			if (StringTools.isNotNullAndHasValue(startTime)) {
				criteria.andSendtimeGreaterThanOrEqualTo(startTime);
			}
			if (StringTools.isNotNullAndHasValue(endTime)) {
				criteria.andSendtimeLessThanOrEqualTo(endTime);
			}
			criteria.andReceivepersonLike("%"
					+ SessionFactory.getSessionUserId() + "%");
			criteria.andIsDeleteEqualTo(0);
			// 取得总的记录条数
			total = mapperFTT.countByExample(example);
			//分页
			criteria.setLimitValue(getRowStart(), getRowEnd());
			//排序
			example.setOrderByClause("sendtime");

			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperFTT
					.selectByExampleWithBLOBs(example));
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	// ==============================get/set==============================

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

	public B_T_Ufp_File_TransmissionWithBLOBs getB_T_Ufp_File_TransmissionWithBLOBs() {
		return b_T_Ufp_File_TransmissionWithBLOBs;
	}

	public void setB_T_Ufp_File_TransmissionWithBLOBs(
			B_T_Ufp_File_TransmissionWithBLOBs bTUfpFileTransmissionWithBLOBs) {
		b_T_Ufp_File_TransmissionWithBLOBs = bTUfpFileTransmissionWithBLOBs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

}
