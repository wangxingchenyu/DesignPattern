package testSort;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/26 10:20
 * @Version 1.0
 */
public class Sort {

    /**
     * 冒泡排序
     *
     * @param v
     * @return
     */
    public void sort(int[] v) {

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int tmp;
                if (v[i] > v[j]) {
                    tmp = v[j];
                    v[j] = v[i];
                    v[i] = tmp;
                }
            }
        }
    }

    public void sort2(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                Comparable tmp;
                //if (arr[i] > arr[j]) {\
                /*
                if (arr[i].compareTo(arr[j])) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                 */
            }

        }

    }


}
