package TestIo;

import java.io.*;


/**
 * InputStream
 * 处理流与字节流运用
 */
public class TestStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("d:/a/vue.avi")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("d:/b/vuie.avi")));
        byte[] butter = new byte[2048];
        int len = 0;

        while (-1 != (len = bufferedInputStream.read(butter))) {
            System.out.println(len);
            bufferedOutputStream.write(butter, 0, len);
        }



    }
}
