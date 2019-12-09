package testDuoTai.testExtends;

import java.util.ArrayList;
import java.util.*;


/**
 * @Author: husToy.Wang
 * @Date: 2019/11/6 17:54
 * @Version 1.0
 */
public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        String[] s = {"one", "two", "three"};
        String join = String.join(".", s);
        System.out.println(join);
        List<String> s1 = new ArrayList<>();
        s1.add("four");
        s1.add("five");
        s1.add("six");
        String joinResult = String.join("/", s1);
        System.out.println(joinResult);

    }
}

class Person {

    public void eat() {
        System.out.println("person is eating");
    }

}

class Student extends Person {

    @Override
    public void eat() {
        System.out.println("student is eating..........");
        super.eat(); // 必须写在重写方法的第一行
    }

}
