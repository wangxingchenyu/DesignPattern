package TestZuhe;

class Cpu {
    public void cpu() {
        System.out.println("cpu........");
    }
}

class Memory {
    public void memory() {
        System.out.println("memory.......");
    }
}

class HardWear {
    public void hard() {
        System.out.println("hard.......");
    }
}

class Computer {
    Cpu cpu;
    Memory memory;
    HardWear hard;

    public void showInfo() {
        cpu.cpu();
        memory.memory();
        hard.hard();
    }

    //静态方法里面如果想访问实例，则要进行实例化
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cpu = new Cpu();
        computer.memory = new Memory();
        computer.hard = new HardWear();
        computer.showInfo();
    }

}


public class TestZUh {
    public static void main(String[] args) {
        System.out.println();
        Computer com = new Computer();

    }
}
