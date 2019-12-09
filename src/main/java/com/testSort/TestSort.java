package testSort;

import java.util.Arrays;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/26 10:18
 * @Version 1.0
 */
public class TestSort {
    public static void main(String[] args) {
        int[] v = {1,3,20,8};

        Sort a = new Sort();

         a.sort(v);
        
        System.out.println(Arrays.toString(v));
    }
}
