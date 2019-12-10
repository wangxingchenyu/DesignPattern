package main.java.DesignPatter.mediatorPattern.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 14:36
 * @Version 1.0
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();

        md.register(c1);
        md.register(c2);
        c1.send();

        c2.send();
    }
}

//抽象中介者
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}

//具体中介者
class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this); // 注册的时候，就告诉这个注册对象这个中者介是谁
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) { // 和传入进来的不一样的，都可以接收传递过来消息
                ((Colleague) ob).receive();
            }
        }
    }
}

//抽象同事类
abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) { // 设置中介者
        this.mediator = mediator;
    }

    // 接收到请求
    public abstract void receive();

    // 发送请求
    public abstract void send();
}

//具体同事类
class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("真实的同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("真实的同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}

//具体同事类
class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
