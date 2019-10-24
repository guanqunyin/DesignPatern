package com.yin.pattern.observer;

public abstract class PoliceMan {

    protected String name;

    protected void printName() {
        System.out.println("这是： " + name);
    }

    protected void notifyPoliceMan() {
        System.out.println(name + "被通知了");
        actionAfterNotified();
    }

    abstract void actionAfterNotified();
}
