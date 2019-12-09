package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:29
 * @Version 1.0
 */
public class Listener01 implements Observer {

    @Override
    public void doAction(EatEvent eatEvent) {
        System.out.println("Listener01");
        EventSource source = eatEvent.getSource();
    }
}
