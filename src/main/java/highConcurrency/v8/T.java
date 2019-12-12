package main.java.highConcurrency.v8;

import java.util.concurrent.CountDownLatch;

/**
 * 线程间通讯 之 countDownLatch
 */

public class T {

    int count;

    public static void main(String[] args) {

        T t = new T();

        CountDownLatch latch = new CountDownLatch(1);

        new Thread(() -> {
            System.out.println("t1 start");
            if (t.count != 5) {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("t1 end");
        }, "t1").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        new Thread(() -> {
            System.out.println("t2 start");
            for (int i = 0; i < 10; i++) {
                t.count++;
                System.out.println("count=" + t.count);
                if (t.count == 5) {
                    latch.countDown();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            System.out.println("t2 end");
        }, "t1").start();

    }

}
