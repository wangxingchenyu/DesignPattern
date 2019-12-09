package main.java.DesignPatter.ProxyPattern.v1;

import java.util.Random;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/4 15:13
 * @Version 1.0
 */
public class Tank implements Moveable {

    public static void main(String[] args) {

        TankLogProxy tankLogProxy = new TankLogProxy(new TankTimeProxy(new Tank()));
        tankLogProxy.move();

    }


    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class TankTimeProxy implements Moveable {

    Moveable moveable;

    public TankTimeProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        moveable.move();
        long end = System.currentTimeMillis();
        System.out.println("timeDel :" + (end - start));
    }
}


class TankLogProxy implements Moveable {

    Moveable moveable;

    public TankLogProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("before log");
        moveable.move();
        System.out.println("after log");
    }
}
