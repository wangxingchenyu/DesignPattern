package testCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: husToy.Wang
 * @Date: 2019/5/15 9:19
 * @Version 1.0
 */
public class TestCelander {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.YEAR, -1);
        Date time = gregorianCalendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println(format);

        System.out.println("输出别外两个的内容");
        Calendar instance = GregorianCalendar.getInstance();
        instance.add(Calendar.YEAR, -2);
        Date time1 = instance.getTime();
        System.out.println(simpleDateFormat.format(time1));



    }
}
