package com.company;

public class Tree {
    Node root=new Node(25);
    public void add(int value) {
        addRecursive(root, value);
    }

    private void addRecursive(Node node, int value) {
        if (value <= node.value) {
        if (node.left == null) {
            node.left = new Node(value);
            return;
        }
        addRecursive(node.left, value);
        }
        else {
        if (node.right == null ) {
            node.right = new Node(value);
            return;
        }
        addRecursive(node.right, value);
        }
    }

    public void print() {
        printRecursive(root);
    }

    private void printRecursive(Node node) {
        if (node.left != null) {
            printRecursive(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            printRecursive(node.right);
        }
    }
}


