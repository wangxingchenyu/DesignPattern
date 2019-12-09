package main.java.DesignPatter.strategyPattern.strategy01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/28 15:28
 * @Version 1.0
 */
public class Sort<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                T tmp;
                if (comparator.compareTo(arr[i],arr[j]) >0){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

}
