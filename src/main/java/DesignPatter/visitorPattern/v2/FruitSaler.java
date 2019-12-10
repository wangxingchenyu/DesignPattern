package main.java.DesignPatter.visitorPattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 9:47
 * @Version 1.0
 */
public class FruitSaler {
    List<Fruit> fruits = new ArrayList();

    void BuyFruit(FruitPurchaser fruitPurchaser) {
        fruits.add(new Apple());
        fruits.add(new Pear());
        fruits.add(new Banana());

        for (Fruit fruit : fruits) {
            fruit.identityconfirmation(fruitPurchaser);
        }

    }

    public static void main(String[] args) {

        PersonalPurchaser personalPurchaser = new PersonalPurchaser(2);
        FruitSaler fruitSaler = new FruitSaler();
        fruitSaler.BuyFruit(personalPurchaser);
        double v = personalPurchaser.shouldPayTotalPrice();
        System.out.println("person should pay " + v);


        BulkPurchaser bulkPurchaser = new BulkPurchaser(10);
        fruitSaler.BuyFruit(bulkPurchaser);
        double v1 = bulkPurchaser.shouldPayTotalPrice();
        System.out.println("bulk should pay " + v1);
    }
}


interface FruitPurchaser {
    void defineAppPrice(Apple apple);

    void definePearPrice(Pear pear);

    void defineBananaPrice(Banana banana);

    double shouldPayTotalPrice();
}

// 定义一个购买者
class PersonalPurchaser implements FruitPurchaser {
    double totalPrice = 0.0;
    int count = 1;

    // 声明对象的时候，传入一个购买的数量
    public PersonalPurchaser(int count) {
        this.count = count;
    }

    @Override
    public void defineAppPrice(Apple apple) {
        totalPrice += apple.getPrice() * 0.9;
    }

    @Override
    public void definePearPrice(Pear pear) {
        totalPrice += pear.getPrice() * 0.8;
    }

    @Override
    public void defineBananaPrice(Banana banana) {
        totalPrice += banana.getPrice() * 0.8;
    }

    @Override
    public double shouldPayTotalPrice() {
        return totalPrice * count;
    }
}

// 批量购买者
class BulkPurchaser implements FruitPurchaser {
    double totalPrice = 0.0;
    int count;

    // 传入买的数量
    public BulkPurchaser(int count) {
        this.count = count;
    }

    @Override
    public void defineAppPrice(Apple apple) {
        totalPrice += apple.getPrice() * 0.6;
    }

    @Override
    public void definePearPrice(Pear pear) {
        totalPrice += pear.getPrice() * 0.7;
    }

    @Override
    public void defineBananaPrice(Banana banana) {
        totalPrice += banana.getPrice() * 0.5;
    }

    @Override
    public double shouldPayTotalPrice() {
        return totalPrice * count;
    }


}

abstract class Fruit {
    abstract void identityconfirmation(FruitPurchaser fruitPurchaser);

    abstract double getPrice();
}

class Apple extends Fruit {

    @Override
    void identityconfirmation(FruitPurchaser fruitPurchaser) {
        fruitPurchaser.defineAppPrice(this);
    }

    @Override
    double getPrice() {
        return 10.0;
    }
}

class Pear extends Fruit {

    @Override
    void identityconfirmation(FruitPurchaser fruitPurchaser) {
        fruitPurchaser.definePearPrice(this);
    }

    @Override
    double getPrice() {
        return 4.0;
    }
}

class Banana extends Fruit {

    @Override
    void identityconfirmation(FruitPurchaser fruitPurchaser) {
        fruitPurchaser.defineBananaPrice(this);
    }

    @Override
    double getPrice() {
        return 6.0;
    }
}



