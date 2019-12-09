package main.java.DesignPatter.chinOfResponsitilyPattern.demo02;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:46
 * @Version 1.0
 */
public class URLFilter implements Filter {
    @Override
    public boolean doFilter() {
        System.out.println("do UrlFilter ........");
         return true;
    }
}
