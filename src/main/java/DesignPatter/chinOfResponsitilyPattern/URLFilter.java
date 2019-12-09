package main.java.DesignPatter.chinOfResponsitilyPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:46
 * @Version 1.0
 */
public class URLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String req = request.str +"urlFilterReceived";
        System.out.println(req);
        filterChain.doFilter(request,response,filterChain);
        response.setStr(response.str+"-----"+"urlFilterResponsed");
        System.out.println(response.str);
    }
}
