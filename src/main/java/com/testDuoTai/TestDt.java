package testDuoTai;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/6 17:40
 * @Version 1.0
 */
public class TestDt {
    public static void main(String[] args) {
        /**
         *  多态的三个必要的条件
         *  - 继承
         *  - 重写
         *  - 父类引用子类的对象
         *
         *  有抽象方法的的类一定是抽象类，抽象类不能实例化，
         *
         *
         */

        Cat cat = new Cat();

        // 调有的是真实传的对象
        TestDt.show(cat);

    }

    public static void show(Animal a) {
        /*

         方法都是先走自己的方法，如果有super再走父类的方法，但是通常情况下，父类的方法都是被重写的

         不需要利用父类里里的代码，所以可以直接声明成一个抽象类

         */


        a.eat();

        /*
        try {
            if (a == null) {
                System.out.println("未知操作..");
            } else {

                if (a instanceof Cat) {
                    Cat c = (Cat) a;
                    c.work();
                }

                if (a instanceof Dog) {
                    Dog d = (Dog) a;
                    d.work();
                }
            }

        } catch (Exception e) {
            e.fillInStackTrace();
        }
         */

    }

}

abstract class Animal {
    abstract void eat();
}

abstract class Bird extends Animal {
    @Override
    abstract void eat();
}

class Cat extends Animal {
    String catname = "alex";

    @Override
    public void eat() {
        System.out.println("Cat is eating............");
    }

    public void work() {
        System.out.println("catch mouse............");
    }

}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating............");
    }

    public void work() {
        System.out.println("protect home......");
    }

}


