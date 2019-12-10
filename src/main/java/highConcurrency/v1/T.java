package main.java.highConcurrency.v1;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 9:38
 * @Version 1.0
 */
public class T {
    int b = 10;

    public static void main(String[] args) {
        T t = new T();
        for (int i = 0; i < 5; i++) {
            new Thread(t::reduce, "t" + i).start();
        }
    }

    public /*synchronized*/ void reduce() {

        try {
            TimeUnit.MILLISECONDS.sleep(100);
            b--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b + "----------" + Thread.currentThread().getName());
    }
}
