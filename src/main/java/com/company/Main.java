package com.company;

public class Main {

    int age;
    String username;
    Computer dn;

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world");
        Main main = new Main();
        main.eat();
        int a = count();
        System.out.println(a);
        main.age = 100;
        main.username = "alex";
        Computer diannao = new Computer();
        diannao.brand = "联想";
        main.dn = diannao;
        System.out.println(main.dn.brand);
    }

    void eat() {
        double starttime = System.currentTimeMillis();
        System.out.println("eating...........");
        double endtime = System.currentTimeMillis();
        System.out.println(endtime - starttime);
    }

    public static int count() {
        System.out.println("count method");
        return 100;
    }


}


class Computer {
    String brand;
}

