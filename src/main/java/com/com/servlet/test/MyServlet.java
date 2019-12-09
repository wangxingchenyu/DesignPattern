package com.com.servlet.test;


import java.util.Arrays;
import java.util.List;

public class MyServlet {
    public static void main(String[] args) {
        /**
         * 如筛选， 排序，聚合等。
         *
         * 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。
         *
         */

        /*
        List<String> list = Arrays.asList("one","two","","three","four","five");
        List<String> collect = list.stream().filter((item) -> !item.isEmpty()).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }
        */

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        //  int count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        //  long count = strings.parallelStream().filter(string -> string.isEmpty()).count();


    }
}


