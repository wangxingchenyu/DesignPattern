package com.io.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestChar {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        Random random = new Random();

        // limit用法
        random.ints().limit(10).forEach(System.out::println);

        // map处理并去重
        List<Integer> number = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        /*
        List<Integer> collect = number.stream().map(item -> item * item).distinct().collect(Collectors.toList());
        System.out.println(collect);
        */

        //大于10的数字
        List<Integer> collect = number.stream().filter(item -> item > 3).collect(Collectors.toList());
        System.out.println(collect);

        // filter用法
        List<String> strings = Arrays.asList("abc", "", "bc", "bc", "efg", "abcd", "", "jkl");
        long count = strings.stream().filter(item -> !item.isEmpty()).distinct().count();
        System.out.println("非空数字的总数" + count);
        long count1 = strings.parallelStream().filter(item -> item.isEmpty()).count();
        System.out.println("并行处理结果:" + count1);

        /**
         * php关系数组
         * javascript es6的话，都是用=> 箭头符号
         */
        //strings.stream().filter(item->!item.isEmpty()).forEach(System.out::println);

        /**
         * collect 汇总下结果，joining转为字符串
         */
        String toy = strings.stream().filter(item -> !item.isEmpty()).collect(Collectors.joining("雷"));
        System.out.println(toy);

        // 用","号连接，并且给这个字符串加个前缀与后缀
        String collect1 = strings.stream().filter(item -> !item.isEmpty()).collect(Collectors.joining(",", "中", "国"));
        System.out.println(collect1);

        // foreach 与sorted应用
        random.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println(Math.max(1,23));

    }
}
