package out;

public class TestOutClass {
    public static void main(String[] args) {
        System.out.println();

        //在主类里面来访问(通过实例化)
        Outer out = new Outer();
        out.show();
//
//        Outer.Inner out_inner = new Outer().new Inner();
//        out_inner.show();
    }
}

/*内部类不能在外部类的静态方法时面使用*/

class Outer {
    private int age = 10;

    // 通过父类的方法来访问
    public void show() {
        Inner inder = new Inner();
        inder.show();
        System.out.println(inder.username);
    }

    class Inner {
        int age = 20;
        String username = "alex";

        public void show() {
            System.out.println(this.age);
            System.out.println(Outer.this.age);
            System.out.println(this.username);
//            int age = 30;
//            System.out.println("内部类方法里的局部变量age:" + age);// 30
//            System.out.println("内部类的成员变量age:" + this.age);// 20
//            System.out.println("外部类的成员变量age:" + Outer.this.age);// 10
        }
    }
}
