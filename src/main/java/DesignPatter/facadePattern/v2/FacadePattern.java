package main.java.DesignPatter.facadePattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 13:57
 * @Version 1.0
 * <p>
 * l[an]mp 架构   Apache Nginx
 * <p>
 * mysql
 * <p>
 * python,php
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade f = new Facade();
        // 用户一，只想找
        f.addDeparment(new HouseTax()).addDeparment(new CarTax()).addDeparment(new PublicHouseMoney()).method();

    }
}

// 前台服务
class Facade {
    List<Department> departments = new ArrayList<>();

    public Facade addDeparment(Department department) {
        this.departments.add(department);
        return this;
    }

    public void method() {
        for (Department department : departments) {
            department.doit();
        }
    }
}


abstract class Department {
    abstract public void doit();
}

// 车税
class CarTax extends Department {

    @Override
    public void doit() {
        System.out.println("处理了车税............");
    }
}

// 屋税
class HouseTax extends Department {
    @Override
    public void doit() {
        System.out.println("处理了层税..........");
    }
}

// 公积金
class PublicHouseMoney extends Department {
    @Override
    public void doit() {
        System.out.println("处理了公积金..........");
    }
}

