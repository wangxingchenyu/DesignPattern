package TestBase;

public class TestEqual {
    String username;
    int age;
    int height;

    public static void main(String[] args) {
        System.out.println("测试类比较");
        TestEqual t1 = new TestEqual("alxe", 10);
        TestEqual t2 = new TestEqual("toy", 10, 110);
        System.out.println(t1);
        System.out.println(t2);
        /*
         * TestBase.TestEqual@4554617c
         * TestBase.TestEqual@74a14482
         * 内存地址不同,则并不是同一个对象
         */
        // 两个对象不相等
        if (t1.equals(t2)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public TestEqual(String a, int b) {
        this.username = a;
        this.age = b;
    }

    public TestEqual(String a, int b, int c) {
        this.username = a;
        this.age = b;
        this.height = c;
    }

}

