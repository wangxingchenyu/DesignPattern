package com.zhujie.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ExplainZhujie {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        /**
         * 解析注解，需要用反射(解析是解析用这此类的注解)
         *
         * 用反射来解析
         */

        Class cl = Class.forName("com.zhujie.test.demo01");

        /**
         * 获取【这个类的所有的组件】所有的注解
         * 
         */
        Annotation[] ans  =  cl.getAnnotations();

        /**
         * 获取某一个注解   getAnnotation(TestZhuJie.class);  ps后面要加上注解的名称   getAnnotation(TestZhuJie.class);  ps后面要加上注解的名称   getAnnotation(TestZhuJie.class);  ps后面要加上注解的名称
         */
        // 这个是获取类的注解
        Annotation getOneAno = cl.getAnnotation(TestZhuJie.class);

        /**
         * 通过反射对象获取某一个字段(默认情况下只能获取public 字段)
         */

        // 通过反射对象获取一个字段
        Field username = cl.getDeclaredField("username");
        // 反射访问私有方法，下面设置能加强访问性能
        username.setAccessible(true);
        Annotation user = username.getAnnotation(zhujieField.class);
        System.out.println(user);

    }
}
