package TestBase;

public class TestObject extends Object {
    public static void main(String[] args) {
        System.out.println("test object");
        TestObject to = new TestObject();
        System.out.println(to);
    }

    @Override //方法的重写
    public String toString() {
//        return super.toString();
        return "重写toString方法";
    }

}
