package com.yin.pattern.templatemethod;

public class Main {

    public static void main(String[] args) {

        Father father = new Child();
        father.m();
    }
}

abstract class Father{

    void m(){
        action1();
        action2();
    }

    abstract void action1();

    abstract void action2();

}

class Child extends Father{

    @Override
    void action1() {
        System.out.println("this is action1 of child");
    }

    @Override
    void action2() {
        System.out.println("this is action2 of child");
    }
}
