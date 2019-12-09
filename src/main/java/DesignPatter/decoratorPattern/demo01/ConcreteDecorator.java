package main.java.DesignPatter.decoratorPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 17:38
 * @Version 1.0
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() { System.out.println("为具体构件角色增加额外的功能addedFunction()"); }


}
