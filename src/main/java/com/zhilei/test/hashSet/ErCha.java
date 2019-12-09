package com.zhilei.test.hashSet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ErCha {
    public static void main(String[] args) throws ParseException {
        String date = "2019-02-28T02:23:58.000Z";
        date = date.replace("Z", " UTC");//注意是空格+UTC
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
        Date parse = format.parse(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = simpleDateFormat.format(parse);
        System.out.println(format1);
    }
}
