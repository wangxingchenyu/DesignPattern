package com.fanshe.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TsetF {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<User> clazz = (Class<User>) Class.forName("com.fanshe.test.User");
        Field username = clazz.getDeclaredField("username");
        System.out.println(username.getName());

        /**
         * 无参构造方法声明一个实例
         */
        User user = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setUsername", String.class);
        method.invoke(user, "alex");
        System.out.println(user.getUsername());

        /**
         * 有参构造方法声明实例
         * 第一步：找到构造方法，第二个利用构造方法来实例对象
         *//**/
        Constructor<User> constructor = clazz.getDeclaredConstructor(int.class, String.class, String.class);
        User u2 = constructor.newInstance(10, "wangzhilei@jd.com", "MarCus");
        System.out.println(u2.getUsername());

        // 声明第三个实例
        User u3 = clazz.newInstance();
        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(u3, 100);  //数据类型要保持一致
        System.out.println(u3.getAge());

    }
}
