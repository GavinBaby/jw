package com.jw.magicbpm.action.publicinformation;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.dao.publicinformation.B_V_Ufp_MateriauseamountMapper;

public class MateriauseamountAction extends JwBaseAction implements	JwBaseActionI {

	/**
	 * 资料使用量排行榜管理action
	 */
	private static final long serialVersionUID = 1L;

	// 查询条件开始时间
	private String startTime;
	//结束时间
	private String endTime;
	@Resource
	B_V_Ufp_MateriauseamountMapper mapperMV;

	/**
	 * 列表画面加载
	 */
	public String listLoad() {
		return SUCCESS;
	}

	/**使用量
	 * Grid数据加载
	 */
	public String gridLoad()throws Exception {

		String tableName = "";
		String sql = "";
		String sql1 = "";
		Map<String, Object> map = new HashMap<String, Object>();

		if (StringTools.isNotNullAndHasValue(startTime)) {
			sql += " where CREATE_TIME >= '"+startTime+"'";
			sql1 += " and CREATE_TIME >= '"+startTime+"'";;
		}
		if (StringTools.isNotNullAndHasValue(endTime)) {
			if(sql.equals("")){
				sql += " where CREATE_TIME <= '"+endTime+"'";
			}
			else{
				sql += "and CREATE_TIME <= '"+endTime+"'";
			}
			sql1 += " and CREATE_TIME >= '"+endTime+"'";;
		}
		tableName = " (select  d.USER_NAME as user_id,b.FREQUENCY as upFREQUENCY,c.FREQUENCY as downFREQUENCY from " +
				"(select distinct user_id from B_T_UFP_MATERIA_USER" + sql +
				") a left join (select user_id,action,sum(FREQUENCY) as FREQUENCY from B_T_UFP_MATERIA_USER where action=0 " +sql1+
				" group by B_T_UFP_MATERIA_USER.USER_ID,B_T_UFP_MATERIA_USER.action) b on a.USER_ID = b.user_id left join " +
				"(select user_id,action,sum(FREQUENCY) as FREQUENCY from B_T_UFP_MATERIA_USER where action=1  " + sql1 +
				"group by USER_ID,action) c on a.USER_ID = c.user_id left join C_T_SYS_USER d on a.user_id = d.USER_SYS_NAME )";
		map.put("tableName", tableName);

		// 格式化result 一定要是JSONObject
		result = CommonLogic.getResult(total, mapperMV.selectByExample(map));
		return SUCCESS;
	}
	
	/**
	 * 列表画面加载
	 */
	public String listLoadlist() {

		return SUCCESS;
	}
	/**排行榜
	 * Grid数据加载
	 */
	public String gridLoadlist()throws Exception {

		String tableName = "";
		String sql = "";
		Map<String, Object> map = new HashMap<String, Object>();

		if (StringTools.isNotNullAndHasValue(startTime)) {
			sql += " and CREATE_TIME >= '"+startTime+"'";
			
		}
		if (StringTools.isNotNullAndHasValue(endTime)) {
			sql += "and CREATE_TIME <= '"+endTime+"'";
		}
		tableName = " (select B_T_UFP_MATERIA.UUID,B_T_UFP_MATERIA.MATERIA_TITLE,FREQUENCY from " +
				"(select  B_T_UFP_MATERIA_USER.MATERIA_ID,sum(FREQUENCY) as FREQUENCY from B_T_UFP_MATERIA_USER where ACTION = '1' " + sql +
				"group by MATERIA_ID ) a " +
				"left join B_T_UFP_MATERIA on a.MATERIA_ID = B_T_UFP_MATERIA.UUID order by FREQUENCY desc)";
		map.put("tableName", tableName);

		// 格式化result 一定要是JSONObject
		result = CommonLogic.getResult(total, mapperMV.selectByExample(map));
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

	public String detailsDelete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String detailsLoad() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String detailsUpdate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
}
