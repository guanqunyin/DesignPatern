package com.yin.pattern.proxy.staticproxy;

/**
 * Created by Administrator on 2019/10/28.
 */
public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();
//        tank.move();
        Movable tankTimeProxy = new TankLogProxy(new TankTimeProxy(tank));
        tankTimeProxy.move();
    }
}
