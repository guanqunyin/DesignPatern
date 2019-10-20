package com.yin.pattern.strategy;

/**
 * Created by Administrator on 2019/10/20.
 */
public class DogComparator2 implements Comparator<Dog> {
    @Override
    public int compareTo(Dog o1, Dog o2) {
        if (o1.getFood() < o2.getFood()) return 1;
        else if (o1.getFood() > o2.getFood()) return -1;
        else   return 0;
    }
}
