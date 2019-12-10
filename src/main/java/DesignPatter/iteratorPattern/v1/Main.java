package main.java.DesignPatter.iteratorPattern.v1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 13:52
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        /*
        ArrayList_ als = new ArrayList_();
        als.add(new String("one1"));
        als.add(new String("one2"));
        als.add(new String("one3"));
        als.add(new String("one4"));
        als.add(new String("one5"));
        als.add(new String("one6"));
        als.add(new String("one7"));
        als.add(new String("one8"));
        als.add(new String("one9"));
        als.add(new String("one10"));
        als.add(new String("one11"));
        als.add(new String("one12"));

        Object[] objs = als.objs;

        for (Object obj : objs) {
            if (obj != null) System.out.println(obj.toString());
        }

        System.out.println("元素个数: " + als.size());
         */

        LinkedList_ ls = new LinkedList_();

        ls.add(new String("first"));
        ls.add(new String("second"));
        ls.add(new String("third"));
        ls.add(new String("fourth"));

        int size = ls.size();

        System.out.println("链表长度" + size);

        ArrayList<String> strings = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
