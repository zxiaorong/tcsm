package cn.tcsm.common.aspect;

import com.google.gson.Gson;
import cn.tcsm.common.annotation.NeedRole;
import cn.tcsm.common.enumeration.UserRoleEnum;
import cn.tcsm.common.utils.AppContextUtils;
import cn.tcsm.common.utils.Response;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Session ����
 *
 * @author XLY
 * @author Brendan Lee
 */
@Aspect
@Component
public class SessionAspect {
    private static final Logger LOGGER = Logger.getLogger(SessionAspect.class);
    private static final Gson GSON = new Gson();
    private static final String UID_FIELD_NAME = "uid";
    private static final Pattern SESSION_KEY_PATTERN = Pattern.compile("\"timestamp\":");
    private static final int OPENID_START_INDEX = 11;
    private static final int OPENID_END_INDEX = 39;

    /**
     * session ӵ�еĲ������б�
     */
    private static final String[] SESSION_ATTR_ARR = {"uid", "role"};

    /**
     * ˮӡ����ʱ��
     * <p>
     * 4 ��������Ч
     */
    private static final int WATERMARK_EXPIRE_TIME = 4 * 60;

    /**
     * ����û��Ƿ��ѵ�¼
     * <p>
     * �ѵ�¼ʱ���뷽����δ��¼ʱֱ�ӷ���
     *
     * @param joinPoint ���ӵ�
     * @return δ��¼ʱ����״̬�� 2���ѵ�¼ʱ�������ӵ㷽���ķ���ֵ
     * @throws Throwable �����쳣ʱ�׳�
     */
    @Around("@annotation(com.qiancheng.om.common.annotation.NeedLogin)")
    private Object aspect001checkLogin(ProceedingJoinPoint joinPoint) throws Throwable {
        // ��ȡ session
        HttpSession session = AppContextUtils.getSession();

        // ��� session ���Ƿ��� UID������˵��δ��¼��ֱ�ӷ���
        if (session.getAttribute(UID_FIELD_NAME) == null) {
            return GSON.toJson(new Response(2));
        }

        // �ѵ�¼ʱ����ִ��
        return joinPoint.proceed();
    }

    /**
     * ����û��Ľ�ɫ�Ƿ�Ϸ�
     * <p>
     * ��¼�û��Ľ�ɫ�Ϸ�ʱ����ִ�з������Ƿ�ʱֱ�ӷ���
     *
     * @param joinPoint ���ӵ�
     * @return ��ɫ�Ϸ�ʱ�������ӵ㷽���ķ���ֵ���Ƿ�ʱ����״̬�� 3
     * @throws Throwable �����쳣ʱ�׳�
     */
    @Around("@annotation(com.qiancheng.om.common.annotation.NeedRole)")
    public Object aspect002checkRole(ProceedingJoinPoint joinPoint) throws Throwable {
        // ��ȡ��ǰ��¼�û��Ľ�ɫ
        HttpSession session = AppContextUtils.getSession();
        UserRoleEnum role = (UserRoleEnum) session.getAttribute("role");

        // ��ȡ��������Ľ�ɫ�б�
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        UserRoleEnum[] neededRoleArr = signature.getMethod().getAnnotation(NeedRole.class).value();

        // ��������Ľ�ɫ�������¼�û��Ľ�ɫ����Ҫ��������ִ�з���
        for (UserRoleEnum neededRole : neededRoleArr) {
            if (neededRole.equals(role)) {
                return joinPoint.proceed();
            }
        }

        // ��ɫ�Ƿ�������״̬�� 3
        return GSON.toJson(new Response(3));
    }

    
    /**
     * �� session �н����û���Ϣ����������Ӧ�Ĳ���
     * <p>
     * ������ƥ��ͨ����������������
     *
     * @param joinPoint ���ӵ�
     * @return ���ӵ㷽���ķ���ֵ
     * @throws Throwable �����쳣ʱ�׳�
     */
    @Around("@annotation(com.qiancheng.om.common.annotation.GetUserInfo)")
    public Object aspect004parseSession(ProceedingJoinPoint joinPoint) throws Throwable {
        // ��ȡ���ӵ�����������б�
        LocalVariableTableParameterNameDiscoverer pnd = new
                LocalVariableTableParameterNameDiscoverer();
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        String[] paramNames = pnd.getParameterNames(method);

        // ��ȡ session
        HttpSession session = AppContextUtils.getSession();

        // �����������б�Ϊ������ƥ��Ĳ�����ֵ
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < paramNames.length; i++) {
            String paramName = paramNames[i];

            for (String attr : SESSION_ATTR_ARR) {
                if (attr.equals(paramName)) {
                    args[i] = session.getAttribute(attr);
                }
            }
        }

        // ʹ�ø�ֵ��Ĳ���ִ�����ӵ㷽��
        return joinPoint.proceed(args);
    }
}
