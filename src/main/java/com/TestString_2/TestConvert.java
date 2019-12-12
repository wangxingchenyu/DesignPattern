package TestString_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConvert {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();

        // 将时间戳转为字符串
        String now = s1.format(d);

        // 将字符串转为时间戳
        System.out.println(s1.parse(now).getTime());


    }
}
