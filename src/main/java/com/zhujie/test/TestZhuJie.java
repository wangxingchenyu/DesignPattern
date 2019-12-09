package com.zhujie.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解板框
 */

@Target(ElementType.TYPE) //定义注解的使用范围
@Retention(RetentionPolicy.RUNTIME)
public @interface TestZhuJie {
    public String value();
}


