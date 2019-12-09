package TestBase;

/**
 * findal 关键字
 * 1) 属性加了后，则不能更改
 * 2) 方法加了，则不能重写，但是可以重载
 * 3) 类加了，不能被继承
 */

public class TestFinal {
    public static void main(String[] args) {
        System.out.println("测试finda关键字");
        D d1 = new D();
        System.out.println(d1.username);
    }
}

class Ani {
    final String username = "alex";

    final public void search() {
        System.out.println(this.username);
    }
}

class D extends Ani {
    public void get() {
        System.out.println(this.username);
    }

    //这里面是重载,并不是重写
    public void search(String usernmae, int age) {

    }

}


