package main.java.DesignPatter.commandPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 11:07
 * @Version 1.0
 */
public class CommandPattern {

    public static void main(String[] args) {
        Command c = new ConcreteCommand();
        Invoker invoker = new Invoker(c);
        System.out.println("客户访问调用者的call()方法...");
        invoker.call();
    }

}

interface Command {
    void execute();
}

// 执行者
class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

}

//接收者
class Receiver {
    public void action() {
        System.out.println("接收者的action()方法被调用...");
    }
}

// 调用者
class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
