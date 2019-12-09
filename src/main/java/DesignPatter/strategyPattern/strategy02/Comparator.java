package main.java.DesignPatter.strategyPattern.strategy02;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 11:16
 * @Version 1.0
 */
@FunctionalInterface
public interface Comparator<T> {
    int compareTo(T t, T t2);
}


