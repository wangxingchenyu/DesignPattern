package TestString_2;

public class ArrayTest {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("hello ");
        s.append("world");
        System.out.println(s);
        System.out.println(s.length());
        String ip = "192.168.1.100";
        String[] split = ip.split(".");
        System.out.println(split.length);  
    }
}
