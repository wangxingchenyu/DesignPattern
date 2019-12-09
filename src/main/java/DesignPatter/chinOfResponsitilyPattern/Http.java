package main.java.DesignPatter.chinOfResponsitilyPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 10:31
 * @Version 1.0
 */
public class Http {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new URLFilter()).addFilter(new HTMLFilter());

        Request request = new Request();
        request.setStr("request");
        Response response = new Response();
        filterChain.doFilter(request,response,filterChain);


    }
}
