package com.example.dao;
import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO{
    private static int id = 0;
    private static Employee[] employeeArray = new Employee[10];
    protected EmployeeDAOMemoryImpl (){

    }
    @Override
    public void add(Employee emp) {
        if (id + 1 >= employeeArray.length){
            System.out.println("maximum number of employees reached");
            return;
        }
        id++;
        employeeArray[id] = emp;
    }

    @Override
    public void update(Employee emp,int id) {
            employeeArray[id] = emp;
    }

    @Override
    public void delete(int id) {
        employeeArray[id] = null;
    }

    @Override
    public Employee findById(int id) {
            return employeeArray[id];
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
