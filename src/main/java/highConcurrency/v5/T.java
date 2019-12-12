package main.java.highConcurrency.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 13:12
 * @Version 1.0
 */
public class T {
    int count;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();
        T t = new T();
        for (int i = 0; i < 10; i++) { // 声明10个进程
            threads.add(new Thread(t::m, "thread" + i));
        }

        threads.forEach((o) -> o.start());

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(t.count);
    }

    public synchronized void m() {
        for (int i = 0; i < 10000; i++) count++;
    }

}
