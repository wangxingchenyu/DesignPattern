package TestArray;

import java.util.Arrays;

/**
 * 二分法查找
 */


public class Test {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        int searchWord = 200;
        /**
         * 二分法执行前，一定要排序
         */
        Arrays.sort(arr);   //二分法查找之前，一定要对数组元素排序
        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord + "元素的索引：" + binarySearch(arr, searchWord));
    }

    // 定义一个数组,然后传一个值进去
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;  // 获取中间索引
            if (value == array[middle]) {   // 如果这个值是这个数组的中间的话，则返回这个索引
                return middle;              // 返回查询到的索引位置
            }

            // 如果值大于中间的值的话， 说明则要改起点，起点应该改成中间的key+1
            if (value > array[middle]) {
                low = middle + 1;
            }

            if (value < array[middle]) {
                high = middle - 1;
            }
        }

        //上面循环完毕，说明未找到，返回-1
        return -1;
    }
}
