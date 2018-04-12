package cn.tcsm.common.exception;

import cn.tcsm.common.enumeration.IllegalAccessTypeEnum;

/**
 * �Ƿ������쳣
 * <p>
 * �������ֺϷ�����ʱ�������쳣�����ڷֱ�ͳһ����
 * <p>
 * �磺�ϴ�ͼƬʱ�ļ���չ������ȷ������ǰ���Ѿ��������ƣ��������ֻ���ڷǷ�����ʱ�������� {@link java.sql.SQLException} �ںϷ�����ʱҲ�����׳�
 *
 * @author Brendan Lee
 */
public class IllegalAccessException extends Exception {
    public IllegalAccessException() {}

    public IllegalAccessException(String message) {
        super(message);
    }

    public IllegalAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAccessException(Throwable cause) {
        super(cause);
    }

    public IllegalAccessException(IllegalAccessTypeEnum type) {
        this(type.getValue());
    }
}
