package com.yin.pattern.decorator;

import sun.java2d.pipe.SpanShapeRenderer;

public class CoatWoman extends SimpleWoman{

    private SimpleWoman simpleWoman;

    CoatWoman(SimpleWoman simpleWoman) {
        this.simpleWoman = simpleWoman;
    }


    public void print() {
        simpleWoman.print();
        System.out.println("穿上了大衣");
    }
}
