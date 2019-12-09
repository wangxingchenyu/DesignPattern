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
public class TestCopyFile {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        int len = 0;
        // 定义缓冲流的长度
        byte[] butter = new byte[1024];
        try {
            InputStream inputStream = new FileInputStream("d:/io/one.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("d:/io/two.txt");
            //while ((len = inputStream.read(butter)) != -1) {
            //    fileOutputStream.write(butter, 0, len);
            //}

            while ((len = inputStream.read()) != -1){
                fileOutputStream.write((char)len);
            }
            // 关闭
            inputStream.close();
            fileOutputStream.close();

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
