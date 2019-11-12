package com.yin.pattern.visitor;

//内部的数据结构，被访问者
public class Computer {

    //固定的数据结构，基本不变，但根据不同的人有不同的内部实现，想要的话就可以加一个进去
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    //定义了开放访问的固定部分
    public void accept(Visitor visitor) {
        this.cpu.accept(visitor);
        this.memory.accept(visitor);
        this.board.accept(visitor);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        StudentVisitor studentVisitor = new StudentVisitor();
        computer.accept(studentVisitor);
        System.out.println(studentVisitor.price);

    }

}

//内部数据结构的抽象类
abstract class ComputerPart{

    abstract void accept(Visitor visitor);

    abstract double getPrice();

}

//内部数据结构的实现类
class CPU extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }

    @Override
    double getPrice() {
        return 2000;
    }
}

//内部数据结构的实现类
class Memory extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

//内部数据结构的实现类
class Board extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 1000;
    }
}

//访问者的接口
interface Visitor{

    void visitCPU(CPU cpu);

    void visitBoard(Board board);

    void visitMemory(Memory memory);
}


//访问者的实现类
class StudentVisitor implements Visitor{

    double price;

    @Override
    public void visitCPU(CPU cpu) {
        price = price + cpu.getPrice()*0.6;
    }

    @Override
    public void visitBoard(Board board) {
        price = price + board.getPrice()*0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        price = price + memory.getPrice()*0.6;
    }
}