package TestException;


public class TestArray_demo01 {
    public static void main(String[] args) {
        //throws throw关键字
        TestArray_demo01 arr = new TestArray_demo01();
        arr.abc();
    }

    public void abc() {
        try {
           System.out.println(100/0);
        }catch (Exception e){
           System.out.println(e.toString());
        }finally {
            System.out.println("无论是否执行成功都执行");
        }
    }

}
