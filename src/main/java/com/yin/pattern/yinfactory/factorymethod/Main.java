package com.yin.pattern.yinfactory.factorymethod;

/**
 * Created by Administrator on 2019/10/20.
 */
public class Main {

    public static void main(String[] args) {
        Moveable c = new Plane();
        c.go();
    }
}
