package com.jw.magicbpm.action.publicinformation;

import java.math.BigDecimal;
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
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_BulletinMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Ufp_BulletinMapper;

import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_RoundReadingMapper;

import com.jw.magicbpm.model.publicinformation.B_T_Ufp_BulletinExample;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_BulletinWithBLOBs;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_RoundReading;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_RoundReadingExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_BulletinExample;

public class BulletinAction extends JwBaseFlowAction implements JwBaseActionI {

	/**
	 * 通知公告
	 * 2012—10-15
	 */
	private static final long serialVersionUID = 1L;

	// 通知公告详细信息
	private B_T_Ufp_BulletinWithBLOBs b_T_Ufp_Bulletin;
	// 轮阅详细信息
	private B_T_Ufp_RoundReading b_T_Ufp_RoundReading;
	// 通知公告列表
	private List<B_T_Ufp_BulletinWithBLOBs> list_B_T_Ufp_Bulletin;
	// 轮阅列表
	private List<B_T_Ufp_RoundReading> list_B_T_Ufp_RoundReading;
	//权限
	private String allPermission;
	// 主键
	private String uuid;
	// 导航 （1:未发布 2:已发布 3:已撤销 4:已过期）
	private String type;
	// 类型 （1:未发布 2:已发布 3:已撤销 4:已过期）
	private String state;
	// 标题
	private String titleS;
	// 查询时间开始时间
	private String regdateSS, publishdateSS, canceldateSS, endshowdateSS;
	//结束时间
	private String regdateES, publishdateES, canceldateES, endshowdateES;
	// 轮阅标题
	private String rdtitle;
	private String moduleId = MagicBPMConstants.MOUDLE_ID_BULLETIN;
	@Resource
	B_T_Ufp_BulletinMapper mapperBT;
	@Resource
	B_T_Ufp_RoundReadingMapper mapperRRT;
	@Resource
	B_V_Ufp_BulletinMapper mapperBV;

	/**
	 * 删除
	 */
	public String detailsDelete() {
		DbOperationFation.deleteByExample("B_T_Ufp_Bulletin", checkedIds,
				moduleId);
		deleteDocFlowInfor();
		sucessMessage(Constants.DELETE_SUCCESSFUL_MSG);
		return SUCCESS;
	}

	/**
	 * 详细信息
	 */
	public String detailsLoad() throws Exception {
		allPermission = "*";
		String userid = SessionFactory.getSessionUserId();
		String userName = SessionFactory.getSessionUserNm();
		String serverDateTime = DateTools.getServerDateTime(9);
		b_T_Ufp_Bulletin = mapperBT.selectByPrimaryKey(mainDocId);
		if (b_T_Ufp_Bulletin == null) {
			// 新建
			b_T_Ufp_Bulletin = new B_T_Ufp_BulletinWithBLOBs();
			b_T_Ufp_Bulletin.setUserName(userName); // 登记人中文名
			b_T_Ufp_Bulletin.setUserSysName(userid); // 登记人系统名
			b_T_Ufp_Bulletin.setRegdate(serverDateTime);
			// 显示期限（缺省为登记日期的7天后）
			b_T_Ufp_Bulletin.setEndshowdate(DateTools.getAfterDate(
					b_T_Ufp_Bulletin.getRegdate(), 7));
			allPermission = ",save,publish,upload1,title,endshowdate,";
		} else {
			if (b_T_Ufp_Bulletin.getState() == 1) {
				allPermission = ",save,publish,upload1,title,endshowdate,";
			} else if (b_T_Ufp_Bulletin.getState() == 2) {
				// ---阅读记录
				B_T_Ufp_RoundReadingExample exampleR = new B_T_Ufp_RoundReadingExample();
				b_T_Ufp_RoundReading = new B_T_Ufp_RoundReading();
				exampleR.or().andRoundreadingIdEqualTo(
						b_T_Ufp_Bulletin.getUuid())
						.andCreateUserEqualTo(userid);
				List<B_T_Ufp_RoundReading> b_T_Ufp_RoundReading_List = mapperRRT
						.selectByExample(exampleR);
				exampleR = null;
				if (b_T_Ufp_RoundReading_List.size() == 0) {
					b_T_Ufp_RoundReading.setTitle(b_T_Ufp_Bulletin.getTitle());
					b_T_Ufp_RoundReading.setRoundreadingPerson(userName);
					b_T_Ufp_RoundReading.setRoundreadingTime(serverDateTime);
					b_T_Ufp_RoundReading.setIsread(1);
					b_T_Ufp_RoundReading.setRoundreadingId(b_T_Ufp_Bulletin
							.getUuid());
					mapperRRT.insertSelective(b_T_Ufp_RoundReading);
				}
				allPermission = ",cancel,show,";
			} else if (b_T_Ufp_Bulletin.getState() == 3) {
				allPermission = ",save,publish,upload1,title,endshowdate,";
			} else if (b_T_Ufp_Bulletin.getState() == 4) {
				allPermission = "#";
			}
			if (!(b_T_Ufp_Bulletin.getUserSysName()).equals(userid)) {
				allPermission = "#";
			}
			// 取得更新时间
			getDocUpdateTime("b_T_Ufp_Bulletin");
		}
		return SUCCESS;
	}

	/**
	 * 更新
	 */
	public String detailsUpdate() throws Exception {
		// 取得数据连接
		String returnMsg = "";
		String serverDateTime = DateTools.getServerDateTime(9);
		if (StringTools.isNullOrNoValue(mainDocId)) {
			// 新建保存、发布
			if ("1".equals(type)) {
				b_T_Ufp_Bulletin.setState(1);
				returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
			} else if ("2".equals(type)) {
				b_T_Ufp_Bulletin.setState(2);
				b_T_Ufp_Bulletin.setPublishdate(serverDateTime);
				returnMsg = Constants.PUBLISH_SUCCESSFUL_MSG;
			}
			uuid = new GUID().toString();
			b_T_Ufp_Bulletin.setUuid(uuid);
			b_T_Ufp_Bulletin.setUserName(SessionFactory.getSessionUserNm());
			b_T_Ufp_Bulletin.setUserSysName(SessionFactory.getSessionUserId());
			b_T_Ufp_Bulletin.setRegdate(serverDateTime);
			b_T_Ufp_Bulletin.setUnitid(SessionFactory.getSessionUnitId());
			mapperBT.insertSelective(b_T_Ufp_Bulletin);
			// 更新附件表的主文档ID
			FileIdUpdata.Updata(newFileIds, uuid);
		} else {
			// 判断是否有人编辑过
			if (isDocUpdated("b_T_Ufp_Bulletin")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				if ("3".equals(type)) {
					b_T_Ufp_Bulletin.setState(3);
					b_T_Ufp_Bulletin.setCanceldate(serverDateTime);
					returnMsg = Constants.CANCEL_SUCCESSFUL_MSG;
				} else if ("2".equals(type)) {
					b_T_Ufp_Bulletin.setState(2);
					b_T_Ufp_Bulletin.setPublishdate(serverDateTime);
					returnMsg = Constants.PUBLISH_SUCCESSFUL_MSG;
				} else if ("1".equals(type)) {
					b_T_Ufp_Bulletin.setState(1);
					returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
				}
				mapperBT.updateByPrimaryKeySelective(b_T_Ufp_Bulletin);
			}
		}
		// 执行更新
		sucessMessage(returnMsg);
		return SUCCESS;
	}

	/**
	 * grid数据加载
	 */
	public String gridLoad() throws Exception {
		B_T_Ufp_BulletinExample example = null;
		B_T_Ufp_BulletinExample.Criteria criteria = null;
		B_V_Ufp_BulletinExample vexample = null;
		B_V_Ufp_BulletinExample.Criteria vcriteria = null;
		try {
			// 创建查询条件
			example = new B_T_Ufp_BulletinExample();
			criteria = example.createCriteria();
			vexample = new B_V_Ufp_BulletinExample();
			vcriteria = vexample.createCriteria();
			// 添加页面查询条件/2已发布的/4过期的
			if (StringTools.isNotNullAndHasValue(type)
					&& ("2".equals(type) || "4".equals(type))) {
				// 判断逻辑删除（必须）
				vcriteria.andIsDeleteEqualTo(0);

				if (StringTools.isNotNullAndHasValue(publishdateSS)) {
					vcriteria.andPublishdateGreaterThanOrEqualTo(publishdateSS);
				}
				if (StringTools.isNotNullAndHasValue(publishdateES)) {
					vcriteria.andPublishdateLessThanOrEqualTo(publishdateES);
				}
				if (StringTools.isNotNullAndHasValue(endshowdateSS)) {
					vcriteria.andEndshowdateGreaterThanOrEqualTo(endshowdateSS);
				}
				if (StringTools.isNotNullAndHasValue(endshowdateES)) {
					vcriteria.andEndshowdateLessThanOrEqualTo(endshowdateES);
				}
				if (StringTools.isNotNullAndHasValue(titleS)) {
					vcriteria.andTitleLike("%" + titleS.trim() + "%");
				}
				if (StringTools.isNotNullAndHasValue(type)) {
					vcriteria.andStateEqualTo(BigDecimal.valueOf(Long
							.valueOf(type)));
				}
				vexample.setOrderByClause("CREATE_TIME desc");
				// 记录条数的记录
				total = mapperBV.countByExample(vexample);
				// 分页
				vexample.or().setLimitValue(getRowStart(), getRowEnd());
				// 格式化result 一定要是JSONObject
				result = CommonLogic.getResult(total, mapperBV
						.selectByExample(vexample));
			} else {
				// 判断逻辑删除（必须）
				criteria.andIsDeleteEqualTo(0);
				if (StringTools.isNotNullAndHasValue(regdateSS)) {
					criteria.andRegdateGreaterThanOrEqualTo(regdateSS);
				}
				if (StringTools.isNotNullAndHasValue(regdateES)) {
					criteria.andRegdateLessThanOrEqualTo(regdateES);
				}
				if (StringTools.isNotNullAndHasValue(canceldateSS)) {
					criteria.andCanceldateGreaterThanOrEqualTo(canceldateSS);
				}
				if (StringTools.isNotNullAndHasValue(canceldateES)) {
					criteria.andCanceldateLessThanOrEqualTo(canceldateES);
				}
				if (StringTools.isNotNullAndHasValue(titleS)) {
					criteria.andTitleLike("%" + titleS.trim() + "%");
				}
				if (StringTools.isNotNullAndHasValue(type)) {
					criteria.andStateEqualTo(Integer.valueOf(type));
				}
				criteria.andUserSysNameEqualTo(SessionFactory.getSessionUserId());
				example.setOrderByClause("CREATE_TIME desc");

				// 记录条数的记录
				total = mapperBT.countByExample(example);
				// 分页
				example.or().setLimitValue(getRowStart(), getRowEnd());
				// 格式化result 一定要是JSONObject
				result = CommonLogic.getResult(total, mapperBT
						.selectByExampleWithBLOBs(example));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
			vexample = null;
			vcriteria = null;
		}
		return SUCCESS;
	}

	/**
	 * 列表
	 */
	public String listLoad() throws Exception {
		return SUCCESS;
	}

	// 已阅情况画面
	public String readedlistLoad() throws Exception {
		return SUCCESS;
	}

	/**
	 * 已阅情况grid数据
	 */
	public String readedgridLoad() throws Exception {
		B_T_Ufp_RoundReadingExample example = null;
		B_T_Ufp_RoundReadingExample.Criteria criteria = null;
		try {
			// 创建查询条件
			example = new B_T_Ufp_RoundReadingExample();
			criteria = example.createCriteria();
			// 添加页面查询条件
			if (StringTools.isNotNullAndHasValue(mainDocId)) {
				criteria.andRoundreadingIdEqualTo(mainDocId);
			}
			// 记录条数的记录
			total = mapperRRT.countByExample(example);

			example.setOrderByClause("CREATE_TIME desc");
			// 分页
			example.or().setLimitValue(getRowStart(), getRowEnd());

			// 格式化result 一定要是JSONObject
			result = CommonLogic.getResult(total, mapperRRT
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

	/*
	 * 导出
	 */
	public String export() throws Exception {
		B_T_Ufp_RoundReadingExample example = null;
		B_T_Ufp_RoundReadingExample.Criteria criteria = null;
		try {
			// 创建查询条件
			example = new B_T_Ufp_RoundReadingExample();
			criteria = example.createCriteria();
			// 添加页面查询条件
			if (StringTools.isNotNullAndHasValue(mainDocId)) {
				criteria.andRoundreadingIdEqualTo(mainDocId);
			}
			example.setOrderByClause("CREATE_TIME desc");
			// 根据条件取得流程基本信息列表
			list_B_T_Ufp_RoundReading = mapperRRT.selectByExample(example);
			if (list_B_T_Ufp_RoundReading.size() > 0) {
				rdtitle = list_B_T_Ufp_RoundReading.get(0).getTitle();
			}
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			criteria = null;
		}
		return SUCCESS;
	}

	// =====================Sset and get==============================//

	public String getUuid() {
		return uuid;
	}

	public List<B_T_Ufp_BulletinWithBLOBs> getList_B_T_Ufp_Bulletin() {
		return list_B_T_Ufp_Bulletin;
	}

	public void setList_B_T_Ufp_Bulletin(
			List<B_T_Ufp_BulletinWithBLOBs> listBTUfpBulletin) {
		list_B_T_Ufp_Bulletin = listBTUfpBulletin;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAllPermission() {
		return allPermission;
	}

	public void setAllPermission(String allPermission) {
		this.allPermission = allPermission;
	}

	public String getTitleS() {
		return titleS;
	}

	public void setTitleS(String titleS) {
		this.titleS = titleS;
	}

	public B_T_Ufp_RoundReading getB_T_Ufp_RoundReading() {
		return b_T_Ufp_RoundReading;
	}

	public void setB_T_Ufp_RoundReading(B_T_Ufp_RoundReading bTUfpRoundReading) {
		b_T_Ufp_RoundReading = bTUfpRoundReading;
	}

	public List<B_T_Ufp_RoundReading> getList_B_T_Ufp_RoundReading() {
		return list_B_T_Ufp_RoundReading;
	}

	public void setList_B_T_Ufp_RoundReading(
			List<B_T_Ufp_RoundReading> listBTUfpRoundReading) {
		list_B_T_Ufp_RoundReading = listBTUfpRoundReading;
	}

	public String getRdtitle() {
		return rdtitle;
	}

	public void setRdtitle(String rdtitle) {
		this.rdtitle = rdtitle;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getRegdateSS() {
		return regdateSS;
	}

	public void setRegdateSS(String regdateSS) {
		this.regdateSS = regdateSS;
	}

	public String getPublishdateSS() {
		return publishdateSS;
	}

	public void setPublishdateSS(String publishdateSS) {
		this.publishdateSS = publishdateSS;
	}

	public String getCanceldateSS() {
		return canceldateSS;
	}

	public void setCanceldateSS(String canceldateSS) {
		this.canceldateSS = canceldateSS;
	}

	public String getEndshowdateSS() {
		return endshowdateSS;
	}

	public void setEndshowdateSS(String endshowdateSS) {
		this.endshowdateSS = endshowdateSS;
	}

	public String getRegdateES() {
		return regdateES;
	}

	public void setRegdateES(String regdateES) {
		this.regdateES = regdateES;
	}

	public String getPublishdateES() {
		return publishdateES;
	}

	public void setPublishdateES(String publishdateES) {
		this.publishdateES = publishdateES;
	}

	public String getCanceldateES() {
		return canceldateES;
	}

	public void setCanceldateES(String canceldateES) {
		this.canceldateES = canceldateES;
	}

	public String getEndshowdateES() {
		return endshowdateES;
	}

	public void setEndshowdateES(String endshowdateES) {
		this.endshowdateES = endshowdateES;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public B_T_Ufp_BulletinWithBLOBs getB_T_Ufp_Bulletin() {
		return b_T_Ufp_Bulletin;
	}

	public void setB_T_Ufp_Bulletin(B_T_Ufp_BulletinWithBLOBs bTUfpBulletin) {
		b_T_Ufp_Bulletin = bTUfpBulletin;
	}

}
