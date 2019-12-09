package com.io.demo1;

import java.io.FileReader;
import java.io.FileWriter;

public class TestFileSTringSteam {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int len =0;
        try {
            // 声明一个读的文件字读流
            fr = new FileReader("d:/a.txt");

            // 声明一个写的文件字符流
            fw = new FileWriter("d:/b.txt");

            char[] buffer = new char[1024];

            // 这样的算法,如果读取的值为-1，则说明已经读完也

            while ((len = fr.read(buffer)) != -1){
                fw.write(buffer,0,len);
            }

            while ((len = fr.read(buffer)) != -1){
                /**
                 *  边读边写
                 */
                fw.write(buffer,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
