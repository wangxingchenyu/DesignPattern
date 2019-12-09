package main.java.DesignPatter.factoryPattern.abstractFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 14:58
 * @Version 1.0
 */
public class DogFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new DogBread();
    }

    @Override
    public Weapon createWeapon() {
        return new DogCatch();
    }
}
