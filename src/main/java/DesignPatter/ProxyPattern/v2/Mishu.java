package main.java.DesignPatter.ProxyPattern.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Mishu implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("start yuyue");
        System.out.println("方法:" + method.getName());

        // 重新指向被代理对象
        Object invoke = method.invoke(new Laozong(), args);

        System.out.println("方法:" + method.getName());


        // Class<?>[] interfaces = laozong.getClass().getInterfaces();
        // System.out.println(interfaces);
        System.out.println("recorder the message");

        return invoke;
    }
}
