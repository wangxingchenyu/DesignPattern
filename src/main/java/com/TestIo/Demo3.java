package TestIo;

import java.io.ByteArrayInputStream;

/**
 * 字节数组流
 */
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 将数据转换为字节数组(更多的内存中的操作)
         */
        byte[] bytes = "hello world".getBytes();

        // 转字节数组
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        /**
         * 将字节数组转为字符串
         */

        int len = 0;

        StringBuilder str = new StringBuilder();

        /**
         * 将字节数组转换为字符串(也就是说读到的内容是字节数组)
         */

        while (-1 != (len = byteArrayInputStream.read())) {
            str.append((char) len);
        }

        System.out.println(str);

    }
}
