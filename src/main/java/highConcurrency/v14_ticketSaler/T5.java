package main.java.highConcurrency.v14_ticketSaler;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/12 11:19
 * @Version 1.0
 */
public class T5 {
    static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    static {
        for (int i = 0; i < 1000000; i++) {
            queue.add("票" + i);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                while (true) {
                    String poll = queue.poll();
                    if (poll == null) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "销售了 " + poll);
                }
            }, "thread_" + i).start();
        }
        long end = System.currentTimeMillis();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("性能 " + (end - start));
    }
}
