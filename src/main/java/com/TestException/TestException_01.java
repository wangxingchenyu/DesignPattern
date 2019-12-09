package TestException;

/**
 * 异常处理
 * 1). RuntimeException 运行时异常
 * 2). CheckedException 已检查异常
 * java.lang.NullPointerException
 * java.lang.ArithmeticException
 * java.lang.ArrayIndexOutOfBoundsException
 * java.lang.NumberFormatException
 */

public class TestException_01 {
    public static void main(String[] args) {
        String inter = "1abx2141";
        System.out.println(Integer.parseInt(inter));
    }
}








