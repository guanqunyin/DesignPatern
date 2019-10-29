package com.yin.pattern.strategy;

/**
 * Created by Administrator on 2019/10/20.
 * 狗的第一个比较器，实现了比较器接口
 */
public class DogComparator1 implements Comparator<Dog>{

    @Override
    public int compareTo(Dog dog1, Dog dog2) {
        if (dog1.getFood() < dog2.getFood()) return -1;
        else if (dog1.getFood() > dog2.getFood()) return 1;
        else return 0;
    }
}
