package main.java.highConcurrency.v9;

/**
 * 线程间的数据传统notify wait
 */

public class T {

    int count;

    public static void main(String[] args) {

        final Object o = new Object();

        new Thread(() -> {
            synchronized (o) {
                System.out.println("t1 start");
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 end");
                o.notify();
            }

        }, "t1").start();

        new Thread(() -> {
            synchronized (o) {
                System.out.println("t2 start");
                for (int i = 0; i < 10; i++) {
                    System.out.println("count=" + i);
                    if (i == 5) {
                        o.notify();
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("t2 end");
            }
        }, "t2").start();
    }

}
