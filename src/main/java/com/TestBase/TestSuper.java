package TestBase;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass("alex", 10, 198).f();
    }
}

class Parent {

    Parent() {
        System.out.println("father");
    }

    public void drive() {
        System.out.println("parent can driving");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("son");
    }

    public void drive() {
        super.drive();
        System.out.println("child can driving");
    }
}

class FatherClass {
    public int value;
    public String username;
    public int age;

    //父类的构造方法
    FatherClass(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void f() {
        value = 100;
        System.out.println("TestBase.FatherClass.value=" + value);
    }
}

class ChildClass extends FatherClass {
    public int value;
    int height;

    /**
     * 如果重写构造父类的构造方法，则子类的要给上面的内容给写好，然后用super引入父类的属性
     *
     * @param username
     * @param age
     * @param height
     */

    ChildClass(String username, int age, int height) {
        super(username, age);
        this.height = height;
        System.out.println("child construct");
        System.out.println(this.username);
    }

    public void f() {
        super.f();
        value = 200;
        System.out.println("TestBase.ChildClass.value=" + value);
        System.out.println(value);
        System.out.println(super.value); //调用父类对象的成员变量
    }

}
