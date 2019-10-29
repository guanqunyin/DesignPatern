package com.yin.pattern.factory.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourserFactory courserFactory = new CourserFactory();
        ICourse java = courserFactory.create("java");
        java.record();
    }
}
