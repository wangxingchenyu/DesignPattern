package main.java.DesignPatter.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:31
 * @Version 1.0
 */
public class EventSource {
    List<Observer> observers = new ArrayList();

    public EventSource addObserver(Observer observer) {
        this.observers.add(observer);
        return this;
    }

    public void executeEvent(main.java.DesignPatter.observerPattern.EatEvent eatEvent) {
        for (Observer observer : this.observers) {
            observer.doAction(eatEvent);
        }
    }

}
