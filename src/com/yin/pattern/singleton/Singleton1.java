package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 * 饿汉式
 * 类一加载的时候singleton1就已经实例化
 */
public class Singleton1 {

    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1(){}

    public Singleton1 getInstance() {
        return singleton1;
    }

    public static void main(String[] args) {

    }
}
