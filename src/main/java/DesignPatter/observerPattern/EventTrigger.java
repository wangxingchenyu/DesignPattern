package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:35
 * @Version 1.0
 */
public class EventTrigger {
    public static void main(String[] args) {

        /**
         * 原则 观察者抽象出来一个接口，里面可以定义多个方法来观察不同的事件  实现一个方法，只监听一个事件
         *
         *
         */
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new Listener01()).addObserver(new Listener02());
        EatEvent eatEvent = new EatEvent("Alex", "this is from alex", eventSource);
        eventSource.executeEvent(eatEvent);



    }
}
