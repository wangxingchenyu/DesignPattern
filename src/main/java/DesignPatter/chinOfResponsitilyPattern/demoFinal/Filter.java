package main.java.DesignPatter.chinOfResponsitilyPattern.demoFinal;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:45
 * @Version 1.0
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
