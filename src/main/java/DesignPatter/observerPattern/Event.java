package main.java.DesignPatter.observerPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/2 17:38
 * @Version 1.0
 */
public interface Event<T> {
    public T getSource();
}
