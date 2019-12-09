package testRegular;

import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则
 * Patter类
 * Matcher类
 * PatterSyntaxException类
 */


public class IndexJava {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /*
        boolean matches = Pattern.matches(".*hello.*", "hello world");
        System.out.println("是否包含:" + matches);
        */
//        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";
//
//        // 创建Patter对象
//        Pattern compile = Pattern.compile(pattern);
//        //创建Matcher对象
//        Matcher matcher = compile.matcher(line);
//        如果找到的话，则提示0是最全的数据
//        if (matcher.find()) {
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//            System.out.println(matcher.group(3));
//        }


        String content = "cat cat cat cattie cat";

        Pattern compile = Pattern.compile("\\bcat\\b");

        Matcher matcher = compile.matcher(content);

        int count = 0;
        while (matcher.find()) {
            count ++;
            System.out.println("match count: "+count);
            System.out.println("match start"+matcher.start());
            System.out.println("match end"+matcher.end());
        }

    }
}


class Demo {
    static {
        System.out.println("xxxxxxxxxxxxx..............");
    }

    public Demo() {
        System.out.println("构造方法");
    }

    public static void eat() {
        System.out.println("eating.............");
    }
}
