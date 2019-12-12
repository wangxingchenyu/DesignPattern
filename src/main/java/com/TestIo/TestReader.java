package TestIo;

import java.io.*;

public class TestReader {
    public static void main(String[] args) throws IOException {

        readFile();
       //  writeFile();
    }

    public static void readFile() throws IOException {
        File file = new File("d:/one.txt");
        Reader reader = new FileReader(file);
        char[] buffer = new char[1024];
        int len = 0;
        while (-1 != (len = reader.read(buffer))) {
            System.out.println(new String(buffer, 0, len));
        }
        reader.close();
    }

    public static void writeFile() throws IOException {
        File file = new File("d:/t.txt");
        String content = "监控中心";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.flush();
        fileWriter.close();
    }

}
