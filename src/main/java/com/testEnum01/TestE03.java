package main.java.com.testEnum01;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/6 17:26
 * @Version 1.0
 */
public class TestE03 {
    public static void main(String[] args) {
        Person student = new Studend("180");
        String name = student.name;
    }


}


class Person {
    String name="Person...";
}


class Studend extends Person {
    String height;

    public Studend(String height) {
        this.height = height;
    }
}


