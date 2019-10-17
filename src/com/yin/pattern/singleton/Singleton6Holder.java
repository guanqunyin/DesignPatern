package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 * 静态内部类的方式，加载外部类的时候，内部类不会被加载。
 */
public class Singleton6Holder {

    private Singleton6Holder(){}

    private static class Singleton6{
        private static final Singleton6 singleton6 = new Singleton6();
    }

    public Singleton6 getInstance() {
        return Singleton6.singleton6;
    }


}
