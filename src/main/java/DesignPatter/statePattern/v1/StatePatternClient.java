package main.java.DesignPatter.statePattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 13:52
 * @Version 1.0
 */
public class StatePatternClient {
    public static void main(String[] args) {
        Context context = new Context();
        // context.Handle();    //处理请求
        context.Handle();
        context.Handle();
    }
}

//环境类
class Context {
    private State state;

    //定义环境类的初始状态,如果传入状态，则使用传入的状态，如果没有则使用ConreteS
    public Context() {
        this.state = new ConcreteStateA();
    }

    //设置新状态
    public void setState(State state) {
        this.state = state;
    }

    //读取状态
    public State getState() {
        return (state);
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}


//抽象状态类
abstract class State {
    // 传入一个对象来创建自己不同的实现
    public abstract void Handle(Context context);
}


//具体状态A类
class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

//具体状态B类
class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}





