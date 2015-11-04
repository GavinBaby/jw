package com.jw.baseframe.util;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils
{

    /**
	 * ѭ������ת��, ��ȡ����� DeclaredMethod
	 * 
	 * @param object
	 *            : �������
	 * @param methodName
	 *            : �����еķ�����
	 * @param parameterTypes
	 *            : �����еķ�����������
	 * @return �����еķ�������
	 */

	public static Method getDeclaredMethod(Object object, String methodName,
			Class<?>... parameterTypes) {
		Method method = null;

		for (Class<?> clazz = object.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
			try {
				method = clazz.getDeclaredMethod(methodName, parameterTypes);
				return method;
			} catch (Exception e) {
				// ����ʲô����Ҫ��������������쳣��������д�������׳�ȥ��
				// ���������쳣��ӡ���������ף���Ͳ���ִ��clazz =
				// clazz.getSuperclass(),���Ͳ�����뵽��������

			}
		}
		return null;
	}

	/**
	 * ֱ�ӵ��ö��󷽷�, ���������η�(private, protected, default)
	 * 
	 * @param object
	 *            : �������
	 * @param methodName
	 *            : �����еķ�����
	 * @param parameterTypes
	 *            : �����еķ�����������
	 * @param parameters
	 *            : �����еķ�������
	 * @return �����з�����ִ�н��
	 */

	public static Object invokeMethod(Object object, String methodName,
			Class<?>[] parameterTypes, Object[] parameters) {
		// ���� ���󡢷������Ͷ�Ӧ�ķ������� ͨ������ ��������ķ�����ȡ Method ����
		Method method = getDeclaredMethod(object, methodName, parameterTypes);

		// ����Java�Է������м��,��Ҫ�����˽�з�������
		method.setAccessible(true);

		try {
			if (null != method) {
				// ����object �� method ������ķ������䷽���Ĳ����� parameters
				return method.invoke(object, parameters);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * ѭ������ת��, ��ȡ����� DeclaredField 
	 * @param object : �������
	 * @param
	 * fieldName : �����е������� 
	 * @return �����е����Զ���
	 */

	public static Field getDeclaredField(Object object, String fieldName) {
		Field field = null;

		Class<?> clazz = object.getClass();

		for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
			try {
				field = clazz.getDeclaredField(fieldName);
				return field;
			} catch (Exception e) {
				// ������ô����Ҫ��������������쳣��������д�������׳�ȥ��
				// ���������쳣��ӡ���������ף���Ͳ���ִ��clazz =
				// clazz.getSuperclass(),���Ͳ�����뵽��������

			}
		}

		return null;
	}

	/**
	 * ֱ�����ö�������ֵ, ���� private/protected ���η�, Ҳ������ setter 
	 * @paramobject : �������
	 * @param fieldName : �����е�������
	 * @param value :
	 * ��Ҫ���õ�ֵ 106.
	 */

	public static void setFieldValue(Object object, String fieldName,
			Object value) {

		// ���� �����������ͨ������ ��������ķ�����ȡ Field����
		Field field = getDeclaredField(object, fieldName);

		// ����Java����ļ��
		field.setAccessible(true);

		try {
			// �� object �� field �������ֵ ����Ϊ value
			field.set(object, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	/**
	 * ֱ�Ӷ�ȡ���������ֵ, ���� private/protected ���η�, Ҳ������ getter
	 * 
	 * @param object
	 *            : �������
	 * @param fieldName
	 *            : �����е�������
	 * @return : �����е�����ֵ
	 */

	public static Object getFieldValue(Object object, String fieldName) {

		// ���� �����������ͨ������ ��������ķ�����ȡ Field����
		Field field = getDeclaredField(object, fieldName);
		boolean accessible = field.isAccessible();
		// ����Java����ļ��
		field.setAccessible(true);

		try {
			Object value = field.get(object);
			field.setAccessible(accessible);
			// ��ȡ object �� field �����������ֵ
			return value;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}