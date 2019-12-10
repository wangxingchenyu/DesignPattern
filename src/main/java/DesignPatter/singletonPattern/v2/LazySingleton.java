package main.java.DesignPatter.singletonPattern.v2;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 15:39
 * @Version 1.0
 */
public class LazySingleton {
    private static volatile LazySingleton instance=null;    //保证 instance 在所有线程中同步
    private LazySingleton(){}    //private 避免类在外部被实例化
    public static synchronized LazySingleton getInstance()
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }
}
