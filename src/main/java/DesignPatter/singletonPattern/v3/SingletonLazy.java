package main.java.DesignPatter.singletonPattern.v3;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 15:41
 * @Version 1.0
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President zt1 = President.getInstance();

        President zt2 = President.getInstance();

        System.out.println(zt1 == zt2);

    }
}


class President {
    private static volatile President instance = null;    //保证instance在所有线程中同步

    //private避免类在外部被实例化
    private President() {
    }

    public static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }


}
