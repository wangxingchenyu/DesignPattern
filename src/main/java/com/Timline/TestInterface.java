package Timline;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/27 9:00
 * @Version 1.0
 */
@FunctionalInterface
public interface TestInterface {
    void eat();
    default void getMessage(){
       System.out.println("xx");
    }
}
