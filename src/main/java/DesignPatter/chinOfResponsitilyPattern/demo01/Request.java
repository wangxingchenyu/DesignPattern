package main.java.DesignPatter.chinOfResponsitilyPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:47
 * @Version 1.0
 */
public class Request {
    public static void main(String[] args) {

        /* 传统有一个个调
        Filter htmlFilter = new HTMLFilter();
        Filter urlFilter = new URLFilter();
        htmlFilter.doFilter();
        urlFilter.doFilter();
         */


        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new URLFilter());
        filterChain.doFilter();

    }
}
