package testFileIo;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一个一个字节读
 * 字节流(输入流,输出流)
 * 字符流(输入流,输出流)
 * <p>
 * <p>
 * 节点流(输入流,输出流)
 * 处理流(输入流,输出流)
 */
public class Test01 {

    public static void main(String[] args)  {

        //String string = new String();
        //String a = "linux is very much";
        //int[] b= new int[]{1,2,3} ;
        //
        //System.out.println(b.length);
        //char[] chars = {'one','two'};
        //byte[] bytes = a.getBytes();
        //
        //for (byte b : bytes) {
        //    System.out.println((char) b);
        //}

        //String s = new String(bytes);
        //System.out.println(s);
        //System.out.println(bytes);
        ////readFile();
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

        //BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("d:/io/one.txt")));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("d:/io/seven.txt")));
        ////String line ="";
        //
        //while ((len = bufferedReader.read()) != -1) {
        //    bufferedWriter.write((char) len);
        //}
        //
        //bufferedReader.close();
        //bufferedWriter.close();

        // 转换流，将字节流转换为字符流
        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("d:/io/one.txt")));
        //OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("d:/io/eight.txt")));
        //char[] cb = new char[1024];
        //
        //while ((len = inputStreamReader.read(cb)) != -1) {
        //    outputStreamWriter.write(cb,0,len);
        //}
        //
        //inputStreamReader.close();
        //outputStreamWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("d:/io/one.txt")));

        //String line = "";
        //while ((line = bufferedReader.readLine()) != null) {
        //    System.out.println("一行的数据: " + line);
        //}
        //bufferedReader.close();
    }

    public static void p(Object o) {
        System.out.println(o);
    }

}
