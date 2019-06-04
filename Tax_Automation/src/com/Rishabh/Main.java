package com.Rishabh;

import java.util.ArrayList;

public class Main {

    public void checkForValidEmployeeId(){
        Company company =new Company();
        try{
            Employee employee1=new Employee("123456-1234", "Tonny", 200000);
            company.add(employee1);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee2=new Employee("123455-1234", "Shiny", 1200000);
            company.add(employee2);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee3=new Employee("123450-1234", "John", 180000);
            company.add(employee3);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee4=new Employee("123459-1234", "Sam", 900000);
            company.add(employee4);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee5=new Employee("123455-1234", "John", 180000);
            company.add(employee5);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        System.out.println("......................");
        System.out.println("GENERATING TAX AMOUNT");
        System.out.println("......................");
        company.generateTaxAmount();
        System.out.println("Tax Amount Calculated");
        System.out.println(".......................");
        System.out.println("DISPLAY ALL THE EMPLOYEES");
        System.out.println("...........................");
        ArrayList<Employee> empList= (ArrayList<Employee>)company.getEmployeeList();
        for (Employee e : empList){
            System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+ e.getSalary()+ " " +e.getTaxAmount());
        }
        System.out.println("............................");
        System.out.println("DISPLAY ALL EMPLOYEES WITH NIL TAX");
        System.out.println("..............................");
        ArrayList<Employee> empNillTax= (ArrayList<Employee>)company.findEmployeeWithNilTax();
        for(Employee e:empNillTax){
            System.out.println(e.getEmployeeId()+" "+ e.getEmployeeName()+" "+ e.getSalary());
        }
    }

    public void checkForInvalidEmployeeId(){
        System.out.println("");
        System.out.println("________________");
        System.out.println("Check for Invalid Id");
        System.out.println("__________");
        Company company =new Company();
        try{
            Employee employee1=new Employee("123456-1234", "Tonny", 200000);
            company.add(employee1);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee2=new Employee("123455-1234", "Shiny", 1200000);
            company.add(employee2);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee6=new Employee("12345-1234", "John", 1800000);
            company.add(employee6);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee3=new Employee("123458-1234", "Sam", 1800000);
            company.add(employee3);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee4=new Employee("123459-1234", "Alan", 900000);
            company.add(employee4);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }

        try{
            Employee employee5=new Employee("123455-1234", "John", 180000);
            company.add(employee5);
        }catch(InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        System.out.println("......................");
        System.out.println("GENERATING TAX AMOUNT");
        System.out.println("......................");
        company.generateTaxAmount();
        System.out.println("Tax Amount Calculated");
        System.out.println(".......................");
        System.out.println("DISPLAY ALL THE EMPLOYEES");
        System.out.println("...........................");
        ArrayList<Employee> empList= (ArrayList<Employee>)company.getEmployeeList();
        for (Employee e : empList){
            System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+ e.getSalary()+ " " +e.getTaxAmount());
        }
        System.out.println("............................");
        System.out.println("DISPLAY ALL EMPLOYEES WITH NIL TAX");
        System.out.println("..............................");
        ArrayList<Employee> empNillTax= (ArrayList<Employee>)company.findEmployeeWithNilTax();
        for(Employee e:empNillTax){
            System.out.println(e.getEmployeeId()+" "+ e.getEmployeeName()+" "+ e.getSalary());
        }
    }

    public static void main(String[] args) {
        Main mainObj= new Main();
        mainObj.checkForValidEmployeeId();
        mainObj.checkForInvalidEmployeeId();
    }
}
