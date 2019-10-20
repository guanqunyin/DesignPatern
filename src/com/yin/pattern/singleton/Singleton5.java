package com.yin.pattern.singleton;

import java.io.*;

/**
 * Created by Administrator on 2019/10/17.
 * 饿汉式双重锁
 */
public class Singleton5 implements Cloneable, Serializable{


    private Singleton5(){
        if (null != singleton5) {
            throw new RuntimeException();
        }
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singleton5;
    }

    public Object readResolve() {
        return singleton5;
    }



    public static void main(String[] args) throws Exception {
        //通过反射破坏单例模式
        System.out.println(Singleton5.getInstance());
        Object o = Singleton5.class.newInstance();
        System.out.println(o);

        //通过clone破坏单例模式, 解决方案，重写clone方法，直接返回单例对象
        Singleton5 singleton5 = Singleton5.getInstance();
        Object singleton5Cloned = singleton5.clone();
        System.out.println(singleton5);
        System.out.println(singleton5Cloned);
        // 通过序列化和反序列化破坏单例模式
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("tempfile"))){
            outputStream.writeObject(singleton5);
            outputStream.flush();
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("tempfile"))){
            Object object = inputStream.readObject();
            System.out.println(object);
        }
    }

}
