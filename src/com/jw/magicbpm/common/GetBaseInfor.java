package com.jw.magicbpm.common;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Flow_InforMapper;
import com.jw.baseframe.dao.C_T_Sys_DepartmentMapper;
import com.jw.baseframe.dao.C_T_Sys_FileMapper;
import com.jw.baseframe.dao.C_T_Sys_ModuleMapper;
import com.jw.baseframe.dao.C_T_Sys_UnitMapper;
import com.jw.baseframe.dao.C_T_Sys_UserMapper;
import com.jw.baseframe.model.C_T_Flow_Infor;
import com.jw.baseframe.model.C_T_Sys_Department;
import com.jw.baseframe.model.C_T_Sys_DepartmentExample;
import com.jw.baseframe.model.C_T_Sys_File;
import com.jw.baseframe.model.C_T_Sys_FileExample;
import com.jw.baseframe.model.C_T_Sys_Module;
import com.jw.baseframe.model.C_T_Sys_ModuleExample;
import com.jw.baseframe.model.C_T_Sys_Unit;
import com.jw.baseframe.model.C_T_Sys_UnitExample;
import com.jw.baseframe.model.C_T_Sys_User;
import com.jw.baseframe.model.C_T_Sys_UserExample;
import com.jw.baseframe.util.ReadProperties;


/**
 * 取得基础数据
 * 
 * @author dongm
 * 
 */
public class GetBaseInfor {

	/**
	 * 取得部门基本信息
	 * 
	 * @param valueOfOrderBy
	 *            排序用字符串
	 * @return 部门基本信息集合
	 * @throws IOException
	 */
	
	private static List<C_T_Sys_File> list_C_T_Sys_File;
	@Resource
	private static C_T_Sys_DepartmentMapper mapperDT;
	@Resource
	private static C_T_Sys_UserMapper mapperUT;
	@Resource
	private static C_T_Sys_UnitMapper mapperUNT;
	@Resource
	private static C_T_Sys_ModuleMapper mapperMT;
	@Resource
	private static C_T_Flow_InforMapper mapperFIT;
	@Resource
	private static C_T_Sys_FileMapper mapperFT;
	//上传
	private static String uploadId;
	
	public static List<C_T_Sys_Department> getDepartmentBaseInfor(
			String valueOfOrderBy) throws Exception {
		List<C_T_Sys_Department> listDepartment;

		C_T_Sys_DepartmentExample example = new C_T_Sys_DepartmentExample();
		C_T_Sys_DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andIsDeleteEqualTo(0);
		//根据登录用户的所属单位判断是能看到全部用户，还是根据用户名来查看 判断条件单位是否为admin
	    	criteria.andUnitIdEqualTo(SessionFactory.getSessionUnitId());

		if (valueOfOrderBy.trim().length() > 0) {
			example.setOrderByClause(valueOfOrderBy);
		}
		example.or(criteria);
		// C_T_Sys_DepartmentMapper mapper = sqlSession
		// .getMapper(C_T_Sys_DepartmentMapper.class);
		// 查询出结果
		listDepartment = mapperDT.selectByExample(example);

		// 关闭连接资源
		// sqlSession.close();
		// sqlSession = null;

		return listDepartment;
	}
	/**
	 * 根据unitid获取下属部门
	 * @param valueOfOrderBy
	 * @param unitid
	 * @param sqlSession
	 * @return
	 * @throws Exception
	 */
	public static List<C_T_Sys_Department> getDepartmentBaseInfor(
			String valueOfOrderBy,String unitid, SqlSession sqlSession) throws Exception {
		List<C_T_Sys_Department> listDepartment;

		C_T_Sys_DepartmentExample example = new C_T_Sys_DepartmentExample();
		C_T_Sys_DepartmentExample.Criteria criteria=example.createCriteria();
		if(unitid!=null&&!"".equals(unitid)){
			criteria.andUnitIdEqualTo(unitid);
		}
		criteria.andIsDeleteEqualTo(0);
	    	criteria.andUnitIdEqualTo(SessionFactory.getSessionUnitId());

		if (valueOfOrderBy.trim().length() > 0) {
			example.setOrderByClause(valueOfOrderBy);
		}
		example.or(criteria);
		// C_T_Sys_DepartmentMapper mapper = sqlSession
		// .getMapper(C_T_Sys_DepartmentMapper.class);
		// 查询出结果
		listDepartment = mapperDT.selectByExample(example);

		// 关闭连接资源
		// sqlSession.close();
		// sqlSession = null;

		return listDepartment;
	}
	
	/**
	 * 取得用户基本信息
	 * 
	 * @param valueOfOrderBy
	 *            排序用字符串
	 * @return 单位基本信息集合
	 * @throws IOException
	 */
	public static C_T_Sys_User getUserBaseInfor(String sysuser) throws Exception {
		List<C_T_Sys_User> listcolumn;
		C_T_Sys_User c_t_sys_user = new C_T_Sys_User() ;
		C_T_Sys_UserExample example = new C_T_Sys_UserExample();
		//
		example.or().andUserSysNameEqualTo(sysuser);
		
		listcolumn = mapperUT.selectByExample(example);
		if(listcolumn!=null&&listcolumn.size()>0)
			c_t_sys_user=listcolumn.get(0);
		return c_t_sys_user;
	}
	
	/**
	 * 取得单位基本信息
	 * 
	 * @param valueOfOrderBy
	 *            排序用字符串
	 * @return 单位基本信息集合
	 * @throws IOException
	 */
	public static List<C_T_Sys_Unit> getUnitBaseInfor(String valueOfOrderBy) throws Exception {
		List<C_T_Sys_Unit> listUnit;
		C_T_Sys_UnitExample example = new C_T_Sys_UnitExample();
		//
		example.or().andIsDeleteEqualTo(0);
		if (valueOfOrderBy.trim().length() > 0) {
			example.setOrderByClause(valueOfOrderBy);
		}
		listUnit = mapperUNT.selectByExample(example);
		return listUnit;
	}
	
	/**
	 * 根据用户sys—name取得用户中文名称
	 * 
	 * @param valueOfOrderBy
	 *            排序用字符串
	 * @return 模块Id
	 * @throws IOException
	 */
	public static String getUserChineseName(String sysName,String unit_id) throws Exception {
		List<C_T_Sys_User> listUser;
		C_T_Sys_UserExample example = new C_T_Sys_UserExample();
		example.or().andIsDeleteEqualTo(0).andUnitIdEqualTo(unit_id)
			.andUserSysNameEqualTo(sysName);

		// 查询出结果
		listUser = mapperUT.selectByExample(example);
		C_T_Sys_User user = new C_T_Sys_User();
		if (listUser.size() > 0){
			user = listUser.get(0);
		}
		return user.getUserName();
	}
	

	/**
	 * 根据模块描述取得模块基本信息列表
	 * 
	 * @param ModuleId
	 *            条件
	 * @return 模块
	 * @throws IOException
	 */
	public static List<C_T_Sys_Module> getModule()throws Exception {
		List<C_T_Sys_Module> list;
		C_T_Sys_ModuleExample example = new C_T_Sys_ModuleExample();
		example.or().andModuleIdLike("module%0000");
		list = mapperMT.selectByExample(example);
		return list;

	}
	/**
	 * 根据模块描述取得子模块基本信息列表
	 * 
	 * @param ModuleId
	 *            条件
	 * @return 模块
	 * @throws IOException
	 */
	public static List<C_T_Sys_Module> getModule(String module) throws Exception {
		List<C_T_Sys_Module> list;
		C_T_Sys_ModuleExample example = new C_T_Sys_ModuleExample();
		example.or().andParenModuleEqualTo(module);
		example.setOrderByClause("Sort asc");
		list = mapperMT.selectByExample(example);
		return list;

	}

	/**
	 * 根据模块ID取得当前位置
	 * 
	 * @param moduleId
	 *            模块Id
	 * @return 当前位置
	 * @throws IOException
	 */
	public static String getCurPosition(String moduleId)
			throws Exception {
		String path = "";
		C_T_Sys_ModuleExample example = new C_T_Sys_ModuleExample();
		example.or().andModuleIdEqualTo(moduleId);
		List<C_T_Sys_Module> list = mapperMT.selectByExample(example);
		if (null != list && list.size() > 0) {
			path = list.get(0).getModuleDescription();
		}
		return path;
	}

	/**
	 * 根据UUID取得模块ID
	 * 
	 * @param UUID
	 *            模块Id
	 * @return 当前位置
	 * @throws IOException
	 * */
	public static String getxml(String uuid)
			throws Exception {
		String xmlval = "";
		C_T_Flow_Infor c_T_Flow_Infor = new C_T_Flow_Infor();
		if (null != uuid) {
			c_T_Flow_Infor = mapperFIT.selectByPrimaryKey(uuid);
		}
		if (null != c_T_Flow_Infor) {
			xmlval = c_T_Flow_Infor.getXmlvalue();
		}
		return xmlval;
	}

	
	/*
	public static String uploadfile(String moduleId,String id,String mainId) throws Exception{
		C_T_Sys_FileExample example = new C_T_Sys_FileExample();
		example.or().andModuleIdEqualTo(moduleId).andFlgIdEqualTo(id).andMainIdEqualTo(mainId);
		
			example.setOrderByClause("CREATE_TIME");
			list_C_T_Sys_File = mapperFT.selectByExample(example);
			
		
		
			uploadId ="";
		for (int i = 0; i < list_C_T_Sys_File.size(); i++) {
			
			if (i == 0) {
				if(list_C_T_Sys_File.get(i).getFileSvaePath()==null)
				{
					uploadId = ReadProperties
					.getPropertiesDataById("UploadFileUrl")
					+ File.separator
					+ list_C_T_Sys_File.get(i).getFileSvaeName()+"*" + list_C_T_Sys_File.get(i).getFileName();
				}
				else{
					uploadId = ReadProperties
						.getPropertiesDataById("UploadFileUrl")
						+ list_C_T_Sys_File.get(i).getFileSvaePath()
						+ File.separator
						+ list_C_T_Sys_File.get(i).getFileSvaeName()+"*" + list_C_T_Sys_File.get(i).getFileName();
				}
			} else {
				if(list_C_T_Sys_File.get(i).getFileSvaePath()==null)
				{
					uploadId += "?"
						+ ReadProperties.getPropertiesDataById("UploadFileUrl")
						+ "/"
						+ list_C_T_Sys_File.get(i).getFileSvaeName()+"*" + list_C_T_Sys_File.get(i).getFileName();
				}
				else{
					uploadId += "?"
						+ ReadProperties.getPropertiesDataById("UploadFileUrl")
						+ list_C_T_Sys_File.get(i).getFileSvaePath()
						+ File.separator
						+ list_C_T_Sys_File.get(i).getFileSvaeName()+"*" + list_C_T_Sys_File.get(i).getFileName();
				}
			}
		}
		return uploadId;
	}
	*/
}
