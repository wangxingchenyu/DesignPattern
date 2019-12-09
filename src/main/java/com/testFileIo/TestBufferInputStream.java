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
public class TestBufferInputStream {

    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        int len = 0;
        byte[] bf = new byte[1024];

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("d:/io/a.jpg")));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("d:/io/d.jpg")));

        File file = new File("d:/io/c.jpg");
        if (file != null) {
            file.createNewFile();
        }

        while ((len = in.read(bf)) != -1) {
            out.write(bf, 0, len);
        }

        //及时的关闭，不然最后一部分读取的数据不能主动写入
        in.close();
        out.flush(); // 刷新缓冲流
        out.close();
    }

    public static void p(Object o) {
        System.out.println(o);
    }

}
