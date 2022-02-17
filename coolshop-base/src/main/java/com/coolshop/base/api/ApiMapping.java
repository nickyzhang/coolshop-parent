package com.coolshop.base.api;

import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 该注解可以将请求映射到某一个方法上面 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMapping {
    String value(); // 方法id
    // Http请求方法
    RequestMethod method();
}
