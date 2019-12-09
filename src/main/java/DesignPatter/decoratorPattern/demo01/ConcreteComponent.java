package main.java.DesignPatter.decoratorPattern.demo01;

/**
 * @Author: zhilei.wang
 * @Date: 2019/11/29 17:34
 * @Version 1.0
 * @date 2019-11-29 17:44
 * @author wangzhilei
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }


}
