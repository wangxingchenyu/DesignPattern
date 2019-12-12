package main.java.highConcurrency.v4;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 10:50
 * @Version 1.0
 */
public class T {
    int a;
    // CountDownLatch CDL = new CountDownLatch(2);

    public static void main(String[] args) {
        T t = new T();
        new Thread(() -> t.m1(), "t1 ").start();
        new Thread(() -> t.m(), "t2 ").start();

        /*
        try {
            t.CDL.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }

    public synchronized void m1() {
        a = 100;
        System.out.println(Thread.currentThread().getName() + "a m1=" + a);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void m() {
        a = 200;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "a m=" + a);
    }
}
