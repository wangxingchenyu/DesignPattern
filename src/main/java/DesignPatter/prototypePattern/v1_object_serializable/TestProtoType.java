package main.java.DesignPatter.prototypePattern.v1_object_serializable;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:41
 * @Version 1.0
 */
public class TestProtoType {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("d:/Person.data");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream  oos = new ObjectOutputStream(fos);
        Person p = new Person("male", 180, 160);
        oos.writeObject(p); */
        try {
            load();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void load() throws IOException, ClassNotFoundException {
        /**
         * 加载文件中的类文件
         */
        File file = new File("d:/Person.data");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person) ois.readObject();

        System.out.println(p);
    }
}
