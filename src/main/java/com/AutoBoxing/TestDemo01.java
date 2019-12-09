package AutoBoxing;

public class TestDemo01 {
    private String username;
    private int age;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // 生成无参构造方法
    public TestDemo01() {
    }

    public static void main(String[] args) {
        ThreaDemo td = new ThreaDemo();
        td.start(); // 开启一个线程来执行

        // 这样也可以开启 (使用线程的第二种方式)
        Thread one = new Thread(new ThreadDemo2());
        one.start();

        // 下面测试生产者与消费者模型

    }

}

/***
 *  开户多线程的几种方式
 *  1) 直接继续Thread类
 */

class ThreaDemo extends Thread {
    // 重写threa里面的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + i);
        }
    }
}


// 第一步：实现Runnable接口，然后实现Runable里面的run方法
class  ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i); // 这里面直接用getName来操作
        }
    }
}




