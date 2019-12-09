package TestBase;

/**
 * 1)抽象方法
 * 2)抽象类
 * <p>
 * ps：
 * 1) 有抽象方法的类只能是抽象类
 * 2) 抽象类不能被实例化，只能被继承
 * 3) 属性、方法、构造方法,但是构造方法不是用来实例化的，是用来被子类调用
 * (抽象类与接口的区别:接口只能有方法，并不能有属性)
 */

public class TestChouXiang {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxx");
        ChildChou chouxiang = new ChildChou();
        chouxiang.call();
        chouxiang.shout();
    }
}

abstract class TestChou {
    abstract public void call();
}

class ChildChou extends TestChou {
    public void call() {
        System.out.println("我是子类实现父类的抽像方法");
    }

    public void shout() {
        System.out.println("shouting..............");
    }
}

