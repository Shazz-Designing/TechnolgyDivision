package org.safaricom;

public class Employee {

    String name;
    String department;
    String role;
    String responsibilities;

    Employee (String name, String department, String role, String responsibilities){
        this.name = name;
        this.department = department;
        this.role = role;
        this.responsibilities =responsibilities;
    }
    public void display() {
        System.out.println(" NAME: "+this.name  + " , DEPARTMENT:" + this.department + " , ROLE: " + this.role + ", RESPONSIBILITIES: " + this.responsibilities);
    }

}
