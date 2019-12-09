package com.inet.cn;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedWriter bw = null;
        try {
            // 建立服务器端套接字：指定监听的接口
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端建立监听");
            // 监听，等待客户端请求，并愿意接收连接
            socket = serverSocket.accept();
            // 获取socket的输出流，并使用缓冲流进行包装
            bw = new BufferedWriter(new
                    OutputStreamWriter(socket.getOutputStream()));
            // 向客户端发送反馈信息
            bw.write("hhhh");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流及socket连接
            if (bw != null) {
                try {
                    bw.close();
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
