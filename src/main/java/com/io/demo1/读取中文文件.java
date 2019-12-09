package com.io.demo1;

import java.io.*;

/**
 * @Author: husToy.Wang
 * @Date: 2019/10/17 9:09
 * @Version 1.0
 */
public class 读取中文文件 {
    public static void main(String[] args) throws IOException {


        //FileReader fileReader = new InputStreamReader(new File("d:/a.txt"),"UTF-8");

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("d:/a.txt")), "UTF-8");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String tmp = null;

        while (null != (tmp = bufferedReader.readLine())){
            System.out.println(tmp);
        }

    }
}
