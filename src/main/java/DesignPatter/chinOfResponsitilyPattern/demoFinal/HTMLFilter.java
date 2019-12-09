package main.java.DesignPatter.chinOfResponsitilyPattern.demoFinal;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:45
 * @Version 1.0
 */
public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String req = request.str + "HTMLfilterReceived";
        System.out.println(req);
        filterChain.doFilter(request, response, filterChain);
        response.setStr(response.str+">>>>>>>>>>>>>>" +"HtmlFilterResponsed");
        System.out.println(response.str);
    }
}
