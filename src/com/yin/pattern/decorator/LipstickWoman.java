package com.yin.pattern.decorator;

class LipstickWoman extends SimpleWoman {

    private SimpleWoman simpleWoman;

    public LipstickWoman() {

    }

    LipstickWoman(SimpleWoman simpleWoman) {
        this.simpleWoman = simpleWoman;
    }

    public void print() {
        simpleWoman.print();
        System.out.println("擦了口红");
    }
}
