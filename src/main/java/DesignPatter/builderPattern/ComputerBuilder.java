package main.java.DesignPatter.builderPattern;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/9 9:11
 * @Version 1.0
 */
public class ComputerBuilder {
    Computer computer = new Computer();

    public ComputerBuilder buildCpu() {
        computer.cpu = new Cpu("I7");
        return this;
    }

    public ComputerBuilder buildMemory() {
        computer.memory = new Memory("代");
        return this;
    }

    public ComputerBuilder buildBoard() {
        computer.board = new Board("xxx");
        return this;
    }

    /**
     * 最终执行构建
     *
     * @return
     */
    public Computer build() {
        return computer;
    }


}
