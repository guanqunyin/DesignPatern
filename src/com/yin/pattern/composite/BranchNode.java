package com.yin.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node{

    private List<Node> nodeList = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        nodeList.add(node);
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    @Override
    void p() {
        System.out.println(name);
    }




}
