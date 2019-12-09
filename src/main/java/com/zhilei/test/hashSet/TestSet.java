package com.zhilei.test.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args){
        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("***********************************");
        Set s1 = new HashSet();
        s1.add(3);
        s1.add(4);
        s1.add(5);

        // 求两个集合的差集
//        s.removeAll(s1);


        // 求两个集合的并集
//        s.addAll(s1);


//       两个集合的交集
//        s.retainAll(s1);

//      集合的遍历方法一(利用迭带器生成遍历 )
        Iterator i1 = s.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

//        for语句遍历
        for (Iterator  a = s.iterator();a.hasNext();){
            System.out.println(a.next());
        }

    }
}
