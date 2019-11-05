package com.yin.pattern.bridge;

/**
 * Created by Administrator on 2019/11/5.
 */
public class WarmGift extends Gift{

    public WarmGift(GiftImpl giftImpl) {
        this.giftImpl = giftImpl;
    }
}
