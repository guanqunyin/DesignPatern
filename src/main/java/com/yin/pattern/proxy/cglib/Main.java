package com.yin.pattern.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/10/28.
 */
public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.move();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TankTimeMethodInterceptor());
        Tank tank1 = (Tank) enhancer.create();
        tank1.move();
    }
}

class TankTimeMethodInterceptor implements org.springframework.cglib.proxy.MethodInterceptor{


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long before = System.currentTimeMillis();
        System.out.println("before: " + before);
        methodProxy.invokeSuper(o, objects);
        long after = System.currentTimeMillis();
        System.out.println("after: " + after);
        return null;
    }
}

class Tank {

    public void move() {
        System.out.println("tank goes calacala");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
