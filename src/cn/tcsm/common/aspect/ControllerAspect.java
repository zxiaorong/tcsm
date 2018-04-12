package cn.tcsm.common.aspect;

import com.google.gson.Gson;
import cn.tcsm.common.exception.IllegalAccessException;
import cn.tcsm.common.utils.Response;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller ��ص�����
 *
 * @author Brendan Lee
 */
@Aspect
@Component
public class ControllerAspect {
    private static final Logger LOGGER = Logger.getLogger(ControllerAspect.class);
    private static final Gson GSON = new Gson();

    /**
     * �����ӵ��л�ȡ�����������ʹ������ֵ�� Map
     *
     * @param jp ���ӵ�
     * @return ������-�������ֵ Map
     */
    private static Map<String, Object> getArgMap(JoinPoint jp) {
        // ��ȡ�������б�
        LocalVariableTableParameterNameDiscoverer pnd = new
                LocalVariableTableParameterNameDiscoverer();
        Method method = ((MethodSignature) jp.getSignature()).getMethod();
        String[] argNames = pnd.getParameterNames(method);

        // ��ȡ����ֵ�б�
        Object[] argValues = jp.getArgs();

        // �������� Map
        Map<String, Object> argMap = new HashMap<>(argNames.length, 1);
        for (int i = 0; i < argNames.length; i++) {
            argMap.put(argNames[i], argValues[i]);
        }

        return argMap;
    }

    /**
     * ��ȡ����ִ�е���Ϣ
     *
     * @param jp ���ӵ�
     * @return ����ִ�е���Ϣ
     */
    private static String getProceedInfo(JoinPoint jp) {
        String signature = jp.getSignature().toString();
        Map<String, Object> argMap = getArgMap(jp);

        return "\nMethod Signature: " + signature + "\nArguments: " + argMap;
    }

    /**
     * Controller ͨ������
     *
     * @param pjp ���ӵ�
     * @return δ�����쳣ʱ�������ӵ㷵��ֵ�����򷵻��쳣״̬��
     */
    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object genericAspect(ProceedingJoinPoint pjp) {
        try {
            return pjp.proceed();
        } catch (IllegalAccessException e) {
            String message = getProceedInfo(pjp);
            LOGGER.debug("���ص��Ƿ�����" + message, e);
            return GSON.toJson(new Response(3));
        } catch (Throwable t) {
            String message = getProceedInfo(pjp);
            LOGGER.error(message, t);
            return GSON.toJson(new Response(1));
        }
    }
}
