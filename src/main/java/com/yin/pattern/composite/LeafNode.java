package com.yin.pattern.composite;

import java.util.Objects;

public class LeafNode extends Node{

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    void p() {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeafNode leafNode = (LeafNode) o;
        return Objects.equals(name, leafNode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
