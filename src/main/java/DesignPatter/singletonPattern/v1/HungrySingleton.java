package main.java.DesignPatter.singletonPattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 15:18
 * @Version 1.0
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }


}
