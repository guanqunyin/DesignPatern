package com.yin.pattern.composite;

public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");

        Node node1 = new LeafNode("leaf1");
        Node node2 = new LeafNode("leaf2");
        BranchNode branch1 = new BranchNode("branch1");
        Node node3 = new LeafNode("leaf3");
        Node node4 = new LeafNode("leaf4");
        branch1.addNode(node3);
        branch1.addNode(node4);

        root.addNode(node1);
        root.addNode(node2);
        root.addNode(branch1);

        Node.getNodes(root);
    }
}
