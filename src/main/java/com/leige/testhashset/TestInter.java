package com.leige.testhashset;

import java.util.*;

public class TestInter {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");


        // 获取长度
        System.out.println(list.size());

        Iterator a = list.iterator();

        // 列表的遍历
        while (a.hasNext()){
            System.out.println(a.next());
            System.out.println();
        }

        // set的遍历
        Set s = new HashSet();
        s.add("s1");
        s.add("s2");
        s.add("s3");
        System.out.println(s.size());




        Iterator it = s.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
