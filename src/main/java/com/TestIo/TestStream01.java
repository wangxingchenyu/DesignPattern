package TestIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 出现乱码的原因:
 * <p>
 * 1) 字符集的问题
 * 2) 字节数减少
 */

public class TestStream01 {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("d:/a/three.txt");
            int len = 0;
            try {
                while (-1 != (len = fileInputStream.read(buffer))) {
                    System.out.println(new String(buffer, 0, len, "gbk"));
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件读取失败");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件打开失败");
        }
    }
}

