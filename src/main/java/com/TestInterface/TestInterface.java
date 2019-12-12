package TestInterface;

/**
 * 接口说明:
 * <p>
 * [访问修饰符]  interface 接口名   [extends  父接口1，父接口2…]  {
 * 常量定义；
 * 方法定义；
 * }
 */

public class TestInterface {
    public static void main(String[] args) {
        Call call = new MDC();
        call.BaseCall();
        // 转成call实例，才能直接的调用
        ((MDC) call).baseMontor();
    }
}

interface Monitor {
    String net = "jdjk.jd.com";
    void baseMontor();
}

interface Call {
    String tel = "0527-84753566";
    void BaseCall();
    public static void test() {
        System.out.println("interface staic method");
    }
}

//同时实现两个接口
class MDC implements Monitor, Call {
    public void baseMontor() {
        System.out.println("mdc可以通过snmp来监控");
    }
    public void BaseCall() {
        System.out.println("mdc可以发送邮件与短信");
    }
}

interface Volant {
    int FLY_HIGHT = 100;  // 总是：public static final类型的；
    void fly();   //总是：public abstract void fly();
}

interface Honest {
    void helpOther();
}

class Angel implements Volant, Honest {
    public void fly() {
        System.out.println("我是天使，飞起来啦！");
    }
    public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }
}

class GoodMan implements Honest {
    public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }
}

class BirdMan implements Volant {
    public void fly() {
        System.out.println("我是鸟人，正在飞！");
    }
}
