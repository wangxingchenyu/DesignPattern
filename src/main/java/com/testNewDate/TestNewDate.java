package testNewDate;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/11 19:02
 * @Version 1.0
 */
public class TestNewDate {
    public static void main(String[] args) {
        ChronoLocalDate l1 = LocalDate.now();
        ChronoLocalDate l2 = LocalDate.now().plusDays(2);
        boolean isbefore = l1.isAfter(l2);



    }
}
