package com.yin.pattern.proxy.staticproxy;

/**
 * Created by Administrator on 2019/10/28.
 */
public class TankTimeProxy implements Movable{

    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long before = System.currentTimeMillis();
        System.out.println("before is: " + before);
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("end is: " + end);
        System.out.println("Time waste: " + (end-before));
    }
}
