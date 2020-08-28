package com.morris.datastructures;

/**
 * This is a Generic Tree class which is mostly created to work in conjunction with a the generic Node class that looks for a key of type int that's 
 * coupled with data of type String. This String can be anything, a quote, a name, a job, a book title, anything. The general purpose is to search for 
 * an id, the key, and return whatever data is associated with that key. 
 * 
 * @author Wali Morris 
 * @since 08/30/2020
 */ 

public class Tree {
    private Node root;

    /**
     * @param key : key is an int being searched for which is associated with some data of type String. 
     * @return A Node which holds this key. 
     */ 
    public Node find(int key) {
        Node current = this.root;                  // initialize variable current to root Node  
        while (current.key != key) {               // while Node searches for key value 
            if (key < current.key) {               // if param key is less than current Node's key value 
                current = current.leftChild;       // take left path to check left child Node
            } else {                               // if param key is greater than current Node's key value
                current = current.rightChild;      // take right path to check right child Node
            }
            if (current == null) {.                // key has not been found, return's null 
                return null;
            }
        }
        return current;                            // Node with key's value has been found, return this Node 
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
