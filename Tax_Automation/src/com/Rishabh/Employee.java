package com.Rishabh;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;
    private double taxAmount;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Employee(String employeeId, String employeeName, double salary) throws InvalidEmployeeIDException{
        String[] arrOfStr = employeeId.split("-", 2);
        if(arrOfStr[0].length()==6 && arrOfStr[1].length()==4){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }else
            throw new InvalidEmployeeIDException("Employee Id not given in proper format");


    }
    public void calculateTax(){
        //System.out.println("Calculate Tax for "+ this.employeeName +"with salary"+this.getSalary() );
        this.taxAmount=0.0;
        if(this.salary<=2_00_000){

            this.taxAmount=0d;
        }else if(this.salary>2_00_000 && this.salary<=5_00_000){
            this.taxAmount=(this.salary-2_00_000)*0.1;
        }else if(this.salary>5_00_000 && this.salary<=1_000_000){
            this.taxAmount=((0.1*5_00_000))+ (this.salary-7_00_000)*0.2;
        }else{
            this.taxAmount=((0.1*5_00_000))+(0.2*1_000_000)+(this.salary-1_700_000)*0.3;
        }

    }
}
