package testInterface01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/7 14:43
 * @Version 1.0
 */
public class TestInterface {
    public static void main(String[] args) {

        Runner teacher = new Teacher();

        //teacher.eat();
        //teacher.run();

        Teacher t  = (Teacher) teacher;

        t.eat();
        t.run();
        t.tanqin();
        t.shipu();

    }
}


class Student implements Singer {

    @Override
    public void tanqin() {
        System.out.println("tanqing.........");
    }

    @Override
    public void shipu() {
        System.out.println("shipu............");
    }

    public void study() {
        System.out.println("study..............");
    }
}


class Teacher implements Singer, Runner {

    @Override
    public void run() {
        System.out.println("teacher is running.......");
    }

    @Override
    public void eat() {
        System.out.println("teacher is eating........");
    }

    @Override
    public void tanqin() {
        System.out.println("teacher is tanqing......");
    }

    @Override
    public void shipu() {
        System.out.print("teacher is shipu.......");
    }

}

