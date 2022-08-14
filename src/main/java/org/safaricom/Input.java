package org.safaricom;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new Employee Name: ");
        String nEmpName = input.next();
        System.out.println("Enter new Employee Department: ");
        String nEmpDept = input.next();
        System.out.println("Enter new Employee Role: ");
        String nEmpRole = input.next();
        System.out.println("Enter new Employee Responsibilities: ");
        String nEmpResp = input.next();
        System.out.println("Record Saved");
    }
}
