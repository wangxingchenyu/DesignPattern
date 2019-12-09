package main.java.DesignPatter.factoryPattern.simpleFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:49
 * @Version 1.0
 */
public class Cat {
    public int height;
    public int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
