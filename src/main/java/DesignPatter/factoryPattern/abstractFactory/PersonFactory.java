package main.java.DesignPatter.factoryPattern.abstractFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 14:53
 * @Version 1.0
 */
public class PersonFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }
}
