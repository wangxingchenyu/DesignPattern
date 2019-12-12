package main.java.highConcurrency.v15_threadContainer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 使用阻塞有界同步队列 ArrayBlockingQueue 完成生产者消费者模式
 */
public class T06_ArrayBlockingQueue {


    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

        boolean one = queue.offer("one");

        for (int i = 0; i < 11; i++) {
            queue.add("a" + i);
        }

        //queue.put("a11"); // 满了会阻塞
        //queue.add("a11"); // 满了会抛出异常
        //System.out.println(queue.offer("a11")); // 满了会返回false
        // System.out.println(queue.offer("a11", 1, TimeUnit.SECONDS)); // 会等待1s,返回false, 如果1s内有空闲,则添加成功后返回true

    }

}
