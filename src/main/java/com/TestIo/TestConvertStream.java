package TestIo;

import java.io.*;

/**
 * 转换流
 */
public class TestConvertStream {
    public static void main(String[] args) {
        // 创建字符输入和输出流:使用转换流将字节流转换成字符流
        // 字节 => 字符
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            /***
             * 将字节流转换为字符流
             */

            // 输入流 (读取数据)
            br = new BufferedReader(new InputStreamReader(System.in));

            // 输出流(将数据输出到控制台)
            bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 使用字符输入和输出流
            String str = br.readLine();

            // 一直读取，直到用户输入了exit为止
            while (!"exit".equals(str)) {

                // 写到控制台
                bw.write(str);
                bw.newLine();   // 写一行后换行
                bw.flush();     // 手动刷新
                // 再读一行
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭字符输入和输出流
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
