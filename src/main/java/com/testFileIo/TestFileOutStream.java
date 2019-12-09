package testFileIo;

import java.io.*;

/**
 * 一个一个字节读
 * 字节流(输入流,输出流)
 * 字符流(输入流,输出流)
 * <p>
 * <p>
 * 节点流(输入流,输出流)
 * 处理流(输入流,输出流)
 */
public class TestFileOutStream {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        int in = 0;
        byte[] butter = new byte[1024];
        try {
            InputStream inputStream = new FileInputStream("d:/io/one.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("d:/io/two.txt");
            while ((in = inputStream.read(butter)) != -1) {
                fileOutputStream.write(butter,0,in);
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
