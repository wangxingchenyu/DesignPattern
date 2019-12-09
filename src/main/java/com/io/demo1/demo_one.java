package com.io.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 测试IO
 * 一、io流，输入流，输出流
 * 输入流:从数据源到程序
 * 输出流:从程序到数据源
 * <p>
 * 二、 数据单元分析:
 * <p>
 * 1)字符流(Reader/Writer结尾的都是字符流)
 * <p>
 * 2)字节流(Stream结尾的都是)
 *
 * 三、按处理对象的不同
 *
 * 1)节点流
 * 节点流：可以直接从数据源或目的地读写数据，如FileInputStream、FileReader、DataInputStream等。
 *
 * 2)处理流
 *  处理流：不直接连接到数据源或目的地，是”处理流的流”。通过对其他流的处理提高程序的性能，如BufferedInputStream、BufferedReader等。处理流也叫包装流。
 *
 * 四、javaIO流类的体系
 *
 *
 */

public class demo_one {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/a.txt"); // 内容是：abc
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            //当temp等于-1时，表示已经到了文件结尾，停止读取
            while ((temp = fis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //这种写法，保证了即使遇到异常情况，也会关闭流对象。
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
