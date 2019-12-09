package com.inet.cn;

import java.net.InetAddress;
import java.net.UnknownHostException;

/***
 * 封装计算机的ip地址与dns相关的信息
 *
 * InetAddress 这个对象没有构造方法，所以只能调用期静态方法
 *
 * getLocalHost()、getByName()、 getAllByName()、 getAddress()、getHostName()。
 *
 */
public class demo01 {
    public static void main(String[] args) throws UnknownHostException {
        // 根据getLocalHost方法来获取 InetAddress对象
        InetAddress addr = InetAddress.getLocalHost();
        // 获取ip地址
        System.out.println(addr.getHostName());
        // 获取主机名
        System.out.println(addr.getHostAddress());
        System.out.println("************************************************************************");

        // 根据域名得到InetAddress对象
        InetAddress addr2 = InetAddress.getByName("www.jd.com");
        System.out.println(addr2.getHostName()); // 获取域名
        System.out.println(addr2.getHostAddress()); // 获取ip地址

        System.out.println("************************************************************************");

        // 根据IP得到InetAddress对象
        /**
         * 输出ip而不是域名。如果这个IP地址不存在或DNS服务器不允许进行IP地址
         *          * 和域名的映射，getHostName方法就直接返回这个IP地址。
         */
        InetAddress addr3 = InetAddress.getByName("127.0.0.1");
        System.out.println(addr3.getHostName()); // 获取域名
        System.out.println(addr3.getHostAddress()); // 获取ip地址

    }
}
