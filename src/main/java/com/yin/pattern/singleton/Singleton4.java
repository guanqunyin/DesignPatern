package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 * 懒汉式单重锁
 */
public class Singleton4 {

    //构造器私有化
    private Singleton4() {}

    private static Singleton4 singleton4;

    public static synchronized Singleton4 getInstance() {
        if (singleton4 == null) {
            singleton4 = new Singleton4();
        }

        return singleton4;
    }
}
