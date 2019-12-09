package com.io.demo1;

import java.io.*;

/**
 * 测试绥中字节流
 */

public class TestBufferIO {
    public static void main(String[] args) {
        // 使用缓冲字节流实现复制
        long time1 = System.currentTimeMillis();

        copyFile1("d:/a/vue.avi", "d:/b/vue.avi");
        long time2 = System.currentTimeMillis();
        System.out.println("缓冲字节流花费的时间为：" + (time2 - time1));

    }

    /**
     * 缓冲字节流实现的文件复制的方法
     */
    static void copyFile1(String src, String dec) {
        // 声明读的文件字节流，与缓冲流
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        // 声明写的文件字节流，与缓冲流
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //使用缓冲字节流包装文件字节流，增加缓冲功能，提高效率
            //缓存区的大小（缓存数组的长度）默认是8192，也可以自己指定大小
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //注意：增加处理流后，注意流的关闭顺序！“后开的先关闭！”
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
}
