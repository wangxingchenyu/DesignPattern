package testStatic;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/13 16:32
 * @Version 1.0
 */
public class TestStatic {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Person p = new Person();
        }
        System.out.println(Person.num);

        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                System.out.println("hello world");
            }).start();
        }

    }
}

class Person {
    public static int num = 0;

    public Person() {
        num++;
    }
}
