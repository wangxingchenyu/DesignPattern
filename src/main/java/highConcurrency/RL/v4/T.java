package main.java.highConcurrency.RL.v4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/11 13:59
 * @Version 1.0
 * <p>
 * 公平锁
 */
public class T extends Thread {

    private static ReentrantLock lock = new ReentrantLock(true); // 公平锁

    public static void main(String[] args) {
        T t = new T();
        new Thread(t, "t1").start();
        new Thread(t, "t2").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }
    }
}
