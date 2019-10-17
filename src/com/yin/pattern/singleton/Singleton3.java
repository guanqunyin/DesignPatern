package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 * 懒汉式， 用到再初始化该实例
 */
public class Singleton3 {

    private Singleton3(){}

    private static Singleton3 singleton3;

    public static Singleton3 getInstance() {
        if (singleton3 == null)
            singleton3 = new Singleton3();
        return singleton3;
    }

}
