package com.yin.pattern.singleton;

/**
 * Created by Administrator on 2019/10/17.
 * 饿汉式双重锁
 */
public class Singleton5 {

    private Singleton5(){}

    private static volatile Singleton5 singleton5;

    public static Singleton5 getInstance() {
        if (singleton5 == null) {
            synchronized (Singleton5.class) {
                if (singleton5 == null)
                    singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }

    public static void main(String[] args) throws Exception {
        //通过反射破坏单例模式
        Object o = Singleton5.class.newInstance();
        System.out.println(Singleton5.getInstance());
        System.out.println(o);

        //TODO 通过反射破坏单例模式
        //TODO 通过clone破坏单例模式
        //TODO 通过序列化和反序列化破坏单例模式
    }

}
