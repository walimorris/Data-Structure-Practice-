package com.morris.datastructures;

public class Employee {
    private int id;
    private String job;

    public Employee(int id, String job) {
        this.id = id;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public String getJob() {
        return job;
    }
}
