package com.yin.pattern.visitor;

public class Computer {

    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

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

abstract class ComputerPart{

    abstract void accept(Visitor visitor);

    abstract double getPrice();

}

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

interface Visitor{

    void visitCPU(CPU cpu);

    void visitBoard(Board board);

    void visitMemory(Memory memory);
}

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