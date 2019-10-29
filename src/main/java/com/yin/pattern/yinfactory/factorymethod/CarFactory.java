package com.yin.pattern.yinfactory.factorymethod;

/**
 * Created by Administrator on 2019/10/20.
 * 在产品维度上进行扩展
 */
public class CarFactory {

    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }


}
