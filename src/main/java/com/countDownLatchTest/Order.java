package main.java.com.countDownLatchTest;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 14:30
 * @Version 1.0
 */
public class Order {
    public static int orderNum = 0;

    public /*synchronized*/ static int getOrder() {

        System.out.print(orderNum);
        orderNum++;
        return orderNum;
    }

}
