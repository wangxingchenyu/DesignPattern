package main.java.highConcurrency.v11_pc;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/11 14:43
 * @Version 1.0
 * 生产者消费者模型
 */
public class Container<T> {
    final private LinkedList<T> lists = new LinkedList<>();
    final private int MAX = 10; // 最大允许存的数量
    private int count = 0;

    public synchronized void put(T t) {
        while (lists.size() == MAX) {
            System.out.println("put wait......");
            try {
                this.wait();  // 满了,则让所有的生产线程等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lists.add(t);
        ++count;
        System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
        this.notifyAll(); // 通知消费者
    }

    public synchronized T get() {
        T t = null;
        while (lists.size() == 0) {
            System.out.println("get waiting.....");
            try {
                this.wait();  // 没有了让所有的消费线程等

                this.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t = lists.removeFirst();
        count--;
        this.notifyAll(); // 唤醒生产者生产
        System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
        return t;
    }

    public static void main(String[] args) {
        Container<String> container = new Container<>();

        // 10个consumer 10个消费者，一个消费都消费5个
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < 5; j++)
                    System.out.println(Thread.currentThread().getName() + " 消费了 ->" + container.get());
            }, "c" + i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 2个producer 两个进程负责生产，一人进行生产25个
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 25; j++) {
                    container.put(Thread.currentThread().getName() + "生产了---" + j);
                }
            }, "p" + i).start();
        }


    }
}
