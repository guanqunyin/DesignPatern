package com.yin.pattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/10/28.
 */
public class TankTimeHandler implements InvocationHandler{

    private Movable movable;

    public TankTimeHandler(Movable movable){
        this.movable = movable;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long before = System.currentTimeMillis();
        System.out.println("before time: " + before);
        method.invoke(movable, null);
        long end  = System.currentTimeMillis();
        System.out.println("end time: " + end);
        System.out.println("Time elapsed: " + (end - before));
        return null;
    }
}
