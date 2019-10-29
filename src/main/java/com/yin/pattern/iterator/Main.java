package com.yin.pattern.iterator;

/**
 * Created by Administrator on 2019/10/29.
 */
public class Main {

    public static void main(String[] args) {
        Collection<String> collection = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add("array" + i);
        }
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasMore()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("================================");
        Collection<String> linkedCollection = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedCollection.add("link" + i);
        }
        System.out.println(linkedCollection.size());
        Iterator<String> linkedIterator = linkedCollection.iterator();
        while (linkedIterator.hasMore()) {
            String next = linkedIterator.next();
            System.out.println(next);
        }


    }
}
