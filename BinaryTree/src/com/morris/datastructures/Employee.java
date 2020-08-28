package com.morris.datastructures;

/** 
 * This is an employee class that we'll eventually use with a EmployeeTree. Each Employee has an id number which references a job title. 
 * The EmployeeTree will use the id to find out what is the job of the Employee it's looking for. We could even expand more on this and 
 * search for a specific job title to look for an Employee that fits into our desired job search. Employee will be expanded to include the
 * Employee's name, e-mail, and technologies. There's endless possibilities, so let's just mess around. 
 * 
 * @author Wali Morris
 * @since 08/30/2020
 */ 

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
