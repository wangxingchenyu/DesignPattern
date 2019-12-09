package com.reg.test;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 一个Matcher类，java.util.regex.Matcher,java.util.regex.Pattern 存在这两个包里面
 * 1)字符串里面的所有的"\" 都需要转义
 * find()
 * start()
 * end()
 * group()
 * lookingAt
 * matches
 * replaceFirst
 * replaceAll
 * appendReplacement
 * appendTail
 */
public class Demo01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = localDateTime.format(dateTimeFormatter);
        System.out.println(time);

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        Year year = Year.now(zoneId);
        System.out.println(year);

        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = Integer.toHexString(100);
        System.out.println(s);

        String s1 = Integer.toBinaryString(133);
        System.out.println(s1);

    }

    public static void test1() {
        /*
        Pattern pattern = Pattern.compile("foo");
        String one = "foocontent...........";
        String two = "foo";
        Matcher matcher = pattern.matcher(two);

        System.out.println("从开头能不能查到" + matcher.lookingAt()); //必须是从字符串的头部开始匹配
        System.out.println("从中间查" + matcher.matches()); //这个是完全的匹配

         */
    }

    public static void replace() {
        String s1 = "12onetet";
        String s2 = "1cniet23oaeb";
        String s3 = "监控中心";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(s1);
        // 替换过后，返回一个新的字符串
        String re_content = matcher.replaceFirst(s3);
        // 替换所有的内容
        System.out.println(re_content);
        String new_re_content = matcher.replaceAll("雷");
        System.out.println(new_re_content);

    }

    public static void append() {
        /**
         * 原字符串操作 逐个查找
         */
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoobkkk";
        String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();

        while (m.find()) {
            // 匹配到最后一个就终止，后面的内容就不追加了
            m.appendReplacement(sb, REPLACE);
        }

        System.out.println(sb);
        // 将尾部也加入进去
        m.appendTail(sb);
        System.out.println(sb.toString());

    }

    public static void tanlan() {
        String str = "这是一个正则表达式字符串查找的示例，正则表达式好厉害呀";
        // 编译正则表达式
        Pattern pattern = Pattern.compile("正.*?式");
        // 开始匹配
        Matcher matcher = pattern.matcher(str);
        // 查找字符串中是否有匹配正则表达式的字符/字符串
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * 反向替换
     */
    public static void reverseReplace() {
        String time = "2018/11/22";
        Matcher matcher = Pattern.compile("(\\d{4})/(\\d{2})/(\\d{2})").matcher(time);

        String newtime = matcher.replaceAll("$1-$2-$3");

        System.out.println(newtime);
    }


}
