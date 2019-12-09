package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:23
 * @Version 1.0
 */
public interface Observer {
   // void doActionOnChildWakeUp(EatEvent event);

    void doAction(EatEvent eatEvent);

}
