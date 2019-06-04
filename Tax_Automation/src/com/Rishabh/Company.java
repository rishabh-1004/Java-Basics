package com.Rishabh;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList= new ArrayList<Employee>();

    public Company() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void add(Employee e){
        employeeList.add(e);
    }
    public List<Employee> findEmployeeWithNilTax(){
        List<Employee> nilTax=new ArrayList<Employee>();
        for (Employee e: this.employeeList){
            if(e.getTaxAmount()==0.0)
                nilTax.add(e);
        }
        return nilTax;
    }
    public void generateTaxAmount(){
        for(Employee e: this.employeeList){
            e.calculateTax();
        }
    }

}
