package com.yin.pattern.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2019/10/28.
 */
public class Main {

    public static void main(String[] args) {
        final Tank tank = new Tank();
        /*Movable movable = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before jdk proxy" );
                        method.invoke(tank, null);
                        System.out.println("after jdk proxy");
                        return null;
                    }
                });*/
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable movable = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class},
                new TankTimeHandler(tank));
        movable.move();

    }
}
