package main.java.highConcurrency.v13_singleton;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/12 10:23
 * @Version 1.0
 * <p>
 * 1线程安全(不需要加锁) 2 懒加载
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static class Inner {
        private static Singleton2 s = new Singleton2();
    }


    public static Singleton2 getInstance() {
        System.out.println();
        Singleton2 s = Inner.s;
        System.out.println(s.hashCode());
        return s;
    }

}
