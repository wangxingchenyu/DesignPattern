package main.java.DesignPatter.chinOfResponsitilyPattern.demoFinal;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 9:47
 * @Version 1.0
 */
public class Request {
    public String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Request{" +
                "str='" + str + '\'' +
                '}';
    }
}
