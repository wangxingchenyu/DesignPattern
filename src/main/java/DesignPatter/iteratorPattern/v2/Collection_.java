package main.java.DesignPatter.iteratorPattern.v2;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 13:43
 * @Version 1.0
 */
public interface Collection_ extends Iterable_ {
    // 添加方法
    void add(Object o);

    // 返回容器长度
    int size();

    @Override
    Iterator_ iterator();
}
