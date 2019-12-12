package main.java.array;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/5 13:08
 * @Version 1.0
 */
public class TestArray {
    public static void main(String[] args) {


        String[] arr = {"one","two","three","four","five"};

        String[] a = new String[10];

        System.arraycopy(arr,0,a,0,arr.length);

        for (String s : a) {
            System.out.println(s);
        }


    }
}
