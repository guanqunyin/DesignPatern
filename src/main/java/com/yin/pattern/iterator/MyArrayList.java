package com.yin.pattern.iterator;

/**
 * Created by Administrator on 2019/10/29.
 */
public class MyArrayList<E> implements Collection<E>{

    private static Object[] data = new Object[10];

    private int size = 0;



    @Override
    public void add(E e) {
        if (size == data.length) {
            Object[] newData = new Object[data.length*2];
            System.arraycopy(data, 0, newData,0, size);
            data = newData;
        }
        data[size] = e;
        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    public Iterator<E> iterator() {
        return new ArrayListIterator<>();
    }

    private class ArrayListIterator<E> implements Iterator<E>{

        private int currentIndex = 0;

        @Override
        public boolean hasMore() {
            return currentIndex<size;
        }

        @Override
        public E next() {
            int oldIndex = currentIndex;
            currentIndex++;
            return (E) data[oldIndex];
        }
    }
}
