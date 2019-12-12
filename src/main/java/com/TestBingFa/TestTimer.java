package TestBingFa;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务调度
 * timer 定义一个定时器，其schedule方法，指定几个参数，第一个参数就是多会执行，就是执行的超时时间，第二个参数是多少秒执行一次
 * TimerTask定义一个任务要实现run方法
 *
 */

public class TestTimer {
    public static void main(String[] args) {
        Timer t1 = new Timer();//定义计时器；
        MyTask task1 = new MyTask();//定义任务；
        t1.schedule(task1,3000,1000);  //3秒后执行；
        //t1.schedule(task1,5000,1000);//5秒以后每隔1秒执行一次！
        //GregorianCalendar calendar1 = new GregorianCalendar(2010,0,5,14,36,57);
        //t1.schedule(task1,calendar1.getTime()); //指定时间定时执行；
    }
}

class MyTask extends TimerTask {//自定义线程类继承TimerTask类；
    public int num;
    public void run() {
        System.out.println(num++);
    }
}
