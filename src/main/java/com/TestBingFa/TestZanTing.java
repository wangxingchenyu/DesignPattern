package TestBingFa;

/**
 *  线程暂停sleep yield
 *  差异，java里面的并发，python里面的并发 php当时的学的时候就没有学过什么并并发编程(只能适合小型的应用开发)
 * sleep 直接进入了阻塞状态了，必须等于休眠结束才能正常执行
 * yield 直接就续状态，腾出cpu
 */

public class TestZanTing {
    public static void main(String[] args){
        StateThread s  = new StateThread();
        s.start();
    }
}

//使用继承方式实现多线程
class StateThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.getName() + ":" + i);
            Thread.yield();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
