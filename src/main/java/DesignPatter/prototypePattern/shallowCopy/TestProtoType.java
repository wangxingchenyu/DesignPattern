package main.java.DesignPatter.prototypePattern.shallowCopy;



import java.io.*;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:41
 * @Version 1.0
 */
public class TestProtoType {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        Person person = new Person("male", 178, 180, new Child(12, "male"));
        Person clone = person.clone();

        System.out.println(person == clone);

        System.out.println(person.child == clone.child);

    }


}
