package main.java.highConcurrency.RL.v1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/11 13:14
 * @Version 1.0
 * <p>
 * <p>
 * ReentrantLock 初见
 * 1 必须手动释放锁
 */
public class T {
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(t::m2).start();

    }

    public void m1() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("m1-- i = " + i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void m2() {
        lock.lock();
        System.out.println("m2");
        lock.unlock();
    }

}
