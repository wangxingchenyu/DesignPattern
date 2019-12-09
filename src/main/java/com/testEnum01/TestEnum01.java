package testEnum01;

/**
 * @Author: husToy.Wang
 * @Date: 2019/11/4 10:58
 * @Version 1.0
 */
public class TestEnum01 {
    public static void main(String[] args) {

        Signal signal = Signal.GREEN;

        switch (signal) {
            case RED:
                System.out.println("red...........");
                break;
            case BLACK:
                System.out.println("black............");
                break;
            case GREEN:
                System.out.println("green...............");
                break;
        }


    }
}


enum Signal {
    RED,
    GREEN,
    BLACK
}


