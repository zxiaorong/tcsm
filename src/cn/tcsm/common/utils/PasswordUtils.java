package cn.tcsm.common.utils;

import org.apache.log4j.Logger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * ���빤��
 *
 * @author Brendan Lee
 */
public class PasswordUtils {
    /**
     * ��ֵ���԰������ַ�����
     */
    private static final char[] SALT_CHAR_ARR =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /**
     * ��ָ��ֵ����SHA-256ɢ�����㣬��ȡ��16���Ʊ��ֵ�ɢ��ֵ
     *
     * @param plaintext ����
     * @return 16���Ʊ��ֵ�SHA-256ɢ��ֵ
     */
    private static String sha256Hex(String plaintext) {
        // ��ȡSHA-256ɢ��ʵ��
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

        // ɢ��ֵ����byte����
        byte[] digestByteArr = md.digest(plaintext.getBytes());

        // ��ÿ��byteȡ��8λ��תΪhex String����ǰ����
        StringBuilder sb = new StringBuilder(64);
        for (byte b : digestByteArr) {
            String hexVal = Integer.toHexString(b & 0xFF);

            if (hexVal.length() == 1) {
                sb.append('0');
            }
            sb.append(hexVal);
        }

        return sb.toString();
    }

    /**
     * ����ָ�����ȵ���ֵ
     * ��ֵ���ַ���ΧΪ 0-9��a-z �� A-Z
     *
     * @param length ��ֵ����
     * @return ��ֵ
     */
    private static String generateSalt(int length) {
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = sr.nextInt(SALT_CHAR_ARR.length);
            sb.append(SALT_CHAR_ARR[index]);
        }

        return sb.toString();
    }

    /**
     * ���������ֵ������������������κ��ɢ��ֵ
     * ͨ������ע��
     *
     * @param password ��������
     * @return ������ֵ�ͼ�������ɢ��ֵ���������
     */
    public static Password newHash(String password) {
        Password pwdObj = new Password();
        String salt = generateSalt(64);
        pwdObj.setSalt(salt);
        pwdObj.setHash(sha256Hex(password + salt));

        return pwdObj;
    }

    /**
     * ���ݸ����������������ֵ��������������ɢ��ֵ
     * ͨ�����ڵ�¼У��
     *
     * @param password ��������
     * @param salt     ��ֵ
     * @return ���������ɢ��ֵ
     */
    public static String hash(String password, String salt) {
        return sha256Hex(password + salt);
    }
}
