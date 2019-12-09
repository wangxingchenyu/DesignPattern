package main.java.DesignPatter.decoratorPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 17:47
 * @Version 1.0
 */
public class DecoratorPattern {
    public static void main(String[] args) {

        Component p = new ConcreteComponent();

        Component d = new ConcreteDecorator(p);
        d.operation();


    }
}
