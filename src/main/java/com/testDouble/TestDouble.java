package main.java.com.testDouble;

import java.io.PrintStream;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/11 12:16
 * @Version 1.0
 */
public class TestDouble {
    public static void main(String[] args) {
        String s = "1,3;2,3,4;5";
        String[] split = s.split(";");
        double[][] d;
        d = new double[split.length][];
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(",");
            double[] doubles = new double[split1.length];
            for (int j = 0; j < split1.length; j++) {
                doubles[j] = Double.parseDouble(split1[j]);
            }
            d[i] = doubles;
        }

        for (double[] doubles : d) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }

        /*
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR, 1);
        Date time = instance.getTime();
        Date date = new Date();
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2019, 3, 3);
        System.out.println(of);
        LocalDate localDate = LocalDate.ofYearDay(2019, 33);
        System.out.println(localDate);
        */
        // LocalDate parse = LocalDate.parse("2019-12-13");
        // System.out.printf("your name is : %s","Alex");

        // 这个也是一个输出流 outPutStream
        // PrintStream out = System.out;
        //  InputStream in = System.in;
        PrintStream err = System.err;
        /**
         *     Closeable, Flushable, Appendable, AutoCloseable
         *     Closeable, Flushable, Appendable, AutoCloseable
         */
        LocalTime now = LocalTime.now();
        LocalTime localTime = now.plusHours(1);
        System.out.println(localTime);

        LocalDate date = LocalDate.now();

        // 查看一周后的时间
        LocalDate plus = date.plus(1, ChronoUnit.WEEKS);

        LocalDate nextYear = date.plus(1, ChronoUnit.YEARS);
        System.out.print(nextYear);
        // java.time / java.temporal /  java.chrono package

        System.out.println("Zone setting..........");

        // ZoneId defaultZoneId = ZoneId.systemDefault();

        //System.out.println(defaultZoneId.toString());

        ZoneId zone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime dj = ZonedDateTime.now(zone);

        // ZonedDateTime now2 = ZonedDateTime.now();
        // System.out.println(now1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = dj.format(formatter);
        System.out.printf("京东的时间是: %s", time);

        System.out.println();

        ZoneId sh = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(sh);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String finalTime = zonedDateTime.format(dateTimeFormatter);

        System.out.println(finalTime);

        // 返回从1970后 第N天的具体日期
        LocalDate l = LocalDate.ofEpochDay(365);
        // LocalDateTime localDateTime =  LocalDateTime.ofEpochSecond()

        System.out.println("日期对象与字符串相互转换");

        String nd = "2019-11-11";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate lc = LocalDate.parse(nd, df);

        String sf = lc.format(df);
        System.out.println("转换后的时间: " + sf);

        LocalDateTime ln = LocalDateTime.now();

        LocalTime now1 = LocalTime.now();


    }
}
