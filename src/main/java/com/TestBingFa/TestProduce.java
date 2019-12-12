package TestBingFa;

public class TestProduce {
    public static void main(String[] args) {
        SyncStack sStack = new SyncStack();// 定义缓冲区对象；
        Shengchan sc = new Shengchan(sStack);// 定义生产线程；
        Xiaofei xf = new Xiaofei(sStack);// 定义消费线程；
        sc.start();
        xf.start();
    }
}

class Mantou {// 馒头
    int id;

    Mantou(int id) {
        this.id = id;
    }
}

class SyncStack {// 缓冲区(相当于：馒头筐)
    int index = 0;
    Mantou[] ms = new Mantou[10];

    // 生产者往长筐里放馒头
    public synchronized void push(Mantou m) {
        while (index == ms.length) {//说明馒头筐满了
            try {
                //wait后，线程会将持有的锁释放，进入阻塞状态；
                //这样其它需要锁的线程就可以获得锁；
                this.wait();
                //这里的含义是执行此方法的线程暂停，进入阻塞状态，
                //等消费者消费了馒头后再生产。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 唤醒在当前对象等待池中等待的第一个线程。
        //notifyAll叫醒所有在当前对象等待池中等待的所有线程。
        this.notify();
        // 如果不唤醒的话。以后这两个线程都会进入等待线程，没有人唤醒。
        ms[index] = m;
        index++;
    }

    // 消费者取馒头
    public synchronized Mantou pop() {
        while (index == 0) {//如果馒头筐是空的；
            try {
                //如果馒头筐是空的，就暂停此消费线程（因为没什么可消费的嘛）。
                this.wait();                //等生产线程生产完再来消费；
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return ms[index];
    }
}

class Shengchan extends Thread {// 生产者线程
    SyncStack ss = null;

    public Shengchan(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("生产馒头：" + i);
            Mantou m = new Mantou(i);
            ss.push(m);
        }
    }
}

class Xiaofei extends Thread {// 消费者线程；
    SyncStack ss = null;

    public Xiaofei(SyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Mantou m = ss.pop();
            System.out.println("消费馒头：" + i);

        }
    }
}
