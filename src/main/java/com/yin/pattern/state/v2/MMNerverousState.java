package com.yin.pattern.state.v2;

public class MMNerverousState extends MMState{
    @Override
    void smile() {
        System.out.println("nervous smile");
    }

    @Override
    void cry() {
        System.out.println("nervous cry");
    }

    @Override
    void say() {
        System.out.println("nervous say");
    }
}
