package testJavaNet;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/12 10:12
 * @Version 1.0
 */
public class TestJavaNet {
    public static void main(String[] args) {

        try {
            String result = URLEncoder.encode("http://www.jd.com", "UTF-8");
            System.out.printf("编码后的数据:%s", result);
            System.out.println();
            String url = URLDecoder.decode(result, "UTF-8");
            System.out.printf("解码后的数据: %s", url);
        } catch (UnsupportedEncodingException ex) {
            ex.fillInStackTrace();
        }

    }
}
