package cn.tcsm.common.annotation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ʶ����������Ϣ�ķ�����ͨ�� AOP ��ȡ openId
 *
 * @author XLY
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Component
@RequestMapping
public @interface CheckOpenId {
    String description() default "";
}
