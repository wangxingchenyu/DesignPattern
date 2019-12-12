package TestString;

/**
 * 常量池
 * 1)全局字符串常量池(String pool)  ps:类加载完成后
 * 2)class文件常量池(class pool)   ps:编译时
 * 3)运行时常量池(runtime pool)    ps:类文件运行时产生
 */

public class TestString_01 {
    public static void main(String[] args) {
        System.out.println();
        String str1 = "abc";
        String str2 = new String("def");
        String str3 = "abc";
        String str4 = str2.intern();
        System.out.println(str4);
        String str5 = "def";
        System.out.println(str1 == str3);// true
        System.out.println(str2 == str4);// false
        System.out.println(str4 == str5);// true
    }
}



