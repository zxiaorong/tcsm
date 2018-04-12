package cn.tcsm.common.enumeration;

/**
 * �û���ɫö��
 *
 * @author Ice_Dog
 */

public enum UserRoleEnum {
    /**
     * ��Ӧ��
     */
    CONSUMER(1),

    /**
     * Ƭ������Ա
     */
    AREA_ADMIN(2),

    /**
     * ����Ա
     */
    ADMIN(3);

   
    private int value;

    /**
     * ˽�й���
     *
     * @param value ö��ֵ
     */
    UserRoleEnum(int value) {
        this.value = value;
    }

    /**
     * ��ȡö��ֵ
     *
     * @return ö��ֵ
     */
    public int getValue() {
        return value;
    }
}
