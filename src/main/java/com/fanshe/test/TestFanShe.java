package com.fanshe.test;

import TestBingFa.Demo01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestFanShe {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Demo01> one = (Class<Demo01>) Class.forName("com.fanshe.test.demo01");
    
        /*
        利用有参构造声明对象
        Constructor<Demo01> c = one.getDeclaredConstructor(String.class,int.class,String.class);
        Demo01 d1 = c.newInstance("alex",10,"aaa");
        */

        // 反射API调用普通的方法
        Demo01 d1 = one.newInstance();
        Method method = one.getDeclaredMethod("setUsername",String.class);
        method.invoke(d1,"alex");

        // 利用反射api操作属性
        Field f = one.getDeclaredField("username");
    }
}
