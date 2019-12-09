package main.java.DesignPatter.chinOfResponsitilyPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:45
 * @Version 1.0
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("do htmlFilter..........");
       // return true;
    }
}
