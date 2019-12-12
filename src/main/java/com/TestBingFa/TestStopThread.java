package TestBingFa;

/**
 *
 * 进程的终止是通过访求来终止进程体里面的内容
 *
 */
public class TestStopThread {
    public static void main(String[] args){
        ThreadOne one = new ThreadOne();
        Thread t = new Thread(one);
        t.start();
        for (int i=0;i<100;i++){
            if (i==3){
                one.zhongzhi();
            }
            System.out.println("父进程"+i);
        }
    }
}


class ThreadOne implements Runnable{

    private boolean flag = true;

    @Override
    public void run() {
        int num=0;
        while (flag){
            System.out.println(Thread.currentThread().getName()+(num++));
        }
    }

    public void zhongzhi(){
        this.flag = !this.flag;
    }
}