package main.java.highConcurrency.RL.v3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/11 13:14
 * @Version 1.0
 * <p>
 * lockInterruptibly
 */
public class T {
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        T t = new T();
        Thread t1 = new Thread(t::m1);
        t1.start();


        Thread t2 = new Thread(t::m2);
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.interrupt();  // 由于t1不释放锁，则主线程可以直接给等待的线程给打断
    }

    public void m1() {

        System.out.println("m1 start");
        lock.lock();
        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            System.out.println("m1 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public void m2() {
        try {
            //lock.lock(); // 此时m2一直等不到锁
            lock.lockInterruptibly(); // 可以对于Interrupt() 方法做出响应
            TimeUnit.SECONDS.sleep(5);
            System.out.println("m2------------locked");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
