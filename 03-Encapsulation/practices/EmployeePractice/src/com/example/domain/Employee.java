package com.example.domain;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name ,String ssn, double salary) {
        this.empId=empId;
        this.name=name;
        this.ssn=ssn;
        this.salary=salary;
    }

    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public String getSsn() {
        return ssn;
    }

    public void raiseSalary(double increase){
        salary += increase;
    }
    public String toString(){
        return "Employee id: "+getEmpId()+"\nEmployee name : "+getName()+"\nEmployee Soc Sec : "+getSsn()+"\nEmployee salary : "+getSalary()+"\n";
    }
}
