package testFileType;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/6 9:37
 * @Version 1.0
 */

class Cat {
    int height;
    int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {

            return false;
        } else {
            if (obj instanceof Cat) {
                Cat c = (Cat) obj;
                if (c.height == this.height && c.weight == this.weight) {

                    return true;
                }
            }
        }
        return false;
    }
}


