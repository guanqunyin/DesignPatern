package com.yin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Criminal {

    protected String name;

    protected List<PoliceMan> policeManList = new ArrayList<>();

    public void registerObservers(PoliceMan policeMan) {
        System.out.println("准备注册一个police:" + policeMan.name);
        policeManList.add(policeMan);
    }

    public void notifyAllPoliceMan() {
        for (PoliceMan policeMan: policeManList) {
            policeMan.notifyPoliceMan();
        }
    }

}
