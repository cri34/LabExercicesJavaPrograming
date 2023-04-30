package com.example;

import com.example.domain.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Enginer e = new Enginer(101,"Jane Smith","012-34.5678",120_345.27);
        Manager m = new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Admin a = new Admin(304,"Bill Monroe","108-23-6509",75_002.34);
        Director d = new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Globak Marketing",1_000_000.00);
        printEmployee(e);
        printEmployee(m);
        printEmployee(a);
        printEmployee(d);

        m.addEmployee(e);
        m.addEmployee(d);
        m.addEmployee(a);
        printEmployee(m);
    }
    public static void printEmployee(Employee em){
        System.out.println(em);
    }
}