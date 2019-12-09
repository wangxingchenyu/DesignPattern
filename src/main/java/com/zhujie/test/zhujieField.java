package com.zhujie.test;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface zhujieField {
    /**
     * 注解的的属性需要返回呈个带()号的属性
     *
     * @return
     */
    public String comment();

    public int length();
}

