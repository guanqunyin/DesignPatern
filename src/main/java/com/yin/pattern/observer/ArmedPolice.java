package com.yin.pattern.observer;

public class ArmedPolice extends PoliceMan{

    public ArmedPolice(String name) {
        this.name = name;
    }

    @Override
    void actionAfterNotified(EscapeFromPrisonEvent escapeFromPrisonEvent) {
        System.out.println("武警:"+name+"接到了通知，准备出动武装人员");
    }
}
