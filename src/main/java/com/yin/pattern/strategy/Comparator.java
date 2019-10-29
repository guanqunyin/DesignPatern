package com.yin.pattern.strategy;

/**
 * Created by Administrator on 2019/10/20.
 * 定义了一个接口，如何比较两个实体类
 */
public interface Comparator<T> {

    int compareTo(T o1, T o2);
}
