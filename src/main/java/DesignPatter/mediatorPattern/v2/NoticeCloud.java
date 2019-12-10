package main.java.DesignPatter.mediatorPattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 14:59
 * @Version 1.0  你中有我，我中有你
 */
public class NoticeCloud {
    public static void main(String[] args) {
        Cloud cloud = new Cloud();
        // 向联合国里面注册会员,并告诉会员当前注册是哪个联合组织
        Caiwu caiwu = new Caiwu();
        Xingzheng xingzheng = new Xingzheng();
        Hr hr = new Hr();
        cloud.registerDepartment(caiwu).registerDepartment(xingzheng).registerDepartment(hr);
        hr.send();

    }
}


class Cloud {
    List<Department> departments = new ArrayList<>();

    public Cloud registerDepartment(Department department) {
        departments.add(department);
        department.setCloud(this);
        return this;
    }

    public void notice(Department department) {
        System.out.println("中间准备发送.............");
        for (Department department1 : departments) {
            if (department1 != department) { // 逐个发送
                department1.receive();
            }
        }
    }
}


abstract class Department {
    Cloud cloud = null;

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public abstract void receive();

    public abstract void send();

}


class Caiwu extends Department {

    @Override
    public void receive() {
        System.out.println("财务接收到信息");
    }

    @Override
    public void send() {
        System.out.println("CaiWu 发送了消息");
        cloud.notice(this);
    }
}


class Xingzheng extends Department {

    @Override
    public void receive() {
        System.out.println("行政接收到信息");
    }

    @Override
    public void send() {
        System.out.println("Xingzheng 发送了消息");
        cloud.notice(this);
    }
}


class Hr extends Department {

    @Override
    public void receive() {
        System.out.println("人资接收到信息");
    }

    @Override
    public void send() {

        System.out.println("Hr 发送了消息");
        cloud.notice(this);
    }
}
