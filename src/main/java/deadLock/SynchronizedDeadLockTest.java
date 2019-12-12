package main.java.deadLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 11:35
 * @Version 1.0
 */
public class SynchronizedDeadLockTest {
    static Object src1 = new Object();
    static Object src2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadARunnable(), "t1");
        Thread t2 = new Thread(new DeadBRunnable(), "t2");
        t1.start();
        t2.start();
    }
}

/**
 *
 */
class DeadARunnable implements Runnable {
    @Override
    public void run() {
        synchronized (SynchronizedDeadLockTest.src1) {
            try {
                System.out.println(Thread.currentThread().getName() + " get src1 ing!");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " after sleep 500ms!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " need src2 and waiting!");
/**
 * Thread t2 try get source src2 when locked source src1
 */
            synchronized (SynchronizedDeadLockTest.src2) {
                System.out.println(Thread.currentThread().getName() + " get src2 ing!");
            }
        }
    }
}

class DeadBRunnable implements Runnable {
    @Override
    public void run() {
        synchronized (SynchronizedDeadLockTest.src2) {
            try {
                System.out.println(Thread.currentThread().getName() + " get src2 ing!");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " after sleep 500ms!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " need src1 and waiting!");
/**
 * Thread t1 try get source src1 when locked source src2
 */
            synchronized (SynchronizedDeadLockTest.src1) {
                System.out.println(Thread.currentThread().getName() + " get src1 ing!");
            }
        }
    }

}