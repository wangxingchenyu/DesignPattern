package main.java.com.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 14:29
 * @Version 1.0
 */
public class TestCountDownLatch implements Runnable {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(100);

        // ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            new Thread(new TestCountDownLatch()).start();
            countDownLatch.countDown();
        }
        try {
            countDownLatch.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int order = Order.getOrder();
        System.out.println(Thread.currentThread().getName() + "----->" + order);
    }
}



