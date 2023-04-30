package com.example.domain;

import java.util.ArrayList;

public class Manager extends Employee {
    private String deptName;
    private final ArrayList<Employee> staff;
    private Integer employeeCount = 0;
   public Manager (int empId, String name ,String ssn, double salary,String deptName){
       super(empId, name, ssn, salary);
       this.deptName = deptName;
       this.staff= new ArrayList<>(20);
   }
   public String getDeptName(){
       return deptName;
   }
   @Override
   public String toString(){
       return super.toString()+"Employee Dep :"+getDeptName()+"\n"+printStaffDetails();
      }
   public int findEmployee(Employee e){
       for (int i = 0; i < staff.size();i++){
           if (staff.get(i).equals(e))
              return i;
       }
       return -1;
   }
   public boolean addEmployee(Employee e){
       int minIndex=0;
        if (findEmployee(e)< minIndex){
            staff.add(employeeCount,e);
            employeeCount++;
            return true;
        }


        return false;
   }
   public boolean removeEmployee(Employee e){
       int minIndex = 0;
       if (findEmployee(e) >= minIndex){
           this.staff.remove(findEmployee(e));
           return true;
       }
       return false;
   }
   public String printStaffDetails(){
       StringBuilder out = new StringBuilder(200);
       out.append("Manager : "+getName()+" has Staff Employees:\n");
       for (int i =0; i < staff.size();i++){
           out.append("\tid : "+staff.get(i).getEmpId()+" name : "+staff.get(i).getName()+" \n");
       }
       out.append("\n");
       return out.toString();
   }
}
