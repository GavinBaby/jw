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
 *  �����ʼ� 2012��12-24
 */
public class MailAction extends JwBaseAction implements JwBaseActionI {

	/**
	 * �汾��ʶ
	 */
	private static final long serialVersionUID = -2814590404586490100L;

	// ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_MAIL;
	
	//��λ������Ա���б�
	private List<B_V_Ufp_Mail_UnitDeptUserTree> listMailgetUnitDeptUserTree;
	
	//���� ʵ��
	private B_T_Ufp_Mail_Attribute b_T_Ufp_Mail_Attribute;	
	
	//�ռ� ʵ��
	private B_T_Ufp_Mail_Relation b_T_Ufp_Mail_Relation;
	
	//���ı� ʵ��
	private B_T_Ufp_Mail_Content b_T_Ufp_Mail_Content;

	//���ŷ��ͱ�־
	private String isSendMsg;
	//��ִ��־
	private String isReceipt;
	//URL-�ʼ����ͱ�־
	private String mailType;
	//������-�ʼ����ͱ�־
	private String mailTypeS;
	//�����ʼ����������־
	private String mailSaveSendFlag;

	//��ҳ���û���������ϵͳ��
	private String fieldName;
	private String fieldSysName;
	
	//�Ƿ�ת��:1�򿽱�:2
	private String isTranferCopy;
	
	//�Ƿ����ʼ� ��:0 ���� 1
	private String isNew;
	
	//��ԭ��
	private String isPaper;
	
	//������
	private String fileName="";
	
	//����
	private String titleS;
	
	//����ʱ��
	private String sendTimeS;
	
	//�Ƿ�ظ�:1��ת��:2
	private String isReplyTrun;
	
	//1����ʾ������ 0:����ʾ
	private String copyFlag;
	
	//1����ʾ������ 0:����ʾ
	private String darkFlag;
	
	//ȫ���ָ���־
	private String allReplyFlag;
	
	//��ʾȫ���ָ��б�
	private List<B_V_Ufp_Mail> b_V_Ufp_Mail_list;
	
	//��Ӧ�ʼ��������б�
	private List<String> fileNameList = new ArrayList<String>();
	
	//���ı�־
	private String isReadFlag;	
	
	// ��ʾ��ѡ��Ա��
	private List<C_V_Sys_Usertree> listMailselUserList;
	//��ѡ�Ľ�����ID
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
	 * �����ʼ� ɾ��
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
					 b_T_Ufp_Mail_Relation.setReplyFlag(3);//������Ͳݸ����־
					 b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("3"));//������
					 mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
				}
				resultMsg="��ת��������";
			}
		}
		sucessMessage(resultMsg);
		b_T_Ufp_Mail_Relation = null;
		return SUCCESS;
	}

	/**
	 * �����ʼ���ϸ��Ϣҳ�����
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
				//��ʾȫ���ļ���
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
			// ��ǰ��¼��ϵͳ��
			String loginId = SessionFactory.getSessionUserId();
			b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
			b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
			b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
			fileName = searchFileName(example, mainDocId);
			mailSaveSendFlag = String.valueOf(b_T_Ufp_Mail_Relation.getMailType());
			isSendMsg = String.valueOf(b_T_Ufp_Mail_Attribute.getIsSendMsg());
			
			if(b_T_Ufp_Mail_Relation.getIsNew()!=null&&b_T_Ufp_Mail_Relation.getIsNew()==0){
				if(b_T_Ufp_Mail_Attribute.getIsReceipt()!=null&&b_T_Ufp_Mail_Attribute.getIsReceipt()==1){
					//�޸� by��youjh  2015-10-21
					String uuid = new GUID().toString();
					
					B_T_Ufp_Mail_Attribute newMailAttribute=new B_T_Ufp_Mail_Attribute();
				    B_T_Ufp_Mail_Relation mailRelation=new B_T_Ufp_Mail_Relation();
				    
				    newMailAttribute.setUuid(uuid);
				    newMailAttribute.setTitle("�ظ����յ���"+b_T_Ufp_Mail_Attribute.getTitle());
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
					
					//�����ʼ����ı�
					b_T_Ufp_Mail_Content.setUuid(uuid);
					b_T_Ufp_Mail_Content.setContent("�ظ��������͵��ʼ����յ���" +
							""+b_T_Ufp_Mail_Content.getContent()+"" +
									"������:"+SessionFactory.getSessionUserNm());
					mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
					addForAllRecUser(uuid);
					
				}
			}
			
			//�Ķ��ʼ�
			recordRelation = updateIsNewMail(recordRelation, loginId);
			
			String copySysUser = b_T_Ufp_Mail_Attribute.getCopySysUser();
			String darkSysUser = b_T_Ufp_Mail_Attribute.getDarkSysUser();
			copyDarkUserShow(loginId, copySysUser, darkSysUser);
		} catch (Exception e) {
			throw e;
		} finally {
			// �ͷ���Դ
			example = null;
			recordRelation= null;
			exampleVMail = null;
			criteriaVMail = null; 
		}
		return SUCCESS;
	}

	/**
	 * ��ѯ�ʼ���Ӧ�ĸ�����
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
	 * �����ʼ�״̬����Ϊ�Ѷ��ʼ�
	 * @param mapperRelation
	 * @param recordRelation
	 * @param loginId
	 * @return
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private B_T_Ufp_Mail_Relation updateIsNewMail(B_T_Ufp_Mail_Relation recordRelation, String loginId) throws IllegalAccessException, UnsupportedEncodingException {
		if(loginId.equals(b_T_Ufp_Mail_Relation.getSpecificRecsysUser())){
			//������ռ��˴��ʼ����͸����ʼ�״̬
			recordRelation = new B_T_Ufp_Mail_Relation();
			b_T_Ufp_Mail_Relation.setIsNew(1);//�����ʼ�
			mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
			
		}
		return recordRelation;
	}

	/**
	 * �ж��Ƿ���ʾ�����˺Ͱ�����
	 * @param loginId:��ǰ�û�
	 * @param copySysUser��������
	 * @param darkSysUser��������
	 */
	private void copyDarkUserShow(String loginId, String copySysUser, String darkSysUser) {
		if(StringTools.isNotNullAndHasValue(copySysUser)){
			if(copySysUser.indexOf(loginId)>-1){
				copyFlag = "1";//��ʾ������
			}else{
				copyFlag = "0";
			}
		}else{
			copyFlag = "0";
		}
		if(StringTools.isNotNullAndHasValue(darkSysUser)){
			if(darkSysUser.indexOf(loginId)>-1){
				darkFlag = "1";//��ʾ������
			}else{
				darkFlag = "0";
			}
		}else{
			darkFlag = "0";
		}
	}
	
	/**
	 * �����ʼ���ϸ��Ϣ�½����޸�
	 */
	public String detailsUpdate()throws Exception {
		// ȡ����������
		B_T_Ufp_Mail_Attribute record = null;
		B_T_Ufp_Mail_Relation recordRelation = null;
		B_T_Ufp_Mail_Content recordContent = null;
		C_T_Sys_FileExample example = null;
		C_T_Sys_FileExample.Criteria criteria = null; 
		try {
		example = new C_T_Sys_FileExample();
		criteria = example.createCriteria();
		// ������Ҫ���µļ�¼����
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
			//ת�ƿ���(isTranferCopy)�ż�����
			if(!"".equals(checkedIds)){
				String temps[] = checkedIds.split(",");
				for(String temp : temps){
					b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(temp.trim());
					if("1".equals(isTranferCopy)){
						//ת����
						tranferMail(recordRelation);
					}else if("2".equals(isTranferCopy)){
						//������
						copyMail(record, recordRelation, recordContent, temp.trim(),example,criteria);
					}
				}
			}
		}
		sucessMessage(returnMsg);	
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
	 * �ظ���ת���ʼ�
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
		// ���¸���������ĵ�ID
		String isFile = null;
		try {
			replyMailFile(example, criteria, uuid);
			criteria.andMainIdEqualTo(uuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if(listFile!=null){
				if(listFile.size()>0){
					isFile = "1";//�и���
				}else{
					isFile = "0";//û�и���
				}
			}else{
				isFile = "0";//û�и���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//�ռ���δ���ʼ�
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);
		b_T_Ufp_Mail_Relation.setReplyFlag(1);// �����ظ�
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//���޸���
		if(b_T_Ufp_Mail_Relation!=null){
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(b_T_Ufp_Mail_Relation.getUserId());
		}
		
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		//�����ʼ����Ա�
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);//�ظ�ʱ���������еķ���ʱ��
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//��ִѡ��
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		//�����ʼ����ı�
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(recordContent);
		
		
		// ��������ʾ
		String newUuid = new GUID().toString();
		String isNewFile = null;
		// ���¸���������ĵ�ID
		try {
			replyMailFile(example,criteria,newUuid);	
			
			example.clear();
			criteria = example.createCriteria();
			criteria.andMainIdEqualTo(newUuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if(listFile!=null){
				if(listFile.size()>0){
					isNewFile = "1";//�и���
				}else{
					isNewFile = "0";//û�и���
				}
			}else{
				isNewFile = "0";//û�и���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		b_T_Ufp_Mail_Relation.setUuid(newUuid);
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("1"));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);
		b_T_Ufp_Mail_Relation.setReplyFlag(2);// �Լ����Ļظ���Ϣ
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isNewFile));//���޸���
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		// �����ʼ����Ա�
		b_T_Ufp_Mail_Attribute.setUuid(newUuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);// �ظ�ʱ���������еķ���ʱ��
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));// ��ִѡ��
		b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//�Ƿ��Ͷ���Ϣ
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		// �����ʼ����ı�
		b_T_Ufp_Mail_Content.setUuid(newUuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
		
		if ("0".equals(isReplyTrun)) {
			returnMsg = "�ظ��ɹ�!";
		}else if("1".equals(isReplyTrun)){
			returnMsg = "ת���ɹ�!";
		}else{
			returnMsg = Constants.SAVE_SUCCESSFUL_MSG;
		}
		return returnMsg;
	}

	/**
	 * ���ظ�,ת���ʼ����ø���
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
		//newFileIdsԭʼ��������
		if (StringTools.isNotNullAndHasValue(newFileIds)) {
			//�����������������ǰ�ظ���
			//�޸�by��youjh 2015-10-21
			newFileIds = newFileIds.replaceAll("[?]", "%3F");
			String[] listTemp = newFileIds.split("%3F");
			C_T_Sys_File c_T_Sys_File = null;
			//����ת���ʼ�����
			for (String temp : listTemp) {
				if (StringTools.isNotNullAndHasValue(temp.trim())) {
					 c_T_Sys_File = mapperFT.selectByPrimaryKey(temp);
					 if(c_T_Sys_File!=null){
						c_T_Sys_File.setUuid(new GUID().toString());
						c_T_Sys_File.setMainId(uuid);// �ظ�(ת��)�ʼ�����
						mapperFT.insertSelective(c_T_Sys_File);
					} else {
						//������߼�ɾ������,����Իָ�ԭʼ�ʼ�����
						criteria.andMainIdEqualTo(mainDocId);
						criteria.andIsDeleteEqualTo(1);
						List<C_T_Sys_File> c_T_Sys_File_list = mapperFT.selectByExample(example);
						if(c_T_Sys_File_list!=null){
							for(C_T_Sys_File file : c_T_Sys_File_list){
								file.setUuid(new GUID().toString());
								file.setMainId(mainDocId);//�ظ�ԭʼ�ʼ�����
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
	 * ת���ʼ�����Ӧ����
	 * @param sqlSession
	 * @param mapperRelation
	 * @param recordRelation
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private void tranferMail(B_T_Ufp_Mail_Relation recordRelation) throws Exception {
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		if("7".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(1);//1:ת�Ƶ��ռ�����
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("7"));
			//ת�����ռ��������ض��ռ���Ϊ��ǰ��¼��
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(SessionFactory.getSessionUserId());
		}else if("1".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(4);//4:ת�Ƶ���������
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("1"));
		}else{
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//3:ת�Ƶ���������߲ݸ�����
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		}
		mapperMRT.updateByPrimaryKeySelective(b_T_Ufp_Mail_Relation);
	}

	/**
	 * ��������Ӧ����
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
		//�����ʼ�ʱͬʱ�����ʼ����ĸ���
		criteria.andMainIdEqualTo(temp.trim());
		List<C_T_Sys_File> c_T_Sys_File_list = mapperFT.selectByExample(example);
		if (c_T_Sys_File_list != null) {
			for (C_T_Sys_File file : c_T_Sys_File_list) {
				file.setUuid(new GUID().toString());
				file.setMainId(uuid);// ����ԭʼ�ʼ�����
				mapperFT.insertSelective(file);
			}
		}
		//�����ʼ�������
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		if("1".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(4);//������������:4
		}else if("7".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(1);//�ռ���:1
			//�������ռ��������ض��ռ���Ϊ��ǰ��¼��
			b_T_Ufp_Mail_Relation.setSpecificRecsysUser(SessionFactory.getSessionUserId());
		}else if("2".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//�ݸ���:3
		}else if("3".equals(mailTypeS)){
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//������:3
		}
		b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailTypeS));
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		//�����ʼ����Ա�
		b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(temp);
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		//�����ʼ����ı�
		b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(temp);
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
	}

	/**
	 * ���ʼ�ʱ�����ʼ�,�������ʼ�
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
		// ���ʼ����Ա� ���
		String uuid = new GUID().toString();
		String isFile = null;
		//�������ʼ���:�ռ��ˡ������˺Ͱ�����
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
			// ���¸���������ĵ�ID
			FileIdUpdata.Updata(newFileIds, uuid);
			criteria.andMainIdEqualTo(uuid);
			List<C_T_Sys_File> listFile = mapperFT.selectByExample(example);
			if (listFile != null) {
				if (listFile.size() > 0) {
					isFile = "1";// �и���
				} else {
					isFile = "0";// û�и���
				}
			} else {
				isFile = "0";// û�и���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		b_T_Ufp_Mail_Attribute.setUuid(uuid);
		b_T_Ufp_Mail_Attribute.setSendTime(sendTime);
		b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
		b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
		b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//��ִ
		//b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//�Ƿ��Ͷ���Ϣ
		mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
		// ���ʼ���ϵ�����(������������ʼ��ض��ռ���ͳһ������)
		b_T_Ufp_Mail_Relation.setUuid(uuid);
		if(StringTools.isNullOrNoValue(isPaper)){
			if("false".equals(mailType)){
				//δ��ѡ�����������临ѡ��,�򱣴���������
				b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("3"));
				b_T_Ufp_Mail_Relation.setReplyFlag(3);//�������־��3
			}else{
				//1:Ĭ�Ϲ�ѡ������������ 
				b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(booleanToString(mailType)));
				b_T_Ufp_Mail_Relation.setReplyFlag(replyFlag);//���ʼ�Ĭ��ֵ:1
			}
		}else{
			mailType = "2";
			b_T_Ufp_Mail_Relation.setMailType(Long.valueOf(mailType));//��ԭ�屣�����ݸ���
			b_T_Ufp_Mail_Relation.setReplyFlag(3);//��ݸ����־:3
		}
		b_T_Ufp_Mail_Relation.setIsNew(0);// ���ʼ�
		b_T_Ufp_Mail_Relation.setMailAttributeId(uuid);
		b_T_Ufp_Mail_Relation.setMailContentId(uuid);
		b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);//δ���ʼ�����Ϊ��������
		b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//���޸�����־
		mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
		// ���ʼ����ı����
		b_T_Ufp_Mail_Content.setUuid(uuid);
		mapperMCT.insertSelective(b_T_Ufp_Mail_Content);
		
		//���������ʼ���:�ռ��ˡ������˺Ͱ����˷��ʼ�
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
							//ѭ������ֵ�����ڰ�������ʱ��������Ϣ
							if(darkSysUser.indexOf(temp)>-1){
								b_T_Ufp_Mail_Attribute.setTipDarkInfo("��������ʼ��������ˣ����Բ�����ʾ���ռ����С�");
							}
							
							b_T_Ufp_Mail_Attribute.setUuid(guid);
							b_T_Ufp_Mail_Attribute.setSendTime(sendTime);
							b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
							b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
							b_T_Ufp_Mail_Attribute.setIsReceipt(Integer.valueOf(booleanToString(isReceipt)));//��ִ
							//b_T_Ufp_Mail_Attribute.setIsSendMsg(Integer.valueOf(booleanToString(isSendMsg)));//�Ƿ��Ͷ���Ϣ
							mapperMAT.insertSelective(b_T_Ufp_Mail_Attribute);
							// ���ʼ���ϵ�����
							b_T_Ufp_Mail_Relation.setUuid(guid);
							b_T_Ufp_Mail_Relation.setMailType(Long.valueOf("7"));//7:���ʼ�ʱ�����͸��������ʼ���(allReceiverSysUser)���ʼ���־
							b_T_Ufp_Mail_Relation.setIsNew(0);// ���ʼ�
							b_T_Ufp_Mail_Relation.setMailAttributeId(guid);
							b_T_Ufp_Mail_Relation.setMailContentId(guid);
							b_T_Ufp_Mail_Relation.setReceiverTime(sendTime);//δ���ʼ�����Ϊ��������
							b_T_Ufp_Mail_Relation.setReplyFlag(replyFlag);//���ʼ�Ĭ��ֵ:1
							b_T_Ufp_Mail_Relation.setIsFile(Integer.valueOf(isFile));//���޸�����־
							b_T_Ufp_Mail_Relation.setSpecificRecsysUser(temp);//����ָ���ռ���ϵͳ��
							mapperMRT.insertSelective(b_T_Ufp_Mail_Relation);
							// ���ʼ����ı����
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
	 * �������ռ��˵��ʼ����ϸ���
	 * @param mapperFile
	 * @param guid
	 * @throws IllegalAccessException
	 * @throws UnsupportedEncodingException
	 */
	private void addForAllRecUser(String guid) throws Exception {
		//newFileIds����ԭʼ��������(���ʼ�ʱ����ÿ�����ʼ��ĸ��ϸ���)
		if (StringTools.isNotNullAndHasValue(newFileIds)) {
			//�����������������ǰ�ظ���
			//�޸�by��youjh 2015-10-21
			newFileIds = newFileIds.replaceAll("[?]", "%3F");
			String[] listTemp = newFileIds.split("%3F");
			C_T_Sys_File c_T_Sys_File = null;
			//���ûظ��ʼ�����
			for (String file : listTemp) {
				if (StringTools.isNotNullAndHasValue(file.trim())) {
					 c_T_Sys_File = mapperFT.selectByPrimaryKey(file);
					 if(c_T_Sys_File!=null){
						c_T_Sys_File.setUuid(new GUID().toString());
						c_T_Sys_File.setMainId(guid);// �ظ��ʼ�����
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
	 * �����ʼ��б����
	 */
	public String listLoad() {

		return SUCCESS;
	}
	
	/**
	 * �����ʼ����ʼ��б����
	 */
	public String sendlistLoad() {
		allPermission = "*";
		
		String sendUser = SessionFactory.getSessionUserNm();
		String sendSysUser = SessionFactory.getSessionUserId();
		if (StringTools.isNotNullAndHasValue(mainDocId)) {
			if("1".equals(isReplyTrun)){
				//ת���ʼ�
				b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Content = mapperMCT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Attribute.setTitle(titleS);
				b_T_Ufp_Mail_Relation.setUserId("");
				b_T_Ufp_Mail_Relation.setUserName("");
				//�ظ�ʱ����ճ����˺�������
				b_T_Ufp_Mail_Attribute.setCopySysUser("");
				b_T_Ufp_Mail_Attribute.setCopyUser("");
				b_T_Ufp_Mail_Attribute.setDarkSysUser("");
				b_T_Ufp_Mail_Attribute.setDarkUser("");
				String receiptText = String.valueOf(b_T_Ufp_Mail_Attribute.getIsReceipt());
				checkBoxIsChecked(receiptText);
			}else if("0".equals(isReplyTrun)){
				//�ظ��ʼ�
				b_T_Ufp_Mail_Attribute = mapperMAT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation = mapperMRT.selectByPrimaryKey(mainDocId);
				b_T_Ufp_Mail_Relation.setUserId(b_T_Ufp_Mail_Attribute.getSendSysUser());
				b_T_Ufp_Mail_Relation.setUserName(b_T_Ufp_Mail_Attribute.getSendUser());
				b_T_Ufp_Mail_Attribute.setTitle(titleS);
				b_T_Ufp_Mail_Attribute.setSendUser(sendUser);
				b_T_Ufp_Mail_Attribute.setSendSysUser(sendSysUser);
				//�ظ�ʱ����ճ����˺�������
				b_T_Ufp_Mail_Attribute.setCopySysUser("");
				b_T_Ufp_Mail_Attribute.setCopyUser("");
				b_T_Ufp_Mail_Attribute.setDarkSysUser("");
				b_T_Ufp_Mail_Attribute.setDarkUser("");
				//�ظ��ʼ�ȥ��ԭʼ�ʼ��ĸ���
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
				mailSaveSendFlag="1";//Ĭ�Ϲ�ѡ������������
				isReceipt = b_T_Ufp_Mail_Attribute.getIsReceipt().toString();//Ĭ�ϲ���ѡ��ִ
				isSendMsg = b_T_Ufp_Mail_Attribute.getIsSendMsg().toString();//Ĭ�ϲ���ѡ���Ͷ���
			}
		} else {
			//���ʼ�
			if (b_T_Ufp_Mail_Attribute == null) {
				b_T_Ufp_Mail_Attribute = new B_T_Ufp_Mail_Attribute();
				b_T_Ufp_Mail_Attribute.setSendUser(SessionFactory.getSessionUserNm());
				b_T_Ufp_Mail_Attribute.setImportantLeve("2");
				b_T_Ufp_Mail_Attribute.setPriorityLeve("2");
				mailSaveSendFlag="1";//Ĭ�Ϲ�ѡ������������
				isReceipt = "0";//Ĭ�ϲ���ѡ��ִ
				isSendMsg = "0";//Ĭ�ϲ���ѡ���Ͷ���
			}
		}
		return SUCCESS;
	}

	/**
	 * ��ѡ���Ƿ�ѡ
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
	 * ��λ������Աҳ�����
	 */
	public String unitDeptUserlistLoad() {
		return SUCCESS;
	}
	
	/**
	 * �����ʼ� Grid���ݼ���
	 */
	public String gridLoad() {
		B_V_Ufp_MailExample example = null;
		B_V_Ufp_MailExample.Criteria criteria = null; 

		// ������ѯ����
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
					//���ʼ���ʾ�����ʼ�
					example.or().andSpecificRecsysUserEqualTo(userSysName).andReplyFlagEqualTo(1);
				}
			}else{
				if("1".equals(mailType)){
					//�������ʼ�
					criteria.andMailTypeEqualTo(Long.valueOf(mailType));
					criteria.andSendSysUserEqualTo(userSysName);
					//ͬʱ��ʾ������������
					example.or().andReplyFlagEqualTo(4);
				}else{
					//������Ͳݸ���
					criteria.andMailTypeEqualTo(Long.valueOf(mailType));
					criteria.andReplyFlagEqualTo(3);
				}
			}
		}
		
		// ��¼�����ļ�¼
		total = mapperMV.countByExample(example);		
		// ��ҳ
		example.or().setLimitValue(getRowStart(), getRowEnd());		
		// �������
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

		// ��ʽ��result һ��Ҫ��JSONObject
		result = CommonLogic.getResult(total, mapperMV.selectByExample(example));

		return SUCCESS;
	}

	/**
	 * ��ȡ��λ������Ա��
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
	 * ��ʾ��ѡ��Ա��
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
	
	/**************************** get set���� **********************************************************************/
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
