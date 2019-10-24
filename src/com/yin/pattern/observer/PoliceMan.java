package com.yin.pattern.observer;

public abstract class PoliceMan {

    protected String name;

    protected void printName() {
        System.out.println("这是： " + name);
    }

    protected void notifyPoliceMan() {
        System.out.println(name + "被通知了");
        EscapeFromPrisonEvent escapeFromPrisonEvent = new EscapeFromPrisonEvent();
        escapeFromPrisonEvent.location = "一号房间";
        escapeFromPrisonEvent.timestamp = System.currentTimeMillis();
        System.out.println("犯人在"+escapeFromPrisonEvent.location+ "时间："+escapeFromPrisonEvent.timestamp);
        actionAfterNotified(escapeFromPrisonEvent);
    }

    abstract void actionAfterNotified(EscapeFromPrisonEvent escapeFromPrisonEvent);
}
