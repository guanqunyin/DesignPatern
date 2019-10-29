package com.yin.pattern.yinfactory.abstractfactory;

/**
 * Created by Administrator on 2019/10/20.
 */
public class Main {

    public static void main(String[] args) {
        //1. 最原始的调用
        /*Car c = new Car();
        c.go();
        Bread bread = new Bread();
        bread.printName();
        Ak47 ak47 = new Ak47();
        ak47.shoot();*/

        //2. 使用抽象工厂方法之后一个产品族的概念，换一个产品族只需要换一个工厂就ok了
        AbstractFactory factory = new MuggleFactory();
        Vihicle c = factory.createVihicle();
        c.go();
        Food food = factory.createFood();
        food.printName();
        Weanpon weanpon = factory.createWeapon();
        weanpon.shoot();

    }
}
