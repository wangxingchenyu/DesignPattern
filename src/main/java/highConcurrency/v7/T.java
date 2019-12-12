package main.java.highConcurrency.v7;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 13:31
 * @Version 1.0
 */
public class T {

    AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) {
        T t = new T();
        for (int i = 0; i < 10; i++) {
            new Thread(t::m, "thread" + i).start();
        }




        // ArithmeticException
        // ArithmeticException
        // ClassCastException
        // StringIndexOutOfBoundsException
        // ArrayIndexOutOfBoundsException
        // RunTimeException


        try {
            Class<?> onetetet = Class.forName("onetetet");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public /*synchronized*/ void m() {
        count.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + "count=" + count);
    }


}
