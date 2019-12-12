package TestString_2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestAdd {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        SimpleDateFormat utc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'", Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sf.setTimeZone(TimeZone.getTimeZone("UTC"));
        utc.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        String dateTime = "";


        String query = String.format("{\n" +
                "  \"_lastInfo\":{\"$gt\":\"%s\"}\n" +
                "}","abc");

        System.out.println(query);
        
        System.out.println(query.getClass());

        // %7B%0A++%22_lastInfo%22%3A%7B%22%24gt%22%3A%22abc%22%7D%0A%7D
        try {
            String urlString = URLEncoder.encode(query, "utf8");
            System.out.println(urlString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String utcTime = "2018-08-07T01:00:59Z";
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE,-15);
        Date time = instance.getTime();
        String format1 = utc.format(time);
        System.out.println("标准时间"+format1);

        String leg = String.format("abc%s", "雷哥");
        System.out.println(leg);
        //本地时间转为UTC时间
        Date date1 = new Date();
        String format = utc.format(date1);
        System.out.println(format);

        //utf时间转为本地时间
        try {
            date = sf.parse(utcTime);
            dateTime = sdf.format(date);
            System.out.println(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //Calendar cal = Calendar.getInstance();
        ////获得时区和 GMT-0 的时间差,偏移量
        //int offset = cal.get(Calendar.ZONE_OFFSET);
        ////获得夏令时  时差
        //int dstoff = cal.get(Calendar.DST_OFFSET);
        ////Date date = new Date(getMillSecond(format, localDate) - (offset + dstoff));//获得当前是UTC时区的时间毫秒值
        ////String formatDate = format(date, format);


        //SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        //Date date = new Date();
        //String format = s1.format(date);
        //
        //Calendar cal = Calendar.getInstance();
        //
        //int i = cal.get(Calendar.ZONE_OFFSET);
        //int i1 = cal.get(Calendar.DST_OFFSET);
        //System.out.println(i);
        //System.out.println(i1);
        //String format = s1.format(date);
        //System.out.println(format);
        // 设置时区
        //Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        //instance.add(Calendar.MINUTE,-15);
        //Date time = instance.getTime();
        //System.out.println(time);
        //Date date = new Date();
        //String format = s1.format(date);
        //System.out.println(format);
        // 定义三分钟之前的时间
        //Calendar instance = Calendar.getInstance();
        //instance.add(Calendar.MINUTE, -15);
        //Date time = instance.getTime();
        //System.out.println(time);
        //String  timeAgo = s1.format(time);
        //System.out.println("十分分钟之前"+timeAgo);
        //String start_time = "2019-04-10 19:48:06";
        //Date three = s1.parse(threeMinuteAgo);
        //Date stime = s1.parse(start_time);
        //
        ////当前的时间
        //long now = d.getTime();

        //System.out.println(stime.before(three));
        //if (stime.after(three)) {
        //    //脚本运行时间在三分钟内(在线)
        //    System.out.println("在线");
        //    // 执行当前时间减去开始的运行的时间
        //} else {
        //    //三分钟外，离线
        //    System.out.println("离线");
        //    System.out.println("当前的时间减去开始的时间");
        //}

        //long nd = 1000 * 24 * 60 * 60;
        //long nh = 1000 * 60 * 60;
        //long nm = 1000 * 60;
        //// long ns = 1000;
        //// 获得两个时间的毫秒时间差异
        //long diff = endDate.getTime() - nowDate.getTime();
        //// 计算差多少天
        //long day = diff / nd;
        //// 计算差多少小时
        //long hour = diff % nd / nh;
        //// 计算差多少分钟
        //long min = diff % nd % nh / nm;
        //// 计算差多少秒//输出结果
        //// long sec = diff % nd % nh % nm / ns;
        //return day + "天" + hour + "小时" + min + "分钟";


        //boolean before = three.before(stime);
        //
        //System.out.println(before);

        //System.currentTimeMillis() / 1000 / 60;
        //System.out.println(System.currentTimeMillis()/1000/60);
        //GregorianCalendar gc = new GregorianCalendar(2018, 11, 12, 12, 12, 11);
        //
        //// 获取最大的天数
        //System.out.println(gc.getActualMaximum(Calendar.DATE));
        //
        //// 获取最小的天数
        //System.out.println(gc.getActualMinimum(Calendar.DATE));
        //
        //// 获取是对象是属于哪个类
        //System.out.println(gc.getClass());
        //
        //System.out.println(gc.getTime());
        //
        //System.out.println(gc.getCalendarType());
        //
        //System.out.println(gc.getMaximum(Calendar.DATE));

    }

    /**
     * @param utcTime
     * @param utcTimePatten
     * @param localTimePatten
     * @return
     */
    public static String utc2Local(String utcTime, String utcTimePatten, String localTimePatten) {
        SimpleDateFormat utcFormater = new SimpleDateFormat(utcTimePatten);
        utcFormater.setTimeZone(TimeZone.getTimeZone("UTC"));//时区定义并进行时间获取
        Date gpsUTCDate = null;
        try {
            gpsUTCDate = utcFormater.parse(utcTime);
        } catch (ParseException e) {
            e.printStackTrace();
            return utcTime;
        }
        SimpleDateFormat localFormater = new SimpleDateFormat(localTimePatten);
        localFormater.setTimeZone(TimeZone.getDefault());
        String localTime = localFormater.format(gpsUTCDate.getTime());
        return localTime;
    }


}
