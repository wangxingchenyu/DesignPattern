package TestBase;

/**
 * 测试方法重载
 * 1)方法相同，但是参数不同也可以是重载
 * 2)方法相同，参数也个数以及参数的类型也相同，但是参数的顺序不同，也构成重载
 */

public class TestOverload {
    public static void main(String[] args) {
        System.out.println("测试重载");
        TestOverload.Test(10, "aaaaaaaaa");
        TestOverload.Test("bbbbbbbbbbb", 10);
    }

    public static void Test(int a, String b) {
        System.out.println("aaa");
    }

    public static void Test(String b, int a) {
        System.out.println(a);
        System.out.println(b);
    }

}

