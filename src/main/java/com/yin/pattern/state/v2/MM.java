package com.yin.pattern.state.v2;

public class MM {

    MMState mmState;

    public void smile() {
        mmState.smile();
    }

    public void cry() {
        mmState.cry();
    }

    public void say() {
        mmState.say();
    }


    public static void main(String[] args) {
        MMState mmState = new MMNerverousState();
        mmState.smile();
        mmState.cry();
        mmState.say();
    }
}
