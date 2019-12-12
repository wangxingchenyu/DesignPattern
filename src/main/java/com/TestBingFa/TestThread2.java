package TestBingFa;

/**
 * 　开记线程的第二种方式 实现runnable 接口
 */
public class TestThread2 implements Runnable {
    public static void main(String[] args) {

        //然后还是要用thread
        Thread one = new Thread(new TestThread2());
        one.start();
        Thread two = new Thread(new TestThread2());
        two.start();

    }

    // 如果实现Runnable接口，则必在重写runnable里面的Run方法
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}


