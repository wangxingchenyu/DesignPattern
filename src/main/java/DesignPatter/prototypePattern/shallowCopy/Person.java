package main.java.DesignPatter.prototypePattern.shallowCopy;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:40
 * @Version 1.0
 */
public class Person implements Cloneable {
    String sex;
    int height;
    int weight;
    Child child;

    public Person(String sex, int height, int weight, Child child) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.child = child;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
            // p.child = child.clone();
        return p;
    }
}


class Child /* implements  Cloneable*/ {
    int age;
    String sex;

    public Child(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    /*
    @Override
    protected Child clone() throws CloneNotSupportedException {
        return (Child) super.clone();
    }
     */
}
