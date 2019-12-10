package main.java.DesignPatter.templateMethodPattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 10:35
 * @Version 1.0
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        DayLiftProcess xiaomingSchedule= new Xiaoqiang() ;
        xiaomingSchedule.startOneDay();

    }
}


abstract class DayLiftProcess {

    public void startOneDay() {
        wakeUp();
        shuya();
        goToWork();
        xiaban();
    }


    public void wakeUp() {
        System.out.println("wake up.............");
    }

    public void shuya() {
        System.out.println("shuya................");
    }

    public abstract void goToWork();


    public void xiaban() {
        System.out.println("xiaban..........");
    }

}

class Xiaoming extends DayLiftProcess {

    @Override
    public void goToWork() {
        System.out.println("xiaoming go to work");
    }
}


class Xiaoqiang extends DayLiftProcess {

    @Override
    public void goToWork() {
        System.out.println("xiaoqiang go to work.......");
    }
}





