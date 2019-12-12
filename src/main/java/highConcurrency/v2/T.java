package main.java.highConcurrency.v2;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 9:48
 * @Version 1.0
 * <p>
 * volatile 强制刷新数据，并引起其它线程中引用这条数据的强制更改
 */
public class T {
    /*volatile*/ boolean running = true;
    int a = 0;

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1, "t1").start();
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
            /*  如果while里面不能有任何的执行，不执行，则不会有任何的时间来同步主线程里面的数据
            a++;
            System.out.println(a + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("m1 end");
    }

}


