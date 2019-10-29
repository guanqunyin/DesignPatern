package com.yin.pattern.composite;

public abstract class Node {

    protected String name;

    abstract void p();

    @Override
    public String toString() {
        return name;
    }

    public static void getNodes(Node node) {
        System.out.println(node);
        if (node instanceof BranchNode) {
            BranchNode branchNode = (BranchNode) node;
            if (branchNode.getNodeList() != null) {
                for(Node node1 : branchNode.getNodeList()) {
                    getNodes(node1);
                }
            }
        }

    }
}
