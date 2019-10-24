package com.yin.pattern.chainofresponsibilitybyguanqun;

public class MyRequest {

    private String name;

    public MyRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
