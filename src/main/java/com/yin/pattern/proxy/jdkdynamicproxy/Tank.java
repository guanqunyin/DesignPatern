package com.yin.pattern.proxy.jdkdynamicproxy;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/10/28.
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank move kalakala");
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
