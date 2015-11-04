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
 * ȡ�û�������
 * 
 * @author dongm
 * 
 */
public class GetBaseInfor {

	/**
	 * ȡ�ò��Ż�����Ϣ
	 * 
	 * @param valueOfOrderBy
	 *            �������ַ���
	 * @return ���Ż�����Ϣ����
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
	//�ϴ�
	private static String uploadId;
	
	public static List<C_T_Sys_Department> getDepartmentBaseInfor(
			String valueOfOrderBy) throws Exception {
		List<C_T_Sys_Department> listDepartment;

		C_T_Sys_DepartmentExample example = new C_T_Sys_DepartmentExample();
		C_T_Sys_DepartmentExample.Criteria criteria=example.createCriteria();
		criteria.andIsDeleteEqualTo(0);
		//���ݵ�¼�û���������λ�ж����ܿ���ȫ���û������Ǹ����û������鿴 �ж�������λ�Ƿ�Ϊadmin
	    	criteria.andUnitIdEqualTo(SessionFactory.getSessionUnitId());

		if (valueOfOrderBy.trim().length() > 0) {
			example.setOrderByClause(valueOfOrderBy);
		}
		example.or(criteria);
		// C_T_Sys_DepartmentMapper mapper = sqlSession
		// .getMapper(C_T_Sys_DepartmentMapper.class);
		// ��ѯ�����
		listDepartment = mapperDT.selectByExample(example);

		// �ر�������Դ
		// sqlSession.close();
		// sqlSession = null;

		return listDepartment;
	}
	/**
	 * ����unitid��ȡ��������
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
		// ��ѯ�����
		listDepartment = mapperDT.selectByExample(example);

		// �ر�������Դ
		// sqlSession.close();
		// sqlSession = null;

		return listDepartment;
	}
	
	/**
	 * ȡ���û�������Ϣ
	 * 
	 * @param valueOfOrderBy
	 *            �������ַ���
	 * @return ��λ������Ϣ����
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
	 * ȡ�õ�λ������Ϣ
	 * 
	 * @param valueOfOrderBy
	 *            �������ַ���
	 * @return ��λ������Ϣ����
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
	 * �����û�sys��nameȡ���û���������
	 * 
	 * @param valueOfOrderBy
	 *            �������ַ���
	 * @return ģ��Id
	 * @throws IOException
	 */
	public static String getUserChineseName(String sysName,String unit_id) throws Exception {
		List<C_T_Sys_User> listUser;
		C_T_Sys_UserExample example = new C_T_Sys_UserExample();
		example.or().andIsDeleteEqualTo(0).andUnitIdEqualTo(unit_id)
			.andUserSysNameEqualTo(sysName);

		// ��ѯ�����
		listUser = mapperUT.selectByExample(example);
		C_T_Sys_User user = new C_T_Sys_User();
		if (listUser.size() > 0){
			user = listUser.get(0);
		}
		return user.getUserName();
	}
	

	/**
	 * ����ģ������ȡ��ģ�������Ϣ�б�
	 * 
	 * @param ModuleId
	 *            ����
	 * @return ģ��
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
	 * ����ģ������ȡ����ģ�������Ϣ�б�
	 * 
	 * @param ModuleId
	 *            ����
	 * @return ģ��
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
	 * ����ģ��IDȡ�õ�ǰλ��
	 * 
	 * @param moduleId
	 *            ģ��Id
	 * @return ��ǰλ��
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
	 * ����UUIDȡ��ģ��ID
	 * 
	 * @param UUID
	 *            ģ��Id
	 * @return ��ǰλ��
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
