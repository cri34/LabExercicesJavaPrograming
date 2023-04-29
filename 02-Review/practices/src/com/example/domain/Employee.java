package com.example.domain;

public class Employee {
    private int empId;
    private static int curEmpId = 1;
    private String name;
    private String ssn;
    private double salary;
    public Employee(){
    }
    public Employee(String name,String ssn, double salary){
        calculateId();
    }
    private void calculateId(){
        setEmpId(curEmpId);
        curEmpId+=1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
