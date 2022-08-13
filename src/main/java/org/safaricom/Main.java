package org.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("The employees are as below:");

        Employee EK1 = new Employee("Nereah Athiambo", "Customer Service department", "CS Manager", "Managing The Department.");

        Employee EK2 = new Employee("Damian Kitevu", "Customer Service Department", "Team Leader", "Handling Escalations.");

        Employee EK3 = new Employee("Sharon Apot", "Customer Service Department", "Stock Controller", "Inventory Management.");

        Employee EK4 = new Employee("Eric Metho", "Customer Service Department", "Sales Agent", "Handling Sales.");

        Employee EK5 = new Employee("Gloria rop", "Customer Service Department", "Customer Executive", "Customer Service.");

        Employee EK6 = new Employee("Athman Ahmed", "Human Resource Department", "HR Business Partner", "Handling Staff issues.");

        Employee EK7 = new Employee("Anne Njuguna", "Human Resource Department", "Payroll Officer", "Compensation and Benefits. ");


        EK1.display();
        EK2.display();
        EK3.display();
        EK4.display();
        EK5.display();
        EK6.display();
        EK7.display();
        EK8.display();

        System.out.println("We have two departments; 1. Customer Service Department , 2. Human Resource Department . Which one do you want to view?");

        Scanner scan = new Scanner(System.in);
        System.out.print("Choose 1 or 2: ");

        // This method reads the number provided using keyboard
        int selection = scan.nextInt();

        if (selection == 1){

            System.out.println("The Customer Service Department Employees are as below:");
            EK1.display();
            EK2.display();
            EK3.display();
            EK4.display();
            EK5.display();

        } else if (selection ==2) {
            System.out.println("Human Resource Department Employees are as below:");
            EK6.display();
            EK7.display();
            EK8.display();

        } else {
                System.out.println("INVALID!!!  Run program again and Please Enter 1 or 2!!!!");
            }

        }

    }
