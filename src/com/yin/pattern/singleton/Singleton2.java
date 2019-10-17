package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 */
public class Singleton2 {

    private Singleton2(){}

    private static final Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return singleton2;
    }



}
