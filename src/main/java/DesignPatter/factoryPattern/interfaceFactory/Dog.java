package main.java.DesignPatter.factoryPattern.interfaceFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:53
 * @Version 1.0
 */
public class Dog implements Animal {
    @Override
    public void go() {
        System.out.println("dog is go..........");
    }
}
