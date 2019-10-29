package com.yin.pattern.proxy.staticproxy;

/**
 * Created by Administrator on 2019/10/28.
 */
public class TankLogProxy implements Movable{

    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("log: the tank log start");
        movable.move();
        System.out.println("log: the tank log end");
    }
}
