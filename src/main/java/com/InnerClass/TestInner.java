package InnerClass;

/**
 * 内部类:
 * 1)只能外部类可以访问，其它的类，包括其它的包都不能访问
 * 2)内部类可以访问外部类的的私有属性，外部类不能访问内部类的属性
 *
 *
 * 内部类分类:
 * 1)成员内部类
 *  - 非静态内部类 (以使用private、default、protected、public任意进行修饰)
 *  - 静态内部类
 *
 * 2)匿名内部类
 * 3)局部内部类
 */

public class TestInner {
    public static void main(String[] args) {
        System.out.println();
        Outer out = new Outer();
        out.show();
    }
}

class Outer {
    private String username = "out_alex";
    private int age = 10;

    public void show() {
        Inner inner = new Inner();
        System.out.println(inner.height);
        inner.show();
    }

    public class Inner {
        private int height = 100;

        public void show() {
            System.out.println("外部类:" + username);
        }
    }
}


class Out2 {
    public static void main(String[] args) {
        //并不能直接的
        /**
         * 其它的内不能访问外部类里面的内部类
         */
//        Outer.Inner in_out = new Outer.Inner();
    }
}



