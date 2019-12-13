package main.java.highConcurrency.v15_threadContainer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 写时复制List：
 * 当发生写操作(添加、删除、修改)时，容器就会复制原有容器一份然后对新操作进行写操作，然后再将引用转向新的容器
 * 好处：保证读操作不需要锁也能正常访问，是一种读写分离的实现方式
 * 缺点：写的效率极低，特定场景下才会使用到
 */
public class T02_CopyOnWriteList {


    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();  // 写速极慢，读取快

        Random r = new Random(); // 随机对象
        Thread[] ths = new Thread[100]; // 声明100个线程
        long start = System.currentTimeMillis();
        for (int i = 0; i < ths.length; i++) {
            ths[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    list.add("a" + r.nextInt(100));
                }
            }); // 声明好线程
        }

        Arrays.asList(ths).forEach(Thread::start); // 线程启动

        Arrays.asList(ths).forEach(t -> {
            try {
                t.join(); // 主线程等待所有的线程执行结束
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        long end = System.currentTimeMillis();

        System.out.println(end - start);
        System.out.println(list.size());

    }


}
