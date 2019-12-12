package TestString;

public class StringClassUse {
    public static void main(String[] args) {
        System.out.println();
        String user = "jerrey";
        // 返回字符串的index字符 char类型
        char a = user.charAt(0);
        System.out.println(a);

        // 判断两个字符串是否相等 等同于 System.out.println(username == "alex");
        String username = "alex";
        System.out.println(username.equals("Alex"));

        // 判断两个字符串是否相等(忽略大小写)
        System.out.println(username.equalsIgnoreCase("ALEX"));

        // 从头开始，查看这个字符出现的位置(int),查到则返回位置，如果未查到则返回-1
        int fp = user.indexOf("e");
        System.out.println(fp);

        // 从尾部开始，查看这个字符第一个出现的位置，如果没有查到的话，则返回-1
        int lp = user.lastIndexOf("e");
        System.out.println(lp);

        // 反回字符串的长度
        int length = user.length();
        System.out.println(length);

        // 字符串内容替换
        String name = "监控中心";
        String newname = name.replace("中心", "monitor");
        System.out.println(newname);

        // 判断是不是以什么开始(两个参数，第一个参数是判断的字符串，第二个是起始的位置)
        System.out.println(name.startsWith("中", 2));

        // 判断是不是以一个字符串结尾
        System.out.println(name.endsWith("心"));

        // 字符串的切割,从一个位置结尾
        System.out.println(name.substring(2));

        // 字符串的切割2,一个索引区间
        System.out.println(name.substring(2,4));

        // 字符串大写不转换
        String lower = user.toUpperCase();
        System.out.println(lower);

        // 字符串转小写
        System.out.println(lower.toLowerCase());

        // 删除头部或者是尾的字符
        System.out.println(" abce ".trim().length());


    }
}
