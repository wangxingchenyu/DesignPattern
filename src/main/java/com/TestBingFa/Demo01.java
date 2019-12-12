package TestBingFa;

public class Demo01 {
    public static void main(String[] args) {
        One a = new One();
        a.start();
        System.out.println("this is a thread");
    }
}

class One extends Thread {
    @Override
    public void run() {
        //Run里面是线程体
        for (int i = 0; i <= 100; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
