package com.yin.pattern.yinfactory.abstractfactory;

/*
    在产品一族进行灵活的扩展
 */
public abstract class AbstractFactory {

    abstract Vihicle createVihicle();

    abstract Food createFood();

    abstract Weanpon createWeapon();


}
