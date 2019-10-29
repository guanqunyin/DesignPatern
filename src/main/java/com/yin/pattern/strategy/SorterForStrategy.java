package com.yin.pattern.strategy;

/**
 * Created by Administrator on 2019/10/20.
 * 排序
 */
public class SorterForStrategy<T> {

    /*
        定义了如何排序一个数组， 传入一个数组和比较器，比如DogComaparator1, DogComparator2
     */
    public  void  sort(T[] arr, Comparator<T> comparator) {

        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = comparator.compareTo(arr[j], arr[minPos])==-1 ? j: minPos;
            }
            swap(arr, i, minPos);
        }
    }

     void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
