package main.java.DesignPatter.strategyPattern.strategy02;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 11:17
 * @Version 1.0
 */
public class Sort<T> {

    public void sort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                T tmp;
                if (c.compareTo(arr[i], arr[j]) > 0) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
