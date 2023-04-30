package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Admin;
import com.example.domain.Director;

public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeStockPlan esp = new EmployeeStockPlan();
        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        
        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        // Print information about the objects you created
        printEmployee(eng);
        System.out.println("stockOption :"+esp.grantStock(eng)+"\n");
        printEmployee(adm);
        System.out.println("stockOption :"+esp.grantStock(adm)+"\n");
        printEmployee(mgr);
        System.out.println("stockOption :"+esp.grantStock(mgr)+"\n");
        printEmployee(dir);
        System.out.println("stockOption :"+esp.grantStock(dir)+"\n");

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName ("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        printEmployee(mgr);

    }

    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: " +
                emp.getClass().getSimpleName()+"\n"+emp);

    }
}