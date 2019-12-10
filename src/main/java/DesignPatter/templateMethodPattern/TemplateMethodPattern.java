package main.java.DesignPatter.templateMethodPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 10:35
 * @Version 1.0
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }

}


abstract class AbstractClass {
    public void TemplateMethod() //模板方法 (其实也是公共的部分)
    {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecificMethod() //具体方法,也就是公共的部分，不需要子类去再实现
    {
        System.out.println("抽象类中的具体方法被调用...公用的部分............... ");
    }

    public abstract void abstractMethod1(); //抽象方法1

    public abstract void abstractMethod2(); //抽象方法2
}

//具体子类
class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}





