package com.morris.datastructures;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee(56474, "Programmer");
        Employee em2 = new Employee(76464, "Data Analyst");
        Employee em3 = new Employee(32424, "Engineer Manager");


        Tree binaryTree = new Tree();
        binaryTree.insert(3, "Programmer");
        binaryTree.insert(12, "Data Scientist");
        binaryTree.insert(5, "Engineer Manager");

        Node job = binaryTree.find(3);
        if (job != null) {
            System.out.println("The Job is: " + job.data);
        } else {
            System.out.println("The Job was not found!");
        }
    }
}

