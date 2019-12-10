package main.java.DesignPatter.bridgePattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 11:30
 * @Version 1.0
 */
public class BridgeTest {
    public static void main(String[] args) {
        // 具体的实现者
        ConcreteImplementorA a = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(a);
        refinedAbstraction.operation();

        System.out.println("-------------------");

        MyColor myColor = new MyColor(new ConcreteColor());
        myColor.operation();

    }
}

//实现化角色
interface Implementor {
    public void OperationImpl();
}

//具体实现化角色
class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}


class ConcreteColor implements Implementor {

    @Override
    public void OperationImpl() {
        System.out.println("具体的颜色返回..........");
    }
}


//抽象化角色
abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void operation();
}

//扩展抽象化角色
class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}


class MyColor extends Abstraction {


    protected MyColor(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("这个是自定颜色的抽象类.............................");
        imple.OperationImpl();
    }
}