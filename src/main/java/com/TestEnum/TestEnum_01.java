package TestEnum;

public class TestEnum_01 {
    public static void main(String[] args) {
        TestEnum t = new TestEnum();
    }
}


class TestEnum {
    public static void main(String[] args) {
        /*
        for (Week k : Week.values()) {
            System.out.println(k);
        }
         */

        /**
         *  toString()
         *  getDeclaringClass()
         *  name()
         *  valueOf
         *  ordinal()
         */
        //String s = Season.SPRING.toString();
        //System.out.println(s);

        /*
        String name = Season.SUMMER.name();
        System.out.println(name);

        String s = Season.SUMMER.toString();
        System.out.println(s);
         */

        //  Class<Season> declaringClass = Season.SUMMER.getDeclaringClass();   返回此枚举常量的归属的枚举类

        int ordinal = Season.SUMMER.ordinal();
        System.out.print(ordinal);



        // switch语句中使用枚举
        /*
        int a = new Random().nextInt(4); // 生成0，1，2，3的随机数
        System.out.println(a);
        switch (Season.values()[a]) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINDTER:
                System.out.println("冬天");
                break;
        }

         */
    }
}

/**
 * 季节
 */
enum Season {
    SPRING, SUMMER, AUTUMN, WINDTER
}

/**
 * 星期
 */
enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}
