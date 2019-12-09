package main.java.DesignPatter.factoryPattern.abstractFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 13:38
 * @Version 1.0
 */
public abstract class AbstractFactory {
    public abstract Food createFood();
    public abstract Weapon createWeapon();
}
