package TestArray;

import java.util.Arrays;
import java.util.List;

/**
 * 数组拷备
 */
public class TestArray {
    public static void main(String args[]) {
        int[] s = {1,2,3};
        List<int[]> ints = Arrays.asList(s);

        Integer[] arr = new Integer[]{1,2,3};

        List<Integer> integers = Arrays.asList(arr);


        //List intlist = Arrays.asList(i);
    }
}
