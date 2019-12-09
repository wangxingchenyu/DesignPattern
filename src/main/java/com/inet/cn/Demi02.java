package com.inet.cn;

import java.net.InetSocketAddress;

/**
 *
 *  InetSocketAddress 这个不依赖任何的协议
 *
 */
public class Demi02 {
    public static void main(String[] args){
        InetSocketAddress sk = new InetSocketAddress("127.0.0.1",8080);
        System.out.println(sk.getAddress());
        System.out.println(sk.getHostName());
        System.out.println(sk.getHostString());
    }
}
