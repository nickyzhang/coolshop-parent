package com.coolshop.base.tool.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import java.util.Map;

/**
 * 这个工具类需要有获取spring上下文的能力，即可通过实现ApplicationContextAware
 */
public class SpringContextTools implements ApplicationContextAware{

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    // 根据名称获取bean
    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    // 根据bean名称获取指定类型bean
    public static <T> T getBean(String beanName, Class<T> clazz) {
        return context.getBean(beanName, clazz);
    }

    // 根据类型获取bean
    public static <T> T getBean(Class<T> clazz) {
        T t = null;
        Map<String, T> map = context.getBeansOfType(clazz);
        for (Map.Entry<String, T> entry : map.entrySet()) {
            t = entry.getValue();
        }
        return t;
    }

    // 是否是单例
    public static boolean isSingleton(String beanName) {
        return context.isSingleton(beanName);
    }

    // 获取bean类型
    public static Class getType(String beanName) {
        return context.getType(beanName);
    }
}
