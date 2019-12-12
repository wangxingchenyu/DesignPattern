package main.java.highConcurrency.v13_singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/12 10:36
 * @Version 1.0
 */
public class TestSingleton {

    public static void main(String[] args) {


        CountDownLatch latch = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton2 instance = Singleton2.getInstance();
                latch.countDown();
            }).start();
        }

        try {
            latch.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
