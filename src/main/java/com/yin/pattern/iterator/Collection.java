package com.yin.pattern.iterator;

/**
 * Created by Administrator on 2019/10/29.
 */
public interface Collection<E> {

    void add(E e);

    int size();

    Iterator<E> iterator();

}
