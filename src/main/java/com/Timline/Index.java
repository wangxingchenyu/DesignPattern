package Timline;

import Timline.com.sort.Cat;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Timline测试
 */
public class Index {

    public static void main(String[] args) throws ParseException, IOException {
        /*
        String[] strings = {"wangzhilei@jd.com", "sqyinchao@jd.com"};
        System.out.println(strings.length);
        System.out.println(strings.getClass());
        String s = Index.concatString("abc", "aece");

         */


        Cat cat = new Cat(1, 2);
        Cat cat1 = new Cat(10, 12);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat1);

        Collections.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if (o1.height > o2.height) return 1;
                else if (o1.height < o2.height) return -1;
                else return 0;
            }
        });

        System.out.println(cats);
        //   int i = cat.compareTo(cat1);
        //  System.out.println(i);
    }

    public static String concatString(String... keys) {
        System.out.println(keys.length);
        return null;
    }

}
