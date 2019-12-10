package main.java.DesignPatter.builderPattern;

/**
 * @author wangzhilei
 * @Version 1.0
 * @date 2019-12-09 09:09
 */
public class Computer {
    Cpu cpu = null;

    Memory memory = null;

    Board board = null;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", board=" + board +
                '}';
    }
}

class Cpu {
    String modal ;

    public Cpu(String modal) {
        this.modal = modal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "modal='" + modal + '\'' +
                '}';
    }
}

class Memory {
    String modal;

    public Memory(String modal) {
        this.modal = modal;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "modal='" + modal + '\'' +
                '}';
    }
}

class Board {
    String modal;

    public Board(String modal) {
        this.modal = modal;
    }

    @Override
    public String toString() {
        return "Board{" +
                "modal='" + modal + '\'' +
                '}';
    }
}
