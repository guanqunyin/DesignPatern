package com.yin.pattern.yinfactory.abstractfactory.NormalHuman;

/**
 * Created by Administrator on 2019/10/20.
 */
public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.go();
        Bread bread = new Bread();
        bread.printName();
        Ak47 ak47 = new Ak47();
        ak47.shoot();
    }
}
