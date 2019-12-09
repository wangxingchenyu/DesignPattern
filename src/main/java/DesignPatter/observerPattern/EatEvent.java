package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:45
 * @Version 1.0
 */
public class EatEvent implements Event<EventSource> {
    public String name;
    public String message;
    public EventSource source;

    public EatEvent(String name, String message, EventSource source) {
        this.name = name;
        this.message = message;
        this.source = source;
    }

    @Override
    public EventSource getSource() {
        return source;
    }

}
