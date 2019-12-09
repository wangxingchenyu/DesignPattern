package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:30
 * @Version 1.0
 */
public class Listener02 implements Observer {

    @Override
    public void doAction(EatEvent eatEvent) {
        // 根据不同的事情源与不同的事件内容来做具体的判断
        System.out.println("Listener02");
    }
}
