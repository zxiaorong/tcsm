package cn.tcsm.common.annotation;

import cn.tcsm.common.enumeration.UserRoleEnum;

import java.lang.annotation.*;

import cn.tcsm.common.enumeration.UserRoleEnum;

/**
 * ��ע�����ڱ�ʾҵ��������û���ɫ�������� Controller ����
 * <p>
 * ���ѵ�¼�û��Ľ�ɫ����Ҫ��ʱ������ִ�и÷���������������ʱ��������Ϊ�Ƿ����󣬷���״̬�� 3
 *
 * @author Brendan Lee
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedRole {

	UserRoleEnum[] value();
    /**
     * ҵ��������û���ɫ����
     * <p>
     * �ѵ�¼�û��Ľ�ɫ���ڸ�������ʱ���ж�Ϊ�Ƿ����󣬷���״̬�� 3
     *
     * @see UserRoleEnum
     */
}
