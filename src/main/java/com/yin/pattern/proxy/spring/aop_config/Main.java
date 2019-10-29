package com.yin.pattern.proxy.spring.aop_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/10/29.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("app.xml");
        Tank tank = (Tank)classPathXmlApplicationContext.getBean("tank");
        tank.move();
    }
}
