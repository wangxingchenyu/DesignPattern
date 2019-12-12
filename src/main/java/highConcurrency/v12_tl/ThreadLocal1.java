package main.java.highConcurrency.v12_tl;

import java.util.concurrent.TimeUnit;

/**
 * ThreadLocal 线程局部变量
 */
public class ThreadLocal1 {

    volatile static Person p = new Person();

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "   " + p.name);

        }, "t1").start();



        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.name = "lisi";
            System.out.println(Thread.currentThread().getName());
        }, "t2").start();
    }
}

class Person {
    String name = "zhangsan";
}


/*
在加与不加volatile的情况下，这句话打印的值分别是？ 答：不写volatile有可能发生可见性问题
跟线程1的睡眠时间有关
如果想要共享变量不可见呢？  就需要使用ThreadLocal

 */