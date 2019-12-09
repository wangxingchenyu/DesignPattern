package TestBase;

public class TestStatic {
    int age;
    String username;
    static String height;

    public static void main(String[] args) {
        TestStatic ts = new TestStatic(10, "alex");
        System.out.println(ts.age);
        System.out.println(ts.username);
        TestStatic.height = "height:187";
        introduce();
    }

    public TestStatic(int age, String username) {
        this.age = age;
        this.username = username;
    }

    public static void introduce() {
        System.out.println(height);
    }

}

