package com.jw.baseframe.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ReadProperties.java Description: ��ȡ�������������ļ�
 * ����Դ�ļ����ȡֵ���࣬�ļ���׺��һ��Ҫ.Properties��ֻҪ���������磺url=www.cnsec.net
 * ��ͨ��key��url��ȡ��ֵ-www.cnsec.net���򵥡�ǿ��
 */
public class ReadProperties {

	/**
	 * Description: ��ȡ���������ļ�
	 * 
	 * @param path
	 *            ��Դ�ļ�·��
	 * @return Properties Object
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Properties getProperties(String path)
			throws FileNotFoundException, IOException {
		Properties props = null;
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			props = new Properties();
			props.load(new FileInputStream(file));
		} else {
			System.out.println(file.toString() + "�����ڣ�");
		}
		return props;
	}

	/**
	 * Description: �������ļ���ȡֵ
	 * 
	 * @param props
	 *            Properties Object
	 * @param key
	 * @return ͨ��keyƥ�䵽��value
	 */
	@SuppressWarnings("finally")
	public static String getValue(Properties props, String key, String encod) {
		String result = "";
		String en = "";
		String localEN = System.getProperty("file.encoding");
		if (encod != null && !encod.equals("")) {
			en = encod;
		} else {
			en = localEN;
		}
		try {
			key = new String(key.getBytes(en), "ISO-8859-1");
			result = props.getProperty(key);
			if (!result.equals("")) {
				result = new String(result.getBytes("ISO-8859-1"), en);
			}
		} catch (Exception e) {
		} finally {
			if (result == null) {
				result = "";
			}
			return result;
		}
	}

	public static String getValue(Properties props, String key) {
		return getValue(props, key, "");
	}

	public static String getPropertiesDataById(String dateId) {
		ClassLoader ctxClsLdr = Thread.currentThread().getContextClassLoader();
		InputStream in = ctxClsLdr
				.getResourceAsStream("messageResource_zh_CN.properties");
		Properties definition = new Properties();
		try {
			definition.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String date = definition.getProperty(dateId);
		return date;
	}
}
