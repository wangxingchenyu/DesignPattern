package TestArray;

import java.util.Arrays;

public class TestArray_02 {
    public static void main(String[] args) {
//        mutiArray();
//        System.out.println("xxxxxxxxxxxxxxxxxxxx");
//        staticArray();
//        System.out.println("xxxxxxxxxxxxxxxxxxxx");
//        arraylength();
//        System.out.println("xxxxxxxxxxxxxxxxxxxx");
//        testEqual();
//        System.out.println("xxxxxxxxxxxxxxxxxxxx");
//        storageTable();
//        maopao();
        maopao2();
    }

    // 多维数组的声明与遍历(静态初始化)
    public static void mutiArray() {
        int[][] arr = {{1, 3, 4}, {3, 4, 4}};
        for (int[] itme : arr) {
            System.out.println(Arrays.toString(itme));
        }
    }

    // 多维数组的动态初始化
    public static void staticArray() {
        int[][] arr = new int[3][];
        arr[0] = new int[]{1, 23, 3};
        arr[1] = new int[]{4, 5, 64, 5, 64, 5, 6};
        arr[2] = new int[]{5, 6,};
        // 遍历
        for (int[] a : arr) {
            for (int b : a) {
                System.out.println(b);
            }
        }
    }

    // 获取数组的长度
    public static void arraylength() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr.length);
    }

    // 比较两个数组是否相等
    public static void testEqual() {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 3, 4, 4};
        boolean isequal = Arrays.equals(arr, arr1);
        System.out.println(isequal);
    }

    // 数组存储表格数据
    public static void storageTable() {
        Object[] row1 = {1, "Alex", 10};
        Object[] row2 = {2, "Alex", 20};
        Object[] row3 = {3, "Alex", 30};
        Object[] row4 = {4, "Alex", 40};

        Object[][] tableList = new Object[4][];
        tableList[0] = row1;
        tableList[1] = row2;
        tableList[2] = row3;
        tableList[3] = row4;

        // 输出一个表格
        for (Object[] item : tableList) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static void maopao() {
        int temp;
        int[] values = {2, 34, 0, 245};
        for (int i = 0; i < values.length; i++) {

            // 每次操作都会给最大的找出来
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(values));
    }

    // 冒泡算法优化
    public static void maopao2(){
        System.out.println("aaaaaa");

    }

}
