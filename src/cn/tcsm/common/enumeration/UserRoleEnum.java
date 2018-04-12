package cn.tcsm.common.enumeration;

/**
 * 用户角色枚举
 *
 * @author Ice_Dog
 */

public enum UserRoleEnum {
    /**
     * 供应商
     */
    CONSUMER(1),

    /**
     * 片区管理员
     */
    AREA_ADMIN(2),

    /**
     * 管理员
     */
    ADMIN(3);

   
    private int value;

    /**
     * 私有构造
     *
     * @param value 枚举值
     */
    UserRoleEnum(int value) {
        this.value = value;
    }

    /**
     * 获取枚举值
     *
     * @return 枚举值
     */
    public int getValue() {
        return value;
    }
}
