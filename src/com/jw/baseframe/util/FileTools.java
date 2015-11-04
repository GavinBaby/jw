package com.jw.baseframe.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTools {

	private String message = "";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * ��Դ�ļ�������Ŀ���ļ�
	 * 
	 * @param src
	 *            дԴ�ļ���ַ�����ļ���
	 * @param des
	 *            дĿ���ļ���ַ�������ļ���
	 */
	public boolean copyFile(String src, String des) {
		File srcFile = new File(src);
		File desDir = new File(des);
		File desFile = new File(des + "/" + srcFile.getName());
		// �ж�Դ�ļ��Ƿ����
		if (!srcFile.exists()) {
			this.setMessage("Դ�ļ������ڣ�");
			return false;
		} else if (!srcFile.isFile()) {
			this.setMessage("Դ�ļ���ʽ��");
			return false;
		}
		// �ж�Դ�ļ��Ƿ����
		if (!desDir.exists()) {
			this.setMessage("Ŀ��Ŀ¼�����ڣ�");
			return false;
		} else if (!desDir.isDirectory()) {
			this.setMessage("������Ч��Ŀ¼��");
			return false;
		}
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String str;
		try {
			reader = new BufferedReader(new FileReader(srcFile));
			writer = new BufferedWriter(new FileWriter(desFile));
			// �ж�Ŀ���ļ��Ƿ���ڼ����ʽ�������ھʹ�������ʽ������ɾ�������ھ����
			if (!desFile.exists() || !desFile.isFile()) {
				if (desFile.exists()) {
					desFile.delete();
				}
				desFile.createNewFile();
			}
			// ��Դ�ļ���ȡ���ݣ���д��Ŀ���ļ�
			str = reader.readLine();
			while (str != null) {
				writer.write(str);
				writer.newLine();
				str = reader.readLine();
			}
		} catch (IOException e) {
			this.setMessage(e.getMessage());
			return false;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					this.setMessage(e.getMessage());
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					this.setMessage(e.getMessage());
				}
			}
		}
		return true;
	}

	private List<File> fileList = new ArrayList<File>();

	/**
	 * �г������ļ�
	 * 
	 * @param srcFile
	 */
	private void file(File srcFile) {
		if (srcFile.isDirectory()) {
			String[] files = srcFile.list();

			for (int i = 0; i < files.length; i++) {
				File f = new File(srcFile + "/" + files[i]);
				// ������ļ������б�����ݹ��г�
				if (f.isFile()) {
					fileList.add(f);
				} else
					file(f);
			}
		} else
			this.setMessage(srcFile.getAbsolutePath() + "����Ŀ¼");
	}

	/**
	 * ����Ŀ¼
	 * 
	 * @param des
	 * @throws IOException
	 */
	public static void mkdir(File des) {
		if (!des.exists() || !des.isDirectory()) {
			mkdir(des.getParentFile());
			if (des.exists()) {
				// des.delete();
				return;
			}
			des.mkdir();
		}
	}

	public static void mkdirs(String path) {  
        File fd = null;  
        try {  
            fd = new File(path);  
            if (!fd.exists()) {  
                fd.mkdirs();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            fd = null;  
        }  
    }  
	
	
	/**
	 * ����Ŀ¼ ��ԴĿ¼�������ļ�������Ŀ��Ŀ¼��
	 * 
	 * @param src
	 *            ԴĿ¼
	 * @param des
	 *            Ŀ��Ŀ¼
	 */
	public boolean copyDir(String src, String des) {
		File srcFile = new File(src);
		if (!srcFile.exists()) {
			this.setMessage("ԴĿ¼�����ڣ�");
			return false;
		} else if (!srcFile.isDirectory()) {
			this.setMessage(src + "������Ч��Ŀ¼��");
			return false;
		}
		file(srcFile);

		for (int i = 0; i < fileList.size(); i++) {
			String srcName = ((File) fileList.get(i)).getPath();
			String desName = srcName.substring(src.length(), srcName.length());
			desName = des + desName;
			File dir = new File(desName).getParentFile();
			mkdir(dir);

			if (!copyFile(srcName, dir.getPath())) {
				return false;
			}
		}
		return true;
	}

}
