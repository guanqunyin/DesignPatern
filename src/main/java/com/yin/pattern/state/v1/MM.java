package com.yin.pattern.state.v1;

/*
 * 当增加新的状态时，非常不方便
 */
public class MM {

    String name;
    private enum MMState{HAPPY, SAD}

    MMState state;

    public void smile() {
        //switch case
    }

    public void cry() {
        //switch case
    }


}
