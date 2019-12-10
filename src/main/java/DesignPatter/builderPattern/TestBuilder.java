package main.java.DesignPatter.builderPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:17
 * @Version 1.0
 */
public class TestBuilder {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder.buildCpu().buildMemory().buildBoard().build();

        System.out.println(computer);

    }
}
