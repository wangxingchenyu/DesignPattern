package main.java.highConcurrency.jdk8;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/10 9:31
 * @Version 1.0
 */
public class TTImpl implements TT {
    @Override
    public void getMessage() {
        System.out.println("tt--impl");
    }
}
