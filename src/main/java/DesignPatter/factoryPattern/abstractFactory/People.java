package main.java.DesignPatter.factoryPattern.abstractFactory;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 14:54
 * @Version 1.0
 */
public class People {
    public static void main(String[] args) {
        /*
        AbstractFactory f = new PersonFactory();
        Food food = f.createFood();
        food.eat();

        Weapon weapon = f.createWeapon();
        weapon.shoot();
         */

        AbstractFactory f = new DogFactory();

        Food food = f.createFood();
        food.eat();

        Weapon weapon = f.createWeapon();
        weapon.shoot();

    }
}
