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
     * Search and returns node containing key
     * @param key : key is an int being searched for which is associated with some data of type String. 
     * @return A Node which holds this key. 
     */ 
    public Node find(int key) {
        Node current = this.root;                          // initialize variable current to root Node  
        while ( current.key != key ) {                     // while Node searches for key value 
            if ( key < current.key ) {                     // if param key is less than current Node's key value 
                current = current.leftChild;               // take left path to check left child Node
            } else {                                       // if param key is greater than current Node's key value
                current = current.rightChild;              // take right path to check right child Node
            }
            if ( current == null ) {                       // key has not been found, return's null 
                return null;
            }
        }
        return current;                                    // Node with key's value has been found, return this Node 
    }

    /**
     * Inserts Node in Tree 
     * @param key : int key Node should contain
     * @param data : String data associated with key 
     */ 
    public void insert(int key, String data) {
        Node newNode = new Node();                       // instantiates new Node 
        newNode.key = key;                               // inserts key into Node 
        newNode.data = data;                             // inserts data into Node
        if ( this.root == null ) {                       // if root Node is empty, Node becomes root 
            root = newNode;                        
        } else {                                         // root Node is not empty 
            Node current = this.root;                    // variable current of type Node becomes root 
            Node parent;                                 // instantiate variable parent of type Node 
            while ( true ) {                             // continue until Node is inserted 
                parent = current;                        // parent Node becomes root Node 
                if ( key < current.key ) {               // if key value is less than current Node's key 
                    parent.leftChild = newNode;          // Node becomes leftChild Node of parent 
                    return;                              // Node has been inserted, ends routine
                } else {                                 // Node is greater than current Node's key 
                    current = current.rightChild;        // else go to right Node 
                    if ( current == null ) {             // current Node is empty 
                        parent.leftChild = newNode;      // parent's leftNode becomes new Node 
                        return;                          // end routine
                    }
                }
            }
        }
    }
}
