package main.java.com.testDeadLock;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/14 10:34
 * @Version 1.0
 */
public class TestDeadLock implements Runnable {
    public int flag = 1;
    public Object o1 = new Object(), o2 = new Object();

    public static void main(String[] args) {
        TestDeadLock td1 = new TestDeadLock();
        td1.flag = 1;
        Thread t1 = new Thread(td1);
        t1.start();
        t1.setName("t1");

        TestDeadLock td2 = new TestDeadLock();
        td2.flag = 2;
        Thread t2 = new Thread(td2);
        t2.start();
        t2.setName("t2");

    }

    @Override
    public void run() {

        System.out.println("flag=" + flag);
        if (flag == 1) {
            synchronized (o1) {
                System.out.println("o1被锁住........................");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + ">>flag1");
                }
            }

        }

        if (flag == 2) {
            synchronized (o2) {
                System.out.println("02被锁住了..........");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (o1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ">>flag2");
                }
            }

        }
    }
}
