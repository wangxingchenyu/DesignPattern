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
public class TestBufferReader {

    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        int len = 0;
        byte[] bf = new byte[1024];

        //FileInputStream in = new FileInputStream(new File("d:/io/a.jpg"));
        //FileOutputStream out = new FileOutputStream(new File("d:/io/d.jpg"));
        //
        //while ((len = in.read(bf)) != -1) {
        //    out.write(bf,0,len);
        //}
        //
        //in.close();
        //out.flush();
        //out.close();
        //BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("d:/io/a.jpg")));
        //BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("d:/io/e.jpg")));
        //
        //while ((len = in.read(bf)) != -1) {
        //    out.write(bf, 0, len);
        //}
        //
        ////及时的关闭，不然最后一部分读取的数据不能主动写入
        //in.close();
        //out.flush(); // 刷新缓冲流
        //out.close();

        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:/io/one.txt"));

        //FileReader fileReader = new FileReader("d:/io/one.txt");
        //FileWriter fileWriter = new FileWriter("d:/io/five.txt");
        //while ((len = fileReader.read()) != -1) {
        //    //读取字符
        //    //System.out.println((char) len);
        //    fileWriter.write((char)len);
        //}
        //fileReader.close();
        //fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("d:/io/one.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("d:/io/seven.txt")));
        //String line ="";

        while ((len = bufferedReader.read()) != -1) {
            bufferedWriter.write((char)len);
        }

        bufferedReader.close();
        bufferedWriter.close();

    }

    public static void p(Object o) {
        System.out.println(o);
    }

}
