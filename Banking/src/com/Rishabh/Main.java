package com.Rishabh;

public class Main {

    public static void main(String[] args) {


        Bank account1= new Bank();
        account1.setName("Rishabh");
        account1.setBalance(100000);
        account1.setEmail("rishabh@gmail.com");
        account1.setPhoneNumber(9078673199L);
        account1.setAccount_number(11238);

        System.out.println("The bank account with account number "+ account1.getAccount_number() +
                " belongs to "+ account1.getName() +" and his personal details are: ");
        System.out.println("Email : " + account1.getEmail());
        System.out.println("Phone Number: " + account1.getPhoneNumber());
        System.out.println("Current Balance: "+ account1.getBalance() );

        System.out.println("Now we withdraw 400 from the account.");
        account1.withdraw(400);
        System.out.println("New account balance:  "+ account1.getBalance());
        System.out.println();
        System.out.println("Now we withdraw 10000 from the account");
        account1.withdraw(100000);
        System.out.println("Now we deposit 5000 to the account");
        account1.deposit(5000);
        System.out.println("New Account balance is "+ account1.getBalance());

        Bank account2= new Bank(12321,23 ,"Rahul","rahul@gmail.com",9559768119L);
        account2.displayDetails();
    }
}
