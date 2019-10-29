package com.yin.pattern.proxy.spring.aop_config;

/**
 * Created by Administrator on 2019/10/29.
 */
public class TimeProxy {

    public void before() {
        System.out.println("this is the before method");
    }

    public void after() {
        System.out.println("this is the after method");
    }
}
