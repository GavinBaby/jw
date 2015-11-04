package com.jw.magicbpm.action.publicinformation;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.PageOrientation;
import jxl.format.PaperSize;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.apache.struts2.ServletActionContext;

import com.jw.baseframe.action.baseintface.JwBaseAction;
import com.jw.baseframe.action.baseintface.JwBaseActionI;
import com.jw.baseframe.common.session.SessionFactory;
import com.jw.baseframe.model.C_T_Sys_Unit;
import com.jw.baseframe.util.Constants;
import com.jw.baseframe.util.DateTools;
import com.jw.baseframe.util.GUID;
import com.jw.baseframe.util.StringTools;

import com.jw.magicbpm.common.MagicBPMConstants;
import com.jw.magicbpm.dao.publicinformation.B_T_Ufp_DutyManagementMapper;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_DutyManagement;
import com.jw.magicbpm.model.publicinformation.B_T_Ufp_DutyManagementExample;

public class DutyManagementAction extends JwBaseAction implements JwBaseActionI {

	/**
	 *ֵ�����ģ��
	 */
	private static final long serialVersionUID = 1L;
	// ��λ�б�
	private List<C_T_Sys_Unit> listC_T_Sys_Unit;
	// ��ѯ����
	private String mainDocId;
	//ģ��ID
	private String moduleId = MagicBPMConstants.MOUDLE_ID_DUTYMANAGEMENT;
	// ѡ��õ�λ��ش������ĵ�λID
	private String unitId;
	// ��λ����(���û���Ϊ��������Աʱ��ʾ��)
	private String unitName;
	// jsonResult���
	private String jsonResult;
	// ����
	private String type;
	// ����
	private String years;
	private String year;
	private String month;
	// �·�ֵ���б�
	private List<B_T_Ufp_DutyManagement> list_B_T_Ufp_DutyManagement;
	// ֵ����Ϣ
	private B_T_Ufp_DutyManagement b_T_Ufp_DutyManagement;
	// �Ƿ����Ա
	private String ifadmin;
	// ��ǰ����
	private String iftoday;
	@Resource
	B_T_Ufp_DutyManagementMapper mapperDMT;

	/**
	 * ɾ������
	 */
	public String detailsDelete() {

		return SUCCESS;
	}

	/**
	 * ��ϸ����(���б�)����
	 * 
	 */
	public String detailsLoad() throws Exception {
		B_T_Ufp_DutyManagementExample example = null;
		B_T_Ufp_DutyManagementExample.Criteria criteria = null;
		try {
			example = new B_T_Ufp_DutyManagementExample();
			criteria = example.createCriteria();
			criteria.andIsDeleteEqualTo(0);
			String[] weekDays = { "������", "����һ", "���ڶ�", "������", "������", "������",
					"������" };
			if (StringTools.isNullOrNoValue(years)) {
				years = (DateTools.getServerDateTime(9).toString()).substring(
						0, 7);
				criteria.andYearsEqualTo(years);
				example.setOrderByClause("DUTY_TIME");
				list_B_T_Ufp_DutyManagement = mapperDMT
						.selectByExample(example);
			} else if (StringTools.isNotNullAndHasValue(years)) {
				criteria.andYearsEqualTo(years);
				example.setOrderByClause("DUTY_TIME");
				list_B_T_Ufp_DutyManagement = mapperDMT
						.selectByExample(example);

			}
			year = years.substring(0, 4);
			month = years.substring(5, 7);
			iftoday = DateTools.getServerDateTime(9).toString();

			// ��ֵ�����Ϊ�ճ�ʼ��
			if (list_B_T_Ufp_DutyManagement.size() == 0) {// ��ʼ��
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Calendar cal = Calendar.getInstance();
				Date date = df.parse(years + "-01");
				cal.setTime(date);
				cal.set(Calendar.DATE, 1);
				int month = cal.get(Calendar.MONTH);
				B_T_Ufp_DutyManagement b_T_Ufp_DutyManagement = null;
				while (cal.get(Calendar.MONTH) == month) {
					int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
					if (week < 0) {
						week = 0;
					}
					b_T_Ufp_DutyManagement = new B_T_Ufp_DutyManagement();
					b_T_Ufp_DutyManagement
							.setDutyTime(df.format(cal.getTime()));
					b_T_Ufp_DutyManagement.setWeeks(weekDays[week]);
					list_B_T_Ufp_DutyManagement.add(b_T_Ufp_DutyManagement);
					cal.add(Calendar.DATE, 1);
				}
				b_T_Ufp_DutyManagement = null;
				df = null;
			}

			// ȡ�ø���ʱ��
			getDocUpdateTime("B_T_Ufp_DutyManagement");

			if ("1".equals(SessionFactory.getSessionUserType())) {
				allPermission = ",export,";
				ifadmin = "1";// �ǹ���Ա
			} else {
				ifadmin = "0";
				allPermission = "#";
			}
			if ("1".equals(type)) {
				criteria.andYearsEqualTo(years);
				example.setOrderByClause("DUTY_TIME");
				list_B_T_Ufp_DutyManagement = mapperDMT
						.selectByExample(example);
				String tableTitle = year + "��" + month + "��ֵ�����";
				// ����ÿ�еĿ��1����׼��� 2��������׼��� 3��������׼��� 4���ı���׼��� 5���屶��׼���
				Integer columnWidth[] = new Integer[] { 2, 1, 1, 2 };
				// �����б���
				List<String> columnTitleList = new ArrayList<String>();
				columnTitleList.add("ֵ������");
				columnTitleList.add("����");
				columnTitleList.add("ֵ����Ա");
				columnTitleList.add("ǩ��ʱ��");
				List<Object> list_Object = new ArrayList<Object>();
				Object object[] = null;
				for (B_T_Ufp_DutyManagement b_T_Ufp_DutyManagement : list_B_T_Ufp_DutyManagement) {
					object = new Object[columnTitleList.size()];
					object[0] = b_T_Ufp_DutyManagement.getDutyTime();
					object[1] = b_T_Ufp_DutyManagement.getWeeks();
					object[2] = b_T_Ufp_DutyManagement.getDutyUser();
					object[3] = b_T_Ufp_DutyManagement.getCheckTime();
					list_Object.add(object);
					object = null;
				}
				ExportExcel(list_Object, columnWidth, columnTitleList,
						tableTitle, true);
				list_Object = null;
				columnWidth = null;
			}
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
	 * ����/��������
	 */
	public String detailsUpdate() throws Exception {

		// ������Ҫ���µļ�¼����
		String rmsg = "";
		if (StringTools.isNullOrNoValue(list_B_T_Ufp_DutyManagement.get(0)
				.getUuid())) {
			for (int i = 0; i < list_B_T_Ufp_DutyManagement.size(); i++) {
				b_T_Ufp_DutyManagement = list_B_T_Ufp_DutyManagement.get(i);
				b_T_Ufp_DutyManagement.setUuid(new GUID().toString());
				b_T_Ufp_DutyManagement.setYears(years);
				mapperDMT.insertSelective(b_T_Ufp_DutyManagement);
			}
			rmsg = Constants.SAVE_SUCCESSFUL_MSG;
		} else {
			// �ж��Ƿ����˱༭��
			if (isDocUpdated("C_T_SYS_DEPARTMENT")) {
				errorMessage(Constants.DISP_EDIT_CONFLICTS);
				return SUCCESS;
			} else {
				for (int i = 0; i < list_B_T_Ufp_DutyManagement.size(); i++) {
					b_T_Ufp_DutyManagement = list_B_T_Ufp_DutyManagement.get(i);
					mapperDMT
							.updateByPrimaryKeySelective(b_T_Ufp_DutyManagement);
				}
				rmsg = Constants.UPDATE_SUCCESSFUL_MSG;
			}
		}
		sucessMessage(rmsg);
		return SUCCESS;
	}

	/**
	 * �б������//������excel
	 */
	public String listLoad() throws Exception {

		return SUCCESS;
	}

	/**
	 * Grid���ݼ���
	 */
	public String gridLoad() throws Exception {
		return SUCCESS;
	}

	/**
	 * ͨ�õ��������������п��Զ����б��⣬���Ƿ���Ҫ��ͷ��Excel��������ȡ
	 * 
	 * @param list_Object
	 *            :��Ҫ�����Ķ����б�
	 * @param columnWidth
	 *            : �����п������ʾ�еĿ��
	 * @param columnTitleList
	 *            :�Զ����б����б�
	 * @param tableTitle
	 *            Excel��������ȡ
	 * @param flag
	 *            : true�б�ͷ ;false:��
	 * @throws Exception
	 */
	public static void ExportExcel(List<Object> list_Object,
			Integer columnWidth[], List<String> columnTitleList,
			String tableTitle, boolean flag) throws Exception {
		WritableWorkbook book = null;
		OutputStream outStream = null;

		try {
			HttpServletResponse response = ServletActionContext.getResponse();

			outStream = response.getOutputStream();// ȡ�������
			response.reset();// ��������

			String timeTitle = DateTools.getServerDateTime(8);
			response.setHeader("Content-disposition", "attachment; filename="
					+ new String(tableTitle.getBytes("GB2312"), "8859_1") + "("
					+ timeTitle + ").xls");// �趨����ļ�ͷ
			response.setContentType("application/msexcel");// �����������

			// ��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
			book = Workbook.createWorkbook(outStream);

			// ���һ��������
			WritableSheet sheet = book.createSheet(tableTitle, 0);
			// ���ô�ӡ���� ,ֽ��ΪA4ֽ
			jxl.SheetSettings setting = sheet.getSettings();
			setting.setPrintGridLines(true);
			setting.setOrientation(PageOrientation.LANDSCAPE);
			setting.setPaperSize(PaperSize.A4);
			setting.setHorizontalCentre(true);

			// ���õ�Ԫ������ָ�ʽ ��ͷ
			WritableFont wf1 = new WritableFont(WritableFont.ARIAL, 18,
					WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
					Colour.BLACK);
			// ��Ԫ��ĸ�ʽ����
			WritableCellFormat cellFormat1 = new WritableCellFormat(wf1);
			cellFormat1.setAlignment(jxl.format.Alignment.CENTRE);
			// ���ñ߿򼰱߿���ɫ
			cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN,
					jxl.format.Colour.BLACK);
			cellFormat1
					.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
			// =====================cellFormat1
			// ��ͷ��Ԫ���ʽ=============================
			// ===============================================����
			WritableFont wf2 = new WritableFont(WritableFont.ARIAL, 12,
					WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
					Colour.BLACK);

			// ��Ԫ��ĸ�ʽ����
			WritableCellFormat cellFormat2 = new WritableCellFormat(wf2);
			// ���ñ߿򼰱߿���ɫ
			cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN,
					jxl.format.Colour.BLACK);
			cellFormat2.setAlignment(jxl.format.Alignment.CENTRE);
			cellFormat2.setWrap(true);
			cellFormat2
					.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
			// ====================cellFormat2
			// ������Ԫ���ʽ==================================
			// ====================����=======================================
			// ��������
			WritableFont wf3 = new WritableFont(WritableFont.ARIAL, 12,
					WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,
					Colour.BLACK);

			// ��Ԫ��ĸ�ʽ����
			WritableCellFormat cellFormat3 = new WritableCellFormat(wf3);
			// ���ñ߿򼰱߿���ɫ
			cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN,
					jxl.format.Colour.BLACK);
			cellFormat3.setWrap(true);
			cellFormat3
					.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
			// ====================cellFormat3
			// �����ݵ�Ԫ���ʽ=======================================

			// ���Ƹ������ݿ��
			int width = 0;
			int dataRowIndex = 0;
			for (int i = 0; i < columnWidth.length; i++) {
				width = columnWidth[i];
				if (width == 1) {
					sheet.setColumnView(i, 15); // �����еĿ��
				} else if (width == 2) {
					sheet.setColumnView(i, 25); // �����еĿ��
				} else if (width == 3) {
					sheet.setColumnView(i, 35); // �����еĿ��
				} else if (width == 4) {
					sheet.setColumnView(i, 45); // �����еĿ��
				} else if (width == 5) {
					sheet.setColumnView(i, 60); // �����еĿ��
				} else {
					sheet.setColumnView(i, 15); // �����еĿ��
				}
			}

			// ��ʾ��ͷ
			if (true == flag) {
				// ��һ�ж���Ϊ��ͷ
				sheet.mergeCells(0, 0, columnTitleList.size() - 1, 0);// ��һ�кϲ���Ԫ��
				sheet.addCell(new Label(0, 0, tableTitle, cellFormat1));
				dataRowIndex = 2;
			} else {
				dataRowIndex = 1;
			}

			for (int i = 0; i < columnTitleList.size(); i++) {
				if (true == flag) {
					sheet.addCell(new Label(i, 1, columnTitleList.get(i),
							cellFormat2));// ��������
				} else {
					sheet.addCell(new Label(i, 0, columnTitleList.get(i),
							cellFormat2));// ��������
				}
			}

			// ������ݿ������
			Object[] dataDB = null;
			// ����������
			int count = 0;
			// Excel��ҳ����
			// int j = 0;
			for (int i = 0; i < list_Object.size(); i++) {
				dataDB = (Object[]) list_Object.get(i);

				for (int j = 0; j < dataDB.length; j++) {
					sheet.addCell(new Label(j, i + dataRowIndex, String
							.valueOf(dataDB[j]), cellFormat3));
				}

				count++;
			}

			// ���ļ�д����
			book.write();
		} catch (Exception ex) {
			throw ex;
		} finally {
			try {
				book.close();
				outStream.flush();
				outStream.close();
			} catch (WriteException e) {
				throw e;
			} catch (IOException e) {
				throw e;
			}

		}

	}

	// *************************************get/set*****************************************************

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<C_T_Sys_Unit> getListC_T_Sys_Unit() {
		return listC_T_Sys_Unit;
	}

	public void setListC_T_Sys_Unit(List<C_T_Sys_Unit> listCTSysUnit) {
		listC_T_Sys_Unit = listCTSysUnit;
	}

	public String getMainDocId() {
		return mainDocId;
	}

	public void setMainDocId(String mainDocId) {
		this.mainDocId = mainDocId;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
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

	public String getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<B_T_Ufp_DutyManagement> getList_B_T_Ufp_DutyManagement() {
		return list_B_T_Ufp_DutyManagement;
	}

	public void setList_B_T_Ufp_DutyManagement(
			List<B_T_Ufp_DutyManagement> listBTUfpDutyManagement) {
		list_B_T_Ufp_DutyManagement = listBTUfpDutyManagement;
	}

	public B_T_Ufp_DutyManagement getB_T_Ufp_DutyManagement() {
		return b_T_Ufp_DutyManagement;
	}

	public void setB_T_Ufp_DutyManagement(
			B_T_Ufp_DutyManagement bTUfpDutyManagement) {
		b_T_Ufp_DutyManagement = bTUfpDutyManagement;
	}

	public String getIfadmin() {
		return ifadmin;
	}

	public void setIfadmin(String ifadmin) {
		this.ifadmin = ifadmin;
	}

	public String getIftoday() {
		return iftoday;
	}

	public void setIftoday(String iftoday) {
		this.iftoday = iftoday;
	}

}
