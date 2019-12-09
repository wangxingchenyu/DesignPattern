package TestMath;

import java.util.Random;

/**
 * Math
 */

public class Math_demo01 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.3));
        System.out.println(Math.max(2, 4));
        System.out.println(Math.min(1, 3));
        System.out.println(Math.sqrt(10));
        System.out.println(Math.pow(10, 3));
        System.out.println(Math.abs(-1000));
        System.out.println(Math.round(1.2));
        System.out.println("***********************************************");
        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.2));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.8));
        //绝对值、开方、a的b次幂等操作
        System.out.println(Math.abs(-45));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.pow(2, 5));
        //Math类中常用的常量
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //随机数
        System.out.println(Math.random());// [0,1)
        System.out.println("***********************************************");
        Random rand = new Random();

//        System.out.println(rand.nextDouble());
//        System.out.println(rand.nextInt());
//        System.out.println(rand.nextBoolean());
//        System.out.println(rand.nextLong());
//        System.out.println(rand.nextInt(100));
//        System.out.println(rand.nextFloat());
//        System.out.println(rand.doubles());
//        System.out.println(rand.nextDouble());
//
//        System.out.println(rand.nextInt());
//        System.out.println(rand.nextFloat());
//
//        System.out.println(rand.nextBoolean());
//
//        System.out.print(rand.nextInt(10));
//
//        System.out.print(20 + rand.nextInt(10));

        System.out.print(20 + (int) (rand.nextDouble() * 10));

    }
}
