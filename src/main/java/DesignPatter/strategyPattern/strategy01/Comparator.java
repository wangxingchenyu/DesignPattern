package main.java.DesignPatter.strategyPattern.strategy01;

/**
 * @date 2019-11-28 15:37
 * @author wangzhilei
 */
@FunctionalInterface
public interface Comparator<T> {
    int compareTo(T t1, T t2);
}
