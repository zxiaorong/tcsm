package cn.tcsm.common.annotation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ע�˸�ע��ķ��������Զ���ȡ�û���Ϣ������ֵ����Ӧ�Ĳ���
 * <p>
 * ƥ����ͨ���������������еģ�֧�����в�����
 * <tr>
 * <td>uid - �û�/�̻�/��Ӫ ID
 * <tr>
 * <td>role - �û���ɫ
 * <p>
 * ���� Controller ������
 * <p>
 * {@link javax.servlet.http.HttpSession}
 *
 * @author XLY
 */

@Component
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@RequestMapping
public @interface GetUserInfo {
}
