package TestEnum;

import java.util.Random;

public class TestMJ {
    public static void main(String[] args) {
        int a = new Random().nextInt(1);

        System.out.println(a);
        switch (Person.values()[a]) {
            case 女:
                System.out.println("女生赢");
                break;
            case 男:
                System.out.println("男生赢");
                break;
            default:
                System.out.println("谁都没有赢");
        }
    }
}

enum Person {
    男, 女
}
