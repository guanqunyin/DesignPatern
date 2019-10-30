package com.yin.pattern.visitor;

public class Computer {

    public static void main(String[] args) {

    }

}

abstract class ComputerPart{

    abstract void accept();

    abstract double getPrice();


}

class CPU extends ComputerPart {

    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}

class Board extends ComputerPart {

    @Override
    void accept() {

    }

    @Override
    double getPrice() {
        return 0;
    }
}