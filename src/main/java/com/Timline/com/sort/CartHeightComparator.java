package Timline.com.sort;

import java.util.Comparator;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 10:26
 * @Version 1.0
 */
public class CartHeightComparator implements Comparator<Timline.com.sort.Cat> {

    @Override
    public int compare(Timline.com.sort.Cat c1, Timline.com.sort.Cat c2) {
        if (c1.height > c2.height) return 1;
        else if (c1.height < c2.height) return -1;
        else return 0;
    }
}
