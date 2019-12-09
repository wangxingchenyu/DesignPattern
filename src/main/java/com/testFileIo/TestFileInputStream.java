package testFileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 一个一个字节读
 * 字节流(输入流,输出流)
 * 字符流(输入流,输出流)
 * <p>
 * <p>
 * 节点流(输入流,输出流)
 * 处理流(输入流,输出流)
 */
public class TestFileInputStream {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        int in = 0;
        try {
            InputStream inputStream = new FileInputStream("d:/io/one.txt");
            while ((in = inputStream.read()) != -1) {
                p((char) in);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void p(Object o) {
        System.out.println(o);
    }

}
