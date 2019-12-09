package testAbstract;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/7 16:08
 * @Version 1.0
 */
public class TestAbstract {
    public static void main(String[] args) {
        /*
        Singer singer = new Teacher01();
        singer.getMessage();
        singer.technology();
        System.out.print("----------------------------");
         */
        Teacher01 teacher01 = new Teacher01();
        teacher01.getMessage();
    }

}

abstract class Singer {
    abstract void technology();

    public void getMessage() {
        System.out.println("get Message.........");
    }
}


class Teacher01 extends Singer {

    @Override
    public void getMessage() {
        super.getMessage(); // 保留父类的之前的功能
        System.out.println("teacher's get message");
    }


    @Override
    void technology() {
        System.out.println("I'm a teacher I can speak English");
    }

    public void teach() {
        System.out.println("I can teach you english.....");
    }
}
