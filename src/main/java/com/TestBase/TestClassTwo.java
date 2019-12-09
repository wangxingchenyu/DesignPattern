package TestBase;

public class TestClassTwo {
    public static void main(String[] args) {
        System.out.println("TestBase.TestClassTwo");
        TestClassOne one = new TestClassOne();
        System.out.println(one.username);
    }
}

