package main.java.DesignPatter.prototypePattern.v1_object_serializable;

import java.io.Serializable;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:40
 * @Version 1.0
 */
public class Person implements Serializable {
    String sex;
    int height;
    int weight;

    public Person(String sex, int height, int weight) {
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
