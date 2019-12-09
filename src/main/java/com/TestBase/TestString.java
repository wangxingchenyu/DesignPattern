package TestBase;

public class TestString {
    public static void main(String[] args){
        System.out.println();
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1==s2);
        boolean is = s1.equals(s2);
        System.out.println(is);
        /*
        总结:两个对象，产生了两个内存空间，是不可能相等的，但是我们可以判断对象里面的值，如果相等，可以做自定义的比较
         */
    }
}
