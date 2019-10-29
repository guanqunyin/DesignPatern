package com.yin.pattern.strategy;

/**
 * Created by Administrator on 2019/10/20.
 */
public class Dog{

    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
