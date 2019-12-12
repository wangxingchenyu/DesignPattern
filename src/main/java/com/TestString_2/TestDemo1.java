package TestString_2;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 常用方法
 */
public class TestDemo1 {
    public static void main(String[] args) throws ParseException {


//        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
//        SimpleDateFormat s1 = new SimpleDateFormat("D");
//        System.out.println(s1.format(new Date()));
//        String stime = "2018-11-14 09:59:58";
//        Date date = s1.parse(stime);
//        System.out.println(date);
//        SimpleDateFormat week = new SimpleDateFormat("S");
//        System.out.println(week.format(new Date()));
//        System.out.println("*********************************");
//        GregorianCalendar calendar = new GregorianCalendar(2018, 11, 14, 22, 10, 50);
//        inP year = calendar.get(Calendar.YEAR); // 打印：1999
//        int month = calendar.get(Calendar.MONTH); // 打印：10
//        int day = calendar.get(Calendar.DAY_OF_MONTH); // 打印：9
//        int day2 = calendar.get(Calendar.DATE); // 打印：9
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DATE));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        after();
//        GregorianCalendar calendar = new GregorianCalendar(2018, 10, 14, 10, 10, 50);
//        int date = calendar.get(Calendar.DAY_OF_WEEK);
//        System.out.println(date);

        // 设置时间
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2999);
        calendar2.set(Calendar.MONTH, Calendar.FEBRUARY); // 月份数：0-11
        calendar2.set(Calendar.DATE, 3);
        calendar2.set(Calendar.HOUR_OF_DAY, 10);
        calendar2.set(Calendar.MINUTE, 20);
        calendar2.set(Calendar.SECOND, 23);
        printCalendar(calendar2);

    }

    static void printCalendar(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 星期几
        String week = "" + ((date == 0) ? "日" : date);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d年%d月%d日,星期%s %d:%d:%d\n", year, month, day, week, hour, minute, second);
    }


    public static void after() {
        // 这里面的时间戳是毫秒
        Date time1 = new Date();
        System.out.println("before" + time1.toString());

        long ts = time1.getTime();
        Date time2 = new Date(ts + 60000);

        // 判断这个时间是否在后面的时间之前
        System.out.println(time1.before(time2));

        // 判断这个时间是否在后面的时间之后
        System.out.println(time2.after(time1));

        // 判断两个时间是否相等
        System.out.println(time1.equals(time2));

        /**
         * date包jdk1.1之前很多的方法都已经过期了，现在calendar类，如果时时间格式化的话，则要用DateForm
         */

        // 测试DateForm类

        // 测试simpleDateForm类

    }

    public static void dateFormat() {

    }

    public static void simpleDateformate() {

    }


}
