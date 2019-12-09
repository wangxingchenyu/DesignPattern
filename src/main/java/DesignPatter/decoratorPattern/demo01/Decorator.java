package main.java.DesignPatter.decoratorPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 17:35
 * @Version 1.0
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        addFunction();
    }

    public void addFunction(){
        System.out.println("extension function ");
    }

}
