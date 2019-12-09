package main.java.DesignPatter.strategyPattern.strategy01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:32
 * @Version 1.0
 */
public class Cat {
    public int height;
    public int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
