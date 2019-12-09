package com.io.demo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * 文件字节流
 */
public class TestFileio {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3);

        Optional<Integer> max = integers.stream().max(Comparator.comparing(Function.identity()));
        System.out.println(max.get());

        Optional<Integer> min = integers.stream().min(Comparator.comparing(Function.identity()));
        System.out.println(min.get());


        // 返反一个最大值 ，用lamba表达式
        Optional<Integer> max1 = integers.stream().max((x, y) -> x.compareTo(y));
        System.out.println(max1.get());


        // 获取第一个值
        Optional<Integer> first = integers.stream().findFirst();
        System.out.println(first.get());

        System.out.println(integers.get(0));
    }
}
