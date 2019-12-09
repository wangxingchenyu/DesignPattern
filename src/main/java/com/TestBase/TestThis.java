package TestBase;

/**
 * this用法，在构造方里里面如果不用this.则要在构造参数里面要加入"_"
 */
public class TestThis {
    String username;
    String height;
    int age;

    public static void main(String[] args) {
        System.out.println("main method");
        TestThis t = new TestThis("alex", "187", 18);
        System.out.println(t.age);
        System.out.println(t.username);
        System.out.println(t.height);
    }

    public TestThis(String username, String height, int age) {
        this.username = username;
        this.height = height;
        this.age = age;
    }

//    public TestBase.TestThis(String _username, String _height, int _age) {
//        username = _username;
//        height = _height;
//        age = _age;
//    }

}


