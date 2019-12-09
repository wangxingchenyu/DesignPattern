package TestBase;

public class TestCzhi {
    String username = "alex";

    public static void main(String[] args) {
        System.out.println("测试传值");
        int age = 10;
        System.out.printf("before:%d", age);
        System.out.println();
        change(age);
        System.out.printf("aofter:%d", age);
        TestCzhi tc = new TestCzhi();
        tc.Test();
    }

    public static void change(int age) {
        age = 100;
        System.out.printf("最新的:%d", age);
        System.out.println();
    }

    // 对象是引用类型，可以直接更改
    public void Test() {
        this.username = "new value";
        System.out.println();
        System.out.println(this.username);
    }
}
