package main.java.com.testThread;

/**
 * @Author: husToy.Wang
 * @Date: 2019/6/17 11:17
 * @Version 1.0
 */
class Thread2 extends Thread {
    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


public class Thread1 {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        }

    }














}
