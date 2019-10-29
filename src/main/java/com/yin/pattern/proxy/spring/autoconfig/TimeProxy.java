package com.yin.pattern.proxy.spring.autoconfig;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Administrator on 2019/10/29.
 */
@Aspect
public class TimeProxy {

    @Before("execution(void com.yin.pattern.proxy.spring.autoconfig.Tank.move())")
    public void before() {
        System.out.println("this is the before method");
    }

    @After("execution(void com.yin.pattern.proxy.spring.autoconfig.Tank.move())")
    public void after() {
        System.out.println("this is the after method");
    }
}
