package com.jw.baseframe.util;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools {

	/**
	 * �������ת��Ϊȫ��
	 * 
	 * @param BJstr
	 *            ��Ҫת���İ������
	 * @return ת�����ȫ������
	 */
	public static final String BQchange(String BJstr) {
		String outStr = "";
		String Tstr = "";
		byte[] b = null;

		for (int i = 0; i < BJstr.length(); i++) {
			try {
				Tstr = BJstr.substring(i, i + 1);
				b = Tstr.getBytes("unicode");
			} catch (java.io.UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			if (b[3] != -1) {
				b[2] = (byte) (b[2] - 32);
				b[3] = -1;
				try {
					outStr = outStr + new String(b, "unicode");
				} catch (java.io.UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else
				outStr = outStr + Tstr;
		}
		return outStr;
	}

	/**
	 * ȫ������ת��Ϊ���
	 * 
	 * @param QJstr
	 *            ��Ҫת����ȫ������
	 * @return ת����İ������
	 */
	public static final String QBchange(String QJstr) {
		String outStr = "";
		String Tstr = "";
		byte[] b = null;

		for (int i = 0; i < QJstr.length(); i++) {
			try {
				Tstr = QJstr.substring(i, i + 1);
				b = Tstr.getBytes("unicode");
			} catch (java.io.UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			if (b[3] == -1) {
				b[2] = (byte) (b[2] + 32);
				b[3] = 0;
				try {
					outStr = outStr + new String(b, "unicode");
				} catch (java.io.UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else
				outStr = outStr + Tstr;
		}
		return outStr;
	}

	/**
	 * ��Nullת��Ϊ���ַ���
	 * 
	 * @param param
	 *            ��Ҫת�����ַ���
	 * @return ���ΪNull�򷵻ؿգ���������򷵻�ԭ�ַ���
	 */
	public static Object nullToString(Object param) {
		if (param == null) {
			return "";
		}
		return param;
	}

	/**
	 * �ж��ַ����Ƿ�Ϊnull���ǿ�
	 * 
	 * @param param
	 *            ��Ҫ�жϵ��ַ���
	 * @return true �ǣ�false����
	 */
	public static boolean isNullOrNoValue(String param) {
		if (param == null || "".equals(param.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж��ַ�����Ϊnull����ֵ
	 * 
	 * @param param
	 *            ��Ҫ�жϵ��ַ���
	 * @return true �ǣ�false����
	 */
	public static boolean isNotNullAndHasValue(String param) {
		if (param != null && !"".equals(param.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ����һ���ֽڵ�ʮ�������ַ��� 
	 * @param b �ֽ�
	 * @return ʮ�������ַ���
	 */
	public static String hexByte(byte b) {
		String s = "000000" + Integer.toHexString(b);
		return s.substring(s.length() - 2);
	}

	/**
	 * ��Null���ǿ��ַ���ת��Ϊ"0"
	 * 
	 * @param param
	 *            ��Ҫת�����ַ���
	 * @return ���ΪNull����""�򷵻�"0"����������򷵻�ԭ�ַ���
	 */
	public static String defaultNumber(String param) {

		if (param == null) {
			return "0";
		}
		if (param.length() == 0) {
			return "0";
		}
		return param;
	}

	/**
	 * �ж�һ�������Ƿ�Ϊ����
	 * 
	 * @param param
	 *            ��Ҫ�жϵ�����
	 * @return true�������� false����������
	 */
	public static boolean isPrimes(int param) {
		for (int i = 2; i <= Math.sqrt(param); i++) {
			if (param % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * �ж��Ƿ�Ϊ����
	 * 
	 * @param str
	 *            ������ַ���
	 * @return ����������true,���򷵻�false
	 */
	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * �ж��Ƿ�Ϊ������������double��float
	 * 
	 * @param str
	 *            ������ַ���
	 * @return �Ǹ���������true,���򷵻�false
	 */
	public static boolean isDouble(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * �ж�������ַ����Ƿ�Ϊ������
	 * 
	 * @param str
	 *            ������ַ���
	 * @return ����Ǵ����ַ���true,���򷵻�false
	 */
	public static boolean isChinese(String str) {
		Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+$");
		return pattern.matcher(str).matches();
	}

	/**
	 * �ж��Ƿ�Ϊ����
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPrime(int x) {
		if (x <= 7) {
			if (x == 2 || x == 3 || x == 5 || x == 7)
				return true;
		}
		int c = 7;
		if (x % 2 == 0)
			return false;
		if (x % 3 == 0)
			return false;
		if (x % 5 == 0)
			return false;
		int end = (int) Math.sqrt(x);
		while (c <= end) {
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 6;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 6;
		}
		return true;
	}

	/**
	 * �����ת�ɴ�д
	 * 
	 * @param value
	 *            ����
	 * @return ��д�������
	 */
	public static String hangeToBig(double value) {
		char[] hunit = { 'ʰ', '��', 'Ǫ' }; // ����λ�ñ�ʾ
		char[] vunit = { '��', '��' }; // ������ʾ
		char[] digit = { '��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��', '��' }; // ���ֱ�ʾ
		long midVal = (long) (value * 100); // ת��������
		String valStr = String.valueOf(midVal); // ת�����ַ���

		String head = valStr.substring(0, valStr.length() - 2); // ȡ��������
		String rail = valStr.substring(valStr.length() - 2); // ȡС������

		String prefix = ""; // ��������ת���Ľ��
		String suffix = ""; // С������ת���Ľ��
		// ����С����������
		if (rail.equals("00")) { // ���С������Ϊ0
			suffix = "��";
		} else {
			suffix = digit[rail.charAt(0) - '0'] + "��"
					+ digit[rail.charAt(1) - '0'] + "��"; // ����ѽǷ�ת������
		}
		// ����С����ǰ�����
		char[] chDig = head.toCharArray(); // ����������ת�����ַ�����
		char zero = '0'; // ��־'0'��ʾ���ֹ�0
		byte zeroSerNum = 0; // ��������0�Ĵ���
		for (int i = 0; i < chDig.length; i++) { // ѭ������ÿ������
			int idx = (chDig.length - i - 1) % 4; // ȡ����λ��
			int vidx = (chDig.length - i - 1) / 4; // ȡ��λ��
			if (chDig[i] == '0') { // �����ǰ�ַ���0
				zeroSerNum++; // ����0��������
				if (zero == '0') { // ��־
					zero = digit[0];
				} else if (idx == 0 && vidx > 0 && zeroSerNum < 4) {
					prefix += vunit[vidx - 1];
					zero = '0';
				}
				continue;
			}
			zeroSerNum = 0; // ����0��������
			if (zero != '0') { // �����־��Ϊ0,�����,������,��ʲô��
				prefix += zero;
				zero = '0';
			}
			prefix += digit[chDig[i] - '0']; // ת�������ֱ�ʾ
			if (idx > 0)
				prefix += hunit[idx - 1];
			if (idx == 0 && vidx > 0) {
				prefix += vunit[vidx - 1]; // �ν���λ��Ӧ�ü��϶�������,��
			}
		}

		if (prefix.length() > 0)
			prefix += 'Բ'; // ����������ִ���,����Բ������
		return prefix + suffix; // ������ȷ��ʾ
	}

	/**
	 * ȥ���ַ������ظ������ַ���
	 * 
	 * @param str
	 * @return String
	 */
	public static String removeSameString(String str) {
		Set<String> mLinkedSet = new LinkedHashSet<String>();
		String[] strArray = str.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if (!mLinkedSet.contains(strArray[i])) {
				mLinkedSet.add(strArray[i]);
				sb.append(strArray[i] + " ");
			}
		}
		System.out.println(mLinkedSet);
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	/**
	 * �ж��ǲ��ǺϷ��ֻ�
	 * 
	 * @param handset
	 *            �ֻ���
	 * @return true���Ϸ� false�����Ϸ�
	 */
	public static boolean isHandset(String handset) {
		try {
			if (!handset.substring(0, 1).equals("1")) {
				return false;
			}
			if (handset == null || handset.length() != 11) {
				return false;
			}
			String check = "^[0123456789]+$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(handset);
			boolean isMatched = matcher.matches();
			if (isMatched) {
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException e) {
			return false;
		}
	}

	/**
	 * �ַ�����ת
	 * 
	 * @param param
	 * @return
	 */
	public static String CoverseString(String param) {
		String converseString = "";
		for (int i = param.length() - 1; i >= 0; i--) {
			converseString = converseString + param.charAt(i);
		}
		return converseString;
	}

	/*
	 * ��������:�������ַ�����Ƹ�ʽ�����ع̶����� formatNumber��"-1400.235",2)=-1,400.24������λ��
	 * ���Ա���С�����λ,�������,��0 �����,���������� ������С���Ķ��ŷָ�
	 */

	public static String formatNumber(String number, int weishu)
			throws Exception {
		if (number == null || (number.trim().length() == 0)) {
			return "";
		}
		String first = number.substring(0, 1);
		if ("-".equals(first)) { // �������Ϊ���������
			number = number.substring(1);
			return first + formatPositiveNumber(number, weishu);
		} else { // �������Ϊ���������
			return formatPositiveNumber(number, weishu);
		}
	}

	/**
	 * ���ָ�ʽ��
	 * 
	 * @param number
	 *            ��Ҫ��ʽ������
	 * @param weishu
	 *            С����λ��
	 * @return ��ʽ��ɵ�����
	 * @throws Exception
	 */
	public static String formatPositiveNumber(String number, int weishu)
			throws Exception {
		try {
			// �ж��ַ����Ƿ�Ϊ��
			if (number == null || (number.trim().length() == 0)) {
				return "";
			}
			// �ж����ַ�Ϊ"."�����
			String first = number.substring(0, 1);
			if (".".equals(first)) {
				number = "0" + number;
			}
			// �ж��ַ������г����֮��ķ����ִ���
			char[] strArray = number.toCharArray();
			for (int i = 0; i < strArray.length; i++) {
				if ((strArray[i] < '0' || strArray[i] > '9')
						&& strArray[i] != '.') {
					return number;
				}
			}
			// �ж�С��λ��Ϊ0�����
			if (number.indexOf(".") != -1 && weishu == 0) {

				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);

				// С����ǰ�ַ����ָ�
				strFirst = splitFirstNumber(strFirst);
				return strFirst;

			}

			// �ж�û��С���㣬��С��λ��Ҫ����λ�������
			if (number.indexOf(".") == -1 && weishu != 0) {

				number = number + ".";
				for (int i = 0; i < weishu; i++) {
					number = number + "0";
				}

				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);
				String strLast = number.substring(pointNumber + 1, number
						.length());

				// С����ǰ�ַ����ָ�
				strFirst = splitFirstNumber(strFirst);

				// С������ַ����ָ�
				strLast = splitLastNumber(strLast);

				return strFirst + "." + strLast;

			}

			// �ж�û��С�����ֵ����
			if ((number.indexOf(".") == -1) && weishu == 0) {

				// С����ǰ�ַ����ָ�
				number = splitFirstNumber(number);
				return number;
			} else {
				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);
				String strLast = number.substring(pointNumber + 1, number
						.length());

				// С��λ���ж�
				strLast = formatPoint(strLast, weishu);

				// С����ǰ�ַ����ָ�
				strFirst = splitFirstNumber(strFirst);

				// С������ַ����ָ�
				strLast = splitLastNumber(strLast);

				return strFirst + "." + strLast;
			}
		} catch (Exception e) {
			throw new Exception("���ָ�ʽ����" + e.getMessage());
		}
	}

	/**
	 * @param str
	 *            С����ǰ���ַ���
	 * @return ����С����ǰ�Ķ��ŷָ�
	 */
	public static String splitFirstNumber(String str) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		strBuffer.reverse();
		str = strBuffer.toString();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i = i + 3) {
			if (i + 3 < str.length()) {
				String str1 = str.substring(i, i + 3);
				sb.append(str1);
				sb.append(",");
			} else {
				String str2 = str.substring(i, str.length());
				sb.append(str2);
			}
		}
		sb.reverse();
		return sb.toString();
	}

	/**
	 * @param str
	 *            С������ַ���
	 * @return ���ŷָ����ַ���
	 */
	public static String splitLastNumber(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i = i + 3) {
			if (i + 3 < str.length()) {
				String str1 = str.substring(i, i + 3);
				sb.append(str1);
				sb.append(",");
			} else {
				String str2 = str.substring(i, str.length());
				sb.append(str2);
			}
		}
		return sb.toString();
	}

	/**
	 * @param laststr
	 *            С������ַ���
	 * @param bitWei
	 *            ��ȡ���ַ�������
	 * @return ����С�����Ӧ�õ��ַ���
	 */
	public static String formatPoint(String laststr, int bitWei) {
		int n = laststr.length();
		if (n < bitWei) {
			for (int i = 0; i < bitWei - n; i++) {
				laststr = laststr + "0";
			}
		} else {
			BigDecimal bd = new BigDecimal("0." + laststr).setScale(bitWei,
					BigDecimal.ROUND_HALF_UP);
			laststr = bd.toString();
			laststr = laststr.substring(2, laststr.length());
		}
		return laststr;
	}

	/**
	 * ��֤����
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϵ��ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isEmail(String str) {
		String regex = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		return match(regex, str);
	}

	/**
	 * ��֤IP��ַ
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isIP(String str) {
		String num = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
		String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num
				+ "$";
		return match(regex, str);
	}

	/**
	 * ��֤��ַUrl
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isUrl(String str) {
		String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
		System.out.println(regex);
		return match(regex, str);
	}

	/**
	 * ��֤�绰����
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isTelephone(String str) {
		String regex = "^(\\d{3,4}-)?\\d{6,8}$";
		return match(regex, str);
	}

	/**
	 * @param regex
	 *            ������ʽ�ַ���
	 * @param str
	 *            Ҫƥ����ַ���
	 * @return ���str ���� regex��������ʽ��ʽ,����true, ���򷵻� false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * ��֤�����������
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isPostalcode(String str) {
		String regex = "^\\d{6}$";
		return match(regex, str);
	}

	/**
	 * ��֤�����ֻ�����
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isMobilePhone(String str) {
		String regex = "^[1]+[3,5,8]+\\d{9}$";
		return match(regex, str);
	}

	/**
	 * ��֤�������֤��
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isIDcard(String str) {
		String regex = "(^\\d{18}$)|(^\\d{15}$)";
		return match(regex, str);
	}

	/**
	 * ��֤��������
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isNumber(String str) {
		String regex = "^[0-9]*$";
		return match(regex, str);
	}

	/**
	 * ��֤�����������
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isIntNumber(String str) {
		String regex = "^\\+?[1-9][0-9]*$";
		return match(regex, str);
	}

	/**
	 * ��֤��д��ĸ
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isUpChar(String str) {
		String regex = "^[A-Z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤Сд��ĸ
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isLowChar(String str) {
		String regex = "^[a-z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤��֤������ĸ
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isLetter(String str) {
		String regex = "^[A-Za-z]+$";
		return match(regex, str);
	}

	/**
	 * ��֤��֤�����ַ���
	 * 
	 * @param ����֤���ַ���
	 * @return ����Ƿ��ϸ�ʽ���ַ���,���� <b>true </b>,����Ϊ <b>false </b>
	 */
	public static boolean isLength(String str) {
		String regex = "^.{8,}$";
		return match(regex, str);
	}

	/**
	 * ��������
	 * 
	 * @param list
	 *            ��Ҫ�����list
	 */
	public static void sort(Object[] list) {
		Object currentMax;
		int currentMaxIndex;

		for (int i = list.length - 1; i >= 1; i--) {
			currentMax = list[i];
			currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (((Comparable) currentMax).compareTo(list[j]) < 0) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

		}
	}

	/**
	 * 
	 * �������ܣ�����������"<"��ͷ��">"��β�ı�ǩ
	 * <p>
	 * 
	 * @param str
	 * @return String
	 */
	public static String filterHtml(String str) {
		String strTemp = "";
		if (str != null && !"".equals(str)) {
			Pattern pattern = Pattern.compile("<([^>]*)>");
			Matcher matcher = pattern.matcher(str);
			StringBuffer sb = new StringBuffer();
			boolean result1 = matcher.find();
			while (result1) {
				matcher.appendReplacement(sb, "");
				result1 = matcher.find();
			}
			matcher.appendTail(sb);
			strTemp = sb.toString();

		}

		return strTemp;
	}

	/**
	 * ���ݷָ���ȥ�����Ĳ���
	 * 
	 * @param oldValue
	 * @param spitValue
	 * @return
	 */
	public static String RemoveLastSpitString(String oldValue, String spitValue) {

		String[] tempArrStrings;
		String tempValueString = "";
		tempArrStrings = oldValue.split(spitValue);

		// ���ݷָ���ȡ�ó����һ���ַ���������ַ���
		for (int i = 0; i < tempArrStrings.length - 1; i++) {
			tempValueString += tempArrStrings[i] + Constants.G_S_COMPART1;
		}

		// ����ַ�����Ϊ����ȥ�����һ���ָ��������ţ�
		if (!"".equals(tempValueString)) {
			tempValueString = tempValueString.substring(0, tempValueString
					.length() - 1);
		}

		return tempValueString;
	}

	/**
	 * ���ݷָ���ȡ�������ַ���
	 * 
	 * @param oldValue
	 * @param spitValue
	 * @return
	 */
	public static String GetLastSpitString(String oldValue, String spitValue) {

		String[] tempArrStrings;
		String tempValueString = "";
		tempArrStrings = oldValue.split(spitValue);

		tempValueString = tempArrStrings[tempArrStrings.length-1];

		return tempValueString;
	}
	
	
	/**
	 * 
	  * <b>Summary: </b>
	  *     RomoveStringByList(����һ�仰�����������������)
	  * @param oldValue
	  * @param removeValue
	  * @param spitValue
	  * @return
	 */
	public static String RomoveStringByList(String oldValue,String removeValue, String spitValue)
	{
		String[] tempArrStrings;
		
		if(isNullOrNoValue(oldValue))
		{
			return "";
		}
		
		
		String tempValueString = spitValue + oldValue + spitValue;//2015-10-13 �޸��ˣ�youjh   spitValue + oldValue + spitValue
		tempArrStrings = removeValue.split(spitValue); //2015-10-13 �޸��ˣ�youjh  removeValue.split(spitValue);
		
		for(String temp:tempArrStrings)
		{
			tempValueString =tempValueString.replace(spitValue + temp + spitValue, spitValue);//2015-10-13 �޸��ˣ�youjh  �޸��滻���ַ���spitValue + temp + spitValue
		}
		String[] tempvaluesStrings = tempValueString.split(spitValue);//2015-10-13 �޸��ˣ�youjh  �޸��ж����
		if(tempvaluesStrings.length>=1)
		{
		return tempValueString.substring(1);
		}
		else {
			return "";
		}
	}
	
	/**
	 * ���շ�ʽ�������ַ���ת��Ϊ�»��ߴ�д��ʽ�����ת��ǰ���շ�ʽ�������ַ���Ϊ�գ��򷵻ؿ��ַ�����</br>
	 * ���磺HelloWorld->HELLO_WORLD
	 * @param name ת��ǰ���շ�ʽ�������ַ���
	 * @return ת�����»��ߴ�д��ʽ�������ַ���
	 */
	public static String underscoreName(String name) {
	    StringBuilder result = new StringBuilder();
	    if (name != null && name.length() > 0) {
	        // ����һ���ַ�����ɴ�д
	        result.append(name.substring(0, 1).toUpperCase());
	        // ѭ�����������ַ�
	        for (int i = 1; i < name.length(); i++) {
	            String s = name.substring(i, i + 1);
	            // �ڴ�д��ĸǰ����»���
	            if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
	                result.append("_");
	            }
	            // �����ַ�ֱ��ת�ɴ�д
	            result.append(s.toUpperCase());
	        }
	    }
	    return result.toString();
	}
	 
	/**
	 * ���»��ߴ�д��ʽ�������ַ���ת��Ϊ�շ�ʽ�����ת��ǰ���»��ߴ�д��ʽ�������ַ���Ϊ�գ��򷵻ؿ��ַ�����</br>
	 * ���磺HELLO_WORLD->HelloWorld
	 * @param name ת��ǰ���»��ߴ�д��ʽ�������ַ���
	 * @return ת������շ�ʽ�������ַ���
	 */
	public static String camelName(String name) {
	    StringBuilder result = new StringBuilder();
	    // ���ټ��
	    if (name == null || name.isEmpty()) {
	        // û��Ҫת��
	        return "";
	    } else if (!name.contains("_")) {
	        // �����»��ߣ���������ĸСд
	        return name.substring(0, 1).toLowerCase() + name.substring(1);
	    }
	    // ���»��߽�ԭʼ�ַ����ָ�
	    String camels[] = name.split("_");
	    for (String camel :  camels) {
	        // ����ԭʼ�ַ����п�ͷ����β���»��߻�˫���»���
	        if (camel.isEmpty()) {
	            continue;
	        }
	        // �����������շ�Ƭ��
	        if (result.length() == 0) {
	            // ��һ���շ�Ƭ�Σ�ȫ����ĸ��Сд
	            result.append(camel.toLowerCase());
	        } else {
	            // �������շ�Ƭ�Σ�����ĸ��д
	            result.append(camel.substring(0, 1).toUpperCase());
	            result.append(camel.substring(1).toLowerCase());
	        }
	    }
	    return result.toString();
	}
}
