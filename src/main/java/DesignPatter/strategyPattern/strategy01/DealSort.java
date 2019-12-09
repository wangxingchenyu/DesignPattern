package main.java.DesignPatter.strategyPattern.strategy01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:32
 * @Version 1.0
 */
public class DealSort {
    public static void main(String[] args) {
        Sort sort = new Sort<Cat>();
        Cat[] cats = {new Cat(1, 3), new Cat(44, 22), new Cat(40, 56)};

        sort.sort(cats, new Comparator<Cat>() {
            @Override
            public int compareTo(Cat t1, Cat t2) {
                if (t1.height > t2.height) return 1;
                else if (t1.height < t2.height) return -1;
                else return 0;
            }
        });

        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
