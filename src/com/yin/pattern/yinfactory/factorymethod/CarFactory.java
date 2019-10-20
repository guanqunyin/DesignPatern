package com.yin.pattern.yinfactory.factorymethod;

/**
 * Created by Administrator on 2019/10/20.
 */
public class CarFactory {

    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }


}
