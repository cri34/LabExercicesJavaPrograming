package com.example.business;

import com.example.domain.Employee;

public class EmployeeStockPlan {
    public Integer grantStock(Employee e){
       return e.getStockOptions();
    }
}
