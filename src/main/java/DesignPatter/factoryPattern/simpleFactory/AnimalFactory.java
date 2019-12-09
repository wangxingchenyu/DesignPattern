package main.java.DesignPatter.factoryPattern.simpleFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:50
 * @Version 1.0
 */
public class AnimalFactory {
    public Cat createCat(){
       return new Cat();
    }
}
