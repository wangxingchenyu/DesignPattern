package com.io.demo1;

import java.io.*;

public class TestTextFileBuffer {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String tempString = "";
        try {
            fr = new FileReader("d:/11.txt");
            fw = new FileWriter("d:/12.txt");
            //使用缓冲字符流进行包装
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            //BufferedReader提供了更方便的readLine()方法，直接按行读取文本
            //br.readLine()方法的返回值是一个字符串对象，即文本中的一行内容
            while ((tempString = br.readLine()) != null) {

                //将读取的一行字符串写入文件中
                bw.write(tempString);

                // 下面执行换行操作
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 执行关闭文件流操作
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
