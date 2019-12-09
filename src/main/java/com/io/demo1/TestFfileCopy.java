package com.io.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 文件字节流，实现文件复制
 */
public class TestFfileCopy {
    public static void main(String[] args) {
        //copyFile("d:/a.txt", "d:/b.txt");
        double ceil = Math.ceil(100.2);
        System.out.println(ceil);

        //四舍五入，并保留两位小数
        BigDecimal bigDecimal = new BigDecimal(100.642542).setScale(2, RoundingMode.UP);
        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = new BigDecimal(1000.22424).setScale(3, RoundingMode.CEILING);
        System.out.println(bigDecimal);


    }

    public static void copyFile(String src, String dec) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        byte[] buffer = new byte[1024];

        int temp = 0;
        try {

            // 读的文件流
            fis = new FileInputStream(src);

            // 要写的文件流
            fos = new FileOutputStream(dec);

            //边读边写
            //temp指的是本次读取的真实长度，temp等于-1时表示读取结束
            while ((temp = fis.read(buffer)) != -1) {
                /**
                 *  将缓存数组中的数据写入文件中，注意：写入的是读取的真实长度；
                 *  如果使用fos.write(buffer)方法，那么写入的长度将会是1024，即缓存
                 *  数组的长度
                 *
                 */
                //存的是一个字节组
                fos.write(buffer, 0, temp);
            }

            for (byte item : buffer) {
                System.out.println(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //两个流需要分别关闭(由于是两个文件流，所以需要关闭两次)
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public enum EnumTest{
        MON,TUE,WED,THU,FIR,STA,SUN
    }

}
