package main.java.highConcurrency.v6;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 13:20
 * @Version 1.0
 */
public class T {
    Object o = new Object();
    int count;

    public static void main(String[] args) {

        T t = new T();
        new Thread(() -> t.m(), "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.o = new Object();
        new Thread(() -> t.m(), "t2").start();
    }

    public void m() {
        synchronized (o) {
            while (true) {
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "count=" + count);
            }
        }
    }


}
