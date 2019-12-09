package com.zhilei.test.hashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testList {
    public static void main(String[] args){
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        List l1 = new ArrayList();
        l1.add(3);
        l1.add(4);


        l.removeAll(l1);

        Iterator a  = l.iterator();

        while (a.hasNext()){
            System.out.println(a.next());
        }

    }
}
