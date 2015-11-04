package com.jw.baseframe.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.apache.tools.zip.ZipOutputStream;


public class ZipTool {
	/**
	  * ѹ���ļ������ļ��� ѹ������gb2312���룬�������뷽ʽ��������ļ������ļ�����ʹ�����ĵ������ѹ����Ϊ���롣����
	  * 
	 * @param source
	  *            Ҫѹ�����ļ������ļ��� 
	 *            ����ʹ��"c:/abc"����"c:/abc/aaa.txt"������ʽ������ѹ��·��
	  *            ʹ��"c:\\abc" ����"c:\\abc\\aaa.txt"������ʽ������·���Ļ������ܵ��³���ѹ���ͽ�ѹ��·��������ϡ�����
	  * @param zipFileName
	  *            ѹ�����zip�ļ����� ѹ�����Ŀ¼��֯��windows��zipѹ����Ŀ¼��֯��ͬ��
	  *            �����ѹ����Ŀ¼�����ƣ���ѹ���ļ����д���һ�������ĸ�Ŀ¼�� ����ѹ�����ļ����ļ��ж��ڸ�Ŀ¼������ԭ�����ļ�Ŀ¼��֯��ʽ
	  * @throws IOException
	  *             ѹ���ļ��Ĺ����п��ܻ��׳�IO�쳣�������д�����쳣��
	  */
	  public static void ZIP(String source, String zipFileName)
	         throws IOException {
	     ZipOutputStream zos = new ZipOutputStream(new File(zipFileName));
	  
	     // ����ѹ����ʱ���ļ�������Ϊgb2312
	     zos.setEncoding("gb2312");
	     // System.out.println(zos.getEncoding());
	  
	     File f = new File(source);
	  
	     if (f.isDirectory()) {
	         // ���ֱ��ѹ���ļ���
	         ZIPDIR(source, zos, f.getName() + "/");// �˴�ʹ��/����ʾĿ¼�����ʹ��\\����ʾĿ¼�Ļ����ᵼ��ѹ������ļ�Ŀ¼��֯��ʽ�ڽ�ѹ����ʱ������ȷʶ��
	     } else {
	         // ���ֱ��ѹ���ļ�
	         ZIPDIR(f.getPath(), zos, new File(f.getParent()).getName() + "/");
	         ZIPFile(f.getPath(), zos, new File(f.getParent()).getName() + "/"
	                 + f.getName());
	     }
	  
	     zos.closeEntry();
	     zos.close();
	 }
	  
	  
	  /**
	   * zip ѹ�������ļ��� ������������Ҫ�����������ZIP������ѹ���ļ���
	   * 
	  * @param sourceFileName
	   *            Ҫѹ����ԭ�ļ�
	   * @param zipFileName
	   *            ѹ������ļ���
	   * @param zipFileName
	   *            ѹ������ļ���
	   * @throws IOException
	   *             �׳��ļ��쳣
	   */
	  public static void ZIPFile(String sourceFileName, ZipOutputStream zos,
	          String tager) throws IOException {
	      // System.out.println(tager);
	      ZipEntry ze = new ZipEntry(tager);
	      zos.putNextEntry(ze);
	   
	      // ��ȡҪѹ���ļ���������ӵ�ѹ���ļ���
	      FileInputStream fis = new FileInputStream(new File(sourceFileName));
	      byte[] bf = new byte[2048];
	      int location = 0;
	      while ((location = fis.read(bf)) != -1) {
	          zos.write(bf, 0, location);
	      }
	      fis.close();
	  }
	  
	  /**
	   * ѹ��Ŀ¼�� ������������Ҫ�����������ZIP������ѹ���ļ���
	   * 
	  * @param sourceDir
	   *            ��Ҫѹ����Ŀ¼λ��
	   * @param zos
	   *            ѹ������zip�ļ�
	   * @param tager
	   *            ѹ������Ŀ��λ��
	   * @throws IOException
	   *             ѹ���ļ��Ĺ����п��ܻ��׳�IO�쳣�������д�����쳣��
	   */
	  public static void ZIPDIR(String sourceDir, ZipOutputStream zos,
	          String tager) throws IOException {
	      // System.out.println(tager);
	      ZipEntry ze = new ZipEntry(tager);
	      zos.putNextEntry(ze);
	      // ��ȡҪѹ�����ļ����е������ļ�
	      File f = new File(sourceDir);
	      File[] flist = f.listFiles();
	      if (flist != null) {
	          // ������ļ��������ļ�����ȡ���е��ļ�����ѹ��
	          for (File fsub : flist) {
	              if (fsub.isDirectory()) {
	                  // �����Ŀ¼�����Ŀ¼ѹ��
	                  ZIPDIR(fsub.getPath(), zos, tager + fsub.getName() + "/");
	              } else {
	                  // ������ļ���������ļ�ѹ��
	                  ZIPFile(fsub.getPath(), zos, tager + fsub.getName());
	              }
	          }
	      }
	  }
	  
	  /**
	   * ��ѹ��zip�ļ�
	   * 
	  * @param sourceFileName
	   *            Ҫ��ѹ����zip�ļ�
	   * @param desDir
	   *            ��ѹ������Ŀ¼
	   * @throws IOException
	   *             ѹ���ļ��Ĺ����п��ܻ��׳�IO�쳣�������д�����쳣��
	   */
	  public static void UnZIP(String sourceFileName, String desDir)
	          throws IOException {
	      // ����ѹ���ļ�����
	      ZipFile zf = new ZipFile(new File(sourceFileName));
	   
	      // ��ȡѹ���ļ��е��ļ�ö��
	      Enumeration<ZipEntry> en = zf.getEntries();
	      int length = 0;
	      byte[] b = new byte[2048];
	   
	      // ��ȡѹ���ļ����е�����ѹ��ʵ������
	      while (en.hasMoreElements()) {
	          ZipEntry ze = en.nextElement();
	          // System.out.println("ѹ���ļ����е����ݣ�"+ze.getName());
	          // System.out.println("�Ƿ����ļ��У�"+ze.isDirectory());
	          // ������ѹ������ļ�ʵ������
	          File f = new File(desDir + ze.getName());
	          // System.out.println("��ѹ������ݣ�"+f.getPath());
	          // System.out.println("�Ƿ����ļ��У�"+f.isDirectory());
	          // �����ǰѹ���ļ��е�ʵ���������ļ��о��ڽ�ѹ������ļ����д������ļ���
	          if (ze.isDirectory()) {
	              f.mkdirs();
	          } else {
	              // �����ǰ��ѹ���ļ��ĸ����ļ���û�д����Ļ����򴴽��ø����ļ���
	              if (!f.getParentFile().exists()) {
	                  f.getParentFile().mkdirs();
	              }
	   
	              // ����ǰ�ļ�������д���ѹ����ļ����С�
	              OutputStream outputStream = new FileOutputStream(f);
	              InputStream inputStream = zf.getInputStream(ze);
	              while ((length = inputStream.read(b)) > 0)
	                  outputStream.write(b, 0, length);
	   
	              inputStream.close();
	              outputStream.close();
	          }
	      }
	      zf.close();
	  }
}
