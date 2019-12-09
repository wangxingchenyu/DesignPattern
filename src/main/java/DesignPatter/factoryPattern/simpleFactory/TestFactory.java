package main.java.DesignPatter.factoryPattern.simpleFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:49
 * @Version 1.0
 */
public class TestFactory {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Cat c = animalFactory.createCat();

    }
}


