package com.yin.pattern.bridge;

/**
 * Created by Administrator on 2019/11/5.
 */
public class Main {

    public static void main(String[] args) {
        Gift gift = new WarmGift(new Flower());
    }
}
