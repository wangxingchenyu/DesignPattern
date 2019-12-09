package TestSPpring;

import java.io.File;

public class Demo01 {
    private String email;
    private String username;
    private double price;
    public int age;

    // 给这块的数据加入一个变量的来解释这块的的内容
    public Demo01(String email, int age, double price, String username) {
        this.email = email;
        this.age = age;
        this.username = username;
        this.price = price;
    }

    // 主线程
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    // 给内容清空，然后放入进去，在socket编辑里面加入这行的数据可以进行数据的交换
    public static void test() {
        File file = new File("d:/a.txt");
        // 文件操作,io操作是重点中的重点
        System.out.println("hello world");
    }

    // 重写构造方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("这里是我重写的构造方法");
    }

    // 设置私有的方法email
    public void setEmail(String email) {
        this.email = email;
    }

    // 设置私有的方法price
    public void setPrice(double price) {
        this.price = price;
    }

    // 设置私有的方法age
    public void setAge(int age) {
        this.age = age;
    }

    // 设置私有的方法username
    public void setUsername(String username) {
        this.username = username;
    }


}

