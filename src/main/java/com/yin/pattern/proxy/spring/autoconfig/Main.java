package com.yin.pattern.proxy.spring.autoconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/10/29.
 *
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("app_auto.xml");
        Tank tank = (Tank)classPathXmlApplicationContext.getBean("tank");
        tank.move();
    }
}
