package com.inet.cn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args){
        Socket socket = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        BufferedReader br = null;
        try {
            //创建服务器端套接字：指定监听端口
            ServerSocket server = new ServerSocket(8888);
            //监听客户端的连接
            socket = server.accept();
            //获取socket的输入输出流接收和发送信息
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new
                    OutputStreamWriter(socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                //接收客户端发送的信息
                String str = in.readLine();
                System.out.println("客户端说：" + str);
                String str2 = "";
                //如果客户端发送的是“end”则终止连接
                if (str.equals("end")){
                    break;
                }
                //否则，发送反馈信息
                str2 = br.readLine(); // 读到\n为止，因此一定要输入换行符！
                out.write(str2 + "\n");
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
