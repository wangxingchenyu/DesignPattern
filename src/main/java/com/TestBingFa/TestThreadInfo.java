package TestBingFa;

/**
 * 获取进程信息
 *
 * setPriority,getPriority,setName,getName,currentThread,isAlive
 *
 * 设置线程优先级是一个概率的问题，理论上是数字小的行执行
 *
 */


public class TestThreadInfo {
    public static void main(String[] args){
        Thread t = new Thread(new SendMial());
        t.setName("发送邮件线程一");
        t.setPriority(4);
        t.start();

        Thread t1 = new Thread(new SendMial());
        t1.setName("发送邮件线程二");
        t1.setPriority(5);
        t1.start();

    }
}


class SendMial implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}





