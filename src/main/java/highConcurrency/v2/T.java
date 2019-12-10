package main.java.highConcurrency.v2;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 9:48
 * @Version 1.0
 *
 * volatile 强制刷新数据，并引起其它线程中引用这条数据的强制更改
 *
 */
public class T {
    /*volatile*/ boolean running = true;

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;

    }

    public void m1() {
        System.out.println("m1 start");
        while (running) {

        }
        System.out.println("m1 end");
    }

}


