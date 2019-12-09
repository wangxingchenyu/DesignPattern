package testEnum01;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/4 10:58
 * @Version 1.0
 */
public class TestEnum02 {
    public static void main(String[] args) {
        Animal dog = new Dog("dog", "dogYellow");
        TestEnum02.getMessage(dog);
    }

    public static void getMessage(Animal animal) {
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            System.out.println(d.dogColor);
        } else if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            System.out.println(c.catColor);
        }
    }

}


class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}


class Dog extends Animal {
    String dogColor;

    public Dog(String name, String dogColor) {
        super(name);
        this.dogColor = dogColor;
    }

}


class Cat extends Animal {
    String catColor;

    public Cat(String name, String catColor) {
        super(name);
        this.catColor = catColor;
    }
}







