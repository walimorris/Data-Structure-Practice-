package com.morris.datastructures;

public class Tree {
    private Node root;

    public Node find(int key) {
        Node current = this.root;
        while (current.key != key) {
            if (key < current.key) {
                current = current.leftChild; // check left child
            } else {
                current = current.rightChild; // check right
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int key, String data) {
        Node newNode = new Node();
        newNode.key = key;
        newNode.data = data;
        if (this.root == null) {
            root = newNode;
        } else {
            Node current = this.root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    parent.leftChild = newNode;
                    return;
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
            }
        }
    }
}

