package com.jw.baseframe.util;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools {

	/**
	 * 半角文字转化为全角
	 * 
	 * @param BJstr
	 *            需要转化的半角文字
	 * @return 转化后的全角文字
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
	 * 全角文字转化为半角
	 * 
	 * @param QJstr
	 *            需要转化的全角文字
	 * @return 转化后的半角文字
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
	 * 将Null转化为空字符串
	 * 
	 * @param param
	 *            需要转化的字符串
	 * @return 如果为Null则返回空，如果不是则返回原字符串
	 */
	public static Object nullToString(Object param) {
		if (param == null) {
			return "";
		}
		return param;
	}

	/**
	 * 判断字符串是否为null或是空
	 * 
	 * @param param
	 *            需要判断的字符串
	 * @return true 是；false：否
	 */
	public static boolean isNullOrNoValue(String param) {
		if (param == null || "".equals(param.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断字符串不为null且有值
	 * 
	 * @param param
	 *            需要判断的字符串
	 * @return true 是；false：否
	 */
	public static boolean isNotNullAndHasValue(String param) {
		if (param != null && !"".equals(param.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 返回一个字节的十六进制字符串 
	 * @param b 字节
	 * @return 十六进制字符串
	 */
	public static String hexByte(byte b) {
		String s = "000000" + Integer.toHexString(b);
		return s.substring(s.length() - 2);
	}

	/**
	 * 将Null或是空字符串转化为"0"
	 * 
	 * @param param
	 *            需要转化的字符串
	 * @return 如果为Null或是""则返回"0"，如果不是则返回原字符串
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
	 * 判断一个数字是否为素数
	 * 
	 * @param param
	 *            需要判断的数字
	 * @return true：是素数 false：不是素数
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
	 * 判断是否为整数
	 * 
	 * @param str
	 *            传入的字符串
	 * @return 是整数返回true,否则返回false
	 */
	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * 判断是否为浮点数，包括double和float
	 * 
	 * @param str
	 *            传入的字符串
	 * @return 是浮点数返回true,否则返回false
	 */
	public static boolean isDouble(String str) {
		Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * 判断输入的字符串是否为纯汉字
	 * 
	 * @param str
	 *            传入的字符窜
	 * @return 如果是纯汉字返回true,否则返回false
	 */
	public static boolean isChinese(String str) {
		Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+$");
		return pattern.matcher(str).matches();
	}

	/**
	 * 判断是否为质数
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
	 * 人民币转成大写
	 * 
	 * @param value
	 *            数字
	 * @return 大写的人民币
	 */
	public static String hangeToBig(double value) {
		char[] hunit = { '拾', '佰', '仟' }; // 段内位置表示
		char[] vunit = { '万', '亿' }; // 段名表示
		char[] digit = { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' }; // 数字表示
		long midVal = (long) (value * 100); // 转化成整形
		String valStr = String.valueOf(midVal); // 转化成字符串

		String head = valStr.substring(0, valStr.length() - 2); // 取整数部分
		String rail = valStr.substring(valStr.length() - 2); // 取小数部分

		String prefix = ""; // 整数部分转化的结果
		String suffix = ""; // 小数部分转化的结果
		// 处理小数点后面的数
		if (rail.equals("00")) { // 如果小数部分为0
			suffix = "整";
		} else {
			suffix = digit[rail.charAt(0) - '0'] + "角"
					+ digit[rail.charAt(1) - '0'] + "分"; // 否则把角分转化出来
		}
		// 处理小数点前面的数
		char[] chDig = head.toCharArray(); // 把整数部分转化成字符数组
		char zero = '0'; // 标志'0'表示出现过0
		byte zeroSerNum = 0; // 连续出现0的次数
		for (int i = 0; i < chDig.length; i++) { // 循环处理每个数字
			int idx = (chDig.length - i - 1) % 4; // 取段内位置
			int vidx = (chDig.length - i - 1) / 4; // 取段位置
			if (chDig[i] == '0') { // 如果当前字符是0
				zeroSerNum++; // 连续0次数递增
				if (zero == '0') { // 标志
					zero = digit[0];
				} else if (idx == 0 && vidx > 0 && zeroSerNum < 4) {
					prefix += vunit[vidx - 1];
					zero = '0';
				}
				continue;
			}
			zeroSerNum = 0; // 连续0次数清零
			if (zero != '0') { // 如果标志不为0,则加上,例如万,亿什么的
				prefix += zero;
				zero = '0';
			}
			prefix += digit[chDig[i] - '0']; // 转化该数字表示
			if (idx > 0)
				prefix += hunit[idx - 1];
			if (idx == 0 && vidx > 0) {
				prefix += vunit[vidx - 1]; // 段结束位置应该加上段名如万,亿
			}
		}

		if (prefix.length() > 0)
			prefix += '圆'; // 如果整数部分存在,则有圆的字样
		return prefix + suffix; // 返回正确表示
	}

	/**
	 * 去掉字符串中重复的子字符串
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
	 * 判断是不是合法手机
	 * 
	 * @param handset
	 *            手机号
	 * @return true：合法 false：不合法
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
	 * 字符串反转
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
	 * 功能描述:将数字字符按会计格式整理返回固定长度 formatNumber（"-1400.235",2)=-1,400.24保留两位）
	 * 可以保留小数点后几位,如果不足,补0 如果足,就四舍五入 整数和小数的逗号分割
	 */

	public static String formatNumber(String number, int weishu)
			throws Exception {
		if (number == null || (number.trim().length() == 0)) {
			return "";
		}
		String first = number.substring(0, 1);
		if ("-".equals(first)) { // 针对数字为负数的情况
			number = number.substring(1);
			return first + formatPositiveNumber(number, weishu);
		} else { // 针对数字为正数的情况
			return formatPositiveNumber(number, weishu);
		}
	}

	/**
	 * 数字格式化
	 * 
	 * @param number
	 *            需要格式的数字
	 * @param weishu
	 *            小数点位数
	 * @return 格式完成的数字
	 * @throws Exception
	 */
	public static String formatPositiveNumber(String number, int weishu)
			throws Exception {
		try {
			// 判断字符串是否为空
			if (number == null || (number.trim().length() == 0)) {
				return "";
			}
			// 判断首字符为"."的情况
			String first = number.substring(0, 1);
			if (".".equals(first)) {
				number = "0" + number;
			}
			// 判断字符串里有除点号之外的非数字存在
			char[] strArray = number.toCharArray();
			for (int i = 0; i < strArray.length; i++) {
				if ((strArray[i] < '0' || strArray[i] > '9')
						&& strArray[i] != '.') {
					return number;
				}
			}
			// 判断小数位数为0的情况
			if (number.indexOf(".") != -1 && weishu == 0) {

				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);

				// 小数点前字符串分割
				strFirst = splitFirstNumber(strFirst);
				return strFirst;

			}

			// 判断没有小数点，但小数位数要求有位数的情况
			if (number.indexOf(".") == -1 && weishu != 0) {

				number = number + ".";
				for (int i = 0; i < weishu; i++) {
					number = number + "0";
				}

				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);
				String strLast = number.substring(pointNumber + 1, number
						.length());

				// 小数点前字符串分割
				strFirst = splitFirstNumber(strFirst);

				// 小数点后字符串分割
				strLast = splitLastNumber(strLast);

				return strFirst + "." + strLast;

			}

			// 判断没有小数部分的情况
			if ((number.indexOf(".") == -1) && weishu == 0) {

				// 小数点前字符串分割
				number = splitFirstNumber(number);
				return number;
			} else {
				int pointNumber = number.indexOf(".");
				String strFirst = number.substring(0, pointNumber);
				String strLast = number.substring(pointNumber + 1, number
						.length());

				// 小数位数判断
				strLast = formatPoint(strLast, weishu);

				// 小数点前字符串分割
				strFirst = splitFirstNumber(strFirst);

				// 小数点后字符串分割
				strLast = splitLastNumber(strLast);

				return strFirst + "." + strLast;
			}
		} catch (Exception e) {
			throw new Exception("数字格式出错" + e.getMessage());
		}
	}

	/**
	 * @param str
	 *            小数点前的字符串
	 * @return 返回小数点前的逗号分割
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
	 *            小数点后字符串
	 * @return 逗号分割后的字符串
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
	 *            小数点后字符串
	 * @param bitWei
	 *            截取的字符串长度
	 * @return 返回小数点后应得的字符串
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
	 * 验证邮箱
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isEmail(String str) {
		String regex = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		return match(regex, str);
	}

	/**
	 * 验证IP地址
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isIP(String str) {
		String num = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
		String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num
				+ "$";
		return match(regex, str);
	}

	/**
	 * 验证网址Url
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isUrl(String str) {
		String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
		System.out.println(regex);
		return match(regex, str);
	}

	/**
	 * 验证电话号码
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isTelephone(String str) {
		String regex = "^(\\d{3,4}-)?\\d{6,8}$";
		return match(regex, str);
	}

	/**
	 * @param regex
	 *            正则表达式字符串
	 * @param str
	 *            要匹配的字符串
	 * @return 如果str 符合 regex的正则表达式格式,返回true, 否则返回 false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * 验证输入邮政编号
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isPostalcode(String str) {
		String regex = "^\\d{6}$";
		return match(regex, str);
	}

	/**
	 * 验证输入手机号码
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isMobilePhone(String str) {
		String regex = "^[1]+[3,5,8]+\\d{9}$";
		return match(regex, str);
	}

	/**
	 * 验证输入身份证号
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isIDcard(String str) {
		String regex = "(^\\d{18}$)|(^\\d{15}$)";
		return match(regex, str);
	}

	/**
	 * 验证数字输入
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isNumber(String str) {
		String regex = "^[0-9]*$";
		return match(regex, str);
	}

	/**
	 * 验证非零的正整数
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isIntNumber(String str) {
		String regex = "^\\+?[1-9][0-9]*$";
		return match(regex, str);
	}

	/**
	 * 验证大写字母
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isUpChar(String str) {
		String regex = "^[A-Z]+$";
		return match(regex, str);
	}

	/**
	 * 验证小写字母
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isLowChar(String str) {
		String regex = "^[a-z]+$";
		return match(regex, str);
	}

	/**
	 * 验证验证输入字母
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isLetter(String str) {
		String regex = "^[A-Za-z]+$";
		return match(regex, str);
	}

	/**
	 * 验证验证输入字符串
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isLength(String str) {
		String regex = "^.{8,}$";
		return match(regex, str);
	}

	/**
	 * 数组排序
	 * 
	 * @param list
	 *            需要排序的list
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
	 * 基本功能：过滤所有以"<"开头以">"结尾的标签
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
	 * 根据分隔符去除最后的部分
	 * 
	 * @param oldValue
	 * @param spitValue
	 * @return
	 */
	public static String RemoveLastSpitString(String oldValue, String spitValue) {

		String[] tempArrStrings;
		String tempValueString = "";
		tempArrStrings = oldValue.split(spitValue);

		// 根据分隔符取得除最后一个字符串以外的字符串
		for (int i = 0; i < tempArrStrings.length - 1; i++) {
			tempValueString += tempArrStrings[i] + Constants.G_S_COMPART1;
		}

		// 如果字符串不为空则去除最后一个分隔符（逗号）
		if (!"".equals(tempValueString)) {
			tempValueString = tempValueString.substring(0, tempValueString
					.length() - 1);
		}

		return tempValueString;
	}

	/**
	 * 根据分隔符取得最后的字符串
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
	  *     RomoveStringByList(请用一句话描述这个方法的作用)
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
		
		
		String tempValueString = spitValue + oldValue + spitValue;//2015-10-13 修改人：youjh   spitValue + oldValue + spitValue
		tempArrStrings = removeValue.split(spitValue); //2015-10-13 修改人：youjh  removeValue.split(spitValue);
		
		for(String temp:tempArrStrings)
		{
			tempValueString =tempValueString.replace(spitValue + temp + spitValue, spitValue);//2015-10-13 修改人：youjh  修改替换的字符串spitValue + temp + spitValue
		}
		String[] tempvaluesStrings = tempValueString.split(spitValue);//2015-10-13 修改人：youjh  修改判断语句
		if(tempvaluesStrings.length>=1)
		{
		return tempValueString.substring(1);
		}
		else {
			return "";
		}
	}
	
	/**
	 * 将驼峰式命名的字符串转换为下划线大写方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。</br>
	 * 例如：HelloWorld->HELLO_WORLD
	 * @param name 转换前的驼峰式命名的字符串
	 * @return 转换后下划线大写方式命名的字符串
	 */
	public static String underscoreName(String name) {
	    StringBuilder result = new StringBuilder();
	    if (name != null && name.length() > 0) {
	        // 将第一个字符处理成大写
	        result.append(name.substring(0, 1).toUpperCase());
	        // 循环处理其余字符
	        for (int i = 1; i < name.length(); i++) {
	            String s = name.substring(i, i + 1);
	            // 在大写字母前添加下划线
	            if (s.equals(s.toUpperCase()) && !Character.isDigit(s.charAt(0))) {
	                result.append("_");
	            }
	            // 其他字符直接转成大写
	            result.append(s.toUpperCase());
	        }
	    }
	    return result.toString();
	}
	 
	/**
	 * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。</br>
	 * 例如：HELLO_WORLD->HelloWorld
	 * @param name 转换前的下划线大写方式命名的字符串
	 * @return 转换后的驼峰式命名的字符串
	 */
	public static String camelName(String name) {
	    StringBuilder result = new StringBuilder();
	    // 快速检查
	    if (name == null || name.isEmpty()) {
	        // 没必要转换
	        return "";
	    } else if (!name.contains("_")) {
	        // 不含下划线，仅将首字母小写
	        return name.substring(0, 1).toLowerCase() + name.substring(1);
	    }
	    // 用下划线将原始字符串分割
	    String camels[] = name.split("_");
	    for (String camel :  camels) {
	        // 跳过原始字符串中开头、结尾的下换线或双重下划线
	        if (camel.isEmpty()) {
	            continue;
	        }
	        // 处理真正的驼峰片段
	        if (result.length() == 0) {
	            // 第一个驼峰片段，全部字母都小写
	            result.append(camel.toLowerCase());
	        } else {
	            // 其他的驼峰片段，首字母大写
	            result.append(camel.substring(0, 1).toUpperCase());
	            result.append(camel.substring(1).toLowerCase());
	        }
	    }
	    return result.toString();
	}
}
