package com.yin.pattern.observer;

//监狱长
public class Warden extends PoliceMan{

    public Warden(String name) {
        this.name = name;
    }

    @Override
    void actionAfterNotified(EscapeFromPrisonEvent escapeFromPrisonEvent) {
        System.out.println("监狱长: " + name + "接到了通知并且准备赶往监狱");
    }
}
