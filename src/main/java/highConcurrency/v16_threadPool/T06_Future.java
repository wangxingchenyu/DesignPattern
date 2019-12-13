package main.java.highConcurrency.v16_threadPool;

import java.util.concurrent.*;

/**
 * Future 未来的执行结果
 */
public class T06_Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 未来任务, 既是Runnable
        /**
         * FutureTask 继承    RunnableFuture (interface)
         *                         -  Runnable (interface)
         *                         -  Future   (interface)
         */
        FutureTask<Integer> task = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return 100;
        });
        // 既然是runnable 就可以放在Thread 里面执行
        new Thread(task).start();

        System.out.println("conentetet");
        System.out.println(task.get()); // 阻塞等待任务执行完成, 获取到返回值

        System.out.println("-------------------------------");

        //********************************
        // 使用ExecutorService的submit替代FutureTask
        ExecutorService service = Executors.newFixedThreadPool(5);


        Future<Integer> result = service.submit(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return 1;
        });

        System.out.println(result.isDone()); // false 执行未完毕
        System.out.println(result.get()); // 1 
        System.out.println(result.isDone()); // true  执行已完毕
        System.out.println(result.get()); // 一直等待
        System.out.println(service.shutdownNow()); // 立即等待

    }
}
