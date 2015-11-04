package com.jw.magicbpm.action.publicinformation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.db.DbOperationFation;
import com.jw.baseframe.common.logic.CommonLogic;
import com.jw.baseframe.common.logic.FileIdUpdata;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.dao.C_T_Sys_FileMapper;
import com.jw.baseframe.dao.C_V_Sys_UsertreeMapper;
import com.jw.baseframe.model.C_T_Sys_File;
import com.jw.baseframe.model.C_T_Sys_FileExample;
import com.jw.baseframe.model.C_V_Sys_Usertree;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;
import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Mail_AttributeMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Mail_ContentMapper;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_Mail_RelationMapper;
import com.jw.magicbpm.dao.publicinformation.B_V_Ufp_MailMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Attribute;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Content;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_Mail_Relation;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Mail;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_MailExample;
import com.jw.magicbpm.model.publicinformation.B_V_Ufp_Mail_UnitDeptUserTree;
import com.opensymphony.xwork2.ActionContext;

/**
 *  电子邮件 2012—12-24
 */
public class MailAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * 版本标识
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// 模块ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MAIL;
	
	//单位部门人员树列表
	private List<B_V_Ufp_Mail_UnitDeptUserTree> listMailgetUnitDeptUserTree;
	
	//发件 实体
	private B_T_Ufp_Mail_Attribute b_T_Ufp_Mail_Attribute;	
	
	//收件 实体
	private B_T_Ufp_Mail_Relation b_T_Ufp_Mail_Relation;
	
	//正文表 实体
	private B_T_Ufp_Mail_Content b_T_Ufp_Mail_Content;

	//短信发送标志
	private String isSendMsg;
	//回执标志
	private String isReceipt;
	//URL-邮件类型标志
	private String mailType;
	//下拉框-邮件类型标志
	private String mailTypeS;
	//保存邮件到发件箱标志
	private String mailSaveSendFlag;

	//父页面用户中文名和系统名
	private String fieldName;
	private String fieldSysName;
	
	//是否转移:1或拷贝:2
	private String isTranferCopy;
	
	//是否新邮件 新:0 已收 1
	private String isNew;
	
	//存原稿
	private String isPaper;
	
	//附件名
	private String fileName="";
	
	//主题
	private String titleS;
	
	//发送时间
	private String sendTimeS;
	
	//是否回复:1或转发:2
	private String isReplyTrun;
	
	//1：显示抄送人 0:不显示
	private String copyFlag;
	
	//1：显示暗送人 0:不显示
	private String darkFlag;
	
	//全部恢复标志
	private String allReplyFlag;
	
	//显示全部恢复列表
	private List<B_V_Ufp_Mail> b_V_Ufp_Mail_list;
	
	//对应邮件附件名列表
	private List<String> fileNameList = new ArrayList<String>();
	
	//已阅标志
	private String isReadFlag;	
	
	// 显示已选人员树
	private List<C_V_Sys_Usertree> listMailselUserList;
	//已选的接收人ID
	private String userIds;
	//
	@Resource
	B_T_Ufp_Mail_RelationMapper mapperMRT;
	@Resource
	B_T_Ufp_Mail_AttributeMapper mapperMAT;
	@Resource
	B_T_Ufp_Mail_ContentMapper mapperMCT;
	@Resource
	C_T_Sys_FileMapper mapperFT;
	@Resource
	B_V_Ufp_MailMapper mapperMV;
	@Resource
	private C_V_Sys_UsertreeMapper mapperUTV;
	/**
	 * 电子邮件 删除
	 */
	public String detailsDelete() {
		B_T_Ufp_Mail_Relation b_T_Ufp_Mail_Relation = null;
		String resultMsg = null;
		if("3".equals(mailType)){
			DbOperationFation.deleteByExample("B_T_Ufp_Mail_Attribute", checkedIds, moduleId);	
			DbOperationFation.deleteByExample("B_T_Ufp_Mail_Relation", checkedIds, moduleId);	
			DbOperationFation.deleteByExample("B_T_Ufp_Mail_Content", checkedIds, moduleId);	
			resultMsg = Constants.DELETE_SUCCESSFUL_MSG;
		}else{
			if(StringTools.isNotNullAndHasValue(checkedIds)){
				String temps[] = checkedIds.split(",");
				for(String temp : temps){
					 b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(temp.trim());
					 b_T_Ufp_Mail_Relation.setReplyFlag(3);//垃圾箱和草稿箱标志
					 b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("3"));//垃圾箱
					 mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
				}
				resultMsg="已转到垃圾箱";
			}
		}
		sucessMessage(resultMsg);
		b_T_Ufp_Mail_Relation = null;
		return SUCCESS;
	}

	/**
	 * 电子邮件详细信息页面加载
	 */
	public String detailsLoad() throws Exception{
		allPermission = "*";
		C_T_Sys_FileExample example = null;
		B_T_Ufp_Mail_Relation recordRelation = null;
		B_V_Ufp_MailExample exampleVMail = null;
		B_V_Ufp_MailExample.Criteria criteriaVMail = null; 
		try {
			example = new C_T_Sys_FileExample();
			exampleVMail = new B_V_Ufp_MailExample();
			criteriaVMail = exampleVMail.createCriteria();
			
			if(StringTools.isNotNullAndHasValue(allReplyFlag)&&"1".equals(allReplyFlag)){
				//显示全部文件名
				if(StringTools.isNotNullAndHasValue(titleS)){
					criteriaVMail.andTitleLike("%"+titleS+"%");
				}
				criteriaVMail.andReplyFlagEqualTo(1);
				criteriaVMail.andSendTimeLessThanOrEqualTo(sendTimeS);
				exampleVMail.or().andTitleEqualTo(titleS).andReplyFlagEqualTo(1).andSendTimeLessThanOrEqualTo(sendTimeS).andSpecificRecsysUserIsNull();
				exampleVMail.setOrderByClause("SEND_TIME desc");
				b_V_Ufp_Mail_list = mapperMV.selectByExample(exampleVMail);
				String fileNameTemp = null;
				if(b_V_Ufp_Mail_list!=null){
					for(B_V_Ufp_Mail b_V_Ufp_Mail : b_V_Ufp_Mail_list){
						fileNameTemp = searchFileName(example,b_V_Ufp_Mail.getUuid());
						fileNameList.add(fileNameTemp);
					}
				}
				ActionContext.getContext().getSession().put("fileNameList", fileNameList);
			}
			// 当前登录人系统名
			String loginId = SessionFactory.getSessionUserId();
			b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
			b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
			b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
			fileName = searchFileName(example, mainDocId);
			mailSaveSendFlag = String.valueOf(b_T_Ufp_Mail_Relation.getMailType());
			isSendMsg = String.valueOf(b_T_Ufp_Mail_Attribute.getIsSendMsg());
			
			if(b_T_Ufp_Mail_Relation.getIsNew()!=null&&b_T_Ufp_Mail_Relation.getIsNew()==0){
				if(b_T_Ufp_Mail_Attribute.getIsReceipt()!=null&&b_T_Ufp_Mail_Attribute.getIsReceipt()==1){
					//修改 by：youjh  2015-10-21
					String uuid = new GUID().toString();
					
					B_T_Ufp_Mail_Attribute newMailAttribute=new B_T_Ufp_Mail_Attribute();
				    B_T_Ufp_Mail_Relation mailRelation=new B_T_Ufp_Mail_Relation();
				    
				    newMailAttribute.setUuid(uuid);
				    newMailAttribute.setTitle("回复：收到："+b_T_Ufp_Mail_Attribute.getTitle());
				    newMailAttribute.setSendTime(DateTools.getServerDateTime(10));
				    newMailAttribute.setCreateTime(DateTools.getServerDateTime(10));
				    newMailAttribute.setCreateUser(loginId);
				    newMailAttribute.setSendUser(SessionFactory.getSessionUserNm());
				    newMailAttribute.setSendSysUser(loginId);
				    newMailAttribute.setImportantLeve("3");
				    newMailAttribute.setPriorityLeve("3");
				    mapperMAT.insertSelective(newMailAttribute);
				    
			    	mailRelation.setUuid(uuid);
					mailRelation.setMailContentId(uuid);
					mailRelation.setMailAttributeId(uuid);
					mailRelation.setMailType(new Long(4));
					mailRelation.setUserId(b_T_Ufp_Mail_Attribute.getSendSysUser());
					mailRelation.setCreateTime(DateTools.getServerDateTime(10));
					mailRelation.setReceiverTime(DateTools.getServerDateTime(10));
					mailRelation.setReplyFlag(1);
					mailRelation.setCreateUser(loginId);
					mailRelation.setSpecificRecsysUser(b_T_Ufp_Mail_Attribute.getSendSysUser());
					mailRelation.setUserName(SessionFactory.getSessionUserNm());
				    
					mapperMRT.insertSelective(mailRelation);
					
					//插入邮件正文表
					b_T_Ufp_Mail_Content.setUuid(uuid);
					b_T_Ufp_Mail_Content.setContent("回复：您发送的邮件已收到：" +
							""+b_T_Ufp_Mail_Content.getContent()+"" +
									"发送人:"+SessionFactory.getSessionUserNm());
					mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
					addForAllRecUser(uuid);
					
				}
			}
			
			//阅读邮件
			recordRelation = updateIsNewMail(recordRelation, loginId);
			
			String copySysUser = b_T_Ufp_Mail_Attribute.getCopySysUser();
			String darkSysUser = b_T_Ufp_Mail_Attribute.getDarkSysUser();
			copyDarkUserShow(loginId, copySysUser, darkSysUser);
		} catch (Exception e) {
			throw e;
		} finally {
			// 释放资源
			example = null;
			recordRelation= null;
			exampleVMail = null;
			criteriaVMail = null; 
		}
		return SUCCESS;
	}

	/**
	 * 查询邮件对应的附件名
	 * @param mapperFile
	 * @param example
	 * @param criteria
	 */
	private String searchFileName( C_T_Sys_FileExample example,String uuid) {
		example.clear();
		example.or().andMainIdEqualTo(uuid);
		List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
		String temp = "";
		newFileIds = "";
		if(listFile!=null){
			for(C_T_Sys_File c_T_Sys_File : listFile){
				temp = temp + "\t" + c_T_Sys_File.getFileName();
				if(StringTools.isNotNullAndHasValue(newFileIds)){
					newFileIds = newFileIds +"?"+ c_T_Sys_File.getUuid();
				}else{
					newFileIds = c_T_Sys_File.getUuid();
				}
			}
		}
		return temp;
	}

	/**
	 * 更新邮件状态，变为已读邮件
	 * @param mapperRelation
	 * @param recordRelation
	 * @param loginId
	 * @return
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private B_T_Ufp_Mail_Relation updateIsNewMail(B_T_Ufp_Mail_Relation recordRelation, String loginId) throws IllegalAccessException, UnsupportedEncodingException {
		if(loginId.equals(b_T_Ufp_Mail_Relation.getSpecificRecsysUser())){
			//如果是收件人打开邮件，就更新邮件状态
			recordRelation = new B_T_Ufp_Mail_Relation();
			b_T_Ufp_Mail_Relation.setIsNew(1);//已阅邮件
			mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
			
		}
		return recordRelation;
	}

	/**
	 * 判断是否显示抄送人和暗送人
	 * @param loginId:当前用户
	 * @param copySysUser：抄送人
	 * @param darkSysUser：暗送人
	 */
	private void copyDarkUserShow(String loginId, String copySysUser, String darkSysUser) {
		if(StringTools.isNotNullAndHasValue(copySysUser)){
			if(copySysUser.indexOf(loginId)>-1){
				copyFlag = "1";//显示抄送人
			}else{
				copyFlag = "0";
			}
		}else{
			copyFlag = "0";
		}
		if(StringTools.isNotNullAndHasValue(darkSysUser)){
			if(darkSysUser.indexOf(loginId)>-1){
				darkFlag = "1";//显示暗送人
			}else{
				darkFlag = "0";
			}
		}else{
			darkFlag = "0";
		}
	}
	
	/**
	 * 电子邮件详细信息新建或修改
	 */
	public String detailsUpdate()throws Exception {
		// 取得数据连接
		B_T_Ufp_Mail_Attribute record = null;
		B_T_Ufp_Mail_Relation recordRelation = null;
		B_T_Ufp_Mail_Content recordContent = null;
		C_T_Sys_FileExample example = null;
		C_T_Sys_FileExample.Criteria criteria = null; 
		try {
		example = new C_T_Sys_FileExample();
		criteria = example.createCriteria();
		// 创建需要更新的记录集合
		record = new B_T_Ufp_Mail_Attribute();
		recordRelation = new B_T_Ufp_Mail_Relation();
		recordContent = new B_T_Ufp_Mail_Content();
		String returnMsg = null;
		String sendTime = DateTools.getServerDateTime(10);
		String sendUser = SessionFactory.getSessionUserNm();
		String sendSysUser = SessionFactory.getSessionUserId();

		if (StringTools.isNullOrNoValue(isTranferCopy)) {
			if (StringTools.isNullOrNoValue(mainDocId)) {
				returnMsg = saveMail(record, recordRelation, recordContent, sendTime, sendUser, sendSysUser,1,example,criteria);
			} else {
				if(isPaper!=null&&("2".equals(isPaper)||"".equals(isPaper))){
					DbOperationFation.deleteByExample("B_T_Ufp_Mail_Attribute", mainDocId, moduleId);	
					DbOperationFation.deleteByExample("B_T_Ufp_Mail_Relation", mainDocId, moduleId);	
					DbOperationFation.deleteByExample("B_T_Ufp_Mail_Content", mainDocId, moduleId);	
					returnMsg = saveMail(record, recordRelation, recordContent, sendTime, sendUser, sendSysUser,1,example,criteria);
				}else{
					returnMsg = replyTrunMail(record, recordRelation, recordContent, sendTime, sendUser, sendSysUser,example,criteria);
				}
			}
		} else {
			//转移拷贝(isTranferCopy)信件设置
			if(!"".equals(checkedIds)){
				String temps[] = checkedIds.split(",");
				for(String temp : temps){
					b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(temp.trim());
					if("1".equals(isTranferCopy)){
						//转移至
						tranferMail(recordRelation);
					}else if("2".equals(isTranferCopy)){
						//拷贝至
						copyMail(record, recordRelation, recordContent, temp.trim(),example,criteria);
					}
				}
			}
		}
		sucessMessage(returnMsg);	
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
	 * 回复，转发邮件
	 * @param sqlSession
	 * @param mapper
	 * @param mapperRelation
	 * @param mapperContent
	 * @param record
	 * @param recordRelation
	 * @param recordContent
	 * @param sendTime
	 * @param sendUser
	 * @param sendSysUser
	 * @return
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private String replyTrunMail(B_T_Ufp_Mail_Attribute record, B_T_Ufp_Mail_Relation recordRelation, B_T_Ufp_Mail_Content recordContent, String sendTime, String sendUser, String sendSysUser,C_T_Sys_FileExample example,C_T_Sys_FileExample.Criteria criteria) throws IllegalAccessException, UnsupportedEncodingException {
		String returnMsg;
		String uuid = new GUID().toString();
		// 更新附件表的主文档ID
		String isFile = null;
		try {
			replyMailFile(example, criteria, uuid);
			criteria.andMainIdEqualTo(uuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if(listFile!=null){
				if(listFile.size()>0){
					isFile = "1";//有附件
				}else{
					isFile = "0";//没有附件
				}
			}else{
				isFile = "0";//没有附件
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//收件人未收邮件
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);
		b_T_Ufp_Mail_Relation.setReplyFlag(1);// 正常回复
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//有无附件
		if(b_T_Ufp_Mail_Relation!=null){
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(b_T_Ufp_Mail_Relation.getUserId());
		}
		
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		//插入邮件属性表
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);//回复时：发件箱中的发送时间
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//回执选项
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		//插入邮件正文表
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(recordContent);
		
		
		// 发件箱显示
		String newUuid = new GUID().toString();
		String isNewFile = null;
		// 更新附件表的主文档ID
		try {
			replyMailFile(example,criteria,newUuid);	
			
			example.clear();
			criteria = example.createCriteria();
			criteria.andMainIdEqualTo(newUuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if(listFile!=null){
				if(listFile.size()>0){
					isNewFile = "1";//有附件
				}else{
					isNewFile = "0";//没有附件
				}
			}else{
				isNewFile = "0";//没有附件
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		b_T_Ufp_Mail_Relation.setUuid(newUuid);
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("1"));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);
		b_T_Ufp_Mail_Relation.setReplyFlag(2);// 自己发的回复信息
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isNewFile));//有无附件
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		// 插入邮件属性表
		b_T_Ufp_Mail_Attribute.setUuid(newUuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);// 回复时：发件箱中的发送时间
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));// 回执选项
		b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//是否发送短消息
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		// 插入邮件正文表
		b_T_Ufp_Mail_Content.setUuid(newUuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
		
		if ("0".equals(isReplyTrun)) {
			returnMsg = "回复成功!";
		}else if("1".equals(isReplyTrun)){
			returnMsg = "转发成功!";
		}else{
			returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
		}
		return returnMsg;
	}

	/**
	 * 给回复,转发邮件设置附件
	 * @param mapperFile
	 * @param example
	 * @param criteria
	 * @param uuid
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void replyMailFile(C_T_Sys_FileExample example, C_T_Sys_FileExample.Criteria criteria, String uuid) throws Exception{
		//newFileIds原始附件主键
		if (StringTools.isNotNullAndHasValue(newFileIds)) {
			//将新增附件保存进当前回复中
			//修改by：youjh 2015-10-21
			newFileIds = newFileIds.replaceAll("[?]", "%3F");
			String[] listTemp = newFileIds.split("%3F");
			C_T_Sys_File c_T_Sys_File = null;
			//设置转发邮件附件
			for (String temp : listTemp) {
				if (StringTools.isNotNullAndHasValue(temp.trim())) {
					 c_T_Sys_File = mapperFT.selectByPrimaryKey(temp);
					 if(c_T_Sys_File!=null){
						c_T_Sys_File.setUuid(new GUID().toString());
						c_T_Sys_File.setMainId(uuid);// 回复(转发)邮件主键
						mapperFT.insertSelective(c_T_Sys_File);
					} else {
						//如果是逻辑删除附件,则可以恢复原始邮件附件
						criteria.andMainIdEqualTo(mainDocId);
						criteria.andIsDeleteEqualTo(1);
						List<C_T_Sys_File> c_T_Sys_File_list = mapperFT.selectByExample(example);
						if(c_T_Sys_File_list!=null){
							for(C_T_Sys_File file : c_T_Sys_File_list){
								file.setUuid(new GUID().toString());
								file.setMainId(mainDocId);//回复原始邮件附件
								file.setIsDelete(0);
								mapperFT.insertSelective(file);
							}
						}
					}
				}

			}//--for
		}
	}



	/**
	 * 转移邮件到对应邮箱
	 * @param sqlSession
	 * @param mapperRelation
	 * @param recordRelation
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private void tranferMail(B_T_Ufp_Mail_Relation recordRelation) throws Exception {
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		if("7".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(1);//1:转移到收件箱标记
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("7"));
			//转移至收件箱设置特定收件人为当前登录人
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(SessionFactory.getSessionUserId());
		}else if("1".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(4);//4:转移到发件箱标记
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("1"));
		}else{
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//3:转移到垃圾箱或者草稿箱标记
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		}
		mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
	}

	/**
	 * 拷贝至对应邮箱
	 * @param sqlSession
	 * @param mapper
	 * @param mapperRelation
	 * @param mapperContent
	 * @param record
	 * @param recordRelation
	 * @param recordContent
	 * @param temp
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private void copyMail(B_T_Ufp_Mail_Attribute record, B_T_Ufp_Mail_Relation recordRelation, B_T_Ufp_Mail_Content recordContent, String temp,C_T_Sys_FileExample example,C_T_Sys_FileExample.Criteria criteria) throws IllegalAccessException, UnsupportedEncodingException {
		String uuid = new GUID().toString();		
		//拷贝邮件时同时拷贝邮件带的附件
		criteria.andMainIdEqualTo(temp.trim());
		List<C_T_Sys_File> c_T_Sys_File_list = mapperFT.selectByExample(example);
		if (c_T_Sys_File_list != null) {
			for (C_T_Sys_File file : c_T_Sys_File_list) {
				file.setUuid(new GUID().toString());
				file.setMainId(uuid);// 设置原始邮件附件
				mapperFT.insertSelective(file);
			}
		}
		//插入邮件关联表
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		if("1".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(4);//拷贝至发件箱:4
		}else if("7".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(1);//收件箱:1
			//拷贝至收件箱设置特定收件人为当前登录人
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(SessionFactory.getSessionUserId());
		}else if("2".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//草稿箱:3
		}else if("3".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//垃圾箱:3
		}
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		//插入邮件属性表
		b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(temp);
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		//插入邮件正文表
		b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(temp);
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
	}

	/**
	 * 发邮件时保存邮件,并发送邮件
	 * @param sqlSession
	 * @param mapper
	 * @param mapperRelation
	 * @param mapperContent
	 * @param record
	 * @param recordRelation
	 * @param recordContent
	 * @param sendTime
	 * @param sendUser
	 * @param sendSysUser
	 * @return
	 */
	private String saveMail(B_T_Ufp_Mail_Attribute record, B_T_Ufp_Mail_Relation recordRelation, B_T_Ufp_Mail_Content recordContent, String sendTime, 
			String sendUser, String sendSysUser,int replyFlag,C_T_Sys_FileExample example,C_T_Sys_FileExample.Criteria criteria) 
	throws Exception {
		String returnMsg;
		// 向邮件属性表 添加
		String uuid = new GUID().toString();
		String isFile = null;
		//所有收邮件人:收件人、抄送人和暗送人
		String allReceiverSysUser = null;
		if(b_T_Ufp_Mail_Relation!=null){
			allReceiverSysUser = b_T_Ufp_Mail_Relation.getUserId();
			if(b_T_Ufp_Mail_Attribute!=null){
				if(StringTools.isNotNullAndHasValue(allReceiverSysUser)){
					allReceiverSysUser = allReceiverSysUser + "," + b_T_Ufp_Mail_Attribute.getCopySysUser()+","+b_T_Ufp_Mail_Attribute.getDarkSysUser();
				}else{
					allReceiverSysUser = b_T_Ufp_Mail_Attribute.getCopySysUser()+","+b_T_Ufp_Mail_Attribute.getDarkSysUser();
				}
			}
		}else{
			allReceiverSysUser = "";
			if(b_T_Ufp_Mail_Attribute!=null){
				if(StringTools.isNotNullAndHasValue(allReceiverSysUser)){
					allReceiverSysUser = allReceiverSysUser + "," + b_T_Ufp_Mail_Attribute.getCopySysUser()+","+b_T_Ufp_Mail_Attribute.getDarkSysUser();
				}else{
					allReceiverSysUser = b_T_Ufp_Mail_Attribute.getCopySysUser()+","+b_T_Ufp_Mail_Attribute.getDarkSysUser();
				}
			}
		}
		
		try{
			// 更新附件表的主文档ID
			FileIdUpdata.Updata(newFileIds, uuid);
			criteria.andMainIdEqualTo(uuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if (listFile != null) {
				if (listFile.size() > 0) {
					isFile = "1";// 有附件
				} else {
					isFile = "0";// 没有附件
				}
			} else {
				isFile = "0";// 没有附件
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//回执
		//b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//是否发送短消息
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		// 向邮件联系表添加(发送箱里面的邮件特定收件人统一不设置)
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		if(StringTools.isNullOrNoValue(isPaper)){
			if("false".equals(mailType)){
				//未勾选保存至发件箱复选框,则保存至垃圾箱
				b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("3"));
				b_T_Ufp_Mail_Relation.setReplyFlag(3);//垃圾箱标志：3
			}else{
				//1:默认勾选保存至发件箱 
				b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(booleanToString(mailType)));
				b_T_Ufp_Mail_Relation.setReplyFlag(replyFlag);//收邮件默认值:1
			}
		}else{
			mailType = "2";
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailType));//存原稿保存至草稿箱
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//存草稿箱标志:3
		}
		b_T_Ufp_Mail_Relation.setIsNew(0);// 新邮件
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);//未收邮件日期为发件日期
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//有无附件标志
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		// 向邮件正文表添加
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
		
		//给所有收邮件人:收件人、抄送人和暗送人发邮件
		String isuserxt="";
		if(StringTools.isNullOrNoValue(isPaper)||!"2".equals(isPaper)){
			if(StringTools.isNotNullAndHasValue(allReceiverSysUser)){
				String temps[] = allReceiverSysUser.split(",");
				String guid = null;
				for(String temp : temps){
					if(isuserxt.indexOf(temp)<0){
						if(StringTools.isNotNullAndHasValue(temp.trim())){
							guid = new GUID().toString();
							addForAllRecUser(guid);
		
							String darkSysUser = b_T_Ufp_Mail_Attribute.getDarkSysUser();
							//循环变量值包含在暗送人中时，设置信息
							if(darkSysUser.indexOf(temp)>-1){
								b_T_Ufp_Mail_Attribute.setTipDarkInfo("你是这封邮件的密送人，所以不会显示在收件人中。");
							}
							
							b_T_Ufp_Mail_Attribute.setUuid(guid);
							b_T_Ufp_Mail_Attribute.setSendTime(sendTime);
							b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
							b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
							b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//回执
							//b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//是否发送短消息
							mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
							// 向邮件联系表添加
							b_T_Ufp_Mail_Relation.setUuid(guid);
							b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("7"));//7:发邮件时，发送给所有收邮件人(allReceiverSysUser)的邮件标志
							b_T_Ufp_Mail_Relation.setIsNew(0);// 新邮件
							b_T_Ufp_Mail_Relation.setMailAttributeId(guid);
							b_T_Ufp_Mail_Relation.setMailContentId(guid);
							b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);//未收邮件日期为发件日期
							b_T_Ufp_Mail_Relation.setReplyFlag(replyFlag);//收邮件默认值:1
							b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//有无附件标志
							b_T_Ufp_Mail_Relation.setSpecificRecsysUser(temp);//设置指定收件人系统名
							mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
							// 向邮件正文表添加
							b_T_Ufp_Mail_Content.setUuid(guid);
							mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
						}
						if(isuserxt.equals("")){
							isuserxt+=","+temp+",";
						}else{
							isuserxt+=temp+",";
						}
					}
				}
			}
		}
		returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
		return returnMsg;
	}

	/**
	 * 给所有收件人的邮件附上附件
	 * @param mapperFile
	 * @param guid
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private void addForAllRecUser(String guid) throws Exception {
		//newFileIds所有原始附件主键(发邮件时，给每个收邮件的附上附件)
		if (StringTools.isNotNullAndHasValue(newFileIds)) {
			//将新增附件保存进当前回复中
			//修改by：youjh 2015-10-21
			newFileIds = newFileIds.replaceAll("[?]", "%3F");
			String[] listTemp = newFileIds.split("%3F");
			C_T_Sys_File c_T_Sys_File = null;
			//设置回复邮件附件
			for (String file : listTemp) {
				if (StringTools.isNotNullAndHasValue(file.trim())) {
					 c_T_Sys_File = mapperFT.selectByPrimaryKey(file);
					 if(c_T_Sys_File!=null){
						c_T_Sys_File.setUuid(new GUID().toString());
						c_T_Sys_File.setMainId(guid);// 回复邮件主键
						mapperFT.insertSelective(c_T_Sys_File);
					} 
				}
			}
		}
	}

	private String booleanToString(String flag) {
		if("false".equals(flag)){
			flag = "0";
		}else if("true".equals(flag)){
			flag = "1";
		}
		return flag;
	}
	
	/**
	 * 电子邮件列表加载
	 */
	public String listLoad() {

		return SUCCESS;
	}
	
	/**
	 * 电子邮件发邮件列表加载
	 */
	public String sendlistLoad() {
		allPermission = "*";
		
		String sendUser = SessionFactory.getSessionUserNm();
		String sendSysUser = SessionFactory.getSessionUserId();
		if (StringTools.isNotNullAndHasValue(mainDocId)) {
			if("1".equals(isReplyTrun)){
				//转发邮件
				b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Attribute.setTitle(titleS);
				b_T_Ufp_Mail_Relation.setUserId("");
				b_T_Ufp_Mail_Relation.setUserName("");
				//回复时，清空抄送人和密送人
				b_T_Ufp_Mail_Attribute.setCopySysUser("");
				b_T_Ufp_Mail_Attribute.setCopyUser("");
				b_T_Ufp_Mail_Attribute.setDarkSysUser("");
				b_T_Ufp_Mail_Attribute.setDarkUser("");
				String receiptText = String.valueOf(b_T_Ufp_Mail_Attribute.getIsReceipt());
				checkBoxIsChecked(receiptText);
			}else if("0".equals(isReplyTrun)){
				//回复邮件
				b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation.setUserId(b_T_Ufp_Mail_Attribute.getSendSysUser());
				b_T_Ufp_Mail_Relation.setUserName(b_T_Ufp_Mail_Attribute.getSendUser());
				b_T_Ufp_Mail_Attribute.setTitle(titleS);
				b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
				b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
				//回复时，清空抄送人和密送人
				b_T_Ufp_Mail_Attribute.setCopySysUser("");
				b_T_Ufp_Mail_Attribute.setCopyUser("");
				b_T_Ufp_Mail_Attribute.setDarkSysUser("");
				b_T_Ufp_Mail_Attribute.setDarkUser("");
				//回复邮件去掉原始邮件的附件
				newFileIds = "";
				b_T_Ufp_Mail_Attribute.setUuid("");
				b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
				String receiptText = String.valueOf(b_T_Ufp_Mail_Attribute.getIsReceipt());
				checkBoxIsChecked(receiptText);					
			}
			if("2".equals(mailType)){
				b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
				mailSaveSendFlag="1";//默认勾选保存至发件箱
				isReceipt = b_T_Ufp_Mail_Attribute.getIsReceipt().toString();//默认不勾选回执
				isSendMsg = b_T_Ufp_Mail_Attribute.getIsSendMsg().toString();//默认不勾选发送短信
			}
		} else {
			//发邮件
			if (b_T_Ufp_Mail_Attribute == null) {
				b_T_Ufp_Mail_Attribute = new B_T_Ufp_Mail_Attribute();
				b_T_Ufp_Mail_Attribute.setSendUser(SessionFactory.getSessionUserNm());
				b_T_Ufp_Mail_Attribute.setImportantLeve("2");
				b_T_Ufp_Mail_Attribute.setPriorityLeve("2");
				mailSaveSendFlag="1";//默认勾选保存至发件箱
				isReceipt = "0";//默认不勾选回执
				isSendMsg = "0";//默认不勾选发送短信
			}
		}
		return SUCCESS;
	}

	/**
	 * 复选框是否勾选
	 * @param receiptText
	 */
	private void checkBoxIsChecked(String receiptText) {
		if(StringTools.isNotNullAndHasValue(receiptText)){
			if("false".equals(receiptText)){
				isReceipt = "0";
			}else if("true".equals(receiptText)){
				isReceipt = "1";
			}else{
				isReceipt = receiptText;
			}
		}else{
			isReceipt = "0";
		}
		if(StringTools.isNotNullAndHasValue(mailSaveSendFlag)){
			if("false".equals(mailType)){
				mailSaveSendFlag = "0";
			}else if("true".equals(mailType)){
				mailSaveSendFlag = "1";
			}else{
				mailSaveSendFlag = "1";
			}
		}else{
			mailSaveSendFlag = "1";
		}
		if(StringTools.isNotNullAndHasValue(isSendMsg)){
			if("false".equals(isSendMsg)){
				isSendMsg = "0";
			}else if("true".equals(isSendMsg)){
				isSendMsg = "1";
			}
		}else{
			isSendMsg = "0";
		}
	}
	
	/**
	 * 单位部门人员页面加载
	 */
	public String unitDeptUserlistLoad() {
		return SUCCESS;
	}
	
	/**
	 * 电子邮件 Grid数据加载
	 */
	public String gridLoad() {
		B_V_Ufp_MailExample example = null;
		B_V_Ufp_MailExample.Criteria criteria = null; 

		// 创建查询条件
		example = new B_V_Ufp_MailExample();
		criteria = example.createCriteria();
		String userSysName = SessionFactory.getSessionUserId();
		criteria.andIsDeleteEqualTo(0);		
		
		if(StringTools.isNotNullAndHasValue(isNew)){
			criteria.andIsNewEqualTo(Integer.valueOf(isNew));
		}
		
		if(StringTools.isNotNullAndHasValue(mailType)){
			if(mailType.length()>1){
				criteria.andSpecificRecsysUserEqualTo(userSysName);
				String temps[] = mailType.split(",");
				List<Long> listType = new ArrayList<Long>();
				for(String temp : temps){
					listType.add(Long.valueOf(temp));
				}
				criteria.andMailTypeIn(listType);
				if(StringTools.isNotNullAndHasValue(isNew)){
					example.or().andSpecificRecsysUserEqualTo(userSysName).andIsNewEqualTo(Integer.valueOf(isNew)).andReplyFlagEqualTo(1);
				}else{
					//收邮件显示所有邮件
					example.or().andSpecificRecsysUserEqualTo(userSysName).andReplyFlagEqualTo(1);
				}
			}else{
				if("1".equals(mailType)){
					//发件箱邮件
					criteria.andMailTypeEqualTo(Long.valueOf(mailType));
					criteria.andSendSysUserEqualTo(userSysName);
					//同时显示拷贝至发件箱
					example.or().andReplyFlagEqualTo(4);
				}else{
					//垃圾箱和草稿箱
					criteria.andMailTypeEqualTo(Long.valueOf(mailType));
					criteria.andReplyFlagEqualTo(3);
				}
			}
		}
		
		// 记录条数的记录
		total = mapperMV.countByExample(example);		
		// 分页
		example.or().setLimitValue(getRowStart(), getRowEnd());		
		// 添加排序
		if (sort != null && !"".equals(sort) && order != null && !"".equals(order)) {
			if("sendUser".equals(sort)){
				sort = "SEND_USER";
			}else if("title".equals(sort)){
				sort = "title";
			}else if("sendTime".equals(sort)){
				sort = "send_time";
			}else if("isNew".equals(sort)){
				sort = "is_new";
			}else if("receiverTime".equals(sort)){
				sort = "receiver_time";
			}else if("receiverUser".equals(sort)){
				sort = "receiver_user";
			}
			example.setOrderByClause(sort + " " + order);
		}

		// 格式化result 一定要是JSONObject
		result = CommonLogic.getResult(total, mapperMV.selectByExample(example));

		return SUCCESS;
	}

	/**
	 * 获取单位部门人员树
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String unitDeptUserTree(){
		String where = "1=1";
		listMailgetUnitDeptUserTree = DbOperationFation.getTreeDataForJson("B_V_Ufp_Mail_UnitDeptUserTree", "pid", "uuid",
				"NAME", where);
		return SUCCESS;
	}
	
	/**
	 * 显示已选人员树
	 * @return
	 */
	public String selUserList(){
		Map<String, Object> map = new HashMap<String, Object>();
		String Ids = "";
		try {
			String[] users = userIds.split(",");
			for(String id:users){
				if("".equals(Ids)&&StringTools.isNotNullAndHasValue(id)){
					Ids = "'"+id+"'";
				}else if(StringTools.isNotNullAndHasValue(id)){
					Ids = Ids+",'"+id+"'";
				}
			}
			if(StringTools.isNotNullAndHasValue(Ids)){
				Ids = "("+Ids+")";
				map.put("userIds", Ids);
				listMailselUserList = mapperUTV.selectMailUserByMap(map);
			}else{
				listMailselUserList = new ArrayList<C_V_Sys_Usertree>();
			}
		} catch (Exception e) {
		} finally {
			map = null;
		}
		return SUCCESS;
	}
	
	/**************************** get set方法 **********************************************************************/
	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public B_T_Ufp_Mail_Attribute getB_T_Ufp_Mail_Attribute() {
		return b_T_Ufp_Mail_Attribute;
	}

	public void setB_T_Ufp_Mail_Attribute(B_T_Ufp_Mail_Attribute bTUfpMailAttribute) {
		b_T_Ufp_Mail_Attribute = bTUfpMailAttribute;
	}

	public B_T_Ufp_Mail_Relation getB_T_Ufp_Mail_Relation() {
		return b_T_Ufp_Mail_Relation;
	}

	public void setB_T_Ufp_Mail_Relation(B_T_Ufp_Mail_Relation bTUfpMailRelation) {
		b_T_Ufp_Mail_Relation = bTUfpMailRelation;
	}

	public List<B_V_Ufp_Mail_UnitDeptUserTree> getListMailgetUnitDeptUserTree() {
		return listMailgetUnitDeptUserTree;
	}

	public void setListMailgetUnitDeptUserTree(List<B_V_Ufp_Mail_UnitDeptUserTree> listMailgetUnitDeptUserTree) {
		this.listMailgetUnitDeptUserTree = listMailgetUnitDeptUserTree;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldSysName() {
		return fieldSysName;
	}

	public void setFieldSysName(String fieldSysName) {
		this.fieldSysName = fieldSysName;
	}

	public String getIsSendMsg() {
		return isSendMsg;
	}

	public void setIsSendMsg(String isSendMsg) {
		this.isSendMsg = isSendMsg;
	}

	public String getIsReceipt() {
		return isReceipt;
	}

	public void setIsReceipt(String isReceipt) {
		this.isReceipt = isReceipt;
	}

	public String getMailType() {
		return mailType;
	}

	public void setMailType(String mailType) {
		this.mailType = mailType;
	}

	public B_T_Ufp_Mail_Content getB_T_Ufp_Mail_Content() {
		return b_T_Ufp_Mail_Content;
	}

	public void setB_T_Ufp_Mail_Content(B_T_Ufp_Mail_Content bTUfpMailContent) {
		b_T_Ufp_Mail_Content = bTUfpMailContent;
	}

	public String getMailTypeS() {
		return mailTypeS;
	}

	public void setMailTypeS(String mailTypeS) {
		this.mailTypeS = mailTypeS;
	}

	public String getIsTranferCopy() {
		return isTranferCopy;
	}

	public void setIsTranferCopy(String isTranferCopy) {
		this.isTranferCopy = isTranferCopy;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getIsPaper() {
		return isPaper;
	}

	public void setIsPaper(String isPaper) {
		this.isPaper = isPaper;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitleS() {
		return titleS;
	}

	public void setTitleS(String titleS) {
		this.titleS = titleS;
	}

	public String getIsReplyTrun() {
		return isReplyTrun;
	}

	public void setIsReplyTrun(String isReplyTrun) {
		this.isReplyTrun = isReplyTrun;
	}

	public String getCopyFlag() {
		return copyFlag;
	}

	public void setCopyFlag(String copyFlag) {
		this.copyFlag = copyFlag;
	}

	public String getDarkFlag() {
		return darkFlag;
	}

	public void setDarkFlag(String darkFlag) {
		this.darkFlag = darkFlag;
	}

	public String getMailSaveSendFlag() {
		return mailSaveSendFlag;
	}

	public void setMailSaveSendFlag(String mailSaveSendFlag) {
		this.mailSaveSendFlag = mailSaveSendFlag;
	}

	public String getAllReplyFlag() {
		return allReplyFlag;
	}

	public void setAllReplyFlag(String allReplyFlag) {
		this.allReplyFlag = allReplyFlag;
	}

	public String getSendTimeS() {
		return sendTimeS;
	}

	public void setSendTimeS(String sendTimeS) {
		this.sendTimeS = sendTimeS;
	}

	public List<B_V_Ufp_Mail> getB_V_Ufp_Mail_list() {
		return b_V_Ufp_Mail_list;
	}

	public void setB_V_Ufp_Mail_list(List<B_V_Ufp_Mail> bVUfpMailList) {
		b_V_Ufp_Mail_list = bVUfpMailList;
	}

	public List<String> getFileNameList() {
		return fileNameList;
	}

	public void setFileNameList(List<String> fileNameList) {
		this.fileNameList = fileNameList;
	}

	public String getIsReadFlag() {
		return isReadFlag;
	}

	public void setIsReadFlag(String isReadFlag) {
		this.isReadFlag = isReadFlag;
	}

	public List<C_V_Sys_Usertree> getListMailselUserList() {
		return listMailselUserList;
	}

	public void setListMailselUserList(List<C_V_Sys_Usertree> listMailselUserList) {
		this.listMailselUserList = listMailselUserList;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}
}
