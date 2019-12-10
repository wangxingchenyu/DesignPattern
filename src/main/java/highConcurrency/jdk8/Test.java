package main.java.highConcurrency.jdk8;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 9:30
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        TTImpl tt = new TTImpl();
        //m1(tt::getMessage); // jdk8以后的写法  m1(()->tt.getMessage());

        m1(()->tt.getMessage());
        /**
         *  functionInterface 接口中只有一个抽象方法
         */

    }

    public static void m1(TT tt) {
        tt.getMessage();
    }
}
