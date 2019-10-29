package com.yin.pattern.iterator;

/**
 * Created by Administrator on 2019/10/29.
 */
public class MyLinkedList<E> implements Collection<E>{

    private Node<E> head;

    private Node<E> tail;

    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<E>(e, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }



    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    private class LinkedListIterator<E> implements Iterator<E> {

        Node<E> currentNode = (Node<E>) head;

        @Override
        public boolean hasMore() {
            return currentNode != null;
        }

        @Override
        public E next() {
            if (currentNode != null) {
                Node node = currentNode;
                currentNode = node.next;
                return (E) node.e;
            }
            return null;


        }
    }

    private static class Node<E> {

        E e;

        Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;

        }

    }
}
