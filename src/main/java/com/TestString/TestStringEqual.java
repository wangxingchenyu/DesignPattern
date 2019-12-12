package TestString;

/**
 * 测试字符串是否相等
 */

public class TestStringEqual {
    public static void main(String[] args) {
        System.out.println();

        String username = "alex";
        String username2 = "alex";
        System.out.println(username == username2);
        String newuser = new String("alex");

        System.out.println(username == newuser); //这个优先判断对象是否相等
        System.out.println(username.equalsIgnoreCase(newuser)); // 这个是判断值是否相等(如果是判断值的话，则最好优化用这个方法)

    }
}

