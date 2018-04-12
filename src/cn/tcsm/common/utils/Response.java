package cn.tcsm.common.utils;

import java.util.HashMap;

/**
 * ��Ӧֵ��
 *
 * @author Brendan Lee
 */
public class Response extends HashMap<String, Object> {
	/**
	 * ����һ������״̬�����Ӧֵ����
	 *
	 * @param statusCode ״̬��
	 */
	public Response(int statusCode) {
		put("status", statusCode);
	}

	/**
	 * ��Ӽ�ֵ��
	 *
	 * @param key   ����
	 * @param value ֵ
	 * @return ��Ӧֵ��������������������
	 */
	public Response add(String key, Object value) {
		put(key, value);
		return this;
	}
}
