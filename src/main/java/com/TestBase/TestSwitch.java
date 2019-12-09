package TestBase;

public class TestSwitch {
    String username;
    int age;
    Computer com;

    public static void main(String[] args) {
        TestSwitch test = new TestSwitch();
        test.age = 10;
        Computer c = new Computer();
        c.brand="联想";
        test.com = c;
        test.introduce();
    }

    public void introduce() {
        System.out.println(com.brand);
    }
}

class Computer {
    String brand;
}
