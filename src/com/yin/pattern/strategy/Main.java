package com.yin.pattern.strategy;

import java.util.Arrays;

/**
 * Created by Administrator on 2019/10/20.
 */
public class Main {

    public static void main(String[] args) {
/*        Cat[] cats = {new Cat(5,5),
                new Cat(3,3),
                new Cat(1,1),
                new Cat(7,7),
                new Cat(6,6)};
        Sorter.sort(cats);
        System.out.println(Arrays.toString(cats));*/
        Dog[] dogs = {new Dog(10), new Dog(5), new Dog(3)};
        //策略一：
        DogComparator1 dogComparator1 = new DogComparator1();

        SorterForStrategy<Dog> sorterForStrategy = new SorterForStrategy<>();
        sorterForStrategy.sort(dogs, dogComparator1);
        System.out.println(Arrays.toString(dogs));

        //策略二：
        DogComparator2 dogComparator2 = new DogComparator2();
        sorterForStrategy.sort(dogs, dogComparator2);
        System.out.println(Arrays.toString(dogs));
    }
}
