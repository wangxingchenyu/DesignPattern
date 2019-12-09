package main.java.DesignPatter.visitorPattern.v1;

/**
 * @Author: zhilei.wang
 * @Date: 2019/12/6 9:08
 * @Version 1.0
 */
public class Computer {
    Cpu cpu = new Cpu();
    Memory memory = new Memory();
    Board board = new Board();

    public void accept(Visitor visitor) {
        this.cpu.accept(visitor);
        this.memory.accept(visitor);
        this.board.accept(visitor);
    }

    public static void main(String[] args) {
        // Student Buy FinalPrice
        StudentVisitor studentVisitor = new StudentVisitor();
        Computer computer = new Computer();
        computer.accept(studentVisitor);
        System.out.println("Student's totalPrice " + studentVisitor.totalPrice);

        // Company Buy FinalPrice
        CompanyVisitor companyVisitor = new CompanyVisitor();
        computer.accept(companyVisitor);
        System.out.println("Company's totalPrice " + companyVisitor.totalPrice);

    }

}


interface Visitor {
    void visitCpu(Cpu cpu);

    void visitMem(Memory memory);

    void visitBoard(Board board);
}

// StudentShopper
class StudentVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMem(Memory memory) {
        totalPrice += memory.getPrice() * 0.95;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.7;
    }
}

// CompanyShopper
class CompanyVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMem(Memory memory) {
        totalPrice += memory.getPrice() * 0.5;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.4;
    }
}


// 定义Computer 组件内容 有accept 我来接收Visitor
abstract class ComputerPart {
    abstract void accept(Visitor v);

    abstract double getPrice();
}

class Cpu extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 300.0;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitMem(this);
    }

    @Override
    double getPrice() {
        return 120.0;
    }
}


class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 2000.0;
    }
}
