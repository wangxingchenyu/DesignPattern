package main.java.DesignPatter.strategyPattern.strategy02;

import Timline.com.sort.Cat;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 11:26
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Sort<Cat> catSort = new Sort<>();

        Cat[] cats = {new Cat(2, 43), new Cat(34, 4), new Cat(23, 403)};

        catSort.sort(cats, (o1, o2) -> {
            if (o1.weight > o2.weight) {
                return 1;
            } else if (o1.weight< o2.weight) {
                return -1;
            } else {
                return 0;
            }
        });


        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
