package TestInerCase;


public class TestStaticInnerClass {
    public static void main(String[] args) {
        //通过 new 外部类名.内部类名() 来创建内部类对象
        Outer out  = new Outer();
        out.show();
    }
}

class Outer {
    //相当于外部类的一个静态成员

    public void show(){
         Inner in = new Inner();
         System.out.println(in.usename);
    }

    static class Inner {
        String usename ="alex";
    }
}