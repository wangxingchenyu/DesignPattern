package com.inet.cn;

import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://zhilei.jd.com:80/recorder?page=10#one");
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getPort());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
    }
}
