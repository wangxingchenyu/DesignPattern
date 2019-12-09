package main.java.DesignPatter.chinOfResponsitilyPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 10:05
 * @Version 1.0
 */
public class Response {
    public String str;

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Response{" +
                "str='" + str + '\'' +
                '}';
    }
}
