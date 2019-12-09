package com.zhilei.test.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * collection工具类
 *   类 java.util.Collections 提供了对Set、List、Map进行排序、填充、查找元素的辅助方法。
 *
 *
 */
public class TestCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        
        List l1 = new ArrayList();
        l1.add(12);
        l1.add(1);

        // 使用二分法进行查找一个值，返回的是index(索引)
        System.out.println(Collections.binarySearch(list,"three"));


//      重写容器
//        Collections.fill(list,"aaaaaaaaaaaaaaa");
//        System.out.println(list);


//        // 升序
//        Collections.sort(list);
//        // 反转
//        Collections.reverse(list);
//
//        System.out.println(list);
//
//        Collections.shuffle(list);
//        System.out.println(list);
        
        

    }
}
