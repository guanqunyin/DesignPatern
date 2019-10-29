package com.yin.pattern.iterator;

/**
 * Created by Administrator on 2019/10/29.
 */
public interface Iterator<E> {

    boolean hasMore();

    E next();
}
