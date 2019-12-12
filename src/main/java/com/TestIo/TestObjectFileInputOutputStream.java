package TestIo;

import java.io.*;

/**
 * 序列化
 * <p>
 * <p>
 * 对象序列化
 * <p>
 * 一  创建对象 需要说明，想序列化的对象一定要是实现Serivalizable接口
 * <p>
 * 二 将对象转为序列化对象
 * <p>
 * 三 然后用这个对象写对象或者是读对角
 * <p>
 * 四 如果写的话，则要flush 或者是close
 */
public class TestObjectFileInputOutputStream {
    public static void main(String[] args) {
//        TestSerializable testSerializable = new TestSerializable();
        FanSerive fanSerive = new FanSerive();
    }
}

/**
 * 序列化的类一定要实现Serializable
 */
class Person implements Serializable {
    // 添加序列化ID，它决定着是否能够成功反序列化！
    private static final long serialVersionUID = 1L;
    int age;
    boolean isMan;
    String name;

    public Person(int age, boolean isMan, String name) {
        super();
        this.age = age;
        this.isMan = isMan;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", isMan=" + isMan + ", name=" + name + "]";
    }
}

/**
 * 执行序列化
 */
class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = null;
        FileInputStream fis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        // 通过ObjectOutputStream将Person对象的数据写入到文件中，即序列化。
        Person person = new Person(18, true, "monitor");
        // 声明写出对象
        fos = new FileOutputStream("d:/person.txt");
        // 将文件对象序列化
        oos = new ObjectOutputStream(fos);

        // 序列化的对象写内容
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }
}

/**
 * 反序列化
 */
class FanSerive {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("执行读取文件对象的内容");
        FileInputStream fileInputStream = new FileInputStream("d:/person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
    }
}






