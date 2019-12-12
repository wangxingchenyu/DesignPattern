package TestIo;

import java.io.*;

/**
 * 所有的io操作都要加入处理流,可以提高性能
 */
public class TestBufferRead {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/a/one.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:/a/two.txt"));
        String tem;
        while (null != (tem = bufferedReader.readLine())) {
            bufferedWriter.write(tem);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
