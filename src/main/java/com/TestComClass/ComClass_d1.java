package TestComClass;

/**
 * 包装类(Double Integer)
 * <p>
 * 1)数据类型间的转换
 * 2)可以简分数据的声明
 */

public class ComClass_d1 {
    public static void main(String[] args) {
        // 这样可以
        Integer a = new Integer(10);
        // 这样也可以
        Integer b = Integer.valueOf(100);
        // 转换为整型
        int c = b.intValue();

        // 字符串转为整型
        String s = "3333";
        int d = Integer.parseInt(s);
        int f = Integer.valueOf("3333");

        Integer ii = new Integer(100);
        String s1 = ii.toString();
        System.out.println(s1);

        String f1 = "12.3";
        float f4 = Float.parseFloat(f1);
        System.out.println(f4);
        System.out.println("################################################################");
        state();

    }

    public static void state() {
        float v = Float.parseFloat("12.3");
        System.out.println(v);
        float f = Float.valueOf("12.34");
        System.out.println(f);
    }
}



