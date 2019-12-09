package TestBase;

public class TestStaticSpnite {
    static String username = "aaaaaaaaaa";

    static {
        System.out.println("我是类的初始化片断");
        System.out.println();
        System.out.println(username);
    }

    public static void main(String[] args) {
        System.out.println("main method测试初始化片断");
        System.out.println();
        new TestStaticSpnite();

        Person p = new Person();
        /*
        * instanceof 判断一个对象是不是属于一个类，返回bool值
        **/
        if (p instanceof Person){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    public TestStaticSpnite() {
        System.out.println("construct method");
    }

}


/**
 * 执行顺序
 * 初始化片断 -> main方法  ->构造方法
 */

class Person {
    public static void main(String[] args) {
        System.out.println("TestBase.Person class");
    }
}


