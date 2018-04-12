package cn.tcsm.common.enumeration;

/**
 * �Ƿ����ʵ�����
 *
 * @author Brendan Lee
 */
public enum IllegalAccessTypeEnum {
    /**
     * ��Ҫ����ȱʧ
     */
    MISS_PARAM("��Ҫ����ȱʧ"),

    /**
     * �����Ƿ�
     */
    ILLEGAL_PARAM("�����Ƿ�"),

    /**
     * ��Ȩ����
     */
    NO_PERMISSION("��Ȩ����"),

    /**
     * �ļ�����
     */
    FILE_OVERSIZE("�ļ�����"),

    /**
     * �ļ���չ������
     */
    INCORRECT_FILE_EXTENSION("�ļ���չ������");

    /**
     * �Ƿ����ʵ�����˵��
     */
    private String value;

    /**
     * ö�ٹ�����
     *
     * @param value ö�ٵ�ֵ
     */
    IllegalAccessTypeEnum(String value) {
        this.value = value;
    }

    /**
     * ��ȡ�Ƿ����ʵ�����˵��
     *
     * @return �Ƿ����ʵ�����˵��
     */
    public String getValue() {
        return value;
    }
}
