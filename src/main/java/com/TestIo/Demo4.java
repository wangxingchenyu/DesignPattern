package TestIo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 写到字节数组里面
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        String content = "monitor center";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byteArrayOutputStream.write(content.getBytes());
        System.out.println(byteArrayOutputStream.toString());
        for (byte item : byteArrayOutputStream.toByteArray()) {
            System.out.println(item);
        }
    }
}
