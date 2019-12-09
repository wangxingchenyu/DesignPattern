package com.inet.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        try {
            /*
             * 创建Scoket对象：指定要连接的服务器的IP和端口而不是自己机器的
             * 端口。发送端口是随机的。
             */
            socket = new Socket(InetAddress.getLocalHost(), 8888);
            //获取scoket的输入流，并使用缓冲流进行包装
            br = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            //接收服务器端发送的信息
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流及socket连接
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
