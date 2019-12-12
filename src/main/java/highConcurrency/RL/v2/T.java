package main.java.highConcurrency.RL.v2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/11 13:14
 * @Version 1.0
 * <p>
 * TryLock
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
            for (int i = 0; i < 4; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("m1-- i = " + i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 使用tryLock进行尝试锁定，不管是否锁定，方法都会运行
     * 返回boolean 类型值，true 锁定， false 未锁定
     * <p>
     * 可以指定tryLock的时间，由于tryLock(time) 抛出异常，所以unlock必须放在finally中
     */
    public void m2() {
        boolean locked = false;
        try {
            locked = lock.tryLock(5, TimeUnit.SECONDS); // 等待5秒，如果未获取锁的话，也直接执行
            System.out.println("m2------------locked");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(locked);
            if (locked) {
                lock.unlock();
            }
        }
    }

}
