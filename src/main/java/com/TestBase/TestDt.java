package TestBase;

/**
 * 测试多态
 * <p>
 * 多个对象里面有相同的方法，然后在一个对象的方法里面调用，如果给这个对象作为参数传入进去，然后调用这几个对象的不同的方法，如会给取不同的结果，此为多态
 */
public class TestDt {
    public static void main(String[] args) {
        Animal cat = new Cat();
        shout(cat);
        Animal dog = new Dog();
        shout(dog);
    }

    public static void shout(Animal a) {
        a.shout();
    }

}

class Animal {
    public void shout() {
        System.out.println("global calling........");
    }
}

class Cat extends Animal {
    public void shout() {
        super.shout();
        System.out.println("maio.........");
    }
}

class Dog extends Animal {
    public void shout() {
        super.shout();
        System.out.println("wang............");
    }
}


