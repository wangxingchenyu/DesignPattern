package test;

// 同一个包
public class TestOne {
    protected String username = "alex";
    int age = 100;

    public static void main(String[] args) {
        System.out.println("test.main");
        TOne t_one = new TOne();
    }

    public void get_username() {
        System.out.println(this.username);
    }
}

class TOne extends TestOne {
    public static void main(String[] args) {
        System.out.println("子类");
    }

    TOne() {
        System.out.println(super.username);
        System.out.println(super.age);
    }
}






