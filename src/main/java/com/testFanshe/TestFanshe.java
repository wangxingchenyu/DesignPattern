package testFanshe;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/6 11:05
 * @Version 1.0
 */
public class TestFanshe {
    public static void main(String[] args) {


        //Dog xxxxxxxxxxxxxxxx = new Dog("xxxxxxxxxxxxxxxx");
        //OthrerCatagory othrerCatagory = new OthrerCatagory();

        // 如果是父类引用子类对象，则在调用的时候，这个引用当成父类的实例，只能访问父类里面的成员属性与方法
        Dog a = new Dog("小狗");
        //System.out.println(a.voice);

        OthrerCatagory othrerCatagory = new OthrerCatagory();
        othrerCatagory.getMessage(a);

    }
}


class OthrerCatagory{
    public void getMessage(Animal animal){
        System.out.println(animal.name);
    }
}


class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}


class Dog extends  Animal{
    String voice="wangwang";
     
    public Dog(String name) {
        super(name);
    }
}

