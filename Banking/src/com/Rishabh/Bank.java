package com.Rishabh;

public class Bank {
    private int account_number;
    private int balance;
    private String name;
    private String email;
    private long phoneNumber;

    public Bank(){
        System.out.println("Empty Constructor called. ");
    }

    public Bank(String name, String email, long phoneNumber) {
        this(9999,100,name,email,phoneNumber);
    }

    public Bank(int account_number, int balance, String name, String email, long phoneNumber){
        System.out.println("Constructor with Parameters Called");
        this.account_number=account_number;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    public void deposit(int value){
        if (value>0)
            this.balance+=value;
        else
            System.out.println("Invalid Value");
    }
    public void withdraw( int value ){
        if(value<this.balance)
            this.balance-=value;
        else
            System.out.println("Bank Balance is low.!");
    }

    public void setAccount_number(int ac_no){
        this.account_number = ac_no ;
    }
    public int getAccount_number(){
        return this.account_number;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void displayDetails(){
        System.out.println("The bank account with account number "+ this.getAccount_number() +
                " belongs to "+ this.getName() +" and his personal details are: ");
        System.out.println("Email : " + this.getEmail());
        System.out.println("Phone Number: " + this.getPhoneNumber());
        System.out.println("Current Balance: "+ this.getBalance() );
    }
}
