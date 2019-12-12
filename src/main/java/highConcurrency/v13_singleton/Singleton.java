package main.java.highConcurrency.v13_singleton;

/**
 * 线程安全的单例模式
 * <p>
 * 更好的是采用这种方式，既不用加锁，也能实现懒加载
 */
public class Singleton {

    private Singleton() {
    }

    private static class Inner { //声明一个静态内部类
        private static Singleton s = new Singleton(); // 属性也要静态
    }

    public static Singleton getInstance() { //
        return Inner.s;
    }

}
