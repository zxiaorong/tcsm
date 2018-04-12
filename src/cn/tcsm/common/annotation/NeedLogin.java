package cn.tcsm.common.annotation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ע��ע��ķ��������Զ�����¼״̬��δ��¼���� statusCode 2
 * <p>
 * ���� Controller ������
 * <p>
 * {@link javax.servlet.http.HttpSession}
 *
 * @author XLY
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Component
@RequestMapping
public @interface NeedLogin {
    String description() default "";
}
