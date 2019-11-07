package com.yin.pattern.state.v2;

public class MMHappyState extends MMState{
    @Override
    void smile() {
        System.out.println("MM smile");
    }

    @Override
    void cry() {
        System.out.println("MM cry");
    }

    @Override
    void say() {
        System.out.println("MM say");
    }
}
