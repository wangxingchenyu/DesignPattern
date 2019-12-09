package com.io.demo1;

import java.io.*;

/**
 * @Author: husToy.Wang
 * @Date: 2019/10/17 9:09
 * @Version 1.0
 */
public class TestValue {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter(new File("d:/a.txt"));

        fileWriter.write("新的内容sssssssssssss");
        fileWriter.flush();  // 没有执行关闭前给数据强刷进入文件
        fileWriter.close();


        // FileReader fileReader = new InputStreamReader(new File("d:/a.txt"),"UTF-8");

        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("d:/a.txt")), "UTF-8");
        //
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //
        //String tmp = null;
        //
        //while (null != (tmp = bufferedReader.readLine())){
        //    System.out.println(tmp);
        //}

    }
}
