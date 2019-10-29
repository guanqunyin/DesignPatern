package com.yin.pattern.decorator;

class LongHairWoman extends SimpleWoman{

    private SimpleWoman simpleWoman;

    LongHairWoman() {

    }

    public LongHairWoman(SimpleWoman simpleWoman) {
        this.simpleWoman = simpleWoman;
    }

    public void print() {
        simpleWoman.print();
        System.out.println("长头发");
    }

}
