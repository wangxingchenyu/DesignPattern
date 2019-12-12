package main.java.highConcurrency.v3;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 10:04
 * @Version 1.0
 * <p>
 * 知识点: Synchronized 遇到Exception的时候会自动释放锁
 */
public class T {
    int count = 0;

    public static void main(String[] args) {
        T t = new T();
        new Thread(() -> t.m(), "t1").start();
        new Thread(() -> t.m(), "t2").start();
    }

    synchronized void m() {
        System.out.println(Thread.currentThread().getName() + "start");
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName() + "count=" + count);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 5) {
                int i = count / 0;
            }
        }
    }

}
