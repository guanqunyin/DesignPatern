package com.yin.pattern.bridge;

/**
 * Created by Administrator on 2019/11/5.
 */
public class ColdGift extends Gift {

    public ColdGift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
