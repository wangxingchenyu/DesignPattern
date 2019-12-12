package Timline.com.sort;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 10:20
 * @Version 1.0
 */
public class Cat {

    public int height;
    public int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    /*
    @Override
    public int compareTo(Cat o) {
        if (this.height > o.height) return 1;
        if (this.height <o.height) return -1;
        return 0;
    }
     */

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
