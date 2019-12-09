package com.leige.testhashset;

import java.util.HashSet;
import java.util.Set;

/**
 * treemap
 *
 */
public class Testset {
    public static void main(String[] args){
        Set s = new HashSet();

        s.add("one");
        s.add("two");
        s.add("three");

        Set s1 = new HashSet();
        s1.add("three");
        s1.add("four");
        s1.add("five");

        System.out.println("长度:"+s.size());
        System.out.println("是否是空:"+s.isEmpty());
        System.out.println("是否包含one:"+s.contains("one"));

    }
}
